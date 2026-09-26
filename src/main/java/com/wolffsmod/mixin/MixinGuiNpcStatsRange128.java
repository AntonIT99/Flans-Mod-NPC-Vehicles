package com.wolffsmod.mixin;

import com.wolffsmod.config.RangeConfig;
import noppes.npcs.client.gui.mainmenu.GuiNpcStats;
import noppes.npcs.client.gui.util.GuiNPCInterface2;
import noppes.npcs.client.gui.util.IGuiData;
import noppes.npcs.client.gui.util.ITextfieldListener;
import noppes.npcs.entity.EntityNPCInterface;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(GuiNpcStats.class)
public abstract class MixinGuiNpcStatsRange128 extends GuiNPCInterface2 implements IGuiData, ITextfieldListener {
    private MixinGuiNpcStatsRange128(EntityNPCInterface npc) {
        super(npc);
    }

    @Inject(method = "func_73866_w_", at = @At("TAIL"), remap = false)
    private void wolffsmod$extendAggroRangeLimit(CallbackInfo callbackInfo) {
        getTextField(1).setMinMaxDefault(1, RangeConfig.getMaximumNPCCombatRange(), 2);
    }
}
