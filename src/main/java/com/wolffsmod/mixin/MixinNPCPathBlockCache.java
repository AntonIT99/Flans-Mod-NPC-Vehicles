package com.wolffsmod.mixin;

import com.wolffsmod.WolffNPCMod;
import com.wolffsmod.customnpc.PathBlockCache;
import com.wolffsmod.customnpc.AdaptivePathSearchRange;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.pathfinding.PathEntity;
import net.minecraft.pathfinding.PathFinder;
import net.minecraft.pathfinding.PathPoint;
import net.minecraft.world.World;
import noppes.npcs.entity.EntityNPCInterface;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

/** Search-local block cache plus a configurable destination-relative search sphere. */
@Mixin(PathFinder.class)
public abstract class MixinNPCPathBlockCache {
    @Shadow private PathEntity addToPath(Entity entity, PathPoint start, PathPoint end, PathPoint size, float range) { throw new AssertionError(); }

    @Redirect(method = "createEntityPathTo(Lnet/minecraft/entity/Entity;DDDF)Lnet/minecraft/pathfinding/PathEntity;",
            at = @At(value = "INVOKE", target = "Lnet/minecraft/pathfinding/PathFinder;addToPath(Lnet/minecraft/entity/Entity;Lnet/minecraft/pathfinding/PathPoint;Lnet/minecraft/pathfinding/PathPoint;Lnet/minecraft/pathfinding/PathPoint;F)Lnet/minecraft/pathfinding/PathEntity;"), require = 1)
    private PathEntity wolffsmod$search(PathFinder finder, Entity entity, PathPoint start, PathPoint end, PathPoint size, float range) {
        if (!(entity instanceof EntityNPCInterface) || entity.worldObj.isRemote)
            return addToPath(entity, start, end, size, range);
        float effectiveRange = AdaptivePathSearchRange.effective(range, start.distanceTo(end),
                WolffNPCMod.adaptiveNPCPathSearchRadius, WolffNPCMod.minimumNPCPathSearchRadius,
                WolffNPCMod.npcPathSearchDetourMargin);
        if (!WolffNPCMod.cacheNPCPathBlockReads)
            return addToPath(entity, start, end, size, effectiveRange);
        PathBlockCache.begin(entity.worldObj);
        try { return addToPath(entity, start, end, size, effectiveRange); }
        finally { PathBlockCache.end(); }
    }

    @Redirect(method = "func_82565_a", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/World;getBlock(III)Lnet/minecraft/block/Block;"), require = 1)
    private static Block wolffsmod$block(World world, int x, int y, int z) {
        return PathBlockCache.get(world, x, y, z);
    }
}
