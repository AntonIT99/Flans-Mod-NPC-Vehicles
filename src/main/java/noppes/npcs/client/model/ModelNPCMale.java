// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.model;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.MathHelper;
import noppes.npcs.constants.EnumAnimation;
import noppes.npcs.entity.EntityNPCInterface;
import org.lwjgl.opengl.GL11;
import net.minecraft.entity.Entity;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import noppes.npcs.CustomNpcs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.client.model.ModelBiped;

public class ModelNPCMale extends ModelBiped
{
    public boolean isDancing;
    public boolean isSleeping;
    public float animationTick;
    public float dancingTicks;
    
    public ModelNPCMale(final float f) {
        this.init(f, 0.0f);
    }
    
    public void setLivingAnimations(final EntityLivingBase par1EntityLiving, final float f6, final float f5, final float par9) {
        this.animationTick += par9;
        this.dancingTicks = CustomNpcs.ticks / 3.978873f;
    }
    
    public void init(final float f, final float f1) {
        this.heldItemLeft = 0;
        this.heldItemRight = 0;
        this.isSneak = false;
        this.aimedBow = false;
        this.bipedCloak = new ModelRenderer((ModelBase)this, 0, 0);
        this.bipedCloak.textureHeight = 32.0f;
        this.bipedCloak.addBox(-5.0f, 0.0f, -1.0f, 10, 16, 1, f);
        (this.bipedEars = new ModelRenderer((ModelBase)this, 24, 0)).addBox(-3.0f, -6.0f, -1.0f, 6, 6, 1, f);
        (this.bipedHead = new ModelRenderer((ModelBase)this, 0, 0)).addBox(-4.0f, -8.0f, -4.0f, 8, 8, 8, f);
        this.bipedHead.setRotationPoint(0.0f, 0.0f + f1, 0.0f);
        (this.bipedHeadwear = new ModelRenderer((ModelBase)this, 32, 0)).addBox(-4.0f, -8.0f, -4.0f, 8, 8, 8, f + 0.5f);
        this.bipedHeadwear.setRotationPoint(0.0f, 0.0f + f1, 0.0f);
        (this.bipedBody = new ModelRenderer((ModelBase)this, 16, 16)).addBox(-4.0f, 0.0f, -2.0f, 8, 12, 4, f);
        this.bipedBody.setRotationPoint(0.0f, 0.0f + f1, 0.0f);
        (this.bipedRightArm = new ModelRenderer((ModelBase)this, 40, 16)).addBox(-3.0f, -2.0f, -2.0f, 4, 12, 4, f);
        this.bipedRightArm.setRotationPoint(-5.0f, 2.0f + f1, 0.0f);
        this.bipedLeftArm = new ModelRenderer((ModelBase)this, 40, 16);
        this.bipedLeftArm.mirror = true;
        this.bipedLeftArm.addBox(-1.0f, -2.0f, -2.0f, 4, 12, 4, f);
        this.bipedLeftArm.setRotationPoint(5.0f, 2.0f + f1, 0.0f);
        (this.bipedRightLeg = new ModelRenderer((ModelBase)this, 0, 16)).addBox(-2.0f, 0.0f, -2.0f, 4, 12, 4, f);
        this.bipedRightLeg.setRotationPoint(-2.0f, 12.0f + f1, 0.0f);
        this.bipedLeftLeg = new ModelRenderer((ModelBase)this, 0, 16);
        this.bipedLeftLeg.mirror = true;
        this.bipedLeftLeg.addBox(-2.0f, 0.0f, -2.0f, 4, 12, 4, f);
        this.bipedLeftLeg.setRotationPoint(2.0f, 12.0f + f1, 0.0f);
    }
    
