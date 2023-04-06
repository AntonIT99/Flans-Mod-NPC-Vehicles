package com.flansmod.common.driveables;

import io.netty.buffer.ByteBuf;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EntityBodyHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBase;
import net.minecraft.item.ItemLead;
import net.minecraft.item.ItemSign;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import net.minecraftforge.client.event.RenderGameOverlayEvent.Pre;

import com.flansmod.api.IControllable;
import com.flansmod.client.FlansModClient;
import com.flansmod.common.FlansMod;
import com.flansmod.common.PlayerData;
import com.flansmod.common.PlayerHandler;
import com.flansmod.common.RotatedAxes;
import com.flansmod.common.guns.EnumFireMode;
import com.flansmod.common.guns.GunType;
import com.flansmod.common.guns.ItemGun;
import com.flansmod.common.guns.ItemShootable;
import com.flansmod.common.guns.ShootableType;
import com.flansmod.common.network.PacketDriveableKey;
import com.flansmod.common.network.PacketDriveableKeyHeld;
import com.flansmod.common.network.PacketParticle;
import com.flansmod.common.network.PacketPlaySound;
import com.flansmod.common.network.PacketSeatCheck;
import com.flansmod.common.network.PacketSeatUpdates;
import com.flansmod.common.teams.TeamsManager;
import com.flansmod.common.tools.ItemTool;
import com.flansmod.common.vector.Vector3f;
import com.hbm.blocks.ILookOverlay;
import com.hbm.util.I18nUtil;
import com.hfr.faction.Factions;
import com.hfr.faction.IFaction.PermLevel;
import com.hfr.faction.relations.FactionRelations;
import com.hfr.faction.relations.FactionRelations.Relation;
import com.hfr.main.EventHandlerClient;

import akka.japi.Pair;

import com.flansmod.common.PlayerData;

