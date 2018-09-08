package com.flansmod.client.model;

import org.lwjgl.opengl.GL11;

import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.teams.ArmourType;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import noppes.npcs.client.model.ModelMPM;
import noppes.npcs.client.model.ModelNPCMale;
import noppes.npcs.client.model.animation.AniCrawling;
import noppes.npcs.client.model.animation.AniHug;
import noppes.npcs.client.model.util.ModelScaleRenderer;
import noppes.npcs.constants.EnumAnimation;
import noppes.npcs.entity.EntityCustomNpc;
import noppes.npcs.entity.EntityNPCInterface;

public class ModelCustomArmour extends ModelBiped 
{
	public ArmourType type;
	
	public ModelRendererTurbo[] headModel = new ModelRendererTurbo[0];
	public ModelRendererTurbo[] bodyModel = new ModelRendererTurbo[0];
	public ModelRendererTurbo[] leftArmModel = new ModelRendererTurbo[0];
	public ModelRendererTurbo[] rightArmModel = new ModelRendererTurbo[0];
	public ModelRendererTurbo[] leftLegModel = new ModelRendererTurbo[0];
	public ModelRendererTurbo[] rightLegModel = new ModelRendererTurbo[0];
	public ModelRendererTurbo[] skirtFrontModel = new ModelRendererTurbo[0]; //Acts like a leg piece, but its pitch is set to the maximum of the two legs
	public ModelRendererTurbo[] skirtRearModel = new ModelRendererTurbo[0]; //Acts like a leg piece, but its pitch is set to the minimum of the two legs

	public void setRotationAnglesDANCING(float par1, float par2, float par3, float par4, float par5, float par6, Entity entity)
	{
	    float dancing = entity.ticksExisted / 4.0F;
	    float x = (float)Math.sin(dancing);
	    float y = (float)Math.abs(Math.cos(dancing));
	    
        this.bipedRightArm.rotationPointX = -5.0F;
        this.bipedLeftArm.rotationPointX = 5.0F;
        this.bipedRightArm.rotationPointY += 2.0F;
        this.bipedLeftArm.rotationPointY += 2.0F;
        this.bipedRightArm.rotationPointZ = 0.0F;
        this.bipedLeftArm.rotationPointZ = 0.0F;
	    
	    this.bipedHeadwear.rotationPointX = (this.bipedHead.rotationPointX = x * 0.75F);
	    this.bipedHeadwear.rotationPointY = (this.bipedHead.rotationPointY = y * 1.25F - 0.02F);
	    this.bipedHeadwear.rotationPointZ = (this.bipedHead.rotationPointZ = -y * 0.75F);
	    
	    this.bipedLeftArm.rotationPointX += x * 0.25F;
	    this.bipedLeftArm.rotationPointY = y * 1.25F;
	    
	    this.bipedRightArm.rotationPointX += x * 0.25F;
	    this.bipedRightArm.rotationPointY = y * 1.25F;
	    
	    this.bipedBody.rotationPointX = (x * 0.25F);
	}
	
	public void setRotationAnglesAIMING(float par1, float par2, float par3, float par4, float par5, float par6, Entity entity)
	{
		float f6 = 0.0F;
        float f7 = 0.0F;
        this.bipedHead.rotateAngleY = par4 / (180F / (float)Math.PI);
        this.bipedHead.rotateAngleX = par5 / (180F / (float)Math.PI);
        this.bipedRightArm.rotateAngleZ = 0.0F;
        this.bipedLeftArm.rotateAngleZ = 0.0F;
        this.bipedRightArm.rotateAngleY = -(0.1F - f6 * 0.6F) + this.bipedHead.rotateAngleY;
        this.bipedLeftArm.rotateAngleY = 0.1F - f6 * 0.6F + this.bipedHead.rotateAngleY + 0.4F;
        this.bipedRightArm.rotateAngleX = -((float)Math.PI / 2F) + this.bipedHead.rotateAngleX;
        this.bipedLeftArm.rotateAngleX = -((float)Math.PI / 2F) + this.bipedHead.rotateAngleX;
        this.bipedRightArm.rotateAngleX -= f6 * 1.2F - f7 * 0.4F;
        this.bipedLeftArm.rotateAngleX -= f6 * 1.2F - f7 * 0.4F;
		this.bipedRightArm.rotateAngleZ += MathHelper.cos(par3 * 0.09F) * 0.05F + 0.05F;
        this.bipedLeftArm.rotateAngleZ -= MathHelper.cos(par3 * 0.09F) * 0.05F + 0.05F;
        this.bipedRightArm.rotateAngleX += MathHelper.sin(par3 * 0.067F) * 0.05F;
        this.bipedLeftArm.rotateAngleX -= MathHelper.sin(par3 * 0.067F) * 0.05F;
        this.bipedRightLeg.rotateAngleX = 0.0F;
        this.bipedLeftLeg.rotateAngleX = 0.0F;
	 }
	
