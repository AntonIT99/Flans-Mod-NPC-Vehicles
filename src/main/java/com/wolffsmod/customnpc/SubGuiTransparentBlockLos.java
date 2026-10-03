package com.wolffsmod.customnpc;

import net.minecraft.client.gui.GuiButton;
import noppes.npcs.client.gui.util.GuiNpcButton;
import noppes.npcs.client.gui.util.GuiNpcLabel;
import noppes.npcs.client.gui.util.GuiNpcTextField;
import noppes.npcs.client.gui.util.ITextfieldListener;
import noppes.npcs.client.gui.util.SubGuiInterface;

public class SubGuiTransparentBlockLos extends SubGuiInterface implements ITextfieldListener {
    private final IMixinDataDisplay data;

    public SubGuiTransparentBlockLos(IMixinDataDisplay data) {
        this.data = data;
        setBackground("menubg.png");
        xSize = 256;
        ySize = 216;
        closeOnEsc = true;
    }

    @Override
    public void initGui() {
        super.initGui();
        addLabel(new GuiNpcLabel(0, "Transparent Block LOS", guiLeft + 8, guiTop + 12));
        addLabel(new GuiNpcLabel(1, "Behavior", guiLeft + 8, guiTop + 42));
        addButton(new GuiNpcButton(0, guiLeft + 98, guiTop + 37, 150, 20,
                new String[] { "Normal", "See Through", "See + Fire Through" }, data.getTransparentBlockLosMode()));

        addLimit(1, "Vision block limit", data.getTransparentBlockVisionLimit(), guiTop + 69);
        addLimit(2, "Firing block limit", data.getTransparentBlockFireLimit(), guiTop + 96);

        addLabel(new GuiNpcLabel(4, "Eligible: plants, leaves, webs, fences,", guiLeft + 8, guiTop + 128));
        addLabel(new GuiNpcLabel(5, "gates, glass/panes/bars, vines and ladders.", guiLeft + 8, guiTop + 140));
        addLabel(new GuiNpcLabel(6, "Firing bypass applies to Flan projectiles.", guiLeft + 8, guiTop + 158));
        addButton(new GuiNpcButton(66, guiLeft + 190, guiTop + 190, 60, 20, "gui.done"));
    }

    private void addLimit(int id, String label, int value, int y) {
        addLabel(new GuiNpcLabel(10 + id, label, guiLeft + 8, y + 5));
        GuiNpcTextField field = new GuiNpcTextField(id, this, guiLeft + 184, y, 64, 20, Integer.toString(value));
        field.integersOnly = true;
        field.setMinMaxDefault(0, 64, 1);
        addTextField(field);
    }

    @Override
    protected void actionPerformed(GuiButton button) {
        if (button.id == 0) {
            data.setTransparentBlockLosMode(((GuiNpcButton)button).getValue());
        } else if (button.id == 66) {
            close();
        }
    }

    @Override
    public void unFocused(GuiNpcTextField field) {
        if (field.id == 1) data.setTransparentBlockVisionLimit(field.getInteger());
        else if (field.id == 2) data.setTransparentBlockFireLimit(field.getInteger());
    }
}
