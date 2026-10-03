package com.wolffsmod.mixin;

import com.wolffsmod.customnpc.TransparentBlockLos;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.ai.EntitySenses;
import noppes.npcs.entity.EntityNPCInterface;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(EntitySenses.class)
public abstract class MixinEntitySensesTransparentBlocks {
    @Shadow private EntityLiving entityObj;

    @Inject(method = "canSee", at = @At("HEAD"), cancellable = true, require = 1)
    private void wolffsmod$transparentBlockVision(Entity target, CallbackInfoReturnable<Boolean> callbackInfo) {
        if (entityObj instanceof EntityNPCInterface && TransparentBlockLos.isEnabled((EntityNPCInterface)entityObj))
            callbackInfo.setReturnValue(TransparentBlockLos.canSee((EntityNPCInterface)entityObj, target));
    }
}
