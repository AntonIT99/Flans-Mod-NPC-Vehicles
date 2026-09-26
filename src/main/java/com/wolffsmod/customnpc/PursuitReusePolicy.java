package com.wolffsmod.customnpc;

/** Pure conservative bounds, independently tested. */
public final class PursuitReusePolicy {
    private PursuitReusePolicy() {}
    public static boolean permits(int age, double targetHorizontalSq, double targetVertical,
                                  double progressSq, double endpointHorizontalSq) {
        return age > 0 && age < 20 && targetHorizontalSq <= 16 && Math.abs(targetVertical) <= 4
                && progressSq >= 0.0625 && endpointHorizontalSq <= 64;
    }
}
