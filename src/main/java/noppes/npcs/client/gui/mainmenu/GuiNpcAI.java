// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.gui.mainmenu;

import net.minecraft.nbt.NBTTagCompound;
import noppes.npcs.client.gui.util.SubGuiInterface;
import noppes.npcs.client.gui.SubGuiNpcMovement;
import net.minecraft.client.gui.GuiButton;
import noppes.npcs.constants.EnumNavType;
import net.minecraft.client.gui.GuiScreen;
import noppes.npcs.client.gui.util.GuiNpcTextField;
import noppes.npcs.client.gui.util.GuiNpcButton;
import noppes.npcs.client.gui.util.GuiNpcLabel;
import noppes.npcs.client.Client;
import noppes.npcs.constants.EnumPacketServer;
import noppes.npcs.entity.EntityNPCInterface;
import noppes.npcs.DataAI;
import noppes.npcs.client.gui.util.IGuiData;
import noppes.npcs.client.gui.util.ITextfieldListener;
import noppes.npcs.client.gui.util.GuiNPCInterface2;

public class GuiNpcAI extends GuiNPCInterface2 implements ITextfieldListener, IGuiData
{
    private DataAI ai;
    
    public GuiNpcAI(final EntityNPCInterface npc) {
        super(npc, 6);
        this.ai = npc.ai;
        Client.sendData(EnumPacketServer.MainmenuAIGet, new Object[0]);
    }
    
    @Override
    public void initGui() {
        super.initGui();
        this.addLabel(new GuiNpcLabel(0, "ai.enemyresponse", this.guiLeft + 5, this.guiTop + 17));
        this.addButton(new GuiNpcButton(0, this.guiLeft + 86, this.guiTop + 10, 60, 20, new String[] { "gui.retaliate", "gui.panic", "gui.retreat", "gui.nothing" }, this.npc.ai.onAttack));
        this.addLabel(new GuiNpcLabel(1, "ai.door", this.guiLeft + 5, this.guiTop + 40));
        this.addButton(new GuiNpcButton(1, this.guiLeft + 86, this.guiTop + 35, 60, 20, new String[] { "gui.break", "gui.open", "gui.disabled" }, this.npc.ai.doorInteract));
        this.addLabel(new GuiNpcLabel(12, "ai.swim", this.guiLeft + 5, this.guiTop + 65));
        this.addButton(new GuiNpcButton(7, this.guiLeft + 86, this.guiTop + 60, 60, 20, new String[] { "gui.no", "gui.yes" }, (int)(this.npc.ai.canSwim ? 1 : 0)));
        this.addLabel(new GuiNpcLabel(13, "ai.shelter", this.guiLeft + 5, this.guiTop + 90));
        this.addButton(new GuiNpcButton(9, this.guiLeft + 86, this.guiTop + 85, 60, 20, new String[] { "gui.darkness", "gui.sunlight", "gui.disabled" }, this.npc.ai.findShelter));
        this.addLabel(new GuiNpcLabel(14, "ai.clearlos", this.guiLeft + 5, this.guiTop + 115));
        this.addButton(new GuiNpcButton(10, this.guiLeft + 86, this.guiTop + 110, 60, 20, new String[] { "gui.no", "gui.yes" }, (int)(this.npc.ai.directLOS ? 1 : 0)));
        this.addLabel(new GuiNpcLabel(18, "ai.sprint", this.guiLeft + 5, this.guiTop + 140));
        this.addButton(new GuiNpcButton(16, this.guiLeft + 86, this.guiTop + 135, 60, 20, new String[] { "gui.no", "gui.yes" }, (int)(this.npc.ai.canSprint ? 1 : 0)));
        this.addLabel(new GuiNpcLabel(10, "ai.avoidwater", this.guiLeft + 150, this.guiTop + 17));
        this.addButton(new GuiNpcButton(5, this.guiLeft + 230, this.guiTop + 10, 60, 20, new String[] { "gui.no", "gui.yes" }, (int)(this.npc.ai.avoidsWater ? 1 : 0)));
        this.addLabel(new GuiNpcLabel(11, "ai.return", this.guiLeft + 150, this.guiTop + 40));
        this.addButton(new GuiNpcButton(6, this.guiLeft + 230, this.guiTop + 35, 60, 20, new String[] { "gui.no", "gui.yes" }, (int)(this.npc.ai.returnToStart ? 1 : 0)));
        this.addLabel(new GuiNpcLabel(17, "ai.leapattarget", this.guiLeft + 150, this.guiTop + 65));
        this.addButton(new GuiNpcButton(15, this.guiLeft + 230, this.guiTop + 60, 60, 20, new String[] { "gui.no", "gui.yes" }, (int)(this.npc.ai.canLeap ? 1 : 0)));
        this.addLabel(new GuiNpcLabel(15, "ai.indirect", this.guiLeft + 150, this.guiTop + 90));
        this.addButton(new GuiNpcButton(13, this.guiLeft + 230, this.guiTop + 85, 60, 20, new String[] { "gui.no", "gui.whendistant", "gui.whenhidden" }, this.ai.canFireIndirect));
        this.addLabel(new GuiNpcLabel(16, "ai.rangemelee", this.guiLeft + 150, this.guiTop + 115));
        this.addButton(new GuiNpcButton(14, this.guiLeft + 230, this.guiTop + 110, 60, 20, new String[] { (this.npc.inventory.getProjectile() == null) ? "gui.no" : "gui.always", "gui.untilclose", "gui.whenavailable" }, this.ai.useRangeMelee));
        if (this.ai.useRangeMelee >= 1) {
            this.addLabel(new GuiNpcLabel(20, "gui.minrange", this.guiLeft + 300, this.guiTop + 115));
            this.addTextField(new GuiNpcTextField(6, this, this.fontRendererObj, this.guiLeft + 380, this.guiTop + 110, 30, 20, this.ai.distanceToMelee + ""));
            this.getTextField(6).numbersOnly = true;
            this.getTextField(6).setMinMaxDefault(1, this.npc.stats.aggroRange, 5);
        }
        this.addLabel(new GuiNpcLabel(19, "ai.tacticalvariant", this.guiLeft + 150, this.guiTop + 140));
        this.addButton(new GuiNpcButton(17, this.guiLeft + 230, this.guiTop + 135, 60, 20, EnumNavType.names(), this.ai.tacticalVariant.ordinal()));
        if (this.ai.tacticalVariant != EnumNavType.Default && this.ai.tacticalVariant != EnumNavType.None) {
            String label = "";
            switch (this.ai.tacticalVariant) {
                case Surround: {
                    label = "gui.orbitdistance";
                    break;
                }
                case HitNRun: {
                    label = "gui.fightifthisclose";
                    break;
                }
                case Ambush: {
                    label = "gui.ambushdistance";
                    break;
                }
                case Stalk: {
                    label = "gui.ambushdistance";
                    break;
                }
                default: {
                    label = "gui.engagedistance";
                    break;
                }
            }
            this.addLabel(new GuiNpcLabel(21, label, this.guiLeft + 300, this.guiTop + 140));
            this.addTextField(new GuiNpcTextField(3, this, this.fontRendererObj, this.guiLeft + 380, this.guiTop + 135, 30, 20, this.ai.tacticalRadius + ""));
            this.getTextField(3).numbersOnly = true;
            this.getTextField(3).setMinMaxDefault(1, this.npc.stats.aggroRange, 5);
        }
        this.addLabel(new GuiNpcLabel(22, "ai.cobwebAffected", this.guiLeft + 150, this.guiTop + 165));
        this.addButton(new GuiNpcButton(22, this.guiLeft + 230, this.guiTop + 160, 60, 20, new String[] { "gui.no", "gui.yes" }, (int)(this.npc.ai.ignoreCobweb ? 0 : 1)));
        this.getButton(17).setEnabled(this.ai.onAttack == 0);
        this.getButton(15).setEnabled(this.ai.onAttack == 0);
        this.getButton(13).setEnabled(this.npc.inventory.getProjectile() != null);
        this.getButton(14).setEnabled(this.npc.inventory.getProjectile() != null);
        this.getButton(10).setEnabled(this.ai.tacticalVariant != EnumNavType.Stalk || this.ai.tacticalVariant != EnumNavType.None);
        this.addLabel(new GuiNpcLabel(2, "ai.movement", this.guiLeft + 4, this.guiTop + 165));
        this.addButton(new GuiNpcButton(2, this.guiLeft + 86, this.guiTop + 160, 60, 20, "selectServer.edit"));
    }
    
