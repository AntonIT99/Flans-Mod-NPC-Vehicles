package com.wolffsmod.benchmark;

import com.wolffsmod.config.RangeConfig;
import com.wolffsmod.config.TargetSearchConfig;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.ChatComponentText;
import noppes.npcs.entity.EntityNPCInterface;

import java.io.File;

/** Server-thread-only data. Never imports client classes or transmits samples. */
public final class ServerBenchmark {
    public static final ServerBenchmark INSTANCE = new ServerBenchmark();
    private static ServerBenchmarkData data;
    private static Thread owner;
    private static ICommandSender recipient;
    private static long warmupEnd, start, tickStart, lastTickEnd;
    private static long pursuitReuseStart;
    private static boolean tickActive;
    private static final long[] counters = new long[10];
    private static volatile boolean writing;
    private static final java.util.concurrent.ConcurrentLinkedQueue<String> messages = new java.util.concurrent.ConcurrentLinkedQueue<String>();

    private ServerBenchmark() {}

    private static void message(String text) {
        com.wolffsmod.WolffNPCMod.log.info("[Server benchmark] " + text);
        try {
            if (recipient != null) recipient.addChatMessage(new ChatComponentText("[Wolff server benchmark] " + text));
        } catch (RuntimeException ignored) { /* A disconnected sender must not prevent saving the report. */ }
    }

    private static void drainMessages() {
        String text;
        while ((text = messages.poll()) != null) { message(text); recipient = null; }
    }

    public static void start(ICommandSender sender, int seconds, int warmup, String label) {
        drainMessages();
        if (data != null || writing) { sender.addChatMessage(new ChatComponentText("A server benchmark or report write is already running.")); return; }
        // A worker may have completed between the first drain and the volatile read above.
        // Deliver that completion before assigning the next command sender.
        drainMessages();
        try {
            MinecraftServer server = MinecraftServer.getServer();
            ServerBenchmarkData created = new ServerBenchmarkData(new File(server.getFile("logs"), "wolff-benchmarks"), label, seconds, warmup);
            created.environment = "Minecraft: 1.7.10\nForge: " + net.minecraftforge.common.ForgeVersion.getVersion()
                    + "\nJava: " + System.getProperty("java.version") + "\nOS: " + System.getProperty("os.name")
                    + "\nDedicated server: " + server.isDedicatedServer()
                    + "\nCombat/navigation/view ranges: " + RangeConfig.getMaximumNPCCombatRange() + " / "
                    + RangeConfig.getNPCNavigationRange() + " / " + RangeConfig.getNPCViewDistance()
                    + "\nProgressive target search enabled: " + TargetSearchConfig.enabled
                    + "\nSearch-local NPC block cache enabled: " + com.wolffsmod.WolffNPCMod.cacheNPCPathBlockReads
                    + "\nAdaptive NPC path search radius: " + com.wolffsmod.WolffNPCMod.adaptiveNPCPathSearchRadius
                    + " (minimum " + com.wolffsmod.WolffNPCMod.minimumNPCPathSearchRadius
                    + ", detour margin " + com.wolffsmod.WolffNPCMod.npcPathSearchDetourMargin + ")"
                    + "\nPartial pursuit reuse enabled: " + com.wolffsmod.WolffNPCMod.reusePartialPursuitPaths
                    + "\nAll loaded dimensions; all CustomNPC models, including humanoids and Wolff vehicles.\n";
            recipient = sender;
            owner = Thread.currentThread();
            start = 0;
            lastTickEnd = 0;
            tickActive = false;
            data = created;
            warmupEnd = System.nanoTime() + warmup * 1000000000L;
            message("Warmup " + warmup + " s, then " + seconds + " s. Label: " + label);
        } catch (RuntimeException failure) {
            data = null;
            sender.addChatMessage(new ChatComponentText("Server benchmark could not start: " + failure));
        } catch (OutOfMemoryError failure) {
            data = null;
            sender.addChatMessage(new ChatComponentText("Not enough memory for server benchmark."));
        }
    }

    public static void status(ICommandSender sender) {
        sender.addChatMessage(new ChatComponentText(data == null ? (writing ? "Writing server benchmark report..." : "Server benchmark idle.")
                : start == 0 ? "Server benchmark: warming up."
                : String.format(java.util.Locale.ROOT, "Server benchmark: %.1f / %d seconds measured; %d completed ticks.",
                        (System.nanoTime() - start) / 1e9, data.seconds, data.size)));
    }