    public void render(final Entity par1Entity, final float par2, final float par3, final float par4, final float par5, final float par6, final float par7) {
        this.setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
        if (!this.isDancing) {
            this.bipedHead.render(par7);
            this.bipedBody.render(par7);
            this.bipedRightArm.render(par7);
            this.bipedLeftArm.render(par7);
            this.bipedRightLeg.render(par7);
            this.bipedLeftLeg.render(par7);
            this.bipedHeadwear.render(par7);
        }
        else {
            this.renderHead(par1Entity, par7);
            this.renderArms(par1Entity, par7);
            this.renderBody(par1Entity, par7);
            this.renderLegs(par1Entity, par7);
        }
    }
    
    public void renderHead(final Entity entityliving, final float par7) {
        if (this.isDancing) {
            GL11.glPushMatrix();
            GL11.glTranslatef((float)Math.sin(this.dancingTicks) * 0.075f, (float)Math.abs(Math.cos(this.dancingTicks)) * 0.125f - 0.02f, (float)(-Math.abs(Math.cos(this.dancingTicks))) * 0.075f);
            this.bipedHead.render(par7);
            this.bipedHeadwear.render(par7);
            GL11.glPopMatrix();
        }
        else {
            this.bipedHead.render(par7);
            this.bipedHeadwear.render(par7);
        }
    }
    
    public void renderLeftArm(final Entity entityliving, final float par7) {
        if (this.isDancing) {
            GL11.glPushMatrix();
            GL11.glTranslatef((float)Math.sin(this.dancingTicks) * 0.025f, (float)Math.abs(Math.cos(this.dancingTicks)) * 0.125f - 0.02f, 0.0f);
            this.bipedLeftArm.render(par7);
            GL11.glPopMatrix();
        }
        else {
            this.bipedLeftArm.render(par7);
        }
    }
    
    public void renderArms(final Entity entity, final float par7) {
        this.renderLeftArm(entity, par7);
        this.renderRightArm(entity, par7);
    }
    
    public void renderRightArm(final Entity entityliving, final float par7) {
        if (this.isDancing) {
            GL11.glPushMatrix();
            GL11.glTranslatef((float)Math.sin(this.dancingTicks) * 0.025f, (float)Math.abs(Math.cos(this.dancingTicks)) * 0.125f - 0.02f, 0.0f);
            this.bipedRightArm.render(par7);
            GL11.glPopMatrix();
        }
        else {
            this.bipedRightArm.render(par7);
        }
    }
    
    public void renderBody(final Entity entityliving, final float par7) {
        if (this.isDancing) {
            GL11.glPushMatrix();
            GL11.glTranslatef((float)Math.sin(this.dancingTicks) * 0.015f, 0.0f, 0.0f);
            this.bipedBody.render(par7);
            GL11.glPopMatrix();
        }
        else {
            this.bipedBody.render(par7);
        }
    }
    
    public void renderLegs(final Entity entityliving, final float par7) {
        this.bipedRightLeg.render(par7);
        this.bipedLeftLeg.render(par7);
    }
    
