package com.wolffsmod.mixin;

import com.wolffsmod.customnpc.TacticalRangeHelper;
import kamkeel.npcs.addon.DBCAddon;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import noppes.npcs.ai.CombatHandler;
import noppes.npcs.entity.EntityNPCInterface;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(CombatHandler.class)
public abstract class MixinCombatHandlerTacticalRange128 {
    @Shadow(remap = false)
    private EntityNPCInterface npc;

    @Inject(method = "isValidTarget", at = @At("HEAD"), cancellable = true, remap = false)
    private void wolffsmod$retainExtendedTacticalTarget(EntityLivingBase target,
                                                         CallbackInfoReturnable<Boolean> callbackInfo) {
        if (target == null || !target.isEntityAlive()) {
            return;
        }

        float distance = npc.getDistanceToEntity(target);
        float retentionRange = TacticalRangeHelper.getTargetRetentionRange(npc);
        if (distance <= npc.stats.aggroRange || distance > retentionRange) {
            return;
        }

        if (target instanceof EntityPlayer
                && (((EntityPlayer) target).capabilities.disableDamage
                || DBCAddon.instance.isKO(npc, (EntityPlayer) target))) {
            callbackInfo.setReturnValue(false);
            return;
        }

        callbackInfo.setReturnValue(true);
    }
}
