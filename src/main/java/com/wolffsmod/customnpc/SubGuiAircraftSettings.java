package com.wolffsmod.customnpc;

import net.minecraft.client.gui.GuiButton;
import noppes.npcs.client.gui.util.GuiNpcButton;
import noppes.npcs.client.gui.util.GuiNpcLabel;
import noppes.npcs.client.gui.util.GuiNpcTextField;
import noppes.npcs.client.gui.util.ITextfieldListener;
import noppes.npcs.client.gui.util.SubGuiInterface;

public class SubGuiAircraftSettings extends SubGuiInterface implements ITextfieldListener {
    private final IMixinDataAI data;

    public SubGuiAircraftSettings(IMixinDataAI data) {
        this.data = data;
        setBackground("menubg.png");
        xSize = 256;
        ySize = 216;
        closeOnEsc = true;
    }

    @Override public void initGui() {
        super.initGui();
        String[] types = new String[AircraftFlightType.values().length];
        for (int i = 0; i < types.length; i++) types[i] = AircraftFlightType.values()[i].getDisplayName();
        addLabel(new GuiNpcLabel(0, "Flight Type", guiLeft + 8, guiTop + 15));
        addButton(new GuiNpcButton(0, guiLeft + 104, guiTop + 10, 144, 20, types, data.getAircraftFlightType().ordinal()));

        if (data.getAircraftFlightType() != AircraftFlightType.NORMAL) {
            addLabel(new GuiNpcLabel(1, "Minimum attack altitude", guiLeft + 8, guiTop + 47));
            GuiNpcTextField altitude = new GuiNpcTextField(1, this, guiLeft + 190, guiTop + 42, 58, 20,
                    Integer.toString(data.getAircraftMinimumAttackAltitude()));
            altitude.integersOnly = true;
            altitude.setMinMaxDefault(1, 128, 20);
            addTextField(altitude);
            addLabel(new GuiNpcLabel(2, "blocks above terrain", guiLeft + 104, guiTop + 67));
            addLabel(new GuiNpcLabel(3, "Attack is held while climbing; the target is kept.", guiLeft + 8, guiTop + 94));
            addLabel(new GuiNpcLabel(4, "Plane keeps moving; helicopter can hover.", guiLeft + 8, guiTop + 110));
            addLabel(new GuiNpcLabel(5, "Debug", guiLeft + 8, guiTop + 141));
            addButton(new GuiNpcButton(2, guiLeft + 104, guiTop + 136, 60, 20,
                    new String[]{"gui.no", "gui.yes"}, data.getAircraftDebug() ? 1 : 0));
        } else {
            addLabel(new GuiNpcLabel(6, "Normal Fly keeps CustomNPC+ behavior unchanged.", guiLeft + 8, guiTop + 58));
        }
        addButton(new GuiNpcButton(66, guiLeft + 190, guiTop + 190, 60, 20, "gui.done"));
    }

    @Override protected void actionPerformed(GuiButton button) {
        if (button.id == 0) {
            data.setAircraftFlightType(AircraftFlightType.fromOrdinal(((GuiNpcButton)button).getValue()));
            initGui();
        } else if (button.id == 2) {
            data.setAircraftDebug(((GuiNpcButton)button).getValue() == 1);
        } else if (button.id == 66) close();
    }

    @Override public void unFocused(GuiNpcTextField field) {
        if (field.id == 1) data.setAircraftMinimumAttackAltitude(field.getInteger());
    }
}
