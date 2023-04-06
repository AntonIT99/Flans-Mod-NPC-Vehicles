package com.flansmod.client.model;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.texture.TextureManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.client.IItemRenderer.ItemRenderType;
import net.minecraftforge.client.IItemRenderer.ItemRendererHelper;

import com.flansmod.client.FlansModResourceHandler;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.common.FlansMod;
import com.flansmod.common.driveables.DriveablePart;
import com.flansmod.common.driveables.DriveablePosition;
import com.flansmod.common.driveables.DriveableType;
import com.flansmod.common.driveables.EntityDriveable;
import com.flansmod.common.driveables.EntitySeat;
import com.flansmod.common.driveables.EntityVehicle;
import com.flansmod.common.driveables.EnumDriveablePart;
import com.flansmod.common.driveables.ItemVehicle;
import com.flansmod.common.driveables.ShootPoint;
import com.flansmod.common.driveables.VehicleType;
import com.flansmod.common.guns.BulletType;
import com.flansmod.common.guns.ItemBullet;
import com.flansmod.common.paintjob.Paintjob;
import com.flansmod.common.teams.TeamsManager;
import com.flansmod.common.vector.Vector3f;

public class RenderVehicle extends Render implements IItemRenderer
{
    public RenderVehicle()
    {
        shadowSize = 1.0F;
    }

