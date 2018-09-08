// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.renderer.blocks;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;
import noppes.npcs.blocks.tiles.TileWallBanner;
import net.minecraft.tileentity.TileEntity;
import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;
import cpw.mods.fml.client.registry.RenderingRegistry;
import noppes.npcs.CustomItems;
import noppes.npcs.blocks.BlockWallBanner;
import noppes.npcs.client.model.blocks.ModelWallBannerFlag;
import noppes.npcs.client.model.blocks.ModelWallBanner;

public class BlockWallBannerRenderer extends BlockRendererInterface
{
    private final ModelWallBanner model;
    private final ModelWallBannerFlag flag;
    
    public BlockWallBannerRenderer() {
        this.model = new ModelWallBanner();
        this.flag = new ModelWallBannerFlag();
        ((BlockWallBanner)CustomItems.wallBanner).renderId = RenderingRegistry.getNextAvailableRenderId();
        RenderingRegistry.registerBlockHandler((ISimpleBlockRenderingHandler)this);
    }
    
    public void renderTileEntityAt(final TileEntity var1, final double var2, final double var4, final double var6, final float var8) {
        final TileWallBanner tile = (TileWallBanner)var1;
        GL11.glDisable(32826);
        GL11.glEnable(3008);
        GL11.glPushMatrix();
        GL11.glTranslatef((float)var2 + 0.5f, (float)var4 + 0.4f, (float)var6 + 0.5f);
        GL11.glRotatef(180.0f, 0.0f, 0.0f, 1.0f);
        GL11.glRotatef((float)(90 * tile.rotation), 0.0f, 1.0f, 0.0f);
        BlockRendererInterface.setMaterialTexture(var1.getBlockMetadata());
        GL11.glColor3f(1.0f, 1.0f, 1.0f);
        this.model.render(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f);
        this.bindTexture(BlockBannerRenderer.resourceFlag);
        final float[] color = BlockBannerRenderer.colorTable[tile.color];
        GL11.glColor3f(color[0], color[1], color[2]);
        this.flag.render(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f);
        GL11.glPopMatrix();
        GL11.glColor3f(1.0f, 1.0f, 1.0f);
        if (tile.icon != null && !this.playerTooFar(tile)) {
            this.doRender(var2, var4, var6, tile.rotation, tile.icon);
        }
    }
    
    public void doRender(final double par2, final double par4, final double par6, final int meta, final ItemStack iicon) {
        if (iicon.getItemSpriteNumber() == 0 && RenderBlocks.renderItemIn3d(Block.getBlockFromItem(iicon.getItem()).getRenderType())) {
            return;
        }
        GL11.glPushMatrix();
        this.bindTexture(TextureMap.locationItemsTexture);
        GL11.glTranslatef((float)par2 + 0.5f, (float)par4 + 0.2f, (float)par6 + 0.5f);
        GL11.glRotatef(180.0f, 0.0f, 0.0f, 1.0f);
        GL11.glRotatef((float)(90 * meta), 0.0f, 1.0f, 0.0f);
        GL11.glTranslatef(0.0f, 0.0f, 0.26f);
        GL11.glDepthMask(false);
        final float f2 = 0.05f;
        final Minecraft mc = Minecraft.getMinecraft();
        GL11.glScalef(f2, f2, f2);
        BlockWallBannerRenderer.renderer.renderItemIntoGUI(this.func_147498_b(), mc.renderEngine, iicon, -8, -8);
        GL11.glDepthMask(true);
        GL11.glPopMatrix();
    }
    
    public void renderInventoryBlock(final Block block, final int metadata, final int modelId, final RenderBlocks renderer) {
        GL11.glPushMatrix();
        GL11.glTranslatef(0.0f, 0.26f, 0.3f);
        GL11.glScalef(0.95f, 0.85f, 0.95f);
        GL11.glRotatef(180.0f, 0.0f, 0.0f, 1.0f);
        GL11.glRotatef(180.0f, 0.0f, 1.0f, 0.0f);
        BlockRendererInterface.setMaterialTexture(metadata);
        GL11.glColor3f(1.0f, 1.0f, 1.0f);
        this.model.render(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f);
        this.bindTexture(BlockBannerRenderer.resourceFlag);
        final float[] color = BlockBannerRenderer.colorTable[15 - metadata];
        GL11.glColor3f(color[0], color[1], color[2]);
        this.flag.render(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f);
        GL11.glPopMatrix();
    }
    
    public int getRenderId() {
        return CustomItems.wallBanner.getRenderType();
    }
    
    @Override
    public int specialRenderDistance() {
        return 26;
    }
}
