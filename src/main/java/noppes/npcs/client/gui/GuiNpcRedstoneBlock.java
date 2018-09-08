// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.gui;

import noppes.npcs.client.Client;
import noppes.npcs.constants.EnumPacketServer;
import net.minecraft.nbt.NBTTagCompound;
import noppes.npcs.client.gui.util.SubGuiInterface;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import noppes.npcs.client.gui.util.GuiNpcTextField;
import net.minecraft.util.StatCollector;
import noppes.npcs.client.gui.util.GuiNpcLabel;
import noppes.npcs.client.gui.util.GuiNpcButton;
import noppes.npcs.blocks.tiles.TileRedstoneBlock;
import noppes.npcs.client.gui.util.GuiNPCInterface;

public class GuiNpcRedstoneBlock extends GuiNPCInterface
{
    private TileRedstoneBlock tile;
    
    public GuiNpcRedstoneBlock(final int x, final int y, final int z) {
        this.tile = (TileRedstoneBlock)this.player.worldObj.getTileEntity(x, y, z);
    }
    
    @Override
    public void initGui() {
        super.initGui();
        this.addButton(new GuiNpcButton(4, this.guiLeft + 40, this.guiTop + 20, 120, 20, "availability.options"));
        this.addLabel(new GuiNpcLabel(11, "gui.detailed", this.guiLeft + 40, this.guiTop + 47, 16777215));
        this.addButton(new GuiNpcButton(1, this.guiLeft + 110, this.guiTop + 42, 50, 20, new String[] { "gui.no", "gui.yes" }, (int)(this.tile.isDetailed ? 1 : 0)));
        if (this.tile.isDetailed) {
            this.addLabel(new GuiNpcLabel(0, StatCollector.translateToLocal("bard.ondistance") + " X:", this.guiLeft + 1, this.guiTop + 76, 16777215));
            this.addTextField(new GuiNpcTextField(0, this, this.fontRendererObj, this.guiLeft + 80, this.guiTop + 71, 30, 20, this.tile.onRangeX + ""));
            this.getTextField(0).numbersOnly = true;
            this.getTextField(0).setMinMaxDefault(0, 50, 6);
            this.addLabel(new GuiNpcLabel(1, "Y:", this.guiLeft + 113, this.guiTop + 76, 16777215));
            this.addTextField(new GuiNpcTextField(1, this, this.fontRendererObj, this.guiLeft + 122, this.guiTop + 71, 30, 20, this.tile.onRangeY + ""));
            this.getTextField(1).numbersOnly = true;
            this.getTextField(1).setMinMaxDefault(0, 50, 6);
            this.addLabel(new GuiNpcLabel(2, "Z:", this.guiLeft + 155, this.guiTop + 76, 16777215));
            this.addTextField(new GuiNpcTextField(2, this, this.fontRendererObj, this.guiLeft + 164, this.guiTop + 71, 30, 20, this.tile.onRangeZ + ""));
            this.getTextField(2).numbersOnly = true;
            this.getTextField(2).setMinMaxDefault(0, 50, 6);
            this.addLabel(new GuiNpcLabel(3, StatCollector.translateToLocal("bard.offdistance") + " X:", this.guiLeft - 3, this.guiTop + 99, 16777215));
            this.addTextField(new GuiNpcTextField(3, this, this.fontRendererObj, this.guiLeft + 80, this.guiTop + 94, 30, 20, this.tile.offRangeX + ""));
            this.getTextField(3).numbersOnly = true;
            this.getTextField(3).setMinMaxDefault(0, 50, 10);
            this.addLabel(new GuiNpcLabel(4, "Y:", this.guiLeft + 113, this.guiTop + 99, 16777215));
            this.addTextField(new GuiNpcTextField(4, this, this.fontRendererObj, this.guiLeft + 122, this.guiTop + 94, 30, 20, this.tile.offRangeY + ""));
            this.getTextField(4).numbersOnly = true;
            this.getTextField(4).setMinMaxDefault(0, 50, 10);
            this.addLabel(new GuiNpcLabel(5, "Z:", this.guiLeft + 155, this.guiTop + 99, 16777215));
            this.addTextField(new GuiNpcTextField(5, this, this.fontRendererObj, this.guiLeft + 164, this.guiTop + 94, 30, 20, this.tile.offRangeZ + ""));
            this.getTextField(5).numbersOnly = true;
            this.getTextField(5).setMinMaxDefault(0, 50, 10);
        }
        else {
            this.addLabel(new GuiNpcLabel(0, "bard.ondistance", this.guiLeft + 1, this.guiTop + 76, 16777215));
            this.addTextField(new GuiNpcTextField(0, this, this.fontRendererObj, this.guiLeft + 80, this.guiTop + 71, 30, 20, this.tile.onRange + ""));
            this.getTextField(0).numbersOnly = true;
            this.getTextField(0).setMinMaxDefault(0, 50, 6);
            this.addLabel(new GuiNpcLabel(3, "bard.offdistance", this.guiLeft - 3, this.guiTop + 99, 16777215));
            this.addTextField(new GuiNpcTextField(3, this, this.fontRendererObj, this.guiLeft + 80, this.guiTop + 94, 30, 20, this.tile.offRange + ""));
            this.getTextField(3).numbersOnly = true;
            this.getTextField(3).setMinMaxDefault(0, 50, 10);
        }
        this.addButton(new GuiNpcButton(0, this.guiLeft + 40, this.guiTop + 190, 120, 20, "Done"));
    }
    
    @Override
    protected void actionPerformed(final GuiButton guibutton) {
        final int id = guibutton.id;
        if (id == 0) {
            this.close();
        }
        if (id == 1) {
            this.tile.isDetailed = (((GuiNpcButton)guibutton).getValue() == 1);
            this.initGui();
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
        if (this.tile.isDetailed) {
            this.tile.onRangeX = this.getTextField(0).getInteger();
            this.tile.onRangeY = this.getTextField(1).getInteger();
            this.tile.onRangeZ = this.getTextField(2).getInteger();
            this.tile.offRangeX = this.getTextField(3).getInteger();
            this.tile.offRangeY = this.getTextField(4).getInteger();
            this.tile.offRangeZ = this.getTextField(5).getInteger();
            if (this.tile.onRangeX > this.tile.offRangeX) {
                this.tile.offRangeX = this.tile.onRangeX;
            }
            if (this.tile.onRangeY > this.tile.offRangeY) {
                this.tile.offRangeY = this.tile.onRangeY;
            }
            if (this.tile.onRangeZ > this.tile.offRangeZ) {
                this.tile.offRangeZ = this.tile.onRangeZ;
            }
        }
        else {
            this.tile.onRange = this.getTextField(0).getInteger();
            this.tile.offRange = this.getTextField(3).getInteger();
            if (this.tile.onRange > this.tile.offRange) {
                this.tile.offRange = this.tile.onRange;
            }
        }
        this.tile.isActivated = false;
        final NBTTagCompound compound = new NBTTagCompound();
        this.tile.writeToNBT(compound);
        Client.sendData(EnumPacketServer.SaveTileEntity, compound);
    }
}
