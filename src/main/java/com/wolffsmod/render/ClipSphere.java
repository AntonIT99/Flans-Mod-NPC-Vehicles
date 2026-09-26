package com.wolffsmod.render;

/** Column-major OpenGL matrices, sphere in the group's local space. */
public final class ClipSphere {
    private ClipSphere() {}
    public static boolean outside(float[] projection, float[] model, double radius) {
        if (!Double.isFinite(radius) || radius <= 0) return false;
        for (int i = 0; i < 16; i++) if (!Float.isFinite(projection[i]) || !Float.isFinite(model[i])) return false;
        for (int axis = 0; axis < 3; axis++) for (int sign = -1; sign <= 1; sign += 2) {
            double a = 0, b = 0, c = 0, d = 0;
            for (int k = 0; k < 4; k++) {
                double row = projection[k * 4 + 3] + sign * projection[k * 4 + axis];
                a += row * model[k]; b += row * model[4 + k];
                c += row * model[8 + k]; d += row * model[12 + k];
            }
            double norm = Math.sqrt(a*a + b*b + c*c);
            if (!Double.isFinite(norm) || !Double.isFinite(d) || norm == 0) return false;
            if (d < -(radius * norm) - 0.001) return true;
        }
        return false;
    }
}
