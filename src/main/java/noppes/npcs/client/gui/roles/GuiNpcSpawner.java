// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.gui.roles;

import noppes.npcs.client.Client;
import noppes.npcs.constants.EnumPacketServer;
import net.minecraft.nbt.NBTTagCompound;
import noppes.npcs.client.gui.util.SubGuiInterface;
import noppes.npcs.client.gui.GuiNpcMobSpawnerSelector;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import noppes.npcs.client.gui.util.GuiNpcTextField;
import net.minecraft.util.StatCollector;
import noppes.npcs.client.gui.util.GuiNpcLabel;
import noppes.npcs.client.gui.util.GuiNpcButton;
import noppes.npcs.entity.EntityNPCInterface;
import noppes.npcs.roles.JobSpawner;
import noppes.npcs.client.gui.util.IGuiData;
import noppes.npcs.client.gui.util.ITextfieldListener;
import noppes.npcs.client.gui.util.GuiNPCInterface2;

public class GuiNpcSpawner extends GuiNPCInterface2 implements ITextfieldListener, IGuiData
{
    private JobSpawner job;
    private int slot;
    public String title1;
    public String title2;
    public String title3;
    public String title4;
    public String title5;
    public String title6;
    
    public GuiNpcSpawner(final EntityNPCInterface npc) {
        super(npc);
        this.slot = -1;
        this.title1 = "gui.selectnpc";
        this.title2 = "gui.selectnpc";
        this.title3 = "gui.selectnpc";
        this.title4 = "gui.selectnpc";
        this.title5 = "gui.selectnpc";
        this.title6 = "gui.selectnpc";
        this.job = (JobSpawner)npc.jobInterface;
    }
    
    @Override
    public void initGui() {
        super.initGui();
        int y = this.guiTop + 6;
        this.addButton(new GuiNpcButton(20, this.guiLeft + 25, y, 20, 20, "X"));
        this.addLabel(new GuiNpcLabel(0, "1:", this.guiLeft + 4, y + 5));
        this.addButton(new GuiNpcButton(0, this.guiLeft + 50, y, this.title1));
        y += 23;
        this.addButton(new GuiNpcButton(21, this.guiLeft + 25, y, 20, 20, "X"));
        this.addLabel(new GuiNpcLabel(1, "2:", this.guiLeft + 4, y + 5));
        this.addButton(new GuiNpcButton(1, this.guiLeft + 50, y, this.title2));
        y += 23;
        this.addButton(new GuiNpcButton(22, this.guiLeft + 25, y, 20, 20, "X"));
        this.addLabel(new GuiNpcLabel(2, "3:", this.guiLeft + 4, y + 5));
        this.addButton(new GuiNpcButton(2, this.guiLeft + 50, y, this.title3));
        y += 23;
        this.addButton(new GuiNpcButton(23, this.guiLeft + 25, y, 20, 20, "X"));
        this.addLabel(new GuiNpcLabel(3, "4:", this.guiLeft + 4, y + 5));
        this.addButton(new GuiNpcButton(3, this.guiLeft + 50, y, this.title4));
        y += 23;
        this.addButton(new GuiNpcButton(24, this.guiLeft + 25, y, 20, 20, "X"));
        this.addLabel(new GuiNpcLabel(4, "5:", this.guiLeft + 4, y + 5));
        this.addButton(new GuiNpcButton(4, this.guiLeft + 50, y, this.title5));
        y += 23;
        this.addButton(new GuiNpcButton(25, this.guiLeft + 25, y, 20, 20, "X"));
        this.addLabel(new GuiNpcLabel(5, "6:", this.guiLeft + 4, y + 5));
        this.addButton(new GuiNpcButton(5, this.guiLeft + 50, y, this.title6));
        y += 23;
        this.addLabel(new GuiNpcLabel(6, "spawner.diesafter", this.guiLeft + 4, y + 5));
        this.addButton(new GuiNpcButton(26, this.guiLeft + 115, y, 40, 20, new String[] { "gui.yes", "gui.no" }, (int)(this.job.doesntDie ? 1 : 0)));
        this.addLabel(new GuiNpcLabel(11, "spawner.despawn", this.guiLeft + 170, y + 5));
        this.addButton(new GuiNpcButton(11, this.guiLeft + 335, y, 40, 20, new String[] { "gui.no", "gui.yes" }, (int)(this.job.despawnOnTargetLost ? 1 : 0)));
        y += 23;
        this.addLabel(new GuiNpcLabel(7, StatCollector.translateToLocal("spawner.posoffset") + " X:", this.guiLeft + 4, y + 5));
        this.addTextField(new GuiNpcTextField(7, this, this.fontRendererObj, this.guiLeft + 99, y, 24, 20, this.job.xOffset + ""));
        this.getTextField(7).numbersOnly = true;
        this.getTextField(7).setMinMaxDefault(-9, 9, 0);
        this.addLabel(new GuiNpcLabel(8, "Y:", this.guiLeft + 125, y + 5));
        this.addTextField(new GuiNpcTextField(8, this, this.fontRendererObj, this.guiLeft + 135, y, 24, 20, this.job.yOffset + ""));
        this.getTextField(8).numbersOnly = true;
        this.getTextField(8).setMinMaxDefault(-9, 9, 0);
        this.addLabel(new GuiNpcLabel(9, "Z:", this.guiLeft + 161, y + 5));
        this.addTextField(new GuiNpcTextField(9, this, this.fontRendererObj, this.guiLeft + 171, y, 24, 20, this.job.zOffset + ""));
        this.getTextField(9).numbersOnly = true;
        this.getTextField(9).setMinMaxDefault(-9, 9, 0);
        y += 23;
        this.addLabel(new GuiNpcLabel(10, "spawner.type", this.guiLeft + 4, y + 5));
        this.addButton(new GuiNpcButton(10, this.guiLeft + 80, y, 100, 20, new String[] { "spawner.one", "spawner.all", "spawner.random" }, this.job.spawnType));
    }
    
