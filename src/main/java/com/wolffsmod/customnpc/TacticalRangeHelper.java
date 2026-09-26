package com.wolffsmod.customnpc;

import noppes.npcs.constants.EnumNavType;
import noppes.npcs.entity.EntityNPCInterface;

/**
 * Keeps an already acquired target while an extended-range tactical movement
 * briefly carries an NPC outside its configured aggro radius. Target acquisition
 * and weapon range are intentionally not changed here.
 */
public final class TacticalRangeHelper {
    private TacticalRangeHelper() {
    }

    public static float getTargetRetentionRange(EntityNPCInterface npc) {
        float aggroRange = npc.stats.aggroRange;
        EnumNavType variant = npc.ais.tacticalVariant;

        if (variant == EnumNavType.Default || variant == EnumNavType.None) {
            return aggroRange;
        }

        // Preserve CustomNPC+'s original behavior at its original GUI limits.
        if (aggroRange <= 96.0F && npc.stats.rangedRange <= 64) {
            return aggroRange;
        }

        switch (variant) {
            case Surround:
                // EntityAIOrbitTarget may legitimately orbit at 1.5x its radius.
                float orbitRange = npc.inventory.getProjectile() == null
                        ? npc.ais.tacticalRadius
                        : npc.stats.rangedRange;
                return Math.max(aggroRange, orbitRange * 1.5F + 2.0F);
            case HitNRun:
                // EntityAIAvoidTarget searches up to 16 blocks away.
                return aggroRange + 18.0F;
            case Ambush:
            case Stalk:
                // Both hiding searches inspect positions up to 8 blocks away.
                return aggroRange + 10.0F;
            case Dodge:
                // Ranged dodge positions are selected up to 4 blocks away.
                return aggroRange + 6.0F;
            default:
                return aggroRange;
        }
    }
}
