package com.wolffsmod.customnpc;

import net.minecraft.client.gui.GuiButton;
import noppes.npcs.client.gui.util.GuiNpcButton;
import noppes.npcs.client.gui.util.GuiNpcLabel;
import noppes.npcs.client.gui.util.GuiNpcTextField;
import noppes.npcs.client.gui.util.ITextfieldListener;
import noppes.npcs.client.gui.util.SubGuiInterface;

public class SubGuiVehicleMobility extends SubGuiInterface implements ITextfieldListener {
    private final IMixinDataAI data;

    public SubGuiVehicleMobility(IMixinDataAI data) {
        this.data = data;
        setBackground("menubg.png");
        xSize = 256;
        ySize = 216;
        closeOnEsc = true;
    }

    @Override
    public void initGui() {
        super.initGui();
        int y = guiTop + 10;
        VehicleMobilityProfile profile = data.getVehicleMobilityProfile();
        String[] names = new String[VehicleMobilityProfile.values().length];
        for (int i = 0; i < names.length; i++) names[i] = VehicleMobilityProfile.values()[i].getDisplayName();

        addLabel(new GuiNpcLabel(0, "Terrain Movement", guiLeft + 8, y + 5));
        addButton(new GuiNpcButton(0, guiLeft + 112, y, 136, 20, names, profile.ordinal()));

        if (profile != VehicleMobilityProfile.LEGACY) {
            y += 31;
            if (profile == VehicleMobilityProfile.GROUND || profile == VehicleMobilityProfile.AMPHIBIOUS) {
                addNumber(1, "Land speed (blocks/sec)", data.getVehicleLandSpeed(), y, false);
                y += 26;
            }
            if (profile == VehicleMobilityProfile.WATERCRAFT || profile == VehicleMobilityProfile.AMPHIBIOUS) {
                addNumber(2, "Water speed (blocks/sec)", data.getVehicleWaterSpeed(), y, false);
                y += 26;
            }
            if (profile == VehicleMobilityProfile.GROUND) {
                addNumber(3, "Maximum water depth", data.getVehicleGroundMaxWaterDepth(), y, true);
                y += 26;
            }
            if (profile == VehicleMobilityProfile.WATERCRAFT) {
                addNumber(4, "Minimum water depth", data.getVehicleWatercraftMinDepth(), y, true);
                y += 26;
                String[] craftTypes = new String[WatercraftType.values().length];
                for (int i = 0; i < craftTypes.length; i++) craftTypes[i] = WatercraftType.values()[i].getDisplayName();
                addLabel(new GuiNpcLabel(12, "Watercraft Type", guiLeft + 8, y + 5));
                addButton(new GuiNpcButton(5, guiLeft + 142, y, 106, 20, craftTypes, data.getWatercraftType().ordinal()));
                y += 26;
                if (data.getWatercraftType() == WatercraftType.SUBMARINE) {
                    addNumber(6, "Depth below surface", data.getSubmarineDepth(), y, true);
                    y += 26;
                    addNumber(7, "Minimum submarine depth", data.getSubmarineMinimumWaterDepth(), y, true);
                    y += 26;
                }
            }
            if (profile != VehicleMobilityProfile.WATERCRAFT || data.getWatercraftType() != WatercraftType.SUBMARINE)
                addLabel(new GuiNpcLabel(10, profile == VehicleMobilityProfile.GROUND
                        ? "Ground Driving controls steering and braking."
                        : "Uses the NPC's normal turning settings.", guiLeft + 8, y + 8));
        } else {
            addLabel(new GuiNpcLabel(11, "Legacy keeps existing NPC movement unchanged.", guiLeft + 8, y + 42));
        }
        if (profile == VehicleMobilityProfile.GROUND)
            addButton(new GuiNpcButton(67, guiLeft + 8, guiTop + 164, 150, 20, "Ground Driving..."));
        addButton(new GuiNpcButton(66, guiLeft + 190, guiTop + 190, 60, 20, "gui.done"));
    }

    private void addNumber(int id, String label, double value, int y, boolean integer) {
        addLabel(new GuiNpcLabel(id, label, guiLeft + 8, y + 5));
        GuiNpcTextField field = new GuiNpcTextField(id, this, guiLeft + 184, y, 64, 20,
                integer ? Integer.toString((int)value) : Double.toString(value));
        field.integersOnly = integer;
        field.doublesOnly = !integer;
        if (integer) field.setMinMaxDefault(id == 3 ? 0 : 1, 64, 1);
        else field.setMinMaxDefaultDouble(0.05D, 100.0D, 5.0D);
        addTextField(field);
    }

    @Override
    protected void actionPerformed(GuiButton button) {
        if (button.id == 0) {
            data.setVehicleMobilityProfile(VehicleMobilityProfile.fromOrdinal(((GuiNpcButton)button).getValue()));
            initGui();
        } else if (button.id == 66) {
            close();
        } else if (button.id == 67) {
            setSubGui(new SubGuiGroundVehicleSettings(data));
        } else if (button.id == 5) {
            data.setWatercraftType(WatercraftType.fromOrdinal(((GuiNpcButton)button).getValue()));
            initGui();
        }
    }

    @Override
    public void unFocused(GuiNpcTextField field) {
        if (field.id == 1) data.setVehicleLandSpeed(field.getDouble());
        else if (field.id == 2) data.setVehicleWaterSpeed(field.getDouble());
        else if (field.id == 3) data.setVehicleGroundMaxWaterDepth(field.getInteger());
        else if (field.id == 4) data.setVehicleWatercraftMinDepth(field.getInteger());
        else if (field.id == 6) data.setSubmarineDepth(field.getInteger());
        else if (field.id == 7) data.setSubmarineMinimumWaterDepth(field.getInteger());
    }
}
