// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.renderer.blocks;

import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;
import noppes.npcs.blocks.tiles.TileCouchWool;
import net.minecraft.tileentity.TileEntity;
import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;
import cpw.mods.fml.client.registry.RenderingRegistry;
import noppes.npcs.CustomItems;
import noppes.npcs.blocks.BlockCouchWool;
import noppes.npcs.client.model.blocks.ModelCouchCornerWool;
import noppes.npcs.client.model.blocks.ModelCouchCorner;
import noppes.npcs.client.model.blocks.ModelCouchRightWool;
import noppes.npcs.client.model.blocks.ModelCouchRight;
import noppes.npcs.client.model.blocks.ModelCouchLeftWool;
import noppes.npcs.client.model.blocks.ModelCouchLeft;
import noppes.npcs.client.model.blocks.ModelCouchMiddleWool;
import noppes.npcs.client.model.blocks.ModelCouchMiddle;
import net.minecraft.client.model.ModelBase;

public class BlockCouchWoolRenderer extends BlockRendererInterface
{
    private final ModelBase model;
    private final ModelBase model2;
    private final ModelBase modelLeft;
    private final ModelBase modelLeft2;
    private final ModelBase modelRight;
    private final ModelBase modelRight2;
    private final ModelBase modelCorner;
    private final ModelBase modelCorner2;
    
    public BlockCouchWoolRenderer() {
        this.model = new ModelCouchMiddle();
        this.model2 = new ModelCouchMiddleWool();
        this.modelLeft = new ModelCouchLeft();
        this.modelLeft2 = new ModelCouchLeftWool();
        this.modelRight = new ModelCouchRight();
        this.modelRight2 = new ModelCouchRightWool();
        this.modelCorner = new ModelCouchCorner();
        this.modelCorner2 = new ModelCouchCornerWool();
        ((BlockCouchWool)CustomItems.couchWool).renderId = RenderingRegistry.getNextAvailableRenderId();
        RenderingRegistry.registerBlockHandler((ISimpleBlockRenderingHandler)this);
    }
    
    public void renderTileEntityAt(final TileEntity var1, final double var2, final double var4, final double var6, final float var8) {
        final TileCouchWool tile = (TileCouchWool)var1;
        GL11.glDisable(32826);
        GL11.glPushMatrix();
        GL11.glTranslatef((float)var2 + 0.5f, (float)var4 + 1.5f, (float)var6 + 0.5f);
        GL11.glRotatef(180.0f, 0.0f, 0.0f, 1.0f);
        GL11.glRotatef((float)(90 * tile.rotation), 0.0f, 1.0f, 0.0f);
        GL11.glColor3f(1.0f, 1.0f, 1.0f);
        this.setWoodTexture(var1.getBlockMetadata());
        if (tile.hasCornerLeft) {
            this.modelCorner.render((Entity)null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f);
        }
        else if (tile.hasCornerRight) {
            GL11.glRotatef(90.0f, 0.0f, 1.0f, 0.0f);
            this.modelCorner.render((Entity)null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f);
        }
        else if (tile.hasLeft && tile.hasRight) {
            this.model.render((Entity)null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f);
        }
        else if (tile.hasLeft) {
            this.modelLeft.render((Entity)null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f);
        }
        else if (tile.hasRight) {
            this.modelRight.render((Entity)null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f);
        }
        else {
            this.model.render((Entity)null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f);
        }
        this.bindTexture(BlockTallLampRenderer.resourceTop);
        final float[] color = BlockBannerRenderer.colorTable[tile.color];
        GL11.glColor3f(color[0], color[1], color[2]);
        if (tile.hasCornerLeft || tile.hasCornerRight) {
            this.modelCorner2.render((Entity)null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f);
        }
        else if (tile.hasLeft && tile.hasRight) {
            this.model2.render((Entity)null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f);
        }
        else if (tile.hasLeft) {
            this.modelLeft2.render((Entity)null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f);
        }
        else if (tile.hasRight) {
            this.modelRight2.render((Entity)null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f);
        }
        else {
            this.model2.render((Entity)null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f);
        }
        GL11.glPopMatrix();
    }
    
    public void renderInventoryBlock(final Block block, final int metadata, final int modelId, final RenderBlocks renderer) {
        GL11.glPushMatrix();
        GL11.glTranslatef(0.0f, 0.9f, 0.1f);
        GL11.glScalef(0.9f, 0.9f, 0.9f);
        GL11.glRotatef(180.0f, 0.0f, 0.0f, 1.0f);
        GL11.glRotatef(180.0f, 0.0f, 1.0f, 0.0f);
        this.setWoodTexture(metadata);
        GL11.glColor3f(1.0f, 1.0f, 1.0f);
        this.model.render((Entity)null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f);
        this.bindTexture(BlockTallLampRenderer.resourceTop);
        final float[] color = BlockBannerRenderer.colorTable[15 - metadata];
        GL11.glColor3f(color[0], color[1], color[2]);
        this.model2.render((Entity)null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f);
        GL11.glPopMatrix();
    }
    
    public int getRenderId() {
        return CustomItems.couchWool.getRenderType();
    }
}
