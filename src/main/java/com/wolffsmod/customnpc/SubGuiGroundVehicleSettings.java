package com.wolffsmod.customnpc;

import net.minecraft.client.gui.GuiButton;
import noppes.npcs.client.gui.util.GuiNpcButton;
import noppes.npcs.client.gui.util.GuiNpcLabel;
import noppes.npcs.client.gui.util.GuiNpcTextField;
import noppes.npcs.client.gui.util.ITextfieldListener;
import noppes.npcs.client.gui.util.SubGuiInterface;

public class SubGuiGroundVehicleSettings extends SubGuiInterface implements ITextfieldListener {
    private final IMixinDataAI data;
    private int page;

    public SubGuiGroundVehicleSettings(IMixinDataAI data) {
        this.data = data;
        setBackground("menubg.png"); xSize = 256; ySize = 216; closeOnEsc = true;
    }

    @Override public void initGui() {
        super.initGui();
        addLabel(new GuiNpcLabel(0, "Ground Vehicle - " + pageName(), guiLeft + 8, guiTop + 9));
        if (page == 0) general();
        else if (page == 1) speed();
        else if (page == 2) steering();
        else pathing();
        addButton(new GuiNpcButton(90, guiLeft + 8, guiTop + 190, 52, 20, "< Prev"));
        addButton(new GuiNpcButton(91, guiLeft + 64, guiTop + 190, 52, 20, "Next >"));
        addButton(new GuiNpcButton(66, guiLeft + 188, guiTop + 190, 60, 20, "gui.done"));
    }

    private void general() {
        String[] presets = names(GroundVehiclePreset.values());
        String[] types = names(GroundVehicleType.values());
        addChoice(6, "Driving controller", yesNo(), data.getGroundDrivingEnabled() ? 1 : 0, 30);
        addChoice(1, "Preset", presets, data.getGroundVehiclePreset().ordinal(), 55);
        addChoice(2, "Vehicle type", types, data.getGroundVehicleType().ordinal(), 80);
        addChoice(3, "Allow pivot turn", yesNo(), data.getGroundAllowPivot() ? 1 : 0, 105);
        addChoice(4, "Allow reversing", yesNo(), data.getGroundAllowReversing() ? 1 : 0, 130);
        addChoice(5, "Path debug", yesNo(), data.getGroundDebug() ? 1 : 0, 155);
    }

    private void speed() {
        addNumber(101, "Maximum forward speed", data.getGroundMaxForwardSpeed(), 35, .1, 100);
        addNumber(102, "Maximum reverse speed", data.getGroundMaxReverseSpeed(), 62, .1, 50);
        addNumber(103, "Acceleration", data.getGroundAcceleration(), 89, .05, 100);
        addNumber(104, "Braking strength", data.getGroundBraking(), 116, .05, 100);
        addNumber(105, "Coast deceleration", data.getGroundCoastDeceleration(), 143, .01, 50);
        addLabel(new GuiNpcLabel(40, "Speeds use blocks/sec; acceleration uses blocks/sec².", guiLeft + 8, guiTop + 174));
    }

    private void steering() {
        addNumber(106, "Steering rate", data.getGroundSteeringRate(), 32, .1, 180);
        addNumber(107, "Maximum steering angle", data.getGroundMaximumSteeringAngle(), 57, 1, 89);
        addNumber(108, "Minimum turn radius", data.getGroundMinimumTurnRadius(), 82, .5, 64);
        addNumber(109, "Maximum turn rate", data.getGroundMaxTurnRate(), 107, .1, 180);
        addNumber(110, "Steering lookahead", data.getGroundSteeringLookahead(), 132, 1, 32);
        addNumber(111, "Turn slowdown (0-1)", data.getGroundTurnSlowdown(), 157, 0, 1);
    }

    private void pathing() {
        addNumber(112, "Stop distance", data.getGroundStopDistance(), 35, .25, 32);
        addNumber(113, "Reverse angle threshold", data.getGroundReverseAngleThreshold(), 62, 45, 179);
        addNumber(114, "Maximum reverse distance", data.getGroundMaxReverseDistance(), 89, 1, 64);
        addNumber(115, "Following distance", data.getGroundFollowingDistance(), 116, 1, 64);
        addNumber(116, "Minimum following distance", data.getGroundMinimumFollowingDistance(), 143, .5, 32);
        addLabel(new GuiNpcLabel(41, "Stuck recovery reverses briefly, then requests a new path.", guiLeft + 8, guiTop + 174));
    }

