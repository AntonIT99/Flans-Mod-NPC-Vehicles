// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.renderer;

import net.minecraft.init.Items;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EntityLiving;
import java.awt.image.BufferedImage;
import net.minecraft.client.resources.IResource;
import java.io.IOException;
import java.awt.Color;
import javax.imageio.ImageIO;
import net.minecraft.client.Minecraft;
import noppes.npcs.entity.EntityNpcPony;
import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import org.lwjgl.opengl.GL11;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.item.ItemArmor;
import noppes.npcs.entity.EntityNPCInterface;
import net.minecraft.client.model.ModelBase;
import noppes.npcs.client.model.ModelPonyArmor;
import noppes.npcs.client.model.ModelPony;

public class RenderNPCPony extends RenderNPCInterface
{
    private ModelPony modelBipedMain;
    private ModelPonyArmor modelArmorChestplate;
    private ModelPonyArmor modelArmor;
    
    public RenderNPCPony() {
        super(new ModelPony(0.0f), 0.5f);
        this.modelBipedMain = (ModelPony)this.mainModel;
        this.modelArmorChestplate = new ModelPonyArmor(1.0f);
        this.modelArmor = new ModelPonyArmor(0.5f);
    }
    
    protected int setArmorModel(final EntityNPCInterface entityplayer, final int i, final float f) {
        final ItemStack itemstack = entityplayer.inventory.armorItemInSlot(i);
        if (itemstack != null) {
            final Item item = itemstack.getItem();
            if (item instanceof ItemArmor) {
                final ItemArmor itemarmor = (ItemArmor)item;
                this.bindTexture(RenderBiped.getArmorResource((Entity)entityplayer, itemstack, i, (String)null));
                final ModelPonyArmor modelbiped = (i != 2) ? this.modelArmorChestplate : this.modelArmor;
                modelbiped.head.showModel = (i == 0);
                modelbiped.Body.showModel = (i == 1);
                modelbiped.BodyBack.showModel = (i == 1);
                modelbiped.rightarm.showModel = (i == 3);
                modelbiped.LeftArm.showModel = (i == 3);
                modelbiped.RightLeg.showModel = (i == 3);
                modelbiped.LeftLeg.showModel = (i == 3);
                modelbiped.rightarm2.showModel = (i == 2);
                modelbiped.LeftArm2.showModel = (i == 2);
                modelbiped.RightLeg2.showModel = (i == 2);
                modelbiped.LeftLeg2.showModel = (i == 2);
                this.setRenderPassModel((ModelBase)modelbiped);
                final float var8 = 1.0f;
                if (itemarmor.getArmorMaterial() != ItemArmor.ArmorMaterial.CLOTH) {
                    GL11.glColor3f(var8, var8, var8);
                    return itemstack.isItemEnchanted() ? 15 : 1;
                }
                final int var9 = itemarmor.getColor(itemstack);
                final float var10 = (var9 >> 16 & 0xFF) / 255.0f;
                final float var11 = (var9 >> 8 & 0xFF) / 255.0f;
                final float var12 = (var9 & 0xFF) / 255.0f;
                GL11.glColor3f(var8 * var10, var8 * var11, var8 * var12);
                if (itemstack.isItemEnchanted()) {
                    return 31;
                }
                return 16;
            }
        }
        return -1;
    }
    
    @Override
    public ResourceLocation getEntityTexture(final Entity entity) {
        final EntityNpcPony pony = (EntityNpcPony)entity;
        final boolean check = pony.textureLocation == null || pony.textureLocation != pony.checked;
        final ResourceLocation loc = super.getEntityTexture((Entity)pony);
        if (check) {
            try {
                final IResource resource = Minecraft.getMinecraft().getResourceManager().getResource(loc);
                final BufferedImage bufferedimage = ImageIO.read(resource.getInputStream());
                pony.isPegasus = false;
                pony.isUnicorn = false;
                final Color color = new Color(bufferedimage.getRGB(0, 0), true);
                final Color color2 = new Color(249, 177, 49, 255);
                final Color color3 = new Color(136, 202, 240, 255);
                final Color color4 = new Color(209, 159, 228, 255);
                final Color color5 = new Color(254, 249, 252, 255);
                if (color.equals(color2)) {}
                if (color.equals(color3)) {
                    pony.isPegasus = true;
                }
                if (color.equals(color4)) {
                    pony.isUnicorn = true;
                }
                if (color.equals(color5)) {
                    pony.isPegasus = true;
                    pony.isUnicorn = true;
                }
                pony.checked = loc;
            }
            catch (IOException ex) {}
        }
        return loc;
    }
    
