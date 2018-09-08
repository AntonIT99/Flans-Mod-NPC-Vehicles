// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.model.part;

import noppes.npcs.client.ClientProxy;
import org.lwjgl.opengl.GL11;
import noppes.npcs.ModelPartData;
import noppes.npcs.constants.EnumAnimation;
import net.minecraft.util.MathHelper;
import net.minecraft.entity.Entity;
import net.minecraft.client.model.ModelBase;
import noppes.npcs.client.model.ModelMPM;
import noppes.npcs.client.model.part.legs.ModelMermaidLegs;
import noppes.npcs.client.model.part.legs.ModelDigitigradeLegs;
import noppes.npcs.client.model.part.legs.ModelNagaLegs;
import net.minecraft.client.model.ModelRenderer;
import noppes.npcs.entity.EntityCustomNpc;
import noppes.npcs.client.model.util.ModelScaleRenderer;

public class ModelLegs extends ModelScaleRenderer
{
    private EntityCustomNpc entity;
    private ModelScaleRenderer leg1;
    private ModelScaleRenderer leg2;
    private ModelRenderer spider;
    private ModelRenderer horse;
    private ModelNagaLegs naga;
    private ModelDigitigradeLegs digitigrade;
    private ModelMermaidLegs mermaid;
    private ModelRenderer spiderLeg1;
    private ModelRenderer spiderLeg2;
    private ModelRenderer spiderLeg3;
    private ModelRenderer spiderLeg4;
    private ModelRenderer spiderLeg5;
    private ModelRenderer spiderLeg6;
    private ModelRenderer spiderLeg7;
    private ModelRenderer spiderLeg8;
    private ModelRenderer spiderBody;
    private ModelRenderer spiderNeck;
    private ModelRenderer backLeftLeg;
    private ModelRenderer backLeftShin;
    private ModelRenderer backLeftHoof;
    private ModelRenderer backRightLeg;
    private ModelRenderer backRightShin;
    private ModelRenderer backRightHoof;
    private ModelRenderer frontLeftLeg;
    private ModelRenderer frontLeftShin;
    private ModelRenderer frontLeftHoof;
    private ModelRenderer frontRightLeg;
    private ModelRenderer frontRightShin;
    private ModelRenderer frontRightHoof;
    private ModelMPM base;
    
