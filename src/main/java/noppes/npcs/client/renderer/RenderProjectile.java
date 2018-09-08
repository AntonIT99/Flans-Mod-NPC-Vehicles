// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.renderer;

import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.util.IIcon;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionHelper;
import net.minecraft.item.ItemPotion;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.TextureMap;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.MathHelper;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.Tessellator;
import org.lwjgl.opengl.GL11;
import noppes.npcs.entity.EntityProjectile;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.util.ResourceLocation;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.entity.Render;

@SideOnly(Side.CLIENT)
public class RenderProjectile extends Render
{
    public boolean renderWithColor;
    private static final ResourceLocation arrowTextures;
    private static final ResourceLocation RES_ITEM_GLINT;
    private RenderBlocks itemRenderBlocks;
    
    public RenderProjectile() {
        this.renderWithColor = true;
        this.itemRenderBlocks = new RenderBlocks();
    }
    
    public void doRenderProjectile(final EntityProjectile par1EntityProjectile, final double par2, final double par4, final double par6, final float par8, final float par9) {
        GL11.glPushMatrix();
        GL11.glTranslatef((float)par2, (float)par4, (float)par6);
        GL11.glEnable(32826);
        final float f = par1EntityProjectile.getDataWatcher().getWatchableObjectInt(23) / 10.0f;
        final ItemStack item = par1EntityProjectile.getItemDisplay();
        GL11.glScalef(f, f, f);
        final Tessellator tessellator = Tessellator.instance;
        if (par1EntityProjectile.isArrow()) {
            this.bindEntityTexture((Entity)par1EntityProjectile);
            GL11.glRotatef(par1EntityProjectile.prevRotationYaw + (par1EntityProjectile.rotationYaw - par1EntityProjectile.prevRotationYaw) * par9 - 90.0f, 0.0f, 1.0f, 0.0f);
            GL11.glRotatef(par1EntityProjectile.prevRotationPitch + (par1EntityProjectile.rotationPitch - par1EntityProjectile.prevRotationPitch) * par9, 0.0f, 0.0f, 1.0f);
            final byte b0 = 0;
            final float f2 = 0.0f;
            final float f3 = 0.5f;
            final float f4 = (0 + b0 * 10) / 32.0f;
            final float f5 = (5 + b0 * 10) / 32.0f;
            final float f6 = 0.0f;
            final float f7 = 0.15625f;
            final float f8 = (5 + b0 * 10) / 32.0f;
            final float f9 = (10 + b0 * 10) / 32.0f;
            final float f10 = 0.05625f;
            GL11.glEnable(32826);
            final float f11 = par1EntityProjectile.arrowShake - par9;
            if (f11 > 0.0f) {
                final float f12 = -MathHelper.sin(f11 * 3.0f) * f11;
                GL11.glRotatef(f12, 0.0f, 0.0f, 1.0f);
            }
            GL11.glRotatef(45.0f, 1.0f, 0.0f, 0.0f);
            GL11.glScalef(f10, f10, f10);
            GL11.glTranslatef(-4.0f, 0.0f, 0.0f);
            GL11.glNormal3f(f10, 0.0f, 0.0f);
            tessellator.startDrawingQuads();
            tessellator.addVertexWithUV(-7.0, -2.0, -2.0, (double)f6, (double)f8);
            tessellator.addVertexWithUV(-7.0, -2.0, 2.0, (double)f7, (double)f8);
            tessellator.addVertexWithUV(-7.0, 2.0, 2.0, (double)f7, (double)f9);
            tessellator.addVertexWithUV(-7.0, 2.0, -2.0, (double)f6, (double)f9);
            tessellator.draw();
            GL11.glNormal3f(-f10, 0.0f, 0.0f);
            tessellator.startDrawingQuads();
            tessellator.addVertexWithUV(-7.0, 2.0, -2.0, (double)f6, (double)f8);
            tessellator.addVertexWithUV(-7.0, 2.0, 2.0, (double)f7, (double)f8);
            tessellator.addVertexWithUV(-7.0, -2.0, 2.0, (double)f7, (double)f9);
            tessellator.addVertexWithUV(-7.0, -2.0, -2.0, (double)f6, (double)f9);
            tessellator.draw();
            for (int i = 0; i < 4; ++i) {
                GL11.glRotatef(90.0f, 1.0f, 0.0f, 0.0f);
                GL11.glNormal3f(0.0f, 0.0f, f10);
                tessellator.startDrawingQuads();
                tessellator.addVertexWithUV(-8.0, -2.0, 0.0, (double)f2, (double)f4);
                tessellator.addVertexWithUV(8.0, -2.0, 0.0, (double)f3, (double)f4);
                tessellator.addVertexWithUV(8.0, 2.0, 0.0, (double)f3, (double)f5);
                tessellator.addVertexWithUV(-8.0, 2.0, 0.0, (double)f2, (double)f5);
                tessellator.draw();
            }
        }
        else if (par1EntityProjectile.is3D()) {
            GL11.glRotatef(par1EntityProjectile.prevRotationYaw + (par1EntityProjectile.rotationYaw - par1EntityProjectile.prevRotationYaw) * par9 - 90.0f, 0.0f, 1.0f, 0.0f);
            GL11.glRotatef(par1EntityProjectile.prevRotationPitch + (par1EntityProjectile.rotationPitch - par1EntityProjectile.prevRotationPitch) * par9 - 180.0f, 0.0f, 0.0f, 1.0f);
            if (item.getItemSpriteNumber() == 0 && item.getItem() instanceof ItemBlock && RenderBlocks.renderItemIn3d(Block.getBlockFromItem(item.getItem()).getRenderType())) {
                final Block block = Block.getBlockFromItem(item.getItem());
                this.bindTexture(TextureMap.locationBlocksTexture);
                float f13 = 0.25f;
                final int j = block.getRenderType();
                if (j == 1 || j == 19 || j == 12 || j == 2) {
                    f13 = 0.5f;
                }
                final float f14 = 1.0f;
                this.itemRenderBlocks.renderBlockAsItem(block, item.getItemDamage(), 1.0f);
            }
            else {
                GL11.glTranslatef(-0.6f, -0.6f, 0.0f);
                if (item.getItem().requiresMultipleRenderPasses()) {
                    for (int k = 0; k < item.getItem().getRenderPasses(item.getItemDamage()); ++k) {
                        final IIcon icon = item.getItem().getIcon(item, k);
                        final float f15 = 1.0f;
                        if (this.renderWithColor) {
                            final int l = item.getItem().getColorFromItemStack(item, k);
                            final float f16 = (l >> 16 & 0xFF) / 255.0f;
                            final float f17 = (l >> 8 & 0xFF) / 255.0f;
                            final float f18 = (l & 0xFF) / 255.0f;
                            GL11.glColor4f(f16 * f15, f17 * f15, f18 * f15, 1.0f);
                            this.renderManager.itemRenderer.renderItem((EntityLivingBase)Minecraft.getMinecraft().thePlayer, item, 0);
                        }
                        else {
                            this.renderManager.itemRenderer.renderItem((EntityLivingBase)Minecraft.getMinecraft().thePlayer, item, 0);
                        }
                    }
                }
                else {
                    final IIcon icon2 = item.getIconIndex();
                    if (this.renderWithColor) {
                        final int m = item.getItem().getColorFromItemStack(item, 0);
                        final float f15 = (m >> 16 & 0xFF) / 255.0f;
                        final float f19 = (m >> 8 & 0xFF) / 255.0f;
                        final float f16 = (m & 0xFF) / 255.0f;
                        final float f17 = 1.0f;
                        this.renderDroppedItem(item, icon2, par9, f15 * f17, f19 * f17, f16 * f17, f);
                    }
                    else {
                        this.renderDroppedItem(item, icon2, par9, 1.0f, 1.0f, 1.0f, f);
                    }
                }
            }
        }
        else {
            final IIcon icon3 = item.getItem().getIconFromDamage(item.getItemDamage());
            this.bindTexture(TextureMap.locationItemsTexture);
            if (item.getItem().requiresMultipleRenderPasses()) {
                for (int k2 = 0; k2 < item.getItem().getRenderPasses(item.getItemDamage()); ++k2) {
                    final int i2 = item.getItem().getColorFromItemStack(item, k2);
                    final float f14 = (i2 >> 16 & 0xFF) / 255.0f;
                    final float f20 = (i2 >> 8 & 0xFF) / 255.0f;
                    final float f6 = (i2 & 0xFF) / 255.0f;
                    GL11.glColor4f(f14, f20, f6, 1.0f);
                }
            }
            if (icon3 == ItemPotion.func_94589_d("bottle_splash") || icon3 == ItemPotion.func_94589_d("bottle_drinkable")) {
                final int var12 = PotionHelper.func_77915_a(item.getItemDamage(), false);
                final float var13 = (var12 >> 16 & 0xFF) / 255.0f;
                final float var14 = (var12 >> 8 & 0xFF) / 255.0f;
                final float var15 = (var12 & 0xFF) / 255.0f;
                GL11.glColor3f(var13, var14, var15);
                GL11.glPushMatrix();
                this.renderSprite(tessellator, ItemPotion.func_94589_d("overlay"));
                GL11.glPopMatrix();
                GL11.glColor3f(1.0f, 1.0f, 1.0f);
            }
            this.renderSprite(tessellator, icon3);
        }
        if (par1EntityProjectile.is3D() && par1EntityProjectile.glows()) {
            GL11.glDisable(2896);
        }
        GL11.glDisable(32826);
        GL11.glPopMatrix();
        GL11.glEnable(2896);
    }
    
