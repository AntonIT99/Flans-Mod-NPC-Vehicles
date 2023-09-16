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

    @Inject(method = "initGui", at = @At(value = "TAIL"))
    private void onInitGui(CallbackInfo callbackInfo)
    {
        IMixinResistances res = (IMixinResistances) resistances;

        addLabel(new GuiNpcLabel(10, "Damage Vulnerabilities", guiLeft + 4, guiTop + 110));

        addTextField(new GuiNpcTextField(11, this, fontRendererObj, guiLeft + 100, guiTop + 127,50, 18, String.valueOf(res.getArrowVulnerability())));
        addLabel(new GuiNpcLabel(11, "item.arrow.name", guiLeft + 4, guiTop + 132));
        getTextField(11).integersOnly = true;

        addTextField(new GuiNpcTextField(12, this, fontRendererObj, guiLeft + 100, guiTop + 149, 50, 18, String.valueOf(res.getMeleeVulnerability())));
        addLabel(new GuiNpcLabel(12, "stats.melee", guiLeft + 4, guiTop + 154));
        getTextField(12).integersOnly = true;

        addTextField(new GuiNpcTextField(13, this, fontRendererObj, guiLeft + 100,  guiTop + 171,50, 18, String.valueOf(res.getExplosionVulnerability())));
        addLabel(new GuiNpcLabel(13, "stats.explosion", guiLeft + 4, guiTop + 176));
        getTextField(13).integersOnly = true;

        addLabel(new GuiNpcLabel(14, "≥", guiLeft + 90, guiTop + 132));
        addLabel(new GuiNpcLabel(15, "≥", guiLeft + 90, guiTop + 154));
        addLabel(new GuiNpcLabel(16, "≥", guiLeft + 90, guiTop + 176));
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
