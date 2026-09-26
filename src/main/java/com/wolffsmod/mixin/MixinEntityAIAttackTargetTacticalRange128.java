package com.wolffsmod.mixin;

import com.wolffsmod.customnpc.TacticalRangeHelper;
import kamkeel.npcs.addon.DBCAddon;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.MathHelper;
import noppes.npcs.ai.EntityAIAttackTarget;
import noppes.npcs.entity.EntityNPCInterface;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(EntityAIAttackTarget.class)
public abstract class MixinEntityAIAttackTargetTacticalRange128 {
    @Shadow(remap = false)
    private EntityNPCInterface npc;

    @Shadow(remap = false)
    private EntityLivingBase entityTarget;

    @Inject(method = "continueExecuting", at = @At("HEAD"), cancellable = true, remap = false)
    private void wolffsmod$retainExtendedTacticalTarget(CallbackInfoReturnable<Boolean> callbackInfo) {
        EntityLivingBase target = npc.getAttackTarget();
        if (target == null || !target.isEntityAlive()) {
            return;
        }

        float distance = npc.getDistanceToEntity(target);
        if (distance <= npc.stats.aggroRange
                || distance > TacticalRangeHelper.getTargetRetentionRange(npc)) {
            return;
        }

        this.entityTarget = target;
        if (target instanceof EntityPlayer && DBCAddon.instance.isKO(npc, (EntityPlayer) target)) {
            callbackInfo.setReturnValue(false);
        } else if (npc.ais.useRangeMelee == 1
                && npc.getDistanceSqToEntity(target) > npc.ais.distanceToMelee * npc.ais.distanceToMelee) {
            callbackInfo.setReturnValue(false);
        } else {
            callbackInfo.setReturnValue(npc.isWithinHomeDistance(
                    MathHelper.floor_double(target.posX),
                    MathHelper.floor_double(target.posY),
                    MathHelper.floor_double(target.posZ)));
        }
    }
}