	public void setRotationAnglesSITTING(float par1, float par2, float par3, float par4, float par5, float par6, Entity entity)
	{
		this.bipedRightArm.rotateAngleX = -((float)Math.PI / 5F);
	    this.bipedLeftArm.rotateAngleX = -((float)Math.PI / 5F);
	    this.bipedRightLeg.rotateAngleX = -((float)Math.PI * 2F / 5F);
	    this.bipedLeftLeg.rotateAngleX = -((float)Math.PI * 2F / 5F);
	    this.bipedRightLeg.rotateAngleY = ((float)Math.PI / 10F);
	    this.bipedLeftLeg.rotateAngleY = -((float)Math.PI / 10F);
	    this.bipedHead.rotateAngleY = par4 / (180F / (float)Math.PI);
        this.bipedHead.rotateAngleX = par5 / (180F / (float)Math.PI);
	}
	
	public void setRotationAnglesHUG(float par1, float par2, float par3, float par4, float par5, float par6, Entity entity)
	{
		final float f6 = MathHelper.sin(this.onGround * 3.141593f);
        final float f7 = MathHelper.sin((1.0f - (1.0f - this.onGround) * (1.0f - this.onGround)) * 3.141593f);
        /*this.bipedRightArm.rotateAngleZ = 0.0f;
        this.bipedLeftArm.rotateAngleZ = 0.0f;
        this.bipedRightArm.rotateAngleY = -(0.1f - f6 * 0.6f);
        this.bipedLeftArm.rotateAngleY = 0.1f;
        this.bipedRightArm.rotateAngleX = -1.570796f;
        this.bipedLeftArm.rotateAngleX = -1.570796f;
        this.bipedRightArm.rotateAngleX -= f6 * 1.2f - f7 * 0.4f;
        this.bipedLeftArm.rotateAngleZ -= MathHelper.cos(par3 * 0.09f) * 0.05f + 0.05f;*/
        this.bipedRightArm.rotateAngleZ = 0.0F;
        this.bipedLeftArm.rotateAngleZ = 0.0F;
        this.bipedRightArm.rotateAngleY = (-(0.1F - f6 * 0.6F));
        this.bipedLeftArm.rotateAngleY = 0.1F;
        this.bipedRightArm.rotateAngleX = -1.570796F;
        this.bipedLeftArm.rotateAngleX = -1.570796F;
        this.bipedRightArm.rotateAngleX -= f6 * 1.2F - f7 * 0.4F;
        
        this.bipedRightArm.rotateAngleZ += MathHelper.cos(par3 * 0.09F) * 0.05F + 0.05F;
        this.bipedLeftArm.rotateAngleZ -= MathHelper.cos(par3 * 0.09F) * 0.05F + 0.05F;
        this.bipedRightArm.rotateAngleX += MathHelper.sin(par3 * 0.067F) * 0.05F;
        this.bipedLeftArm.rotateAngleX -= MathHelper.sin(par3 * 0.067F) * 0.05F;
        
	}
	
