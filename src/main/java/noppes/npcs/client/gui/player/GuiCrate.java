// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.gui.player;

import org.lwjgl.opengl.GL11;
import noppes.npcs.client.CustomNpcResourceListener;
import net.minecraft.client.resources.I18n;
import net.minecraft.inventory.Container;
import noppes.npcs.containers.ContainerCrate;
import net.minecraft.inventory.IInventory;
import net.minecraft.util.ResourceLocation;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.gui.inventory.GuiContainer;

@SideOnly(Side.CLIENT)
public class GuiCrate extends GuiContainer
{
    private static final ResourceLocation field_147017_u;
    private IInventory upperChestInventory;
    private IInventory lowerChestInventory;
    private int inventoryRows;
    
    public GuiCrate(final ContainerCrate container) {
        super((Container)container);
        this.upperChestInventory = container.upperChestInventory;
        this.lowerChestInventory = container.lowerChestInventory;
        this.allowUserInput = false;
        final short short1 = 222;
        final int i = short1 - 108;
        this.inventoryRows = this.lowerChestInventory.getSizeInventory() / 9;
        this.ySize = i + this.inventoryRows * 18;
    }
    
    protected void drawGuiContainerForegroundLayer(final int p_146979_1_, final int p_146979_2_) {
        this.fontRendererObj.drawString(this.lowerChestInventory.hasCustomInventoryName() ? this.lowerChestInventory.getInventoryName() : I18n.format(this.lowerChestInventory.getInventoryName(), new Object[0]), 8, 6, CustomNpcResourceListener.DefaultTextColor);
        this.fontRendererObj.drawString(this.upperChestInventory.hasCustomInventoryName() ? this.upperChestInventory.getInventoryName() : I18n.format(this.upperChestInventory.getInventoryName(), new Object[0]), 8, this.ySize - 96 + 2, CustomNpcResourceListener.DefaultTextColor);
    }
    
    protected void drawGuiContainerBackgroundLayer(final float p_146976_1_, final int p_146976_2_, final int p_146976_3_) {
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        this.mc.getTextureManager().bindTexture(GuiCrate.field_147017_u);
        final int k = (this.width - this.xSize) / 2;
        final int l = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(k, l, 0, 0, this.xSize, this.inventoryRows * 18 + 17);
        this.drawTexturedModalRect(k, l + this.inventoryRows * 18 + 17, 0, 126, this.xSize, 96);
    }
    
    static {
        field_147017_u = new ResourceLocation("textures/gui/container/generic_54.png");
    }
}
