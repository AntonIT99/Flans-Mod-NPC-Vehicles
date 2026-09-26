package com.wolffsmod.mixin;

import com.wolffsmod.config.RangeConfig;
import noppes.npcs.client.gui.SubGuiNpcRangeProperties;
import noppes.npcs.client.gui.util.ISubGuiListener;
import noppes.npcs.client.gui.util.ITextfieldListener;
import noppes.npcs.client.gui.util.SubGuiInterface;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(SubGuiNpcRangeProperties.class)
public abstract class MixinSubGuiNpcRangePropertiesRange128 extends SubGuiInterface implements ITextfieldListener, ISubGuiListener {
    @Inject(method = "func_73866_w_", at = @At("TAIL"), remap = false)
    private void wolffsmod$extendRangedAttackRangeLimit(CallbackInfo callbackInfo) {
        getTextField(2).setMinMaxDefault(1, RangeConfig.getMaximumNPCCombatRange(), 2);
    }
}
