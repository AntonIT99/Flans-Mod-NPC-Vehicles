// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.gui;

import noppes.npcs.controllers.Faction;
import net.minecraft.nbt.NBTTagCompound;
import noppes.npcs.constants.EnumDayTime;
import net.minecraft.entity.player.EntityPlayer;
import noppes.npcs.client.NoppesUtil;
import net.minecraft.client.gui.GuiButton;
import noppes.npcs.client.Client;
import noppes.npcs.constants.EnumPacketServer;
import net.minecraft.client.gui.GuiScreen;
import noppes.npcs.client.gui.util.GuiNpcTextField;
import noppes.npcs.constants.EnumAvailabilityFactionType;
import noppes.npcs.client.gui.util.GuiNpcButton;
import noppes.npcs.client.gui.util.GuiNpcLabel;
import noppes.npcs.controllers.Availability;
import noppes.npcs.client.gui.util.IGuiData;
import noppes.npcs.client.gui.util.GuiSelectionListener;
import noppes.npcs.client.gui.util.ITextfieldListener;
import noppes.npcs.client.gui.util.SubGuiInterface;

public class SubGuiNpcAvailability extends SubGuiInterface implements ITextfieldListener, GuiSelectionListener, IGuiData
{
    private Availability availabitily;
    private int slot;
    
    public SubGuiNpcAvailability(final Availability availabitily) {
        this.slot = 0;
        this.availabitily = availabitily;
        this.setBackground("menubg.png");
        this.xSize = 256;
        this.ySize = 216;
        this.closeOnEsc = true;
    }
    
    @Override
    public void initGui() {
        super.initGui();
        this.addLabel(new GuiNpcLabel(1, "availability.available", this.guiLeft, this.guiTop + 4));
        this.getLabel(1).center(this.xSize);
        this.addButton(new GuiNpcButton(0, this.guiLeft + 34, this.guiTop + 12, 180, 20, "availability.selectdialog"));
        this.addButton(new GuiNpcButton(1, this.guiLeft + 34, this.guiTop + 35, 180, 20, "availability.selectquest"));
        this.addButton(new GuiNpcButton(20, this.guiLeft + 4, this.guiTop + 104, 50, 20, new String[] { "availability.always", "availability.is", "availability.isnot" }, this.availabitily.factionAvailable.ordinal()));
        this.addButton(new GuiNpcButton(22, this.guiLeft + 56, this.guiTop + 104, 60, 20, new String[] { "faction.friendly", "faction.neutral", "faction.unfriendly" }, this.availabitily.factionStance.ordinal()));
        this.addButton(new GuiNpcButton(21, this.guiLeft + 118, this.guiTop + 104, 110, 20, "availability.selectfaction"));
        this.getButton(21).setEnabled(this.availabitily.factionAvailable != EnumAvailabilityFactionType.Always);
        this.getButton(22).setEnabled(this.availabitily.factionAvailable != EnumAvailabilityFactionType.Always);
        this.addButton(new GuiNpcButton(23, this.guiLeft + 230, this.guiTop + 104, 20, 20, "X"));
        this.addButton(new GuiNpcButton(24, this.guiLeft + 4, this.guiTop + 126, 50, 20, new String[] { "availability.always", "availability.is", "availability.isnot" }, this.availabitily.faction2Available.ordinal()));
        this.addButton(new GuiNpcButton(27, this.guiLeft + 56, this.guiTop + 126, 60, 20, new String[] { "faction.friendly", "faction.neutral", "faction.unfriendly" }, this.availabitily.faction2Stance.ordinal()));
        this.addButton(new GuiNpcButton(25, this.guiLeft + 118, this.guiTop + 126, 110, 20, "availability.selectfaction"));
        this.getButton(25).setEnabled(this.availabitily.faction2Available != EnumAvailabilityFactionType.Always);
        this.getButton(27).setEnabled(this.availabitily.faction2Available != EnumAvailabilityFactionType.Always);
        this.addButton(new GuiNpcButton(26, this.guiLeft + 230, this.guiTop + 126, 20, 20, "X"));
        this.addLabel(new GuiNpcLabel(50, "availability.daytime", this.guiLeft + 4, this.guiTop + 153));
        this.addButton(new GuiNpcButton(50, this.guiLeft + 50, this.guiTop + 148, 150, 20, new String[] { "availability.wholeday", "availability.night", "availability.day" }, this.availabitily.daytime.ordinal()));
        this.addLabel(new GuiNpcLabel(51, "availability.minlevel", this.guiLeft + 4, this.guiTop + 175));
        this.addTextField(new GuiNpcTextField(51, this, this.fontRendererObj, this.guiLeft + 50, this.guiTop + 170, 90, 20, this.availabitily.minPlayerLevel + ""));
        this.getTextField(51).numbersOnly = true;
        this.getTextField(51).setMinMaxDefault(0, Integer.MAX_VALUE, 0);
        this.addButton(new GuiNpcButton(66, this.guiLeft + 82, this.guiTop + 192, 98, 20, "gui.done"));
        this.updateGuiButtons();
    }
    
