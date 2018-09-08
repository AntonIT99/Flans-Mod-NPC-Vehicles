// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.renderer.blocks;

import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.block.Block;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.util.IChatComponent;
import noppes.npcs.client.TextBlockClient;
import net.minecraft.entity.Entity;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;
import noppes.npcs.blocks.tiles.TileTombstone;
import net.minecraft.tileentity.TileEntity;
import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;
import cpw.mods.fml.client.registry.RenderingRegistry;
import noppes.npcs.CustomItems;
import noppes.npcs.blocks.BlockTombstone;
import noppes.npcs.client.model.blocks.ModelTombstone3;
import noppes.npcs.client.model.blocks.ModelTombstone2;
import noppes.npcs.client.model.blocks.ModelTombstone1;

public class BlockTombstoneRenderer extends BlockRendererInterface
{
    private final ModelTombstone1 model;
    private final ModelTombstone2 model2;
    private final ModelTombstone3 model3;
    
    public BlockTombstoneRenderer() {
        this.model = new ModelTombstone1();
        this.model2 = new ModelTombstone2();
        this.model3 = new ModelTombstone3();
        ((BlockTombstone)CustomItems.tombstone).renderId = RenderingRegistry.getNextAvailableRenderId();
        RenderingRegistry.registerBlockHandler((ISimpleBlockRenderingHandler)this);
    }
    
    public void renderTileEntityAt(final TileEntity var1, final double var2, final double var4, final double var6, final float var8) {
        final TileTombstone tile = (TileTombstone)var1;
        final int meta = tile.getBlockMetadata();
        GL11.glDisable(32826);
        GL11.glPushMatrix();
        GL11.glTranslatef((float)var2 + 0.5f, (float)var4 + 1.5f, (float)var6 + 0.5f);
        if (meta == 2) {
            GL11.glScalef(1.0f, 1.0f, 1.14f);
        }
        GL11.glRotatef(180.0f, 0.0f, 0.0f, 1.0f);
        GL11.glRotatef((float)(90 * tile.rotation), 0.0f, 1.0f, 0.0f);
        GL11.glColor3f(1.0f, 1.0f, 1.0f);
        Minecraft.getMinecraft().getTextureManager().bindTexture(BlockTombstoneRenderer.Stone);
        if (meta == 0) {
            this.model.render(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f);
        }
        else if (meta == 1) {
            this.model2.render(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f);
        }
        else {
            this.model3.render(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f);
        }
        if (meta < 2 && !this.playerTooFar(tile)) {
            this.renderText(tile, meta);
        }
        GL11.glPopMatrix();
    }
    
    private void renderText(final TileTombstone tile, final int meta) {
        if (tile.block == null || tile.hasChanged) {
            tile.block = new TextBlockClient(tile.getText(), 94, true, new Object[] { Minecraft.getMinecraft().thePlayer });
            tile.hasChanged = false;
        }
        if (!tile.block.lines.isEmpty()) {
            GL11.glRotatef(180.0f, 1.0f, 0.0f, 0.0f);
            final float f3 = 0.00665f;
            GL11.glTranslatef(0.0f, -0.64f, (meta == 0) ? 0.095f : 0.126f);
            GL11.glScalef(f3, -f3, f3);
            GL11.glNormal3f(0.0f, 0.0f, -1.0f * f3);
            GL11.glDepthMask(false);
            final FontRenderer fontrenderer = this.func_147498_b();
            float lineOffset = 0.0f;
            if (tile.block.lines.size() < 11) {
                lineOffset = (11.0f - tile.block.lines.size()) / 2.0f;
            }
            for (int i = 0; i < tile.block.lines.size(); ++i) {
                final String text = tile.block.lines.get(i).getFormattedText();
                fontrenderer.drawString(text, -fontrenderer.getStringWidth(text) / 2, (int)((lineOffset + i) * (fontrenderer.FONT_HEIGHT - 0.3)), 16777215);
                if (i == 13) {
                    break;
                }
            }
            GL11.glDepthMask(true);
            GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        }
    }
    
    public void renderInventoryBlock(final Block block, final int meta, final int modelId, final RenderBlocks renderer) {
        GL11.glPushMatrix();
        GL11.glTranslatef(0.0f, 1.0f, 0.0f);
        GL11.glScalef(1.0f, 1.0f, 1.0f);
        GL11.glRotatef(180.0f, 0.0f, 0.0f, 1.0f);
        GL11.glRotatef(180.0f, 0.0f, 1.0f, 0.0f);
        Minecraft.getMinecraft().getTextureManager().bindTexture(BlockTombstoneRenderer.Stone);
        GL11.glColor3f(1.0f, 1.0f, 1.0f);
        if (meta == 0) {
            this.model.render(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f);
        }
        else if (meta == 1) {
            this.model2.render(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f);
        }
        else {
            this.model3.render(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f);
        }
        GL11.glPopMatrix();
    }
    
    public int getRenderId() {
        return CustomItems.tombstone.getRenderType();
    }
}