import cpw.mods.fml.common.registry.IEntityAdditionalSpawnData;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class EntitySeat extends Entity implements IControllable, IEntityAdditionalSpawnData{  //weeder note, this used to be    IEntityAdditionalSpawnData, ILookOverlay{  but i dont know wtf cpw is
	/** Set this to true when the client has found the parent driveable and connected them */

	//important allah bookmark: according to gold sloth github making this not clientside might help fix crashes?  If it doesnt help undo it
	@SideOnly(Side.CLIENT)
	public boolean foundDriveable;
	private int driveableID;
	private int seatID;
	public EntityDriveable driveable;

	@SideOnly(Side.CLIENT)
	public float playerRoll, prevPlayerRoll;

	public Seat seatInfo;
	public boolean driver;

	/** A set of axes used to calculate where the seat is looking, x axis is the direction of looking, y is up */
	public RotatedAxes looking;
	/** For smooth renderering */
	public RotatedAxes prevLooking;
	/** A set of axes used to calculate where the player is looking, x axis is the direction of looking, y is up */
	public RotatedAxes playerLooking;
	/** For smooth renderering */
	public RotatedAxes prevPlayerLooking;
	/** Delay ticker for shooting guns */
	public int gunDelay;
	public int nintendoSwitch = 10;
	public int exitTimer = 20;
	/** Minigun speed */
	public float minigunSpeed;
	/** Minigun angle for render */
	public float minigunAngle;

	/** Sound delay ticker for looping sounds */
	public int soundDelay;
	public int yawSoundDelay = 0;
	public int pitchSoundDelay = 0;

	/** Traverse sound states */
	public boolean playYawSound = false;
	public boolean playPitchSound = false;


	private double playerPosX, playerPosY, playerPosZ;
	private float playerYaw, playerPitch;
	/** For smoothness */
	private double prevPlayerPosX, prevPlayerPosY, prevPlayerPosZ;
	private float prevPlayerYaw, prevPlayerPitch;
	private boolean shooting;

	public Entity lastRiddenByEntity;

	public EntityPlayer Seatbelt = null;

	public int SeatBeltMemory = 0;

	public int timeLimitDriveableNull = 0;
	public boolean calculator = false;
	public boolean walterCalculator = false;
	public boolean walterMortar = false;
	public float targetYaw = 0;
	//restore feature i broke xdd
	public float targetPitch = 0;

	/** Default constructor for spawning client side
	 * Should not be called server side EVER */


	public EntitySeat(World world)
	{
		super(world);
		setSize(1F, 1F);
		prevLooking = new RotatedAxes();
		looking = new RotatedAxes();
		playerLooking = new RotatedAxes();
		prevPlayerLooking = new RotatedAxes();
		lastRiddenByEntity = null;
	}

	/** Server side seat constructor */
	public EntitySeat(World world, EntityDriveable d, int id)
	{
		this(world);
		driveable = d;
		driveableID = d.getEntityId();
		seatInfo = driveable.getDriveableType().seats[id];
		driver = id == 0;
		setPosition(d.posX, d.posY, d.posZ);
		playerPosX = prevPlayerPosX = posX;
		playerPosY = prevPlayerPosY = posY;
		playerPosZ = prevPlayerPosZ = posZ;
		looking.setAngles((seatInfo.minYaw + seatInfo.maxYaw) / 2, 0F, 0F);
		playerLooking.setAngles((seatInfo.minYaw + seatInfo.maxYaw) / 2, 0F, 0F);
		//updatePosition();
		if(driveable.getDriveableType().gunRange)
			calculator=true;

		if(driveable.getDriveableType().walterGunRange)
			walterCalculator=true;

		if(driveable.getDriveableType().walterMortar)
			walterMortar=true;


	}






	@Override
	public void setPositionAndRotation2(double x, double y, double z, float yaw, float pitch, int i)
	{
		//setPosition(x, y, z);
	}

	@Override
	public void onUpdate()
	{
		super.onUpdate();
		//prevPosX = posX;
		//prevPosY = posY;
		//prevPosZ = posZ;


		if(driver && riddenByEntity==null && driveable != null && driveable.type != null && !driveable.type.evilGolem)
		{
			prevLooking = looking.clone();
			prevPlayerLooking = playerLooking.clone();
		}

		//so its easier to right click mount planes   attempt 2
		if(seatInfo != null &&  (seatInfo.helipad || seatInfo.carrier || seatInfo.hardpoint) && this.riddenByEntity == null)
			setSize(5F, 5F);
		else if (seatInfo != null &&  (seatInfo.helipad || seatInfo.carrier || seatInfo.hardpoint) && this.riddenByEntity != null)
			setSize(0.1F, 0.1F); 	//so you dont accidentally punch seat when a plane is in it




		//If on the client and the driveable parent has yet to be found, search for it
		if(worldObj.isRemote && !foundDriveable)
		{
			if (worldObj.getEntityByID(driveableID) instanceof EntityDriveable) //prevents casting chickens as entity driveables
				driveable = (EntityDriveable)worldObj.getEntityByID(driveableID);
			if(driveable == null)
				return;
			foundDriveable = true;
			//System.out.println("driveable found: " + driveable);
			driveable.seats[seatID] = this;
			seatInfo = driveable.getDriveableType().seats[seatID];
			looking.setAngles((seatInfo.minYaw + seatInfo.maxYaw) / 2, 0F, 0F);
			playerLooking.setAngles((seatInfo.minYaw + seatInfo.maxYaw) / 2, 0F, 0F);
			prevLooking = looking.clone();
			playerPosX = prevPlayerPosX = posX = driveable.posX;
			playerPosY = prevPlayerPosY = posY = driveable.posY;
			playerPosZ = prevPlayerPosZ = posZ = driveable.posZ;
			setPosition(posX, posY, posZ);
		}

		if(driveable == null)
			return;

		EntityDriveable entD;
		if (worldObj.getEntityByID(driveableID) instanceof EntityDriveable) //prevents casting chickens as entity driveables
		{
			entD = (EntityDriveable)worldObj.getEntityByID(driveableID);
		}
		else entD = null;
		if(entD == null){
			this.timeLimitDriveableNull++;
		}else{
			this.timeLimitDriveableNull = 0;
		}

		if(timeLimitDriveableNull > 60*20){
			this.setDead();
		}

		//Update gun delay ticker
		if(gunDelay > 0)
			gunDelay--;
		//Update sound delay ticker
		if(soundDelay > 0)
			soundDelay--;

		if(yawSoundDelay > 0)
			yawSoundDelay--;
		if(pitchSoundDelay > 0)
			pitchSoundDelay--;

		//Update seat switchy ticker labjac
		if(nintendoSwitch > 0)
			nintendoSwitch--;

		//fix the camera mode off carryover from other vehicles
		if(worldObj.isRemote && this.riddenByEntity != null && this.riddenByEntity instanceof EntityPlayer && this.driveable != null && (this.seatID > 0 || (this.seatID == 0 && !driveable.getDriveableType().walterMortar && !driveable.getDriveableType().walterGunRange && driveable instanceof EntityVehicle) ) && !FlansModClient.controlModeMouse)
		{
			FlansMod.proxy.changeControlMode((EntityPlayer) this.riddenByEntity);
			//System.out.println("auto fixing camera control mode");
		}


		//exit timer
		if (this.exitTimer<20)
			this.exitTimer++;


		if (this.exitTimer<0 || ( driveable.gtfo && this.riddenByEntity!=null && !driver) )
		{
			if(this.riddenByEntity != null && this.riddenByEntity instanceof EntityPlane)  //protection from kamikaze vessel instantly killing its own master
				if(driveable != null && driveable instanceof EntityPlane)
				{
					EntityPlane Mothership = (EntityPlane)driveable;
					Mothership.accidentDelay = 100; //5 second patience window of safety for mothership
					//System.out.println("mothership protected!");
				}

			//seats[0].riddenByEntity.setInvisible(false);
			riddenByEntity.mountEntity(null);
			exitTimer = 20;
		}



		//seatbelt bullshit TM
		if(!worldObj.isRemote)
		{


			if (riddenByEntity != null && riddenByEntity instanceof EntityPlayer)
			{

				EntityPlayerMP mp = (EntityPlayerMP)((EntityPlayer)riddenByEntity);

				if(this.Seatbelt != mp)
				{
					this.Seatbelt = (EntityPlayer)riddenByEntity;
					this.SeatBeltMemory = 1200;
					//	System.out.println("memorized master: " + Seatbelt.getDisplayName());
				}


			}
			else
				if(Seatbelt != null && this.SeatBeltMemory > 0)
				{
					//System.out.println("current master: " + Seatbelt.getDisplayName() + " will remember for " + this.SeatBeltMemory + " more ticks");
					//System.out.println("masters coordinates: " + Seatbelt.serverPosX + Seatbelt.serverPosY + Seatbelt.serverPosZ );
					//MinecraftServer.serv
					this.SeatBeltMemory --;
				}

			int testerino = 0;

			/*
        for (Object entry : this.worldObj.playerEntities)
    	{
        	EntityPlayer player = (EntityPlayer)entry;

    		if	(player == this.Seatbelt)
    			testerino = 1;

    	}

        if (testerino == 0)
        {
        	System.out.println("no valid players in this seat");
        }
			 */

			if(this.worldObj.playerEntities.contains(this.Seatbelt))
			{
				// System.out.println("seatbelted dude is valid!");
			}
			else if(this.Seatbelt != null)
			{
				this.mountEntity(null);
				// System.out.println("master has logged out?");
			}


			// if(Seatbelt != null && Seatbelt.serverPosX)



			if(Seatbelt != null && this.SeatBeltMemory == 0)
				this.Seatbelt = null;

		}



		//updatePosition();

		if (playYawSound == true && yawSoundDelay == 0 && seatInfo.traverseSounds == true)
		{
			PacketPlaySound.sendSoundPacket(posX, posY, posZ, 50, dimension, seatInfo.yawSound, false);
			yawSoundDelay = seatInfo.yawSoundLength;
		}

		if (playPitchSound == true && pitchSoundDelay == 0 && seatInfo.traverseSounds == true)
		{
			PacketPlaySound.sendSoundPacket(posX, posY, posZ, 50, dimension, seatInfo.pitchSound, false);
			pitchSoundDelay = seatInfo.pitchSoundLength;
		}

		//Reset traverse sounds if player exits the vehicle
		if(riddenByEntity instanceof EntityPlayer == false || !FlansMod.proxy.isThePlayer((EntityPlayer)riddenByEntity))
		{
			playYawSound = false;
			playPitchSound = false;
			yawSoundDelay = 0;
			pitchSoundDelay = 0;
		}


		//If on the client
		if(worldObj.isRemote)
		{
			if( driver &&
					riddenByEntity instanceof EntityPlayer &&
					FlansMod.proxy.isThePlayer((EntityPlayer) riddenByEntity) &&
					FlansModClient.controlModeMouse && driveable.hasMouseControlMode())
			{
				looking = new RotatedAxes();
				playerLooking = new RotatedAxes();
			}


			if(seatInfo.invisiblePassenger && riddenByEntity != null)
				riddenByEntity.setInvisible(true);
			//DEBUG : Spawn particles along axes

			Vector3f xAxis = driveable.axes.findLocalAxesGlobally(looking).getXAxis();
			Vector3f yAxis = driveable.axes.findLocalAxesGlobally(looking).getYAxis();
			Vector3f zAxis = driveable.axes.findLocalAxesGlobally(looking).getZAxis();
			Vector3f yOffset = driveable.axes.findLocalVectorGlobally(new Vector3f(0F, riddenByEntity == null ? 0F : (float)riddenByEntity.getYOffset(), 0F));
			for(int i = 0; i < 10; i++)
			{
				//worldObj.spawnParticle("enchantmenttable", 	posX + xAxis.x * i * 0.3D + yOffset.x, posY + xAxis.y * i * 0.3D + yOffset.y, posZ + xAxis.z * i * 0.3D + yOffset.z, 0, 0, 0);
				//worldObj.spawnParticle("smoke", 			posX + yAxis.x * i * 0.3D + yOffset.x, posY + yAxis.y * i * 0.3D + yOffset.y, posZ + yAxis.z * i * 0.3D + yOffset.z, 0, 0, 0);
				//worldObj.spawnParticle("reddust", 			posX + zAxis.x * i * 0.3D + yOffset.x, posY + zAxis.y * i * 0.3D + yOffset.y, posZ + zAxis.z * i * 0.3D + yOffset.z, 0, 0, 0);
			}

			if((lastRiddenByEntity instanceof EntityPlayer && riddenByEntity==null && FlansModClient.proxy.isThePlayer((EntityPlayer)lastRiddenByEntity) || (driveable != null && driveable.type != null && driveable.type.evilGolem)))
			{
				FlansMod.getPacketHandler().sendToServer(new PacketSeatCheck(this));
			}
		}


		//central control takes over gun aiming
				if( (driveable.getDriveableType().centralControl && this.riddenByEntity == null && seatInfo.id > 0 && driveable.seats[0] != null && driveable.seats[0].riddenByEntity != null)   ||
			 (driveable.seats[0] != null && driveable instanceof EntityVehicle && driveable.getDriveableType().evilGolem  && ((EntityVehicle)driveable).target != null && ((EntityVehicle)driveable).humanTarget != null) ) //or evil ai takes over aiming
				{
					
					if(driveable.getDriveableType().evilGolem)
					{
						//System.out.println("evil seats want to aim"); //the 10f x 1-rand means random aim off by plus or minus 5degrees   nvm it failed
						RotatedAxes evilTarget = new RotatedAxes((float) (((EntityVehicle)driveable).aimYaw), (float) (((EntityVehicle)driveable).aimPitch), 0);
						RotatedAxes evilTargetAA = new RotatedAxes((float) (((EntityVehicle)driveable).aimYawAA), (float) (((EntityVehicle)driveable).aimPitchAA), 0);
						//if(driveable.seats[0] != null && driveable.seats[1] != null && this.seatInfo.id != 1)
						playerLooking = evilTarget; //evil ai captain
						//else if(this.seatInfo.id == 1) //evil aa uses seat 1 as a ballistic data storage device
						//	playerLooking = evilTargetAA;
						
					//	System.out.println("seat 1 playerlooking:" + driveable.seats[1].playerLooking);
					//	System.out.println("seat 1 looking:" + driveable.seats[1].looking);
						
					}
					else //human captain
					playerLooking = driveable.seats[0].playerLooking;  
				
					prevLooking = looking.clone(); //xddd this guy was the key to curing seizures
					
					 //start of stolen from seat rotation el abominacion ------ 
					float targetX = playerLooking.getYaw();
		            float yawToMove = (targetX - looking.getYaw());

		            while (yawToMove > 180F) { yawToMove -= 360F; }
		            while (yawToMove <= -180F) { yawToMove += 360F; }

					float signDeltaX = 0;
					if(yawToMove > (seatInfo.aimingSpeed.x/20) && seatInfo.legacyAiming == false){
						signDeltaX = 0.1f;
					} else if(yawToMove < -(seatInfo.aimingSpeed.x/20) && seatInfo.legacyAiming == false){
						signDeltaX = -0.1f;
					} else{
						signDeltaX = 0;
					}
					//Calculate new yaw and consider yaw limiters
					float newYaw = 0f;
					//if(FlansModClient.controlModeMouse) //attempt to decapitate yaw system when mouse control off   had to comment this out because server hates clientmousecontrol
					{
					if( (signDeltaX == 0)){
						newYaw = playerLooking.getYaw();
					} else  if( Math.abs(yawToMove) < 2){
						newYaw = looking.getYaw() + signDeltaX*seatInfo.aimingSpeed.x;
					}
					else
						newYaw = looking.getYaw() + 10*signDeltaX*seatInfo.aimingSpeed.x;
					}
					//else   had to comment this out because server hates clientmousecontrol
						//newYaw = targetYaw;		  had to comment this out because server hates clientmousecontrol	
					//Since the yaw limiters go from -360 to 360, we need to find a pair of yaw values and check them both
					float otherNewYaw = newYaw - 360F;
					if(newYaw < 0 ) 
						otherNewYaw = newYaw + 360F;
					if((newYaw >= seatInfo.minYaw && newYaw <= seatInfo.maxYaw) || (otherNewYaw >= seatInfo.minYaw && otherNewYaw <= seatInfo.maxYaw))
					{
						//All is well
					}
					else
					{
						float newYawDistFromRange = Math.min(Math.abs(newYaw - seatInfo.minYaw), Math.abs(newYaw - seatInfo.maxYaw));
						float otherNewYawDistFromRange = Math.min(Math.abs(otherNewYaw - seatInfo.minYaw), Math.abs(otherNewYaw - seatInfo.maxYaw));
						//If the newYaw is closer to the range than the otherNewYaw, move newYaw into the range
						if(newYawDistFromRange <= otherNewYawDistFromRange)
						{
							if(newYaw > seatInfo.maxYaw)
								newYaw = seatInfo.maxYaw;
							if(newYaw < seatInfo.minYaw)
								newYaw = seatInfo.minYaw;
						}
						//Else, the otherNewYaw is closer, so move it in
						else
						{
							if(otherNewYaw > seatInfo.maxYaw)
								otherNewYaw = seatInfo.maxYaw;
							if(otherNewYaw < seatInfo.minYaw)
								otherNewYaw = seatInfo.minYaw;
							//Then match up the newYaw with the otherNewYaw
							if(newYaw < 0)
								newYaw = otherNewYaw - 360F;
							else newYaw = otherNewYaw + 360F;
						}
					}
					//Calculate the new pitch and consider pitch limiters
					float targetY = playerLooking.getPitch();		
		            //if (!FlansModClient.controlModeMouse && driver && !(driveable instanceof EntityPlane))  had to comment this out because server hates clientmousecontrol
		              //  targetY = targetPitch; //restore broken feature xdd             had to comment this out because server hates clientmousecontrol
		            float pitchToMove = (targetY - looking.getPitch());
		            while (pitchToMove > 180F) { pitchToMove -= 360F; }
		            while (pitchToMove <= -180F) { pitchToMove += 360F; }
					float signDeltaY = 0;
					if(pitchToMove > (seatInfo.aimingSpeed.y/20) && seatInfo.legacyAiming == false){
						signDeltaY = 0.1f;
					} else if(pitchToMove < -(seatInfo.aimingSpeed.y/20) && seatInfo.legacyAiming == false){
						signDeltaY = -0.1f;
					} else {
						signDeltaY = 0;
					}
					float newPitch = 0f;
					//Pitches the gun at the last possible moment in order to reach target pitch at the same time as target yaw.
					float minYawToMove = 0f;
					float currentYawToMove = 0f;
					if(seatInfo.latePitch){
					minYawToMove = ((float)Math.sqrt((pitchToMove / seatInfo.aimingSpeed.y)*(pitchToMove / seatInfo.aimingSpeed.y)))*seatInfo.aimingSpeed.x;
					} else {
					minYawToMove = 360f;
					}
					currentYawToMove = (float)Math.sqrt((yawToMove)*(yawToMove));
					if ( (Math.abs(pitchToMove) < 2) && seatInfo.yawBeforePitch == false && currentYawToMove < minYawToMove){
						newPitch = looking.getPitch() + signDeltaY*seatInfo.aimingSpeed.y;
					} else if ((Math.abs(pitchToMove) < 2) && seatInfo.yawBeforePitch == true && signDeltaX == 0){
						newPitch = looking.getPitch() + signDeltaY*seatInfo.aimingSpeed.y;
					} else if ((Math.abs(pitchToMove) < 2) && seatInfo.yawBeforePitch == true && signDeltaX != 0){
						newPitch = looking.getPitch();
					}
					//adjustments so faster pitch if large required angle, then slows down for hd movement for last 2 degrees above
					else  if (  seatInfo.yawBeforePitch == false && currentYawToMove < minYawToMove){
						newPitch = looking.getPitch() + 10*signDeltaY*seatInfo.aimingSpeed.y;
					} else if ( seatInfo.yawBeforePitch == true && signDeltaX == 0){
						newPitch = looking.getPitch() + 10*signDeltaY*seatInfo.aimingSpeed.y;
					} else if ( seatInfo.yawBeforePitch == true && signDeltaX != 0){
						newPitch = looking.getPitch();
					}
					else {
						newPitch = looking.getPitch();
					}
					if(newPitch > -seatInfo.minPitch)
						newPitch = -seatInfo.minPitch;
					if(newPitch < -seatInfo.maxPitch)
						newPitch = -seatInfo.maxPitch;
					//Now set the new angles
					looking.setAngles(newYaw, newPitch, 0F);
					//end of stolen from seat rotation el abominacion cest fini -----  */
					
				}
					
					
				//forbidden central control system shooting
				if(  ( (driveable.getDriveableType().centralControl && this.riddenByEntity == null && driveable.shootingTertiary && driveable.seats[0] != null && driveable.seats[0].riddenByEntity != null && driveable.seats[0].riddenByEntity instanceof EntityPlayer) && driveable.getDriveableData().parts.get(this.seatInfo.part).health > 0 //no shooting if dead turret
						&& (driveable.seats[0].playerLooking.getYaw()+8f >= looking.getYaw() && driveable.seats[0].playerLooking.getYaw()-8f <= looking.getYaw()  &&  driveable.seats[0].playerLooking.getPitch()+8f >= looking.getPitch() && driveable.seats[0].playerLooking.getPitch()-8f <= looking.getPitch() ))||  //also check if aiming roughly correct direction
						 (driveable instanceof EntityVehicle && driveable.getDriveableType().evilGolem  && driveable.shootingTertiary && ((EntityVehicle)driveable).target != null && ((EntityVehicle)driveable).humanTarget != null
						 &&  driveable.getDriveableData().parts.get(this.seatInfo.part).health > 0 ) //last line is so dead turrets cant shoot anymore
										&&  (driveable.seats[0].playerLooking.getYaw()+8f >= looking.getYaw() && driveable.seats[0].playerLooking.getYaw()-8f <= looking.getYaw()  &&  driveable.seats[0].playerLooking.getPitch()+8f >= looking.getPitch() && driveable.seats[0].playerLooking.getPitch()-8f <= looking.getPitch())) //or shoot if its an evil ai ship
				{ //the last condition at the end means gun wont fire unless its angles are within 16degree margin around where player is looking. This will prevent gun on wrong side of vehicle from shooting
					EntityPlayer player = (EntityPlayer)driveable.seats[0].riddenByEntity; //the captain
					
					if(driveable instanceof EntityVehicle && driveable.getDriveableType().evilGolem )
					{
						player = (EntityPlayer)((EntityVehicle)driveable).humanTarget;
					}
					GunType gun = seatInfo.gunType;
					if(driveable != null && driveable.atSea && gun != null && gun.mode != EnumFireMode.MINIGUN || minigunSpeed > 2F  ) //also no waterbucket landship
					{ 
						if(gunDelay <= 0 && TeamsManager.bulletsEnabled && driveable.getDriveableData().ammo[seatInfo.gunnerID] != null)
						{	
							ItemStack bulletItemStack = driveable.getDriveableData().ammo[seatInfo.gunnerID];
							//Check that neither is null and that the bullet item is actually a bullet, also check if universal pacifism is enforced
							if(gun != null && bulletItemStack != null && bulletItemStack.getItem() instanceof ItemShootable && TeamsManager.violence==false)
							{
								ShootableType bullet = ((ItemShootable)bulletItemStack.getItem()).type;
								if(gun.isAmmo(bullet))
								{
									//Gun origin
									Vector3f gunOrigin = Vector3f.add(driveable.axes.findLocalVectorGlobally(seatInfo.gunOrigin), new Vector3f(driveable.posX, driveable.posY, driveable.posZ), null);
									//Calculate the look axes globally
									RotatedAxes globalLookAxes = driveable.axes.findLocalAxesGlobally(looking);
									Vector3f shootVec = driveable.axes.findLocalVectorGlobally(looking.getXAxis());
									//Calculate the origin of the bullets
									Vector3f yOffset = driveable.axes.findLocalVectorGlobally(new Vector3f(0F, this.getMountedYOffset(), 0F));
									//Spawn a new bullet item
									if(this.seatInfo.barrels==1)
									{
										worldObj.spawnEntityInWorld(((ItemShootable)bulletItemStack.getItem()).getEntity(worldObj, Vector3f.add(yOffset, new Vector3f((gunOrigin.x+shootVec.z*(0)), gunOrigin.y, (gunOrigin.z+shootVec.x*(0))), null), shootVec, player, gun.bulletSpread, gun.damage, gun.bulletSpeed, bulletItemStack.getItemDamage(), driveable.getDriveableType(), driveable.getDriveableType().evilGolem));
										//System.out.println("robot is trying to shoot");
									}
										//labjac battleship epic style
									if(this.seatInfo.barrels==2)
									{
									worldObj.spawnEntityInWorld(((ItemShootable)bulletItemStack.getItem()).getEntity(worldObj, Vector3f.add(yOffset, new Vector3f((gunOrigin.x-shootVec.z*(seatInfo.barrelSpread/2)), gunOrigin.y, (gunOrigin.z-shootVec.x*(seatInfo.barrelSpread/2))), null), shootVec, player, gun.bulletSpread, gun.damage, gun.bulletSpeed, bulletItemStack.getItemDamage(), driveable.getDriveableType(), driveable.getDriveableType().evilGolem));
									worldObj.spawnEntityInWorld(((ItemShootable)bulletItemStack.getItem()).getEntity(worldObj, Vector3f.add(yOffset, new Vector3f((gunOrigin.x+shootVec.z*(seatInfo.barrelSpread/2)), gunOrigin.y, (gunOrigin.z+shootVec.x*(seatInfo.barrelSpread/2))), null), shootVec, player, gun.bulletSpread, gun.damage, gun.bulletSpeed, bulletItemStack.getItemDamage(), driveable.getDriveableType(), driveable.getDriveableType().evilGolem));
									}
									
									if(this.seatInfo.barrels==3)
									{
									worldObj.spawnEntityInWorld(((ItemShootable)bulletItemStack.getItem()).getEntity(worldObj, Vector3f.add(yOffset, new Vector3f((gunOrigin.x-shootVec.z*(seatInfo.barrelSpread)), gunOrigin.y, (gunOrigin.z-shootVec.x*(seatInfo.barrelSpread))), null), shootVec, player, gun.bulletSpread, gun.damage, gun.bulletSpeed, bulletItemStack.getItemDamage(), driveable.getDriveableType(), driveable.getDriveableType().evilGolem));
									worldObj.spawnEntityInWorld(((ItemShootable)bulletItemStack.getItem()).getEntity(worldObj, Vector3f.add(yOffset, new Vector3f((gunOrigin.x+shootVec.z*(0)), gunOrigin.y, (gunOrigin.z+shootVec.x*(0))), null), shootVec, player, gun.bulletSpread, gun.damage, gun.bulletSpeed, bulletItemStack.getItemDamage(), driveable.getDriveableType(), driveable.getDriveableType().evilGolem));
									worldObj.spawnEntityInWorld(((ItemShootable)bulletItemStack.getItem()).getEntity(worldObj, Vector3f.add(yOffset, new Vector3f((gunOrigin.x+shootVec.z*(seatInfo.barrelSpread)), gunOrigin.y, (gunOrigin.z+shootVec.x*(seatInfo.barrelSpread))), null), shootVec, player, gun.bulletSpread, gun.damage, gun.bulletSpeed, bulletItemStack.getItemDamage(), driveable.getDriveableType(), driveable.getDriveableType().evilGolem));
									}
									
									if(this.seatInfo.barrels==4)
									{
										worldObj.spawnEntityInWorld(((ItemShootable)bulletItemStack.getItem()).getEntity(worldObj, Vector3f.add(yOffset, new Vector3f((gunOrigin.x-shootVec.z*(seatInfo.barrelSpread/2)), gunOrigin.y, (gunOrigin.z-shootVec.x*(seatInfo.barrelSpread/2))), null), shootVec, player, gun.bulletSpread, gun.damage, gun.bulletSpeed, bulletItemStack.getItemDamage(), driveable.getDriveableType(), driveable.getDriveableType().evilGolem));
										worldObj.spawnEntityInWorld(((ItemShootable)bulletItemStack.getItem()).getEntity(worldObj, Vector3f.add(yOffset, new Vector3f((gunOrigin.x+shootVec.z*(seatInfo.barrelSpread/2)), gunOrigin.y, (gunOrigin.z+shootVec.x*(seatInfo.barrelSpread/2))), null), shootVec, player, gun.bulletSpread, gun.damage, gun.bulletSpeed, bulletItemStack.getItemDamage(), driveable.getDriveableType(), driveable.getDriveableType().evilGolem));
										worldObj.spawnEntityInWorld(((ItemShootable)bulletItemStack.getItem()).getEntity(worldObj, Vector3f.add(yOffset, new Vector3f((gunOrigin.x-shootVec.z*(seatInfo.barrelSpread/2)), gunOrigin.y, (gunOrigin.z-shootVec.x*(seatInfo.barrelSpread))), null), shootVec, player, gun.bulletSpread, gun.damage, gun.bulletSpeed, bulletItemStack.getItemDamage(), driveable.getDriveableType(), driveable.getDriveableType().evilGolem));
										worldObj.spawnEntityInWorld(((ItemShootable)bulletItemStack.getItem()).getEntity(worldObj, Vector3f.add(yOffset, new Vector3f((gunOrigin.x+shootVec.z*(seatInfo.barrelSpread/2)), gunOrigin.y, (gunOrigin.z+shootVec.x*(seatInfo.barrelSpread))), null), shootVec, player, gun.bulletSpread, gun.damage, gun.bulletSpeed, bulletItemStack.getItemDamage(), driveable.getDriveableType(), driveable.getDriveableType().evilGolem));
										}
									
									if(this.seatInfo.barrels==5)
									{
										worldObj.spawnEntityInWorld(((ItemShootable)bulletItemStack.getItem()).getEntity(worldObj, Vector3f.add(yOffset, new Vector3f((gunOrigin.x+shootVec.z*(0)), gunOrigin.y, (gunOrigin.z+shootVec.x*(0))), null), shootVec, player, gun.bulletSpread, gun.damage, gun.bulletSpeed, bulletItemStack.getItemDamage(), driveable.getDriveableType(), driveable.getDriveableType().evilGolem));
										worldObj.spawnEntityInWorld(((ItemShootable)bulletItemStack.getItem()).getEntity(worldObj, Vector3f.add(yOffset, new Vector3f((gunOrigin.x-shootVec.z*(seatInfo.barrelSpread)), gunOrigin.y, (gunOrigin.z-shootVec.x*(seatInfo.barrelSpread))), null), shootVec, player, gun.bulletSpread, gun.damage, gun.bulletSpeed, bulletItemStack.getItemDamage(), driveable.getDriveableType(), driveable.getDriveableType().evilGolem));
										worldObj.spawnEntityInWorld(((ItemShootable)bulletItemStack.getItem()).getEntity(worldObj, Vector3f.add(yOffset, new Vector3f((gunOrigin.x+shootVec.z*(seatInfo.barrelSpread)), gunOrigin.y, (gunOrigin.z+shootVec.x*(seatInfo.barrelSpread))), null), shootVec, player, gun.bulletSpread, gun.damage, gun.bulletSpeed, bulletItemStack.getItemDamage(), driveable.getDriveableType(), driveable.getDriveableType().evilGolem));
										worldObj.spawnEntityInWorld(((ItemShootable)bulletItemStack.getItem()).getEntity(worldObj, Vector3f.add(yOffset, new Vector3f((gunOrigin.x-shootVec.z*(seatInfo.barrelSpread/2)), gunOrigin.y, (gunOrigin.z-shootVec.x*(seatInfo.barrelSpread))), null), shootVec, player, gun.bulletSpread, gun.damage, gun.bulletSpeed, bulletItemStack.getItemDamage(), driveable.getDriveableType(), driveable.getDriveableType().evilGolem));
										worldObj.spawnEntityInWorld(((ItemShootable)bulletItemStack.getItem()).getEntity(worldObj, Vector3f.add(yOffset, new Vector3f((gunOrigin.x+shootVec.z*(seatInfo.barrelSpread/2)), gunOrigin.y, (gunOrigin.z+shootVec.x*(seatInfo.barrelSpread))), null), shootVec, player, gun.bulletSpread, gun.damage, gun.bulletSpeed, bulletItemStack.getItemDamage(), driveable.getDriveableType(), driveable.getDriveableType().evilGolem));
										
										}
									//fuck you tillman
									if(this.seatInfo.barrels==6)
									{
										worldObj.spawnEntityInWorld(((ItemShootable)bulletItemStack.getItem()).getEntity(worldObj, Vector3f.add(yOffset, new Vector3f((gunOrigin.x-shootVec.z*(seatInfo.barrelSpread/2)), gunOrigin.y, (gunOrigin.z-shootVec.x*(seatInfo.barrelSpread/2))), null), shootVec, player, gun.bulletSpread, gun.damage, gun.bulletSpeed, bulletItemStack.getItemDamage(), driveable.getDriveableType(), driveable.getDriveableType().evilGolem));
										worldObj.spawnEntityInWorld(((ItemShootable)bulletItemStack.getItem()).getEntity(worldObj, Vector3f.add(yOffset, new Vector3f((gunOrigin.x+shootVec.z*(seatInfo.barrelSpread/2)), gunOrigin.y, (gunOrigin.z+shootVec.x*(seatInfo.barrelSpread/2))), null), shootVec, player, gun.bulletSpread, gun.damage, gun.bulletSpeed, bulletItemStack.getItemDamage(), driveable.getDriveableType(), driveable.getDriveableType().evilGolem));
										worldObj.spawnEntityInWorld(((ItemShootable)bulletItemStack.getItem()).getEntity(worldObj, Vector3f.add(yOffset, new Vector3f((gunOrigin.x-shootVec.z*(seatInfo.barrelSpread/2)), gunOrigin.y, (gunOrigin.z-shootVec.x*(seatInfo.barrelSpread))), null), shootVec, player, gun.bulletSpread, gun.damage, gun.bulletSpeed, bulletItemStack.getItemDamage(), driveable.getDriveableType(), driveable.getDriveableType().evilGolem));
										worldObj.spawnEntityInWorld(((ItemShootable)bulletItemStack.getItem()).getEntity(worldObj, Vector3f.add(yOffset, new Vector3f((gunOrigin.x+shootVec.z*(seatInfo.barrelSpread/2)), gunOrigin.y, (gunOrigin.z+shootVec.x*(seatInfo.barrelSpread))), null), shootVec, player, gun.bulletSpread, gun.damage, gun.bulletSpeed, bulletItemStack.getItemDamage(), driveable.getDriveableType(), driveable.getDriveableType().evilGolem));
										worldObj.spawnEntityInWorld(((ItemShootable)bulletItemStack.getItem()).getEntity(worldObj, Vector3f.add(yOffset, new Vector3f((gunOrigin.x-shootVec.z*(seatInfo.barrelSpread/2)), gunOrigin.y, (gunOrigin.z-shootVec.x*(seatInfo.barrelSpread*1.5f))), null), shootVec, player, gun.bulletSpread, gun.damage, gun.bulletSpeed, bulletItemStack.getItemDamage(), driveable.getDriveableType(), driveable.getDriveableType().evilGolem));
										worldObj.spawnEntityInWorld(((ItemShootable)bulletItemStack.getItem()).getEntity(worldObj, Vector3f.add(yOffset, new Vector3f((gunOrigin.x+shootVec.z*(seatInfo.barrelSpread/2)), gunOrigin.y, (gunOrigin.z+shootVec.x*(seatInfo.barrelSpread*1.5f))), null), shootVec, player, gun.bulletSpread, gun.damage, gun.bulletSpeed, bulletItemStack.getItemDamage(), driveable.getDriveableType(), driveable.getDriveableType().evilGolem));}
									
									//Play the shoot sound
									if(soundDelay <= 0)
									{
										//float range = FlansMod.soundRange;
										//if(driveable != null && driveable.type!= null && driveable.type.epicShip)
										//	range = 240;
										PacketPlaySound.sendSoundPacket(posX, posY, posZ, 200, dimension, gun.shootSound, false);
										soundDelay = gun.shootSoundLength;
									}
									//Get the bullet item damage and increment it
									int damage = bulletItemStack.getItemDamage();
									if( !(driveable.type!=null && driveable.type.evilGolem) && !(player != null && (player).capabilities != null && (player).capabilities.isCreativeMode) ) //if no player, then unlimited ammo for AI evil golem ship
									bulletItemStack.setItemDamage(damage + 1);
									
									//System.out.println("stack size outside of stack killer" + driveable.getDriveableData().ammo[seatInfo.gunnerID].stackSize);
									//If the bullet item is completely damaged (empty)
									if(damage >= bulletItemStack.getMaxDamage())
									{
										//Set the damage to 0 and consume one ammo item (unless in creative)
										if(player == null || (riddenByEntity != null && ((EntityPlayer)riddenByEntity).capabilities.isCreativeMode))
										{
											//refills ammo in creative
											bulletItemStack.setItemDamage(0);
										}
										else
										{
											driveable.getDriveableData().ammo[seatInfo.gunnerID].stackSize--;
											bulletItemStack.setItemDamage(0);
											if(driveable.getDriveableData().ammo[seatInfo.gunnerID].stackSize<=0)
											{
												  driveable.getDriveableData().ammo[seatInfo.gunnerID] = null;
												}
										}
									}
									//Reset the shoot delay
									gunDelay = (int)gun.shootDelay;
								}
							}
						}
					}
				}
				//end of central control shooting clone

		if(riddenByEntity instanceof EntityPlayer && shooting)
			pressKey(9, (EntityPlayer)riddenByEntity);

		minigunSpeed *= 0.95F;
		minigunAngle += minigunSpeed;
		//prevLooking = looking.clone();

		lastRiddenByEntity = riddenByEntity;
	}



	/** Set the position to be that of the driveable plus the local position, rotated */
	public void updatePosition()
	{
		//If we haven't found our driveable, give up
		if(worldObj.isRemote && !foundDriveable)
			return;

		prevPlayerPosX = playerPosX;
		prevPlayerPosY = playerPosY;
		prevPlayerPosZ = playerPosZ;

		prevPlayerYaw = playerYaw;
		prevPlayerPitch = playerPitch;

		//Get the position of this seat on the driveable axes
		Vector3f localPosition = new Vector3f(seatInfo.x / 16F, seatInfo.y / 16F, seatInfo.z / 16F);

		//Rotate the offset vector by the turret yaw
		if(driveable != null && driveable.seats != null && driveable.seats[0] != null && driveable.seats[0].looking != null)
		{
			RotatedAxes yawOnlyLooking = new RotatedAxes(driveable.seats[0].looking.getYaw(), (driveable.seats[0].seatInfo.part == EnumDriveablePart.barrel)?driveable.seats[0].looking.getPitch():0F, 0F);
			Vector3f rotatedOffset = yawOnlyLooking.findLocalVectorGlobally(seatInfo.rotatedOffset);
			Vector3f.add(localPosition, new Vector3f(rotatedOffset.x, (driveable.seats[0].seatInfo.part == EnumDriveablePart.barrel)?rotatedOffset.y:0F, rotatedOffset.z), localPosition);
		}

		//If this seat is connected to the turret, then its position vector on the driveable axes needs an extra rotation in it
		//if(driveable.rotateWithTurret(seatInfo) && driveable.seats[0] != null)
		//localPosition = driveable.seats[0].looking.findLocalVectorGlobally(localPosition);
		//Get the position of this seat globally, but positionally relative to the driveable
		Vector3f relativePosition = driveable.axes.findLocalVectorGlobally(localPosition);
		//Set the absol
		setPosition(driveable.posX + relativePosition.x, driveable.posY + relativePosition.y, driveable.posZ + relativePosition.z);

		if(riddenByEntity != null)
		{
			DriveableType type = driveable.getDriveableType();
			Vec3 yOffset = driveable.rotate(0, riddenByEntity.getYOffset(), 0).toVec3();

			playerPosX = posX + yOffset.xCoord;
			playerPosY = posY + yOffset.yCoord;
			playerPosZ = posZ + yOffset.zCoord;

			riddenByEntity.lastTickPosX = riddenByEntity.prevPosX = prevPlayerPosX;
			riddenByEntity.lastTickPosY = riddenByEntity.prevPosY = prevPlayerPosY;
			riddenByEntity.lastTickPosZ = riddenByEntity.prevPosZ = prevPlayerPosZ;
			riddenByEntity.setPosition(playerPosX, playerPosY, playerPosZ);

			//Calculate the local look axes globally
			RotatedAxes globalLookAxes = driveable.axes.findLocalAxesGlobally(playerLooking);
			//Set the player's rotation based on this
			playerYaw = -90F + globalLookAxes.getYaw();
			playerPitch = globalLookAxes.getPitch();

			double dYaw = playerYaw - prevPlayerYaw;
			if(dYaw > 180)
				prevPlayerYaw += 360F;
			if(dYaw < -180)
				prevPlayerYaw -= 360F;

			if(riddenByEntity instanceof EntityPlayer)
			{
				riddenByEntity.prevRotationYaw = prevPlayerYaw;
				riddenByEntity.prevRotationPitch = prevPlayerPitch;

				riddenByEntity.rotationYaw = playerYaw;
				riddenByEntity.rotationPitch = playerPitch;
			}

			//If the entity is a player, roll its view accordingly
			if(worldObj.isRemote)
			{
				prevPlayerRoll = playerRoll;
				playerRoll = -globalLookAxes.getRoll();
			}
		}
	}

	//client version
	public void updatePositionClient()
	{
		//If we haven't found our driveable, give up
		if(worldObj.isRemote && !foundDriveable)
			return;


		if(worldObj.isRemote)
		{
			prevPlayerPosX = playerPosX;
			prevPlayerPosY = playerPosY;
			prevPlayerPosZ = playerPosZ;

			prevPlayerYaw = playerYaw;
			prevPlayerPitch = playerPitch;

			//Get the position of this seat on the driveable axes
			Vector3f localPosition = new Vector3f(seatInfo.x / 16F, seatInfo.y / 16F, seatInfo.z / 16F);

			//Rotate the offset vector by the turret yaw
			if(driveable != null && driveable.seats != null && driveable.seats[0] != null && driveable.seats[0].looking != null)
			{
				RotatedAxes yawOnlyLooking = new RotatedAxes(driveable.seats[0].looking.getYaw(), (driveable.seats[0].seatInfo.part == EnumDriveablePart.barrel)?driveable.seats[0].looking.getPitch():0F, 0F);
				Vector3f rotatedOffset = yawOnlyLooking.findLocalVectorGlobally(seatInfo.rotatedOffset);
				Vector3f.add(localPosition, new Vector3f(rotatedOffset.x, (driveable.seats[0].seatInfo.part == EnumDriveablePart.barrel)?rotatedOffset.y:0F, rotatedOffset.z), localPosition);
			}

			//If this seat is connected to the turret, then its position vector on the driveable axes needs an extra rotation in it
			//if(driveable.rotateWithTurret(seatInfo) && driveable.seats[0] != null)
			//localPosition = driveable.seats[0].looking.findLocalVectorGlobally(localPosition);
			//Get the position of this seat globally, but positionally relative to the driveable
			Vector3f relativePosition = driveable.axes.findLocalVectorGlobally(localPosition);
			//Set the absol
			setPosition(driveable.posX + relativePosition.x, driveable.posY + relativePosition.y, driveable.posZ + relativePosition.z);

			if(riddenByEntity != null)
			{
				DriveableType type = driveable.getDriveableType();
				Vec3 yOffset = driveable.rotate(0, riddenByEntity.getYOffset(), 0).toVec3();

				playerPosX = posX + yOffset.xCoord;
				playerPosY = posY + yOffset.yCoord;
				playerPosZ = posZ + yOffset.zCoord;

				riddenByEntity.lastTickPosX = riddenByEntity.prevPosX = prevPlayerPosX;
				riddenByEntity.lastTickPosY = riddenByEntity.prevPosY = prevPlayerPosY;
				riddenByEntity.lastTickPosZ = riddenByEntity.prevPosZ = prevPlayerPosZ;
				riddenByEntity.setPosition(playerPosX, playerPosY, playerPosZ);

				//Calculate the local look axes globally
				RotatedAxes globalLookAxes = driveable.axes.findLocalAxesGlobally(playerLooking);
				//Set the player's rotation based on this
				playerYaw = -90F + globalLookAxes.getYaw();
				playerPitch = globalLookAxes.getPitch();

				double dYaw = playerYaw - prevPlayerYaw;
				if(dYaw > 180)
					prevPlayerYaw += 360F;
				if(dYaw < -180)
					prevPlayerYaw -= 360F;

				if(riddenByEntity instanceof EntityPlayer)
				{
					riddenByEntity.prevRotationYaw = prevPlayerYaw;
					riddenByEntity.prevRotationPitch = prevPlayerPitch;

					riddenByEntity.rotationYaw = playerYaw;
					riddenByEntity.rotationPitch = playerPitch;
				}

				//If the entity is a player, roll its view accordingly
				if(worldObj.isRemote)
				{
					prevPlayerRoll = playerRoll;
					playerRoll = -globalLookAxes.getRoll();
				}
			}
		}
	}
	@Override
	public void updateRiderPosition()
	{
		if(riddenByEntity instanceof EntityPlayer)
		{
			riddenByEntity.rotationYaw = playerYaw;
			riddenByEntity.rotationPitch = playerPitch;
			riddenByEntity.prevRotationYaw = prevPlayerYaw;
			riddenByEntity.prevRotationPitch = prevPlayerPitch;
		}
		riddenByEntity.lastTickPosX = riddenByEntity.prevPosX = prevPlayerPosX;
		riddenByEntity.lastTickPosY = riddenByEntity.prevPosY = prevPlayerPosY;
		riddenByEntity.lastTickPosZ = riddenByEntity.prevPosZ = prevPlayerPosZ;

	}

	@Override
	@SideOnly(Side.CLIENT)
	public EntityLivingBase getCamera()
	{
		return driveable.getCamera();
	}

	@Override
	public boolean canBeCollidedWith()
	{
		return !isDead;
	}

	@Override
	protected void entityInit()
	{
	}

	@Override
	public float getShadowSize()
	{
		return 4.0F;
	}

	@Override
	protected void readEntityFromNBT(NBTTagCompound tags)
	{
		//Do not read. Spawn with driveable
	}

	@Override
	protected void writeEntityToNBT(NBTTagCompound tags)
	{
		//Do not write. Spawn with driveable
	}

	@Override
	public boolean writeToNBTOptional(NBTTagCompound tags)
	{
		return false;
	}

	@Override
	public boolean writeMountToNBT(NBTTagCompound tags)
	{
		return false;
	}

	@Override
	public void onMouseMoved(int deltaX, int deltaY)
	{
		if(!foundDriveable)
			return;


		prevLooking = looking.clone();
		prevPlayerLooking = playerLooking.clone();

		//Driver seat should pass input to driveable
		if(driver)
		{
			driveable.onMouseMoved(deltaX, deltaY);
		}

		//Other seats should look around, but also the driver seat if mouse control mode is disabled
		if(!driver || !FlansModClient.controlModeMouse || !driveable.hasMouseControlMode() || !(!driver && this.driveable.getDriveableType().centralControl && this.riddenByEntity != null) )
		{
			float lookSpeed = 4F;

			//Angle stuff for the player

			//Calculate the new pitch and consider pitch limiters
			float newPlayerPitch = playerLooking.getPitch() - deltaY / lookSpeed * FlansMod.proxy.getMouseSensitivity();
			//if(newPlayerPitch > -seatInfo.minPitch && !walterMortar) //freedom for walter calculators so mrotar can look down
			//	newPlayerPitch = -seatInfo.minPitch;
			if(newPlayerPitch < -seatInfo.maxPitch) // (newPlayerPitch < -seatInfo.maxPitch && !walterMortar)
				newPlayerPitch = -seatInfo.maxPitch;
			//	!(!FlansModClient.controlModeMouse && (walterMortar || walterCalculator))
			//Calculate new yaw and consider yaw limiters
			float newPlayerYaw = playerLooking.getYaw() + deltaX / lookSpeed * FlansMod.proxy.getMouseSensitivity();
			//Since the yaw limiters go from -360 to 360, we need to find a pair of yaw values and check them both
			float otherNewPlayerYaw = newPlayerYaw - 360F;
			if(newPlayerYaw < 0)
				otherNewPlayerYaw = newPlayerYaw + 360F;
			if((newPlayerYaw >= seatInfo.minYaw && newPlayerYaw <= seatInfo.maxYaw) || (otherNewPlayerYaw >= seatInfo.minYaw && otherNewPlayerYaw <= seatInfo.maxYaw))
			{
				//All is well
			}
			else
			{
				float newPlayerYawDistFromRange = Math.min(Math.abs(newPlayerYaw - seatInfo.minYaw), Math.abs(newPlayerYaw - seatInfo.maxYaw));
				float otherPlayerNewYawDistFromRange = Math.min(Math.abs(otherNewPlayerYaw - seatInfo.minYaw), Math.abs(otherNewPlayerYaw - seatInfo.maxYaw));
				//If the newYaw is closer to the range than the otherNewYaw, move newYaw into the range
				if(newPlayerYawDistFromRange <= otherPlayerNewYawDistFromRange)
				{
					if(newPlayerYaw > seatInfo.maxYaw)
						newPlayerYaw = seatInfo.maxYaw;
					//if(newPlayerYaw < seatInfo.minYaw && !walterMortar) //allow player to look freely down if walter mmode
					//	newPlayerYaw = seatInfo.minYaw;
				}
				//Else, the otherNewYaw is closer, so move it in
				else
				{
					if(otherNewPlayerYaw > seatInfo.maxYaw)
						otherNewPlayerYaw = seatInfo.maxYaw;
					if(otherNewPlayerYaw < seatInfo.minYaw)
						otherNewPlayerYaw = seatInfo.minYaw;
					//Then match up the newYaw with the otherNewYaw
					if(newPlayerYaw < 0)
						newPlayerYaw = otherNewPlayerYaw - 360F;
					else newPlayerYaw = otherNewPlayerYaw + 360F;
				}
			}
			//Now set the new angles
			playerLooking.setAngles(newPlayerYaw, newPlayerPitch, 0F);


			//Move the seat accordingly


			//Consider new Yaw and Yaw limiters
			if(driveable.disabled) return;

			//float targetX = playerLooking.getYaw(); broken version
			//   float targetX;

			// if (FlansModClient.controlModeMouse || !driver || (driveable instanceof EntityPlane))
			//     targetX = playerLooking.getYaw();
			//else targetX = targetYaw;

			//Calculate the new pitch and consider pitch limiters
			float targetX = playerLooking.getYaw();

			if (!FlansModClient.controlModeMouse && driver && !(driveable instanceof EntityPlane))
				targetX = targetYaw; //restore broken feature xdd





			//float yawToMove = (targetX - looking.getYaw());
			//for(; yawToMove > 180F; yawToMove -= 360F) {}
			//for(; yawToMove <= -180F; yawToMove += 360F) {}
			float yawToMove = (targetX - looking.getYaw());

			while (yawToMove > 180F) { yawToMove -= 360F; }
			while (yawToMove <= -180F) { yawToMove += 360F; }

			float signDeltaX = 0;
			if(yawToMove > (seatInfo.aimingSpeed.x/20) && seatInfo.legacyAiming == false){
				signDeltaX = 0.1f;
			} else if(yawToMove < -(seatInfo.aimingSpeed.x/20) && seatInfo.legacyAiming == false){
				signDeltaX = -0.1f;
			} else{
				signDeltaX = 0;
			}

			//Calculate new yaw and consider yaw limiters
			float newYaw = 0f;

			if(FlansModClient.controlModeMouse) //attempt to decapitate yaw system when mouse control off
			{
				if( (signDeltaX == 0 && deltaX == 0)){
					newYaw = playerLooking.getYaw();
				} else  if( Math.abs(yawToMove) < 2){
					newYaw = looking.getYaw() + signDeltaX*seatInfo.aimingSpeed.x;
				}
				else
					newYaw = looking.getYaw() + 10*signDeltaX*seatInfo.aimingSpeed.x;
			}
			else
				newYaw = targetYaw;


			//Since the yaw limiters go from -360 to 360, we need to find a pair of yaw values and check them both
			float otherNewYaw = newYaw - 360F;
			if(newYaw < 0 ) 
				otherNewYaw = newYaw + 360F;
			if((newYaw >= seatInfo.minYaw && newYaw <= seatInfo.maxYaw) || (otherNewYaw >= seatInfo.minYaw && otherNewYaw <= seatInfo.maxYaw))
			{
				//All is well
			}
			else
			{
				float newYawDistFromRange = Math.min(Math.abs(newYaw - seatInfo.minYaw), Math.abs(newYaw - seatInfo.maxYaw));
				float otherNewYawDistFromRange = Math.min(Math.abs(otherNewYaw - seatInfo.minYaw), Math.abs(otherNewYaw - seatInfo.maxYaw));
				//If the newYaw is closer to the range than the otherNewYaw, move newYaw into the range
				if(newYawDistFromRange <= otherNewYawDistFromRange)
				{
					if(newYaw > seatInfo.maxYaw)
						newYaw = seatInfo.maxYaw;
					if(newYaw < seatInfo.minYaw)
						newYaw = seatInfo.minYaw;
				}
				//Else, the otherNewYaw is closer, so move it in
				else
				{
					if(otherNewYaw > seatInfo.maxYaw)
						otherNewYaw = seatInfo.maxYaw;
					if(otherNewYaw < seatInfo.minYaw)
						otherNewYaw = seatInfo.minYaw;
					//Then match up the newYaw with the otherNewYaw
					if(newYaw < 0)
						newYaw = otherNewYaw - 360F;
					else newYaw = otherNewYaw + 360F;
				}
			}

			//Calculate the new pitch and consider pitch limiters
			float targetY = playerLooking.getPitch();

			if (!FlansModClient.controlModeMouse && driver && !(driveable instanceof EntityPlane))
				targetY = targetPitch; //restore broken feature xdd

			float pitchToMove = (targetY - looking.getPitch());
			while (pitchToMove > 180F) { pitchToMove -= 360F; }
			while (pitchToMove <= -180F) { pitchToMove += 360F; }

			//float pitchToMove = (targetY - looking.getPitch()); broken version
			//for(; pitchToMove > 180F; pitchToMove -= 360F) {}
			//for(; pitchToMove <= -180F; pitchToMove += 360F) {}

			float signDeltaY = 0;
			if(pitchToMove > (seatInfo.aimingSpeed.y/20) && seatInfo.legacyAiming == false){
				signDeltaY = 0.1f;
			} else if(pitchToMove < -(seatInfo.aimingSpeed.y/20) && seatInfo.legacyAiming == false){
				signDeltaY = -0.1f;
			} else {
				signDeltaY = 0;
			}

			float newPitch = 0f;


			//Pitches the gun at the last possible moment in order to reach target pitch at the same time as target yaw.
			float minYawToMove = 0f;

			float currentYawToMove = 0f;

			if(seatInfo.latePitch){
				minYawToMove = ((float)Math.sqrt((pitchToMove / seatInfo.aimingSpeed.y)*(pitchToMove / seatInfo.aimingSpeed.y)))*seatInfo.aimingSpeed.x;
			} else {
				minYawToMove = 360f;
			}

			currentYawToMove = (float)Math.sqrt((yawToMove)*(yawToMove));

			if(FlansModClient.controlModeMouse && driveable.hasMouseControlMode() && (seatInfo.legacyAiming == true || (signDeltaY == 0 && deltaY == 0))){
				newPitch = playerLooking.getPitch();
			} else  if ( (Math.abs(pitchToMove) < 2) && seatInfo.yawBeforePitch == false && currentYawToMove < minYawToMove){
				newPitch = looking.getPitch() + signDeltaY*seatInfo.aimingSpeed.y;
			} else if ((Math.abs(pitchToMove) < 2) && seatInfo.yawBeforePitch == true && signDeltaX == 0){
				newPitch = looking.getPitch() + signDeltaY*seatInfo.aimingSpeed.y;
			} else if ((Math.abs(pitchToMove) < 2) && seatInfo.yawBeforePitch == true && signDeltaX != 0){
				newPitch = looking.getPitch();
			}
			//adjustments so faster pitch if large required angle, then slows down for hd movement for last 2 degrees above
			else  if (  seatInfo.yawBeforePitch == false && currentYawToMove < minYawToMove){
				newPitch = looking.getPitch() + 10*signDeltaY*seatInfo.aimingSpeed.y;
			} else if ( seatInfo.yawBeforePitch == true && signDeltaX == 0){
				newPitch = looking.getPitch() + 10*signDeltaY*seatInfo.aimingSpeed.y;
			} else if ( seatInfo.yawBeforePitch == true && signDeltaX != 0){
				newPitch = looking.getPitch();
			}
			else {
				newPitch = looking.getPitch();
			}

			if(newPitch > -seatInfo.minPitch)
				newPitch = -seatInfo.minPitch;
			if(newPitch < -seatInfo.maxPitch)
				newPitch = -seatInfo.maxPitch;

			//Now set the new angles
			looking.setAngles(newYaw, newPitch, 0F);

			//	FlansMod.getPacketHandler().sendToServer(new PacketSeatUpdates(this)); goldsloth says to kill this

			if(signDeltaX != 0 && seatInfo.traverseSounds == true){
				playYawSound = true;
			} else {
				playYawSound = false;
			}

			if(signDeltaY != 0 && seatInfo.yawBeforePitch == false && currentYawToMove < minYawToMove){
				playPitchSound = true;
			} else if (signDeltaY != 0 && seatInfo.yawBeforePitch == true && signDeltaX == 0){
				playPitchSound = true;
			} else {
				playPitchSound = false;
			}

			//Play traverse sounds
			FlansMod.getPacketHandler().sendToServer(new PacketSeatUpdates(this));
		}
	}

	@Override
	public void updateKeyHeldState(int key, boolean held)
	{
		if(worldObj.isRemote && foundDriveable)
		{
			FlansMod.getPacketHandler().sendToServer(new PacketDriveableKeyHeld(key, held));

		}
		if(driver)
		{
			driveable.updateKeyHeldState(key, held);
		}
		else if(key == 9)
		{
			shooting = held;
		}
	}

	@Override
	public boolean pressKey(int key, EntityPlayer player)
	{
		//Driver seat should pass input to driveable
		if(driver && (!worldObj.isRemote || foundDriveable))
		{
			return driveable.pressKey(key, player);
		}

		if(worldObj.isRemote)
		{
			if(foundDriveable)
			{
				FlansMod.getPacketHandler().sendToServer(new PacketDriveableKey(key));
				if(key == 9)
					minigunSpeed += 0.1F;
			}
			return false;
		}

		//Exit key pressed shift get out leave
		if(key == 6 && riddenByEntity != null)
		{
			//(riddenByEntity).setInvisible(false);
			//riddenByEntity.mountEntity(null);
			//System.out.println("exit key did this");

			exitTimer--;
			exitTimer--;
			if(exitTimer>20)
				//riddenByEntity.setInvisible(false);
				//seats[0].riddenByEntity.mountEntity(null);
				return true;

		}


		//labjac seat hotkeys
		if(key == 20 && riddenByEntity != null && (driveable.seats[0].riddenByEntity == null) && PlayerHandler.getPlayerData(player) != null && PlayerHandler.getPlayerData(player).s0 <= 0)
		{
			PlayerHandler.getPlayerData(player).s0=5;
			player.mountEntity(driveable.seats[0]);
		}

		if(key == 21 && riddenByEntity != null && driveable.getDriveableType().numPassengers > 1)
		{
			if((driveable.seats[2].riddenByEntity == null) && PlayerHandler.getPlayerData(player) != null && PlayerHandler.getPlayerData(player).s1 <= 0)
			{
				PlayerHandler.getPlayerData(player).s1=5;
				player.mountEntity(driveable.seats[2]);
			}
		}

		if(key == 22 && riddenByEntity != null && driveable.getDriveableType().numPassengers > 2)
		{
			if((driveable.seats[3].riddenByEntity == null) && PlayerHandler.getPlayerData(player) != null && PlayerHandler.getPlayerData(player).s2 <= 0)
			{
				PlayerHandler.getPlayerData(player).s2=5;
				player.mountEntity(driveable.seats[3]);
			}
		}

		if(key == 23 && riddenByEntity != null && driveable.getDriveableType().numPassengers > 3)
		{
			if((driveable.seats[4].riddenByEntity == null) && PlayerHandler.getPlayerData(player) != null && PlayerHandler.getPlayerData(player).s3 <= 0)
			{
				PlayerHandler.getPlayerData(player).s3=5;
				player.mountEntity(driveable.seats[4]);
			}
		}

		if(key == 24 && riddenByEntity != null && driveable.getDriveableType().numPassengers > 4)
		{
			if((driveable.seats[5].riddenByEntity == null) && PlayerHandler.getPlayerData(player) != null && PlayerHandler.getPlayerData(player).s4 <= 0)
			{
				PlayerHandler.getPlayerData(player).s4=5;
				player.mountEntity(driveable.seats[5]);
			}
		}

		if(key == 25 && riddenByEntity != null && driveable.getDriveableType().numPassengers > 5)
		{
			if((driveable.seats[6].riddenByEntity == null) && PlayerHandler.getPlayerData(player) != null && PlayerHandler.getPlayerData(player).s5 <= 0)
			{
				PlayerHandler.getPlayerData(player).s5=5;
				player.mountEntity(driveable.seats[6]);
			}
		}

		if(key == 26 && riddenByEntity != null && driveable.getDriveableType().numPassengers > 6)
		{
			if((driveable.seats[7].riddenByEntity == null) && PlayerHandler.getPlayerData(player) != null && PlayerHandler.getPlayerData(player).s6 <= 0)
			{
				PlayerHandler.getPlayerData(player).s6=5;
				player.mountEntity(driveable.seats[7]);
			}
		}

		if(key == 27 && riddenByEntity != null && driveable.getDriveableType().numPassengers > 7)
		{
			if((driveable.seats[8].riddenByEntity == null) && PlayerHandler.getPlayerData(player) != null && PlayerHandler.getPlayerData(player).s7 <= 0)
			{
				PlayerHandler.getPlayerData(player).s7=5;
				player.mountEntity(driveable.seats[8]);
			}
		}

		if(key == 28 && riddenByEntity != null && driveable.getDriveableType().numPassengers > 8)
		{
			if((driveable.seats[9].riddenByEntity == null) && PlayerHandler.getPlayerData(player) != null && PlayerHandler.getPlayerData(player).s8 <= 0)
			{
				PlayerHandler.getPlayerData(player).s8=5;
				player.mountEntity(driveable.seats[9]);
			}
		}

		if(key == 29 && riddenByEntity != null && driveable.getDriveableType().numPassengers > 9)
		{
			if((driveable.seats[10].riddenByEntity == null) && PlayerHandler.getPlayerData(player) != null && PlayerHandler.getPlayerData(player).s9 <= 0)
			{
				PlayerHandler.getPlayerData(player).s9=5;
				player.mountEntity(driveable.seats[10]);
			}
		}

		//labjac magical seat switch code
		if(key == 19 && riddenByEntity != null && (driveable.seats[0].riddenByEntity == player || driveable.seats[0].riddenByEntity == null) && PlayerHandler.getPlayerData(player) != null && PlayerHandler.getPlayerData(player).nintendoSwitch <= 0)


			/*
			//timer and null check

			if(PlayerHandler.getPlayerData(player) != null && PlayerHandler.getPlayerData(player).nintendoSwitch <= 0)
		{
			//if(this.seatID < driveable.getDriveableType().numPassengers && nintendoSwitch == 0)

			if(driveable.getDriveableType().numPassengers > 1 && driveable.seats[1].riddenByEntity == player && driveable.seats[2].riddenByEntity == null)
			{
//	(riddenByEntity).setInvisible(false);
	player.mountEntity(driveable.seats[2]);
	PlayerHandler.getPlayerData(player).nintendoSwitch=10;
			}
		else if(driveable.seats[1].riddenByEntity == player)
		{
			player.mountEntity(driveable.seats[0]);
			PlayerHandler.getPlayerData(player).nintendoSwitch=10;
		}

		else if(driveable.getDriveableType().numPassengers > 2 && driveable.seats[2].riddenByEntity == player && driveable.seats[3].riddenByEntity == null)
		{
//(riddenByEntity).setInvisible(false);
player.mountEntity(driveable.seats[3]);
PlayerHandler.getPlayerData(player).nintendoSwitch=10;
		}
	else if(driveable.seats[2].riddenByEntity == player)
	{
		player.mountEntity(driveable.seats[0]);
		PlayerHandler.getPlayerData(player).nintendoSwitch=10;
	}

			else if(driveable.getDriveableType().numPassengers > 3 && driveable.seats[3].riddenByEntity == player && driveable.seats[4].riddenByEntity == null)
			{
//	(riddenByEntity).setInvisible(false);
	player.mountEntity(driveable.seats[4]);
	PlayerHandler.getPlayerData(player).nintendoSwitch=10;
			}
		else if(driveable.seats[3].riddenByEntity == player)
		{
			player.mountEntity(driveable.seats[0]);
			PlayerHandler.getPlayerData(player).nintendoSwitch=10;
		}


			else if(driveable.getDriveableType().numPassengers > 4 && driveable.seats[4].riddenByEntity == player && driveable.seats[5].riddenByEntity == null)
			{
//	(riddenByEntity).setInvisible(false);
	player.mountEntity(driveable.seats[5]);
	PlayerHandler.getPlayerData(player).nintendoSwitch=10;
			}
		else if(driveable.seats[4].riddenByEntity == player)
		{
			player.mountEntity(driveable.seats[0]);
			PlayerHandler.getPlayerData(player).nintendoSwitch=10;
		}


			else if(driveable.getDriveableType().numPassengers > 5 && driveable.seats[5].riddenByEntity == player && driveable.seats[6].riddenByEntity == null)
			{
	//(riddenByEntity).setInvisible(false);
	player.mountEntity(driveable.seats[6]);
	PlayerHandler.getPlayerData(player).nintendoSwitch=10;
			}
		else if(driveable.seats[5].riddenByEntity == player)
		{
			player.mountEntity(driveable.seats[0]);
			PlayerHandler.getPlayerData(player).nintendoSwitch=10;
		}	



			else if(driveable.getDriveableType().numPassengers > 6 && driveable.seats[6].riddenByEntity == player && driveable.seats[7].riddenByEntity == null)
				{
	//	(riddenByEntity).setInvisible(false);
		player.mountEntity(driveable.seats[7]);
		PlayerHandler.getPlayerData(player).nintendoSwitch=10;
				}	
			else if(driveable.seats[6].riddenByEntity == player)
			{
				player.mountEntity(driveable.seats[0]);
				PlayerHandler.getPlayerData(player).nintendoSwitch=10;
			}




			else if(driveable.getDriveableType().numPassengers > 7 && driveable.seats[7].riddenByEntity == player && driveable.seats[8].riddenByEntity == null)
			{
	//(riddenByEntity).setInvisible(false);
	player.mountEntity(driveable.seats[8]);
	PlayerHandler.getPlayerData(player).nintendoSwitch=10;
			}
		else if(driveable.seats[7].riddenByEntity == player)
		{
			player.mountEntity(driveable.seats[0]);
			PlayerHandler.getPlayerData(player).nintendoSwitch=10;
		}


		else if(driveable.getDriveableType().numPassengers > 8 && driveable.seats[8].riddenByEntity == player && driveable.seats[9].riddenByEntity == null)
		{
//(riddenByEntity).setInvisible(false);
player.mountEntity(driveable.seats[9]);
PlayerHandler.getPlayerData(player).nintendoSwitch=10;
		}
	else if(driveable.seats[8].riddenByEntity == player)
	{
		player.mountEntity(driveable.seats[0]);
		PlayerHandler.getPlayerData(player).nintendoSwitch=10;
	}


	else if(driveable.getDriveableType().numPassengers > 9 && driveable.seats[9].riddenByEntity == player && driveable.seats[10].riddenByEntity == null)
	{
//(riddenByEntity).setInvisible(false);
player.mountEntity(driveable.seats[10]);
PlayerHandler.getPlayerData(player).nintendoSwitch=10;
	}
else if(driveable.seats[9].riddenByEntity == player)
{
	player.mountEntity(driveable.seats[0]);
	PlayerHandler.getPlayerData(player).nintendoSwitch=10;
}


else if(driveable.getDriveableType().numPassengers > 10 && driveable.seats[10].riddenByEntity == player && driveable.seats[11].riddenByEntity == null)
{
//(riddenByEntity).setInvisible(false);
player.mountEntity(driveable.seats[11]);
PlayerHandler.getPlayerData(player).nintendoSwitch=11;
}
else if(driveable.seats[10].riddenByEntity == player)
{
player.mountEntity(driveable.seats[0]);
PlayerHandler.getPlayerData(player).nintendoSwitch=10;
}


else if(driveable.getDriveableType().numPassengers > 11 && driveable.seats[11].riddenByEntity == player && driveable.seats[12].riddenByEntity == null)
{
//(riddenByEntity).setInvisible(false);
player.mountEntity(driveable.seats[12]);
PlayerHandler.getPlayerData(player).nintendoSwitch=12;
}
else if(driveable.seats[11].riddenByEntity == player)
{
player.mountEntity(driveable.seats[0]);
PlayerHandler.getPlayerData(player).nintendoSwitch=10;
}

else if(driveable.getDriveableType().numPassengers > 12 && driveable.seats[12].riddenByEntity == player && driveable.seats[13].riddenByEntity == null)
{
//(riddenByEntity).setInvisible(false);
player.mountEntity(driveable.seats[13]);
PlayerHandler.getPlayerData(player).nintendoSwitch=13;
}
else if(driveable.seats[12].riddenByEntity == player)
{
player.mountEntity(driveable.seats[0]);
PlayerHandler.getPlayerData(player).nintendoSwitch=10;
}

			else
			 */
			if(driveable.seats[0].riddenByEntity==null)
			{
				PlayerHandler.getPlayerData(player).nintendoSwitch=10;
				player.mountEntity(driveable.seats[0]);
				driveable.nintendoSwitchLite=10;

			}
		//}


		if(key == 9) //Shoot
		{
			//Get the gun from the plane type and the ammo from the data
			GunType gun = seatInfo.gunType;

			minigunSpeed += 0.1F;

			if(gun != null && gun.mode != EnumFireMode.MINIGUN || minigunSpeed > 2F)
			{
				if(gunDelay <= 0 && TeamsManager.bulletsEnabled && driveable.getDriveableData().ammo[seatInfo.gunnerID] != null)
				{

					ItemStack bulletItemStack = driveable.getDriveableData().ammo[seatInfo.gunnerID];
					//Check that neither is null and that the bullet item is actually a bullet, also check if universal pacifism is enforced
					if(gun != null && bulletItemStack != null && bulletItemStack.getItem() instanceof ItemShootable && TeamsManager.violence==false)
					{
						ShootableType bullet = ((ItemShootable)bulletItemStack.getItem()).type;
						if(gun.isAmmo(bullet))
						{
							//Gun origin
							Vector3f gunOrigin = Vector3f.add(driveable.axes.findLocalVectorGlobally(seatInfo.gunOrigin), new Vector3f(driveable.posX, driveable.posY, driveable.posZ), null);
							//Calculate the look axes globally
							RotatedAxes globalLookAxes = driveable.axes.findLocalAxesGlobally(looking);
							Vector3f shootVec = driveable.axes.findLocalVectorGlobally(looking.getXAxis());
							//Calculate the origin of the bullets
							Vector3f yOffset = driveable.axes.findLocalVectorGlobally(new Vector3f(0F, (float)player.getMountedYOffset(), 0F));
							//Spawn a new bullet item
							if(this.seatInfo.barrels==1)
								worldObj.spawnEntityInWorld(((ItemShootable)bulletItemStack.getItem()).getEntity(worldObj, Vector3f.add(yOffset, new Vector3f(gunOrigin.x, gunOrigin.y, gunOrigin.z), null), shootVec, (EntityLivingBase)riddenByEntity, gun.bulletSpread, gun.damage, gun.bulletSpeed, bulletItemStack.getItemDamage(), driveable.getDriveableType()));

							//labjac battleship epic style
							if(this.seatInfo.barrels==2)
							{
								worldObj.spawnEntityInWorld(((ItemShootable)bulletItemStack.getItem()).getEntity(worldObj, Vector3f.add(yOffset, new Vector3f((gunOrigin.x-shootVec.z*(seatInfo.barrelSpread/2)), gunOrigin.y, (gunOrigin.z-shootVec.x*(seatInfo.barrelSpread/2))), null), shootVec, (EntityLivingBase)riddenByEntity, gun.bulletSpread, gun.damage, gun.bulletSpeed, bulletItemStack.getItemDamage(), driveable.getDriveableType()));
								worldObj.spawnEntityInWorld(((ItemShootable)bulletItemStack.getItem()).getEntity(worldObj, Vector3f.add(yOffset, new Vector3f((gunOrigin.x+shootVec.z*(seatInfo.barrelSpread/2)), gunOrigin.y, (gunOrigin.z+shootVec.x*(seatInfo.barrelSpread/2))), null), shootVec, (EntityLivingBase)riddenByEntity, gun.bulletSpread, gun.damage, gun.bulletSpeed, bulletItemStack.getItemDamage(), driveable.getDriveableType()));
							}

							if(this.seatInfo.barrels==3)
							{
								worldObj.spawnEntityInWorld(((ItemShootable)bulletItemStack.getItem()).getEntity(worldObj, Vector3f.add(yOffset, new Vector3f((gunOrigin.x-shootVec.z*(seatInfo.barrelSpread)), gunOrigin.y, (gunOrigin.z-shootVec.x*(seatInfo.barrelSpread))), null), shootVec, (EntityLivingBase)riddenByEntity, gun.bulletSpread, gun.damage, gun.bulletSpeed, bulletItemStack.getItemDamage(), driveable.getDriveableType()));
								worldObj.spawnEntityInWorld(((ItemShootable)bulletItemStack.getItem()).getEntity(worldObj, Vector3f.add(yOffset, new Vector3f(gunOrigin.x, gunOrigin.y, gunOrigin.z), null), shootVec, (EntityLivingBase)riddenByEntity, gun.bulletSpread, gun.damage, gun.bulletSpeed, bulletItemStack.getItemDamage(), driveable.getDriveableType()));
								worldObj.spawnEntityInWorld(((ItemShootable)bulletItemStack.getItem()).getEntity(worldObj, Vector3f.add(yOffset, new Vector3f((gunOrigin.x+shootVec.z*(seatInfo.barrelSpread)), gunOrigin.y, (gunOrigin.z+shootVec.x*(seatInfo.barrelSpread))), null), shootVec, (EntityLivingBase)riddenByEntity, gun.bulletSpread, gun.damage, gun.bulletSpeed, bulletItemStack.getItemDamage(), driveable.getDriveableType()));
							}

							if(this.seatInfo.barrels==4)
							{
								worldObj.spawnEntityInWorld(((ItemShootable)bulletItemStack.getItem()).getEntity(worldObj, Vector3f.add(yOffset, new Vector3f((gunOrigin.x-shootVec.z*(seatInfo.barrelSpread/2)), gunOrigin.y, (gunOrigin.z-shootVec.x*(seatInfo.barrelSpread/2))), null), shootVec, (EntityLivingBase)riddenByEntity, gun.bulletSpread, gun.damage, gun.bulletSpeed, bulletItemStack.getItemDamage(), driveable.getDriveableType()));
								worldObj.spawnEntityInWorld(((ItemShootable)bulletItemStack.getItem()).getEntity(worldObj, Vector3f.add(yOffset, new Vector3f((gunOrigin.x+shootVec.z*(seatInfo.barrelSpread/2)), gunOrigin.y, (gunOrigin.z+shootVec.x*(seatInfo.barrelSpread/2))), null), shootVec, (EntityLivingBase)riddenByEntity, gun.bulletSpread, gun.damage, gun.bulletSpeed, bulletItemStack.getItemDamage(), driveable.getDriveableType()));
								worldObj.spawnEntityInWorld(((ItemShootable)bulletItemStack.getItem()).getEntity(worldObj, Vector3f.add(yOffset, new Vector3f((gunOrigin.x-shootVec.z*(1.5*seatInfo.barrelSpread)), gunOrigin.y, (gunOrigin.z-shootVec.x*(seatInfo.barrelSpread/2))), null), shootVec, (EntityLivingBase)riddenByEntity, gun.bulletSpread, gun.damage, gun.bulletSpeed, bulletItemStack.getItemDamage(), driveable.getDriveableType()));
								worldObj.spawnEntityInWorld(((ItemShootable)bulletItemStack.getItem()).getEntity(worldObj, Vector3f.add(yOffset, new Vector3f((gunOrigin.x+shootVec.z*(1.5*seatInfo.barrelSpread)), gunOrigin.y, (gunOrigin.z+shootVec.x*(seatInfo.barrelSpread/2))), null), shootVec, (EntityLivingBase)riddenByEntity, gun.bulletSpread, gun.damage, gun.bulletSpeed, bulletItemStack.getItemDamage(), driveable.getDriveableType()));
							}

							if(this.seatInfo.barrels==5)
							{
								worldObj.spawnEntityInWorld(((ItemShootable)bulletItemStack.getItem()).getEntity(worldObj, Vector3f.add(yOffset, new Vector3f((gunOrigin.x-shootVec.z*(seatInfo.barrelSpread)), gunOrigin.y, (gunOrigin.z-shootVec.x*(seatInfo.barrelSpread))), null), shootVec, (EntityLivingBase)riddenByEntity, gun.bulletSpread, gun.damage, gun.bulletSpeed, bulletItemStack.getItemDamage(), driveable.getDriveableType()));
								worldObj.spawnEntityInWorld(((ItemShootable)bulletItemStack.getItem()).getEntity(worldObj, Vector3f.add(yOffset, new Vector3f(gunOrigin.x, gunOrigin.y, gunOrigin.z), null), shootVec, (EntityLivingBase)riddenByEntity, gun.bulletSpread, gun.damage, gun.bulletSpeed, bulletItemStack.getItemDamage(), driveable.getDriveableType()));
								worldObj.spawnEntityInWorld(((ItemShootable)bulletItemStack.getItem()).getEntity(worldObj, Vector3f.add(yOffset, new Vector3f((gunOrigin.x+shootVec.z*(seatInfo.barrelSpread)), gunOrigin.y, (gunOrigin.z+shootVec.x*(seatInfo.barrelSpread))), null), shootVec, (EntityLivingBase)riddenByEntity, gun.bulletSpread, gun.damage, gun.bulletSpeed, bulletItemStack.getItemDamage(), driveable.getDriveableType()));
								worldObj.spawnEntityInWorld(((ItemShootable)bulletItemStack.getItem()).getEntity(worldObj, Vector3f.add(yOffset, new Vector3f((gunOrigin.x+shootVec.z*(seatInfo.barrelSpread)), gunOrigin.y, (gunOrigin.z+2*shootVec.x*(seatInfo.barrelSpread))), null), shootVec, (EntityLivingBase)riddenByEntity, gun.bulletSpread, gun.damage, gun.bulletSpeed, bulletItemStack.getItemDamage(), driveable.getDriveableType()));
								worldObj.spawnEntityInWorld(((ItemShootable)bulletItemStack.getItem()).getEntity(worldObj, Vector3f.add(yOffset, new Vector3f((gunOrigin.x+shootVec.z*(seatInfo.barrelSpread)), gunOrigin.y, (gunOrigin.z-2*shootVec.x*(seatInfo.barrelSpread))), null), shootVec, (EntityLivingBase)riddenByEntity, gun.bulletSpread, gun.damage, gun.bulletSpeed, bulletItemStack.getItemDamage(), driveable.getDriveableType()));
							}
							//fuck you tillman
							if(this.seatInfo.barrels==6)
							{
								worldObj.spawnEntityInWorld(((ItemShootable)bulletItemStack.getItem()).getEntity(worldObj, Vector3f.add(yOffset, new Vector3f((gunOrigin.x-shootVec.z*(seatInfo.barrelSpread/2)), gunOrigin.y, (gunOrigin.z-shootVec.x*(seatInfo.barrelSpread/2))), null), shootVec, (EntityLivingBase)riddenByEntity, gun.bulletSpread, gun.damage, gun.bulletSpeed, bulletItemStack.getItemDamage(), driveable.getDriveableType()));
								worldObj.spawnEntityInWorld(((ItemShootable)bulletItemStack.getItem()).getEntity(worldObj, Vector3f.add(yOffset, new Vector3f((gunOrigin.x+shootVec.z*(seatInfo.barrelSpread/2)), gunOrigin.y, (gunOrigin.z+shootVec.x*(seatInfo.barrelSpread/2))), null), shootVec, (EntityLivingBase)riddenByEntity, gun.bulletSpread, gun.damage, gun.bulletSpeed, bulletItemStack.getItemDamage(), driveable.getDriveableType()));
								worldObj.spawnEntityInWorld(((ItemShootable)bulletItemStack.getItem()).getEntity(worldObj, Vector3f.add(yOffset, new Vector3f((gunOrigin.x-shootVec.z*(1.5*seatInfo.barrelSpread)), gunOrigin.y, (gunOrigin.z-shootVec.x*(seatInfo.barrelSpread/2))), null), shootVec, (EntityLivingBase)riddenByEntity, gun.bulletSpread, gun.damage, gun.bulletSpeed, bulletItemStack.getItemDamage(), driveable.getDriveableType()));
								worldObj.spawnEntityInWorld(((ItemShootable)bulletItemStack.getItem()).getEntity(worldObj, Vector3f.add(yOffset, new Vector3f((gunOrigin.x+shootVec.z*(1.5*seatInfo.barrelSpread)), gunOrigin.y, (gunOrigin.z+shootVec.x*(seatInfo.barrelSpread/2))), null), shootVec, (EntityLivingBase)riddenByEntity, gun.bulletSpread, gun.damage, gun.bulletSpeed, bulletItemStack.getItemDamage(), driveable.getDriveableType()));
								worldObj.spawnEntityInWorld(((ItemShootable)bulletItemStack.getItem()).getEntity(worldObj, Vector3f.add(yOffset, new Vector3f((gunOrigin.x-shootVec.z*(2.5*seatInfo.barrelSpread)), gunOrigin.y, (gunOrigin.z-shootVec.x*(seatInfo.barrelSpread/2))), null), shootVec, (EntityLivingBase)riddenByEntity, gun.bulletSpread, gun.damage, gun.bulletSpeed, bulletItemStack.getItemDamage(), driveable.getDriveableType()));
								worldObj.spawnEntityInWorld(((ItemShootable)bulletItemStack.getItem()).getEntity(worldObj, Vector3f.add(yOffset, new Vector3f((gunOrigin.x+shootVec.z*(2.5*seatInfo.barrelSpread)), gunOrigin.y, (gunOrigin.z+shootVec.x*(seatInfo.barrelSpread/2))), null), shootVec, (EntityLivingBase)riddenByEntity, gun.bulletSpread, gun.damage, gun.bulletSpeed, bulletItemStack.getItemDamage(), driveable.getDriveableType()));
							}

							//Play the shoot sound
							if(soundDelay <= 0)
							{
								//float range = FlansMod.soundRange;
								//if(driveable != null && driveable.type!= null && driveable.type.epicShip) //automatic longer range battleship noises
									//range = 240;
								PacketPlaySound.sendSoundPacket(posX, posY, posZ, 200, dimension, gun.shootSound, false);
								soundDelay = gun.shootSoundLength;
							}
							//Get the bullet item damage and increment it
							int damage = bulletItemStack.getItemDamage();
							if(!((EntityPlayer)riddenByEntity).capabilities.isCreativeMode)
								bulletItemStack.setItemDamage(damage + 1);

							//System.out.println("stack size outside of stack killer" + driveable.getDriveableData().ammo[seatInfo.gunnerID].stackSize);
							//If the bullet item is completely damaged (empty)
							if(damage >= bulletItemStack.getMaxDamage())
							{
								//Set the damage to 0 and consume one ammo item (unless in creative)
								if(((EntityPlayer)riddenByEntity).capabilities.isCreativeMode)
								{
									//refills ammo in creative
									bulletItemStack.setItemDamage(0);
								}
								else
								{
									//	System.out.println("stack size within no creative" + driveable.getDriveableData().ammo[seatInfo.gunnerID].stackSize);
									//driveable.getDriveableData().ammo[seatInfo.gunnerID] = null;
									driveable.getDriveableData().ammo[seatInfo.gunnerID].stackSize--;
									bulletItemStack.setItemDamage(0);
									if(driveable.getDriveableData().ammo[seatInfo.gunnerID].stackSize<=0)
									{
										//kill it if last magazine consumed
										driveable.getDriveableData().ammo[seatInfo.gunnerID] = null;
									}
								}
							}
							//Reset the shoot delay
							gunDelay = (int)gun.shootDelay;
						}
					}
				}
			}
		}
		return false;
	}

	@Override
	public boolean interactFirst(EntityPlayer entityplayer) //interact : change back when Forge updates
	{
		if(isDead)
			return false;
		if(worldObj.isRemote)
			return false;

		//play the tutorial shit if entering driver seat
		if(this.seatID==0)
		{
			FlansMod.proxy.doTutorialStuff(entityplayer, this.driveable);
			}


		//If they are using a repair tool, don't put them in
		ItemStack currentItem = entityplayer.getCurrentEquippedItem();
		if(currentItem != null && currentItem.getItem() instanceof ItemTool && ((ItemTool)currentItem.getItem()).type.healDriveables)
			return true;
		if(currentItem != null && currentItem.getItem() instanceof ItemTool && ((ItemTool)currentItem.getItem()).type.key)
			return true;
		//so swordsmen do not enter seats accidentally when right clicking
		if(currentItem != null && currentItem.getItem() instanceof ItemGun && ((ItemGun)currentItem.getItem()).type.shootMelee)
			return true;
		if(!this.seatInfo.enterable)
			return true;

		/*
		//prevents hijacking if driver is in seat 2 (gun or bomb sight "seat")
		if(driveable.getDriveableType().numPassengers > 0 && driveable.seats[1].riddenByEntity != null && driveable.seats[0].riddenByEntity == null && this.seatID == 0)
			return true;
		//or vice versa
		if(driveable.getDriveableType().numPassengers > 0 && driveable.seats[1].riddenByEntity == null && driveable.seats[0].riddenByEntity != null && this.seatID == 1)
			return true;
		 */

		if(currentItem != null && currentItem.getItem() instanceof ItemPlane && (this.seatInfo.carrier || this.seatInfo.helipad || this.seatInfo.hardpoint) )
		{

			if(currentItem.getItem() instanceof ItemPlane) //paranoid extra null check
			{
				ItemPlane plane = (ItemPlane)currentItem.getItem();

				PlaneType type = plane.type;
				if(type.mass < this.driveable.getDriveableType().weightLimit) //weight check
				{
					if (type.helipadLandable || (type.carrierLandable && this.seatInfo.carrier) || (type.parasitePlane && this.seatInfo.hardpoint)) //deploy carrier plane
					{
						if(!worldObj.isRemote)
						{
							DriveableData data = plane.getPlaneData(currentItem, worldObj);
							if(data != null)
								worldObj.spawnEntityInWorld(new EntityPlane(worldObj, this.posX + 0.5F, this.posY + 2.5F, this.posZ + 0.5F, entityplayer, type, data, false)); 
						}//the extra false at end marks this as NOT a landplaced plane   I did this so it wont want to be sucked into a seat 20m away and start vibrating like a dildo
						if(!entityplayer.capabilities.isCreativeMode)
						{
							currentItem.stackSize--;
						}
					}
					else if (type.carrierLandable && this.seatInfo.helipad)
					{
						entityplayer.addChatMessage(new ChatComponentText("This carrier slot can only handle Helicopters, VTOL Planes or Seaplanes" ));
					}
					else if (type.carrierLandable || type.helipadLandable && this.seatInfo.hardpoint)
					{
						entityplayer.addChatMessage(new ChatComponentText("This slot can only handle parasite aircraft" ));
					}
				}
				else if ( (type.carrierLandable || type.helipadLandable) && type.mass < 1.5f*this.driveable.getDriveableType().weightLimit) //give suggestion that doolittle raid is possible if loaded from land
				{
					entityplayer.addChatMessage(new ChatComponentText("This plane ("+ type.mass + " kg) is too heavy to properly operate on this carrier! (" + this.driveable.getDriveableType().weightLimit + " kg Weight Limit)" ));
					entityplayer.addChatMessage(new ChatComponentText( "However, you CAN launch it: Park the carrier near land and place the plane nearby to load it onto the deck" ));
					entityplayer.addChatMessage(new ChatComponentText( "Also, you will not be able to land back on the carrier after takeoff" ));
				}
				else if (!type.carrierLandable && !type.helipadLandable && this.seatInfo.carrier && type.mass < 1.5f*this.driveable.getDriveableType().weightLimit)
				{ //doolittle raid messages for land-based plane
					entityplayer.addChatMessage(new ChatComponentText("This aircraft is not meant to operate on carriers, however it CAN take off for a one-way trip!" ));
					entityplayer.addChatMessage(new ChatComponentText("Park the carrier near land and place the aircraft nearby to load it onto the deck" ));
				}
				else // if above 1.5x weight limit, dont even bother
					entityplayer.addChatMessage(new ChatComponentText("This plane ("+ type.mass + " kg) is way too heavy for this carrier (" + this.driveable.getDriveableType().weightLimit + " kg Weight Limit)" ));


			}
			return true; //dont let human mount 
		}

		if(currentItem != null && currentItem.getItem() instanceof ItemLead)
		{
			if(riddenByEntity != null && riddenByEntity instanceof EntityLiving && !(riddenByEntity instanceof EntityPlayer))
			{
				EntityLiving mob = (EntityLiving)riddenByEntity;
				riddenByEntity.mountEntity(null);
				//	System.out.println("leash key did this");
				mob.setLeashedToEntity(entityplayer, true);
				return true;
			}
			double checkRange = 10;
			List nearbyMobs = worldObj.getEntitiesWithinAABB(EntityLiving.class, AxisAlignedBB.getBoundingBox(posX - checkRange, posY - checkRange, posZ - checkRange, posX + checkRange, posY + checkRange, posZ + checkRange));

			for(Object obj : nearbyMobs)
			{
				EntityLiving entity = (EntityLiving)obj;
				if(entity.getLeashed() && entity.getLeashedToEntity() == entityplayer && !driveable.locked)
				{
					entity.mountEntity(this);
					looking.setAngles(-entity.rotationYaw, entity.rotationPitch, 0F);
					entity.clearLeashed(true, !entityplayer.capabilities.isCreativeMode);
				}
			}

			return true;

		}

		//Put them in the seat or pick the lock
		if(riddenByEntity == null) {
			if(driveable.owner == null || driveable.owner.getMembersOfRankAndAbove(PermLevel.PLEBEIAN).contains(entityplayer.getDisplayName())){
				entityplayer.mountEntity(this);
				if(driveable.owner == null)
					driveable.owner = Factions.getFactionFromPlayer(entityplayer);
				return true;
			} else if(!driveable.locked) {
				entityplayer.mountEntity(this);
				if(!driveable.stolen && driver) {
					driveable.stolen = true;
					driveable.owner.removeTransportVehicle(driveable);
					driveable.owner = Factions.getFactionFromPlayer(entityplayer);
				}
				return true;
			} else {
				int time = 5;
				if(driveable.unlocks.containsKey(entityplayer.getDisplayName()))
					time += driveable.unlocks.get(entityplayer.getDisplayName());

				driveable.unlocks.put(entityplayer.getDisplayName(), time);
				if(time > driveable.timeToUnlock) {
					driveable.unlock(entityplayer);
				}

				return true;
			}
		}
		return false;
	}

	@Override
	public Entity getControllingEntity(){
		return riddenByEntity;
	}

	@Override
	public boolean isDead(){
		return isDead;
	}

	public boolean getInvincible(){
		return seatInfo.invincible;
	}

	@Override
	public void setDead(){
		super.setDead();
	}

	/**
	@Override
    public void updateRiderPosition()
    {
		if(riddenByEntity == null || (worldObj.isRemote && !foundDriveable))
        {
            return;
        } else
        {
        	DriveableType type = driveable.getDriveableType();
			Vec3 yOffset = driveable.rotate(0, riddenByEntity.getYOffset(), 0).toVec3();



			return;
        }
    }
	 **/


	@Override
	public ItemStack getPickedResult(MovingObjectPosition target)
	{
		if(worldObj.isRemote && !foundDriveable)
			return null;
		return driveable.getPickedResult(target);
	}

	@Override
	public float getPlayerRoll()
	{
		for(; playerRoll - prevPlayerRoll > 180F; playerRoll -= 360F) ;
		for(; playerRoll - prevPlayerRoll < -180F; playerRoll += 360F) ;
		return playerRoll;
	}

	@Override
	public float getCameraDistance()
	{
		return foundDriveable && seatID == 0 ? driveable.getDriveableType().cameraDistance : 5F;
	}

	@Override
	public boolean attackEntityFrom(DamageSource source, float f) {

		if(seatInfo != null &&  !(seatInfo.hardpoint || seatInfo.helipad || seatInfo.carrier) && (seatInfo.id!=0 || driveable.getDriveableType().hijackablePilot) ) //no hijacking pilot
		{
			if (this.riddenByEntity != null)
			{
				if(this.exitTimer > 0)
					FlansMod.getPacketHandler().sendToAllAround(new PacketPlaySound(this.posX, this.posY , this.posZ, "woodHit"),this.posX, this.posY , this.posZ, 25, this.dimension);
				else if (exitTimer <= 5)
					FlansMod.getPacketHandler().sendToAllAround(new PacketPlaySound(this.posX, this.posY , this.posZ, "woodBreak"),this.posX, this.posY , this.posZ, 25, this.dimension); //different sound when near breaking point

				FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("crit",this.posX, this.posY, this.posZ , 0,0,0),this.posX, this.posY , this.posZ, 25, this.dimension);

				exitTimer -= 5; //force people out of seat violently

				//force sound to work?
				FlansMod.getPacketHandler().sendToServer(new PacketSeatUpdates(this));
				return false;
			}
			else


				//return !(worldObj.isRemote && !foundDriveable) && driveable.attackEntityFrom(source, f);
				return false; //actually, i dont want you to item a vehicle after punching driver out




		}
		else
			return false; //do not count as an attack if its a carrier seat
	}



	@Override
	public void writeSpawnData(ByteBuf data)
	{
		data.writeInt(driveableID);
		data.writeInt(seatInfo.id);
	}

	@Override
	public void readSpawnData(ByteBuf data)
	{
		driveableID = data.readInt();
		driveable = (EntityDriveable)worldObj.getEntityByID(driveableID);
		seatID = data.readInt();
		driver = seatID == 0;
		if(driveable != null)
		{
			seatInfo = driveable.getDriveableType().seats[seatID];
			looking.setAngles((seatInfo.minYaw + seatInfo.maxYaw) / 2, 0F, 0F);
			playerPosX = prevPlayerPosX = posX = driveable.posX;
			playerPosY = prevPlayerPosY = posY = driveable.posY;
			playerPosZ = prevPlayerPosZ = posZ = driveable.posZ;
			setPosition(posX, posY, posZ);
		}

	}

	public float getMinigunSpeed()
	{
		return minigunSpeed;
	}
