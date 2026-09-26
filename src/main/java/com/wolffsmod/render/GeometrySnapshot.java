package com.wolffsmod.render;

import com.flansmod.client.tmt.ModelRendererTurbo;

/** Validate before every replay, including between two NPCs in the same frame. */
final class GeometrySnapshot {
    final ModelRendererTurbo[] parts;
    final int[] lists;
    final float[] pose;
    final boolean oldOrder;
    GeometrySnapshot(ModelRendererTurbo[] models, int[] ids, boolean oldOrder) {
        parts = models.clone(); lists = ids; this.oldOrder = oldOrder;
        pose = new float[models.length * 6];
        for (int i = 0; i < models.length; i++) {
            ModelRendererTurbo p = models[i]; int j = i * 6;
            pose[j] = p.rotationPointX; pose[j + 1] = p.rotationPointY; pose[j + 2] = p.rotationPointZ;
            pose[j + 3] = p.rotateAngleX; pose[j + 4] = p.rotateAngleY; pose[j + 5] = p.rotateAngleZ;
        }
    }
    boolean matches(ModelRendererTurbo[] models, boolean order, TurboGeometryAccess access) throws IllegalAccessException {
        if (order != oldOrder || models.length != parts.length) return false;
        for (int i = 0; i < parts.length; i++) {
            ModelRendererTurbo p = models[i]; int j = i * 6;
            if (p != parts[i] || access.geometryList(p) != lists[i]
                    || p.rotationPointX != pose[j] || p.rotationPointY != pose[j + 1] || p.rotationPointZ != pose[j + 2]
                    || p.rotateAngleX != pose[j + 3] || p.rotateAngleY != pose[j + 4] || p.rotateAngleZ != pose[j + 5]) return false;
        }
        return true;
    }
}
