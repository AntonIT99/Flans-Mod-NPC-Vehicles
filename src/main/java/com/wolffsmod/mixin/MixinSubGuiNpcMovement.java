package com.wolffsmod.mixin;

import com.wolffsmod.customnpc.IMixinDataAI;
import com.wolffsmod.customnpc.SubGuiVehicleMobility;
import net.minecraft.client.gui.GuiButton;
import noppes.npcs.DataAI;
import noppes.npcs.client.gui.SubGuiNpcMovement;
import noppes.npcs.client.gui.util.GuiNpcButton;
import noppes.npcs.client.gui.util.SubGuiInterface;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = SubGuiNpcMovement.class, remap = false)
public abstract class MixinSubGuiNpcMovement extends SubGuiInterface {
    @Shadow private DataAI ai;

    @Inject(method = "func_73866_w_", at = @At("TAIL"), remap = false)
    private void wolffsmod$addMobilityButton(CallbackInfo ci) {
        addButton(new GuiNpcButton(90, guiLeft + 184, guiTop + 4, 68, 20, "Terrain..."));
    }

    @Inject(method = "func_146284_a", at = @At("TAIL"), remap = false)
    private void wolffsmod$openMobility(GuiButton button, CallbackInfo ci) {
        if (button.id == 90) setSubGui(new SubGuiVehicleMobility((IMixinDataAI)ai));
    }
}