    @SubscribeEvent
    public void tick(TickEvent.ServerTickEvent event) {
        if (event.phase == TickEvent.Phase.START) drainMessages();
        if (data == null || Thread.currentThread() != owner) return;
        long now = System.nanoTime();
        if (event.phase == TickEvent.Phase.START) {
            if (now < warmupEnd) return;
            if (start == 0) {
                message("Measurement started.");
                data.heapStart = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
                data.heapMax = Runtime.getRuntime().maxMemory();
                start = System.nanoTime();
                pursuitReuseStart = com.wolffsmod.customnpc.PartialPursuitReuse.reusedRequests;
                data.measurementMillis = System.currentTimeMillis();
            }
            if (lastTickEnd != 0) data.maxInterTickGapNs = Math.max(data.maxInterTickGapNs, now - lastTickEnd);
            if (now - start >= data.seconds * 1000000000L) { stop("COMPLETE"); return; }
            java.util.Arrays.fill(counters, 0);
            tickStart = System.nanoTime();
            tickActive = true;
        } else if (tickActive) {
            tickActive = false;
            if (data.size >= data.rows.length) { stop("PARTIAL: sample capacity"); return; }
            long[] row = data.rows[data.size++];
            row[0] = now - start;
            row[1] = now - tickStart;
            System.arraycopy(counters, 0, row, 2, counters.length);
            data.elapsedNs = now - start;
            lastTickEnd = now;
            if (now - start >= data.seconds * 1000000000L) stop("COMPLETE");
        }
    }

    /** Called at NPC update/path entry; no clock read when inactive. */
    public static long begin(Entity entity) {
        if (!tickActive || Thread.currentThread() != owner || !(entity instanceof EntityNPCInterface)
                || entity.worldObj == null || entity.worldObj.isRemote) return 0;
        return System.nanoTime();
    }

    public static void endUpdate(long token) {
        if (!valid(token)) return;
        counters[0]++;
        counters[1] += System.nanoTime() - token;
    }

    public static void endPath(long token, boolean flying, boolean returnedNull) {
        if (!valid(token)) return;
        long elapsed = System.nanoTime() - token;
        if (flying) data.flyingObserved = true;
        else data.groundObserved = true;
        int index = flying ? 4 : 2;
        counters[index]++;
        counters[index + 1] += elapsed;
        if (returnedNull) counters[6]++;
        counters[7] = Math.max(counters[7], elapsed);
    }

    private static boolean valid(long token) {
        return token != 0 && tickActive && Thread.currentThread() == owner && token >= tickStart;
    }

    public static void slowPath(long token, Entity entity, double sx, double sy, double sz,
                                double x, double y, double z, float range, long nodes,
                                net.minecraft.pathfinding.PathEntity path) {
        if (!valid(token) || !data.slowPaths.failure.isEmpty()) return;
        long duration = System.nanoTime() - token;
        try {
            if (nodes > 0) data.slowPaths.nodesObserved = true;
            int gx = net.minecraft.util.MathHelper.floor_double(x - entity.width / 2.0F);
            int gy = net.minecraft.util.MathHelper.floor_double(y);
            int gz = net.minecraft.util.MathHelper.floor_double(z - entity.width / 2.0F);
            net.minecraft.pathfinding.PathPoint end = path == null ? null : path.getFinalPathPoint();
            boolean slow = duration > 50000000L;
            String name = slow ? entity.getCommandSenderName().replace('\n', ' ').replace('\r', ' ') : "";
            if (name.length() > 100) name = name.substring(0, 100);
            data.slowPaths.record(token - start, duration, entity.dimension, entity.getEntityId(), name,
                    sx, sy, sz, x, y, z, gx, gy, gz, range, nodes,
                    path == null ? "failed-null" : end != null && end.xCoord == gx && end.yCoord == gy && end.zCoord == gz ? "reached" : "partial",
                    slow && end != null ? end.xCoord + "," + end.yCoord + "," + end.zCoord : "none");
        } catch (RuntimeException failure) { data.slowPaths.failure = failure.toString(); }
        catch (LinkageError failure) { data.slowPaths.failure = failure.toString(); }
    }

    public static void targetSearch(long elapsed) {
        if (!tickActive || Thread.currentThread() != owner) return;
        counters[8]++;
        counters[9] += elapsed;
    }

    public static void stop(String outcome) {
        if (data == null) return;
        final ServerBenchmarkData finished = data;
        finished.environment += "Partial pursuit requests reused during measurement: "
                + (start == 0 ? 0 : com.wolffsmod.customnpc.PartialPursuitReuse.reusedRequests - pursuitReuseStart) + "\n";
        data = null;
        tickActive = false;
        finished.outcome = outcome;
        finished.heapEnd = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        if (start != 0) finished.elapsedNs = System.nanoTime() - start;
        owner = null;
        message(outcome + ". Writing server report...");
        writing = true;
        try {
            Thread writer = new Thread(new Runnable() {
                @Override public void run() {
                    String result;
                    try {
                        File report = ServerBenchmarkReport.write(finished);
                        result = finished.outcome + ". Report saved on SERVER: " + report.getAbsolutePath();
                    } catch (Exception failure) { result = "Server report write failed: " + failure; }
                    catch (OutOfMemoryError failure) { result = "Server report write failed: insufficient memory."; }
                    catch (LinkageError failure) { result = "Server report write failed: " + failure; }
                    com.wolffsmod.WolffNPCMod.log.info(result);
                    messages.add(result);
                    writing = false;
                }
            }, "Wolff server benchmark report writer");
            // The worker owns finished data exclusively and never accesses Minecraft/world/sender state.
            writer.setDaemon(false);
            writer.start();
        } catch (RuntimeException failure) { writing = false; message("Could not start report writer: " + failure); }
        catch (OutOfMemoryError failure) { writing = false; message("Could not start report writer: insufficient memory."); }
    }
}
