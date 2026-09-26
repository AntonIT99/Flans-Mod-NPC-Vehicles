package com.wolffsmod.benchmark;

import com.wolffsmod.entity.EntityFlanDriveableNPC;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.ModContainer;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiChat;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.entity.Entity;
import net.minecraft.util.ChatComponentText;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeVersion;
import org.lwjgl.opengl.Display;

import java.io.File;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.util.Locale;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/** Client-only benchmark. No world access from the report worker. */
public final class VehicleBenchmark {
    public static final VehicleBenchmark INSTANCE = new VehicleBenchmark();
    private static final FrameVehicleSet SEEN = new FrameVehicleSet();
    private static final FrameVehicleSet HUMANS_SEEN = new FrameVehicleSet();
    private static int humanoids;
    private static long humanoidNs;
    private static final ConcurrentLinkedQueue<String> MESSAGES = new ConcurrentLinkedQueue<String>();
    private static final ExecutorService WRITER = Executors.newSingleThreadExecutor(new ThreadFactory() {
        @Override public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "Wolff benchmark report writer");
            thread.setDaemon(true);
            return thread;
        }
    });
    private static BenchmarkRun run;
    private static World world;
    private static long warmupEnd, lastFrame;
    private static double measuredSeconds;
    private static boolean measuring, collecting;
    private static volatile boolean writing;
    private static int depth, vehicles, passes, elements, dispatches, compilations;
    private static long vehicleNs, modelStart;
    private static String nextLabel = "";

    private VehicleBenchmark() {}

    public static void chat(String text) {
        Minecraft mc = Minecraft.getMinecraft();
        if (mc.ingameGUI != null) mc.ingameGUI.getChatGUI().printChatMessage(new ChatComponentText("[Wolff benchmark] " + text));
    }

    public static void start(int duration, int warmup, String label) {
        Minecraft mc = Minecraft.getMinecraft();
        if (run != null || writing) { chat("A benchmark or report write is already in progress."); return; }
        if (mc.theWorld == null || mc.thePlayer == null) { chat("Join a world first."); return; }
        try {
            BenchmarkRun created = new BenchmarkRun(new File(mc.mcDataDir, "logs/wolff-benchmarks"),
                    label.isEmpty() ? nextLabel : label, duration, warmup);
            captureEnvironment(created, mc);
            memory(created, "Start");
            long[] initialGc = gc();
            created.gcStartCount = initialGc[0]; created.gcStartMs = initialGc[1];
            world = mc.theWorld;
            run = created;
            com.wolffsmod.render.RenderPhaseTiming.reset();
            measuring = collecting = false;
            measuredSeconds = 0;
            lastFrame = 0;
            depth = 0;
            warmupEnd = System.nanoTime() + warmup * 1000000000L;
            chat("Warmup: " + warmup + " seconds; measurement: " + duration + " seconds.");
        } catch (RuntimeException failure) {
            run = null;
            chat("Could not start: " + failure.getClass().getSimpleName() + ": " + failure.getMessage());
        } catch (LinkageError failure) {
            run = null;
            chat("Could not start: missing client metric API (" + failure.getClass().getSimpleName() + ").");
        } catch (OutOfMemoryError failure) {
            run = null;
            chat("Not enough free memory for benchmark samples.");
        }
    }

    public static void mark(String label) {
        if (run != null) { chat("Set the label before starting a run."); return; }
        nextLabel = label;
        chat("Next run label: " + label);
    }

    public static void status() {
        chat(run == null ? (writing ? "Writing report..." : "Idle.")
                : (measuring ? String.format(Locale.ROOT, "%.1f / %d seconds measured.", measuredSeconds, run.duration)
                : "Warming up."));
    }

    public static void stop() {
        if (run == null) { status(); return; }
        finish("PARTIAL", "Stopped by client command");
    }

    @SubscribeEvent
    public void worldUnload(net.minecraftforge.event.world.WorldEvent.Unload event) {
        if (run != null && event.world == world) finish("ABORTED", "Benchmark world unloaded");
    }

    @SubscribeEvent
    public void clientTick(TickEvent.ClientTickEvent event) {
        if (event.phase != TickEvent.Phase.START) return;
        String message;
        while ((message = MESSAGES.poll()) != null) chat(message);
        if (run != null) {
            Minecraft mc = Minecraft.getMinecraft();
            if (mc.theWorld != world || mc.thePlayer == null) finish("ABORTED", "World changed or player disconnected");
        }
    }

    @SubscribeEvent
    public void renderTick(TickEvent.RenderTickEvent event) {
        if (event.phase != TickEvent.Phase.START || run == null) return;
        try {
            Minecraft mc = Minecraft.getMinecraft();
            if (mc.theWorld != world || mc.thePlayer == null) { finish("ABORTED", "World/dimension changed or disconnected"); return; }
            String screen = mc.currentScreen == null ? "none" : mc.currentScreen.getClass().getName();
            if (mc.isGamePaused()) { finish("ABORTED", "Game paused; screen=" + screen); return; }
            if (!Display.isActive()) { finish("ABORTED", "Window lost focus; screen=" + screen); return; }
            if (mc.currentScreen != null && !(mc.currentScreen instanceof GuiChat)) { finish("ABORTED", "Non-chat GUI opened; screen=" + screen); return; }
            long now = System.nanoTime();
            if (!measuring) {
                if (now < warmupEnd) return;
                captureEnvironment(run, mc); // authoritative camera/settings after warmup
                memory(run, "Start");
                long[] gc = gc();
                run.gcStartCount = gc[0]; run.gcStartMs = gc[1];
                measuring = true;
                run.environment.put("Measurement start epoch ms", Long.toString(System.currentTimeMillis()));
                chat("Started: " + run.duration + " seconds.");
                lastFrame = System.nanoTime(); // exclude start snapshot/chat overhead
                resetFrame();
                collecting = true;
                com.wolffsmod.render.RenderPhaseTiming.start();
                return;
            }
            if (lastFrame != 0) {
                long interval = now - lastFrame;
                if (interval > 0) {
                    if (!run.samples.add(interval, vehicleNs, vehicles, passes, elements, dispatches, compilations)) {
                        finish("PARTIAL", "Primitive sample buffer capacity reached");
                        return;
                    }
                    measuredSeconds += interval / 1.0e9;
                    run.samples.humanoidNs[run.samples.size - 1] = humanoidNs;
                    run.samples.humanoids[run.samples.size - 1] = humanoids;
                    if (mc.currentScreen instanceof GuiChat) run.chatFrames++;
                }
            }
            if (measuredSeconds >= run.duration) { finish("COMPLETE", "Requested duration reached"); return; }
            lastFrame = now;
            resetFrame();
        } catch (RuntimeException failure) {
            finish("ABORTED", "Measurement error: " + failure.getClass().getSimpleName());
        } catch (LinkageError failure) {
            finish("ABORTED", "Client measurement API unavailable: " + failure.getClass().getSimpleName());
        }
    }

    private static void resetFrame() {
        vehicles = passes = elements = dispatches = compilations = depth = 0;
        vehicleNs = 0;
        humanoidNs = 0;
        humanoids = 0;
        HUMANS_SEEN.clear();
        SEEN.clear();
    }

    /** Native ModelMPM humanoid branch only; excludes substituted entity models. */
    public static long beginHumanoid(Entity entity) {
        if (!collecting || run == null || !run.humanoidFailure.isEmpty() || entity == null || entity.worldObj != world
                || !(entity instanceof noppes.npcs.entity.EntityCustomNpc)) return 0;
        run.humanoidHookObserved = true;
        return System.nanoTime();
    }

    public static void endHumanoid(Entity entity, long started) {
        if (started == 0 || !collecting || run == null || started < lastFrame) return;
        try {
            humanoidNs += System.nanoTime() - started;
            if (HUMANS_SEEN.add(entity.getEntityId())) humanoids++;
        } catch (RuntimeException failure) {
            run.humanoidFailure = "Humanoid metric disabled: " + failure.getClass().getSimpleName();
        } catch (LinkageError failure) {
            run.humanoidFailure = "Humanoid metric disabled: " + failure.getClass().getSimpleName();
        }
    }

    /** Called only from the six Wolff model render entries. */
    public static long begin(Entity entity) {
        if (!collecting || run == null || !run.metricFailure.isEmpty() || !(entity instanceof EntityFlanDriveableNPC)) return 0;
        try {
            EntityFlanDriveableNPC vehicle = (EntityFlanDriveableNPC)entity;
            Entity counted = vehicle.npc != null ? vehicle.npc : vehicle;
            if (counted.worldObj != world) return 0;
            if (depth++ != 0) return -1; // subclass -> super is one inclusive timing scope
            passes++;
            if (SEEN.add(counted.getEntityId())) vehicles++;
            modelStart = System.nanoTime();
            return 1;
        } catch (RuntimeException failure) {
            disableMetric(failure);
            return 0;
        } catch (LinkageError failure) {
            disableMetric(failure);
            return 0;
        }
    }

    public static void end(long token) {
        if (token == 0 || !collecting) return;
        if (token == 1) vehicleNs += System.nanoTime() - modelStart;
        if (depth > 0) depth--;
    }

    /** Optional local TMT hooks; no GL interception and no per-element timer. */
    public static void operation(int operation) {
        if (!collecting || depth == 0 || run == null) return;
        run.observedHooks |= operation;
        if (operation == 1) elements++;
        else if (operation == 2) dispatches++;
        else if (operation == 4) compilations++;
    }

    private static void disableMetric(Throwable failure) {
        if (run != null) run.metricFailure = "Vehicle metric disabled: " + failure.getClass().getSimpleName();
        depth = 0;
    }

    private static void finish(String outcome, String reason) {
        if (run == null) return;
        collecting = false;
        com.wolffsmod.render.RenderPhaseTiming.stop();
        final BenchmarkRun finished = run;
        boolean measured = measuring;
        finished.environment.put("Stop phase", measured ? "Measurement" : "Warmup (measurement never started)");
        finished.environment.put("Stop epoch ms", Long.toString(System.currentTimeMillis()));
        if (!measured) reason += " (during warmup; no measurement collected)";
        run = null; world = null; measuring = false; depth = 0;
        finished.outcome = outcome; finished.reason = reason;
        com.wolffsmod.render.RenderPhaseTiming.report(finished.environment);
        try {
            memory(finished, "End");
            com.wolffsmod.render.StaticModelGroupCache cache = com.wolffsmod.render.StaticModelGroupCache.INSTANCE;
            if (!measured) {
                finished.cacheReplayStart = cache.replays(); finished.cacheBuildStart = cache.builds();
                finished.cacheFallbackStart = cache.fallbacks(); finished.cacheStateStart = cache.stateScopes();
            }
            finished.environment.put("Safe geometry cache end status", cache.status());
            finished.environment.put("Cached group replays during measurement", Long.toString(cache.replays() - finished.cacheReplayStart));
            finished.environment.put("Cached group builds during measurement", Long.toString(cache.builds() - finished.cacheBuildStart));
            finished.environment.put("Original-path group calls during measurement", Long.toString(cache.fallbacks() - finished.cacheFallbackStart));
            finished.environment.put("Shared blend setups during measurement", Long.toString(cache.stateScopes() - finished.cacheStateStart));
            if (Minecraft.getMinecraft().thePlayer != null) {
                finished.environment.put("End player position", position(Minecraft.getMinecraft()));
                finished.environment.put("End camera yaw/pitch", camera(Minecraft.getMinecraft()));
                finished.environment.put("End resolution", Minecraft.getMinecraft().displayWidth + "x" + Minecraft.getMinecraft().displayHeight);
                finished.environment.put("End render distance chunks", Integer.toString(Minecraft.getMinecraft().gameSettings.renderDistanceChunks));
            }
            long[] gc = gc();
            finished.environment.put("GC collection count delta", finished.gcStartCount < 0 || gc[0] < 0 ? "Unknown" : Long.toString(gc[0] - finished.gcStartCount));
            finished.environment.put("GC collection time delta ms", finished.gcStartMs < 0 || gc[1] < 0 ? "Unknown" : Long.toString(gc[1] - finished.gcStartMs));
        } catch (RuntimeException failure) {
            finished.environment.put("End snapshot", "Unavailable: " + failure.getClass().getSimpleName());
        } catch (LinkageError failure) {
            finished.environment.put("End snapshot", "Unavailable: " + failure.getClass().getSimpleName());
        }
        chat(outcome + ": " + reason + ". Writing report...");
        writing = true;
        WRITER.execute(new Runnable() {
            @Override public void run() {
                try {
                    File report = BenchmarkReport.write(finished);
                    MESSAGES.add("Report saved to: " + report.getAbsolutePath());
                    if (!finished.csvWarning.isEmpty()) MESSAGES.add("CSV warning: " + finished.csvWarning);
                } catch (Exception failure) {
                    MESSAGES.add("Report write failed: " + failure.getClass().getSimpleName() + ": " + failure.getMessage());
                } catch (LinkageError failure) {
                    MESSAGES.add("Report write failed: " + failure.getClass().getSimpleName());
                } catch (OutOfMemoryError failure) {
                    MESSAGES.add("Report write failed: insufficient memory for report calculations.");
                } finally { writing = false; }
            }
        });
    }

    private static String position(Minecraft mc) {
        return String.format(Locale.ROOT, "%.4f / %.4f / %.4f", mc.thePlayer.posX, mc.thePlayer.posY, mc.thePlayer.posZ);
    }
    private static String camera(Minecraft mc) {
        return String.format(Locale.ROOT, "%.4f / %.4f", mc.thePlayer.rotationYaw, mc.thePlayer.rotationPitch);
    }

    private static void captureEnvironment(BenchmarkRun r, Minecraft mc) {
        com.wolffsmod.render.StaticModelGroupCache cache = com.wolffsmod.render.StaticModelGroupCache.INSTANCE;
        r.cacheReplayStart = cache.replays(); r.cacheBuildStart = cache.builds();
        r.cacheFallbackStart = cache.fallbacks(); r.cacheStateStart = cache.stateScopes();
        r.environment.put("Safe vehicle geometry cache enabled", Boolean.toString(com.wolffsmod.WolffNPCMod.enableSafeVehicleGeometryCache));
        r.environment.put("Duplicate wheel rendering avoided", Boolean.toString(com.wolffsmod.WolffNPCMod.avoidDuplicateWheelRendering));
        r.environment.put("Safe geometry cache start status", cache.status());
        r.environment.put("Minecraft", "1.7.10");
        r.environment.put("Server profiling", "Run /wolffserverbenchmark separately; client FPS does not measure server AI");
        r.environment.put("Effective combat/navigation/view ranges", com.wolffsmod.config.RangeConfig.getMaximumNPCCombatRange()
                + " / " + com.wolffsmod.config.RangeConfig.getNPCNavigationRange() + " / " + com.wolffsmod.config.RangeConfig.getNPCViewDistance());
        r.environment.put("Forge", ForgeVersion.getVersion());
        r.environment.put("Java", System.getProperty("java.version") + " / " + System.getProperty("java.vm.name"));
        r.environment.put("OS", System.getProperty("os.name") + " " + System.getProperty("os.version") + " " + System.getProperty("os.arch"));
        r.environment.put("Renderer mod detected", detectRenderer());
        r.environment.put("Shaders", detectShaders());
        r.environment.put("Resolution", mc.displayWidth + "x" + mc.displayHeight);
        r.environment.put("Window active", Boolean.toString(Display.isActive()));
        ScaledResolution scaled = new ScaledResolution(mc, mc.displayWidth, mc.displayHeight);
        r.environment.put("Scaled GUI size", scaled.getScaledWidth() + "x" + scaled.getScaledHeight());
        r.environment.put("GUI scale setting", Integer.toString(mc.gameSettings.guiScale));
        r.environment.put("Render distance chunks", Integer.toString(mc.gameSettings.renderDistanceChunks));
        r.environment.put("FPS cap setting", Integer.toString(mc.gameSettings.limitFramerate));
        r.environment.put("FPS cap", mc.gameSettings.limitFramerate >= net.minecraft.client.settings.GameSettings.Options.FRAMERATE_LIMIT.getValueMax()
                ? "Unlimited (slider maximum)" : Integer.toString(mc.gameSettings.limitFramerate));
        r.environment.put("Minecraft frame limit raw value", Integer.toString(mc.getLimitFramerate()));
        r.environment.put("VSync", Boolean.toString(mc.gameSettings.enableVsync));
        r.environment.put("Graphics", mc.gameSettings.fancyGraphics ? "Fancy" : "Fast");
        r.environment.put("Mipmap level", Integer.toString(mc.gameSettings.mipmapLevels));
        r.environment.put("Particles (0=all,1=decreased,2=minimal)", Integer.toString(mc.gameSettings.particleSetting));
        r.environment.put("Third person view", Integer.toString(mc.gameSettings.thirdPersonView));
        r.environment.put("FOV", Float.toString(mc.gameSettings.fovSetting));
        r.environment.put("World", mc.theWorld.getWorldInfo().getWorldName());
        r.environment.put("Dimension", Integer.toString(mc.theWorld.provider.dimensionId));
        r.environment.put("Player position", position(mc));
        r.environment.put("Camera yaw/pitch", camera(mc));
        StringBuilder mods = new StringBuilder();
        for (ModContainer mod : Loader.instance().getActiveModList()) {
            if (mods.length() != 0) mods.append("; ");
            mods.append(mod.getModId()).append('=').append(mod.getVersion());
        }
        r.environment.put("Loaded mods", mods.toString());
        for (ModContainer mod : Loader.instance().getActiveModList())
            if (mod.getModId().equalsIgnoreCase("flansmod") || mod.getModId().equalsIgnoreCase("austriaHungaryTurkeyMod"))
                r.environment.put("Flan implementation source", mod.getSource() == null ? "Unknown" : mod.getSource().getName());
    }

    private static String detectRenderer() {
        try {
            boolean optifine = FMLClientHandler.instance().hasOptifine();
            boolean angelica = Loader.isModLoaded("angelica");
            return optifine ? (angelica ? "Both OptiFine and Angelica" : "OptiFine") : (angelica ? "Angelica" : "Neither detected");
        } catch (RuntimeException failure) { return "Unknown"; }
        catch (LinkageError failure) { return "Unknown"; }
    }

    private static String detectShaders() {
        try {
            // OptiFine's public status API, queried only at snapshot time.
            if (FMLClientHandler.instance().hasOptifine()) {
                Class<?> config = Class.forName("Config", false, VehicleBenchmark.class.getClassLoader());
                Object enabled = config.getMethod("isShaders").invoke(null);
                if (enabled instanceof Boolean) return (Boolean)enabled ? "Enabled (OptiFine)" : "Disabled (OptiFine)";
            }
        } catch (ReflectiveOperationException ignored) { }
        catch (RuntimeException ignored) { }
        catch (LinkageError ignored) { }
        return "Unknown (record shader pack/state in label for comparisons)";
    }

    private static void memory(BenchmarkRun r, String label) {
        Runtime runtime = Runtime.getRuntime();
        long total = runtime.totalMemory(), free = runtime.freeMemory();
        r.environment.put(label + " heap used bytes", Long.toString(total - free));
        r.environment.put(label + " heap free bytes", Long.toString(free));
        r.environment.put(label + " heap allocated bytes", Long.toString(total));
        r.environment.put(label + " heap maximum bytes", Long.toString(runtime.maxMemory()));
    }

    private static long[] gc() {
        try {
            long count = 0, time = 0;
            boolean available = false;
            for (GarbageCollectorMXBean bean : ManagementFactory.getGarbageCollectorMXBeans()) {
                if (bean.getCollectionCount() >= 0 && bean.getCollectionTime() >= 0) {
                    count += bean.getCollectionCount(); time += bean.getCollectionTime(); available = true;
                }
            }
            return available ? new long[] {count, time} : new long[] {-1, -1};
        } catch (RuntimeException failure) { return new long[] {-1, -1}; }
    }
}
