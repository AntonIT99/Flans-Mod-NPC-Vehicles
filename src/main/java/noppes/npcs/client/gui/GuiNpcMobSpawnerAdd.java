// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.gui;

import noppes.npcs.client.Client;
import noppes.npcs.constants.EnumPacketServer;
import net.minecraft.client.gui.GuiYesNo;
import net.minecraft.command.ICommandSender;
import noppes.npcs.client.controllers.ClientCloneController;
import net.minecraft.client.gui.GuiButton;
import noppes.npcs.client.gui.util.GuiNpcButton;
import net.minecraft.client.gui.GuiScreen;
import noppes.npcs.client.gui.util.GuiNpcTextField;
import noppes.npcs.client.gui.util.GuiNpcLabel;
import net.minecraft.world.World;
import net.minecraft.entity.EntityList;
import net.minecraft.client.Minecraft;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.entity.Entity;
import noppes.npcs.client.gui.util.IGuiData;
import net.minecraft.client.gui.GuiYesNoCallback;
import noppes.npcs.client.gui.util.GuiNPCInterface;

public class GuiNpcMobSpawnerAdd extends GuiNPCInterface implements GuiYesNoCallback, IGuiData
{
    private Entity toClone;
    private NBTTagCompound compound;
    private static boolean serverSide;
    private static int tab;
    
    public GuiNpcMobSpawnerAdd(final NBTTagCompound compound) {
        this.toClone = EntityList.createEntityFromNBT(compound, (World)Minecraft.getMinecraft().theWorld);
        this.compound = compound;
        this.setBackground("menubg.png");
        this.xSize = 256;
        this.ySize = 216;
    }
    
    @Override
    public void initGui() {
        super.initGui();
        final String name = this.toClone.getCommandSenderName();
        this.addLabel(new GuiNpcLabel(0, "Save as", this.guiLeft + 4, this.guiTop + 6));
        this.addTextField(new GuiNpcTextField(0, this, this.fontRendererObj, this.guiLeft + 4, this.guiTop + 18, 200, 20, name));
        this.addLabel(new GuiNpcLabel(1, "Tab", this.guiLeft + 10, this.guiTop + 50));
        this.addButton(new GuiNpcButton(2, this.guiLeft + 40, this.guiTop + 45, 20, 20, new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9" }, GuiNpcMobSpawnerAdd.tab - 1));
        this.addButton(new GuiNpcButton(3, this.guiLeft + 4, this.guiTop + 95, new String[] { "Client side", "Server side" }, (int)(GuiNpcMobSpawnerAdd.serverSide ? 1 : 0)));
        this.addButton(new GuiNpcButton(0, this.guiLeft + 4, this.guiTop + 70, 80, 20, "gui.save"));
        this.addButton(new GuiNpcButton(1, this.guiLeft + 86, this.guiTop + 70, 80, 20, "gui.cancel"));
    }
    
    @Override
    public void buttonEvent(final GuiButton guibutton) {
        final int id = guibutton.id;
        if (id == 0) {
            final String name = this.getTextField(0).getText();
            if (name.isEmpty()) {
                return;
            }
            final int tab = ((GuiNpcButton)guibutton).getValue() + 1;
            if (!GuiNpcMobSpawnerAdd.serverSide) {
                if (ClientCloneController.Instance.getCloneData(null, name, tab) != null) {
                    this.displayGuiScreen((GuiScreen)new GuiYesNo((GuiYesNoCallback)this, "Warning", "You are about to overwrite a clone", 1));
                }
                else {
                    this.confirmClicked(true, 0);
                }
            }
            else {
                Client.sendData(EnumPacketServer.ClonePreSave, name, tab);
            }
        }
        if (id == 1) {
            this.close();
        }
        if (id == 2) {
            GuiNpcMobSpawnerAdd.tab = ((GuiNpcButton)guibutton).getValue() + 1;
        }
        if (id == 3) {
            GuiNpcMobSpawnerAdd.serverSide = (((GuiNpcButton)guibutton).getValue() == 1);
        }
    }
    
    public void confirmClicked(final boolean confirm, final int id) {
        if (confirm) {
            final String name = this.getTextField(0).getText();
            if (!GuiNpcMobSpawnerAdd.serverSide) {
                ClientCloneController.Instance.addClone(this.compound, name, GuiNpcMobSpawnerAdd.tab);
            }
            else {
                Client.sendData(EnumPacketServer.CloneSave, name, GuiNpcMobSpawnerAdd.tab);
            }
            this.close();
        }
        else {
            this.displayGuiScreen(this);
        }
    }
    
    @Override
    public void save() {
    }
    
    public void setGuiData(final NBTTagCompound compound) {
        if (compound.hasKey("NameExists")) {
            if (compound.getBoolean("NameExists")) {
                this.displayGuiScreen((GuiScreen)new GuiYesNo((GuiYesNoCallback)this, "Warning", "You are about to overwrite a clone", 1));
            }
            else {
                this.confirmClicked(true, 0);
            }
        }
    }
    
    static {
        GuiNpcMobSpawnerAdd.serverSide = false;
        GuiNpcMobSpawnerAdd.tab = 1;
    }
}