    private void renderSprite(final Tessellator par1Tessellator, final IIcon par2Icon) {
        final float f = par2Icon.getMinU();
        final float f2 = par2Icon.getMaxU();
        final float f3 = par2Icon.getMinV();
        final float f4 = par2Icon.getMaxV();
        final float f5 = 1.0f;
        final float f6 = 0.5f;
        final float f7 = 0.25f;
        GL11.glRotatef(180.0f - this.renderManager.playerViewY, 0.0f, 1.0f, 0.0f);
        GL11.glRotatef(-this.renderManager.playerViewX, 1.0f, 0.0f, 0.0f);
        par1Tessellator.startDrawingQuads();
        par1Tessellator.setNormal(0.0f, 1.0f, 0.0f);
        par1Tessellator.addVertexWithUV((double)(0.0f - f6), (double)(0.0f - f7), 0.0, (double)f, (double)f4);
        par1Tessellator.addVertexWithUV((double)(f5 - f6), (double)(0.0f - f7), 0.0, (double)f2, (double)f4);
        par1Tessellator.addVertexWithUV((double)(f5 - f6), (double)(f5 - f7), 0.0, (double)f2, (double)f3);
        par1Tessellator.addVertexWithUV((double)(0.0f - f6), (double)(f5 - f7), 0.0, (double)f, (double)f3);
        par1Tessellator.draw();
    }
    