/* too hard to bullshit this part. yall have to uncomment it in your build weeder.   Also make sure not to activate the overlay for people who are riding a seat so pilot wont get blinded by this
	@Override
	@SideOnly(Side.CLIENT)
	public void printHook(Pre event, World world, int x, int y, int z) { 
		List<String> text = new ArrayList<>();
		if(!foundDriveable)
			return;
		String faction = driveable.ownerName;
		boolean ownedByPlayerFaction = false;

		text.add(EnumChatFormatting.YELLOW + "" + EnumChatFormatting.BOLD + (driver ? "Driver" : "Passenger") + " seat");

		if(driveable.ownerName != null ) {
			String own = Factions.getFactionFromPlayer(Minecraft.getMinecraft().thePlayer) == null ? "Wilderness" : Factions.getFactionFromPlayer(Minecraft.getMinecraft().thePlayer).getName();
			if(faction != null && !faction.equals("None") && !faction.isEmpty()) {
				if(faction.equals(own)) {
					faction = EnumChatFormatting.GREEN + faction;
					ownedByPlayerFaction = true;
				} else if(FactionRelations.relations.containsKey(new Pair<>(faction,own))) {
					faction = FactionRelations.relations.get(new Pair<>(faction,own)).color + faction;
				} else if(FactionRelations.relations.containsKey(new Pair<>(own,faction))) {
					faction = FactionRelations.relations.get(new Pair<>(own,faction)).color + faction;
				} else faction = EnumChatFormatting.YELLOW + faction;
			} else {
				faction += EnumChatFormatting.DARK_GRAY;
				ownedByPlayerFaction = true;
			}
		} 
		text.add(((driveable.stolen && !faction.equals("None")) ? "Stolen by " : "Owner: ") + faction);
		text.add(((ownedByPlayerFaction != driveable.locked) ? EnumChatFormatting.RED : EnumChatFormatting.GREEN) + (driveable.locked ? "Locked" : "Unlocked"));
		if(driveable.stolen)
			text.add((ownedByPlayerFaction ? EnumChatFormatting.RED : EnumChatFormatting.GREEN) + "Stolen");
		else if(!ownedByPlayerFaction) {
			text.add(EnumChatFormatting.DARK_RED + "Hold right click to steal");
			if(driveable.unlocks.containsKey(Minecraft.getMinecraft().thePlayer.getDisplayName())) {
				text.add(EnumChatFormatting.DARK_GRAY + "Progress: " + Math.round(100*Math.min(1,((double)driveable.unlocks.get(Minecraft.getMinecraft().thePlayer.getDisplayName())) / (double) driveable.timeToUnlock)) + "%");
			}
		}
		if((!driveable.locked || ownedByPlayerFaction) && seatInfo.enterable && riddenByEntity == null) {
			text.add(EnumChatFormatting.GREEN + "Use right click to enter");
		}
		ILookOverlay.printGeneric(event, driveable.getDriveableType().name, 0xffff00, 0x404000, text);
	} */
}