	public void setRotationAnglesCRAWLING(float par1, float par2, float par3, float par4, float par5, float par6, Entity entity)
	{
		this.bipedHead.rotateAngleZ = -par4 / 57.295776f;
		this.bipedHead.rotateAngleY = 0.0f;
		this.bipedHead.rotateAngleX = -0.95993114f;
		this.bipedHeadwear.rotateAngleX = this.bipedHead.rotateAngleX;
		this.bipedHeadwear.rotateAngleY = this.bipedHead.rotateAngleY;
		this.bipedHeadwear.rotateAngleZ = this.bipedHead.rotateAngleZ;
        if (par2 > 0.25) {
            par2 = 0.25f;
        }
        final float movement = MathHelper.cos(par1 * 0.8f + 3.1415927f) * par2;
        this.bipedLeftArm.rotateAngleX = 3.1415927f - movement * 0.25f;
        this.bipedLeftArm.rotateAngleY = movement * -0.46f;
        this.bipedLeftArm.rotateAngleZ = movement * -0.2f;
        this.bipedLeftArm.rotationPointY = 2.0f - movement * 9.0f;
        this.bipedRightArm.rotateAngleX = 3.1415927f + movement * 0.25f;
        this.bipedRightArm.rotateAngleY = movement * -0.4f;
        this.bipedRightArm.rotateAngleZ = movement * -0.2f;
        this.bipedRightArm.rotationPointY = 2.0f + movement * 9.0f;
        this.bipedBody.rotateAngleY = movement * 0.1f;
        this.bipedBody.rotateAngleX = 0.0f;
        this.bipedBody.rotateAngleZ = movement * 0.1f;
        this.bipedLeftLeg.rotateAngleX = movement * 0.1f;
        this.bipedLeftLeg.rotateAngleY = movement * 0.1f;
        this.bipedLeftLeg.rotateAngleZ = -0.122173056f - movement * 0.25f;
        this.bipedLeftLeg.rotationPointY = 10.4f + movement * 9.0f;
        this.bipedLeftLeg.rotationPointZ = movement * 0.6f - 0.01f;
        this.bipedRightLeg.rotateAngleX = movement * -0.1f;
        this.bipedRightLeg.rotateAngleY = movement * 0.1f;
        this.bipedRightLeg.rotateAngleZ = 0.122173056f - movement * 0.25f;
        this.bipedRightLeg.rotationPointY = 10.4f - movement * 9.0f;
        this.bipedRightLeg.rotationPointZ = movement * -0.6f - 0.01f;
        
        this.bipedBody.rotationPointX -= 0.1f;
        this.bipedHead.rotationPointY -= 0.1f;
	}
	
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{ 
		GL11.glPushMatrix();
		GL11.glScalef(type.modelScale, type.modelScale, type.modelScale);
		isSneak = entity.isSneaking();
		ItemStack itemstack = ((EntityLivingBase)entity).getEquipmentInSlot(0);
        heldItemRight = itemstack != null ? 1 : 0;

        aimedBow = false;
        if ((entity instanceof EntityCustomNpc)) 
        {
        	final EntityCustomNpc npc = (EntityCustomNpc)entity;
        	this.bipedLeftArm.rotateAngleX = 0.0F;
        	if (npc.currentAnimation == EnumAnimation.NONE || npc.currentAnimation == EnumAnimation.LYING || npc.currentAnimation == EnumAnimation.SNEAKING) {
        		heldItemLeft = 0;
        		if (npc.getOffHand() != null) heldItemLeft = 1;
        		if (this.heldItemLeft != 0) 
        		{
        			this.bipedLeftArm.rotateAngleX = this.bipedLeftArm.rotateAngleX * 0.5f - 0.31415927f * this.heldItemLeft;
        		}
        	}
        	this.bipedRightArm.rotationPointY = 2.0F;
            this.bipedLeftArm.rotationPointY = 2.0F;
            this.bipedRightLeg.rotateAngleZ = 0.0F;
            this.bipedLeftLeg.rotateAngleZ = 0.0F;
            this.bipedLeftArm.rotateAngleX = 0.0F;
            setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        	/*this.bipedRightLeg.rotationPointX = -1.9F;
            this.bipedLeftLeg.rotationPointX = 2.1F;*/
        	
        	
        	if (npc.currentAnimation == EnumAnimation.HUG) 
        	{
        		setRotationAnglesHUG(f, f1, f2, f3, f4, f5, entity);
        	} 
        	else if (npc.currentAnimation == EnumAnimation.AIMING) 
        	{
        		setRotationAnglesAIMING(f, f1, f2, f3, f4, f5, entity);
        	} 
        	else if (npc.currentAnimation == EnumAnimation.SITTING) 
        	{
                this.bipedRightArm.rotateAngleX -= 0.62831855f;
                this.bipedLeftArm.rotateAngleX -= 0.62831855f;
                this.bipedRightLeg.rotateAngleX = -1.2566371f;
                this.bipedLeftLeg.rotateAngleX = -1.2566371f;
                this.bipedRightLeg.rotateAngleY = 0.31415927f;
                this.bipedLeftLeg.rotateAngleY = -0.31415927f;
        	} 
        	else if (npc.currentAnimation == EnumAnimation.DANCING) 
        	{
        		setRotationAnglesDANCING(f, f1, f2, f3, f4, f5, entity);
        	} 
        	else if (npc.currentAnimation == EnumAnimation.CRAWLING) 
        	{
        		setRotationAnglesCRAWLING(f, f1, f2, f3, f4, f5, entity);
        	} 
        	else if (npc.currentAnimation == EnumAnimation.SNEAKING) 
        	{
        		this.bipedBody.rotateAngleX = 0.5f;
                this.bipedRightLeg.rotateAngleX -= 0.0f;
                this.bipedLeftLeg.rotateAngleX -= 0.0f;
                this.bipedRightLeg.rotationPointZ = 4.0f;
                this.bipedLeftLeg.rotationPointZ = 4.0f;
                this.bipedRightLeg.rotationPointY = 9.0f;
                this.bipedLeftLeg.rotationPointY = 9.0f;
                this.bipedHead.rotationPointY = 1.0f;
        	}
        }
		else 
		{
        	setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        }
		render(headModel, bipedHead, f5, type.modelScale);
		render(bodyModel, bipedBody, f5, type.modelScale);
		render(leftArmModel, bipedLeftArm, f5, type.modelScale);
		render(rightArmModel, bipedRightArm, f5, type.modelScale);
		render(leftLegModel, bipedLeftLeg, f5, type.modelScale);
		render(rightLegModel, bipedRightLeg, f5, type.modelScale);
		//Skirt front
		{
			for(ModelRendererTurbo mod : skirtFrontModel)
			{
				mod.rotationPointX = (bipedLeftLeg.rotationPointX + bipedRightLeg.rotationPointX) / 2F / type.modelScale;
				mod.rotationPointY = (bipedLeftLeg.rotationPointY + bipedRightLeg.rotationPointY) / 2F / type.modelScale;
				mod.rotationPointZ = (bipedLeftLeg.rotationPointZ + bipedRightLeg.rotationPointZ) / 2F / type.modelScale;
				mod.rotateAngleX = Math.min(bipedLeftLeg.rotateAngleX, bipedRightLeg.rotateAngleX);
				mod.rotateAngleY = bipedLeftLeg.rotateAngleY;
				mod.rotateAngleZ = bipedLeftLeg.rotateAngleZ;
				mod.render(f5);
			}
		}
		//Skirt back
		{
			for(ModelRendererTurbo mod : skirtRearModel)
			{
				mod.rotationPointX = (bipedLeftLeg.rotationPointX + bipedRightLeg.rotationPointX) / 2F / type.modelScale;
				mod.rotationPointY = (bipedLeftLeg.rotationPointY + bipedRightLeg.rotationPointY) / 2F / type.modelScale;
				mod.rotationPointZ = (bipedLeftLeg.rotationPointZ + bipedRightLeg.rotationPointZ) / 2F / type.modelScale;
				mod.rotateAngleX = Math.max(bipedLeftLeg.rotateAngleX, bipedRightLeg.rotateAngleX);
				mod.rotateAngleY = bipedLeftLeg.rotateAngleY;
				mod.rotateAngleZ = bipedLeftLeg.rotateAngleZ;
				mod.render(f5);
			}
		}
		GL11.glPopMatrix();
	} 
	
	public void render(ModelRendererTurbo[] models, ModelRenderer bodyPart, float f5, float scale)
	{
		setBodyPart(models, bodyPart, scale);
		for(ModelRendererTurbo mod : models)
		{
			mod.rotateAngleX = bodyPart.rotateAngleX;
			mod.rotateAngleY = bodyPart.rotateAngleY;
			mod.rotateAngleZ = bodyPart.rotateAngleZ;
			mod.render(f5);
		}
	}
	
	public void setBodyPart(ModelRendererTurbo[] models, ModelRenderer bodyPart, float scale)
	{
		for(ModelRendererTurbo mod : models)
		{
			mod.rotationPointX = bodyPart.rotationPointX / scale;
			mod.rotationPointY = bodyPart.rotationPointY / scale;
			mod.rotationPointZ = bodyPart.rotationPointZ / scale;
		}
	}
}