    private void renderDroppedItem(final ItemStack item, IIcon par2Icon, final float par4, final float par5, final float par6, final float par7, final float par8) {
        final Tessellator tessellator = Tessellator.instance;
        if (par2Icon == null) {
            final TextureManager texturemanager = Minecraft.getMinecraft().getTextureManager();
            final ResourceLocation resourcelocation = texturemanager.getResourceLocation(item.getItemSpriteNumber());
            par2Icon = ((TextureMap)texturemanager.getTexture(resourcelocation)).registerIcon("missingno");
        }
        final float f4 = par2Icon.getMinU();
        final float f5 = par2Icon.getMaxU();
        final float f6 = par2Icon.getMinV();
        final float f7 = par2Icon.getMaxV();
        final float f8 = 1.0f;
        final float f9 = 0.5f;
        final float f10 = 0.25f;
        final float f11 = 0.0625f;
        if (item.getItemSpriteNumber() == 0) {
            this.bindTexture(TextureMap.locationBlocksTexture);
        }
        else {
            this.bindTexture(TextureMap.locationItemsTexture);
        }
        GL11.glColor4f(par5, par6, par7, 1.0f);
        ItemRenderer.renderItemIn2D(tessellator, f5, f6, f4, f7, par2Icon.getIconWidth(), par2Icon.getIconHeight(), f11);
        if (item != null && item.hasEffect(0)) {
            GL11.glDepthFunc(514);
            GL11.glDisable(2896);
            this.renderManager.renderEngine.bindTexture(RenderProjectile.RES_ITEM_GLINT);
            GL11.glEnable(3042);
            GL11.glBlendFunc(768, 1);
            final float f12 = 0.76f;
            GL11.glColor4f(0.5f * f12, 0.25f * f12, 0.8f * f12, 1.0f);
            GL11.glMatrixMode(5890);
            GL11.glPushMatrix();
            GL11.glScalef(par8, par8, par8);
            float f13 = Minecraft.getSystemTime() % 3000L / 3000.0f * 8.0f;
            GL11.glTranslatef(f13, 0.0f, 0.0f);
            GL11.glRotatef(-50.0f, 0.0f, 0.0f, 1.0f);
            ItemRenderer.renderItemIn2D(tessellator, 0.0f, 0.0f, 1.0f, 1.0f, 255, 255, f11);
            GL11.glPopMatrix();
            GL11.glPushMatrix();
            GL11.glScalef(par8, par8, par8);
            f13 = Minecraft.getSystemTime() % 4873L / 4873.0f * 8.0f;
            GL11.glTranslatef(-f13, 0.0f, 0.0f);
            GL11.glRotatef(10.0f, 0.0f, 0.0f, 1.0f);
            ItemRenderer.renderItemIn2D(tessellator, 0.0f, 0.0f, 1.0f, 1.0f, 255, 255, f11);
            GL11.glPopMatrix();
            GL11.glMatrixMode(5888);
            GL11.glDisable(3042);
            GL11.glEnable(2896);
            GL11.glDepthFunc(515);
        }
    }
    
    public void doRender(final Entity par1Entity, final double par2, final double par4, final double par6, final float par8, final float par9) {
        this.doRenderProjectile((EntityProjectile)par1Entity, par2, par4, par6, par8, par9);
    }
    
    protected ResourceLocation func_110779_a(final EntityProjectile par1EntityProjectile) {
        return par1EntityProjectile.isArrow() ? RenderProjectile.arrowTextures : this.renderManager.renderEngine.getResourceLocation(par1EntityProjectile.getItemDisplay().getItemSpriteNumber());
    }
    
    protected ResourceLocation getEntityTexture(final Entity par1Entity) {
        return this.func_110779_a((EntityProjectile)par1Entity);
    }
    
    static {
        arrowTextures = new ResourceLocation("textures/entity/arrow.png");
        RES_ITEM_GLINT = new ResourceLocation("textures/misc/enchanted_item_glint.png");
    }
}
