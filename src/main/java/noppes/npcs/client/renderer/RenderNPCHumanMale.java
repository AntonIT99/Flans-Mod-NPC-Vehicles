// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.renderer;

import noppes.npcs.items.ItemClaw;
import noppes.npcs.items.ItemShield;
import net.minecraft.init.Items;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.client.IItemRenderer;
import noppes.npcs.entity.EntityCustomNpc;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.renderer.OpenGlHelper;
import noppes.npcs.constants.EnumAnimation;
import noppes.npcs.entity.EntityNPCInterface;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import org.lwjgl.opengl.GL11;
import net.minecraft.entity.EntityLivingBase;
import net.minecraftforge.client.ForgeHooksClient;
import net.minecraft.entity.Entity;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.item.ItemArmor;
import net.minecraft.entity.EntityLiving;
import net.minecraft.client.model.ModelBase;
import noppes.npcs.client.model.ModelNPCMale;

public class RenderNPCHumanMale extends RenderNPCInterface
{
    private ModelNPCMale modelBipedMain;
    protected ModelNPCMale modelArmorChestplate;
    protected ModelNPCMale modelArmor;
    
    public RenderNPCHumanMale(final ModelNPCMale mainmodel, final ModelNPCMale armorChest, final ModelNPCMale armor) {
        super((ModelBase)mainmodel, 0.5f);
        this.modelBipedMain = mainmodel;
        this.modelArmorChestplate = armorChest;
        this.modelArmor = armor;
    }
    
    protected int func_130006_a(final EntityLiving par1EntityLiving, final int par2, final float par3) {
        final ItemStack itemstack = par1EntityLiving.func_130225_q(3 - par2);
        if (itemstack != null) {
            final Item item = itemstack.getItem();
            if (item instanceof ItemArmor) {
                final ItemArmor itemarmor = (ItemArmor)item;
                this.bindTexture(RenderBiped.getArmorResource((Entity)par1EntityLiving, itemstack, par2, (String)null));
                ModelBiped modelbiped = (par2 == 2) ? this.modelArmor : this.modelArmorChestplate;
                modelbiped.bipedHead.showModel = (par2 == 0);
                modelbiped.bipedHeadwear.showModel = (par2 == 0);
                modelbiped.bipedBody.showModel = (par2 == 1 || par2 == 2);
                modelbiped.bipedRightArm.showModel = (par2 == 1);
                modelbiped.bipedLeftArm.showModel = (par2 == 1);
                modelbiped.bipedRightLeg.showModel = (par2 == 2 || par2 == 3);
                modelbiped.bipedLeftLeg.showModel = (par2 == 2 || par2 == 3);
                modelbiped = ForgeHooksClient.getArmorModel((EntityLivingBase)par1EntityLiving, itemstack, par2, modelbiped);
                this.setRenderPassModel((ModelBase)modelbiped);
                modelbiped.onGround = this.mainModel.onGround;
                modelbiped.isRiding = this.mainModel.isRiding;
                modelbiped.isChild = this.mainModel.isChild;
                final float f1 = 1.0f;
                final int j = itemarmor.getColor(itemstack);
                if (j != -1) {
                    final float f2 = (j >> 16 & 0xFF) / 255.0f;
                    final float f3 = (j >> 8 & 0xFF) / 255.0f;
                    final float f4 = (j & 0xFF) / 255.0f;
                    GL11.glColor3f(f1 * f2, f1 * f3, f1 * f4);
                    if (itemstack.isItemEnchanted()) {
                        return 31;
                    }
                    return 16;
                }
                else {
                    GL11.glColor3f(f1, f1, f1);
                    if (itemstack.isItemEnchanted()) {
                        return 15;
                    }
                    return 1;
                }
            }
        }
        return -1;
    }
    
    protected int shouldRenderPass(final EntityLivingBase par1EntityLivingBase, final int par2, final float par3) {
        return this.func_130006_a((EntityLiving)par1EntityLivingBase, par2, par3);
    }
    
