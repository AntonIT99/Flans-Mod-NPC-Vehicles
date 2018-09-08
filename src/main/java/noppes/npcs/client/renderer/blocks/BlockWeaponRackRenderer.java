// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.renderer.blocks;

import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.Entity;
import org.lwjgl.opengl.GL11;
import noppes.npcs.blocks.tiles.TileWeaponRack;
import net.minecraft.tileentity.TileEntity;
import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;
import cpw.mods.fml.client.registry.RenderingRegistry;
import noppes.npcs.CustomItems;
import noppes.npcs.blocks.BlockWeaponRack;
import noppes.npcs.client.model.blocks.ModelWeaponRack;

public class BlockWeaponRackRenderer extends BlockRendererInterface
{
    private final ModelWeaponRack model;
    
    public BlockWeaponRackRenderer() {
        this.model = new ModelWeaponRack();
        ((BlockWeaponRack)CustomItems.weaponsRack).renderId = RenderingRegistry.getNextAvailableRenderId();
        RenderingRegistry.registerBlockHandler((ISimpleBlockRenderingHandler)this);
    }
    
    public void renderTileEntityAt(final TileEntity var1, final double var2, final double var4, final double var6, final float var8) {
        final TileWeaponRack tile = (TileWeaponRack)var1;
        GL11.glDisable(32826);
        GL11.glEnable(3008);
        GL11.glPushMatrix();
        GL11.glTranslatef((float)var2 + 0.5f, (float)var4 + 1.34f, (float)var6 + 0.5f);
        GL11.glScalef(0.9f, 0.9f, 0.9f);
        GL11.glRotatef(180.0f, 0.0f, 0.0f, 1.0f);
        GL11.glRotatef((float)(90 * tile.rotation), 0.0f, 1.0f, 0.0f);
        GL11.glColor3f(1.0f, 1.0f, 1.0f);
        this.setWoodTexture(var1.getBlockMetadata());
        this.model.render(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f);
        if (!this.playerTooFar(tile)) {
            for (int i = 0; i < 3; ++i) {
                this.doRender(tile.getStackInSlot(i), i);
            }
        }
        GL11.glPopMatrix();
    }
    
    private void doRender(final ItemStack item, final int pos) {
        if (item == null || item.getItem() == null || item.getItem() instanceof ItemBlock) {
            return;
        }
        GL11.glPushMatrix();
        GL11.glTranslatef(-0.4f + pos * 0.37f, 0.8f, 0.23f);
        GL11.glScalef(0.5f, 0.5f, 0.5f);
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
        GL11.glTranslatef(-0.3f, 0.15f, 0.0f);
        GL11.glScalef(0.9f, 0.7f, 0.9f);
        GL11.glRotatef(180.0f, 0.0f, 0.0f, 1.0f);
        GL11.glRotatef(180.0f, 0.0f, 1.0f, 0.0f);
        this.setWoodTexture(metadata);
        GL11.glColor3f(1.0f, 1.0f, 1.0f);
        this.model.render(null, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0625f);
        GL11.glPopMatrix();
    }
    
    public int getRenderId() {
        return CustomItems.weaponsRack.getRenderType();
    }
    
    @Override
    public int specialRenderDistance() {
        return 26;
    }
}