    public void renderPlayer(final EntityNpcPony pony, final double d, final double d1, final double d2, final float f, final float f1) {
        final ItemStack itemstack = pony.getHeldItem();
        this.setRenderPassModel((ModelBase)this.modelBipedMain);
        final ModelPonyArmor modelArmorChestplate = this.modelArmorChestplate;
        final ModelPonyArmor modelArmor = this.modelArmor;
        final ModelPony modelBipedMain = this.modelBipedMain;
        final boolean heldItemRight;
        final boolean b = heldItemRight = (((itemstack == null) ? 0 : 1) != 0);
        modelBipedMain.heldItemRight = (b ? 1 : 0);
        modelArmor.heldItemRight = (b ? 1 : 0);
        modelArmorChestplate.heldItemRight = (heldItemRight ? 1 : 0);
        final ModelPonyArmor modelArmorChestplate2 = this.modelArmorChestplate;
        final ModelPonyArmor modelArmor2 = this.modelArmor;
        final ModelPony modelBipedMain2 = this.modelBipedMain;
        final boolean sneaking = pony.isSneaking();
        modelBipedMain2.isSneak = sneaking;
        modelArmor2.isSneak = sneaking;
        modelArmorChestplate2.isSneak = sneaking;
        final ModelPonyArmor modelArmorChestplate3 = this.modelArmorChestplate;
        final ModelPonyArmor modelArmor3 = this.modelArmor;
        final ModelPony modelBipedMain3 = this.modelBipedMain;
        final boolean isRiding = false;
        modelBipedMain3.isRiding = isRiding;
        modelArmor3.isRiding = isRiding;
        modelArmorChestplate3.isRiding = isRiding;
        final ModelPonyArmor modelArmorChestplate4 = this.modelArmorChestplate;
        final ModelPonyArmor modelArmor4 = this.modelArmor;
        final ModelPony modelBipedMain4 = this.modelBipedMain;
        final boolean playerSleeping = pony.isPlayerSleeping();
        modelBipedMain4.isSleeping = playerSleeping;
        modelArmor4.isSleeping = playerSleeping;
        modelArmorChestplate4.isSleeping = playerSleeping;
        final ModelPonyArmor modelArmorChestplate5 = this.modelArmorChestplate;
        final ModelPonyArmor modelArmor5 = this.modelArmor;
        final ModelPony modelBipedMain5 = this.modelBipedMain;
        final boolean isUnicorn = pony.isUnicorn;
        modelBipedMain5.isUnicorn = isUnicorn;
        modelArmor5.isUnicorn = isUnicorn;
        modelArmorChestplate5.isUnicorn = isUnicorn;
        final ModelPonyArmor modelArmorChestplate6 = this.modelArmorChestplate;
        final ModelPonyArmor modelArmor6 = this.modelArmor;
        final ModelPony modelBipedMain6 = this.modelBipedMain;
        final boolean isPegasus = pony.isPegasus;
        modelBipedMain6.isPegasus = isPegasus;
        modelArmor6.isPegasus = isPegasus;
        modelArmorChestplate6.isPegasus = isPegasus;
        double d3 = d1 - pony.yOffset;
        if (pony.isSneaking()) {
            d3 -= 0.125;
        }
        super.doRender((EntityLiving)pony, d, d3, d2, f, f1);
        final ModelPonyArmor modelArmorChestplate7 = this.modelArmorChestplate;
        final ModelPonyArmor modelArmor7 = this.modelArmor;
        final ModelPony modelBipedMain7 = this.modelBipedMain;
        final boolean aimedBow = false;
        modelBipedMain7.aimedBow = aimedBow;
        modelArmor7.aimedBow = aimedBow;
        modelArmorChestplate7.aimedBow = aimedBow;
        final ModelPonyArmor modelArmorChestplate8 = this.modelArmorChestplate;
        final ModelPonyArmor modelArmor8 = this.modelArmor;
        final ModelPony modelBipedMain8 = this.modelBipedMain;
        final boolean isRiding2 = false;
        modelBipedMain8.isRiding = isRiding2;
        modelArmor8.isRiding = isRiding2;
        modelArmorChestplate8.isRiding = isRiding2;
        final ModelPonyArmor modelArmorChestplate9 = this.modelArmorChestplate;
        final ModelPonyArmor modelArmor9 = this.modelArmor;
        final ModelPony modelBipedMain9 = this.modelBipedMain;
        final boolean isSneak = false;
        modelBipedMain9.isSneak = isSneak;
        modelArmor9.isSneak = isSneak;
        modelArmorChestplate9.isSneak = isSneak;
        final ModelPonyArmor modelArmorChestplate10 = this.modelArmorChestplate;
        final ModelPonyArmor modelArmor10 = this.modelArmor;
        final ModelPony modelBipedMain10 = this.modelBipedMain;
        final boolean heldItemRight2 = false;
        modelBipedMain10.heldItemRight = (heldItemRight2 ? 1 : 0);
        modelArmor10.heldItemRight = (heldItemRight2 ? 1 : 0);
        modelArmorChestplate10.heldItemRight = (heldItemRight2 ? 1 : 0);
    }
    
