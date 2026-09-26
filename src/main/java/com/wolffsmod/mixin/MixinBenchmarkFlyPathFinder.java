package com.wolffsmod.mixin;

import com.wolffsmod.benchmark.ServerBenchmark;
import net.minecraft.entity.Entity;
import noppes.npcs.ai.pathfinder.FlyPathFinder;
import noppes.npcs.ai.pathfinder.NPCPath;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(value = FlyPathFinder.class, remap = false)
public abstract class MixinBenchmarkFlyPathFinder {
    @Unique private long wolffsmod$flyingStart;

    @Inject(method = "createEntityPathTo(Lnet/minecraft/entity/Entity;DDDF)Lnoppes/npcs/ai/pathfinder/NPCPath;", at = @At("HEAD"), require = 0)
    private void wolffsmod$begin(Entity entity, double x, double y, double z, float range, CallbackInfoReturnable<NPCPath> ci) {
        wolffsmod$flyingStart = ServerBenchmark.begin(entity);
    }

    @Inject(method = "createEntityPathTo(Lnet/minecraft/entity/Entity;DDDF)Lnoppes/npcs/ai/pathfinder/NPCPath;", at = @At("RETURN"), require = 0)
    private void wolffsmod$end(Entity entity, double x, double y, double z, float range, CallbackInfoReturnable<NPCPath> ci) {
        ServerBenchmark.endPath(wolffsmod$flyingStart, true, ci.getReturnValue() == null);
        wolffsmod$flyingStart = 0;
    }
}
