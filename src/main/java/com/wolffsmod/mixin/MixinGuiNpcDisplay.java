package com.wolffsmod.mixin;

import com.wolffsmod.customnpc.IMixinDataDisplay;
import com.wolffsmod.customnpc.IMixinDataInventory;
import noppes.npcs.client.gui.mainmenu.GuiNpcDisplay;
import noppes.npcs.client.gui.util.GuiNPCInterface2;
import noppes.npcs.client.gui.util.GuiNpcButton;
import noppes.npcs.client.gui.util.GuiNpcLabel;
import noppes.npcs.client.gui.util.GuiNpcTextField;
import noppes.npcs.client.gui.util.IGuiData;
import noppes.npcs.client.gui.util.ITextfieldListener;
import noppes.npcs.entity.EntityNPCInterface;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.minecraft.client.gui.GuiButton;

@Mixin(value = GuiNpcDisplay.class)
public abstract class MixinGuiNpcDisplay extends GuiNPCInterface2 implements ITextfieldListener, IGuiData
{
    private MixinGuiNpcDisplay(EntityNPCInterface npc)
    {
        super(npc);
    }

    @Inject(method = "initGui", at = @At(value = "TAIL"))
    private void onInitGui(CallbackInfo callbackInfo)
    {
        addLabel(new GuiNpcLabel(20, "Flan Gun Animations", guiLeft + 185, guiTop + 170));
        addButton(new GuiNpcButton(20, guiLeft + 300, guiTop + 165, 100, 20, new String[]{"Disabled", "Only Shoot", "Only Reload", "Shoot & Reload"},
                (((IMixinDataDisplay)npc.display).getHasFlanShootAnimation() ? 1:0) + (((IMixinDataDisplay)npc.display).getHasFlanReloadAnimation() ? 2:0)));

        addLabel(new GuiNpcLabel(21, "Flan Melee Animations", guiLeft + 240, guiTop + 193));
        addButton(new GuiNpcButton(21, guiLeft + 350, guiTop + 188, 50, 20, new String[]{"gui.no", "gui.yes"}, ((IMixinDataDisplay)npc.display).getHasFlanMeleeAnimation() ? 1:0));

        addLabel(new GuiNpcLabel(22, "Display Hurt Effect", guiLeft + 255, guiTop + 55));
        addButton(new GuiNpcButton(22, guiLeft + 360, guiTop + 50, 50, 20, new String[]{"gui.no", "gui.yes"}, ((IMixinDataDisplay)npc.display).getDisplayHurtEffect() ? 1:0));
    }

    @Inject(method = "actionPerformed", at = @At(value = "TAIL"))
    private void onActionPerformed(GuiButton guibutton, CallbackInfo callbackInfo)
    {
        if (guibutton.id == 20)
        {
            ((IMixinDataDisplay)npc.display).setHasFlanShootAnimation(((GuiNpcButton)guibutton).getValue() == 3 || ((GuiNpcButton)guibutton).getValue() == 1);
            ((IMixinDataDisplay)npc.display).setHasFlanReloadAnimation(((GuiNpcButton)guibutton).getValue() == 3 || ((GuiNpcButton)guibutton).getValue() == 2);
            save();
        }
        else if (guibutton.id == 21)
        {
            ((IMixinDataDisplay)npc.display).setHasFlanMeleeAnimation(((GuiNpcButton)guibutton).getValue() == 1);
            save();
        }
        else if (guibutton.id == 22)
        {
            ((IMixinDataDisplay)npc.display).setDisplayHurtEffect(((GuiNpcButton)guibutton).getValue() == 1);
            save();
        }
    }
}