    @Override
    public void elementClicked() {
    }
    
    @Override
    protected void actionPerformed(final GuiButton guibutton) {
        final GuiNpcButton button = (GuiNpcButton)guibutton;
        if (button.id >= 0 && button.id < 6) {
            this.slot = button.id + 1;
            this.setSubGui(new GuiNpcMobSpawnerSelector());
        }
        if (button.id >= 20 && button.id < 26) {
            this.job.setJobCompound(button.id - 19, null);
            Client.sendData(EnumPacketServer.JobSpawnerRemove, button.id - 19);
        }
        if (button.id == 26) {
            this.job.doesntDie = (button.getValue() == 1);
        }
        if (button.id == 10) {
            this.job.spawnType = button.getValue();
        }
        if (button.id == 11) {
            this.job.despawnOnTargetLost = (button.getValue() == 1);
        }
    }
    
    @Override
    public void closeSubGui(final SubGuiInterface gui) {
        super.closeSubGui(gui);
        final GuiNpcMobSpawnerSelector selector = (GuiNpcMobSpawnerSelector)gui;
        if (selector.isServer) {
            final String selected = selector.getSelected();
            if (selected != null) {
                Client.sendData(EnumPacketServer.JobSpawnerAdd, selector.isServer, selected, selector.activeTab, this.slot);
            }
        }
        else {
            final NBTTagCompound compound = selector.getCompound();
            if (compound != null) {
                this.job.setJobCompound(this.slot, compound);
                Client.sendData(EnumPacketServer.JobSpawnerAdd, selector.isServer, this.slot, compound);
            }
        }
        this.initGui();
    }
    
    @Override
    public void save() {
        final NBTTagCompound compound = this.job.writeToNBT(new NBTTagCompound());
        this.job.cleanCompound(compound);
        Client.sendData(EnumPacketServer.JobSave, compound);
    }
    
    @Override
    public void unFocused(final GuiNpcTextField textfield) {
        if (textfield.id == 7) {
            this.job.xOffset = textfield.getInteger();
        }
        if (textfield.id == 8) {
            this.job.yOffset = textfield.getInteger();
        }
        if (textfield.id == 9) {
            this.job.zOffset = textfield.getInteger();
        }
    }
    
    @Override
    public void setGuiData(final NBTTagCompound compound) {
        this.title1 = compound.getString("Title1");
        this.title2 = compound.getString("Title2");
        this.title3 = compound.getString("Title3");
        this.title4 = compound.getString("Title4");
        this.title5 = compound.getString("Title5");
        this.title6 = compound.getString("Title6");
        this.initGui();
    }
}
