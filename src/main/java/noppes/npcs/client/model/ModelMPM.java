// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.model;

import java.util.Random;
import net.minecraft.client.entity.EntityPlayerSP;
import noppes.npcs.ModelPartConfig;
import org.lwjgl.opengl.GL11;
import noppes.npcs.client.ClientProxy;
import noppes.npcs.ModelPartData;
import noppes.npcs.client.model.animation.AniCrawling;
import noppes.npcs.client.model.animation.AniHug;
import noppes.npcs.constants.EnumAnimation;
import net.minecraft.util.MathHelper;
import noppes.npcs.roles.JobPuppet;
import noppes.npcs.constants.EnumJobType;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.entity.Entity;
import noppes.npcs.entity.EntityCustomNpc;
import noppes.npcs.client.model.part.ModelClaws;
import noppes.npcs.client.model.part.ModelFin;
import noppes.npcs.client.model.part.ModelWings;
import noppes.npcs.client.model.part.ModelSnout;
import noppes.npcs.client.model.part.ModelBeard;
import noppes.npcs.client.model.part.ModelHair;
import noppes.npcs.client.model.part.ModelMohawk;
import noppes.npcs.client.model.part.ModelEars;
import noppes.npcs.client.model.part.ModelBreasts;
import noppes.npcs.client.model.part.ModelHeadwear;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.client.model.ModelBase;
import noppes.npcs.client.model.part.ModelTail;
import noppes.npcs.client.model.util.ModelScaleRenderer;
import noppes.npcs.client.model.part.ModelLegs;
import noppes.npcs.client.model.util.ModelPartInterface;

public class ModelMPM extends ModelNPCMale
{
    private ModelPartInterface wings;
    private ModelPartInterface mohawk;
    private ModelPartInterface hair;
    private ModelPartInterface beard;
    private ModelPartInterface breasts;
    private ModelPartInterface snout;
    private ModelPartInterface ears;
    private ModelPartInterface fin;
    private ModelPartInterface clawsR;
    private ModelPartInterface clawsL;
    private ModelLegs legs;
    private ModelScaleRenderer headwear;
    private ModelTail tail;
    public ModelBase entityModel;
    public EntityLivingBase entity;
    public boolean currentlyPlayerTexture;
    public boolean isArmor;
    public float alpha;
    
    public ModelMPM(final float par1) {
        super(par1);
        this.alpha = 1.0f;
        this.isArmor = (par1 > 0.0f);
        final float par2 = 0.0f;
        (this.bipedCloak = new ModelRenderer((ModelBase)this, 0, 0)).addBox(-5.0f, 0.0f, -1.0f, 10, 16, 1, par1);
        (this.bipedEars = new ModelRenderer((ModelBase)this, 24, 0)).addBox(-3.0f, -6.0f, -1.0f, 6, 6, 1, par1);
        (this.bipedHead = new ModelScaleRenderer((ModelBase)this, 0, 0)).addBox(-4.0f, -8.0f, -4.0f, 8, 8, 8, par1);
        this.bipedHead.setRotationPoint(0.0f, 0.0f + par2, 0.0f);
        (this.bipedHeadwear = new ModelScaleRenderer((ModelBase)this, 32, 0)).addBox(-4.0f, -8.0f, -4.0f, 8, 8, 8, par1 + 0.5f);
        this.bipedHeadwear.setRotationPoint(0.0f, 0.0f + par2, 0.0f);
        (this.bipedBody = new ModelScaleRenderer((ModelBase)this, 16, 16)).addBox(-4.0f, 0.0f, -2.0f, 8, 12, 4, par1);
        this.bipedBody.setRotationPoint(0.0f, 0.0f + par2, 0.0f);
        (this.bipedRightArm = new ModelScaleRenderer((ModelBase)this, 40, 16)).addBox(-3.0f, -2.0f, -2.0f, 4, 12, 4, par1);
        this.bipedRightArm.setRotationPoint(-5.0f, 2.0f + par2, 0.0f);
        this.bipedLeftArm = new ModelScaleRenderer((ModelBase)this, 40, 16);
        this.bipedLeftArm.mirror = true;
        this.bipedLeftArm.addBox(-1.0f, -2.0f, -2.0f, 4, 12, 4, par1);
        this.bipedLeftArm.setRotationPoint(5.0f, 2.0f + par2, 0.0f);
        (this.bipedRightLeg = new ModelScaleRenderer((ModelBase)this, 0, 16)).addBox(-2.0f, 0.0f, -2.0f, 4, 12, 4, par1);
        this.bipedRightLeg.setRotationPoint(-1.9f, 12.0f + par2, 0.0f);
        this.bipedLeftLeg = new ModelScaleRenderer((ModelBase)this, 0, 16);
        this.bipedLeftLeg.mirror = true;
        this.bipedLeftLeg.addBox(-2.0f, 0.0f, -2.0f, 4, 12, 4, par1);
        this.bipedLeftLeg.setRotationPoint(1.9f, 12.0f + par2, 0.0f);
        this.headwear = new ModelHeadwear((ModelBase)this);
        this.legs = new ModelLegs(this, (ModelScaleRenderer)this.bipedRightLeg, (ModelScaleRenderer)this.bipedLeftLeg);
        this.breasts = new ModelBreasts(this);
        this.bipedBody.addChild((ModelRenderer)this.breasts);
        if (!this.isArmor) {
            this.ears = new ModelEars(this);
            this.bipedHead.addChild((ModelRenderer)this.ears);
            this.mohawk = new ModelMohawk(this);
            this.bipedHead.addChild((ModelRenderer)this.mohawk);
            this.hair = new ModelHair(this);
            this.bipedHead.addChild((ModelRenderer)this.hair);
            this.beard = new ModelBeard(this);
            this.bipedHead.addChild((ModelRenderer)this.beard);
            this.snout = new ModelSnout(this);
            this.bipedHead.addChild((ModelRenderer)this.snout);
            this.tail = new ModelTail(this);
            this.wings = new ModelWings(this);
            this.bipedBody.addChild((ModelRenderer)this.wings);
            this.fin = new ModelFin(this);
            this.bipedBody.addChild((ModelRenderer)this.fin);
            this.clawsL = new ModelClaws(this, false);
            this.bipedLeftArm.addChild((ModelRenderer)this.clawsL);
            this.clawsR = new ModelClaws(this, true);
            this.bipedRightArm.addChild((ModelRenderer)this.clawsR);
        }
    }
    
