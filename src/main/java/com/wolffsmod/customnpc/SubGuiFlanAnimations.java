package com.wolffsmod.customnpc;

import noppes.npcs.client.gui.util.GuiNpcButton;
import noppes.npcs.client.gui.util.GuiNpcLabel;
import noppes.npcs.client.gui.util.GuiNpcTextField;
import noppes.npcs.client.gui.util.ISubGuiListener;
import noppes.npcs.client.gui.util.ITextfieldListener;
import noppes.npcs.client.gui.util.SubGuiInterface;

import net.minecraft.client.gui.GuiButton;

public class SubGuiFlanAnimations extends SubGuiInterface implements ISubGuiListener, ITextfieldListener
{
    private final IMixinDataDisplay dataDisplay;

    public SubGuiFlanAnimations(IMixinDataDisplay dataDisplay) {
        this.dataDisplay = dataDisplay;
        this.setBackground("menubg.png");
        this.xSize = 256;
        this.ySize = 216;
        this.closeOnEsc = true;
    }

    public void initGui() {
        super.initGui();

        addLabel(new GuiNpcLabel(0, "Flan Gun Animations", guiLeft + 5, guiTop + 35));
        addButton(new GuiNpcButton(0, guiLeft + 122, guiTop + 30, 100, 20, new String[]{"Disabled", "Only Shoot", "Only Reload", "Shoot & Reload"},
                (dataDisplay.getHasFlanShootAnimation() ? 1:0) + (dataDisplay.getHasFlanReloadAnimation() ? 2:0)));

        addLabel(new GuiNpcLabel(1, "Flan Melee Animations", guiLeft + 5, guiTop + 60));
        addButton(new GuiNpcButton(1, guiLeft + 122, guiTop + 55, 50, 20, new String[]{"gui.no", "gui.yes"}, (dataDisplay.getHasFlanMeleeAnimation() ? 1:0)));

        addButton(new GuiNpcButton(2, this.guiLeft + 82, this.guiTop + 190, 98, 20, "gui.done"));
    }

    protected void actionPerformed(GuiButton guibutton) {
        if (guibutton.id == 0)
        {
            dataDisplay.setHasFlanShootAnimation(((GuiNpcButton)guibutton).getValue() == 3 || ((GuiNpcButton)guibutton).getValue() == 1);
            dataDisplay.setHasFlanReloadAnimation(((GuiNpcButton)guibutton).getValue() == 3 || ((GuiNpcButton)guibutton).getValue() == 2);
            save();
        }
        else if (guibutton.id == 1)
        {
            dataDisplay.setHasFlanMeleeAnimation(((GuiNpcButton)guibutton).getValue() == 1);
            save();
        }

        if (guibutton.id == 2) {
            this.close();
        }
    }

    public void subGuiClosed(SubGuiInterface subgui) {
        this.initGui();
        this.save();
    }

    public void unFocused(GuiNpcTextField textfield) {
    }
}
