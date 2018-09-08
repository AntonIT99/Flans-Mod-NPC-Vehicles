// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.renderer.blocks;

import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;
import noppes.npcs.blocks.tiles.TilePedestal;
import net.minecraft.tileentity.TileEntity;
import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;
import cpw.mods.fml.client.registry.RenderingRegistry;
import noppes.npcs.CustomItems;
import noppes.npcs.blocks.BlockRotated;
import net.minecraft.util.ResourceLocation;
import noppes.npcs.client.model.blocks.ModelPedestal;
import net.minecraft.client.entity.EntityPlayerSP;

public class BlockPedestalRenderer extends BlockRendererInterface
{
    private final ModelPedestal model;
    private static final ResourceLocation resource;
    
    public BlockPedestalRenderer() {
        this.model = new ModelPedestal();
        ((BlockRotated)CustomItems.pedestal).renderId = RenderingRegistry.getNextAvailableRenderId();
        RenderingRegistry.registerBlockHandler((ISimpleBlockRenderingHandler)this);
    }
    
    public void renderTileEntityAt(final TileEntity var1, final double var2, final double var4, final double var6, final float var8) {
        final TilePedestal tile = (TilePedestal)var1;
        GL11.glDisable(32826);
        GL11.glEnable(3008);
        GL11.glPushMatrix();
        GL11.glTranslatef((float)var2 + 0.5f, (float)var4 + 1.5f, (float)var6 + 0.5f);
        GL11.glRotatef(180.0f, 0.0f, 0.0f, 1.0f);
        GL11.glRotatef((float)(90 * tile.rotation), 0.0f, 1.0f, 0.0f);
        GL11.glColor3f(1.0f, 1.0f, 1.0f);
        BlockRendererInterface.setMaterialTexture(var1.getBlockMetadata());
        this.model.render(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f);
        GL11.glScalef(1.0f, 0.99f, 1.0f);
        final TextureManager manager = Minecraft.getMinecraft().getTextureManager();
        manager.bindTexture(BlockPedestalRenderer.resource);
        this.model.render(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f);
        if (!this.playerTooFar(tile)) {
            this.doRender(tile.getStackInSlot(0));
        }
        GL11.glPopMatrix();
        GL11.glColor3f(1.0f, 1.0f, 1.0f);
    }
    
    private void doRender(final ItemStack item) {
        if (item == null || item.getItem() == null || item.getItem() instanceof ItemBlock) {
            return;
        }
        GL11.glPushMatrix();
        GL11.glTranslatef(0.06f, 0.3f, 0.02f);
        GL11.glRotatef(180.0f, 0.0f, 0.0f, 1.0f);
        GL11.glRotatef(90.0f, 0.0f, 1.0f, 0.0f);
        GL11.glScalef(0.6f, 0.6f, 0.6f);
        if (item.getItem().shouldRotateAroundWhenRendering()) {
            GL11.glTranslatef(0.14f, 0.0f, 0.5f);
            GL11.glRotatef(90.0f, 0.0f, 1.0f, 0.0f);
        }
        else {
            GL11.glRotatef(-90.0f, 0.0f, 1.0f, 0.0f);
        }
        GL11.glRotatef(-200.0f, 0.0f, 0.0f, 1.0f);
        GL11.glRotatef(-50.0f, 0.0f, 1.0f, 0.0f);
        if (item.getItem().requiresMultipleRenderPasses()) {
            for (int k = 0; k <= item.getItem().getRenderPasses(item.getItemDamage()); ++k) {
                final int i = item.getItem().getColorFromItemStack(item, k);
                final float f12 = (i >> 16 & 0xFF) / 255.0f;
                final float f13 = (i >> 8 & 0xFF) / 255.0f;
                final float f14 = (i & 0xFF) / 255.0f;
                GL11.glColor4f(f12, f13, f14, 1.0f);
                RenderManager.instance.itemRenderer.renderItem((EntityLivingBase)Minecraft.getMinecraft().thePlayer, item, k);
            }
        }
        else {
            final int k = item.getItem().getColorFromItemStack(item, 0);
            final float f15 = (k >> 16 & 0xFF) / 255.0f;
            final float f12 = (k >> 8 & 0xFF) / 255.0f;
            final float f13 = (k & 0xFF) / 255.0f;
            GL11.glColor4f(f15, f12, f13, 1.0f);
            RenderManager.instance.itemRenderer.renderItem((EntityLivingBase)Minecraft.getMinecraft().thePlayer, item, 0);
        }
        GL11.glPopMatrix();
    }
    
    public void renderInventoryBlock(final Block block, final int metadata, final int modelId, final RenderBlocks renderer) {
        GL11.glPushMatrix();
        GL11.glTranslatef(0.0f, 0.44f, 0.0f);
        GL11.glScalef(0.76f, 0.66f, 0.76f);
        GL11.glRotatef(180.0f, 0.0f, 0.0f, 1.0f);
        GL11.glRotatef(180.0f, 0.0f, 1.0f, 0.0f);
        BlockRendererInterface.setMaterialTexture(metadata);
        GL11.glColor3f(1.0f, 1.0f, 1.0f);
        this.model.render(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f);
        GL11.glPopMatrix();
    }
    
    public int getRenderId() {
        return CustomItems.pedestal.getRenderType();
    }
    
    @Override
    public int specialRenderDistance() {
        return 40;
    }
    
    static {
        resource = new ResourceLocation("customnpcs:textures/models/npcPedestal.png");
    }
}
