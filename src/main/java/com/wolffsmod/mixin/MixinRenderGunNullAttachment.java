package com.wolffsmod.mixin;

import com.flansmod.client.model.RenderGun;
import com.flansmod.common.guns.AttachmentType;
import com.flansmod.common.guns.GunType;
import com.flansmod.common.vector.Vector3f;
import net.minecraft.item.ItemStack;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

/**
 * Modern TAP can retain an attachment type while an old saved gun has no
 * corresponding attachment ItemStack. Its renderer dereferences that missing
 * stack before drawing. Skip only that malformed attachment render.
 */
@Mixin(value = RenderGun.class, remap = false)
public abstract class MixinRenderGunNullAttachment {
    @Inject(method = "preRenderAttachment(Lcom/flansmod/common/guns/AttachmentType;Lnet/minecraft/item/ItemStack;Lcom/flansmod/common/vector/Vector3f;Lcom/flansmod/common/guns/GunType;)V",
            at = @At("HEAD"), cancellable = true, require = 0, remap = false)
    private void wolffsmod$skipInvalidAttachmentPre(AttachmentType attachment, ItemStack stack,
                                                     Vector3f attachPoint, GunType gunType, CallbackInfo ci) {
        if (attachment == null || stack == null || attachPoint == null || gunType == null) ci.cancel();
    }

    @Inject(method = "postRenderAttachment(Lcom/flansmod/common/guns/AttachmentType;Lnet/minecraft/item/ItemStack;F)V",
            at = @At("HEAD"), cancellable = true, require = 0, remap = false)
    private void wolffsmod$skipInvalidAttachmentPost(AttachmentType attachment, ItemStack stack,
                                                      float scale, CallbackInfo ci) {
        if (attachment == null || stack == null) ci.cancel();
    }
}
