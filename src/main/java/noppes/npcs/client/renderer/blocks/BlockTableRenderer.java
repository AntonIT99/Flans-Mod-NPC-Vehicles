// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.renderer.blocks;

import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;
import noppes.npcs.blocks.tiles.TileColorable;
import net.minecraft.tileentity.TileEntity;
import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;
import cpw.mods.fml.client.registry.RenderingRegistry;
import noppes.npcs.CustomItems;
import noppes.npcs.blocks.BlockTable;
import net.minecraft.util.ResourceLocation;
import noppes.npcs.client.model.blocks.ModelTable;

public class BlockTableRenderer extends BlockRendererInterface
{
    private final ModelTable model;
    private static final ResourceLocation resource1;
    private static final ResourceLocation resource2;
    private static final ResourceLocation resource3;
    private static final ResourceLocation resource4;
    private static final ResourceLocation resource5;
    private static final ResourceLocation resource6;
    
    public BlockTableRenderer() {
        this.model = new ModelTable();
        ((BlockTable)CustomItems.table).renderId = RenderingRegistry.getNextAvailableRenderId();
        RenderingRegistry.registerBlockHandler((ISimpleBlockRenderingHandler)this);
    }
    
    public void renderTileEntityAt(final TileEntity var1, final double var2, final double var4, final double var6, final float var8) {
        final TileColorable tile = (TileColorable)var1;
        GL11.glPushMatrix();
        GL11.glTranslatef((float)var2 + 0.5f, (float)var4 + 1.5f, (float)var6 + 0.5f);
        GL11.glRotatef(180.0f, 0.0f, 0.0f, 1.0f);
        GL11.glColor3f(1.0f, 1.0f, 1.0f);
        final boolean south = var1.getWorldObj().getBlock(var1.xCoord + 1, var1.yCoord, var1.zCoord) == CustomItems.table;
        final boolean north = var1.getWorldObj().getBlock(var1.xCoord - 1, var1.yCoord, var1.zCoord) == CustomItems.table;
        final boolean east = var1.getWorldObj().getBlock(var1.xCoord, var1.yCoord, var1.zCoord + 1) == CustomItems.table;
        final boolean west = var1.getWorldObj().getBlock(var1.xCoord, var1.yCoord, var1.zCoord - 1) == CustomItems.table;
        this.model.Shape1.showModel = (!south && !east);
        this.model.Shape3.showModel = (!north && !west);
        this.model.Shape4.showModel = (!north && !east);
        this.model.Shape5.showModel = (!south && !west);
        this.setWoodTexture(var1.getBlockMetadata());
        this.model.render(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f);
        GL11.glRotatef((float)(90 * tile.rotation), 0.0f, 1.0f, 0.0f);
        this.model.Table.render(0.0625f);
        GL11.glPopMatrix();
    }
    
    public void renderInventoryBlock(final Block block, final int metadata, final int modelId, final RenderBlocks renderer) {
        GL11.glPushMatrix();
        GL11.glTranslatef(0.0f, 0.9f, 0.0f);
        GL11.glRotatef(180.0f, 0.0f, 0.0f, 1.0f);
        GL11.glRotatef(180.0f, 0.0f, 1.0f, 0.0f);
        this.setWoodTexture(metadata);
        GL11.glColor3f(1.0f, 1.0f, 1.0f);
        this.model.Table.render(0.0625f);
        this.model.Shape1.showModel = true;
        this.model.Shape3.showModel = true;
        this.model.Shape4.showModel = true;
        this.model.Shape5.showModel = true;
        this.model.render(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f);
        GL11.glPopMatrix();
    }
    
    public int getRenderId() {
        return CustomItems.table.getRenderType();
    }
    
    static {
        resource1 = new ResourceLocation("customnpcs", "textures/cache/planks_oak.png");
        resource2 = new ResourceLocation("customnpcs", "textures/cache/planks_big_oak.png");
        resource3 = new ResourceLocation("customnpcs", "textures/cache/planks_spruce.png");
        resource4 = new ResourceLocation("customnpcs", "textures/cache/planks_birch.png");
        resource5 = new ResourceLocation("customnpcs", "textures/cache/planks_acacia.png");
        resource6 = new ResourceLocation("customnpcs", "textures/cache/planks_jungle.png");
    }
}
