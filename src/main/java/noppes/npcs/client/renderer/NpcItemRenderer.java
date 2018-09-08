// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.renderer;

import net.minecraft.util.IIcon;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.client.renderer.ItemRenderer;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;
import net.minecraft.entity.EntityLivingBase;
import noppes.npcs.items.ItemRenderInterface;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;

public class NpcItemRenderer implements IItemRenderer
{
    private static final ResourceLocation enchant;
    
    public boolean handleRenderType(final ItemStack item, final IItemRenderer.ItemRenderType type) {
        return type == IItemRenderer.ItemRenderType.EQUIPPED || type == IItemRenderer.ItemRenderType.EQUIPPED_FIRST_PERSON;
    }
    
    public boolean shouldUseRenderHelper(final IItemRenderer.ItemRenderType type, final ItemStack item, final IItemRenderer.ItemRendererHelper helper) {
        return false;
    }
    
    public void renderItem(final IItemRenderer.ItemRenderType type, final ItemStack par2ItemStack, final Object... data) {
        if (!(par2ItemStack.getItem() instanceof ItemRenderInterface)) {
            return;
        }
        final EntityLivingBase par1EntityLiving = (EntityLivingBase)data[1];
        GL11.glTranslatef(0.9375f, 0.0625f, 0.0f);
        GL11.glRotatef(-315.0f, 0.0f, 0.0f, 1.0f);
        ((ItemRenderInterface)par2ItemStack.getItem()).renderSpecial();
        GL11.glRotatef(-20.0f, 0.0f, 0.0f, 1.0f);
        GL11.glRotatef(-50.0f, 0.0f, 1.0f, 0.0f);
        GL11.glTranslatef(-0.09375f, 0.0625f, 0.0f);
        this.renderItem3d(par1EntityLiving, par2ItemStack);
    }
    
    public void renderItem3d(final EntityLivingBase par1EntityLiving, final ItemStack par2ItemStack) {
        final Minecraft mc = Minecraft.getMinecraft();
        final TextureManager texturemanager = mc.getTextureManager();
        final int par3 = 0;
        texturemanager.bindTexture(texturemanager.getResourceLocation(par2ItemStack.getItemSpriteNumber()));
        final Tessellator tessellator = Tessellator.instance;
        final IIcon icon = par1EntityLiving.getItemIcon(par2ItemStack, par3);
        if (icon == null) {
            return;
        }
        final float f = icon.getMinU();
        final float f2 = icon.getMaxU();
        final float f3 = icon.getMinV();
        final float f4 = icon.getMaxV();
        final float f5 = 0.0f;
        final float f6 = 0.3f;
        GL11.glEnable(32826);
        GL11.glTranslatef(-f5, -f6, 0.0f);
        final float f7 = 1.5f;
        GL11.glScalef(f7, f7, f7);
        GL11.glRotatef(50.0f, 0.0f, 1.0f, 0.0f);
        GL11.glRotatef(335.0f, 0.0f, 0.0f, 1.0f);
        GL11.glTranslatef(-0.9375f, -0.0625f, 0.0f);
        ItemRenderer.renderItemIn2D(tessellator, f2, f3, f, f4, icon.getIconWidth(), icon.getIconHeight(), 0.0625f);
        if (par2ItemStack.hasEffect(par3)) {
            GL11.glDepthFunc(514);
            GL11.glDisable(2896);
            texturemanager.bindTexture(NpcItemRenderer.enchant);
            GL11.glEnable(3042);
            GL11.glBlendFunc(768, 1);
            final float f8 = 0.76f;
            GL11.glColor4f(0.5f * f8, 0.25f * f8, 0.8f * f8, 1.0f);
            GL11.glMatrixMode(5890);
            GL11.glPushMatrix();
            final float f9 = 0.125f;
            GL11.glScalef(f9, f9, f9);
            float f10 = Minecraft.getSystemTime() % 3000L / 3000.0f * 8.0f;
            GL11.glTranslatef(f10, 0.0f, 0.0f);
            GL11.glRotatef(-50.0f, 0.0f, 0.0f, 1.0f);
            ItemRenderer.renderItemIn2D(tessellator, 0.0f, 0.0f, 1.0f, 1.0f, 256, 256, 0.0625f);
            GL11.glPopMatrix();
            GL11.glPushMatrix();
            GL11.glScalef(f9, f9, f9);
            f10 = Minecraft.getSystemTime() % 4873L / 4873.0f * 8.0f;
            GL11.glTranslatef(-f10, 0.0f, 0.0f);
            GL11.glRotatef(10.0f, 0.0f, 0.0f, 1.0f);
            ItemRenderer.renderItemIn2D(tessellator, 0.0f, 0.0f, 1.0f, 1.0f, 256, 256, 0.0625f);
            GL11.glPopMatrix();
            GL11.glMatrixMode(5888);
            GL11.glDisable(3042);
            GL11.glEnable(2896);
            GL11.glDepthFunc(515);
        }
        GL11.glDisable(32826);
    }
    
    static {
        enchant = new ResourceLocation("textures/misc/enchanted_item_glint.png");
    }
}
