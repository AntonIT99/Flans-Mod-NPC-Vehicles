package com.flansmod.client.model;

import org.lwjgl.opengl.GL11;

import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.teams.ArmourType;
import noppes.npcs.constants.EnumAnimation;
import noppes.npcs.constants.EnumJobType;
import noppes.npcs.entity.EntityCustomNpc;
import noppes.npcs.entity.EntityNPCInterface;
import noppes.npcs.roles.JobPuppet;

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

        if ((entity instanceof EntityNPCInterface))
        {
			setRotationAnglesForCustomNpc(f, f1, f2, f3, f4, f5, (EntityNPCInterface)entity);
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

	public void setRotationAnglesForCustomNpc(float f, float f1, float f2, float f3, float f4, float f5, EntityNPCInterface entity)
	{
		EnumAnimation currentAnimation = entity.currentAnimation;
		isRiding = entity.isRiding() || (currentAnimation == EnumAnimation.SITTING);
		isSneak = entity.isSneaking() || (currentAnimation == EnumAnimation.SNEAKING);
		heldItemLeft = (entity.getOffHand() != null) ? 1 : 0;

		if(entity.currentAnimation == EnumAnimation.AIMING) aimedBow = true;

		if(isSneak && (entity.currentAnimation == EnumAnimation.CRAWLING || entity.currentAnimation == EnumAnimation.LYING))
			isSneak = false;

		bipedRightArm.rotationPointY = 2.0F;
		bipedLeftArm.rotationPointY = 2.0F;
		bipedRightLeg.rotateAngleZ = 0.0F;
		bipedLeftLeg.rotateAngleZ = 0.0F;

		setRotationAngles(f, f1, f2, f3, f4, f5, entity);

		switch(currentAnimation)
		{
			case DANCING:
				setRotationAnglesDancing(f, f1, f2, f3, f4, f5, entity);
				break;
			case CRAWLING:
				setRotationAnglesCrawling(f, f1, f2, f3, f4, f5, entity);
				break;
			case HUG:
				setRotationAnglesHug(f, f1, f2, f3, f4, f5, entity);
				break;
			case WAVING:
				setRotationAnglesWaving(f, f1, f2, f3, f4, f5, entity);
				break;
			case CRY:
				setRotationAnglesCry(f, f1, f2, f3, f4, f5, entity);
				break;
		}

		if(entity.advanced.job == EnumJobType.Puppet)
		{
			JobPuppet job = (JobPuppet) entity.jobInterface;

			if(job.isActive())
			{
				float pi = (float) Math.PI;

				if(!job.head.disabled)
				{
					bipedHeadwear.rotateAngleX = bipedHead.rotateAngleX = job.head.rotationX * pi;
					bipedHeadwear.rotateAngleY = bipedHead.rotateAngleY = job.head.rotationY * pi;
					bipedHeadwear.rotateAngleZ = bipedHead.rotateAngleZ = job.head.rotationZ * pi;
				}

				if(!job.body.disabled)
				{
					bipedBody.rotateAngleX = job.body.rotationX * pi;
					bipedBody.rotateAngleY = job.body.rotationY * pi;
					bipedBody.rotateAngleZ = job.body.rotationZ * pi;
				}

				if(!job.larm.disabled)
				{
					bipedLeftArm.rotateAngleX = job.larm.rotationX * pi;
					bipedLeftArm.rotateAngleY = job.larm.rotationY * pi;
					bipedLeftArm.rotateAngleZ = job.larm.rotationZ * pi;

					if(!entity.display.disableLivingAnimation)
					{
						this.bipedLeftArm.rotateAngleZ -= MathHelper.cos(f2 * 0.09F) * 0.05F + 0.05F;
						this.bipedLeftArm.rotateAngleX -= MathHelper.sin(f2 * 0.067F) * 0.05F;
					}
				}

				if(!job.rarm.disabled)
				{
					bipedRightArm.rotateAngleX = job.rarm.rotationX * pi;
					bipedRightArm.rotateAngleY = job.rarm.rotationY * pi;
					bipedRightArm.rotateAngleZ = job.rarm.rotationZ * pi;

					if(!entity.display.disableLivingAnimation)
					{
						this.bipedRightArm.rotateAngleZ += MathHelper.cos(f2 * 0.09F) * 0.05F + 0.05F;
						this.bipedRightArm.rotateAngleX += MathHelper.sin(f2 * 0.067F) * 0.05F;
					}
				}

				if(!job.rleg.disabled)
				{
					bipedRightLeg.rotateAngleX = job.rleg.rotationX * pi;
					bipedRightLeg.rotateAngleY = job.rleg.rotationY * pi;
					bipedRightLeg.rotateAngleZ = job.rleg.rotationZ * pi;
				}

				if(!job.lleg.disabled)
				{
					bipedLeftLeg.rotateAngleX = job.lleg.rotationX * pi;
					bipedLeftLeg.rotateAngleY = job.lleg.rotationY * pi;
					bipedLeftLeg.rotateAngleZ = job.lleg.rotationZ * pi;
				}
			}
		}
	}

	public void setRotationAnglesDancing(float par1, float par2, float par3, float par4, float par5, float par6, Entity entity)
	{
		float dancing = entity.ticksExisted / 4.0F;
		float x = (float)Math.sin(dancing);
		float y = (float)Math.abs(Math.cos(dancing));

		bipedRightArm.rotationPointX = -5.0F;
		bipedLeftArm.rotationPointX = 5.0F;
		bipedRightArm.rotationPointZ = 0.0F;
		bipedLeftArm.rotationPointZ = 0.0F;

		bipedHeadwear.rotationPointX = (bipedHead.rotationPointX = x * 0.75F);
		bipedHeadwear.rotationPointY = (bipedHead.rotationPointY = y * 1.25F - 0.02F);
		bipedHeadwear.rotationPointZ = (bipedHead.rotationPointZ = -y * 0.75F);

		bipedLeftArm.rotationPointX += x * 0.25F;
		bipedLeftArm.rotationPointY = y * 1.25F + 2F;

		bipedRightArm.rotationPointX += x * 0.25F;
		bipedRightArm.rotationPointY = y * 1.25F + 2F;

		bipedBody.rotationPointX = (x * 0.25F);
	}

	public void setRotationAnglesHug(float par1, float par2, float par3, float par4, float par5, float par6, Entity entity)
	{
		final float f6 = MathHelper.sin(onGround * 3.141593F);
		final float f7 = MathHelper.sin((1.0F - (1.0F - onGround) * (1.0F - onGround)) * 3.141593F);
        bipedRightArm.rotateAngleZ = 0.0F;
        bipedLeftArm.rotateAngleZ = 0.0F;
        bipedRightArm.rotateAngleY = -(0.1F - f6 * 0.6F);
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
		bipedHead.rotateAngleZ = -par4 / (180F / (float)Math.PI);
		bipedHead.rotateAngleY = 0;
		bipedHead.rotateAngleX = -55 / (180F / (float)Math.PI);

		bipedHeadwear.rotateAngleX = bipedHead.rotateAngleX;
		bipedHeadwear.rotateAngleY = bipedHead.rotateAngleY;
		bipedHeadwear.rotateAngleZ = bipedHead.rotateAngleZ;

		if(par2 > 0.25)
			par2 = 0.25f;
		float movement = MathHelper.cos(par1 * 0.8f + (float)Math.PI) * par2;

		bipedLeftArm.rotateAngleX = 180 / (180F / (float)Math.PI) - movement * 0.25f;
		bipedLeftArm.rotateAngleY = movement * -0.46f;
		bipedLeftArm.rotateAngleZ = movement * -0.2f;
		bipedLeftArm.rotationPointY = 2 - movement * 9.0F;

		bipedRightArm.rotateAngleX = 180 / (180F / (float)Math.PI) + movement * 0.25f;
		bipedRightArm.rotateAngleY = movement * -0.4f;
		bipedRightArm.rotateAngleZ = movement * -0.2f;
		bipedRightArm.rotationPointY = 2 + movement * 9.0F;

		bipedBody.rotateAngleY = movement * 0.1f;
		bipedBody.rotateAngleX = 0;
		bipedBody.rotateAngleZ = movement * 0.1f;

		bipedLeftLeg.rotateAngleX = movement * 0.1f;
		bipedLeftLeg.rotateAngleY = movement * 0.1f;
		bipedLeftLeg.rotateAngleZ = -7 / (180F / (float)Math.PI) - movement * 0.25f;
		bipedLeftLeg.rotationPointY = 10.4f + movement * 9.0F;
		bipedLeftLeg.rotationPointZ = movement * 0.6f - 0.01f;

		bipedRightLeg.rotateAngleX = movement * -0.1f;
		bipedRightLeg.rotateAngleY = movement * 0.1f;
		bipedRightLeg.rotateAngleZ = 7 / (180F / (float)Math.PI) - movement * 0.25f;
		bipedRightLeg.rotationPointY = 10.4f - movement * 9.0F;
		bipedRightLeg.rotationPointZ = movement * -0.6f - 0.01f;
	}

	public void setRotationAnglesWaving(float par1, float par2, float par3, float par4, float par5, float par6, Entity entity)
	{
		bipedRightArm.rotateAngleX = -0.1f;
		bipedRightArm.rotateAngleY = 0;
		bipedRightArm.rotateAngleZ = (float) (Math.PI - 1f  - Math.sin(entity.ticksExisted * 0.27f) * 0.5f);
	}

	public void setRotationAnglesCry(float par1, float par2, float par3, float par4, float par5, float par6, Entity entity)
	{
		bipedHeadwear.rotateAngleX = bipedHead.rotateAngleX = 0.7f;
	}
}