// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.model;

import net.minecraft.util.MathHelper;
import noppes.npcs.constants.EnumAnimation;
import noppes.npcs.entity.EntityNPCInterface;
import net.minecraft.entity.Entity;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBase;

public class ModelPonyArmor extends ModelBase
{
    private boolean rainboom;
    public ModelRenderer head;
    public ModelRenderer Body;
    public ModelRenderer BodyBack;
    public ModelRenderer rightarm;
    public ModelRenderer LeftArm;
    public ModelRenderer RightLeg;
    public ModelRenderer LeftLeg;
    public ModelRenderer rightarm2;
    public ModelRenderer LeftArm2;
    public ModelRenderer RightLeg2;
    public ModelRenderer LeftLeg2;
    public boolean isPegasus;
    public boolean isUnicorn;
    public boolean isSleeping;
    public boolean isFlying;
    public boolean isGlow;
    public boolean isSneak;
    public boolean aimedBow;
    public int heldItemRight;
    
    public ModelPonyArmor(final float f) {
        this.isPegasus = false;
        this.isUnicorn = false;
        this.isSleeping = false;
        this.isFlying = false;
        this.isGlow = false;
        this.isSneak = false;
        this.init(f, 0.0f);
    }
    
    public void init(final float strech, final float f) {
        final float f2 = 0.0f;
        final float f3 = 0.0f;
        final float f4 = 0.0f;
        (this.head = new ModelRenderer((ModelBase)this, 0, 0)).addBox(-4.0f, -4.0f, -6.0f, 8, 8, 8, strech);
        this.head.setRotationPoint(f2, f3, f4);
        final float f5 = 0.0f;
        final float f6 = 0.0f;
        final float f7 = 0.0f;
        (this.Body = new ModelRenderer((ModelBase)this, 16, 16)).addBox(-4.0f, 4.0f, -2.0f, 8, 8, 4, strech);
        this.Body.setRotationPoint(f5, f6 + f, f7);
        (this.BodyBack = new ModelRenderer((ModelBase)this, 0, 0)).addBox(-4.0f, 4.0f, 6.0f, 8, 8, 8, strech);
        this.BodyBack.setRotationPoint(f5, f6 + f, f7);
        (this.rightarm = new ModelRenderer((ModelBase)this, 0, 16)).addBox(-2.0f, 4.0f, -2.0f, 4, 12, 4, strech);
        this.rightarm.setRotationPoint(-3.0f, 8.0f + f, 0.0f);
        this.LeftArm = new ModelRenderer((ModelBase)this, 0, 16);
        this.LeftArm.mirror = true;
        this.LeftArm.addBox(-2.0f, 4.0f, -2.0f, 4, 12, 4, strech);
        this.LeftArm.setRotationPoint(3.0f, 8.0f + f, 0.0f);
        (this.RightLeg = new ModelRenderer((ModelBase)this, 0, 16)).addBox(-2.0f, 4.0f, -2.0f, 4, 12, 4, strech);
        this.RightLeg.setRotationPoint(-3.0f, 0.0f + f, 0.0f);
        this.LeftLeg = new ModelRenderer((ModelBase)this, 0, 16);
        this.LeftLeg.mirror = true;
        this.LeftLeg.addBox(-2.0f, 4.0f, -2.0f, 4, 12, 4, strech);
        this.LeftLeg.setRotationPoint(3.0f, 0.0f + f, 0.0f);
        (this.rightarm2 = new ModelRenderer((ModelBase)this, 0, 16)).addBox(-2.0f, 4.0f, -2.0f, 4, 12, 4, strech * 0.5f);
        this.rightarm2.setRotationPoint(-3.0f, 8.0f + f, 0.0f);
        this.LeftArm2 = new ModelRenderer((ModelBase)this, 0, 16);
        this.LeftArm2.mirror = true;
        this.LeftArm2.addBox(-2.0f, 4.0f, -2.0f, 4, 12, 4, strech * 0.5f);
        this.LeftArm2.setRotationPoint(3.0f, 8.0f + f, 0.0f);
        (this.RightLeg2 = new ModelRenderer((ModelBase)this, 0, 16)).addBox(-2.0f, 4.0f, -2.0f, 4, 12, 4, strech * 0.5f);
        this.RightLeg2.setRotationPoint(-3.0f, 0.0f + f, 0.0f);
        this.LeftLeg2 = new ModelRenderer((ModelBase)this, 0, 16);
        this.LeftLeg2.mirror = true;
        this.LeftLeg2.addBox(-2.0f, 4.0f, -2.0f, 4, 12, 4, strech * 0.5f);
        this.LeftLeg2.setRotationPoint(3.0f, 0.0f + f, 0.0f);
    }
    
