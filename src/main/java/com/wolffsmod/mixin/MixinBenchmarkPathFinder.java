package com.wolffsmod.mixin;

import com.wolffsmod.benchmark.ServerBenchmark;
import net.minecraft.entity.Entity;
import net.minecraft.pathfinding.PathEntity;
import net.minecraft.pathfinding.PathFinder;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

/** Time the common private search, not both public forwarding overloads. */
@Mixin(PathFinder.class)
public abstract class MixinBenchmarkPathFinder {
    @Unique private long wolffsmod$groundStart;
    @Unique private long wolffsmod$nodes;
    @Unique private double wolffsmod$sx, wolffsmod$sy, wolffsmod$sz;

    @Inject(method = "createEntityPathTo(Lnet/minecraft/entity/Entity;DDDF)Lnet/minecraft/pathfinding/PathEntity;", at = @At("HEAD"), require = 0)
    private void wolffsmod$begin(Entity entity, double x, double y, double z, float range, CallbackInfoReturnable<PathEntity> ci) {
        wolffsmod$groundStart = ServerBenchmark.begin(entity);
        wolffsmod$nodes = 0;
        if (wolffsmod$groundStart != 0) {
            wolffsmod$sx = entity.posX; wolffsmod$sy = entity.posY; wolffsmod$sz = entity.posZ;
        }
    }

    @Inject(method = "createEntityPathTo(Lnet/minecraft/entity/Entity;DDDF)Lnet/minecraft/pathfinding/PathEntity;", at = @At("RETURN"), require = 0)
    private void wolffsmod$end(Entity entity, double x, double y, double z, float range, CallbackInfoReturnable<PathEntity> ci) {
        ServerBenchmark.endPath(wolffsmod$groundStart, false, ci.getReturnValue() == null);
        double dx = wolffsmod$sx - x, dy = wolffsmod$sy - y, dz = wolffsmod$sz - z;
        float reportedRange = com.wolffsmod.customnpc.AdaptivePathSearchRange.effective(range,
                (float)Math.sqrt(dx * dx + dy * dy + dz * dz),
                com.wolffsmod.WolffNPCMod.adaptiveNPCPathSearchRadius,
                com.wolffsmod.WolffNPCMod.minimumNPCPathSearchRadius,
                com.wolffsmod.WolffNPCMod.npcPathSearchDetourMargin);
        ServerBenchmark.slowPath(wolffsmod$groundStart, entity, wolffsmod$sx, wolffsmod$sy, wolffsmod$sz,
                x, y, z, reportedRange, wolffsmod$nodes, ci.getReturnValue());
        wolffsmod$groundStart = 0;
    }

    @org.spongepowered.asm.mixin.injection.Redirect(method = "addToPath", at = @At(value = "INVOKE", target = "Lnet/minecraft/pathfinding/Path;dequeue()Lnet/minecraft/pathfinding/PathPoint;"), require = 0)
    private net.minecraft.pathfinding.PathPoint wolffsmod$node(net.minecraft.pathfinding.Path queue) {
        if (wolffsmod$groundStart != 0) wolffsmod$nodes++;
        return queue.dequeue();
    }
}
