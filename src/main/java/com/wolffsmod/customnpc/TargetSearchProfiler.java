package com.wolffsmod.customnpc;

import com.wolffsmod.WolffNPCMod;
import com.wolffsmod.config.TargetSearchConfig;

public final class TargetSearchProfiler
{
    private static long searches;
    private static long[] bandSearches = new long[6];
    private static long selectorChecks;
    private static long losChecks;
    private static long targetsAcquired;
    private static long searchNanos;
    private static long lastLogTick = Long.MIN_VALUE;

    private TargetSearchProfiler() {}

    public static void recordSearch(int band, long checked, long los, boolean acquired, long nanos, long worldTick)
    {
        if (!TargetSearchConfig.debugProfiling)
            return;
        searches++;
        bandSearches[Math.max(0, Math.min(5, band))]++;
        selectorChecks += checked;
        losChecks += los;
        if (acquired)
            targetsAcquired++;
        searchNanos += nanos;

        if (lastLogTick == Long.MIN_VALUE)
            lastLogTick = worldTick;
        if (worldTick - lastLogTick < 1200L)
            return;

        double milliseconds = searchNanos / 1000000.0D;
        WolffNPCMod.log.info("CustomNPC target search: searches={}, bands=[{},{},{},{},{},{}], selectorChecks={}, losChecks={}, acquired={}, cpuMs={}",
                searches, bandSearches[0], bandSearches[1], bandSearches[2], bandSearches[3], bandSearches[4], bandSearches[5],
                selectorChecks, losChecks, targetsAcquired, String.format("%.3f", milliseconds));
        searches = selectorChecks = losChecks = targetsAcquired = searchNanos = 0L;
        bandSearches = new long[6];
        lastLogTick = worldTick;
    }
}