    private void setPlayerData(final EntityCustomNpc entity) {
        if (!this.isArmor) {
            this.mohawk.setData(entity.modelData, entity);
            this.beard.setData(entity.modelData, entity);
            this.hair.setData(entity.modelData, entity);
            this.snout.setData(entity.modelData, entity);
            this.tail.setData(entity);
            this.fin.setData(entity.modelData, entity);
            this.wings.setData(entity.modelData, entity);
            this.ears.setData(entity.modelData, entity);
            this.clawsL.setData(entity.modelData, entity);
            this.clawsR.setData(entity.modelData, entity);
        }
        this.breasts.setData(entity.modelData, entity);
        this.legs.setData(entity);
    }
    
    @Override
    public void render(final Entity par1Entity, final float par2, final float par3, final float par4, final float par5, final float par6, final float par7) {
        final EntityCustomNpc npc = (EntityCustomNpc)par1Entity;
        if (this.entityModel != null) {
            if (!this.isArmor) {
                this.entityModel.isChild = this.entity.isChild();
                this.entityModel.onGround = this.onGround;
                this.entityModel.isRiding = this.isRiding;
                if (this.entityModel instanceof ModelBiped) {
                    final ModelBiped biped = (ModelBiped)this.entityModel;
                    biped.aimedBow = this.aimedBow;
                    biped.heldItemLeft = this.heldItemLeft;
                    biped.heldItemRight = this.heldItemRight;
                    biped.isSneak = this.isSneak;
                }
                this.entityModel.render((Entity)this.entity, par2, par3, par4, par5, par6, par7);
            }
        }
        else {
            this.alpha = ((npc.isInvisible() && !npc.isInvisibleToPlayer((EntityPlayer)Minecraft.getMinecraft().thePlayer)) ? 0.15f : 1.0f);
            this.setPlayerData(npc);
            this.currentlyPlayerTexture = true;
            this.setRotationAngles(par2, par3, par4, par5, par6, par7, par1Entity);
            if (npc.advanced.job == EnumJobType.Puppet) {
                final JobPuppet job = (JobPuppet)npc.jobInterface;
                if (job.isActive()) {
                    final float pi = 3.1415927f;
                    if (!job.head.disabled) {
                        final ModelRenderer bipedHeadwear = this.bipedHeadwear;
                        final ModelRenderer bipedHead = this.bipedHead;
                        final float n = job.head.rotationX * pi;
                        bipedHead.rotateAngleX = n;
                        bipedHeadwear.rotateAngleX = n;
                        final ModelRenderer bipedHeadwear2 = this.bipedHeadwear;
                        final ModelRenderer bipedHead2 = this.bipedHead;
                        final float n2 = job.head.rotationY * pi;
                        bipedHead2.rotateAngleY = n2;
                        bipedHeadwear2.rotateAngleY = n2;
                        final ModelRenderer bipedHeadwear3 = this.bipedHeadwear;
                        final ModelRenderer bipedHead3 = this.bipedHead;
                        final float n3 = job.head.rotationZ * pi;
                        bipedHead3.rotateAngleZ = n3;
                        bipedHeadwear3.rotateAngleZ = n3;
                    }
                    if (!job.body.disabled) {
                        this.bipedBody.rotateAngleX = job.body.rotationX * pi;
                        this.bipedBody.rotateAngleY = job.body.rotationY * pi;
                        this.bipedBody.rotateAngleZ = job.body.rotationZ * pi;
                    }
                    if (!job.larm.disabled) {
                        this.bipedLeftArm.rotateAngleX = job.larm.rotationX * pi;
                        this.bipedLeftArm.rotateAngleY = job.larm.rotationY * pi;
                        this.bipedLeftArm.rotateAngleZ = job.larm.rotationZ * pi;
                        if (!npc.display.disableLivingAnimation) {
                            final ModelRenderer bipedLeftArm = this.bipedLeftArm;
                            bipedLeftArm.rotateAngleZ -= MathHelper.cos(par3 * 0.09f) * 0.05f + 0.05f;
                            final ModelRenderer bipedLeftArm2 = this.bipedLeftArm;
                            bipedLeftArm2.rotateAngleX -= MathHelper.sin(par3 * 0.067f) * 0.05f;
                        }
                    }
                    if (!job.rarm.disabled) {
                        this.bipedRightArm.rotateAngleX = job.rarm.rotationX * pi;
                        this.bipedRightArm.rotateAngleY = job.rarm.rotationY * pi;
                        this.bipedRightArm.rotateAngleZ = job.rarm.rotationZ * pi;
                        if (!npc.display.disableLivingAnimation) {
                            final ModelRenderer bipedRightArm = this.bipedRightArm;
                            bipedRightArm.rotateAngleZ += MathHelper.cos(par3 * 0.09f) * 0.05f + 0.05f;
                            final ModelRenderer bipedRightArm2 = this.bipedRightArm;
                            bipedRightArm2.rotateAngleX += MathHelper.sin(par3 * 0.067f) * 0.05f;
                        }
                    }
                    if (!job.rleg.disabled) {
                        this.bipedRightLeg.rotateAngleX = job.rleg.rotationX * pi;
                        this.bipedRightLeg.rotateAngleY = job.rleg.rotationY * pi;
                        this.bipedRightLeg.rotateAngleZ = job.rleg.rotationZ * pi;
                    }
                    if (!job.lleg.disabled) {
                        this.bipedLeftLeg.rotateAngleX = job.lleg.rotationX * pi;
                        this.bipedLeftLeg.rotateAngleY = job.lleg.rotationY * pi;
                        this.bipedLeftLeg.rotateAngleZ = job.lleg.rotationZ * pi;
                    }
                }
            }
            this.renderHead(npc, par7);
            this.renderArms(npc, par7, false);
            this.renderBody(npc, par7);
            this.renderLegs(npc, par7);
        }
    }
    
