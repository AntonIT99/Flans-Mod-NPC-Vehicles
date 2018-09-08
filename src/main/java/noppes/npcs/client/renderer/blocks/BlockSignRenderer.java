// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.renderer.blocks;

import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.Entity;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;
import noppes.npcs.blocks.tiles.TileSign;
import net.minecraft.tileentity.TileEntity;
import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;
import cpw.mods.fml.client.registry.RenderingRegistry;
import noppes.npcs.CustomItems;
import noppes.npcs.blocks.BlockRotated;
import noppes.npcs.client.model.blocks.ModelSign;

public class BlockSignRenderer extends BlockRendererInterface
{
    private final ModelSign model;
    
    public BlockSignRenderer() {
        this.model = new ModelSign();
        ((BlockRotated)CustomItems.sign).renderId = RenderingRegistry.getNextAvailableRenderId();
        RenderingRegistry.registerBlockHandler((ISimpleBlockRenderingHandler)this);
    }
    
    public void renderTileEntityAt(final TileEntity var1, final double var2, final double var4, final double var6, final float var8) {
        final TileSign tile = (TileSign)var1;
        GL11.glDisable(32826);
        GL11.glPushMatrix();
        GL11.glTranslatef((float)var2 + 0.5f, (float)var4 + 1.62f, (float)var6 + 0.5f);
        GL11.glRotatef(180.0f, 0.0f, 0.0f, 1.0f);
        GL11.glRotatef((float)(90 * tile.rotation + 90), 0.0f, 1.0f, 0.0f);
        GL11.glColor3f(1.0f, 1.0f, 1.0f);
        Minecraft.getMinecraft().getTextureManager().bindTexture(BlockSignRenderer.Steel);
        this.model.render(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f);
        this.setWoodTexture(tile.getBlockMetadata());
        this.model.Sign.render(0.0625f);
        if (tile.icon != null && !this.playerTooFar(tile)) {
            this.doRender(var2, var4, var6, tile.rotation, tile.icon);
        }
        GL11.glPopMatrix();
    }
    
    public void doRender(final double par2, final double par4, final double par6, final int meta, final ItemStack iicon) {
        if (iicon.getItemSpriteNumber() == 0 && RenderBlocks.renderItemIn3d(Block.getBlockFromItem(iicon.getItem()).getRenderType())) {
            return;
        }
        GL11.glPushMatrix();
        this.bindTexture(TextureMap.locationItemsTexture);
        GL11.glTranslatef(0.0f, 1.02f, -0.03f);
        GL11.glDepthMask(false);
        final float f2 = 0.024f;
        final Minecraft mc = Minecraft.getMinecraft();
        GL11.glScalef(f2, f2, f2);
        BlockSignRenderer.renderer.renderItemIntoGUI(this.func_147498_b(), mc.renderEngine, iicon, -8, -8);
        GL11.glRotatef(180.0f, 0.0f, 1.0f, 0.0f);
        GL11.glTranslatef(0.0f, 0.0f, -2.9f);
        BlockSignRenderer.renderer.renderItemIntoGUI(this.func_147498_b(), mc.renderEngine, iicon, -8, -8);
        GL11.glDepthMask(true);
        GL11.glPopMatrix();
    }
    
    public void renderInventoryBlock(final Block block, final int metadata, final int modelId, final RenderBlocks renderer) {
        GL11.glPushMatrix();
        GL11.glTranslatef(0.0f, 0.6f, 0.0f);
        GL11.glScalef(1.0f, 1.0f, 1.0f);
        GL11.glRotatef(180.0f, 0.0f, 0.0f, 1.0f);
        GL11.glRotatef(180.0f, 0.0f, 1.0f, 0.0f);
        GL11.glColor3f(1.0f, 1.0f, 1.0f);
        Minecraft.getMinecraft().getTextureManager().bindTexture(BlockSignRenderer.Steel);
        this.model.render(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f);
        this.setWoodTexture(metadata);
        this.model.Sign.render(0.0625f);
        GL11.glPopMatrix();
    }
    
    public int getRenderId() {
        return CustomItems.sign.getRenderType();
    }
}