    private void addChoice(int id, String label, String[] choices, int selected, int y) {
        addLabel(new GuiNpcLabel(20 + id, label, guiLeft + 8, guiTop + y + 5));
        addButton(new GuiNpcButton(id, guiLeft + 122, guiTop + y, 126, 20, choices, selected));
    }

    private void addNumber(int id, String label, double value, int y, double min, double max) {
        addLabel(new GuiNpcLabel(20 + id, label, guiLeft + 8, guiTop + y + 5));
        GuiNpcTextField field = new GuiNpcTextField(id, this, guiLeft + 184, guiTop + y, 64, 20, Double.toString(value));
        field.doublesOnly = true; field.setMinMaxDefaultDouble(min, max, value); addTextField(field);
    }

    @Override protected void actionPerformed(GuiButton button) {
        if (button.id == 1) {
            GroundVehiclePreset p = GroundVehiclePreset.fromOrdinal(((GuiNpcButton)button).getValue());
            data.setGroundVehiclePreset(p); p.apply(data); initGui();
        } else if (button.id == 2) { data.setGroundVehicleType(GroundVehicleType.fromOrdinal(((GuiNpcButton)button).getValue())); markCustom(); }
        else if (button.id == 3) { data.setGroundAllowPivot(((GuiNpcButton)button).getValue() == 1); markCustom(); }
        else if (button.id == 4) { data.setGroundAllowReversing(((GuiNpcButton)button).getValue() == 1); markCustom(); }
        else if (button.id == 5) { data.setGroundDebug(((GuiNpcButton)button).getValue() == 1); }
        else if (button.id == 6) { data.setGroundDrivingEnabled(((GuiNpcButton)button).getValue() == 1); }
        else if (button.id == 90) { commitFields(); page = (page + 3) % 4; initGui(); }
        else if (button.id == 91) { commitFields(); page = (page + 1) % 4; initGui(); }
        else if (button.id == 66) { commitFields(); close(); }
    }

    @Override public void unFocused(GuiNpcTextField f) {
        double v = f.getDouble();
        switch (f.id) {
            case 101: data.setGroundMaxForwardSpeed(v); break; case 102: data.setGroundMaxReverseSpeed(v); break;
            case 103: data.setGroundAcceleration(v); break; case 104: data.setGroundBraking(v); break;
            case 105: data.setGroundCoastDeceleration(v); break; case 106: data.setGroundSteeringRate(v); break;
            case 107: data.setGroundMaximumSteeringAngle(v); break; case 108: data.setGroundMinimumTurnRadius(v); break;
            case 109: data.setGroundMaxTurnRate(v); break; case 110: data.setGroundSteeringLookahead(v); break;
            case 111: data.setGroundTurnSlowdown(v); break; case 112: data.setGroundStopDistance(v); break;
            case 113: data.setGroundReverseAngleThreshold(v); break; case 114: data.setGroundMaxReverseDistance(v); break;
            case 115: data.setGroundFollowingDistance(v); break; case 116: data.setGroundMinimumFollowingDistance(v); break;
            default: return;
        }
        markCustom();
    }

    private void markCustom() { data.setGroundVehiclePreset(GroundVehiclePreset.CUSTOM); }
    private void commitFields() {
        for (int id = 101; id <= 116; id++) {
            GuiNpcTextField field = getTextField(id);
            if (field != null) unFocused(field);
        }
    }
    private String pageName() { return new String[] { "General", "Speed", "Steering", "Pathing" }[page]; }
    private static String[] yesNo() { return new String[] { "gui.no", "gui.yes" }; }
    private static String[] names(GroundVehiclePreset[] values) { String[] n = new String[values.length]; for (int i=0;i<n.length;i++) n[i]=values[i].getDisplayName(); return n; }
    private static String[] names(GroundVehicleType[] values) { String[] n = new String[values.length]; for (int i=0;i<n.length;i++) n[i]=values[i].getDisplayName(); return n; }
}
