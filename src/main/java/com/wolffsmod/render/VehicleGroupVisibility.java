package com.wolffsmod.render;

import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.PositionTextureVertex;
import com.flansmod.client.tmt.TexturedPolygon;
import java.lang.reflect.Field;
import java.nio.FloatBuffer;
import java.util.IdentityHashMap;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;

/** Only verified stable groups; unknown/dynamic geometry is always drawn. Render thread only. */
public final class VehicleGroupVisibility {
    private static final IdentityHashMap<ModelRendererTurbo[], Bounds> CACHE = new IdentityHashMap<ModelRendererTurbo[], Bounds>();
    private static final FloatBuffer BUFFER = BufferUtils.createFloatBuffer(16);
    private static final float[] PROJECTION = new float[16], MODEL = new float[16];
    private static TurboGeometryAccess access;
    private static Field faces;
    private static boolean disabled;
    private static int parts;
    private static final class Bounds { GeometrySnapshot snapshot; double radius; }
    private VehicleGroupVisibility() {}
    public static void clear() { CACHE.clear(); parts = 0; }
    public static boolean skip(ModelRendererTurbo[] models, boolean order) {
        if (!com.wolffsmod.WolffNPCMod.cullSafeVehicleGroups || disabled || models == null || models.length < 128 || models.length > 8192) return false;
        try {
            if (access == null) {
                access = new TurboGeometryAccess();
                faces = ModelRendererTurbo.class.getDeclaredField("faces"); faces.setAccessible(true);
            }
            Bounds b = CACHE.get(models);
            if (b == null) {
                if (CACHE.size() >= 256 || parts + models.length > 100000) return false;
                b = new Bounds(); CACHE.put(models, b); parts += models.length;
                int[] ids = new int[models.length]; double radius = 0;
                for (int i = 0; i < models.length; i++) {
                    ModelRendererTurbo part = models[i];
                    ids[i] = access.geometryList(part);
                    if (ids[i] == 0) { CACHE.remove(models); parts -= models.length; return false; }
                    if (ids[i] < 0) return false;
                    double local = 0;
                    for (TexturedPolygon polygon : (TexturedPolygon[])faces.get(part)) {
                        if (polygon == null || polygon.getClass() != TexturedPolygon.class) return false;
                        for (PositionTextureVertex vertex : polygon.vertexPositions) {
                            if (vertex == null || vertex.getClass() != PositionTextureVertex.class) return false;
                            local = Math.max(local, length(vertex.vector3D.xCoord, vertex.vector3D.yCoord, vertex.vector3D.zCoord));
                        }
                    }
                    radius = Math.max(radius, (local + length(part.rotationPointX, part.rotationPointY, part.rotationPointZ)) / 16.0);
                }
                if (!Double.isFinite(radius) || radius <= 0) return false;
                b.snapshot = new GeometrySnapshot(models, ids, order); b.radius = radius + 1;
                return false; // first observation always renders
            }
            if (b.snapshot == null || !b.snapshot.matches(models, order, access)) { b.snapshot = null; return false; }
            // Never compile view-dependent omissions into a parent display list.
            if (GL11.glGetInteger(GL11.GL_LIST_INDEX) != 0) return false;
            BUFFER.clear(); GL11.glGetFloat(GL11.GL_PROJECTION_MATRIX, BUFFER); BUFFER.get(PROJECTION);
            BUFFER.clear(); GL11.glGetFloat(GL11.GL_MODELVIEW_MATRIX, BUFFER); BUFFER.get(MODEL);
            return ClipSphere.outside(PROJECTION, MODEL, b.radius);
        } catch (Exception failure) { disabled = true; clear(); return false; }
        catch (LinkageError failure) { disabled = true; clear(); return false; }
    }
    private static double length(double x, double y, double z) { return Math.sqrt(x*x + y*y + z*z); }
}