    public void renderPlayer(final EntityNPCInterface npc, final double d, final double d1, final double d2, final float f, final float f1) {
        final ItemStack itemstack = npc.getHeldItem();
        final ModelNPCMale modelArmorChestplate = this.modelArmorChestplate;
        final ModelNPCMale modelArmor = this.modelArmor;
        final ModelNPCMale modelBipedMain = this.modelBipedMain;
        int heldItemRight3;
        int heldItemRight2;
        final int heldItemRight = (itemstack == null) ? (heldItemRight2 = (heldItemRight3 = 0)) : ((npc.hurtResistantTime > 0) ? (heldItemRight2 = (heldItemRight3 = 3)) : (heldItemRight2 = (heldItemRight3 = 1)));
        modelBipedMain.heldItemRight = heldItemRight2;
        modelArmor.heldItemRight = heldItemRight;
        modelArmorChestplate.heldItemRight = heldItemRight3;
        final ModelNPCMale modelArmorChestplate2 = this.modelArmorChestplate;
        final ModelNPCMale modelArmor2 = this.modelArmor;
        final ModelNPCMale modelBipedMain2 = this.modelBipedMain;
        int heldItemLeft3;
        int heldItemLeft2;
        final int heldItemLeft = (npc.getOffHand() == null) ? (heldItemLeft2 = (heldItemLeft3 = 0)) : ((npc.hurtResistantTime > 0) ? (heldItemLeft2 = (heldItemLeft3 = 3)) : (heldItemLeft2 = (heldItemLeft3 = 1)));
        modelBipedMain2.heldItemLeft = heldItemLeft2;
        modelArmor2.heldItemLeft = heldItemLeft;
        modelArmorChestplate2.heldItemLeft = heldItemLeft3;
        final ModelNPCMale modelArmorChestplate3 = this.modelArmorChestplate;
        final ModelNPCMale modelArmor3 = this.modelArmor;
        final ModelNPCMale modelBipedMain3 = this.modelBipedMain;
        final boolean sneaking = npc.isSneaking();
        modelBipedMain3.isSneak = sneaking;
        modelArmor3.isSneak = sneaking;
        modelArmorChestplate3.isSneak = sneaking;
        final ModelNPCMale modelArmorChestplate4 = this.modelArmorChestplate;
        final ModelNPCMale modelArmor4 = this.modelArmor;
        final ModelNPCMale modelBipedMain4 = this.modelBipedMain;
        final boolean playerSleeping = npc.isPlayerSleeping();
        modelBipedMain4.isSleeping = playerSleeping;
        modelArmor4.isSleeping = playerSleeping;
        modelArmorChestplate4.isSleeping = playerSleeping;
        final ModelNPCMale modelArmorChestplate5 = this.modelArmorChestplate;
        final ModelNPCMale modelArmor5 = this.modelArmor;
        final ModelNPCMale modelBipedMain5 = this.modelBipedMain;
        final boolean isDancing;
        final boolean b = isDancing = (((npc.currentAnimation == EnumAnimation.DANCING) ? 1 : 0) != 0);
        modelBipedMain5.isDancing = b;
        modelArmor5.isDancing = b;
        modelArmorChestplate5.isDancing = isDancing;
        final ModelNPCMale modelArmorChestplate6 = this.modelArmorChestplate;
        final ModelNPCMale modelArmor6 = this.modelArmor;
        final ModelNPCMale modelBipedMain6 = this.modelBipedMain;
        final boolean aimedBow;
        final boolean b2 = aimedBow = (((npc.currentAnimation == EnumAnimation.AIMING) ? 1 : 0) != 0);
        modelBipedMain6.aimedBow = b2;
        modelArmor6.aimedBow = b2;
        modelArmorChestplate6.aimedBow = aimedBow;
        final ModelNPCMale modelArmorChestplate7 = this.modelArmorChestplate;
        final ModelNPCMale modelArmor7 = this.modelArmor;
        final ModelNPCMale modelBipedMain7 = this.modelBipedMain;
        final boolean riding = npc.isRiding();
        modelBipedMain7.isRiding = riding;
        modelArmor7.isRiding = riding;
        modelArmorChestplate7.isRiding = riding;
        double d3 = d1 - npc.yOffset;
        if (npc.isSneaking()) {
            d3 -= 0.125;
        }
        super.doRender((EntityLiving)npc, d, d3, d2, f, f1);
        final ModelNPCMale modelArmorChestplate8 = this.modelArmorChestplate;
        final ModelNPCMale modelArmor8 = this.modelArmor;
        final ModelNPCMale modelBipedMain8 = this.modelBipedMain;
        final boolean aimedBow2 = false;
        modelBipedMain8.aimedBow = aimedBow2;
        modelArmor8.aimedBow = aimedBow2;
        modelArmorChestplate8.aimedBow = aimedBow2;
        final ModelNPCMale modelArmorChestplate9 = this.modelArmorChestplate;
        final ModelNPCMale modelArmor9 = this.modelArmor;
        final ModelNPCMale modelBipedMain9 = this.modelBipedMain;
        final boolean isSneak = false;
        modelBipedMain9.isSneak = isSneak;
        modelArmor9.isSneak = isSneak;
        modelArmorChestplate9.isSneak = isSneak;
        final ModelNPCMale modelArmorChestplate10 = this.modelArmorChestplate;
        final ModelNPCMale modelArmor10 = this.modelArmor;
        final ModelNPCMale modelBipedMain10 = this.modelBipedMain;
        final boolean heldItemRight4 = false;
        modelBipedMain10.heldItemRight = (heldItemRight4 ? 1 : 0);
        modelArmor10.heldItemRight = (heldItemRight4 ? 1 : 0);
        modelArmorChestplate10.heldItemRight = (heldItemRight4 ? 1 : 0);
        final ModelNPCMale modelArmorChestplate11 = this.modelArmorChestplate;
        final ModelNPCMale modelArmor11 = this.modelArmor;
        final ModelNPCMale modelBipedMain11 = this.modelBipedMain;
        final boolean heldItemLeft4 = false;
        modelBipedMain11.heldItemLeft = (heldItemLeft4 ? 1 : 0);
        modelArmor11.heldItemLeft = (heldItemLeft4 ? 1 : 0);
        modelArmorChestplate11.heldItemLeft = (heldItemLeft4 ? 1 : 0);
    }
    
