package com.flansmod.client.model;

import org.lwjgl.opengl.GL11;

import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.teams.ArmourType;
import noppes.npcs.constants.EnumAnimation;
import noppes.npcs.entity.EntityCustomNpc;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;

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

	public void setRotationAnglesDancing(float par1, float par2, float par3, float par4, float par5, float par6, Entity entity)
	{
	    float dancing = entity.ticksExisted / 4.0F;
	    float x = (float)Math.sin(dancing);
	    float y = (float)Math.abs(Math.cos(dancing));
	    
        bipedRightArm.rotationPointX = -5.0F;
        bipedLeftArm.rotationPointX = 5.0F;
        bipedRightArm.rotationPointY += 2.0F;
        bipedLeftArm.rotationPointY += 2.0F;
        bipedRightArm.rotationPointZ = 0.0F;
        bipedLeftArm.rotationPointZ = 0.0F;
	    
	    bipedHeadwear.rotationPointX = (bipedHead.rotationPointX = x * 0.75F);
	    bipedHeadwear.rotationPointY = (bipedHead.rotationPointY = y * 1.25F - 0.02F);
	    bipedHeadwear.rotationPointZ = (bipedHead.rotationPointZ = -y * 0.75F);
	    
	    bipedLeftArm.rotationPointX += x * 0.25F;
	    bipedLeftArm.rotationPointY = y * 1.25F;
	    
	    bipedRightArm.rotationPointX += x * 0.25F;
	    bipedRightArm.rotationPointY = y * 1.25F;
	    
	    bipedBody.rotationPointX = (x * 0.25F);
	}
	
	public void setRotationAnglesAiming(float par1, float par2, float par3, float par4, float par5, float par6, Entity entity)
	{
		float f6 = 0.0F;
        float f7 = 0.0F;
        bipedHead.rotateAngleY = par4 / (180F / (float)Math.PI);
        bipedHead.rotateAngleX = par5 / (180F / (float)Math.PI);
        bipedRightArm.rotateAngleZ = 0.0F;
        bipedLeftArm.rotateAngleZ = 0.0F;
        bipedRightArm.rotateAngleY = -(0.1F - f6 * 0.6F) + bipedHead.rotateAngleY;
        bipedLeftArm.rotateAngleY = 0.1F - f6 * 0.6F + bipedHead.rotateAngleY + 0.4F;
        bipedRightArm.rotateAngleX = -((float)Math.PI / 2F) + bipedHead.rotateAngleX;
        bipedLeftArm.rotateAngleX = -((float)Math.PI / 2F) + bipedHead.rotateAngleX;
        bipedRightArm.rotateAngleX -= f6 * 1.2F - f7 * 0.4F;
        bipedLeftArm.rotateAngleX -= f6 * 1.2F - f7 * 0.4F;
		bipedRightArm.rotateAngleZ += MathHelper.cos(par3 * 0.09F) * 0.05F + 0.05F;
        bipedLeftArm.rotateAngleZ -= MathHelper.cos(par3 * 0.09F) * 0.05F + 0.05F;
        bipedRightArm.rotateAngleX += MathHelper.sin(par3 * 0.067F) * 0.05F;
        bipedLeftArm.rotateAngleX -= MathHelper.sin(par3 * 0.067F) * 0.05F;
        bipedRightLeg.rotateAngleX = 0.0F;
        bipedLeftLeg.rotateAngleX = 0.0F;
	 }
	
	public void setRotationAnglesSitting(float par1, float par2, float par3, float par4, float par5, float par6, Entity entity)
	{
		bipedRightArm.rotateAngleX = -((float)Math.PI / 5F);
	    bipedLeftArm.rotateAngleX = -((float)Math.PI / 5F);
	    bipedRightLeg.rotateAngleX = -((float)Math.PI * 2F / 5F);
	    bipedLeftLeg.rotateAngleX = -((float)Math.PI * 2F / 5F);
	    bipedRightLeg.rotateAngleY = ((float)Math.PI / 10F);
	    bipedLeftLeg.rotateAngleY = -((float)Math.PI / 10F);
	    bipedHead.rotateAngleY = par4 / (180F / (float)Math.PI);
        bipedHead.rotateAngleX = par5 / (180F / (float)Math.PI);
	}
	
	public void setRotationAnglesHUG(float par1, float par2, float par3, float par4, float par5, float par6, Entity entity)
	{
		final float f6 = MathHelper.sin(onGround * 3.141593f);
        final float f7 = MathHelper.sin((1.0f - (1.0f - onGround) * (1.0f - onGround)) * 3.141593f);
        /*bipedRightArm.rotateAngleZ = 0.0f;
        bipedLeftArm.rotateAngleZ = 0.0f;
        bipedRightArm.rotateAngleY = -(0.1f - f6 * 0.6f);
        bipedLeftArm.rotateAngleY = 0.1f;
        bipedRightArm.rotateAngleX = -1.570796f;
        bipedLeftArm.rotateAngleX = -1.570796f;
        bipedRightArm.rotateAngleX -= f6 * 1.2f - f7 * 0.4f;
        bipedLeftArm.rotateAngleZ -= MathHelper.cos(par3 * 0.09f) * 0.05f + 0.05f;*/
        bipedRightArm.rotateAngleZ = 0.0F;
        bipedLeftArm.rotateAngleZ = 0.0F;
        bipedRightArm.rotateAngleY = (-(0.1F - f6 * 0.6F));
        bipedLeftArm.rotateAngleY = 0.1F;
        bipedRightArm.rotateAngleX = -1.570796F;
        bipedLeftArm.rotateAngleX = -1.570796F;
        bipedRightArm.rotateAngleX -= f6 * 1.2F - f7 * 0.4F;
        
        bipedRightArm.rotateAngleZ += MathHelper.cos(par3 * 0.09F) * 0.05F + 0.05F;
        bipedLeftArm.rotateAngleZ -= MathHelper.cos(par3 * 0.09F) * 0.05F + 0.05F;
        bipedRightArm.rotateAngleX += MathHelper.sin(par3 * 0.067F) * 0.05F;
        bipedLeftArm.rotateAngleX -= MathHelper.sin(par3 * 0.067F) * 0.05F;
        
	}
	
	public void setRotationAnglesCrawling(float par1, float par2, float par3, float par4, float par5, float par6, Entity entity)
	{
		bipedHead.rotateAngleZ = -par4 / 57.295776f;
		bipedHead.rotateAngleY = 0.0f;
		bipedHead.rotateAngleX = -0.95993114f;
		bipedHeadwear.rotateAngleX = bipedHead.rotateAngleX;
		bipedHeadwear.rotateAngleY = bipedHead.rotateAngleY;
		bipedHeadwear.rotateAngleZ = bipedHead.rotateAngleZ;
        if (par2 > 0.25) {
            par2 = 0.25f;
        }
        final float movement = MathHelper.cos(par1 * 0.8f + 3.1415927f) * par2;
        bipedLeftArm.rotateAngleX = 3.1415927f - movement * 0.25f;
        bipedLeftArm.rotateAngleY = movement * -0.46f;
        bipedLeftArm.rotateAngleZ = movement * -0.2f;
        bipedLeftArm.rotationPointY = 2.0f - movement * 9.0f;
        bipedRightArm.rotateAngleX = 3.1415927f + movement * 0.25f;
        bipedRightArm.rotateAngleY = movement * -0.4f;
        bipedRightArm.rotateAngleZ = movement * -0.2f;
        bipedRightArm.rotationPointY = 2.0f + movement * 9.0f;
        bipedBody.rotateAngleY = movement * 0.1f;
        bipedBody.rotateAngleX = 0.0f;
        bipedBody.rotateAngleZ = movement * 0.1f;
        bipedLeftLeg.rotateAngleX = movement * 0.1f;
        bipedLeftLeg.rotateAngleY = movement * 0.1f;
        bipedLeftLeg.rotateAngleZ = -0.122173056f - movement * 0.25f;
        bipedLeftLeg.rotationPointY = 10.4f + movement * 9.0f;
        bipedLeftLeg.rotationPointZ = movement * 0.6f - 0.01f;
        bipedRightLeg.rotateAngleX = movement * -0.1f;
        bipedRightLeg.rotateAngleY = movement * 0.1f;
        bipedRightLeg.rotateAngleZ = 0.122173056f - movement * 0.25f;
        bipedRightLeg.rotationPointY = 10.4f - movement * 9.0f;
        bipedRightLeg.rotationPointZ = movement * -0.6f - 0.01f;
        
        bipedBody.rotationPointX -= 0.1f;
        bipedHead.rotationPointY -= 0.1f;
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{ 
		GL11.glPushMatrix();
		GL11.glScalef(type.modelScale, type.modelScale, type.modelScale);
		isSneak = entity.isSneaking();
		ItemStack itemstack = ((EntityLivingBase)entity).getEquipmentInSlot(0);
        heldItemRight = itemstack != null ? 1 : 0;

        aimedBow = false;
		if (itemstack != null && entity instanceof EntityPlayer && ((EntityPlayer)entity).getItemInUseCount() > 0)
		{
			EnumAction enumaction = itemstack.getItemUseAction();
			if (enumaction == EnumAction.block)
			{
				heldItemRight = 3;
			}
			else if (enumaction == EnumAction.bow)
			{
				aimedBow = true;
			}
		}

        if ((entity instanceof EntityCustomNpc)) 
        {
			setRotationAnglesForCustomNpc(f, f1, f2, f3, f4, f5, (EntityCustomNpc)entity);
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

	public void setRotationAnglesForCustomNpc(float f, float f1, float f2, float f3, float f4, float f5, EntityCustomNpc entity)
	{
		bipedLeftArm.rotateAngleX = 0.0F;
		if (entity.currentAnimation == EnumAnimation.NONE || entity.currentAnimation == EnumAnimation.LYING || entity.currentAnimation == EnumAnimation.SNEAKING) {
			heldItemLeft = 0;
			if (entity.getOffHand() != null) heldItemLeft = 1;
			if (heldItemLeft != 0)
			{
				bipedLeftArm.rotateAngleX = bipedLeftArm.rotateAngleX * 0.5f - 0.31415927f * heldItemLeft;
			}
		}
		bipedRightArm.rotationPointY = 2.0F;
		bipedLeftArm.rotationPointY = 2.0F;
		bipedRightLeg.rotateAngleZ = 0.0F;
		bipedLeftLeg.rotateAngleZ = 0.0F;
		bipedLeftArm.rotateAngleX = 0.0F;
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		/*bipedRightLeg.rotationPointX = -1.9F;
        bipedLeftLeg.rotationPointX = 2.1F;*/


		if (entity.currentAnimation == EnumAnimation.HUG)
		{
			setRotationAnglesHUG(f, f1, f2, f3, f4, f5, entity);
		}
		else if (entity.currentAnimation == EnumAnimation.AIMING)
		{
			setRotationAnglesAiming(f, f1, f2, f3, f4, f5, entity);
		}
		else if (entity.currentAnimation == EnumAnimation.SITTING)
		{
			bipedRightArm.rotateAngleX -= 0.62831855f;
			bipedLeftArm.rotateAngleX -= 0.62831855f;
			bipedRightLeg.rotateAngleX = -1.2566371f;
			bipedLeftLeg.rotateAngleX = -1.2566371f;
			bipedRightLeg.rotateAngleY = 0.31415927f;
			bipedLeftLeg.rotateAngleY = -0.31415927f;
		}
		else if (entity.currentAnimation == EnumAnimation.DANCING)
		{
			setRotationAnglesDancing(f, f1, f2, f3, f4, f5, entity);
		}
		else if (entity.currentAnimation == EnumAnimation.CRAWLING)
		{
			setRotationAnglesCrawling(f, f1, f2, f3, f4, f5, entity);
		}
		else if (entity.currentAnimation == EnumAnimation.SNEAKING)
		{
			bipedBody.rotateAngleX = 0.5f;
			bipedRightLeg.rotateAngleX -= 0.0f;
			bipedLeftLeg.rotateAngleX -= 0.0f;
			bipedRightLeg.rotationPointZ = 4.0f;
			bipedLeftLeg.rotationPointZ = 4.0f;
			bipedRightLeg.rotationPointY = 9.0f;
			bipedLeftLeg.rotationPointY = 9.0f;
			bipedHead.rotationPointY = 1.0f;
		}
	}
}