    @Override
    public void unFocused(final GuiNpcTextField textfield) {
        if (textfield.id == 3) {
            this.ai.tacticalRadius = textfield.getInteger();
        }
        if (textfield.id == 6) {
            this.ai.distanceToMelee = textfield.getInteger();
        }
    }
    
    @Override
    protected void actionPerformed(final GuiButton guibutton) {
        final GuiNpcButton button = (GuiNpcButton)guibutton;
        if (button.id == 0) {
            this.ai.onAttack = button.getValue();
            this.initGui();
        }
        else if (button.id == 1) {
            this.ai.doorInteract = button.getValue();
        }
        else if (button.id == 2) {
            this.setSubGui(new SubGuiNpcMovement(this.ai));
        }
        else if (button.id == 5) {
            this.npc.setAvoidWater(button.getValue() == 1);
        }
        else if (button.id == 6) {
            this.ai.returnToStart = (button.getValue() == 1);
        }
        else if (button.id == 7) {
            this.ai.canSwim = (button.getValue() == 1);
        }
        else if (button.id == 9) {
            this.ai.findShelter = button.getValue();
        }
        else if (button.id == 10) {
            this.ai.directLOS = (button.getValue() == 1);
        }
        else if (button.id == 13) {
            this.ai.canFireIndirect = button.getValue();
        }
        else if (button.id == 14) {
            this.ai.useRangeMelee = button.getValue();
            this.initGui();
        }
        else if (button.id == 15) {
            this.ai.canLeap = (button.getValue() == 1);
        }
        else if (button.id == 16) {
            this.ai.canSprint = (button.getValue() == 1);
        }
        else if (button.id == 17) {
            this.ai.tacticalVariant = EnumNavType.values()[button.getValue()];
            this.ai.directLOS = (EnumNavType.values()[button.getValue()] != EnumNavType.Stalk && this.ai.directLOS);
            this.initGui();
        }
        else if (button.id == 22) {
            this.ai.ignoreCobweb = (button.getValue() == 0);
        }
    }
    
    @Override
    public void save() {
        Client.sendData(EnumPacketServer.MainmenuAISave, this.ai.writeToNBT(new NBTTagCompound()));
    }
    
    @Override
    public void setGuiData(final NBTTagCompound compound) {
        this.ai.readToNBT(compound);
        this.initGui();
    }
}