    protected void renderSpecials(final EntityNPCInterface npc, final float f) {
        super.renderEquippedItems((EntityLivingBase)npc, f);
        GL11.glColor3f(1.0f, 1.0f, 1.0f);
        final int i = npc.getBrightnessForRender(f);
        final int j = i % 65536;
        final int k = i / 65536;
        OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, j / 1.0f, k / 1.0f);
        if (!npc.display.cloakTexture.isEmpty()) {
            if (npc.textureCloakLocation == null) {
                npc.textureCloakLocation = new ResourceLocation(npc.display.cloakTexture);
            }
            this.bindTexture(npc.textureCloakLocation);
            GL11.glPushMatrix();
            GL11.glTranslatef(0.0f, 0.0f, 0.125f);
            final double d = npc.field_20066_r + (npc.field_20063_u - npc.field_20066_r) * f - (npc.prevPosX + (npc.posX - npc.prevPosX) * f);
            final double d2 = npc.field_20065_s + (npc.field_20062_v - npc.field_20065_s) * f - (npc.prevPosY + (npc.posY - npc.prevPosY) * f);
            final double d3 = npc.field_20064_t + (npc.field_20061_w - npc.field_20064_t) * f - (npc.prevPosZ + (npc.posZ - npc.prevPosZ) * f);
            final float f2 = npc.prevRenderYawOffset + (npc.renderYawOffset - npc.prevRenderYawOffset) * f;
            final double d4 = MathHelper.sin(f2 * 3.141593f / 180.0f);
            final double d5 = -MathHelper.cos(f2 * 3.141593f / 180.0f);
            float f3 = (float)(d * d4 + d3 * d5) * 100.0f;
            final float f4 = (float)(d * d5 - d3 * d4) * 100.0f;
            if (f3 < 0.0f) {
                f3 = 0.0f;
            }
            final float f5 = npc.prevRotationYaw + (npc.rotationYaw - npc.prevRotationYaw) * f;
            float f6 = 5.0f;
            if (npc.isSneaking()) {
                f6 += 25.0f;
            }
            GL11.glRotatef(6.0f + f3 / 2.0f + f6, 1.0f, 0.0f, 0.0f);
            GL11.glRotatef(f4 / 2.0f, 0.0f, 0.0f, 1.0f);
            GL11.glRotatef(-f4 / 2.0f, 0.0f, 1.0f, 0.0f);
            GL11.glRotatef(180.0f, 0.0f, 1.0f, 0.0f);
            this.modelBipedMain.renderCloak(0.0625f);
            GL11.glPopMatrix();
        }
        GL11.glColor3f(1.0f, 1.0f, 1.0f);
        final ItemStack itemstack = npc.inventory.armorItemInSlot(0);
        if (itemstack != null) {
            GL11.glPushMatrix();
            if (npc instanceof EntityCustomNpc) {
                final EntityCustomNpc cnpc = (EntityCustomNpc)npc;
                GL11.glTranslatef(0.0f, cnpc.modelData.getBodyY(), 0.0f);
                this.modelBipedMain.bipedHead.postRender(0.0625f);
                GL11.glScalef(cnpc.modelData.head.scaleX, cnpc.modelData.head.scaleY, cnpc.modelData.head.scaleZ);
            }
            else {
                this.modelBipedMain.bipedHead.postRender(0.0625f);
            }
            final IItemRenderer customRenderer = MinecraftForgeClient.getItemRenderer(itemstack, IItemRenderer.ItemRenderType.EQUIPPED);
            final boolean is3D = customRenderer != null && customRenderer.shouldUseRenderHelper(IItemRenderer.ItemRenderType.EQUIPPED, itemstack, IItemRenderer.ItemRendererHelper.BLOCK_3D);
            if (itemstack.getItem() instanceof ItemBlock) {
                if (is3D || RenderBlocks.renderItemIn3d(Block.getBlockFromItem(itemstack.getItem()).getRenderType())) {
                    final float var6 = 0.625f;
                    GL11.glTranslatef(0.0f, -0.25f, 0.0f);
                    GL11.glRotatef(90.0f, 0.0f, 1.0f, 0.0f);
                    GL11.glScalef(var6, -var6, -var6);
                }
                this.renderManager.itemRenderer.renderItem((EntityLivingBase)npc, itemstack, 0);
            }
            GL11.glPopMatrix();
        }
        GL11.glColor3f(1.0f, 1.0f, 1.0f);
        ItemStack itemstack2 = npc.getHeldItem();
        if (itemstack2 != null) {
            GL11.glPushMatrix();
            float y = 0.0f;
            float x = 0.0f;
            if (npc instanceof EntityCustomNpc) {
                final EntityCustomNpc cnpc2 = (EntityCustomNpc)npc;
                y = (cnpc2.modelData.arms.scaleY - 1.0f) * 0.7f;
                x = (1.0f - cnpc2.modelData.body.scaleX) * 0.28f + (1.0f - cnpc2.modelData.arms.scaleX) * 0.175f;
                GL11.glTranslatef(x, cnpc2.modelData.getBodyY(), 0.0f);
            }
            this.modelBipedMain.bipedRightArm.postRender(0.0625f);
            GL11.glTranslatef(-0.0625f, 0.4375f + y, 0.0625f);
            final IItemRenderer customRenderer2 = MinecraftForgeClient.getItemRenderer(itemstack2, IItemRenderer.ItemRenderType.EQUIPPED);
            final boolean is3D2 = customRenderer2 != null && customRenderer2.shouldUseRenderHelper(IItemRenderer.ItemRenderType.EQUIPPED, itemstack2, IItemRenderer.ItemRendererHelper.BLOCK_3D);
            if (itemstack2.getItem() instanceof ItemBlock && (is3D2 || RenderBlocks.renderItemIn3d(Block.getBlockFromItem(itemstack2.getItem()).getRenderType()))) {
                float var7 = 0.5f;
                GL11.glTranslatef(0.0f, 0.1875f, -0.3125f);
                var7 *= 0.75f;
                GL11.glRotatef(20.0f, 1.0f, 0.0f, 0.0f);
                GL11.glRotatef(45.0f, 0.0f, 1.0f, 0.0f);
                GL11.glScalef(-var7, -var7, var7);
            }
            else if (itemstack2.getItem() == Items.bow) {
                final float var7 = 0.625f;
                GL11.glTranslatef(0.0f, 0.125f, 0.3125f);
                GL11.glRotatef(-20.0f, 0.0f, 1.0f, 0.0f);
                GL11.glScalef(var7, -var7, var7);
                GL11.glRotatef(-100.0f, 1.0f, 0.0f, 0.0f);
                GL11.glRotatef(45.0f, 0.0f, 1.0f, 0.0f);
            }
            else if (itemstack2.getItem().isFull3D()) {
                final float var7 = 0.625f;
                if (itemstack2.getItem().shouldRotateAroundWhenRendering()) {
                    GL11.glRotatef(180.0f, 0.0f, 0.0f, 1.0f);
                    GL11.glTranslatef(0.0f, -0.125f, 0.0f);
                }
                if (npc.hurtResistantTime > 0 && npc.stats.resistances.playermelee > 1.0f) {
                    GL11.glTranslatef(0.05f, 0.0f, -0.1f);
                    GL11.glRotatef(-50.0f, 0.0f, 1.0f, 0.0f);
                    GL11.glRotatef(-10.0f, 1.0f, 0.0f, 0.0f);
                    GL11.glRotatef(-60.0f, 0.0f, 0.0f, 1.0f);
                }
                GL11.glTranslatef(0.0f, 0.1875f, 0.0f);
                GL11.glScalef(var7, -var7, var7);
                GL11.glRotatef(-100.0f, 1.0f, 0.0f, 0.0f);
                GL11.glRotatef(45.0f, 0.0f, 1.0f, 0.0f);
            }
            else {
                final float var7 = 0.375f;
                GL11.glTranslatef(0.25f, 0.1875f, -0.1875f);
                GL11.glScalef(var7, var7, var7);
                GL11.glRotatef(60.0f, 0.0f, 0.0f, 1.0f);
                GL11.glRotatef(-90.0f, 1.0f, 0.0f, 0.0f);
                GL11.glRotatef(20.0f, 0.0f, 0.0f, 1.0f);
            }
            if (itemstack2.getItem().requiresMultipleRenderPasses()) {
                for (int var8 = 0; var8 < itemstack2.getItem().getRenderPasses(itemstack2.getItemDamage()); ++var8) {
                    final int var9 = itemstack2.getItem().getColorFromItemStack(itemstack2, var8);
                    final float var10 = (var9 >> 16 & 0xFF) / 255.0f;
                    final float var11 = (var9 >> 8 & 0xFF) / 255.0f;
                    final float var12 = (var9 & 0xFF) / 255.0f;
                    GL11.glColor4f(var10, var11, var12, 1.0f);
                    this.renderManager.itemRenderer.renderItem((EntityLivingBase)npc, itemstack2, var8);
                }
            }
            else {
                this.renderManager.itemRenderer.renderItem((EntityLivingBase)npc, itemstack2, 0);
            }
            GL11.glPopMatrix();
        }
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        itemstack2 = npc.getOffHand();
        if (itemstack2 != null) {
            GL11.glPushMatrix();
            float y2 = 0.0f;
            float x2 = 0.0f;
            if (npc instanceof EntityCustomNpc) {
                final EntityCustomNpc cnpc3 = (EntityCustomNpc)npc;
                y2 = (cnpc3.modelData.arms.scaleY - 1.0f) * 0.7f;
                x2 = (1.0f - cnpc3.modelData.body.scaleX) * -0.28f + (1.0f - cnpc3.modelData.arms.scaleX) * -0.175f;
                GL11.glTranslatef(x2, cnpc3.modelData.getBodyY(), 0.0f);
            }
            this.modelBipedMain.bipedLeftArm.postRender(0.0625f);
            GL11.glTranslatef(0.0625f, 0.4375f + y2, 0.0625f);
            final IItemRenderer customRenderer2 = MinecraftForgeClient.getItemRenderer(itemstack2, IItemRenderer.ItemRenderType.EQUIPPED);
            final boolean is3D2 = customRenderer2 != null && customRenderer2.shouldUseRenderHelper(IItemRenderer.ItemRenderType.EQUIPPED, itemstack2, IItemRenderer.ItemRendererHelper.BLOCK_3D);
            if (itemstack2.getItem() instanceof ItemShield || itemstack2.getItem() instanceof ItemClaw) {
                GL11.glTranslatef(0.3f, 0.0f, 0.0f);
            }
            if (itemstack2.getItem() instanceof ItemBlock && (is3D2 || RenderBlocks.renderItemIn3d(Block.getBlockFromItem(itemstack2.getItem()).getRenderType()))) {
                float var13 = 0.5f;
                GL11.glTranslatef(0.0f, 0.1875f, -0.3125f);
                var13 *= 0.75f;
                GL11.glRotatef(20.0f, 1.0f, 0.0f, 0.0f);
                GL11.glRotatef(45.0f, 0.0f, 1.0f, 0.0f);
                GL11.glScalef(var13, -var13, var13);
            }
            else if (itemstack2.getItem() == Items.bow) {
                final float var13 = 0.625f;
                GL11.glTranslatef(0.0f, 0.125f, 0.3125f);
                GL11.glRotatef(-20.0f, 0.0f, 1.0f, 0.0f);
                GL11.glScalef(var13, -var13, var13);
                GL11.glRotatef(-100.0f, 1.0f, 0.0f, 0.0f);
                GL11.glRotatef(45.0f, 0.0f, 1.0f, 0.0f);
            }
            else if (itemstack2.getItem().isFull3D()) {
                final float var13 = 0.625f;
                if (itemstack2.getItem().shouldRotateAroundWhenRendering()) {
                    GL11.glRotatef(180.0f, 0.0f, 0.0f, 1.0f);
                    GL11.glTranslatef(0.0f, -0.125f, 0.0f);
                }
                if (npc.hurtResistantTime > 0 && npc.stats.resistances.arrow > 1.0f) {
                    GL11.glTranslatef(0.05f, 0.0f, -0.1f);
                    GL11.glRotatef(50.0f, 0.0f, 1.0f, 0.0f);
                    GL11.glRotatef(-10.0f, 1.0f, 0.0f, 0.0f);
                    GL11.glRotatef(60.0f, 0.0f, 0.0f, 1.0f);
                }
                GL11.glTranslatef(0.0f, 0.1875f, 0.0f);
                GL11.glScalef(var13, -var13, var13);
                GL11.glRotatef(-100.0f, 1.0f, 0.0f, 0.0f);
                GL11.glRotatef(45.0f, 0.0f, 1.0f, 0.0f);
            }
            else {
                final float var13 = 0.375f;
                GL11.glTranslatef(0.25f, 0.1875f, -0.1875f);
                GL11.glScalef(var13, var13, var13);
                GL11.glRotatef(60.0f, 0.0f, 0.0f, 1.0f);
                GL11.glRotatef(-90.0f, 1.0f, 0.0f, 0.0f);
                GL11.glRotatef(20.0f, 0.0f, 0.0f, 1.0f);
            }
            if (itemstack2.getItem().requiresMultipleRenderPasses()) {
                for (int var8 = 0; var8 < itemstack2.getItem().getRenderPasses(itemstack2.getItemDamage()); ++var8) {
                    final int var9 = itemstack2.getItem().getColorFromItemStack(itemstack2, var8);
                    final float var10 = (var9 >> 16 & 0xFF) / 255.0f;
                    final float var11 = (var9 >> 8 & 0xFF) / 255.0f;
                    final float var12 = (var9 & 0xFF) / 255.0f;
                    GL11.glColor4f(var10, var11, var12, 1.0f);
                    this.renderManager.itemRenderer.renderItem((EntityLivingBase)npc, itemstack2, var8);
                }
            }
            else {
                this.renderManager.itemRenderer.renderItem((EntityLivingBase)npc, itemstack2, 0);
            }
            GL11.glPopMatrix();
        }
    }
    
    protected void renderEquippedItems(final EntityLivingBase entityliving, final float f) {
        this.renderSpecials((EntityNPCInterface)entityliving, f);
    }
    
    @Override
    public void doRender(final EntityLiving entityliving, final double d, final double d1, final double d2, final float f, final float f1) {
        this.renderPlayer((EntityNPCInterface)entityliving, d, d1, d2, f, f1);
    }
    
    public void doRender(final Entity entity, final double d, final double d1, final double d2, final float f, final float f1) {
        this.renderPlayer((EntityNPCInterface)entity, d, d1, d2, f, f1);
    }
}
