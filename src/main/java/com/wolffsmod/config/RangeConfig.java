package com.wolffsmod.config;

import net.minecraftforge.common.config.Configuration;
import noppes.npcs.config.ConfigMain;

public final class RangeConfig {
    public static final int MINIMUM_RANGE = 16;
    public static final int MAXIMUM_RANGE = 512;

    private static int localMaximumNPCCombatRange = 128;
    private static int localNPCViewDistance = 256;
    private static int localNPCNavigationRange = 128;

    private static int maximumNPCCombatRange = localMaximumNPCCombatRange;
    private static int npcViewDistance = localNPCViewDistance;
    private static int npcNavigationRange = localNPCNavigationRange;

    private RangeConfig() {
    }

    public static void load(Configuration config) {
        String category = "NPC Range Settings";
        localMaximumNPCCombatRange = config.getInt(
                "MaximumNPCCombatRange", category, 128, MINIMUM_RANGE, MAXIMUM_RANGE,
                "Maximum NPC aggro and ranged-combat setting. Minimum 16, maximum 512. "
                        + "Values above 256 are experimental and may severely affect server performance.");
        localNPCViewDistance = config.getInt(
                "NPCViewDistance", category, 256, MINIMUM_RANGE, MAXIMUM_RANGE,
                "Server entity tracking distance for CustomNPC+ NPCs. Minimum 16, maximum 512. "
                        + "Requires a game/server restart after changing.");
        localNPCNavigationRange = config.getInt(
                "NPCNavigationRange", category, 128, MINIMUM_RANGE, MAXIMUM_RANGE,
                "NPC path-search range. Minimum 16, maximum 512. Values above 256 are experimental "
                        + "and can cause severe pathfinding lag. Requires a game/server restart after changing.");

        useLocalValues();
    }

    public static void useLocalValues() {
        applyEffectiveValues(localMaximumNPCCombatRange, localNPCViewDistance, localNPCNavigationRange);
    }

    public static void applyServerValues(int combatRange, int viewDistance, int navigationRange) {
        applyEffectiveValues(combatRange, viewDistance, navigationRange);
    }

    private static void applyEffectiveValues(int combatRange, int viewDistance, int navigationRange) {
        maximumNPCCombatRange = clamp(combatRange);
        npcViewDistance = clamp(viewDistance);
        npcNavigationRange = clamp(navigationRange);
        ConfigMain.NpcNavRange = npcNavigationRange;
    }

    public static int getMaximumNPCCombatRange() {
        return maximumNPCCombatRange;
    }

    public static int getNPCViewDistance() {
        return npcViewDistance;
    }

    public static int getNPCNavigationRange() {
        return npcNavigationRange;
    }

    private static int clamp(int value) {
        return Math.max(MINIMUM_RANGE, Math.min(MAXIMUM_RANGE, value));
    }
}
