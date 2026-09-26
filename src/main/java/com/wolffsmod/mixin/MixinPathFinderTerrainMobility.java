package com.wolffsmod.mixin;

import com.wolffsmod.customnpc.TerrainMobilityRules;
import net.minecraft.entity.Entity;
import net.minecraft.pathfinding.PathFinder;
import net.minecraft.pathfinding.PathPoint;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(PathFinder.class)
public abstract class MixinPathFinderTerrainMobility {
    @Inject(method = "func_82565_a", at = @At("RETURN"), cancellable = true)
    private static void wolffsmod$terrainProfile(Entity entity, int x, int y, int z, PathPoint size,
                                                  boolean avoidWater, boolean breakDoors, boolean enterDoors,
                                                  CallbackInfoReturnable<Integer> ci) {
        ci.setReturnValue(TerrainMobilityRules.filterPathNode(entity, x, y, z, size, ci.getReturnValue()));
    }
}
