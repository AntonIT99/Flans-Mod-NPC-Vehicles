// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.renderer.blocks;

import net.minecraft.world.IBlockAccess;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.block.Block;
import net.minecraft.util.IChatComponent;
import org.lwjgl.opengl.GL11;
import noppes.npcs.client.TextBlockClient;
import net.minecraft.client.Minecraft;
import noppes.npcs.blocks.tiles.TileBigSign;
import net.minecraft.tileentity.TileEntity;
import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;
import cpw.mods.fml.client.registry.RenderingRegistry;
import noppes.npcs.CustomItems;
import noppes.npcs.blocks.BlockBigSign;
import net.minecraft.util.ResourceLocation;
import noppes.npcs.client.model.blocks.ModelBigSign;

public class BlockBigSignRenderer extends BlockRendererInterface
{
    private final ModelBigSign model;
    private static final ResourceLocation resource;
    
    public BlockBigSignRenderer() {
        this.model = new ModelBigSign();
        ((BlockBigSign)CustomItems.bigsign).renderId = RenderingRegistry.getNextAvailableRenderId();
        RenderingRegistry.registerBlockHandler((ISimpleBlockRenderingHandler)this);
    }
    
    public void renderTileEntityAt(final TileEntity var1, final double var2, final double var4, final double var6, final float var8) {
        final Block block = var1.getBlockType();
        final TileBigSign tile = (TileBigSign)var1;
        final Minecraft mc = Minecraft.getMinecraft();
        if (tile.block == null || tile.hasChanged) {
            tile.block = new TextBlockClient(tile.getText(), 112, true, new Object[] { mc.thePlayer });
            tile.hasChanged = false;
        }
        GL11.glDisable(32826);
        GL11.glPushMatrix();
        float xOffset = 0.0f;
        float yOffset = 0.0f;
        if (tile.rotation == 1) {
            xOffset = -0.44f;
        }
        else if (tile.rotation == 3) {
            xOffset = 0.44f;
        }
        else if (tile.rotation == 2) {
            yOffset = -0.44f;
        }
        else if (tile.rotation == 0) {
            yOffset = 0.44f;
        }
        GL11.glTranslatef((float)var2 + 0.5f + xOffset, (float)var4 + 0.5f, (float)var6 + 0.5f + yOffset);
        final float f1 = 0.6666667f;
        GL11.glRotatef((float)(90 * tile.rotation), 0.0f, 1.0f, 0.0f);
        GL11.glColor3f(1.0f, 1.0f, 1.0f);
        if (tile.rotation % 2 == 0) {
            GL11.glRotatef(180.0f, 0.0f, 1.0f, 0.0f);
        }
        GL11.glPushMatrix();
        GL11.glRotatef(180.0f, 1.0f, 0.0f, 0.0f);
        GL11.glRotatef(180.0f, 0.0f, 0.0f, 1.0f);
        final TextureManager manager = Minecraft.getMinecraft().getTextureManager();
        manager.bindTexture(BlockBigSignRenderer.resource);
        this.model.renderSign();
        GL11.glPopMatrix();
        if (!tile.block.lines.isEmpty() && !this.playerTooFar(tile)) {
            final float f2 = 0.0133f * f1;
            GL11.glTranslatef(0.0f, 0.5f, 0.065f);
            GL11.glScalef(f2, -f2, f2);
            GL11.glNormal3f(0.0f, 0.0f, -1.0f * f2);
            GL11.glDepthMask(false);
            final FontRenderer fontrenderer = this.func_147498_b();
            float lineOffset = 0.0f;
            if (tile.block.lines.size() < 14) {
                lineOffset = (14.0f - tile.block.lines.size()) / 2.0f;
            }
            for (int i = 0; i < tile.block.lines.size(); ++i) {
                final String text = tile.block.lines.get(i).getFormattedText();
                fontrenderer.drawString(text, -fontrenderer.getStringWidth(text) / 2, (int)((lineOffset + i) * (fontrenderer.FONT_HEIGHT - 0.3)), 0);
                if (i == 12) {
                    break;
                }
            }
            GL11.glDepthMask(true);
            GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        }
        GL11.glPopMatrix();
    }
    
    public void renderInventoryBlock(final Block block, final int metadata, final int modelId, final RenderBlocks renderer) {
        GL11.glPushMatrix();
        GL11.glRotatef(180.0f, 0.0f, 0.0f, 1.0f);
        GL11.glRotatef(180.0f, 0.0f, 1.0f, 0.0f);
        final TextureManager manager = Minecraft.getMinecraft().getTextureManager();
        manager.bindTexture(BlockBigSignRenderer.resource);
        GL11.glColor3f(1.0f, 1.0f, 1.0f);
        this.model.renderSign();
        GL11.glPopMatrix();
    }
    
    @Override
    public boolean renderWorldBlock(final IBlockAccess world, final int x, final int y, final int z, final Block block, final int modelId, final RenderBlocks renderer) {
        return false;
    }
    
    @Override
    public boolean shouldRender3DInInventory(final int modelId) {
        return true;
    }
    
    public int getRenderId() {
        return CustomItems.bigsign.getRenderType();
    }
    
    static {
        resource = new ResourceLocation("customnpcs:textures/models/BigSign.png");
    }
}
