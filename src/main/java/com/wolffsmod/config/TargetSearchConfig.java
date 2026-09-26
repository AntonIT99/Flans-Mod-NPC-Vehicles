package com.wolffsmod.config;

import net.minecraftforge.common.config.Configuration;

public final class TargetSearchConfig
{
    public static boolean enabled = true;
    public static boolean debugProfiling = false;
    public static boolean synchronizeNearbyAcquisition = true;
    public static int nearInterval = 5;
    public static int closeInterval = 10;
    public static int mediumInterval = 20;
    public static int longInterval = 40;
    public static int distantInterval = 80;
    public static int maximumInterval = 160;

    private TargetSearchConfig() {}

    public static void load(Configuration config)
    {
        String category = "CustomNPC Target Search Optimization";
        enabled = config.getBoolean(
                "EnableProgressiveTargetSearch", category, true,
                "Use staggered distance-band target searches for all CustomNPC+ NPCs. Disable to restore CustomNPC+'s original full-radius search.");
        synchronizeNearbyAcquisition = config.getBoolean(
                "SynchronizeNearbyTargetAcquisition", category, true,
                "Give idle NPCs their 0-32 block target-search opportunity on a shared cadence so nearby formations react together. "
                        + "Keeps the same average near-search interval; longer-range searches remain staggered.");
        nearInterval = interval(config, category, "NearSearchInterval", 5, "0-32 block search interval in ticks.");
        closeInterval = interval(config, category, "CloseSearchInterval", 10, "32-64 block search interval in ticks.");
        mediumInterval = interval(config, category, "MediumSearchInterval", 20, "64-128 block search interval in ticks.");
        longInterval = interval(config, category, "LongSearchInterval", 40, "128-256 block search interval in ticks.");
        distantInterval = interval(config, category, "DistantSearchInterval", 80, "256-384 block search interval in ticks.");
        maximumInterval = interval(config, category, "MaximumSearchInterval", 160, "384 blocks to the configured combat-range maximum, in ticks.");
        debugProfiling = config.getBoolean(
                "DebugTargetSearchProfiling", category, false,
                "Log aggregated target-search counters about once per minute. Leave false for normal play.");
    }

    private static int interval(Configuration config, String category, String name, int defaultValue, String comment)
    {
        return config.getInt(name, category, defaultValue, 1, 1200, comment);
    }

    public static int intervalForBand(int band)
    {
        switch (band)
        {
            case 0: return nearInterval;
            case 1: return closeInterval;
            case 2: return mediumInterval;
            case 3: return longInterval;
            case 4: return distantInterval;
            default: return maximumInterval;
        }
    }
}