    @Override
    public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity entity) {
        final EntityCustomNpc npc = (EntityCustomNpc)entity;
        this.isRiding = npc.isRiding();
        if (this.isSneak && (npc.currentAnimation == EnumAnimation.CRAWLING || npc.currentAnimation == EnumAnimation.LYING)) {
            this.isSneak = false;
        }
        this.bipedBody.rotationPointX = 0.0f;
        this.bipedBody.rotationPointY = 0.0f;
        this.bipedBody.rotationPointZ = 0.0f;
        this.bipedBody.rotateAngleX = 0.0f;
        this.bipedBody.rotateAngleY = 0.0f;
        this.bipedBody.rotateAngleZ = 0.0f;
        this.bipedHead.rotateAngleZ = 0.0f;
        this.bipedHeadwear.rotateAngleZ = 0.0f;
        this.bipedLeftLeg.rotateAngleX = 0.0f;
        this.bipedLeftLeg.rotateAngleY = 0.0f;
        this.bipedLeftLeg.rotateAngleZ = 0.0f;
        this.bipedRightLeg.rotateAngleX = 0.0f;
        this.bipedRightLeg.rotateAngleY = 0.0f;
        this.bipedRightLeg.rotateAngleZ = 0.0f;
        this.bipedLeftArm.rotationPointY = 2.0f;
        this.bipedLeftArm.rotationPointZ = 0.0f;
        this.bipedRightArm.rotationPointY = 2.0f;
        this.bipedRightArm.rotationPointZ = 0.0f;
        super.setRotationAngles(par1, par2, par3, par4, par5, par6, entity);
        if (!this.isArmor) {
            this.hair.setRotationAngles(par1, par2, par3, par4, par5, par6, entity);
            this.beard.setRotationAngles(par1, par2, par3, par4, par5, par6, entity);
            this.wings.setRotationAngles(par1, par2, par3, par4, par5, par6, entity);
            this.tail.setRotationAngles(par1, par2, par3, par4, par5, par6, entity);
        }
        this.legs.setRotationAngles(par1, par2, par3, par4, par5, par6, entity);
        if (this.isSleeping(entity)) {
            if (this.bipedHead.rotateAngleX < 0.0f) {
                this.bipedHead.rotateAngleX = 0.0f;
                this.bipedHeadwear.rotateAngleX = 0.0f;
            }
        }
        else if (npc.currentAnimation == EnumAnimation.CRY) {
            final ModelRenderer bipedHeadwear = this.bipedHeadwear;
            final ModelRenderer bipedHead = this.bipedHead;
            final float n = 0.7f;
            bipedHead.rotateAngleX = n;
            bipedHeadwear.rotateAngleX = n;
        }
        else if (npc.currentAnimation == EnumAnimation.HUG) {
            AniHug.setRotationAngles(par1, par2, par3, par4, par5, par6, entity, this);
        }
        else if (npc.currentAnimation == EnumAnimation.CRAWLING) {
            AniCrawling.setRotationAngles(par1, par2, par3, par4, par5, par6, entity, this);
        }
        else if (npc.currentAnimation == EnumAnimation.WAVING) {
            this.bipedRightArm.rotateAngleX = -0.1f;
            this.bipedRightArm.rotateAngleY = 0.0f;
            this.bipedRightArm.rotateAngleZ = (float)(2.141592653589793 - Math.sin(entity.ticksExisted * 0.27f) * 0.5);
        }
        else if (this.isSneak) {
            this.bipedBody.rotateAngleX = 0.5f / npc.modelData.body.scaleY;
        }
    }
    
    @Override
    public void setLivingAnimations(final EntityLivingBase par1EntityLivingBase, final float par2, final float par3, final float par4) {
        if (this.entityModel != null) {
            this.entityModel.setLivingAnimations(this.entity, par2, par3, par4);
        }
        else {
            final EntityCustomNpc npc = (EntityCustomNpc)par1EntityLivingBase;
            if (!this.isArmor) {
                final ModelPartData partData = npc.modelData.getPartData("tail");
                if (partData != null) {
                    this.tail.setLivingAnimations(partData, par1EntityLivingBase, par2, par3, par4);
                }
            }
        }
    }
    
    public void loadPlayerTexture(final EntityCustomNpc npc) {
        if (!this.isArmor && !this.currentlyPlayerTexture) {
            ClientProxy.bindTexture(npc.textureLocation);
            this.currentlyPlayerTexture = true;
        }
    }
    
    private void renderHead(final EntityCustomNpc entity, final float f) {
        this.loadPlayerTexture(entity);
        final float x = 0.0f;
        final float y = entity.modelData.getBodyY();
        final float z = 0.0f;
        GL11.glPushMatrix();
        if (entity.currentAnimation == EnumAnimation.DANCING) {
            final float dancing = entity.ticksExisted / 4.0f;
            GL11.glTranslatef((float)Math.sin(dancing) * 0.075f, (float)Math.abs(Math.cos(dancing)) * 0.125f - 0.02f, (float)(-Math.abs(Math.cos(dancing))) * 0.075f);
        }
        final ModelPartConfig head = entity.modelData.head;
        if (this.bipedHeadwear.showModel && !this.bipedHeadwear.isHidden) {
            if (entity.modelData.headwear == 1 || this.isArmor) {
                ((ModelScaleRenderer)this.bipedHeadwear).setConfig(head, x, y, z);
                ((ModelScaleRenderer)this.bipedHeadwear).render(f);
            }
            else if (entity.modelData.headwear == 2) {
                this.headwear.rotateAngleX = this.bipedHeadwear.rotateAngleX;
                this.headwear.rotateAngleY = this.bipedHeadwear.rotateAngleY;
                this.headwear.rotateAngleZ = this.bipedHeadwear.rotateAngleZ;
                this.headwear.rotationPointX = this.bipedHeadwear.rotationPointX;
                this.headwear.rotationPointY = this.bipedHeadwear.rotationPointY;
                this.headwear.rotationPointZ = this.bipedHeadwear.rotationPointZ;
                this.headwear.setConfig(head, x, y, z);
                this.headwear.render(f);
            }
        }
        ((ModelScaleRenderer)this.bipedHead).setConfig(head, x, y, z);
        ((ModelScaleRenderer)this.bipedHead).render(f);
        GL11.glPopMatrix();
    }
    
    private void renderBody(final EntityCustomNpc entity, final float f) {
        this.loadPlayerTexture(entity);
        final float x = 0.0f;
        final float y = entity.modelData.getBodyY();
        final float z = 0.0f;
        GL11.glPushMatrix();
        if (entity.currentAnimation == EnumAnimation.DANCING) {
            final float dancing = entity.ticksExisted / 4.0f;
            GL11.glTranslatef((float)Math.sin(dancing) * 0.015f, 0.0f, 0.0f);
        }
        final ModelPartConfig body = entity.modelData.body;
        ((ModelScaleRenderer)this.bipedBody).setConfig(body, x, y, z);
        ((ModelScaleRenderer)this.bipedBody).render(f);
        GL11.glPopMatrix();
    }
    
    public void renderArms(final EntityCustomNpc entity, final float f, final boolean bo) {
        this.loadPlayerTexture(entity);
        final ModelPartConfig arms = entity.modelData.arms;
        final float x = (1.0f - entity.modelData.body.scaleX) * 0.25f + (1.0f - arms.scaleX) * 0.075f;
        final float y = entity.modelData.getBodyY() + (1.0f - arms.scaleY) * -0.1f;
        final float z = 0.0f;
        GL11.glPushMatrix();
        if (entity.currentAnimation == EnumAnimation.DANCING) {
            final float dancing = entity.ticksExisted / 4.0f;
            GL11.glTranslatef((float)Math.sin(dancing) * 0.025f, (float)Math.abs(Math.cos(dancing)) * 0.125f - 0.02f, 0.0f);
        }
        if (!bo) {
            ((ModelScaleRenderer)this.bipedLeftArm).setConfig(arms, -x, y, z);
            ((ModelScaleRenderer)this.bipedLeftArm).render(f);
            ((ModelScaleRenderer)this.bipedRightArm).setConfig(arms, x, y, z);
            ((ModelScaleRenderer)this.bipedRightArm).render(f);
        }
        else {
            ((ModelScaleRenderer)this.bipedRightArm).setConfig(arms, 0.0f, 0.0f, 0.0f);
            ((ModelScaleRenderer)this.bipedRightArm).render(f);
        }
        GL11.glPopMatrix();
    }
    
    private void renderLegs(final EntityCustomNpc entity, final float f) {
        this.loadPlayerTexture(entity);
        final ModelPartConfig legs = entity.modelData.legs;
        final float x = (1.0f - legs.scaleX) * 0.125f;
        final float y = entity.modelData.getLegsY();
        final float z = 0.0f;
        GL11.glPushMatrix();
        this.legs.setConfig(legs, x, y, z);
        this.legs.render(f);
        if (!this.isArmor) {
            this.tail.setConfig(legs, 0.0f, y, z);
            this.tail.render(f);
        }
        GL11.glPopMatrix();
    }
    
    public ModelRenderer getRandomModelBox(final Random par1Random) {
        final int random = par1Random.nextInt(5);
        switch (random) {
            case 0: {
                return this.bipedRightLeg;
            }
            case 1: {
                return this.bipedHead;
            }
            case 2: {
                return this.bipedLeftArm;
            }
            case 3: {
                return this.bipedRightArm;
            }
            case 4: {
                return this.bipedLeftLeg;
            }
            default: {
                return this.bipedBody;
            }
        }
    }
}
