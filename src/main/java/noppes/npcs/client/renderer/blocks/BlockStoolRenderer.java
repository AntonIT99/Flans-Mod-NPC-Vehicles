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
import noppes.npcs.blocks.BlockStool;
import noppes.npcs.client.model.blocks.ModelStool;

public class BlockStoolRenderer extends BlockRendererInterface
{
    private final ModelStool model;
    
    public BlockStoolRenderer() {
        this.model = new ModelStool();
        ((BlockStool)CustomItems.stool).renderId = RenderingRegistry.getNextAvailableRenderId();
        RenderingRegistry.registerBlockHandler((ISimpleBlockRenderingHandler)this);
    }
    
    public void renderTileEntityAt(final TileEntity var1, final double var2, final double var4, final double var6, final float var8) {
        final TileColorable tile = (TileColorable)var1;
        GL11.glDisable(32826);
        GL11.glPushMatrix();
        GL11.glTranslatef((float)var2 + 0.5f, (float)var4 + 1.68f, (float)var6 + 0.5f);
        GL11.glScalef(1.2f, 1.1f, 1.2f);
        GL11.glRotatef(180.0f, 0.0f, 0.0f, 1.0f);
        GL11.glColor3f(1.0f, 1.0f, 1.0f);
        this.setWoodTexture(var1.getBlockMetadata());
        this.model.render(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f);
        GL11.glPopMatrix();
    }
    
    public void renderInventoryBlock(final Block block, final int metadata, final int modelId, final RenderBlocks renderer) {
        GL11.glPushMatrix();
        GL11.glTranslatef(0.0f, 1.0f, 0.0f);
        GL11.glScalef(1.2f, 1.1f, 1.2f);
        GL11.glRotatef(180.0f, 0.0f, 0.0f, 1.0f);
        GL11.glRotatef(180.0f, 0.0f, 1.0f, 0.0f);
        this.setWoodTexture(metadata);
        GL11.glColor3f(1.0f, 1.0f, 1.0f);
        this.model.render(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f);
        GL11.glPopMatrix();
    }
    
    public int getRenderId() {
        return CustomItems.stool.getRenderType();
    }
}