    private void updateGuiButtons() {
        if (this.availabitily.factionId >= 0) {
            Client.sendData(EnumPacketServer.FactionGet, this.availabitily.factionId);
        }
        if (this.availabitily.faction2Id >= 0) {
            Client.sendData(EnumPacketServer.FactionGet, this.availabitily.faction2Id);
        }
    }
    
    @Override
    protected void actionPerformed(final GuiButton guibutton) {
        final GuiNpcButton button = (GuiNpcButton)guibutton;
        if (button.id == 0) {
            this.setSubGui(new SubGuiNpcAvailabilityDialog(this.availabitily));
        }
        if (button.id == 1) {
            this.setSubGui(new SubGuiNpcAvailabilityQuest(this.availabitily));
        }
        if (button.id == 20) {
            this.availabitily.setFactionAvailability(button.getValue());
            if (this.availabitily.factionAvailable == EnumAvailabilityFactionType.Always) {
                this.availabitily.factionId = -1;
            }
            this.initGui();
        }
        if (button.id == 24) {
            this.availabitily.setFaction2Availability(button.getValue());
            if (this.availabitily.faction2Available == EnumAvailabilityFactionType.Always) {
                this.availabitily.faction2Id = -1;
            }
            this.initGui();
        }
        if (button.id == 21) {
            this.slot = 1;
            final GuiNPCFactionSelection gui = new GuiNPCFactionSelection(this.npc, this.getParent(), this.availabitily.factionId);
            gui.listener = this;
            NoppesUtil.openGUI((EntityPlayer)this.player, gui);
        }
        if (button.id == 25) {
            this.slot = 2;
            final GuiNPCFactionSelection gui = new GuiNPCFactionSelection(this.npc, this.getParent(), this.availabitily.faction2Id);
            gui.listener = this;
            NoppesUtil.openGUI((EntityPlayer)this.player, gui);
        }
        if (button.id == 22) {
            this.availabitily.setFactionAvailabilityStance(button.getValue());
        }
        if (button.id == 27) {
            this.availabitily.setFaction2AvailabilityStance(button.getValue());
        }
        if (button.id == 23) {
            this.availabitily.factionId = -1;
            this.getButton(21).setDisplayText("availability.selectfaction");
        }
        if (button.id == 26) {
            this.availabitily.faction2Id = -1;
            this.getButton(25).setDisplayText("availability.selectfaction");
        }
        if (button.id == 50) {
            this.availabitily.daytime = EnumDayTime.values()[button.getValue()];
        }
        if (button.id == 66) {
            this.close();
        }
    }
    
    @Override
    public void selected(final int id, final String name) {
        if (this.slot == 1) {
            this.availabitily.factionId = id;
        }
        if (this.slot == 2) {
            this.availabitily.faction2Id = id;
        }
    }
    
    @Override
    public void setGuiData(final NBTTagCompound compound) {
        if (compound.hasKey("Slot")) {
            final Faction faction = new Faction();
            faction.readNBT(compound);
            if (this.availabitily.factionId == faction.id) {
                this.getButton(21).setDisplayText(faction.name);
            }
            if (this.availabitily.faction2Id == faction.id) {
                this.getButton(25).setDisplayText(faction.name);
            }
        }
    }
    
    @Override
    public void unFocused(final GuiNpcTextField textfield) {
        if (textfield.id == 51) {
            this.availabitily.minPlayerLevel = textfield.getInteger();
        }
    }
}