    public ModelLegs(final ModelMPM base, final ModelScaleRenderer leg1, final ModelScaleRenderer leg2) {
        super((ModelBase)base);
        this.base = base;
        this.leg1 = leg1;
        this.leg2 = leg2;
        if (base.isArmor) {
            return;
        }
        this.addChild(this.spider = new ModelRenderer((ModelBase)base));
        final float var1 = 0.0f;
        final byte var2 = 15;
        (this.spiderNeck = new ModelRenderer((ModelBase)base, 0, 0)).addBox(-3.0f, -3.0f, -3.0f, 6, 6, 6, var1);
        this.spiderNeck.setRotationPoint(0.0f, (float)var2, 2.0f);
        this.spider.addChild(this.spiderNeck);
        (this.spiderBody = new ModelRenderer((ModelBase)base, 0, 12)).addBox(-5.0f, -4.0f, -6.0f, 10, 8, 12, var1);
        this.spiderBody.setRotationPoint(0.0f, (float)var2, 11.0f);
        this.spider.addChild(this.spiderBody);
        (this.spiderLeg1 = new ModelRenderer((ModelBase)base, 18, 0)).addBox(-15.0f, -1.0f, -1.0f, 16, 2, 2, var1);
        this.spiderLeg1.setRotationPoint(-4.0f, (float)var2, 4.0f);
        this.spider.addChild(this.spiderLeg1);
        (this.spiderLeg2 = new ModelRenderer((ModelBase)base, 18, 0)).addBox(-1.0f, -1.0f, -1.0f, 16, 2, 2, var1);
        this.spiderLeg2.setRotationPoint(4.0f, (float)var2, 4.0f);
        this.spider.addChild(this.spiderLeg2);
        (this.spiderLeg3 = new ModelRenderer((ModelBase)base, 18, 0)).addBox(-15.0f, -1.0f, -1.0f, 16, 2, 2, var1);
        this.spiderLeg3.setRotationPoint(-4.0f, (float)var2, 3.0f);
        this.spider.addChild(this.spiderLeg3);
        (this.spiderLeg4 = new ModelRenderer((ModelBase)base, 18, 0)).addBox(-1.0f, -1.0f, -1.0f, 16, 2, 2, var1);
        this.spiderLeg4.setRotationPoint(4.0f, (float)var2, 3.0f);
        this.spider.addChild(this.spiderLeg4);
        (this.spiderLeg5 = new ModelRenderer((ModelBase)base, 18, 0)).addBox(-15.0f, -1.0f, -1.0f, 16, 2, 2, var1);
        this.spiderLeg5.setRotationPoint(-4.0f, (float)var2, 2.0f);
        this.spider.addChild(this.spiderLeg5);
        (this.spiderLeg6 = new ModelRenderer((ModelBase)base, 18, 0)).addBox(-1.0f, -1.0f, -1.0f, 16, 2, 2, var1);
        this.spiderLeg6.setRotationPoint(4.0f, (float)var2, 2.0f);
        this.spider.addChild(this.spiderLeg6);
        (this.spiderLeg7 = new ModelRenderer((ModelBase)base, 18, 0)).addBox(-15.0f, -1.0f, -1.0f, 16, 2, 2, var1);
        this.spiderLeg7.setRotationPoint(-4.0f, (float)var2, 1.0f);
        this.spider.addChild(this.spiderLeg7);
        (this.spiderLeg8 = new ModelRenderer((ModelBase)base, 18, 0)).addBox(-1.0f, -1.0f, -1.0f, 16, 2, 2, var1);
        this.spiderLeg8.setRotationPoint(4.0f, (float)var2, 1.0f);
        this.spider.addChild(this.spiderLeg8);
        final int zOffset = 10;
        final float yOffset = 7.0f;
        this.addChild(this.horse = new ModelRenderer((ModelBase)base));
        final ModelRenderer body = new ModelRenderer((ModelBase)base, 0, 34);
        body.setTextureSize(128, 128);
        body.addBox(-5.0f, -8.0f, -19.0f, 10, 10, 24);
        body.setRotationPoint(0.0f, 11.0f + yOffset, 9.0f + zOffset);
        this.horse.addChild(body);
        (this.backLeftLeg = new ModelRenderer((ModelBase)base, 78, 29)).setTextureSize(128, 128);
        this.backLeftLeg.addBox(-2.5f, -2.0f, -2.5f, 4, 9, 5);
        this.backLeftLeg.setRotationPoint(4.0f, 9.0f + yOffset, 11.0f + zOffset);
        this.horse.addChild(this.backLeftLeg);
        (this.backLeftShin = new ModelRenderer((ModelBase)base, 78, 43)).setTextureSize(128, 128);
        this.backLeftShin.addBox(-2.0f, 0.0f, -1.5f, 3, 5, 3);
        this.backLeftShin.setRotationPoint(0.0f, 7.0f, 0.0f);
        this.backLeftLeg.addChild(this.backLeftShin);
        (this.backLeftHoof = new ModelRenderer((ModelBase)base, 78, 51)).setTextureSize(128, 128);
        this.backLeftHoof.addBox(-2.5f, 5.1f, -2.0f, 4, 3, 4);
        this.backLeftHoof.setRotationPoint(0.0f, 7.0f, 0.0f);
        this.backLeftLeg.addChild(this.backLeftHoof);
        (this.backRightLeg = new ModelRenderer((ModelBase)base, 96, 29)).setTextureSize(128, 128);
        this.backRightLeg.addBox(-1.5f, -2.0f, -2.5f, 4, 9, 5);
        this.backRightLeg.setRotationPoint(-4.0f, 9.0f + yOffset, 11.0f + zOffset);
        this.horse.addChild(this.backRightLeg);
        (this.backRightShin = new ModelRenderer((ModelBase)base, 96, 43)).setTextureSize(128, 128);
        this.backRightShin.addBox(-1.0f, 0.0f, -1.5f, 3, 5, 3);
        this.backRightShin.setRotationPoint(0.0f, 7.0f, 0.0f);
        this.backRightLeg.addChild(this.backRightShin);
        (this.backRightHoof = new ModelRenderer((ModelBase)base, 96, 51)).setTextureSize(128, 128);
        this.backRightHoof.addBox(-1.5f, 5.1f, -2.0f, 4, 3, 4);
        this.backRightHoof.setRotationPoint(0.0f, 7.0f, 0.0f);
        this.backRightLeg.addChild(this.backRightHoof);
        (this.frontLeftLeg = new ModelRenderer((ModelBase)base, 44, 29)).setTextureSize(128, 128);
        this.frontLeftLeg.addBox(-1.9f, -1.0f, -2.1f, 3, 8, 4);
        this.frontLeftLeg.setRotationPoint(4.0f, 9.0f + yOffset, -8.0f + zOffset);
        this.horse.addChild(this.frontLeftLeg);
        (this.frontLeftShin = new ModelRenderer((ModelBase)base, 44, 41)).setTextureSize(128, 128);
        this.frontLeftShin.addBox(-1.9f, 0.0f, -1.6f, 3, 5, 3);
        this.frontLeftShin.setRotationPoint(0.0f, 7.0f, 0.0f);
        this.frontLeftLeg.addChild(this.frontLeftShin);
        (this.frontLeftHoof = new ModelRenderer((ModelBase)base, 44, 51)).setTextureSize(128, 128);
        this.frontLeftHoof.addBox(-2.4f, 5.1f, -2.1f, 4, 3, 4);
        this.frontLeftHoof.setRotationPoint(0.0f, 7.0f, 0.0f);
        this.frontLeftLeg.addChild(this.frontLeftHoof);
        (this.frontRightLeg = new ModelRenderer((ModelBase)base, 60, 29)).setTextureSize(128, 128);
        this.frontRightLeg.addBox(-1.1f, -1.0f, -2.1f, 3, 8, 4);
        this.frontRightLeg.setRotationPoint(-4.0f, 9.0f + yOffset, -8.0f + zOffset);
        this.horse.addChild(this.frontRightLeg);
        (this.frontRightShin = new ModelRenderer((ModelBase)base, 60, 41)).setTextureSize(128, 128);
        this.frontRightShin.addBox(-1.1f, 0.0f, -1.6f, 3, 5, 3);
        this.frontRightShin.setRotationPoint(0.0f, 7.0f, 0.0f);
        this.frontRightLeg.addChild(this.frontRightShin);
        (this.frontRightHoof = new ModelRenderer((ModelBase)base, 60, 51)).setTextureSize(128, 128);
        this.frontRightHoof.addBox(-1.6f, 5.1f, -2.1f, 4, 3, 4);
        this.frontRightHoof.setRotationPoint(0.0f, 7.0f, 0.0f);
        this.frontRightLeg.addChild(this.frontRightHoof);
        this.addChild((ModelRenderer)(this.naga = new ModelNagaLegs((ModelBase)base)));
        this.addChild((ModelRenderer)(this.mermaid = new ModelMermaidLegs((ModelBase)base)));
        this.addChild((ModelRenderer)(this.digitigrade = new ModelDigitigradeLegs(base)));
    }
    
