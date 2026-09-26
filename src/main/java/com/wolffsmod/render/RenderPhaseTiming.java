package com.wolffsmod.render;

import java.util.Locale;
import java.util.Map;

/** Client/render-thread counters. No timer reads or allocations while inactive. */
public final class RenderPhaseTiming {
    public static boolean active;
    public static long validation, replay, compilation, fallback;
    private RenderPhaseTiming() {}
    public static void reset() {
        active = false;
        validation = replay = compilation = fallback = 0;
    }
    public static void start() {
        reset();
        active = true;
    }
    public static void stop() { active = false; }
    public static void report(Map<String, String> target) {
        value(target, "Cache validation and bookkeeping", validation);
        value(target, "Cached drawing including live state setup", replay);
        value(target, "Parent cache compilation", compilation);
        value(target, "Original-path drawing", fallback);
        target.put("Render phase timing scope", "CPU elapsed totals during measurement only, including unfinished final frame on abort. Validation/bookkeeping includes cache lookup, eligibility/pose checks, GL list-state query and invalidation; excludes timed parent compilation and replay. Drawing includes driver waiting, not direct GPU time. Original path includes its own validation/first compilation. Not a complete breakdown of the outer vehicle renderer. Timer overhead is uncalibrated; no GL synchronization added. Alpha 18 text-only fields; existing CSV schema unchanged.");
    }
    private static void value(Map<String, String> target, String label, long ns) {
        target.put(label + " total ms", String.format(Locale.ROOT, "%.4f", ns / 1.0e6));
    }
}
