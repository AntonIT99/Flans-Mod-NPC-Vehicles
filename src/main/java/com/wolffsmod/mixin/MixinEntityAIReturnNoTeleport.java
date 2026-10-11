package com.wolffsmod.mixin;

import net.minecraft.pathfinding.PathNavigate;
import noppes.npcs.ai.EntityAIReturn;
import noppes.npcs.entity.EntityNPCInterface;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

/** Replaces automatic return-to-start teleports with another path attempt. */
@Mixin(value = EntityAIReturn.class, remap = false)
public abstract class MixinEntityAIReturnNoTeleport {
    @Unique private boolean wolffsmod$returnPathPending;
    @Unique private double wolffsmod$returnX;
    @Unique private double wolffsmod$returnY;
    @Unique private double wolffsmod$returnZ;

    @Redirect(method = "updateTask", at = @At(value = "INVOKE",
            target = "Lnoppes/npcs/entity/EntityNPCInterface;func_70107_b(DDD)V"), require = 2)
    private void wolffsmod$replaceAutomaticTeleport(EntityNPCInterface npc, double x, double y, double z) {
        wolffsmod$returnPathPending = true;
        wolffsmod$returnX = x;
        wolffsmod$returnY = y;
        wolffsmod$returnZ = z;
    }

    @Redirect(method = "updateTask", at = @At(value = "INVOKE",
            target = "Lnet/minecraft/pathfinding/PathNavigate;func_75499_g()V"), require = 2)
    private void wolffsmod$retryReturnPath(PathNavigate navigator) {
        if (wolffsmod$returnPathPending) {
            wolffsmod$returnPathPending = false;
            navigator.tryMoveToXYZ(wolffsmod$returnX, wolffsmod$returnY, wolffsmod$returnZ, 1.0D);
        } else {
            navigator.clearPathEntity();
        }
    }
}