    public void render(EntityVehicle vehicle, double d, double d1, double d2, float f, float f1)
    {
    	if(vehicle.ridingEntity != null)
    	{
    		if(vehicle.ridingEntity.getClass().toString().indexOf("mcheli.aircraft.MCH_EntitySeat") > 0)
    		{
    			return;
    		}
    	}
			
    	bindEntityTexture(vehicle);
    	VehicleType type = vehicle.getVehicleType();
        GL11.glPushMatrix();
        {
	        GL11.glTranslatef((float)d, (float)d1, (float)d2);
	        float dYaw = (vehicle.axes.getYaw() - vehicle.prevRotationYaw);
	        for(; dYaw > 180F; dYaw -= 360F) {}
	        for(; dYaw <= -180F; dYaw += 360F) {}
	        float dPitch = (vehicle.axes.getPitch() - vehicle.prevRotationPitch);
	        for(; dPitch > 180F; dPitch -= 360F) {}
	        for(; dPitch <= -180F; dPitch += 360F) {}
	        float dRoll = (vehicle.axes.getRoll() - vehicle.prevRotationRoll);
	        for(; dRoll > 180F; dRoll -= 360F) {}
	        for(; dRoll <= -180F; dRoll += 360F) {}
	        GL11.glRotatef(180F - vehicle.prevRotationYaw - dYaw * f1, 0.0F, 1.0F, 0.0F);
	        GL11.glRotatef(vehicle.prevRotationPitch + dPitch * f1, 0.0F, 0.0F, 1.0F);
			GL11.glRotatef(vehicle.prevRotationRoll + dRoll * f1, 1.0F, 0.0F, 0.0F);
			GL11.glRotatef(180F, 0.0F, 1.0F, 0.0F);
			GL11.glPushMatrix();
			{
				ModelVehicle modVehicle = (ModelVehicle)type.model;
				
				GL11.glPushMatrix();
				{
					float recoilDPos = (float)Math.sin(Math.toRadians(vehicle.recoilPos)) - (float)Math.sin(Math.toRadians(vehicle.lastRecoilPos));
					float recoilPos = (float)Math.sin(Math.toRadians(vehicle.lastRecoilPos)) + recoilDPos*f1;
					
					//tank recoil
					
					
					
					 float tankerinoYaw = 0;
					 
					 
					 //for small "wheelie" during acceleration
					 if(vehicle.getVehicleType().marioKart && (vehicle.throttlePeepee > 0.01 || vehicle.throttlePeepee < -0.01f))
						 GL11.glRotatef(2 * vehicle.throttlePeepee * vehicle.getVehicleType().animationMultiplier, 0, 0, 1);
					 //reverse effect for stopping
					 if(vehicle.getVehicleType().marioKart && (vehicle.throttlePeepee > -0.01 && vehicle.throttlePeepee <= 0.01 && (vehicle.throttle > 0.005 || vehicle.throttle < -0.005f)))
						 GL11.glRotatef(-1.5f*vehicle.throttle * vehicle.getVehicleType().animationMultiplier, 0, 0, 1);
					 
					// drifting into turn effect
					 if(vehicle.throttle > 0)
					 GL11.glRotatef(0.5f * vehicle.throttle * vehicle.throttle * vehicle.wheelsYaw * vehicle.getVehicleType().driftMultiplier, 1, 0, 0);

					 
					 
						if(type.turretOrigin != null && vehicle.isPartIntact(EnumDriveablePart.turret) && vehicle.seats != null && vehicle.seats[0] != null  )
						{
					 
					tankerinoYaw = vehicle.seats[0].looking.getYaw();
					
					//apply the rotation effect
					if (vehicle.backwardsTimer > 0.05 && !vehicle.epicShip && !vehicle.getVehicleType().canDive)
					{	
					//	System.out.println("backwards timer:" + vehicle.backwardsTimer);
					//	System.out.println("recoil timer:" + vehicle.recoilTimer);
					//	System.out.println("recoil energy:" + vehicle.recoilEnergy);
					//	System.out.println("recoil height:" + vehicle.getDriveableType().primaryRecoilHeight);
						GL11.glTranslatef(0, -0.03f*vehicle.recoilEnergy, 0);
						 if ( (tankerinoYaw<23 && tankerinoYaw>=-22))
							 GL11.glRotatef(vehicle.recoilEnergy, 0, 0, 1);
						 else	if ( (tankerinoYaw<68 && tankerinoYaw>=23) )
							GL11.glRotatef(vehicle.recoilEnergy*0.7f, -1, 0, 1);
						else	if ( (tankerinoYaw<113 && tankerinoYaw>=68) )
							GL11.glRotatef(vehicle.recoilEnergy, -1, 0, 0);
						else	if ( (tankerinoYaw<158 && tankerinoYaw>=113) )
							GL11.glRotatef(vehicle.recoilEnergy*0.7f, -1, 0, -1);
						else	if ( (tankerinoYaw<203 && tankerinoYaw>=158) || (tankerinoYaw> -180 && tankerinoYaw< -158))
							GL11.glRotatef(vehicle.recoilEnergy, 0, 0, -1);
						else	if ( (tankerinoYaw<-113 && tankerinoYaw>=-158))
							GL11.glRotatef(vehicle.recoilEnergy*0.7f, 1, 0, -1);
						else	if ( (tankerinoYaw<-68 && tankerinoYaw>=-113))
							GL11.glRotatef(vehicle.recoilEnergy, 1, 0, 0);
						else	if ( (tankerinoYaw<-23 && tankerinoYaw>=-68))
							GL11.glRotatef(vehicle.recoilEnergy*0.7f, 1, 0, 1);
						
						else
						GL11.glRotatef(vehicle.recoilEnergy, 0, 0, 1);							
					}
					
						}
					
					
					
					
					
					
					//for losing all tracks/wheels y position drop
					
					//for losing all wheels	vertical drop		
					if (!vehicle.isPartIntact(EnumDriveablePart.frontRightWheel) && !vehicle.isPartIntact(EnumDriveablePart.frontLeftWheel) && !vehicle.isPartIntact(EnumDriveablePart.backRightWheel) && !vehicle.isPartIntact(EnumDriveablePart.backLeftWheel))
					GL11.glTranslatef(0, -0.5f, 0);
					
					//for losing all tracks vertical drop			
					if (!vehicle.isPartIntact(EnumDriveablePart.rightTrack) && !vehicle.isPartIntact(EnumDriveablePart.leftTrack) )
					GL11.glTranslatef(0, -0.5f, 0);
					
					
					//for losing front wheels			
					if (!vehicle.isPartIntact(EnumDriveablePart.frontRightWheel) && !vehicle.isPartIntact(EnumDriveablePart.frontLeftWheel))
						GL11.glRotatef(8f, 0, 0, -1);
					
					//for losing back wheels			
					if (!vehicle.isPartIntact(EnumDriveablePart.backRightWheel) && !vehicle.isPartIntact(EnumDriveablePart.backLeftWheel))
						GL11.glRotatef(8f, 0, 0, 1);
					
					//swapping sides of tracks in case retarded modelling
					float number = 1;
					if(type.shiftSides)
						number = -1;
					
					
					//for losing right track/wheels
				if (!vehicle.isPartIntact(EnumDriveablePart.rightTrack) || !vehicle.isPartIntact(EnumDriveablePart.frontRightWheel) && !vehicle.isPartIntact(EnumDriveablePart.backRightWheel))
					GL11.glRotatef(8f, 1*number, 0, 0);
				
				//left
				if (!vehicle.isPartIntact(EnumDriveablePart.leftTrack) || !vehicle.isPartIntact(EnumDriveablePart.frontLeftWheel) && !vehicle.isPartIntact(EnumDriveablePart.backLeftWheel))
					GL11.glRotatef(8f, -1*number, 0, 0);

					GL11.glScalef(type.modelScale, type.modelScale, type.modelScale);
					if(modVehicle != null)
						modVehicle.render(vehicle, f1);
					
						
			        for(int i = 0; i < vehicle.trackLinksLeft.length; i++)
			        {
			        	AnimTrackLink link = vehicle.trackLinksLeft[i];
			        	float rotZ = link.zRot;
			        	GL11.glPushMatrix();
			        	GL11.glTranslatef(link.position.x/16F, link.position.y/16F, link.position.z/16F);
						for(; rotZ > 180F; rotZ -= 360F) {}
						for(; rotZ <= -180F; rotZ += 360F) {}
			        	GL11.glRotatef(rotZ * (float)(180/Math.PI), 0, 0, 1);
						if(modVehicle != null)
							modVehicle.renderFancyTracks(vehicle, f1);
			        	GL11.glPopMatrix();
			        }
			        
			        for(int i = 0; i < vehicle.trackLinksRight.length; i++)
			        {
			        	AnimTrackLink link = vehicle.trackLinksRight[i];
			        	float rotZ = link.zRot;
						for(; rotZ > 180F; rotZ -= 360F) {}
						for(; rotZ <= -180F; rotZ += 360F) {}
			        	GL11.glPushMatrix();
			        	GL11.glTranslatef(link.position.x/16F, link.position.y/16F, link.position.z/16F);
			        	GL11.glRotatef(rotZ * (float)(180/Math.PI), 0, 0, 1);
						if(modVehicle != null)
							modVehicle.renderFancyTracks(vehicle, f1);
			        	GL11.glPopMatrix();
			        }
					
					if(type.turretOrigin != null && vehicle.isPartIntact(EnumDriveablePart.turret) && vehicle.seats != null && vehicle.seats[0] != null  )
					{
						dYaw = (vehicle.seats[0].looking.getYaw() - vehicle.seats[0].prevLooking.getYaw());
						float pitch = vehicle.seats[0].looking.getPitch();
				        for(; dYaw > 180F; dYaw -= 360F) {}
				        for(; dYaw <= -180F; dYaw += 360F) {}
			    		float yaw = vehicle.seats[0].prevLooking.getYaw() + dYaw * f1;
			    		
			    		//gui mode
			    		
			    		
			    		//rotate and render turret
			    		GL11.glTranslatef(type.turretOrigin.x, type.turretOrigin.y, type.turretOrigin.z);
						GL11.glRotatef(-yaw, 0.0F, 1.0F, 0.0F);
						GL11.glTranslatef(-type.turretOrigin.x, -type.turretOrigin.y, -type.turretOrigin.z);
						
						if(modVehicle != null)
							modVehicle.renderTurret(0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F, vehicle, f1);
			    		

						
						//rotate and render barrel
						if(modVehicle != null){
						GL11.glTranslatef(modVehicle.barrelAttach.x,modVehicle.barrelAttach.y, -modVehicle.barrelAttach.z);
						float bPitch = (vehicle.seats[0].looking.getPitch() - vehicle.seats[0].prevLooking.getPitch());
			    		float aPitch = vehicle.seats[0].prevLooking.getPitch() + bPitch * f1;

						GL11.glRotatef(-aPitch, 0F, 0F, 1F);
						//anime barrel code location allah bookmark - xddd i recoded it to only work during repair for masturbation healing
						if(vehicle.ticksRepairing>1)
						GL11.glTranslatef(recoilPos*-(5F/16F),0F, 0F);
						
						
						//actually i just redid the animation using MY exponential decay recoil formula
							GL11.glTranslatef(vehicle.recoilEnergy*-(9F/16F),0F, 0F);
						modVehicle.renderAnimBarrel(0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F, vehicle, f1);
						}

						
					}
				}
				GL11.glPopMatrix();
				
				
				if( (vehicle.getDriveableType().walterGunRange || vehicle.getDriveableType().walterMortar) && Minecraft.getMinecraft() != null) //start of shell render
				{	
					GL11.glPushMatrix();
					Minecraft mc = Minecraft.getMinecraft(); //prepare for mother of all ivermectin
					if(mc.thePlayer != null && mc.thePlayer.ridingEntity != null && mc.thePlayer.ridingEntity instanceof EntitySeat && vehicle.seats[0] != null
							&& vehicle.seats[0].riddenByEntity!= null && vehicle.seats[0].riddenByEntity instanceof EntityPlayer && ((EntityPlayer)vehicle.seats[0].riddenByEntity).getDisplayName() == mc.thePlayer.getDisplayName())
					{
					float pitch = -vehicle.seats[0].looking.getPitch();
					float WalterRange = -0.3228f * (pitch*pitch) + 29.3893f * (pitch) - 76.1646f;
					if(vehicle.getDriveableType().walterMortar) //mortar formula
						WalterRange = -0.1035f * (pitch*pitch) + 8.6336f * (pitch) + 53.001f;
		        if(TeamsManager.shellsEnabled) 
				{
					int slot = -1;
					for(int i = vehicle.getDriveableData().getMissileInventoryStart(); i < vehicle.getDriveableData().getMissileInventoryStart() + type.numMissileSlots; i++)
					{
						ItemStack shell = vehicle.getDriveableData().getStackInSlot(i);
						if(shell != null && shell.getItem() instanceof ItemBullet )
						{
							slot = i;
						}
					}
					
					if(slot != -1)
					{					
					ItemStack bulletStack = vehicle.driveableData.getStackInSlot(slot);
					ItemBullet item = (ItemBullet)bulletStack.getItem();
							
				 if(item instanceof ItemBullet && ((ItemBullet)item).type.model != null && (vehicle.getDriveableType().walterGunRange || vehicle.getDriveableType().walterMortar))
				{
					BulletType gunType = ((ItemBullet)item).type;
					ModelBase modelo = item.type.model;
					//ModelBase modelo2 = item.type.model;

					TextureManager texturemanager = Minecraft.getMinecraft().getTextureManager();
				

						texturemanager.bindTexture(FlansModResourceHandler.getTexture(gunType));
					ItemRenderType typerino = ItemRenderType.ENTITY;
					
					if(vehicle.seats[0] != null)
					{
					float yaw = vehicle.seats[0].prevLooking.getYaw() + dYaw * f1;
					GL11.glRotatef(-yaw, 0.0F, 1.0F, 0.0F);
					}

					GL11.glRotatef(90F, 1F, 0F, 0F);
					//GL11.glRotatef(0F, 0F, 0F, 1F);
					GL11.glTranslatef(WalterRange,  0, 0);
					GL11.glRotatef(-90F, -90F, 1F, 0F);
					GL11.glTranslatef(0F, 0F, 0F);
					// (a b c) positive a is towards pilot's left, positive b is forwards in front of plane, positive c is y down	
					GL11.glScalef(3F, 3F, 3F);
					modelo.render(null, 0F, 0F, 0F, 0F, 0F, 1F / 16F);	
					GL11.glTranslatef(0, -3, 0);
					GL11.glScalef(2F, 2F, 2F);
					modelo.render(null, 0F, 0F, 0F, 0F, 0F, 1F / 16F);
					GL11.glTranslatef(0, -3, 0);
					GL11.glScalef(2F, 2F, 2F);
					modelo.render(null, 0F, 0F, 0F, 0F, 0F, 1F / 16F);
					GL11.glTranslatef(0, -3, 0);
					GL11.glScalef(2F, 2F, 2F);
					modelo.render(null, 0F, 0F, 0F, 0F, 0F, 1F / 16F);
					GL11.glTranslatef(0, -3, 0);
					GL11.glScalef(2F, 2F, 2F);
					modelo.render(null, 0F, 0F, 0F, 0F, 0F, 1F / 16F);
					GL11.glTranslatef(0, -3, 0);
					GL11.glScalef(2F, 2F, 2F);
					modelo.render(null, 0F, 0F, 0F, 0F, 0F, 1F / 16F);

				}	 
					}
				}
					}
					GL11.glPopMatrix();
				} //end of shell render
				

				GL11.glPushMatrix();
				if(FlansMod.DEBUG)
				{				
					if(type.turretOrigin != null && vehicle.isPartIntact(EnumDriveablePart.turret) && vehicle.seats != null && vehicle.seats[0] != null )
					{
						dYaw = (vehicle.seats[0].looking.getYaw() - vehicle.seats[0].prevLooking.getYaw());
				        for(; dYaw > 180F; dYaw -= 360F) {}
				        for(; dYaw <= -180F; dYaw += 360F) {}
			    		float yaw = vehicle.seats[0].prevLooking.getYaw() + dYaw * f1;
			    		
			    		GL11.glTranslatef(type.turretOrigin.x, type.turretOrigin.y, type.turretOrigin.z);
						GL11.glRotatef(-yaw, 0.0F, 1.0F, 0.0F);
//						GL11.glTranslatef(-type.turretOrigin.x, -type.turretOrigin.y, -type.turretOrigin.z);
//			    		GL11.glTranslatef(type.turretOrigin.x, type.turretOrigin.y, type.turretOrigin.z);
						GL11.glRotatef(-vehicle.seats[0].looking.getPitch(), 0.0F, 0.0F, 1.0F);
						GL11.glTranslatef(-type.turretOrigin.x, -type.turretOrigin.y, -type.turretOrigin.z);
						
						//Render shoot points
						GL11.glColor4f(0F, 0F, 1F, 0.3F);
						for(ShootPoint point : type.shootPointsPrimary)			
							if(point.rootPos.part == EnumDriveablePart.turret)
								renderAABB(AxisAlignedBB.getBoundingBox(point.rootPos.position.x - 0.25F, point.rootPos.position.y - 0.25F, point.rootPos.position.z - 0.25F, point.rootPos.position.x + 0.25F, point.rootPos.position.y + 0.25F, point.rootPos.position.z + 0.25F));

						GL11.glColor4f(0F, 1F, 0F, 0.3F);
						for(ShootPoint point : type.shootPointsSecondary)	
							if(point.rootPos.part == EnumDriveablePart.turret)
								renderAABB(AxisAlignedBB.getBoundingBox(point.rootPos.position.x - 0.25F, point.rootPos.position.y - 0.25F, point.rootPos.position.z - 0.25F, point.rootPos.position.x + 0.25F, point.rootPos.position.y + 0.25F, point.rootPos.position.z + 0.25F));
					}
				}
				GL11.glPopMatrix();
				if(modVehicle != null)
				{
					GL11.glPushMatrix();
					
					GL11.glTranslatef(modVehicle.drillHeadOrigin.x, modVehicle.drillHeadOrigin.y, modVehicle.drillHeadOrigin.z);
					GL11.glRotatef(vehicle.harvesterAngle * 50F, 1.0F, 0.0F, 0.0F);
					GL11.glTranslatef(-modVehicle.drillHeadOrigin.x, -modVehicle.drillHeadOrigin.y, -modVehicle.drillHeadOrigin.z);
					modVehicle.renderDrillBit(vehicle, f1);
					
					GL11.glPopMatrix();
				}
				
				if(modVehicle != null)
				{
					Vector3f newRot = Interpolate(vehicle.doorRot, vehicle.prevDoorRot, f1);
					Vector3f newPos = Interpolate(vehicle.doorPos, vehicle.prevDoorPos, f1);
					
					GL11.glPushMatrix();
					GL11.glTranslatef(modVehicle.doorAttach.x + newPos.x/16, modVehicle.doorAttach.y + newPos.y/16, -modVehicle.doorAttach.z + newPos.z/16);
					GL11.glRotatef(newRot.x, 1F, 0F, 0F);
					GL11.glRotatef(-newRot.y, 0F, 1F, 0F);
					GL11.glRotatef(newRot.z, 0F, 0F, 1F);
					modVehicle.renderDoor(vehicle, 0.0625F);
					GL11.glPopMatrix();
					
					Vector3f newRot2 = Interpolate(vehicle.door2Rot, vehicle.prevDoor2Rot, f1);
					Vector3f newPos2 = Interpolate(vehicle.door2Pos, vehicle.prevDoor2Pos, f1);
					
					GL11.glPushMatrix();
					GL11.glTranslatef(modVehicle.door2Attach.x + newPos2.x/16, modVehicle.door2Attach.y + newPos2.y/16, -modVehicle.door2Attach.z + newPos2.z/16);
					GL11.glRotatef(newRot2.x, 1F, 0F, 0F);
					GL11.glRotatef(-newRot2.y, 0F, 1F, 0F);
					GL11.glRotatef(newRot2.z, 0F, 0F, 1F);
					modVehicle.renderDoor2(vehicle, 0.0625F);
					GL11.glPopMatrix();
				}
			}
			GL11.glPopMatrix();
			
			//also enabled debug hotboxes if thermal mode
			//if(FlansMod.DEBUG || vehicle.seats[0].riddenByEntity!=Minecraft.getMinecraft().thePlayer && Minecraft.getMinecraft().entityRenderer.isShaderActive()  )
			//if(FlansMod.DEBUG)
			{
				GL11.glDisable(GL11.GL_TEXTURE_2D);
				GL11.glEnable(GL11.GL_BLEND);
				GL11.glDisable(GL11.GL_DEPTH_TEST);
				GL11.glColor4f(1F, 0F, 0F, 0.3F);
				GL11.glScalef(1F, 1F, 1F);
				
				//artillery aid
				if( (vehicle.getDriveableType().walterGunRange || vehicle.getDriveableType().walterMortar) && Minecraft.getMinecraft() != null)
				{						
					
					Minecraft mc = Minecraft.getMinecraft(); //prepare for mother of all ivermectin
					if(mc.thePlayer != null && mc.thePlayer.ridingEntity != null && mc.thePlayer.ridingEntity instanceof EntitySeat && vehicle.seats[0] != null
							&& vehicle.seats[0].riddenByEntity!= null && vehicle.seats[0].riddenByEntity instanceof EntityPlayer && ((EntityPlayer)vehicle.seats[0].riddenByEntity).getDisplayName() == mc.thePlayer.getDisplayName())
					{
						GL11.glColor4f(0F, 2F, 2F, 0.3F);
					float pitch = -vehicle.seats[0].looking.getPitch();
					float WalterRange = -0.3228f * (pitch*pitch) + 29.3893f * (pitch) - 76.1646f;
					if(vehicle.getDriveableType().walterMortar) //mortar formula
						WalterRange = -0.1035f * (pitch*pitch) + 8.6336f * (pitch) + 53.001f;
					
					if(vehicle.seats[0] != null)
					{
					float yaw = vehicle.seats[0].prevLooking.getYaw() + dYaw * f1;
					GL11.glRotatef(-yaw, 0.0F, 1.0F, 0.0F);
					}
					if(WalterRange < 0)
						WalterRange = 0;
					renderAABB(AxisAlignedBB.getBoundingBox(-1 + WalterRange, 0, -1, 1 + WalterRange, 1, 1));
					renderAABB(AxisAlignedBB.getBoundingBox(-2 + WalterRange, 1, -2, 2 + WalterRange, 2, 2));
					renderAABB(AxisAlignedBB.getBoundingBox(-2.5f + WalterRange, 2, -2.5f, 2.5f + WalterRange, 3, 2.5f));
					renderAABB(AxisAlignedBB.getBoundingBox(-3 + WalterRange, 3, -3, 3 + WalterRange, 4, 3));
					renderAABB(AxisAlignedBB.getBoundingBox(-3.5f + WalterRange, 4, -3.5f, 3.5f + WalterRange, 5, 3.5f));
					renderAABB(AxisAlignedBB.getBoundingBox(-0.5f + WalterRange, 5, -0.5f, 0.5f + WalterRange, 450, 0.5f));
					}
				} //end of arrow render
				
				
				for(DriveablePart part : vehicle.getDriveableData().parts.values())
				{
					if(part.box == null)
						continue;
					
					float flux = 0.1f;	//for pulsating shield
					if(flux > 0.1f || flux < -0.1f)
						flux = 0.1f;
						else
					flux = (float) Math.sin((float)vehicle.ticksExisted/10f);
					
					
					
					float red = 0.5f;
					//if shield hit do a red flash animation
					if(vehicle.shieldHitTimer > 0 || (part.health <= 0 && part.maxHealth > 0 && part.type == EnumDriveablePart.shield))
					{
						red = (float)vehicle.shieldHitTimer/2;
						flux = (float)vehicle.shieldHitTimer/2;
					}
					else red = 0.5f;
					
					//System.out.println("flux" + vehicle.ticksExisted);
					
					//energy shield
					 if(part.type == EnumDriveablePart.shield && !FlansMod.DEBUG)
						GL11.glColor4f(red, (red/5 + 0.4f), 5F*red, (float) Math.abs(flux * 0.5f));
					
					if(FlansMod.DEBUG)
					{
					
					
					//weakspots red
					if(part.type == EnumDriveablePart.weakSpot || part.type == EnumDriveablePart.weakSpot2 || part.type == EnumDriveablePart.weakSpot3 || part.type == EnumDriveablePart.turretWeak || part.type == EnumDriveablePart.turretWeak2)
					GL11.glColor4f(3F, 0F, 0F, 0.5F);
					
					//mobility parts blue
					else 	if(part.type == EnumDriveablePart.engine || part.type == EnumDriveablePart.leftTrack || part.type == EnumDriveablePart.rightTrack || part.type == EnumDriveablePart.frontLeftWheel || part.type == EnumDriveablePart.frontRightWheel || part.type == EnumDriveablePart.backLeftWheel || part.type == EnumDriveablePart.backRightWheel)	
					GL11.glColor4f(0F, 0F, 2F, 0.3F);
					
					//structural parts green
					else if(part.type == EnumDriveablePart.core || part.type == EnumDriveablePart.citadel || part.type == EnumDriveablePart.midsection || part.type == EnumDriveablePart.bow || part.type == EnumDriveablePart.stern || part.type == EnumDriveablePart.left || part.type == EnumDriveablePart.right || part.type == EnumDriveablePart.superstructure || part.type == EnumDriveablePart.turret)
						GL11.glColor4f(0F, 2F, 2F, 0.3F);
					
					
					else if(part.type == EnumDriveablePart.shield )  //shield invisible in debug mode
							GL11.glColor4f(0F, 0F, 0F, 0F);
					

					
					//everything else yellow
					else
						GL11.glColor4f(1.5F, 1.5F, 0F, 0.2F);
					
					}
					else if(part.type != EnumDriveablePart.shield)
						GL11.glColor4f(0F, 0F, 0F, 0F); //invisible everything else
					
					//part that renders debug red hitboxerinos allah bookmark
					renderAABB(AxisAlignedBB.getBoundingBox(part.box.x, part.box.y, part.box.z, (part.box.x + part.box.w), (part.box.y + part.box.h), (part.box.z + part.box.d)));
				}
				
				//GL11.glColor4f(0F, 1F, 0F, 0.3F);
				//if(type.barrelPosition != null)
				//	renderAABB(AxisAlignedBB.getBoundingBox(type.barrelPosition.x - 0.25F, type.barrelPosition.y - 0.25F, type.barrelPosition.z - 0.25F, type.barrelPosition.x + 0.25F, type.barrelPosition.y + 0.25F, type.barrelPosition.z + 0.25F));
				
				
				if(FlansMod.DEBUG)
				{
				//Render shoot points
				GL11.glColor4f(0F, 0F, 1F, 0.3F);
				for(ShootPoint point : type.shootPointsPrimary)
					if(point.rootPos.part != EnumDriveablePart.turret)
						renderAABB(AxisAlignedBB.getBoundingBox(point.rootPos.position.x - 0.25F, point.rootPos.position.y - 0.25F, point.rootPos.position.z - 0.25F, point.rootPos.position.x + 0.25F, point.rootPos.position.y + 0.25F, point.rootPos.position.z + 0.25F));
				
				GL11.glColor4f(0F, 1F, 0F, 0.3F);
				for(ShootPoint point : type.shootPointsSecondary)	
					if(point.rootPos.part != EnumDriveablePart.turret)
						renderAABB(AxisAlignedBB.getBoundingBox(point.rootPos.position.x - 0.25F, point.rootPos.position.y - 0.25F, point.rootPos.position.z - 0.25F, point.rootPos.position.x + 0.25F, point.rootPos.position.y + 0.25F, point.rootPos.position.z + 0.25F));
				}
				
				
				GL11.glEnable(GL11.GL_TEXTURE_2D);
				GL11.glEnable(GL11.GL_DEPTH_TEST);
				GL11.glDisable(GL11.GL_BLEND);
				GL11.glColor4f(1F, 1F, 1F, 1F);
			}
			
			
			
			
			
			//end of energy shield stuff
        }
        GL11.glPopMatrix();
    }

