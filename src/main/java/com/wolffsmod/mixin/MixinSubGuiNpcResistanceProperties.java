package com.wolffsmod.mixin;

import com.wolffsmod.customnpc.IMixinResistances;
import noppes.npcs.Resistances;
import noppes.npcs.client.gui.SubGuiNpcResistanceProperties;
import noppes.npcs.client.gui.util.GuiNpcLabel;
import noppes.npcs.client.gui.util.GuiNpcTextField;
import noppes.npcs.client.gui.util.ISliderListener;
import noppes.npcs.client.gui.util.ITextfieldListener;
import noppes.npcs.client.gui.util.SubGuiInterface;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = SubGuiNpcResistanceProperties.class)
public abstract class MixinSubGuiNpcResistanceProperties extends SubGuiInterface implements ISliderListener, ITextfieldListener
{
    @Shadow(remap = false)
    private Resistances resistances;

    @Inject(method = "func_73866_w_", at = @At(value = "HEAD"), remap = false)
    private void makeRoomForClearResistanceLabels(CallbackInfo callbackInfo)
    {
        ySize = 250;
    }

    @Inject(method = "func_73866_w_", at = @At(value = "TAIL"), remap = false)
    private void onInitGui(CallbackInfo callbackInfo)
    {
        IMixinResistances res = (IMixinResistances) resistances;

        // Clarify CustomNPC+'s native global invulnerability control and keep its
        // label clear of the Wolff threshold controls below it.
        getLabel(21).label = "Disable All Damage";
        getLabel(21).x = guiLeft + 4;
        getLabel(21).y = guiTop + 103;
        getButton(21).xPosition = guiLeft + 150;
        getButton(21).yPosition = guiTop + 98;
        getButton(21).width = 72;
        getButton(21).setHoverText("Yes makes this NPC immune to all damage.");

        addLabel(new GuiNpcLabel(10, "Minimum Hit Damage", guiLeft + 4, guiTop + 125));
        addLabel(new GuiNpcLabel(17, "Damage Type", guiLeft + 4, guiTop + 140));
        addLabel(new GuiNpcLabel(18, "Required (0 = Off)", guiLeft + 139, guiTop + 140));

        addTextField(new GuiNpcTextField(11, this, fontRendererObj, guiLeft + 150, guiTop + 151, 72, 18, String.valueOf(res.getArrowVulnerability())));
        addLabel(new GuiNpcLabel(11, "item.arrow.name", guiLeft + 4, guiTop + 156));
        getTextField(11).integersOnly = true;
        getTextField(11).setHoverText("Projectile hits below this damage are ignored. 0 disables the threshold.");

        addTextField(new GuiNpcTextField(12, this, fontRendererObj, guiLeft + 150, guiTop + 173, 72, 18, String.valueOf(res.getMeleeVulnerability())));
        addLabel(new GuiNpcLabel(12, "stats.melee", guiLeft + 4, guiTop + 178));
        getTextField(12).integersOnly = true;
        getTextField(12).setHoverText("Melee hits below this damage are ignored. 0 disables the threshold.");

        addTextField(new GuiNpcTextField(13, this, fontRendererObj, guiLeft + 150, guiTop + 195, 72, 18, String.valueOf(res.getExplosionVulnerability())));
        addLabel(new GuiNpcLabel(13, "stats.explosion", guiLeft + 4, guiTop + 200));
        getTextField(13).integersOnly = true;
        getTextField(13).setHoverText("Explosion hits below this damage are ignored. 0 disables the threshold.");

        getButton(66).yPosition = guiTop + 224;
    }

    @Override
    public void unFocused(GuiNpcTextField textfield)
    {
        IMixinResistances res = (IMixinResistances) resistances;

        if (textfield.id == 11)
        {
            res.setArrowVulnerability(textfield.getInteger());
        }
        else if (textfield.id == 12)
        {
            res.setMeleeVulnerability(textfield.getInteger());
        }
        else if (textfield.id == 13)
        {
            res.setExplosionVulnerability(textfield.getInteger());
        }
    }
}
