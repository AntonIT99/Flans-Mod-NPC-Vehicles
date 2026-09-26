package com.wolffsmod.render;

import com.flansmod.client.tmt.ModelRendererTurbo;
import com.wolffsmod.WolffNPCMod;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import cpw.mods.fml.common.network.FMLNetworkEvent;
import java.util.IdentityHashMap;
import java.util.Map;
import net.minecraft.client.resources.IResourceManager;
import net.minecraft.client.resources.IResourceManagerReloadListener;
import net.minecraftforge.event.world.WorldEvent;
import org.lwjgl.opengl.GL11;

/** Cache geometry/local transforms only. Texture, blend, alpha, lightmap and color stay live. */
public final class StaticModelGroupCache implements IResourceManagerReloadListener {
    public static final StaticModelGroupCache INSTANCE = new StaticModelGroupCache();
    private static final float SCALE = 0.0625F;
    private static final int MAX_GROUPS = 256, MAX_PARTS = 100000, MAX_GROUP_PARTS = 8192;
    private final Map<ModelRendererTurbo[], Entry> entries = new IdentityHashMap<ModelRendererTurbo[], Entry>();
    private TurboGeometryAccess access;
    private boolean attempted, disabled, builtThisFrame;
    private volatile boolean clearRequested;
    private int partCount;
    private String status = "Not initialized";
    private long replays, builds, fallbacks, stateScopes;

    private static final class Entry {
        GeometrySnapshot snapshot;
        int list;
        boolean rejected;
    }
    private StaticModelGroupCache() {}

    public static void render(ModelRendererTurbo[] models, boolean oldRotateOrder) {
        if (models == null || models.length == 0) return;
        boolean timing = RenderPhaseTiming.active;
        long start = timing ? System.nanoTime() : 0;
        long nested = timing ? RenderPhaseTiming.replay + RenderPhaseTiming.compilation : 0;
        boolean cached;
        try { cached = INSTANCE.tryRender(models, oldRotateOrder); }
        finally {
            if (timing) RenderPhaseTiming.validation += Math.max(0, System.nanoTime() - start
                    - (RenderPhaseTiming.replay + RenderPhaseTiming.compilation - nested));
        }
        if (cached) return;
        INSTANCE.fallbacks++;
        start = timing ? System.nanoTime() : 0;
        try {
            for (ModelRendererTurbo model : models) if (model != null) model.render(SCALE, oldRotateOrder);
        } finally { if (timing) RenderPhaseTiming.fallback += System.nanoTime() - start; }
    }

    private boolean tryRender(ModelRendererTurbo[] models, boolean order) {
        if (clearRequested) clearOnRenderThread();
        if (!WolffNPCMod.enableSafeVehicleGeometryCache || disabled || models.length < 4 || models.length > MAX_GROUP_PARTS) return false;
        try {
            if (!attempted) {
                attempted = true; access = new TurboGeometryAccess();
                status = "Active; verified TMT profile " + access.profile;
            }
            Entry entry = entries.get(models);
            if (entry == null) {
                if (entries.size() >= MAX_GROUPS || partCount + models.length > MAX_PARTS) return false;
                entry = new Entry(); entries.put(models, entry); partCount += models.length;
            }
            if (entry.rejected) return false;
            if (entry.snapshot == null) {
                int[] ids = new int[models.length];
                for (int i = 0; i < models.length; i++) {
                    ids[i] = access.geometryList(models[i]);
                    if (ids[i] < 0) { entry.rejected = true; return false; }
                    if (ids[i] == 0) return false;
                }
                entry.snapshot = new GeometrySnapshot(models, ids, order);
                return false; // observe twice; ordinary rendering warms child geometry outside a parent list
            }
            if (!entry.snapshot.matches(models, order, access)) {
                delete(entry); entry.rejected = true;
                return false; // animation/mutation: do not repeatedly rebuild as the NPC moves
            }
            if (GL11.glGetInteger(GL11.GL_LIST_INDEX) != 0) return false;
            if (entry.list == 0) {
                if (builtThisFrame) return false;
                builtThisFrame = true; entry.list = compile(entry.snapshot);
                if (entry.list <= 0) { entry.list = 0; entry.rejected = true; return false; }
                builds++;
            }
            replay(entry.list, access.needsBlendSetup()); replays++;
            return true;
        } catch (Exception failure) { disable(failure); return false; }
        catch (LinkageError failure) { disable(failure); return false; }
    }

    private int compile(GeometrySnapshot snapshot) {
        boolean timing = RenderPhaseTiming.active;
        long start = timing ? System.nanoTime() : 0;
        try { return compileGeometry(snapshot); }
        finally { if (timing) RenderPhaseTiming.compilation += System.nanoTime() - start; }
    }