    @Override
	public void doRender(Entity entity, double d, double d1, double d2, float f, float f1)
    {
        render((EntityVehicle)entity, d, d1, d2, f, f1);
    }
    
	@Override
	protected ResourceLocation getEntityTexture(Entity entity) 
	{
		DriveableType type = ((EntityDriveable)entity).getDriveableType();
		Paintjob paintjob = type.getPaintjob(((EntityDriveable)entity).getDriveableData().paintjobID);
		return FlansModResourceHandler.getPaintjobTexture(paintjob);
	}
	
	@Override
	public boolean handleRenderType(ItemStack item, ItemRenderType type) 
	{
		switch(type)
		{
		case EQUIPPED : case EQUIPPED_FIRST_PERSON : case ENTITY : return Minecraft.getMinecraft().gameSettings.fancyGraphics && item != null && item.getItem() instanceof ItemVehicle && ((ItemVehicle)item.getItem()).type.model != null;
		default : break;
		}
		return false;
	}

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) 
	{
		return false;
	}

	@Override
	public void renderItem(ItemRenderType type, ItemStack item, Object... data) 
	{
		GL11.glPushMatrix();
		if(item != null && item.getItem() instanceof ItemVehicle)
		{
			VehicleType vehicleType = ((ItemVehicle)item.getItem()).type;
			if(vehicleType.model != null)
			{
				float scale = 0.5F;
				switch(type)
				{
				case ENTITY:
				{
					scale = 1.5F;
					GL11.glRotatef(((EntityItem)data[1]).ticksExisted, 0F, 1F, 0F);
					break;
				}
				case EQUIPPED:
				{
					GL11.glRotatef(15F, 0F, 0F, 1F);
					GL11.glRotatef(15F, 1F, 0F, 0F);
					GL11.glRotatef(270F, 0F, 1F, 0F);
					GL11.glTranslatef(0F, 0.15F, -0.4F);
					scale = 1F;
					break;
				}
				case EQUIPPED_FIRST_PERSON:
				{
					GL11.glRotatef(25F, 0F, 0F, 1F); 
					GL11.glRotatef(-5F, 0F, 1F, 0F);
					GL11.glTranslatef(0.15F, 0.45F, -0.6F);
					break;
				}
				default : break;
				}
				
				GL11.glScalef(scale / vehicleType.cameraDistance, scale / vehicleType.cameraDistance, scale / vehicleType.cameraDistance);
				Minecraft.getMinecraft().renderEngine.bindTexture(FlansModResourceHandler.getTexture(vehicleType));
				ModelDriveable model = vehicleType.model;
				model.render(vehicleType);
			}
		}
		GL11.glPopMatrix();
	}
	
	public Vector3f Interpolate(Vector3f current, Vector3f prev, float f1)
	{
		Vector3f result;
		result = new Vector3f(prev.x + (current.x-prev.x)*f1,prev.y + (current.y-prev.y)*f1, prev.z + (current.z-prev.z)*f1);
		return result;
	}
}

