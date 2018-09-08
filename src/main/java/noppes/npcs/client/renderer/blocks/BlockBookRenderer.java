// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.renderer.blocks;

import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.entity.Entity;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;
import noppes.npcs.blocks.tiles.TileColorable;
import net.minecraft.tileentity.TileEntity;
import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;
import cpw.mods.fml.client.registry.RenderingRegistry;
import noppes.npcs.CustomItems;
import noppes.npcs.blocks.BlockRotated;
import net.minecraft.client.model.ModelBook;
import net.minecraft.util.ResourceLocation;
import noppes.npcs.client.model.blocks.ModelInk;

public class BlockBookRenderer extends BlockRendererInterface
{
    private final ModelInk ink;
    private final ResourceLocation resource;
    private final ResourceLocation resource2;
    private final ModelBook book;
    
    public BlockBookRenderer() {
        this.ink = new ModelInk();
        this.resource = new ResourceLocation("textures/entity/enchanting_table_book.png");
        this.resource2 = new ResourceLocation("customnpcs:textures/models/Ink.png");
        this.book = new ModelBook();
        ((BlockRotated)CustomItems.book).renderId = RenderingRegistry.getNextAvailableRenderId();
        RenderingRegistry.registerBlockHandler((ISimpleBlockRenderingHandler)this);
    }
    
    public void renderTileEntityAt(final TileEntity var1, final double var2, final double var4, final double var6, final float var8) {
        final TileColorable tile = (TileColorable)var1;
        GL11.glDisable(32826);
        GL11.glPushMatrix();
        GL11.glTranslatef((float)var2 + 0.5f, (float)var4 + 1.5f, (float)var6 + 0.5f);
        GL11.glRotatef(180.0f, 0.0f, 0.0f, 1.0f);
        GL11.glRotatef((float)(90 * tile.rotation - 90), 0.0f, 1.0f, 0.0f);
        GL11.glColor3f(1.0f, 1.0f, 1.0f);
        final TextureManager manager = Minecraft.getMinecraft().getTextureManager();
        manager.bindTexture(this.resource2);
        if (!this.playerTooFar(tile)) {
            GL11.glEnable(3042);
            GL11.glBlendFunc(770, 771);
        }
        this.ink.render(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f);
        manager.bindTexture(this.resource);
        GL11.glRotatef(-90.0f, 0.0f, 0.0f, 1.0f);
        GL11.glTranslatef(-1.49f, -0.18f, 0.0f);
        this.book.render((Entity)null, 0.0f, 0.0f, 1.0f, 1.24f, 1.0f, 0.0625f);
        GL11.glDisable(3042);
        GL11.glPopMatrix();
    }
    
    public void renderInventoryBlock(final Block block, final int metadata, final int modelId, final RenderBlocks renderer) {
        GL11.glPushMatrix();
        GL11.glTranslatef(0.2f, 1.7f, 0.0f);
        GL11.glScalef(1.4f, 1.4f, 1.4f);
        GL11.glRotatef(180.0f, 0.0f, 0.0f, 1.0f);
        GL11.glRotatef(180.0f, 0.0f, 1.0f, 0.0f);
        GL11.glRotatef(-90.0f, 0.0f, 1.0f, 0.0f);
        GL11.glColor3f(1.0f, 1.0f, 1.0f);
        GL11.glEnable(2884);
        final TextureManager manager = Minecraft.getMinecraft().getTextureManager();
        manager.bindTexture(this.resource2);
        this.ink.render(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f);
        manager.bindTexture(this.resource);
        GL11.glRotatef(-90.0f, 0.0f, 0.0f, 1.0f);
        GL11.glTranslatef(-1.45f, -0.18f, 0.0f);
        this.book.render((Entity)null, 0.0f, 0.0f, 1.0f, 1.24f, 1.0f, 0.0625f);
        GL11.glPopMatrix();
    }
    
    public int getRenderId() {
        return CustomItems.book.getRenderType();
    }
}