    @Override
    public void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
    
    public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity entity) {
        final ModelPartData part = this.entity.modelData.legParts;
        this.rotationPointZ = 0.0f;
        this.rotationPointY = 0.0f;
        if (this.base.isArmor) {
            return;
        }
        if (part.type == 2) {
            this.rotateAngleX = 0.0f;
            this.spiderBody.rotationPointY = 15.0f;
            this.spiderBody.rotationPointZ = 11.0f;
            this.spiderNeck.rotateAngleX = 0.0f;
            final float var8 = 0.7853982f;
            this.spiderLeg1.rotateAngleZ = -var8;
            this.spiderLeg2.rotateAngleZ = var8;
            this.spiderLeg3.rotateAngleZ = -var8 * 0.74f;
            this.spiderLeg4.rotateAngleZ = var8 * 0.74f;
            this.spiderLeg5.rotateAngleZ = -var8 * 0.74f;
            this.spiderLeg6.rotateAngleZ = var8 * 0.74f;
            this.spiderLeg7.rotateAngleZ = -var8;
            this.spiderLeg8.rotateAngleZ = var8;
            final float var9 = -0.0f;
            final float var10 = 0.3926991f;
            this.spiderLeg1.rotateAngleY = var10 * 2.0f + var9;
            this.spiderLeg2.rotateAngleY = -var10 * 2.0f - var9;
            this.spiderLeg3.rotateAngleY = var10 * 1.0f + var9;
            this.spiderLeg4.rotateAngleY = -var10 * 1.0f - var9;
            this.spiderLeg5.rotateAngleY = -var10 * 1.0f + var9;
            this.spiderLeg6.rotateAngleY = var10 * 1.0f - var9;
            this.spiderLeg7.rotateAngleY = -var10 * 2.0f + var9;
            this.spiderLeg8.rotateAngleY = var10 * 2.0f - var9;
            final float var11 = -(MathHelper.cos(par1 * 0.6662f * 2.0f + 0.0f) * 0.4f) * par2;
            final float var12 = -(MathHelper.cos(par1 * 0.6662f * 2.0f + 3.1415927f) * 0.4f) * par2;
            final float var13 = -(MathHelper.cos(par1 * 0.6662f * 2.0f + 1.5707964f) * 0.4f) * par2;
            final float var14 = -(MathHelper.cos(par1 * 0.6662f * 2.0f + 4.712389f) * 0.4f) * par2;
            final float var15 = Math.abs(MathHelper.sin(par1 * 0.6662f + 0.0f) * 0.4f) * par2;
            final float var16 = Math.abs(MathHelper.sin(par1 * 0.6662f + 3.1415927f) * 0.4f) * par2;
            final float var17 = Math.abs(MathHelper.sin(par1 * 0.6662f + 1.5707964f) * 0.4f) * par2;
            final float var18 = Math.abs(MathHelper.sin(par1 * 0.6662f + 4.712389f) * 0.4f) * par2;
            final ModelRenderer spiderLeg1 = this.spiderLeg1;
            spiderLeg1.rotateAngleY += var11;
            final ModelRenderer spiderLeg2 = this.spiderLeg2;
            spiderLeg2.rotateAngleY += -var11;
            final ModelRenderer spiderLeg3 = this.spiderLeg3;
            spiderLeg3.rotateAngleY += var12;
            final ModelRenderer spiderLeg4 = this.spiderLeg4;
            spiderLeg4.rotateAngleY += -var12;
            final ModelRenderer spiderLeg5 = this.spiderLeg5;
            spiderLeg5.rotateAngleY += var13;
            final ModelRenderer spiderLeg6 = this.spiderLeg6;
            spiderLeg6.rotateAngleY += -var13;
            final ModelRenderer spiderLeg7 = this.spiderLeg7;
            spiderLeg7.rotateAngleY += var14;
            final ModelRenderer spiderLeg8 = this.spiderLeg8;
            spiderLeg8.rotateAngleY += -var14;
            final ModelRenderer spiderLeg9 = this.spiderLeg1;
            spiderLeg9.rotateAngleZ += var15;
            final ModelRenderer spiderLeg10 = this.spiderLeg2;
            spiderLeg10.rotateAngleZ += -var15;
            final ModelRenderer spiderLeg11 = this.spiderLeg3;
            spiderLeg11.rotateAngleZ += var16;
            final ModelRenderer spiderLeg12 = this.spiderLeg4;
            spiderLeg12.rotateAngleZ += -var16;
            final ModelRenderer spiderLeg13 = this.spiderLeg5;
            spiderLeg13.rotateAngleZ += var17;
            final ModelRenderer spiderLeg14 = this.spiderLeg6;
            spiderLeg14.rotateAngleZ += -var17;
            final ModelRenderer spiderLeg15 = this.spiderLeg7;
            spiderLeg15.rotateAngleZ += var18;
            final ModelRenderer spiderLeg16 = this.spiderLeg8;
            spiderLeg16.rotateAngleZ += -var18;
            if (this.base.isSneak) {
                this.rotationPointZ = 5.0f;
                this.rotationPointY = -1.0f;
                this.spiderBody.rotationPointY = 16.0f;
                this.spiderBody.rotationPointZ = 10.0f;
                this.spiderNeck.rotateAngleX = -0.3926991f;
            }
            if (this.base.isSleeping(entity) || this.entity.currentAnimation == EnumAnimation.CRAWLING) {
                this.rotationPointY = 12.0f * this.entity.modelData.legs.scaleY;
                this.rotationPointZ = 15.0f * this.entity.modelData.legs.scaleY;
                this.rotateAngleX = -1.5707964f;
            }
        }
        else if (part.type == 3) {
            this.frontLeftLeg.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 0.4f * par2;
            this.frontRightLeg.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 0.4f * par2;
            this.backLeftLeg.rotateAngleX = MathHelper.cos(par1 * 0.6662f + 3.1415927f) * 0.4f * par2;
            this.backRightLeg.rotateAngleX = MathHelper.cos(par1 * 0.6662f) * 0.4f * par2;
        }
        else if (part.type == 1) {
            this.naga.isRiding = this.base.isRiding;
            this.naga.isSleeping = this.base.isSleeping(entity);
            this.naga.isCrawling = (this.entity.currentAnimation == EnumAnimation.CRAWLING);
            this.naga.isSneaking = this.base.isSneak;
            this.naga.setRotationAngles(par1, par2, par3, par4, par5, par6, entity);
        }
        else if (part.type == 4) {
            this.mermaid.setRotationAngles(par1, par2, par3, par4, par5, par6, entity);
        }
        else if (part.type == 5) {
            this.digitigrade.setRotationAngles(par1, par2, par3, par4, par5, par6, entity);
        }
    }
    
    @Override
    public void render(final float par1) {
        if (!this.showModel || this.isHidden) {
            return;
        }
        final ModelPartData part = this.entity.modelData.legParts;
        if (part.type < 0) {
            return;
        }
        GL11.glPushMatrix();
        if (part.type == 4) {
            part.playerTexture = !this.entity.isInWater();
        }
        if (!this.base.isArmor) {
            if (!part.playerTexture) {
                ClientProxy.bindTexture(part.getResource());
                this.base.currentlyPlayerTexture = false;
            }
            else if (!this.base.currentlyPlayerTexture) {
                ClientProxy.bindTexture(this.entity.textureLocation);
                this.base.currentlyPlayerTexture = true;
            }
        }
        if (part.type == 0 || (part.type == 4 && !this.entity.isInWater())) {
            this.leg1.setConfig(this.config, this.x, this.y, this.z);
            this.leg1.render(par1);
            this.leg2.setConfig(this.config, -this.x, this.y, this.z);
            this.leg2.render(par1);
        }
        if (!this.base.isArmor) {
            this.naga.isHidden = (part.type != 1);
            this.spider.isHidden = (part.type != 2);
            this.horse.isHidden = (part.type != 3);
            this.mermaid.isHidden = (part.type != 4 || !this.entity.isInWater());
            this.digitigrade.isHidden = (part.type != 5);
            if (!this.horse.isHidden) {
                this.x = 0.0f;
                this.y *= 1.8f;
                GL11.glScalef(0.9f, 0.9f, 0.9f);
            }
            else if (!this.spider.isHidden) {
                this.x = 0.0f;
                this.y *= 2.0f;
            }
            else if (!this.naga.isHidden) {
                this.x = 0.0f;
                this.y *= 2.0f;
            }
            else if (!this.mermaid.isHidden || !this.digitigrade.isHidden) {
                this.x = 0.0f;
                this.y *= 2.0f;
            }
        }
        final boolean bo = this.entity.hurtTime <= 0 && this.entity.deathTime <= 0 && !this.base.isArmor;
        if (bo) {
            final float red = (this.entity.modelData.legParts.color >> 16 & 0xFF) / 255.0f;
            final float green = (this.entity.modelData.legParts.color >> 8 & 0xFF) / 255.0f;
            final float blue = (this.entity.modelData.legParts.color & 0xFF) / 255.0f;
            GL11.glColor4f(red, green, blue, this.base.alpha);
        }
        super.render(par1);
        if (bo) {
            GL11.glColor4f(1.0f, 1.0f, 1.0f, this.base.alpha);
        }
        GL11.glPopMatrix();
    }
    
    public void setData(final EntityCustomNpc entity) {
        this.entity = entity;
    }
}
