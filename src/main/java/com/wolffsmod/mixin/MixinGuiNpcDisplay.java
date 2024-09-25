package com.wolffsmod.mixin;

import com.wolffsmod.customnpc.IMixinDataDisplay;
import com.wolffsmod.customnpc.SubGuiFlanAnimations;
import noppes.npcs.DataDisplay;
import noppes.npcs.client.gui.mainmenu.GuiNpcDisplay;
import noppes.npcs.client.gui.util.GuiNPCInterface2;
import noppes.npcs.client.gui.util.GuiNpcButton;
import noppes.npcs.client.gui.util.GuiNpcLabel;
import noppes.npcs.client.gui.util.IGuiData;
import noppes.npcs.client.gui.util.ITextfieldListener;
import noppes.npcs.entity.EntityNPCInterface;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.minecraft.client.gui.GuiButton;

@Mixin(value = GuiNpcDisplay.class)
public abstract class MixinGuiNpcDisplay extends GuiNPCInterface2 implements ITextfieldListener, IGuiData
{
    @Shadow(remap = false)
    private DataDisplay display;

    private MixinGuiNpcDisplay(EntityNPCInterface npc)
    {
        super(npc);
    }

    @Inject(method = "initGui", at = @At(value = "TAIL"))
    private void onInitGui(CallbackInfo callbackInfo)
    {
        addButton(new GuiNpcButton(21, guiLeft + 185, guiTop + 188, 150, 20, "Flan's Mod Settings"));
        addLabel(new GuiNpcLabel(22, "Display Hurt Effect", guiLeft + 255, guiTop + 55));
        addButton(new GuiNpcButton(22, guiLeft + 360, guiTop + 50, 50, 20, new String[]{"gui.no", "gui.yes"}, ((IMixinDataDisplay)npc.display).getDisplayHurtEffect() ? 1:0));
    }

    @Inject(method = "actionPerformed", at = @At(value = "TAIL"))
    private void onActionPerformed(GuiButton guibutton, CallbackInfo callbackInfo)
    {
        if (guibutton.id == 21)
        {
            setSubGui(new SubGuiFlanAnimations((IMixinDataDisplay)display));
        }
        else if (guibutton.id == 22)
        {
            ((IMixinDataDisplay)npc.display).setDisplayHurtEffect(((GuiNpcButton)guibutton).getValue() == 1);
            save();
        }
    }
}