    protected void renderSpecials(final EntityNpcPony entityplayer, final float f) {
        super.renderEquippedItems((EntityLivingBase)entityplayer, f);
        if (!entityplayer.isPlayerSleeping()) {
            if (entityplayer.isUnicorn) {
                this.renderDrop(this.renderManager, entityplayer, this.modelBipedMain.unicornarm, 1.0f, 0.35f, 0.5375f, -0.45f);
            }
            else {
                this.renderDrop(this.renderManager, entityplayer, this.modelBipedMain.RightArm, 1.0f, -0.0625f, 0.8375f, 0.0625f);
            }
        }
    }
    
    protected void renderDrop(final RenderManager rendermanager, final EntityNpcPony entityplayer, final ModelRenderer modelrenderer, final float f, final float f1, final float f2, final float f3) {
        final ItemStack itemstack = entityplayer.getHeldItem();
        if (itemstack == null) {
            return;
        }
        GL11.glPushMatrix();
        if (modelrenderer != null) {
            modelrenderer.postRender(f * 0.0625f);
        }
        GL11.glTranslatef(f1, f2, f3);
        if (itemstack.getItem() instanceof ItemBlock && RenderBlocks.renderItemIn3d(Block.getBlockFromItem(itemstack.getItem()).getRenderType())) {
            GL11.glTranslatef(0.0f, 0.1875f, -0.3125f);
            GL11.glRotatef(20.0f, 1.0f, 0.0f, 0.0f);
            GL11.glRotatef(45.0f, 0.0f, 1.0f, 0.0f);
            final float f4 = 0.375f * f;
            GL11.glScalef(f4, -f4, f4);
        }
        else if (itemstack.getItem() == Items.bow) {
            GL11.glTranslatef(0.0f, 0.125f, 0.3125f);
            GL11.glRotatef(-20.0f, 0.0f, 1.0f, 0.0f);
            final float f5 = 0.625f * f;
            GL11.glScalef(f5, -f5, f5);
            GL11.glRotatef(-100.0f, 1.0f, 0.0f, 0.0f);
            GL11.glRotatef(45.0f, 0.0f, 1.0f, 0.0f);
        }
        else if (itemstack.getItem().isFull3D()) {
            if (itemstack.getItem().shouldRotateAroundWhenRendering()) {
                GL11.glRotatef(180.0f, 0.0f, 0.0f, 1.0f);
                GL11.glTranslatef(0.0f, -0.125f, 0.0f);
            }
            GL11.glTranslatef(0.0f, 0.1875f, 0.0f);
            final float f6 = 0.625f * f;
            GL11.glScalef(f6, -f6, f6);
            GL11.glRotatef(-100.0f, 1.0f, 0.0f, 0.0f);
            GL11.glRotatef(45.0f, 0.0f, 1.0f, 0.0f);
        }
        else {
            GL11.glTranslatef(0.25f, 0.1875f, -0.1875f);
            final float f7 = 0.375f * f;
            GL11.glScalef(f7, f7, f7);
            GL11.glRotatef(60.0f, 0.0f, 0.0f, 1.0f);
            GL11.glRotatef(-90.0f, 1.0f, 0.0f, 0.0f);
            GL11.glRotatef(20.0f, 0.0f, 0.0f, 1.0f);
        }
        if (itemstack.getItem() == Items.potionitem) {
            for (int j = 0; j <= 1; ++j) {
                final int k = itemstack.getItem().getColorFromItemStack(itemstack, j);
                final float f8 = (k >> 16 & 0xFF) / 255.0f;
                final float f9 = (k >> 8 & 0xFF) / 255.0f;
                final float f10 = (k & 0xFF) / 255.0f;
                GL11.glColor4f(f8, f9, f10, 1.0f);
                this.renderManager.itemRenderer.renderItem((EntityLivingBase)entityplayer, itemstack, j);
            }
        }
        else {
            rendermanager.itemRenderer.renderItem((EntityLivingBase)entityplayer, itemstack, 0);
        }
        GL11.glPopMatrix();
    }
    
    protected int shouldRenderPass(final EntityLivingBase entityliving, final int i, final float f) {
        return this.setArmorModel((EntityNPCInterface)entityliving, i, f);
    }
    
    protected void renderEquippedItems(final EntityLivingBase entityliving, final float f) {
        this.renderSpecials((EntityNpcPony)entityliving, f);
    }
    
    @Override
    public void doRender(final EntityLiving entityliving, final double d, final double d1, final double d2, final float f, final float f1) {
        this.renderPlayer((EntityNpcPony)entityliving, d, d1, d2, f, f1);
    }
    
    public void doRender(final Entity entity, final double d, final double d1, final double d2, final float f, final float f1) {
        this.renderPlayer((EntityNpcPony)entity, d, d1, d2, f, f1);
    }
}
