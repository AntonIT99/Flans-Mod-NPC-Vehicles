package com.wolffsmod.customnpc;

/** Pure policy: retain long-range reach while avoiding huge local search spheres. */
public final class AdaptivePathSearchRange {
    private AdaptivePathSearchRange() {}

    public static float effective(float configuredRange, float destinationDistance, boolean enabled,
                                  int minimumRadius, int detourMargin) {
        if (!enabled || configuredRange <= 0.0F || Float.isNaN(destinationDistance)
                || Float.isInfinite(destinationDistance)) return configuredRange;
        float local = Math.max(Math.max(1, minimumRadius), destinationDistance + Math.max(1, detourMargin));
        return Math.min(configuredRange, local);
    }
}
