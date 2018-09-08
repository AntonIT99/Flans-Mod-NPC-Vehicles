// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.renderer.blocks;

import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.block.Block;
import noppes.npcs.blocks.tiles.TileShelf;
import net.minecraft.world.World;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;
import noppes.npcs.blocks.tiles.TileColorable;
import net.minecraft.tileentity.TileEntity;
import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;
import cpw.mods.fml.client.registry.RenderingRegistry;
import noppes.npcs.CustomItems;
import noppes.npcs.blocks.BlockRotated;
import noppes.npcs.client.model.blocks.ModelShelf;

public class BlockShelfRenderer extends BlockRendererInterface
{
    private final ModelShelf model;
    
    public BlockShelfRenderer() {
        this.model = new ModelShelf();
        ((BlockRotated)CustomItems.shelf).renderId = RenderingRegistry.getNextAvailableRenderId();
        RenderingRegistry.registerBlockHandler((ISimpleBlockRenderingHandler)this);
    }
    
    public void renderTileEntityAt(final TileEntity var1, final double var2, final double var4, final double var6, final float var8) {
        final TileColorable tile = (TileColorable)var1;
        GL11.glDisable(32826);
        GL11.glPushMatrix();
        GL11.glTranslatef((float)var2 + 0.5f, (float)var4 + 1.5f, (float)var6 + 0.5f);
        GL11.glRotatef(180.0f, 0.0f, 0.0f, 1.0f);
        GL11.glRotatef((float)(90 * tile.rotation), 0.0f, 1.0f, 0.0f);
        GL11.glColor3f(1.0f, 1.0f, 1.0f);
        boolean drawLeft = true;
        boolean drawRight = true;
        if (tile.rotation == 3) {
            drawLeft = this.shouldDraw(var1.getWorldObj(), var1.xCoord, var1.yCoord, var1.zCoord - 1, 3);
            drawRight = this.shouldDraw(var1.getWorldObj(), var1.xCoord, var1.yCoord, var1.zCoord + 1, 3);
        }
        else if (tile.rotation == 1) {
            drawLeft = this.shouldDraw(var1.getWorldObj(), var1.xCoord, var1.yCoord, var1.zCoord + 1, 1);
            drawRight = this.shouldDraw(var1.getWorldObj(), var1.xCoord, var1.yCoord, var1.zCoord - 1, 1);
        }
        else if (tile.rotation == 0) {
            drawLeft = this.shouldDraw(var1.getWorldObj(), var1.xCoord + 1, var1.yCoord, var1.zCoord, 0);
            drawRight = this.shouldDraw(var1.getWorldObj(), var1.xCoord - 1, var1.yCoord, var1.zCoord, 0);
        }
        else if (tile.rotation == 2) {
            drawLeft = this.shouldDraw(var1.getWorldObj(), var1.xCoord - 1, var1.yCoord, var1.zCoord, 2);
            drawRight = this.shouldDraw(var1.getWorldObj(), var1.xCoord + 1, var1.yCoord, var1.zCoord, 2);
        }
        final ModelRenderer supportLeft1 = this.model.SupportLeft1;
        final ModelRenderer supportLeft2 = this.model.SupportLeft2;
        final boolean b = drawLeft;
        supportLeft2.showModel = b;
        supportLeft1.showModel = b;
        final ModelRenderer supportRight1 = this.model.SupportRight1;
        final ModelRenderer supportRight2 = this.model.SupportRight2;
        final boolean b2 = drawRight;
        supportRight2.showModel = b2;
        supportRight1.showModel = b2;
        this.setWoodTexture(var1.getBlockMetadata());
        this.model.render(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f);
        GL11.glPopMatrix();
    }
    
    private boolean shouldDraw(final World world, final int x, final int y, final int z, final int rotation) {
        final TileEntity tile = world.getTileEntity(x, y, z);
        return tile == null || !(tile instanceof TileShelf) || ((TileShelf)tile).rotation != rotation;
    }
    
    public void renderInventoryBlock(final Block block, final int metadata, final int modelId, final RenderBlocks renderer) {
        GL11.glPushMatrix();
        GL11.glTranslatef(0.0f, 0.6f, 0.0f);
        GL11.glScalef(1.0f, 1.0f, 1.0f);
        GL11.glRotatef(180.0f, 0.0f, 0.0f, 1.0f);
        GL11.glRotatef(180.0f, 0.0f, 1.0f, 0.0f);
        this.setWoodTexture(metadata);
        GL11.glColor3f(1.0f, 1.0f, 1.0f);
        final ModelRenderer supportLeft1 = this.model.SupportLeft1;
        final ModelRenderer supportLeft2 = this.model.SupportLeft2;
        final boolean b = true;
        supportLeft2.showModel = b;
        supportLeft1.showModel = b;
        final ModelRenderer supportRight1 = this.model.SupportRight1;
        final ModelRenderer supportRight2 = this.model.SupportRight2;
        final boolean b2 = true;
        supportRight2.showModel = b2;
        supportRight1.showModel = b2;
        this.model.render(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f);
        GL11.glPopMatrix();
    }
    
    public int getRenderId() {
        return CustomItems.shelf.getRenderType();
    }
}
