package com.wolffsmod.mixin;

import com.wolffsmod.config.RangeConfig;
import noppes.npcs.CustomNpcs;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;

@Mixin(CustomNpcs.class)
public abstract class MixinCustomNpcsTrackingRange128 {
    @ModifyArg(method = "registerNpc", at = @At(value = "INVOKE",
        target = "Lcpw/mods/fml/common/registry/EntityRegistry;registerModEntity(Ljava/lang/Class;Ljava/lang/String;ILjava/lang/Object;IIZ)V",
        remap = false), index = 4, remap = false)
    private int wolffsmod$useExtendedNpcTrackingRange(int originalRange) {
        return RangeConfig.getNPCViewDistance();
    }
}
