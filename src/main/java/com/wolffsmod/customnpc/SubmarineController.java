package com.wolffsmod.customnpc;

import java.util.Map;
import java.util.WeakHashMap;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.MathHelper;
import noppes.npcs.entity.EntityNPCInterface;

/** Keeps explicitly configured watercraft below the local water surface. */
public final class SubmarineController {
    private static final Map<EntityNPCInterface, State> STATES = new WeakHashMap<EntityNPCInterface, State>();
    private SubmarineController() {}

    public static void update(EntityNPCInterface npc) {
        if (npc.worldObj.isRemote || npc.isKilled()) return;
        IMixinDataAI data = (IMixinDataAI)npc.ais;
        if (data.getVehicleMobilityProfile() != VehicleMobilityProfile.WATERCRAFT
                || data.getWatercraftType() != WatercraftType.SUBMARINE) return;

        State state = state(npc);
        sampleIfNeeded(npc, data, state);
        if (!state.waterColumn) return;

        // A submarine is watertight regardless of the humanoid NPC's drowning setting.
        npc.setAir(300);
        double desiredY = state.surfaceY - state.effectiveDepth;
        double error = desiredY - npc.posY;
        if (error < -0.35D) npc.motionY = Math.max(-0.18D, error * 0.08D);
        else if (error > 0.35D) npc.motionY = Math.min(0.16D, error * 0.08D);
        else npc.motionY *= 0.45D;
        npc.fallDistance = 0.0F;
    }

    private static void sampleIfNeeded(EntityNPCInterface npc, IMixinDataAI data, State state) {
        if (state.sampleTick != Integer.MIN_VALUE
                && (npc.ticksExisted + npc.getEntityId()) % 10 != 0
                && npc.ticksExisted - state.sampleTick < 20) return;
        state.sampleTick = npc.ticksExisted;
        int x = MathHelper.floor_double(npc.posX);
        int z = MathHelper.floor_double(npc.posZ);
        int surface = npc.worldObj.getTopSolidOrLiquidBlock(x, z);
        state.waterColumn = surface > 0 && isWater(npc.worldObj.getBlock(x, surface - 1, z));
        if (!state.waterColumn) return;

        int bottom = surface - 1;
        int scanLimit = Math.max(8, data.getSubmarineDepth() + 4);
        while (bottom > 0 && surface - bottom <= scanLimit && isWater(npc.worldObj.getBlock(x, bottom, z))) bottom--;
        int waterDepth = surface - bottom - 1;
        state.surfaceY = surface;
        state.effectiveDepth = Math.max(1, Math.min(data.getSubmarineDepth(), Math.max(1, waterDepth - 1)));
    }

    private static boolean isWater(Block block) {
        return block != null && block.getMaterial() == Material.water;
    }

    private static State state(EntityNPCInterface npc) {
        State state = STATES.get(npc);
        if (state == null) { state = new State(); STATES.put(npc, state); }
        return state;
    }

    private static final class State {
        int sampleTick = Integer.MIN_VALUE;
        int surfaceY;
        int effectiveDepth;
        boolean waterColumn;
    }
}