    private int compileGeometry(GeometrySnapshot snapshot) {
        int list = GL11.glGenLists(1);
        if (list <= 0) return 0;
        boolean ended = false;
        GL11.glNewList(list, GL11.GL_COMPILE);
        try {
            for (int i = 0; i < snapshot.parts.length; i++) {
                int j = i * 6;
                float x = snapshot.pose[j], y = snapshot.pose[j + 1], z = snapshot.pose[j + 2];
                float rx = snapshot.pose[j + 3], ry = snapshot.pose[j + 4], rz = snapshot.pose[j + 5];
                // The reviewed TMT transform order, with no texture/color/lightmap/blend operations.
                if (rx != 0 || ry != 0 || rz != 0) {
                    GL11.glPushMatrix(); GL11.glTranslatef(x * SCALE, y * SCALE, z * SCALE);
                    if (!snapshot.oldOrder && ry != 0) GL11.glRotatef(ry * 57.29578F, 0, 1, 0);
                    if (rz != 0) GL11.glRotatef((snapshot.oldOrder ? -1 : 1) * rz * 57.29578F, 0, 0, 1);
                    if (snapshot.oldOrder && ry != 0) GL11.glRotatef(-ry * 57.29578F, 0, 1, 0);
                    if (rx != 0) GL11.glRotatef(rx * 57.29578F, 1, 0, 0);
                    GL11.glCallList(snapshot.lists[i]); GL11.glPopMatrix();
                } else if (x != 0 || y != 0 || z != 0) {
                    GL11.glTranslatef(x * SCALE, y * SCALE, z * SCALE);
                    GL11.glCallList(snapshot.lists[i]);
                    GL11.glTranslatef(-x * SCALE, -y * SCALE, -z * SCALE);
                } else GL11.glCallList(snapshot.lists[i]);
            }
            GL11.glEndList(); ended = true;
            return list;
        } finally {
            if (!ended) { GL11.glEndList(); GL11.glDeleteLists(list, 1); }
        }
    }

    private void replay(int list, boolean blend) {
        boolean timing = RenderPhaseTiming.active;
        long start = timing ? System.nanoTime() : 0;
        try { replayGeometry(list, blend); }
        finally { if (timing) RenderPhaseTiming.replay += System.nanoTime() - start; }
    }

    private void replayGeometry(int list, boolean blend) {
        int src = 0, dst = 0;
        if (blend) {
            src = GL11.glGetInteger(GL11.GL_BLEND_SRC); dst = GL11.glGetInteger(GL11.GL_BLEND_DST);
            GL11.glAlphaFunc(GL11.GL_GREATER, 0.001F); GL11.glEnable(GL11.GL_BLEND);
            GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA); stateScopes++;
        }
        GL11.glPushMatrix();
        try { GL11.glCallList(list); }
        finally {
            GL11.glPopMatrix();
            if (blend) { GL11.glBlendFunc(src, dst); GL11.glDisable(GL11.GL_BLEND); }
        }
    }

    private void disable(Throwable failure) {
        disabled = true;
        status = "Disabled; original rendering: " + failure.getClass().getSimpleName() + ": " + failure.getMessage();
        WolffNPCMod.log.warn("Safe vehicle cache " + status); clearRequested = true;
    }
    private void delete(Entry entry) {
        if (entry.list > 0) GL11.glDeleteLists(entry.list, 1);
        entry.list = 0;
    }
    /** Queue deletion; unload/reload callbacks need not own the GL context. */
    public void clear() { clearRequested = true; }
    private void clearOnRenderThread() {
        VehicleGroupVisibility.clear();
        for (Entry entry : entries.values()) delete(entry);
        entries.clear(); partCount = 0; clearRequested = false;
    }
    @Override public void onResourceManagerReload(IResourceManager manager) { clear(); }
    @SubscribeEvent public void unload(WorldEvent.Unload event) { if (event.world.isRemote) clear(); }
    @SubscribeEvent public void disconnect(FMLNetworkEvent.ClientDisconnectionFromServerEvent event) { clear(); }
    @SubscribeEvent public void frame(TickEvent.RenderTickEvent event) {
        if (event.phase != TickEvent.Phase.START) return;
        builtThisFrame = false;
        if (clearRequested || (!WolffNPCMod.enableSafeVehicleGeometryCache && !entries.isEmpty())) clearOnRenderThread();
    }
    public String status() { return WolffNPCMod.enableSafeVehicleGeometryCache ? status : "Disabled by config"; }
    public long replays() { return replays; }
    public long builds() { return builds; }
    public long fallbacks() { return fallbacks; }
    public long stateScopes() { return stateScopes; }
}
