// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.renderer.blocks;

import net.minecraft.world.IBlockAccess;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;
import net.minecraft.tileentity.TileEntity;
import cpw.mods.fml.client.registry.RenderingRegistry;
import noppes.npcs.CustomItems;
import noppes.npcs.blocks.BlockMailbox;
import net.minecraft.util.ResourceLocation;
import noppes.npcs.client.model.blocks.ModelMailboxWow;
import noppes.npcs.client.model.blocks.ModelMailboxUS;
import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;

public class BlockMailboxRenderer extends TileEntitySpecialRenderer implements ISimpleBlockRenderingHandler
{
    private final ModelMailboxUS model;
    private final ModelMailboxWow model2;
    private static final ResourceLocation text1;
    private static final ResourceLocation text2;
    
    public BlockMailboxRenderer() {
        this.model = new ModelMailboxUS();
        this.model2 = new ModelMailboxWow();
        ((BlockMailbox)CustomItems.mailbox).renderId = RenderingRegistry.getNextAvailableRenderId();
        RenderingRegistry.registerBlockHandler((ISimpleBlockRenderingHandler)this);
    }
    
    public void renderTileEntityAt(final TileEntity var1, final double var2, final double var4, final double var6, final float var8) {
        final int meta = var1.getBlockMetadata() | 0x4;
        final int type = var1.getBlockMetadata() >> 2;
        GL11.glPushMatrix();
        GL11.glTranslatef((float)var2 + 0.5f, (float)var4 + 1.5f, (float)var6 + 0.5f);
        GL11.glRotatef(180.0f, 0.0f, 0.0f, 1.0f);
        GL11.glRotatef((float)(90 * meta), 0.0f, 1.0f, 0.0f);
        if (type == 0) {
            this.bindTexture(BlockMailboxRenderer.text1);
            this.model.render(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f);
        }
        if (type == 1) {
            this.bindTexture(BlockMailboxRenderer.text2);
            this.model2.render(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f);
        }
        GL11.glPopMatrix();
    }
    
    public void renderInventoryBlock(final Block block, final int metadata, final int modelID, final RenderBlocks renderer) {
        GL11.glPushMatrix();
        GL11.glTranslatef(0.0f, 0.74f, 0.0f);
        GL11.glScalef(0.9f, 0.86f, 0.9f);
        GL11.glRotatef(180.0f, 0.0f, 0.0f, 1.0f);
        GL11.glRotatef(180.0f, 0.0f, 1.0f, 0.0f);
        if (metadata == 0) {
            this.bindTexture(BlockMailboxRenderer.text1);
            this.model.render(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f);
        }
        if (metadata == 1) {
            this.bindTexture(BlockMailboxRenderer.text2);
            this.model2.render(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f);
        }
        GL11.glPopMatrix();
    }
    
    public boolean renderWorldBlock(final IBlockAccess world, final int x, final int y, final int z, final Block block, final int modelId, final RenderBlocks renderer) {
        return false;
    }
    
    public int getRenderId() {
        return CustomItems.mailbox.getRenderType();
    }
    
    public boolean shouldRender3DInInventory(final int modelId) {
        return true;
    }
    
    static {
        text1 = new ResourceLocation("customnpcs", "textures/models/mailbox1.png");
        text2 = new ResourceLocation("customnpcs", "textures/models/mailbox2.png");
    }
}
