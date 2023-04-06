package com.flansmod.client;

import java.util.List;

import com.flansmod.common.FlansMod;
import com.flansmod.common.driveables.EntityDriveable;
import com.flansmod.common.driveables.EntitySeat;
import com.flansmod.common.driveables.EntityVehicle;
import com.flansmod.common.guns.EntityBullet;
import com.flansmod.common.vector.Vector3f;
//import com.hfr.render.hud.RenderRadarScreen.Blip;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class EntityCamera extends EntityLivingBase 
{
	public EntityDriveable driveable;

	//for hypnotizing f5 mode for tv guided
	public int pupperino = 0;



	public EntityCamera(World world) 
	{
		super(world);
		setSize(0F, 0F);
	}

	public EntityCamera(World world, EntityDriveable d) 
	{
		this(world);
		driveable = d;
		setPosition(d.posX, d.posY, d.posZ);
	}

	@Override
	public void onUpdate()
	{

		//tv guided forcing people into f5
		if (pupperino > 0 )
		{
			pupperino--;
		}

		if(pupperino == 1 && FlansModClient.minecraft.gameSettings.thirdPersonView == 1)
		{


			FlansModClient.minecraft.gameSettings.thirdPersonView = 0;
		}




		//cancerous attempt at missile shit
		List<Entity> foxes = driveable.worldObj.getEntitiesWithinAABBExcludingEntity(driveable, AxisAlignedBB.getBoundingBox(driveable.posX - 200, driveable.posY - 500, driveable.posZ - 200, driveable.posX + 200, driveable.posY + 500, driveable.posZ + 200));

		for (Entity stuff : foxes) {
			//	System.out.println("pee pee");

			//excluding non bullets
			if (stuff instanceof EntityBullet == false)
				continue;	

			EntityBullet missile = (EntityBullet)stuff;

			// ignore all non tracking bullets unless advanced fire control artillery mode or star shell
			if (driveable != null && missile.type != null && !missile.type.TVguided && !missile.type.starShell && !driveable.artilleryMode)
				continue;

			//great wall of null checkers improved version so passengers can tv guide
			for(int i = 0; i < driveable.getDriveableType().numPassengers + 1; i++)
			{

				//for tv guided
				if(driveable.seats[i] != null )
				{
					if(missile.owner != null)
					{	
						if(driveable.seats[i].riddenByEntity != null)					
							if(missile.owner == driveable.seats[i].riddenByEntity && (missile.type.TVguided || driveable.artilleryMode))
							{
								//if artillery vision mode, do not work for bullets. missile/shell/bomb only
								if(missile.type.weaponType.equals(missile.type.weaponType.MISSILE) || missile.type.weaponType.equals(missile.type.weaponType.SHELL) || missile.type.weaponType.equals(missile.type.weaponType.BOMB))
									//this.mountEntity(missile);
									setPosition(missile.posX, missile.posY, missile.posZ);

								//	entiycamera.previousRotationYaw = missile.previousRotationYaw;
								this.rotationYaw = missile.rotationYaw;
								//	entiycamera.previousRotationPitch = missile.previousRotationPitch;
								this.rotationPitch = missile.rotationPitch;


								//only mount the missile and follow it into the void if its a tv missile. otherwise it would interfere with artillery toggle view
								if(missile.type.TVguided)
								{

									if(missile.owner != null)
									{
										//linking with missile owner to prevent gospel of third person
										if(pupperino<40 && FlansModClient.minecraft.thePlayer == missile.owner)
											pupperino += 2;
									}


									this.mountEntity(missile);
									if (FlansModClient.minecraft.gameSettings.thirdPersonView == 0 && FlansModClient.minecraft.thePlayer == missile.owner)
									{

										FlansModClient.minecraft.gameSettings.thirdPersonView = 1;

									}

								}


							}
					}
				}

			}
		}

		//System.out.println("foxes empty?" + foxes.toString());



		if(foxes != null)
		{
			//super.onUpdate();

			prevPosX = posX;
			prevPosY = posY;
			prevPosZ = posZ;

			Vector3f cameraPosition = new Vector3f();//-1F, 0.5F, 0F);
			//cameraPosition.scale(driveable.getDriveableType().cameraDistance);
			cameraPosition = driveable.axes.findLocalVectorGlobally(cameraPosition);

			//Lerp it
			double dX = driveable.posX + cameraPosition.x - posX;
			double dY = driveable.posY + cameraPosition.y - posY;
			double dZ = driveable.posZ + cameraPosition.z - posZ;

			float lerpAmount = 0.1F;

			setPosition(posX + dX * lerpAmount, posY + dY * lerpAmount, posZ + dZ * lerpAmount);

			if(FlansMod.proxy.mouseControlEnabled() && !(driveable instanceof EntityVehicle))
			{
				rotationYaw = driveable.axes.getYaw() - 90F;
				rotationPitch = driveable.axes.getPitch();
			}
			else
			{
				Entity player = FlansMod.proxy.getThePlayer();
				if(player != null)
				{
					rotationYaw		= player.rotationYaw;
					rotationPitch	= player.rotationPitch;
				}
			}

			for(; rotationYaw - prevRotationYaw >= 180F; rotationYaw -= 360F) ;
			for(; rotationYaw - prevRotationYaw < -180F; rotationYaw += 360F) ;

		}


	}

	@Override
	public ItemStack getHeldItem() 
	{
		return null;
	}

	@Override
	public ItemStack getEquipmentInSlot(int p_71124_1_) 
	{
		return null;
	}

	@Override
	public void setCurrentItemOrArmor(int p_70062_1_, ItemStack p_70062_2_) 
	{

	}

	@Override
	public ItemStack[] getLastActiveItems() 
	{
		return null;
	}

}
