package com.flansmod.client.model;

import org.lwjgl.opengl.GL11;

import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.teams.ArmourType;
import noppes.npcs.CustomNpcs;
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

	protected float dancingTicks;

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
			setRotationAnglesCustomNpc(f, f1, f2, f3, f4, f5, (EntityNPCInterface)entity);
			renderHeadNPC((EntityNPCInterface)entity, f5);
			renderBodyNPC((EntityNPCInterface)entity, f5);
			renderLeftArmNPC((EntityNPCInterface)entity, f5);
			renderRightArmNPC((EntityNPCInterface)entity, f5);
		}
		else
		{
			setRotationAngles(f, f1, f2, f3, f4, f5, entity);
			render(headModel, bipedHead, f5, type.modelScale);
			render(bodyModel, bipedBody, f5, type.modelScale);
			render(leftArmModel, bipedLeftArm, f5, type.modelScale);
			render(rightArmModel, bipedRightArm, f5, type.modelScale);
		}
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

	@Override
	public void setRotationAngles(float par1, float par2, float par3, float par4, float par5, float par6, Entity entity)
	{
		setInitialAngles();
		super.setRotationAngles(par1, par2, par3, par4, par5, par6, entity);
	}

	@Override
	public void setLivingAnimations(EntityLivingBase par1EntityLiving, float f6, float f5, float par9)
	{
		dancingTicks = CustomNpcs.ticks / 3.978873F;
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

	public void renderHeadNPC(EntityNPCInterface npc, float f)
	{
		if(npc.currentAnimation == EnumAnimation.DANCING)
		{
			float dancing = (npc instanceof EntityCustomNpc) ? npc.ticksExisted / 4f : dancingTicks;
			GL11.glPushMatrix();
			GL11.glTranslatef((float)Math.sin(dancing) * 0.075F, (float)Math.abs(Math.cos(dancing)) * 0.125F - 0.02F, (float)(-Math.abs(Math.cos(dancing))) * 0.075F);
			render(headModel, bipedHead, f, type.modelScale);
			GL11.glPopMatrix();
		}
		else
		{
			render(headModel, bipedHead, f, type.modelScale);
		}
	}
	protected void renderLeftArmNPC(EntityNPCInterface npc, float f)
	{
		if(npc.currentAnimation == EnumAnimation.DANCING)
		{
			float dancing = (npc instanceof EntityCustomNpc) ? npc.ticksExisted / 4f : dancingTicks;
			GL11.glPushMatrix();
			GL11.glTranslatef((float)Math.sin(dancing) * 0.025F, (float)Math.abs(Math.cos(dancing)) * 0.125F - 0.02F, 0.0F);
			render(leftArmModel, bipedLeftArm, f, type.modelScale);
			GL11.glPopMatrix();
		}
		else
		{
			render(leftArmModel, bipedLeftArm, f, type.modelScale);
		}
	}

	protected void renderRightArmNPC(EntityNPCInterface npc, float f)
	{
		if(npc.currentAnimation == EnumAnimation.DANCING)
		{
			float dancing = (npc instanceof EntityCustomNpc) ? npc.ticksExisted / 4f : dancingTicks;
			GL11.glPushMatrix();
			GL11.glTranslatef((float)Math.sin(dancing) * 0.025F, (float)Math.abs(Math.cos(dancing)) * 0.125F - 0.02F, 0.0F);
			render(rightArmModel, bipedRightArm, f, type.modelScale);
			GL11.glPopMatrix();
		}
		else
		{
			render(rightArmModel, bipedRightArm, f, type.modelScale);
		}
	}
	protected void renderBodyNPC(EntityNPCInterface npc, float f)
	{
		if(npc.currentAnimation == EnumAnimation.DANCING)
		{
			float dancing = (npc instanceof EntityCustomNpc) ? npc.ticksExisted / 4f : dancingTicks;
			GL11.glPushMatrix();
			GL11.glTranslatef((float)Math.sin(dancing) * 0.015F, 0.0F, 0.0F);
			render(bodyModel, bipedBody, f, type.modelScale);
			GL11.glPopMatrix();
		}
		else
		{
			render(bodyModel, bipedBody, f, type.modelScale);
		}
	}

	public void setRotationAnglesCustomNpc(float par1, float par2, float par3, float par4, float par5, float par6, EntityNPCInterface entity)
	{
		EnumAnimation currentAnimation = entity.currentAnimation;
		isRiding = entity.isRiding() || (currentAnimation == EnumAnimation.SITTING);
		isSneak = entity.isSneaking() || (currentAnimation == EnumAnimation.SNEAKING);
		heldItemLeft = (entity.getOffHand() != null) ? 1 : 0;

		if(entity.currentAnimation == EnumAnimation.AIMING) aimedBow = true;

		if(isSneak && (entity.currentAnimation == EnumAnimation.CRAWLING || entity.currentAnimation == EnumAnimation.LYING))
			isSneak = false;

		setRotationAngles(par1, par2, par3, par4, par5, par6, entity);

		bipedHead.rotateAngleY = par4 / (180F / (float)Math.PI);
		bipedHead.rotateAngleX = par5 / (180F / (float)Math.PI);
		bipedHeadwear.rotateAngleY = bipedHead.rotateAngleY;
		bipedHeadwear.rotateAngleX = bipedHead.rotateAngleX;
		bipedRightArm.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 2.0F * par2 * 0.5F;
		bipedLeftArm.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 2.0F * par2 * 0.5F;
		bipedRightArm.rotateAngleZ = 0.0F;
		bipedLeftArm.rotateAngleZ = 0.0F;
		bipedRightLeg.rotateAngleX = MathHelper.cos(par1 * 0.6662F) * 1.4F * par2;
		bipedLeftLeg.rotateAngleX = MathHelper.cos(par1 * 0.6662F + (float)Math.PI) * 1.4F * par2;
		bipedRightLeg.rotateAngleY = 0.0F;
		bipedLeftLeg.rotateAngleY = 0.0F;

		if (isRiding)
		{
			bipedRightArm.rotateAngleX += -((float)Math.PI / 5F);
			bipedLeftArm.rotateAngleX += -((float)Math.PI / 5F);
			bipedRightLeg.rotateAngleX = -((float)Math.PI * 2F / 5F);
			bipedLeftLeg.rotateAngleX = -((float)Math.PI * 2F / 5F);
			bipedRightLeg.rotateAngleY = ((float)Math.PI / 10F);
			bipedLeftLeg.rotateAngleY = -((float)Math.PI / 10F);
		}

		if (heldItemLeft != 0)
		{
			bipedLeftArm.rotateAngleX = bipedLeftArm.rotateAngleX * 0.5F - ((float)Math.PI / 10F) * (float)heldItemLeft;
		}

		if (heldItemRight != 0)
		{
			bipedRightArm.rotateAngleX = bipedRightArm.rotateAngleX * 0.5F - ((float)Math.PI / 10F) * (float)heldItemRight;
		}

		bipedRightArm.rotateAngleY = 0.0F;
		bipedLeftArm.rotateAngleY = 0.0F;

		if (onGround > -9990F)
		{
			float f = onGround;
			bipedBody.rotateAngleY = MathHelper.sin(MathHelper.sqrt_float(f) * (float)Math.PI * 2.0F) * 0.2F;
			bipedRightArm.rotationPointZ = MathHelper.sin(bipedBody.rotateAngleY) * 5F;
			bipedRightArm.rotationPointX = -MathHelper.cos(bipedBody.rotateAngleY) * 5F;
			bipedLeftArm.rotationPointZ = -MathHelper.sin(bipedBody.rotateAngleY) * 5F;
			bipedLeftArm.rotationPointX = MathHelper.cos(bipedBody.rotateAngleY) * 5F;
			bipedRightArm.rotateAngleY += bipedBody.rotateAngleY;
			bipedLeftArm.rotateAngleY += bipedBody.rotateAngleY;
			bipedLeftArm.rotateAngleX += bipedBody.rotateAngleY;
			f = 1.0F - onGround;
			f *= f;
			f *= f;
			f = 1.0F - f;
			float f2 = MathHelper.sin(f * (float)Math.PI);
			float f4 = MathHelper.sin(onGround * (float)Math.PI) * -(bipedHead.rotateAngleX - 0.7F) * 0.75F;
			bipedRightArm.rotateAngleX -= (double)f2 * 1.2D + (double)f4;
			bipedRightArm.rotateAngleY += bipedBody.rotateAngleY * 2.0F;
			bipedRightArm.rotateAngleZ = MathHelper.sin(onGround * (float)Math.PI) * -0.4F;
		}

		if (isSneak)
		{
			bipedBody.rotateAngleX = 0.5F;
			if (entity instanceof EntityCustomNpc)
				bipedBody.rotateAngleX /= ((EntityCustomNpc)entity).modelData.body.scaleY;
			bipedRightLeg.rotateAngleX -= 0.0F;
			bipedLeftLeg.rotateAngleX -= 0.0F;
			bipedRightArm.rotateAngleX += 0.4F;
			bipedLeftArm.rotateAngleX += 0.4F;
			bipedRightLeg.rotationPointZ = 4F;
			bipedLeftLeg.rotationPointZ = 4F;
			bipedRightLeg.rotationPointY = 9F;
			bipedLeftLeg.rotationPointY = 9F;
			bipedHead.rotationPointY = 1.0F;
		}
		else
		{
			bipedBody.rotateAngleX = 0.0F;
			bipedRightLeg.rotationPointZ = 0.0F;
			bipedLeftLeg.rotationPointZ = 0.0F;
			bipedRightLeg.rotationPointY = 12F;
			bipedLeftLeg.rotationPointY = 12F;
			bipedHead.rotationPointY = 0.0F;
		}

		bipedRightArm.rotateAngleZ += MathHelper.cos(par3 * 0.09F) * 0.05F + 0.05F;
		bipedLeftArm.rotateAngleZ -= MathHelper.cos(par3 * 0.09F) * 0.05F + 0.05F;
		bipedRightArm.rotateAngleX += MathHelper.sin(par3 * 0.067F) * 0.05F;
		bipedLeftArm.rotateAngleX -= MathHelper.sin(par3 * 0.067F) * 0.05F;

		if (aimedBow)
		{
			float f1 = 0.0F;
			float f3 = 0.0F;
			bipedRightArm.rotateAngleZ = 0.0F;
			bipedLeftArm.rotateAngleZ = 0.0F;
			bipedRightArm.rotateAngleY = -(0.1F - f1 * 0.6F) + bipedHead.rotateAngleY;
			bipedLeftArm.rotateAngleY = (0.1F - f1 * 0.6F) + bipedHead.rotateAngleY + 0.4F;
			bipedRightArm.rotateAngleX = -((float)Math.PI / 2F) + bipedHead.rotateAngleX;
			bipedLeftArm.rotateAngleX = -((float)Math.PI / 2F) + bipedHead.rotateAngleX;
			bipedRightArm.rotateAngleX -= f1 * 1.2F - f3 * 0.4F;
			bipedLeftArm.rotateAngleX -= f1 * 1.2F - f3 * 0.4F;
			bipedRightArm.rotateAngleZ += MathHelper.cos(par3 * 0.09F) * 0.05F + 0.05F;
			bipedLeftArm.rotateAngleZ -= MathHelper.cos(par3 * 0.09F) * 0.05F + 0.05F;
			bipedRightArm.rotateAngleX += MathHelper.sin(par3 * 0.067F) * 0.05F;
			bipedLeftArm.rotateAngleX -= MathHelper.sin(par3 * 0.067F) * 0.05F;
		}

		switch(currentAnimation)
		{
			case CRAWLING:
				setRotationAnglesCrawling(par1, par2, par3, par4, par5, par6, entity);
				break;
			case HUG:
				setRotationAnglesHug(par1, par2, par3, par4, par5, par6, entity);
				break;
			case WAVING:
				setRotationAnglesWaving(par1, par2, par3, par4, par5, par6, entity);
				break;
			case CRY:
				setRotationAnglesCry(par1, par2, par3, par4, par5, par6, entity);
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
						bipedLeftArm.rotateAngleZ -= MathHelper.cos(par2 * 0.09F) * 0.05F + 0.05F;
						bipedLeftArm.rotateAngleX -= MathHelper.sin(par2 * 0.067F) * 0.05F;
					}
				}

				if(!job.rarm.disabled)
				{
					bipedRightArm.rotateAngleX = job.rarm.rotationX * pi;
					bipedRightArm.rotateAngleY = job.rarm.rotationY * pi;
					bipedRightArm.rotateAngleZ = job.rarm.rotationZ * pi;

					if(!entity.display.disableLivingAnimation)
					{
						bipedRightArm.rotateAngleZ += MathHelper.cos(par2 * 0.09F) * 0.05F + 0.05F;
						bipedRightArm.rotateAngleX += MathHelper.sin(par2 * 0.067F) * 0.05F;
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

	protected void setInitialAngles()
	{
		// Head
		bipedHead.rotationPointX = 0F;
		bipedHead.rotationPointY = 0F;
		bipedHead.rotationPointZ = 0F;
		bipedHead.rotateAngleZ = 0F;
		bipedHeadwear.rotationPointX = 0F;
		bipedHeadwear.rotationPointY = 0F;
		bipedHeadwear.rotationPointZ = 0F;
		bipedHeadwear.rotateAngleZ = 0F;

		// Body
		bipedBody.rotationPointX = 0F;
		bipedBody.rotationPointY = 0F;
		bipedBody.rotationPointZ = 0F;
		bipedBody.rotateAngleX = 0F;
		bipedBody.rotateAngleY = 0F;
		bipedBody.rotateAngleZ = 0F;

		// Legs
		bipedLeftLeg.rotateAngleX = 0F;
		bipedLeftLeg.rotateAngleY = 0F;
		bipedLeftLeg.rotateAngleZ = 0F;
		bipedRightLeg.rotateAngleX = 0F;
		bipedRightLeg.rotateAngleY = 0F;
		bipedRightLeg.rotateAngleZ = 0F;

		// Arms
		bipedLeftArm.rotationPointY = 2F;
		bipedLeftArm.rotationPointZ = 0F;
		bipedRightArm.rotationPointY = 2F;
		bipedRightArm.rotationPointZ = 0F;
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