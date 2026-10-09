package com.wolffsmod.customnpc;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.Entity;
import net.minecraft.pathfinding.PathPoint;
import net.minecraft.world.World;
import noppes.npcs.entity.EntityNPCInterface;

public final class TerrainMobilityRules {
    private TerrainMobilityRules() {}

    public static int filterPathNode(Entity entity, int x, int y, int z, PathPoint size, int vanillaResult) {
        if (!(entity instanceof EntityNPCInterface) || vanillaResult <= 0 || entity.worldObj.isRemote)
            return vanillaResult;

        IMixinDataAI data = (IMixinDataAI)((EntityNPCInterface)entity).ais;
        VehicleMobilityProfile profile = data.getVehicleMobilityProfile();
        if (profile == VehicleMobilityProfile.LEGACY || profile == VehicleMobilityProfile.AMPHIBIOUS)
            return vanillaResult;

        int width = Math.max(1, size.xCoord);
        int depth = Math.max(1, size.zCoord);
        for (int px = x; px < x + width; px++) {
            for (int pz = z; pz < z + depth; pz++) {
                if (profile == VehicleMobilityProfile.GROUND
                        && hasWaterDepth(entity.worldObj, px, y, pz, data.getVehicleGroundMaxWaterDepth() + 1))
                    return 0;
                if (profile == VehicleMobilityProfile.WATERCRAFT) {
                    boolean deepEnough = data.getWatercraftType() == WatercraftType.SUBMARINE
                            ? hasWaterColumnDepth(entity.worldObj, px, pz, data.getSubmarineMinimumWaterDepth())
                            : hasWaterDepth(entity.worldObj, px, y, pz, data.getVehicleWatercraftMinDepth());
                    if (!deepEnough) return 0;
                }
            }
        }
        return profile == VehicleMobilityProfile.WATERCRAFT ? 2 : vanillaResult;
    }

    private static boolean hasWaterDepth(World world, int x, int y, int z, int required) {
        if (required <= 0) return true;
        int waterY = isWater(PathBlockCache.get(world, x, y, z)) ? y
                : (isWater(PathBlockCache.get(world, x, y - 1, z)) ? y - 1 : Integer.MIN_VALUE);
        if (waterY == Integer.MIN_VALUE) return false;
        for (int depth = 0; depth < required; depth++) {
            if (waterY < 0 || !isWater(PathBlockCache.get(world, x, waterY, z))) return false;
            waterY--;
        }
        return true;
    }

    /** Submarine safety is based on the complete local water column, independent of its current Y. */
    private static boolean hasWaterColumnDepth(World world, int x, int z, int required) {
        if (required <= 0) return true;
        int surface = world.getTopSolidOrLiquidBlock(x, z);
        for (int depth = 1; depth <= required; depth++) {
            if (surface - depth < 0 || !isWater(PathBlockCache.get(world, x, surface - depth, z))) return false;
        }
        return true;
    }

    private static boolean isWater(Block block) {
        return block != null && block.getMaterial() == Material.water;
    }
}