    public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity entity) {
        final EntityNPCInterface npc = (EntityNPCInterface)entity;
        this.isRiding = npc.isRiding();
        if (this.isSneak && (npc.currentAnimation == EnumAnimation.CRAWLING || npc.currentAnimation == EnumAnimation.LYING)) {
            this.isSneak = false;
        }
        this.bipedHead.rotateAngleY = par4 / 57.295776f;
        this.bipedHead.rotateAngleX = par5 / 57.295776f;
        this.bipedHeadwear.rotateAngleY = this.bipedHead.rotateAngleY;
        this.bipedHeadwear.rotateAngleX = this.bipedHead.rotateAngleX;
        this.bipedRightArm.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 2.0f * par2 * 0.5f;
        this.bipedLeftArm.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 2.0f * par2 * 0.5f;
        this.bipedRightArm.rotateAngleZ = 0.0f;
        this.bipedLeftArm.rotateAngleZ = 0.0f;
        this.bipedRightLeg.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 1.4f * par2;
        this.bipedLeftLeg.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 1.4f * par2;
        this.bipedRightLeg.rotateAngleY = 0.0f;
        this.bipedLeftLeg.rotateAngleY = 0.0f;
        if (this.isRiding) {
            final ModelRenderer bipedRightArm = this.bipedRightArm;
            bipedRightArm.rotateAngleX -= 0.62831855f;
            final ModelRenderer bipedLeftArm = this.bipedLeftArm;
            bipedLeftArm.rotateAngleX -= 0.62831855f;
            this.bipedRightLeg.rotateAngleX = -1.2566371f;
            this.bipedLeftLeg.rotateAngleX = -1.2566371f;
            this.bipedRightLeg.rotateAngleY = 0.31415927f;
            this.bipedLeftLeg.rotateAngleY = -0.31415927f;
        }
        if (this.heldItemLeft != 0) {
            this.bipedLeftArm.rotateAngleX = this.bipedLeftArm.rotateAngleX * 0.5f - 0.31415927f * this.heldItemLeft;
        }
        if (this.heldItemRight != 0) {
            this.bipedRightArm.rotateAngleX = this.bipedRightArm.rotateAngleX * 0.5f - 0.31415927f * this.heldItemRight;
        }
        this.bipedRightArm.rotateAngleY = 0.0f;
        this.bipedLeftArm.rotateAngleY = 0.0f;
        if (this.onGround > -9990.0f) {
            float f = this.onGround;
            this.bipedBody.rotateAngleY = MathHelper.sin(MathHelper.sqrt_float(f) * 3.1415927f * 2.0f) * 0.2f;
            this.bipedRightArm.rotationPointZ = MathHelper.sin(this.bipedBody.rotateAngleY) * 5.0f;
            this.bipedRightArm.rotationPointX = -MathHelper.cos(this.bipedBody.rotateAngleY) * 5.0f;
            this.bipedLeftArm.rotationPointZ = -MathHelper.sin(this.bipedBody.rotateAngleY) * 5.0f;
            this.bipedLeftArm.rotationPointX = MathHelper.cos(this.bipedBody.rotateAngleY) * 5.0f;
            final ModelRenderer bipedRightArm2 = this.bipedRightArm;
            bipedRightArm2.rotateAngleY += this.bipedBody.rotateAngleY;
            final ModelRenderer bipedLeftArm2 = this.bipedLeftArm;
            bipedLeftArm2.rotateAngleY += this.bipedBody.rotateAngleY;
            final ModelRenderer bipedLeftArm3 = this.bipedLeftArm;
            bipedLeftArm3.rotateAngleX += this.bipedBody.rotateAngleY;
            f = 1.0f - this.onGround;
            f *= f;
            f *= f;
            f = 1.0f - f;
            final float f2 = MathHelper.sin(f * 3.1415927f);
            final float f3 = MathHelper.sin(this.onGround * 3.1415927f) * -(this.bipedHead.rotateAngleX - 0.7f) * 0.75f;
            final ModelRenderer bipedRightArm3 = this.bipedRightArm;
            bipedRightArm3.rotateAngleX -= (float)(f2 * 1.2 + f3);
            final ModelRenderer bipedRightArm4 = this.bipedRightArm;
            bipedRightArm4.rotateAngleY += this.bipedBody.rotateAngleY * 2.0f;
            this.bipedRightArm.rotateAngleZ = MathHelper.sin(this.onGround * 3.1415927f) * -0.4f;
        }
        if (this.isSneak) {
            this.bipedBody.rotateAngleX = 0.5f;
            final ModelRenderer bipedRightLeg = this.bipedRightLeg;
            bipedRightLeg.rotateAngleX -= 0.0f;
            final ModelRenderer bipedLeftLeg = this.bipedLeftLeg;
            bipedLeftLeg.rotateAngleX -= 0.0f;
            final ModelRenderer bipedRightArm5 = this.bipedRightArm;
            bipedRightArm5.rotateAngleX += 0.4f;
            final ModelRenderer bipedLeftArm4 = this.bipedLeftArm;
            bipedLeftArm4.rotateAngleX += 0.4f;
            this.bipedRightLeg.rotationPointZ = 4.0f;
            this.bipedLeftLeg.rotationPointZ = 4.0f;
            this.bipedRightLeg.rotationPointY = 9.0f;
            this.bipedLeftLeg.rotationPointY = 9.0f;
            this.bipedHead.rotationPointY = 1.0f;
        }
        else {
            this.bipedBody.rotateAngleX = 0.0f;
            this.bipedRightLeg.rotationPointZ = 0.0f;
            this.bipedLeftLeg.rotationPointZ = 0.0f;
            this.bipedRightLeg.rotationPointY = 12.0f;
            this.bipedLeftLeg.rotationPointY = 12.0f;
            this.bipedHead.rotationPointY = 0.0f;
        }
        final ModelRenderer bipedRightArm6 = this.bipedRightArm;
        bipedRightArm6.rotateAngleZ += MathHelper.cos(par3 * 0.09f) * 0.05f + 0.05f;
        final ModelRenderer bipedLeftArm5 = this.bipedLeftArm;
        bipedLeftArm5.rotateAngleZ -= MathHelper.cos(par3 * 0.09f) * 0.05f + 0.05f;
        final ModelRenderer bipedRightArm7 = this.bipedRightArm;
        bipedRightArm7.rotateAngleX += MathHelper.sin(par3 * 0.067f) * 0.05f;
        final ModelRenderer bipedLeftArm6 = this.bipedLeftArm;
        bipedLeftArm6.rotateAngleX -= MathHelper.sin(par3 * 0.067f) * 0.05f;
        if (this.aimedBow) {
            final float f4 = 0.0f;
            final float f5 = 0.0f;
            this.bipedRightArm.rotateAngleZ = 0.0f;
            this.bipedLeftArm.rotateAngleZ = 0.0f;
            this.bipedRightArm.rotateAngleY = -(0.1f - f4 * 0.6f) + this.bipedHead.rotateAngleY;
            this.bipedLeftArm.rotateAngleY = 0.1f - f4 * 0.6f + this.bipedHead.rotateAngleY + 0.4f;
            this.bipedRightArm.rotateAngleX = -1.5707964f + this.bipedHead.rotateAngleX;
            this.bipedLeftArm.rotateAngleX = -1.5707964f + this.bipedHead.rotateAngleX;
            final ModelRenderer bipedRightArm8 = this.bipedRightArm;
            bipedRightArm8.rotateAngleX -= f4 * 1.2f - f5 * 0.4f;
            final ModelRenderer bipedLeftArm7 = this.bipedLeftArm;
            bipedLeftArm7.rotateAngleX -= f4 * 1.2f - f5 * 0.4f;
            final ModelRenderer bipedRightArm9 = this.bipedRightArm;
            bipedRightArm9.rotateAngleZ += MathHelper.cos(par3 * 0.09f) * 0.05f + 0.05f;
            final ModelRenderer bipedLeftArm8 = this.bipedLeftArm;
            bipedLeftArm8.rotateAngleZ -= MathHelper.cos(par3 * 0.09f) * 0.05f + 0.05f;
            final ModelRenderer bipedRightArm10 = this.bipedRightArm;
            bipedRightArm10.rotateAngleX += MathHelper.sin(par3 * 0.067f) * 0.05f;
            final ModelRenderer bipedLeftArm9 = this.bipedLeftArm;
            bipedLeftArm9.rotateAngleX -= MathHelper.sin(par3 * 0.067f) * 0.05f;
        }
    }
    
    public void renderEars(final float f) {
        this.bipedEars.rotateAngleY = this.bipedHead.rotateAngleY;
        this.bipedEars.rotateAngleX = this.bipedHead.rotateAngleX;
        this.bipedEars.rotationPointX = 0.0f;
        this.bipedEars.rotationPointY = 0.0f;
        this.bipedEars.render(f);
    }
    
    public void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
    
    public void renderCloak(final float f) {
        this.bipedCloak.render(f);
    }
    
    public boolean isSleeping(final Entity entity) {
        return (entity instanceof EntityPlayer && ((EntityPlayer)entity).isPlayerSleeping()) || ((EntityNPCInterface)entity).currentAnimation == EnumAnimation.LYING;
    }
}