    public void setRotationAngles(final float f, final float f1, final float f2, final float f3, final float f4, final float f5, final Entity entity) {
        final EntityNPCInterface npc = (EntityNPCInterface)entity;
        if (!this.isRiding) {
            this.isRiding = (npc.currentAnimation == EnumAnimation.SITTING);
        }
        if (this.isSneak && (npc.currentAnimation == EnumAnimation.CRAWLING || npc.currentAnimation == EnumAnimation.LYING)) {
            this.isSneak = false;
        }
        this.rainboom = false;
        float f6;
        float f7;
        if (this.isSleeping) {
            f6 = 1.4f;
            f7 = 0.1f;
        }
        else {
            f6 = f3 / 57.29578f;
            f7 = f4 / 57.29578f;
        }
        this.head.rotateAngleY = f6;
        this.head.rotateAngleX = f7;
        float f8;
        float f9;
        float f10;
        float f11;
        if (!this.isFlying || !this.isPegasus) {
            f8 = MathHelper.cos(f * 0.6662f + 3.141593f) * 0.6f * f1;
            f9 = MathHelper.cos(f * 0.6662f) * 0.6f * f1;
            f10 = MathHelper.cos(f * 0.6662f) * 0.3f * f1;
            f11 = MathHelper.cos(f * 0.6662f + 3.141593f) * 0.3f * f1;
            this.rightarm.rotateAngleY = 0.0f;
            this.LeftArm.rotateAngleY = 0.0f;
            this.RightLeg.rotateAngleY = 0.0f;
            this.LeftLeg.rotateAngleY = 0.0f;
            this.rightarm2.rotateAngleY = 0.0f;
            this.LeftArm2.rotateAngleY = 0.0f;
            this.RightLeg2.rotateAngleY = 0.0f;
            this.LeftLeg2.rotateAngleY = 0.0f;
        }
        else {
            if (f1 < 0.9999f) {
                this.rainboom = false;
                f8 = MathHelper.sin(0.0f - f1 * 0.5f);
                f9 = MathHelper.sin(0.0f - f1 * 0.5f);
                f10 = MathHelper.sin(f1 * 0.5f);
                f11 = MathHelper.sin(f1 * 0.5f);
            }
            else {
                this.rainboom = true;
                f8 = 4.712f;
                f9 = 4.712f;
                f10 = 1.571f;
                f11 = 1.571f;
            }
            this.rightarm.rotateAngleY = 0.2f;
            this.LeftArm.rotateAngleY = -0.2f;
            this.RightLeg.rotateAngleY = -0.2f;
            this.LeftLeg.rotateAngleY = 0.2f;
            this.rightarm2.rotateAngleY = 0.2f;
            this.LeftArm2.rotateAngleY = -0.2f;
            this.RightLeg2.rotateAngleY = -0.2f;
            this.LeftLeg2.rotateAngleY = 0.2f;
        }
        if (this.isSleeping) {
            f8 = 4.712f;
            f9 = 4.712f;
            f10 = 1.571f;
            f11 = 1.571f;
        }
        this.rightarm.rotateAngleX = f8;
        this.LeftArm.rotateAngleX = f9;
        this.RightLeg.rotateAngleX = f10;
        this.LeftLeg.rotateAngleX = f11;
        this.rightarm.rotateAngleZ = 0.0f;
        this.LeftArm.rotateAngleZ = 0.0f;
        this.rightarm2.rotateAngleX = f8;
        this.LeftArm2.rotateAngleX = f9;
        this.RightLeg2.rotateAngleX = f10;
        this.LeftLeg2.rotateAngleX = f11;
        this.rightarm2.rotateAngleZ = 0.0f;
        this.LeftArm2.rotateAngleZ = 0.0f;
        if (this.heldItemRight != 0 && !this.rainboom && !this.isUnicorn) {
            this.rightarm.rotateAngleX = this.rightarm.rotateAngleX * 0.5f - 0.3141593f;
            this.rightarm2.rotateAngleX = this.rightarm2.rotateAngleX * 0.5f - 0.3141593f;
        }
        float f12 = 0.0f;
        if (f5 > -9990.0f && !this.isUnicorn) {
            f12 = MathHelper.sin(MathHelper.sqrt_float(f5) * 3.141593f * 2.0f) * 0.2f;
        }
        this.Body.rotateAngleY = (float)(f12 * 0.2);
        this.BodyBack.rotateAngleY = (float)(f12 * 0.2);
        final float f13 = MathHelper.sin(this.Body.rotateAngleY) * 5.0f;
        final float f14 = MathHelper.cos(this.Body.rotateAngleY) * 5.0f;
        float f15 = 4.0f;
        if (this.isSneak && !this.isFlying) {
            f15 = 0.0f;
        }
        if (this.isSleeping) {
            f15 = 2.6f;
        }
        if (this.rainboom) {
            this.rightarm.rotationPointZ = f13 + 2.0f;
            this.rightarm2.rotationPointZ = f13 + 2.0f;
            this.LeftArm.rotationPointZ = 0.0f - f13 + 2.0f;
            this.LeftArm2.rotationPointZ = 0.0f - f13 + 2.0f;
        }
        else {
            this.rightarm.rotationPointZ = f13 + 1.0f;
            this.rightarm2.rotationPointZ = f13 + 1.0f;
            this.LeftArm.rotationPointZ = 0.0f - f13 + 1.0f;
            this.LeftArm2.rotationPointZ = 0.0f - f13 + 1.0f;
        }
        this.rightarm.rotationPointX = 0.0f - f14 - 1.0f + f15;
        this.rightarm2.rotationPointX = 0.0f - f14 - 1.0f + f15;
        this.LeftArm.rotationPointX = f14 + 1.0f - f15;
        this.LeftArm2.rotationPointX = f14 + 1.0f - f15;
        this.RightLeg.rotationPointX = 0.0f - f14 - 1.0f + f15;
        this.RightLeg2.rotationPointX = 0.0f - f14 - 1.0f + f15;
        this.LeftLeg.rotationPointX = f14 + 1.0f - f15;
        this.LeftLeg2.rotationPointX = f14 + 1.0f - f15;
        final ModelRenderer rightarm = this.rightarm;
        rightarm.rotateAngleY += this.Body.rotateAngleY;
        final ModelRenderer rightarm2 = this.rightarm2;
        rightarm2.rotateAngleY += this.Body.rotateAngleY;
        final ModelRenderer leftArm = this.LeftArm;
        leftArm.rotateAngleY += this.Body.rotateAngleY;
        final ModelRenderer leftArm2 = this.LeftArm2;
        leftArm2.rotateAngleY += this.Body.rotateAngleY;
        final ModelRenderer leftArm3 = this.LeftArm;
        leftArm3.rotateAngleX += this.Body.rotateAngleY;
        final ModelRenderer leftArm4 = this.LeftArm2;
        leftArm4.rotateAngleX += this.Body.rotateAngleY;
        this.rightarm.rotationPointY = 8.0f;
        this.LeftArm.rotationPointY = 8.0f;
        this.RightLeg.rotationPointY = 4.0f;
        this.LeftLeg.rotationPointY = 4.0f;
        this.rightarm2.rotationPointY = 8.0f;
        this.LeftArm2.rotationPointY = 8.0f;
        this.RightLeg2.rotationPointY = 4.0f;
        this.LeftLeg2.rotationPointY = 4.0f;
        if (f5 > -9990.0f && !this.isUnicorn) {
            float f16 = 1.0f - f5;
            f16 *= f16 * f16;
            f16 = 1.0f - f16;
            final float f17 = MathHelper.sin(f16 * 3.141593f);
            final float f18 = MathHelper.sin(f5 * 3.141593f);
            final float f19 = f18 * -(this.head.rotateAngleX - 0.7f) * 0.75f;
        }
        if (this.isSneak && !this.isFlying) {
            final float f20 = 0.4f;
            final float f21 = 7.0f;
            final float f22 = -4.0f;
            this.Body.rotateAngleX = f20;
            this.Body.rotationPointY = f21;
            this.Body.rotationPointZ = f22;
            this.BodyBack.rotateAngleX = f20;
            this.BodyBack.rotationPointY = f21;
            this.BodyBack.rotationPointZ = f22;
            final ModelRenderer rightLeg = this.RightLeg;
            rightLeg.rotateAngleX -= 0.0f;
            final ModelRenderer leftLeg = this.LeftLeg;
            leftLeg.rotateAngleX -= 0.0f;
            final ModelRenderer rightarm3 = this.rightarm;
            rightarm3.rotateAngleX -= 0.4f;
            final ModelRenderer leftArm5 = this.LeftArm;
            leftArm5.rotateAngleX -= 0.4f;
            this.RightLeg.rotationPointZ = 10.0f;
            this.LeftLeg.rotationPointZ = 10.0f;
            this.RightLeg.rotationPointY = 7.0f;
            this.LeftLeg.rotationPointY = 7.0f;
            final ModelRenderer rightLeg2 = this.RightLeg2;
            rightLeg2.rotateAngleX -= 0.0f;
            final ModelRenderer leftLeg2 = this.LeftLeg2;
            leftLeg2.rotateAngleX -= 0.0f;
            final ModelRenderer rightarm4 = this.rightarm2;
            rightarm4.rotateAngleX -= 0.4f;
            final ModelRenderer leftArm6 = this.LeftArm2;
            leftArm6.rotateAngleX -= 0.4f;
            this.RightLeg2.rotationPointZ = 10.0f;
            this.LeftLeg2.rotationPointZ = 10.0f;
            this.RightLeg2.rotationPointY = 7.0f;
            this.LeftLeg2.rotationPointY = 7.0f;
            float f23;
            float f24;
            float f25;
            if (this.isSleeping) {
                f23 = 2.0f;
                f24 = -1.0f;
                f25 = 1.0f;
            }
            else {
                f23 = 6.0f;
                f24 = -2.0f;
                f25 = 0.0f;
            }
            this.head.rotationPointY = f23;
            this.head.rotationPointZ = f24;
            this.head.rotationPointX = f25;
        }
        else {
            final float f26 = 0.0f;
            final float f27 = 0.0f;
            final float f28 = 0.0f;
            this.Body.rotateAngleX = f26;
            this.Body.rotationPointY = f27;
            this.Body.rotationPointZ = f28;
            this.BodyBack.rotateAngleX = f26;
            this.BodyBack.rotationPointY = f27;
            this.BodyBack.rotationPointZ = f28;
            this.RightLeg.rotationPointZ = 10.0f;
            this.LeftLeg.rotationPointZ = 10.0f;
            this.RightLeg.rotationPointY = 8.0f;
            this.LeftLeg.rotationPointY = 8.0f;
            this.RightLeg2.rotationPointZ = 10.0f;
            this.LeftLeg2.rotationPointZ = 10.0f;
            this.RightLeg2.rotationPointY = 8.0f;
            this.LeftLeg2.rotationPointY = 8.0f;
            final float f29 = MathHelper.cos(f2 * 0.09f) * 0.05f + 0.05f;
            final float f30 = MathHelper.sin(f2 * 0.067f) * 0.05f;
            final float f31 = 0.0f;
            final float f32 = 0.0f;
            this.head.rotationPointY = f31;
            this.head.rotationPointZ = f32;
        }
        if (this.isSleeping) {
            this.rightarm.rotationPointZ += 6.0f;
            this.LeftArm.rotationPointZ += 6.0f;
            this.RightLeg.rotationPointZ -= 8.0f;
            this.LeftLeg.rotationPointZ -= 8.0f;
            this.rightarm.rotationPointY += 2.0f;
            this.LeftArm.rotationPointY += 2.0f;
            this.RightLeg.rotationPointY += 2.0f;
            this.LeftLeg.rotationPointY += 2.0f;
            this.rightarm2.rotationPointZ += 6.0f;
            this.LeftArm2.rotationPointZ += 6.0f;
            this.RightLeg2.rotationPointZ -= 8.0f;
            this.LeftLeg2.rotationPointZ -= 8.0f;
            this.rightarm2.rotationPointY += 2.0f;
            this.LeftArm2.rotationPointY += 2.0f;
            this.RightLeg2.rotationPointY += 2.0f;
            this.LeftLeg2.rotationPointY += 2.0f;
        }
        if (this.aimedBow && !this.isUnicorn) {
            final float f33 = 0.0f;
            final float f34 = 0.0f;
            this.rightarm.rotateAngleZ = 0.0f;
            this.rightarm.rotateAngleY = -(0.1f - f33 * 0.6f) + this.head.rotateAngleY;
            this.rightarm.rotateAngleX = 4.712f + this.head.rotateAngleX;
            final ModelRenderer rightarm5 = this.rightarm;
            rightarm5.rotateAngleX -= f33 * 1.2f - f34 * 0.4f;
            final ModelRenderer rightarm6 = this.rightarm;
            rightarm6.rotateAngleZ += MathHelper.cos(f2 * 0.09f) * 0.05f + 0.05f;
            final ModelRenderer rightarm7 = this.rightarm;
            rightarm7.rotateAngleX += MathHelper.sin(f2 * 0.067f) * 0.05f;
            this.rightarm2.rotateAngleZ = 0.0f;
            this.rightarm2.rotateAngleY = -(0.1f - f33 * 0.6f) + this.head.rotateAngleY;
            this.rightarm2.rotateAngleX = 4.712f + this.head.rotateAngleX;
            final ModelRenderer rightarm8 = this.rightarm2;
            rightarm8.rotateAngleX -= f33 * 1.2f - f34 * 0.4f;
            final ModelRenderer rightarm9 = this.rightarm2;
            rightarm9.rotateAngleZ += MathHelper.cos(f2 * 0.09f) * 0.05f + 0.05f;
            final ModelRenderer rightarm10 = this.rightarm2;
            rightarm10.rotateAngleX += MathHelper.sin(f2 * 0.067f) * 0.05f;
            ++this.rightarm.rotationPointZ;
            ++this.rightarm2.rotationPointZ;
        }
    }
    
    public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        this.head.render(f5);
        this.Body.render(f5);
        this.BodyBack.render(f5);
        this.LeftArm.render(f5);
        this.rightarm.render(f5);
        this.LeftLeg.render(f5);
        this.RightLeg.render(f5);
        this.LeftArm2.render(f5);
        this.rightarm2.render(f5);
        this.LeftLeg2.render(f5);
        this.RightLeg2.render(f5);
    }
}
