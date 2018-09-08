// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.gui;

import net.minecraft.nbt.NBTTagCompound;
import noppes.npcs.client.gui.util.SubGuiInterface;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import noppes.npcs.client.gui.util.GuiNpcTextField;
import noppes.npcs.client.gui.util.GuiNpcLabel;
import noppes.npcs.client.gui.util.GuiNpcButton;
import noppes.npcs.client.Client;
import noppes.npcs.constants.EnumPacketServer;
import noppes.npcs.blocks.tiles.TileBorder;
import noppes.npcs.client.gui.util.IGuiData;
import noppes.npcs.client.gui.util.GuiNPCInterface;

public class GuiBorderBlock extends GuiNPCInterface implements IGuiData
{
    private TileBorder tile;
    
    public GuiBorderBlock(final int x, final int y, final int z) {
        this.tile = (TileBorder)this.player.worldObj.getTileEntity(x, y, z);
        Client.sendData(EnumPacketServer.GetTileEntity, x, y, z);
    }
    
    @Override
    public void initGui() {
        super.initGui();
        this.addButton(new GuiNpcButton(4, this.guiLeft + 40, this.guiTop + 40, 120, 20, "Availability Options"));
        this.addLabel(new GuiNpcLabel(0, "Height", this.guiLeft + 1, this.guiTop + 76, 16777215));
        this.addTextField(new GuiNpcTextField(0, this, this.fontRendererObj, this.guiLeft + 60, this.guiTop + 71, 40, 20, this.tile.height + ""));
        this.getTextField(0).numbersOnly = true;
        this.getTextField(0).setMinMaxDefault(0, 500, 6);
        this.addLabel(new GuiNpcLabel(1, "Message", this.guiLeft + 1, this.guiTop + 100, 16777215));
        this.addTextField(new GuiNpcTextField(1, this, this.fontRendererObj, this.guiLeft + 60, this.guiTop + 95, 200, 20, this.tile.message));
        this.addButton(new GuiNpcButton(0, this.guiLeft + 40, this.guiTop + 190, 120, 20, "Done"));
    }
    
    @Override
    protected void actionPerformed(final GuiButton guibutton) {
        final int id = guibutton.id;
        if (id == 0) {
            this.close();
        }
        if (id == 4) {
            this.save();
            this.setSubGui(new SubGuiNpcAvailability(this.tile.availability));
        }
    }
    
    @Override
    public void save() {
        if (this.tile == null) {
            return;
        }
        this.tile.height = this.getTextField(0).getInteger();
        this.tile.message = this.getTextField(1).getText();
        final NBTTagCompound compound = new NBTTagCompound();
        this.tile.writeToNBT(compound);
        Client.sendData(EnumPacketServer.SaveTileEntity, compound);
    }
    
    @Override
    public void setGuiData(final NBTTagCompound compound) {
        this.tile.readFromNBT(compound);
    }
}
