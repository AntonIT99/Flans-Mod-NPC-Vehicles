package com.flansmod.common.driveables;

import net.minecraft.client.Minecraft;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemSign;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.client.event.RenderPlayerEvent;

import java.util.ArrayList;
import java.util.List;

import org.lwjgl.input.Keyboard;

import com.flansmod.client.KeyInputHandler;
import com.flansmod.client.model.animation.AnimationController;
import com.flansmod.common.FlansMod;
import com.flansmod.common.PlayerData;
import com.flansmod.common.PlayerHandler;
import com.flansmod.common.RotatedAxes;
import com.flansmod.common.driveables.mechas.EntityMecha;
import com.flansmod.common.guns.EntityBullet;
import com.flansmod.common.network.PacketCurrentMissile;
import com.flansmod.common.network.PacketDriveableControl;
import com.flansmod.common.network.PacketDriveableKey;
import com.flansmod.common.network.PacketFlak;
import com.flansmod.common.network.PacketParticle;
import com.flansmod.common.network.PacketPlaneAnimator;
import com.flansmod.common.network.PacketPlaneControl;
import com.flansmod.common.network.PacketPlaySound;
import com.flansmod.common.network.PacketVehicleControl;
import com.flansmod.common.teams.TeamsManager;
import com.flansmod.common.tools.ItemTool;
import com.flansmod.common.vector.Matrix4f;
import com.flansmod.common.vector.Vector3f;
import com.hfr.faction.Factions;
import com.hfr.faction.IFaction;
import com.jcraft.jorbis.Block;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent.KeyInputEvent;
import cpw.mods.fml.common.network.internal.FMLNetworkHandler;

public class EntityPlane extends EntityDriveable
{
	/** The flap positions, used for renderering and for controlling the plane rotations */
	public float flapsYaw, flapsPitchLeft, flapsPitchRight;
	/** Position of looping engine sound */
	public int soundPosition;

	/** Weapon delays */
	public int bombDelay, gunDelay;
	/** Despawn timer */
	public int ticksSinceUsed = 0;
	/** Mostly aesthetic model variables. Gear actually has a variable hitbox */
	public boolean varGear = true, varDoor = false, varWing = false, varFlap = false; //var flap to prevent conflict with varwing
	public boolean doorsHaveShut = false;
	/** Delayer for gear, door and wing buttons */
	public int toggleTimer = 0;
	public int carrierTimer = 0;
	/** Current plane mode */
	public EnumPlaneMode mode;
	//labjac radar range key
	public boolean combatRadar = false;

	public int exitTimer = 5   ;



	public int accidentRange = 2; //size of radius that is considered a kaikaze collision

	//Animation positions
	public Vector3f wingPos = new Vector3f(0,0,0);
	public Vector3f wingRot = new Vector3f(0,0,0);
	public Vector3f wingWheelPos = new Vector3f(0,0,0);
	public Vector3f wingWheelRot = new Vector3f(0,0,0);
	public Vector3f coreWheelPos = new Vector3f(0,0,0);
	public Vector3f coreWheelRot = new Vector3f(0,0,0);
	public Vector3f tailWheelPos = new Vector3f(0,0,0);
	public Vector3f tailWheelRot = new Vector3f(0,0,0);
	public Vector3f doorPos = new Vector3f(0,0,0);
	public Vector3f doorRot = new Vector3f(0,0,0);



	//Duplicate positions for smoothness
	public Vector3f prevWingPos = new Vector3f(0,0,0);
	public Vector3f prevWingRot = new Vector3f(0,0,0);
	public Vector3f prevWingWheelPos = new Vector3f(0,0,0);
	public Vector3f prevWingWheelRot = new Vector3f(0,0,0);
	public Vector3f prevCoreWheelPos = new Vector3f(0,0,0);
	public Vector3f prevCoreWheelRot = new Vector3f(0,0,0);
	public Vector3f prevTailWheelPos = new Vector3f(0,0,0);
	public Vector3f prevTailWheelRot = new Vector3f(0,0,0);
	public Vector3f prevDoorPos = new Vector3f(0,0,0);
	public Vector3f prevDoorRot = new Vector3f(0,0,0);
	public float xSpeed = 0;
	public float ySpeed = 0;
	public float zSpeed = 0;
	public float rollSpeed = 0;
	public FlightController control = new FlightController();
	public AnimationController anim = new AnimationController();
	public boolean initiatedAnim = false;
	//labjac shitty radar flag copy
	public boolean radarVisible;
	public boolean hasPlaneRadar;
	public float radarRange;
	public int radarPositionOffset;
	public int radarRefreshDelay;

	public boolean digitalRadar=false;
	public boolean isHeli = false;

	public boolean landPlace = true; //can secretly be set to false by carriers so carrier plane wont want to hook up 20m away

	public int slbmFlightType;
	public int slbmDelay;
	public int slbmRange;
	public int slbmStrength;
	public int slbmWarheadType;
	private float radarDetectionRangeMultiplier = 1f;
	//so you wont hear two sonic booms from one plane passing
	private int poopooTimer;

	//for testing seatkick
	private int testerino = 0;
	private int stukaSoundDelay = 0;




	public EntityPlane(World world){
		super(world);
	}

	public EntityPlane(World world, double x, double y, double z, PlaneType type, DriveableData data){
		super(world, type, data);
		setPosition(x, y, z);
		prevPosX = x;
		prevPosY = y;
		prevPosZ = z;
		initType(type, false);
	}

	public EntityPlane(World world, double x, double y, double z, float yaw, float pitch, float roll, PlaneType type, DriveableData data) /*angled spawner*/{
		super(world, type, data);
		rotateYaw(yaw + 90F);
		rotatePitch(pitch);
		rotateRoll(roll);
		setPosition(x, y, z);
		prevPosX = x;
		prevPosY = y;
		prevPosZ = z;
		initType(type, false);
	}

	public EntityPlane(World world, double x, double y, double z, EntityPlayer placer, PlaneType type, DriveableData data){
		this(world, x, y + 90/16F, z, type, data);
		rotateYaw(placer.rotationYaw + 90F);
		rotatePitch(type.restingPitch);
	}

	//spawnedbyCarrier
	public EntityPlane(World world, double x, double y, double z, EntityPlayer placer, PlaneType type, DriveableData data, Boolean landPlaced){
		this(world, x, y + 90/16F, z, type, data);
		rotateYaw(placer.rotationYaw + 90F);
		rotatePitch(type.restingPitch);
		landPlace = landPlaced;
	}

	public EntityPlane setOwner(IFaction to) {
		owner = to;
		return this;
	}


	@Override
	public void initType(DriveableType type, boolean clientSide)
	{

		fuelTimer = type.fuelTimer;
		labjacFuel = type.labjacFuel;
		radarVisible=type.radarVisible;
		hasPlaneRadar=type.hasPlaneRadar;
		digitalRadar=type.digitalRadar;
		radarDetectionRangeMultiplier=type.radarDetectionRangeMultiplier;
		radarRange=type.radarRange;
		radarPositionOffset=type.radarPositionOffset;
		radarRefreshDelay=type.radarRefreshDelay;
		//labjac attempts to shoehorn in the radar flags
		slbmFlightType=type.slbmFlightType;
		slbmDelay=type.slbmDelay;
		slbmRange=type.slbmRange;
		slbmStrength=type.slbmStrength;
		slbmWarheadType=type.slbmWarheadType;
		//slbm shoehorn
		super.initType(type, clientSide);

		mode = (((PlaneType)type).mode == EnumPlaneMode.HELI ? EnumPlaneMode.HELI : EnumPlaneMode.PLANE);
		if((((PlaneType)type).mode == EnumPlaneMode.VTOL)){
			mode = EnumPlaneMode.HELI;
			isHeli = true;

		}
		else isHeli = false;
	}

	@Override
	protected void writeEntityToNBT(NBTTagCompound tag)
	{
		super.writeEntityToNBT(tag);
		tag.setTag("Pos", this.newDoubleNBTList(this.posX, this.posY + 1D, this.posZ));
		tag.setBoolean("VarGear", varGear);
		tag.setBoolean("VarDoor", varDoor);
		tag.setBoolean("VarWing", varWing);
	}

	@Override
	protected void readEntityFromNBT(NBTTagCompound tag)
	{
		super.readEntityFromNBT(tag);
		varGear = tag.getBoolean("VarGear");
		varDoor = tag.getBoolean("VarDoor");
		varWing = tag.getBoolean("VarWing");
	}


	//punjab render attempt
	@Override
	public boolean isInRangeToRenderDist(double d)
	{
		double d1 = 900D;
		return d < d1 * d1;
	}


	//thermal glow attempt
	public int getBrightnessForRender(float par1)
	{
		if(Minecraft.getMinecraft().entityRenderer.isShaderActive())
		{
			return 15728880;
		}
		else
		{
			int i = MathHelper.floor_double(this.posX);
			int j = MathHelper.floor_double(this.posZ);

			if (this.worldObj.blockExists(i, 0, j))
			{
				double d0 = (this.boundingBox.maxY - this.boundingBox.minY) * 0.66D;
				int k = MathHelper.floor_double(this.posY - (double)this.yOffset + d0);
				return this.worldObj.getLightBrightnessForSkyBlocks(i, k, j, 0);
			}
			else
			{
				return 0;
			}
		}
	}
	/**
	 * Called with the movement of the mouse. Used in controlling vehicles if need be.
	 * @param deltaY
	 * @param deltaX
	 */
	@Override
	public void onMouseMoved(int deltaX, int deltaY)
	{	//allah bookmark mouse
		if(!FMLCommonHandler.instance().getSide().isClient())
			return;
		if(!FlansMod.proxy.mouseControlEnabled())
			return;

		float sensitivity = 0.01F;


		flapsPitchLeft -= sensitivity * deltaY;
		flapsPitchRight -= sensitivity * deltaY;

		if(mode != EnumPlaneMode.SIXDOF){
			flapsPitchLeft -= sensitivity * deltaX;
			flapsPitchRight += sensitivity * deltaX;
		} else {
			flapsPitchLeft -= sensitivity * deltaX;
			flapsPitchRight += sensitivity * deltaX;
			//flapsYaw += sensitivity * deltaX;
		}
	}

	@Override
	public void setPositionRotationAndMotion(double x, double y, double z, float yaw, float pitch, float roll, double motX, double motY, double motZ, float velYaw, float velPitch, float velRoll, float throt, float steeringYaw, float throtPP)
	{
		super.setPositionRotationAndMotion(x, y, z, yaw, pitch, roll, motX, motY, motZ, velYaw, velPitch, velRoll, throt, steeringYaw, throtPP);
		flapsYaw = steeringYaw;
	}

	public void setRotorPosition(float current, float previous)
	{
		rotorAngle = current;
		prevRotorAngle = previous;
	}


	public void rebirth()
	{
		PlaneType typo = getPlaneType();
		ItemStack vehicleStack = new ItemStack(typo.item, 1, driveableData.paintjobID);

		for(EntitySeat seat : seats) //bye bye passengers!
			if(seat != null)				
				if(seat.riddenByEntity != null && seat.riddenByEntity instanceof EntityPlayerMP)
				{
					//EntityPlayerMP human = (EntityPlayerMP)seat.riddenByEntity;   just dismount them instead of kicking them
					//human.playerNetServerHandler.kickPlayerFromServer("Seat kick detected?! Let's hope you brought a parachute!");	
					seat.mountEntity(null);
				}

		//public EntityPlane(World world, double x, double y, double z, float yaw, float pitch, PlaneType type, DriveableData data)
		vehicleStack.stackTagCompound = new NBTTagCompound();
		driveableData.writeToNBT(vehicleStack.stackTagCompound);
		//((ItemPlane)vehicleStack.getItem()).spawnPlane(worldObj, this.posX + 0F, this.posY + 0F, this.posZ + 0F, vehicleStack);	//altitude boost cancelled
		((ItemPlane)vehicleStack.getItem()).spawnPlaneAngled(worldObj, this.posX + 0F, this.posY + 0F, this.posZ + 0F, axes.getYaw()-90f, -1f*axes.getPitch(), axes.getRoll(), vehicleStack);	//altitude boost cancelled



		//rotateYaw(placer.rotationYaw + 90F);
		//rotatePitch(type.restingPitch);
		//System.out.println("rebirth attemtped!");
		for(EntitySeat seat : seats) //make sure seats and wheels died
			if(seat != null)
				seat.setDead();
		for(EntityWheel wheel : wheels)
			if(wheel != null)
				wheel.setDead();
		this.setDead();
	}

	public void setPropPosition(float current, float previous)
	{
		propAngle = current;
		prevPropAngle = previous;
	}


	@Override
	public boolean interactFirst(EntityPlayer entityplayer)
	{
		if(isDead)
			return false;
		if(worldObj.isRemote)
			return false;

		//If they are using a repair tool, don't put them in
		ItemStack currentItem = entityplayer.getCurrentEquippedItem();
		if(currentItem != null && currentItem.getItem() instanceof ItemTool && ((ItemTool)currentItem.getItem()).type.healDriveables)
			return true;

		PlaneType type = this.getPlaneType();
		//Check each seat in order to see if the player can sit in it
		for(int i = 0; i <= type.numPassengers; i++)
		{
			if(seats[i].interactFirst(entityplayer))
			{
				if(i == 0)
				{
					bombDelay = type.planeBombDelay;
					FlansMod.proxy.doTutorialStuff(entityplayer, this);
				}
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean pressKey(int key, EntityPlayer player)
	{
		PlaneType type = this.getPlaneType();



		//baris weapons witch tech start
		//System.out.println("key: " + key);
		if(key==36&&System.currentTimeMillis()-lastshellswitchedat>500L && seats != null && seats[0] != null) {
			//System.out.println("puppy");
			this.lastshellswitchedat = System.currentTimeMillis();
			FlansMod.getPacketHandler().sendToServer(new PacketCurrentMissile(this.getEntityId(), driveableData.getStackInSlot(1))); //try to only send packet to driver seat
		}
		//baris weapons witch tech end

		//Send keys which require server side updates to the server
		if(worldObj.isRemote && (key == 6 || key == 8 || key == 9))
		{
			FlansMod.getPacketHandler().sendToServer(new PacketDriveableKey(key));
			return true;
		}
		boolean canThrust = (seats[0] != null && seats[0].riddenByEntity instanceof EntityPlayer && ((EntityPlayer)seats[0].riddenByEntity).capabilities.isCreativeMode) || getDriveableData().fuelInTank > 0;
		switch(key)
		{
		case 0 : //Accelerate : Increase the throttle, up to 1.
		{
			if(canThrust || throttle < 0F)
			{

				if(type.mode == EnumPlaneMode.HELI || mode == EnumPlaneMode.VTOL)
				{
					throttle += 0.002F;
					if(throttle > 1F)
						throttle = 1F;
					xSpeed += 0.5F;
				}
				else
				{
					//throttle 10x faster because its not as important for takeoff anymore
					throttle += 0.02F;
					if(throttle > 1F)
						throttle = 1F;

				}


				//testerino ++;
			}
			return true;
		}
		case 1 : //Decelerate : Decrease the throttle, down to -1, or 0 if the plane cannot reverse
		{
			if(canThrust || throttle > 0F)
			{

				if(type.mode == EnumPlaneMode.HELI || type.mode == EnumPlaneMode.VTOL)
				{
					throttle -= 0.005F;
					if(throttle < -1F)
						throttle = -1F;
					if(throttle < 0F && type.maxNegativeThrottle == 0F)
						throttle = 0F;
					xSpeed -=0.5F;
				}
				else
				{
					//throttle 10x faster because its not as important for takeoff anymore
					throttle -= 0.04F;
					if(throttle < -1F)
						throttle = -1F;
					if(throttle < 0F && type.maxNegativeThrottle == 0F)
					{
						throttle = 0F;
						//you actually need your gear out to land! -- xdd but ill make having gear out cause some drag >:)    or unless you are using an old plane with unretractable gear
						if(driveableData.landBrake < 20 && (varGear || !type.needsGear))
							driveableData.landBrake += 2;
					}
				}

			}
			return true;
		}
		case 2 : //Left : Yaw the flaps left
		{
			if(mode != EnumPlaneMode.SIXDOF)
				flapsYaw -= 1F;
			zSpeed -= 1F;
			return true;
		}
		case 3 : //Right : Yaw the flaps right
		{
			if(mode != EnumPlaneMode.SIXDOF)
				flapsYaw += 1F;
			zSpeed += 1F;
			return true;
		}
		case 4 : //Up : Pitch the flaps up
		{
			if(mode != EnumPlaneMode.SIXDOF){
				flapsPitchLeft += 1F;
				flapsPitchRight += 1F;
			}
			ySpeed += 1F;
			return true;
		}
		case 5 : //Down : Pitch the flaps down
		{
			if(mode != EnumPlaneMode.SIXDOF){
				flapsPitchLeft -= 1F;
				flapsPitchRight -= 1F;
			}
			ySpeed -= 1F;
			return true;
		}
		case 6 : //Exit : Get out
		{
			/*
			if(seats[0].riddenByEntity != null)
				seats[0].riddenByEntity.mountEntity(null);
			System.out.println("exit key plane did this");
			return true;
			 */
			exitTimer--;
			exitTimer--;
			if(exitTimer>20)
				//	seats[0].riddenByEntity.setInvisible(false);
				//seats[0].riddenByEntity.mountEntity(null);
				return true;
		}
		case 7 : //Inventory : Check to see if this plane allows in-flight inventory editing or if the plane is on the ground
		{
			if(worldObj.isRemote && (type.invInflight || (Math.abs(throttle) < 0.1F && onGround)))
			{
				FlansMod.proxy.openDriveableMenu((EntityPlayer)seats[0].riddenByEntity, worldObj, this);
			}
			return true;
		}
		case 9 : //Drop bomb    um no sweetie its carrier dismount time  undock  - swapped with landing so you dont accidentally right click seat and takeoff
		{
			if(this.ridingEntity != null && this.ridingEntity instanceof EntitySeat)
			{
				EntitySeat seat = (EntitySeat)this.ridingEntity;
				if(seat.driveable != null && seat.driveable instanceof EntityPlane)
				{
					EntityPlane Mothership = (EntityPlane)seat.driveable;
					Mothership.accidentDelay = 100; //5 second patience window of safety for mothership
					//System.out.println("mothership protected!");
				}
			}


			this.mountEntity(null);

			//return super.pressKey(key, player);
			return true;
		}
		case 8 : //Shoot bullet    no sweetie its carrier landing time   dock


			double checkCarrierRange = 20;
			List carrier = worldObj.getEntitiesWithinAABB(EntitySeat.class, AxisAlignedBB.getBoundingBox(posX - checkCarrierRange, posY - checkCarrierRange, posZ - checkCarrierRange, posX + checkCarrierRange, posY + checkCarrierRange, posZ + checkCarrierRange));
			if(type.carrierLandable==true || type.helipadLandable==true || type.parasitePlane)
			{
				if(riddenByEntity != null && riddenByEntity instanceof EntityPlane && !(riddenByEntity instanceof EntityPlayer))
				{
					riddenByEntity.mountEntity(null);
					//System.out.println("carrier suction did this");
					return true;
				}
				for(Object obj : carrier)
				{
					EntitySeat carrierSpot = (EntitySeat)obj;
					if((carrierSpot.riddenByEntity == null && carrierSpot.seatInfo.hardpoint == true && type.parasitePlane) || (carrierSpot.riddenByEntity == null && carrierSpot.seatInfo.carrier == true) || (carrierSpot.riddenByEntity == null && carrierSpot.seatInfo.helipad == true && type.helipadLandable == true))
					{

						if(carrierSpot.driveable != null && type.mass <= (carrierSpot.driveable).getDriveableType().weightLimit) // check if too heavy
							this.mountEntity(carrierSpot);
						else
						{
							player.addChatMessage(new ChatComponentText("Your aircraft (" + type.mass + " kg) is too heavy to dock! Weight limit: " + (carrierSpot.driveable).getDriveableType().weightLimit + " kg" ));
						}

					}

				}
			}

			return true;
		case 10 : //Change control mode
		{
			FlansMod.proxy.changeControlMode((EntityPlayer)seats[0].riddenByEntity);
			seats[0].playerLooking = new RotatedAxes(0,0,0);
			return true;
		}
		case 11 : //Roll left
		{
			if(mode != EnumPlaneMode.SIXDOF){
				flapsPitchLeft += 2F;
				flapsPitchRight -= 2F;
			} else {
				flapsYaw -=0.5F;
			}

			return true;
		}
		case 12 : //Roll right
		{
			if(mode != EnumPlaneMode.SIXDOF){
				flapsPitchLeft -= 2F;
				flapsPitchRight += 2F;
			} else {
				flapsYaw +=0.5F;
			}
			return true;
		}
		case 13 : // Gear
		{
			if(toggleTimer <= 0)
			{
				if(worldObj.isAirBlock((int)posX, (int)(posY-3), (int)posZ) && type.needsGear){
					varGear = !varGear;
					player.addChatMessage(new ChatComponentText("Landing gear " + (varGear ? "down" : "up")));
					toggleTimer = 10;
					FlansMod.getPacketHandler().sendToServer(new PacketDriveableControl(this));
				}
			}
			return true;
		}
		case 14 : // Door
		{

			//	rebirth();

			if(toggleTimer <= 0)
			{
				varDoor = !varDoor;
				if(type.hasDoor)
					player.addChatMessage(new ChatComponentText("Doors " + (varDoor ? "open" : "closed")));
				toggleTimer = 10;
				FlansMod.getPacketHandler().sendToServer(new PacketDriveableControl(this));
			}
			if(toggleTimer <= 0)
			{
				combatRadar = !combatRadar;
				if(type.hasRadar)
					player.addChatMessage(new ChatComponentText("Radar set to " + (combatRadar ? "combat range" : "long range")));
				toggleTimer = 10;
			}
			return true;
		}
		case 15 : // Wing   actually this is air brake / landing flap mode now
		{

			//if(type.hasWing == false  && type.numPassengers > 0 && seats[1].riddenByEntity == null)
			//{
			//player.mountEntity(seats[1]);
			//}

			if(toggleTimer <= 0)
			{

				if(type.mode == EnumPlaneMode.VTOL)
				{
					if(mode == EnumPlaneMode.HELI)
						mode = EnumPlaneMode.PLANE;
					else mode = EnumPlaneMode.HELI;
					toggleTimer = 10; //fixed no timer for vtol mode
					player.addChatMessage(new ChatComponentText(mode == EnumPlaneMode.HELI ? "Entering hover mode" : "Entering plane mode"));
				}
				else if (type.mode != EnumPlaneMode.HELI)
				{
					player.addChatMessage(new ChatComponentText(!varFlap ? "Landing flaps deployed" : "Landing flaps retracted"));
					//anim.changeState(varWing?0:1);
					varFlap = !varFlap;
					toggleTimer = 10;
					FlansMod.getPacketHandler().sendToServer(new PacketDriveableControl(this));
				}
			}
			return true;
		}

		case 19 : //seat switch
		{
			if(this.nintendoSwitchLite > 0)
			{
				this.nintendoSwitchLite--;
				this.nintendoSwitchLite--;
			}
			if(PlayerHandler.getPlayerData(player) != null && this.nintendoSwitchLite <= 0)
			{
				if(type.numPassengers > 0 && seats[1].riddenByEntity == null)
				{
					PlayerHandler.getPlayerData(player).nintendoSwitch = 10;
					player.mountEntity(seats[1]);
				}
			}
			return true;
		}

		//beginning of seat hotkeys


		case 21 : //seat hotkey
		{

			if(PlayerHandler.getPlayerData(player) != null)
			{
				if(type.numPassengers > 1 && seats[1].riddenByEntity == null && seats[2].riddenByEntity == null)
				{
					//PlayerHandler.getPlayerData(player).s1 = 10;
					player.mountEntity(seats[1]);
				}
			}
			return true;
		}

		case 22 : //seat hotkey
		{

			if(PlayerHandler.getPlayerData(player) != null)
			{
				if(type.numPassengers > 2 && seats[1].riddenByEntity == null && seats[3].riddenByEntity == null)
				{
					//PlayerHandler.getPlayerData(player).s2 = 10;
					player.mountEntity(seats[1]);
				}
			}
			return true;
		}

		case 23 : //seat hotkey
		{

			if(PlayerHandler.getPlayerData(player) != null)
			{
				if(type.numPassengers > 3 && seats[1].riddenByEntity == null && seats[4].riddenByEntity == null)
				{
					//PlayerHandler.getPlayerData(player).s2 = 10;
					player.mountEntity(seats[1]);
				}
			}
			return true;
		}

		case 24 : //seat hotkey
		{

			if(PlayerHandler.getPlayerData(player) != null)
			{
				if(type.numPassengers > 4 && seats[1].riddenByEntity == null && seats[5].riddenByEntity == null)
				{
					player.mountEntity(seats[1]);
				}
			}
			return true;
		}

		case 25 : //seat hotkey
		{

			if(PlayerHandler.getPlayerData(player) != null)
			{
				if(type.numPassengers > 5 && seats[1].riddenByEntity == null && seats[6].riddenByEntity == null)
				{
					player.mountEntity(seats[1]);
				}
			}
			return true;
		}

		case 26 : //seat hotkey
		{

			if(PlayerHandler.getPlayerData(player) != null)
			{
				if(type.numPassengers > 6 && seats[1].riddenByEntity == null && seats[7].riddenByEntity == null)
				{
					player.mountEntity(seats[1]);
				}
			}
			return true;
		}

		case 27 : //seat hotkey
		{

			if(PlayerHandler.getPlayerData(player) != null)
			{
				if(type.numPassengers > 7 && seats[1].riddenByEntity == null && seats[8].riddenByEntity == null)
				{
					player.mountEntity(seats[1]);
				}
			}
			return true;
		}

		case 28 : //seat hotkey
		{

			if(PlayerHandler.getPlayerData(player) != null)
			{
				if(type.numPassengers > 8 && seats[1].riddenByEntity == null && seats[9].riddenByEntity == null)
				{
					player.mountEntity(seats[1]);
				}
			}
			return true;
		}

		case 29 : //seat hotkey
		{

			if(PlayerHandler.getPlayerData(player) != null)
			{
				if(type.numPassengers > 9 && seats[1].riddenByEntity == null && seats[10].riddenByEntity == null)
				{
					player.mountEntity(seats[1]);
				}
			}
			return true;
		}

		//end of seat hotkeys




		case 34 : //repair system port   except you also have to be near ground (landed)
		{
			if( this.ticksRepairing <= 0 && throttle <= 0.05 && !worldObj.isAirBlock((int)posX, (int)(posY-5), (int)posZ))
			{
				this.ticksRepairing = type.ticksRepairing;

				PacketPlaySound.sendSoundPacket(posX, posY, posZ, 10f, dimension, "Repair", false);

				if(worldObj.isRemote)
				{
					FlansMod.getPacketHandler().sendToServer(new PacketDriveableKey(key));
				}
				else
				{
					//dischargeSmoke();
					if(!type.flareSound.isEmpty())
					{
						PacketPlaySound.sendSoundPacket(posX, posY, posZ, FlansMod.soundRange, dimension, type.flareSound, false);   
					}
				}
				return true;
			}
			break;
		}

		case 35 : //active passive radar for antiradiation meta game port
		{
			if(toggleTimer <= 0 && type.hasPlaneRadar)
			{
				activeRadar = !activeRadar;
				toggleTimer = 10;	
				//System.out.println("active radar toggled: " + activeRadar);
				player.addChatMessage(new ChatComponentText("Radar Mode : " + (activeRadar ? "active" : "passive")));
			}
			return true;
		}




		case 16 : // Trim Button, no sweetie its afterburner time
		{
			if(toggleTimer <= 0 && type.hasAfterBurner)
			{
				this.afterBurning = !this.afterBurning;
				player.addChatMessage(new ChatComponentText(type.afterBurnName + (this.afterBurning ? " activated" : " deactivated")));
				toggleTimer = 10;
				FlansMod.getPacketHandler().sendToServer(new PacketDriveableControl(this));

				//if(type.hasWing)
				if(type.AfterburnWing)
				{
					varWing = afterBurning;
					anim.changeState(this.varWing?0:1);
					//	System.out.println("swapped varWing:" + varWing);
					//anim.changeState(this.afterBurning?0:1);
					//if(type.swapInitialWing)
					//	anim.changeState(!this.afterBurning?0:1);
					//player.addChatMessage(new ChatComponentText("Switching mode"));
				}
				else if (type.AfterburnWingFlipped)
				{
					varWing = !afterBurning; //in case modelled backwards
					anim.changeState(this.varWing?0:1);
					//	System.out.println("swapped varWing:" + varWing);
				}
			}

			return true;
		}
		case 17 : //Park
		{
			break;
		}
		case 18 : //Flare
		{
			if(type.hasFlare && this.ticksFlareUsing <= 0 && this.flareDelay <= 0 && (type.autoSmoke == false))
			{
				this.ticksFlareUsing = type.timeFlareUsing * 20;
				this.flareDelay = type.flareDelay;
				if(worldObj.isRemote)
				{
					FlansMod.getPacketHandler().sendToServer(new PacketDriveableKey(key));
				}
				else
				{
					if(!type.flareSound.isEmpty())
					{
						PacketPlaySound.sendSoundPacket(posX, posY, posZ, FlansMod.soundRange, dimension, type.flareSound, false);
					}
				}
				return true;
			}
			break;
		}

		case 33 : //magic artillery/bomb vision ammo view
		{
			if(driveableData.thermalTimer <= 0 && type.hasMagicArtilleryMode)
			{
				artilleryMode = !artilleryMode;
				driveableData.thermalTimer = 10;		
			}
			return true;
		}

		}
		return false;
	}

	@Override
	public void updateKeyHeldState(int key, boolean held)
	{
		super.updateKeyHeldState(key, held);
		//On the server. For semi-auto weapons, shoot!
		if(!worldObj.isRemote)
		{
			switch(key)
			{
			case 9 : //Left Mouse
			case 8 : //Right Mouse
			}
		}
	}

	@Override
	public void onUpdate()
	{
		//System.out.println("plane motion: x: " + this.motionX + "  y: " + this.motionY + "  z: " + this.motionZ);

		super.onUpdate();
		//Set previous positions
		prevWingPos = wingPos;
		prevWingRot = wingRot;
		prevWingWheelPos = wingWheelPos;
		prevWingWheelRot = wingWheelRot;
		prevCoreWheelPos = coreWheelPos;
		prevCoreWheelRot = coreWheelRot;
		prevTailWheelPos = tailWheelPos;
		prevTailWheelRot = tailWheelRot;
		prevDoorPos = doorPos;
		prevDoorRot = doorRot;
		if(getPlaneType().valkyrie){
			if(!initiatedAnim){ 
				anim.initPoses();
				anim.initAnim();
				initiatedAnim = true;
				anim.changeState(varWing?0:1);
			}

			if(initiatedAnim)
			{ 
				int i = varWing?0:1;
				anim.UpdateAnim(i);
			}
		}

		//maybe reduce chance of self collision of parasite planes
		if(this.isRiding() || this.throttle > 0.5f)
			setSize(0.05F, 0.05F);
		else
			setSize(1.5F, 1.5F);

		//collision timer
		if (accidentDelay > 0)
			accidentDelay--;


		//mid air collision system TM
		float mph = this.control.V * 2.23694f;
		Vector3f protoVec = new Vector3f(motionX, motionY, motionZ);
		Vector3f motionVecerino = (Vector3f) protoVec.normalise();
		Entity closestEntity = null;
		if(mph > 20 && accidentDelay <= 0 && driveableData.catapult <= 0 && !(getPlaneType().carrierLandable  && this.throttle < 0.2f && (this.varGear || !getPlaneType().needsGear)) )  //no kamikaze carrier landing
		{

			List<Entity> hits = this.worldObj.getEntitiesWithinAABBExcludingEntity(this, AxisAlignedBB.getBoundingBox(this.posX - accidentRange, this.posY - accidentRange, this.posZ - accidentRange, this.posX + accidentRange, this.posY + accidentRange, this.posZ + accidentRange));

			for (Entity stuff : hits) {
				if (stuff instanceof EntitySeat == false) //check for seats so easier to crash into ships
					continue;	

				EntityDriveable victim = ((EntitySeat)stuff).driveable; //identify the driveable that owns the seat

				//dont crash into yourself retard
				if (this.seats[0] != null && this.seats[0].driveable != null && victim != null && victim != this.seats[0].driveable && getDriveableData() != null &&  !getDriveableData().emergencyMode && !victim.mounted && victim.accidentDelay <= 1) 
				{																		//also dont crash into mounted parasite planes

					Vector3f protoVictim = new Vector3f(victim.motionX, victim.motionY, victim.motionZ);
					Vector3f victimMotion = (Vector3f) protoVictim.normalise();
					//System.out.println("air collision detected!");
					accidentDelay = 40;
					float ms = mph/2.24f;


					//plane collisions
					if (victim instanceof EntityPlane)
					{
						EntityPlane PlaneVictim = (EntityPlane)victim;
						//System.out.println("victim is indeed a plane");
						if( !(PlaneVictim.getPlaneType().parasitePlane && PlaneVictim.isRiding()) ) //no crashing into kamikaze planes attached to a plane. just crash into mothership first ok
						{
							// this.motionX += ((float)Math.random()- 0.5f) * 9 * (mph/getPlaneType().maxSpeed);
							this.motionY += ((float)Math.random()- 0.5f) * 9 * (mph/getPlaneType().maxSpeed);
							// this.motionZ += ((float)Math.random()- 0.5f) * 9 * (mph/getPlaneType().maxSpeed);

							//rear end collision block
							if ( (Math.abs(motionVecerino.x)-Math.abs(victimMotion.x)<0.3f && Math.abs(motionVecerino.y)-Math.abs(victimMotion.y)<0.3f && Math.abs(motionVecerino.z)-Math.abs(victimMotion.z)<0.3f)
									&&  ( Math.abs(motionVecerino.x + victimMotion.x) > 1.33 || Math.abs(motionVecerino.y + victimMotion.y) > 1.33 || Math.abs(motionVecerino.z + victimMotion.z) > 1.33))
							{
								//System.out.println("rear collision! " + this.seats[0].driveable + "collided with: " + victim);

								float msEffective = ms - PlaneVictim.control.V/2.24f; //uses effective speed by accounting for enemy speed
								//System.out.println("effective speed: " + msEffective);
								float megaJoules = msEffective*msEffective*0.5f*(getPlaneType().mass/1000);
								float damageVplane = 0;
								if(megaJoules/10 > 31999)
									damageVplane = 31999;
								else
									damageVplane = megaJoules/10;

								//System.out.println("damage vs plane: " + damageVplane);
								if(victim.getDriveableData().parts != null && victim.getDriveableData().parts.get(EnumDriveablePart.tail) != null && victim.getDriveableData().parts.get(EnumDriveablePart.tail).maxHealth > 0) //damage tail
									PlaneVictim.getDriveableData().parts.get(EnumDriveablePart.tail).health -= damageVplane;
								//damage airframe as backup
								else if(victim.getDriveableData().parts != null && victim.getDriveableData().parts.get(EnumDriveablePart.airframe) != null && victim.getDriveableData().parts.get(EnumDriveablePart.airframe).maxHealth > 0)
									PlaneVictim.getDriveableData().parts.get(EnumDriveablePart.airframe).health -= damageVplane;
								//last resort damage core
								else if(victim.getDriveableData().parts != null && victim.getDriveableData().parts.get(EnumDriveablePart.core) != null && victim.getDriveableData().parts.get(EnumDriveablePart.core).maxHealth > 0)
									PlaneVictim.getDriveableData().parts.get(EnumDriveablePart.core).health -= damageVplane;

								//particles and feedback n shit
								if(damageVplane>10000)
								{
									FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(posX, posY, posZ, 1, "tankkuDeath"), posX, posY, posZ, 200, dimension);
									PacketPlaySound.sendSoundPacket(posX, posY, posZ, 250, dimension, "Crash", false);
									PacketPlaySound.sendSoundPacket(posX, posY, posZ, 250, dimension, "explcls6", false);
								}
								else 	if(damageVplane>250)
								{
									FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(posX, posY, posZ, 1, "hugeexplosion"), posX, posY, posZ, 200, dimension);
									PacketPlaySound.sendSoundPacket(posX, posY, posZ, 250, dimension, "Crash", false);
									PacketPlaySound.sendSoundPacket(posX, posY, posZ, 250, dimension, "explcls6", false);
								}
								else
								{
									FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(posX, posY, posZ, 1, "largeexplode"), posX, posY, posZ, 200, dimension);
									PacketPlaySound.sendSoundPacket(posX, posY, posZ, 250, dimension, "Crash", false);
								}	

								//kill yourself
								if(this.getDriveableData().parts != null && this.getDriveableData().parts.get(EnumDriveablePart.airframe) != null && this.getDriveableData().parts.get(EnumDriveablePart.airframe).maxHealth > 0)
									this.getDriveableData().parts.get(EnumDriveablePart.airframe).health -= damageVplane;
								//last resort damage core
								else if(this.getDriveableData().parts != null && this.getDriveableData().parts.get(EnumDriveablePart.core) != null && this.getDriveableData().parts.get(EnumDriveablePart.core).maxHealth > 0)
									this.getDriveableData().parts.get(EnumDriveablePart.core).health -= damageVplane;


							}//end of rear end collision


							//head on collision block
							else if ( (Math.abs(motionVecerino.x) + Math.abs(victimMotion.x) > 1.6 && motionVecerino.x + victimMotion.x < 0.2) || (Math.abs(motionVecerino.y) +Math.abs(victimMotion.y) > 1.6 && motionVecerino.y + victimMotion.y < 0.2) || (Math.abs(motionVecerino.z)+Math.abs(victimMotion.z) > 1.6 && motionVecerino.z + victimMotion.z < 0.2))
							{
								//System.out.println("headon collision! their mot:  x " + victimMotion.x + "  y " + victimMotion.y + "  z " + victimMotion.z + " our motion mot:  x" + motionVecerino.x +"  y " + motionVecerino.y + "  z " + motionVecerino.z);

								float msEffective = ms + PlaneVictim.control.V/2.24f; //uses effective speed by accounting for enemy speed
								float megaJoules = msEffective*msEffective*0.5f*(getPlaneType().mass/1000);

								float damageVplane = 0;
								if(megaJoules/10 > 31999)
									damageVplane = 31999;
								else
									damageVplane = megaJoules/10;

								//System.out.println("damage vs plane: " + damageVplane);
								if(victim.getDriveableData().parts != null && victim.getDriveableData().parts.get(EnumDriveablePart.airframe) != null && victim.getDriveableData().parts.get(EnumDriveablePart.airframe).maxHealth > 0)
									PlaneVictim.getDriveableData().parts.get(EnumDriveablePart.airframe).health -= damageVplane;
								//last resort damage core
								else if(victim.getDriveableData().parts != null && victim.getDriveableData().parts.get(EnumDriveablePart.core) != null && victim.getDriveableData().parts.get(EnumDriveablePart.core).maxHealth > 0)
									PlaneVictim.getDriveableData().parts.get(EnumDriveablePart.core).health -= damageVplane;

								//particles and feedback n shit
								if(damageVplane>10000)
								{
									FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(posX, posY, posZ, 1, "tankkuDeath"), posX, posY, posZ, 200, dimension);
									PacketPlaySound.sendSoundPacket(posX, posY, posZ, 250, dimension, "Crash", false);
									PacketPlaySound.sendSoundPacket(posX, posY, posZ, 250, dimension, "explcls6", false);
								}
								else 	if(damageVplane>250)
								{
									FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(posX, posY, posZ, 1, "hugeexplosion"), posX, posY, posZ, 200, dimension);
									PacketPlaySound.sendSoundPacket(posX, posY, posZ, 250, dimension, "Crash", false);
									PacketPlaySound.sendSoundPacket(posX, posY, posZ, 250, dimension, "explcls6", false);
								}
								else
								{
									FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(posX, posY, posZ, 1, "largeexplode"), posX, posY, posZ, 200, dimension);
									PacketPlaySound.sendSoundPacket(posX, posY, posZ, 250, dimension, "Crash", false);
								}

								//kill yourself
								if(this.getDriveableData().parts != null && this.getDriveableData().parts.get(EnumDriveablePart.airframe) != null && this.getDriveableData().parts.get(EnumDriveablePart.airframe).maxHealth > 0)
									this.getDriveableData().parts.get(EnumDriveablePart.airframe).health -= damageVplane;
								//last resort damage core
								else if(this.getDriveableData().parts != null && this.getDriveableData().parts.get(EnumDriveablePart.core) != null && this.getDriveableData().parts.get(EnumDriveablePart.core).maxHealth > 0)
									this.getDriveableData().parts.get(EnumDriveablePart.core).health -= damageVplane;

							}//end of head on collision


							//side collision block
							else if ( Math.abs(motionVecerino.x) + Math.abs(victimMotion.z) < 1 || Math.abs(motionVecerino.z) + Math.abs(victimMotion.y) < 1 || Math.abs(motionVecerino.z)+Math.abs(victimMotion.y) < 1)
							{
								//System.out.println("side collision! their mot:  x " + victimMotion.x + "  y " + victimMotion.y + "  z " + victimMotion.z + " our motion mot:  x" + motionVecerino.x +"  y " + motionVecerino.y + "  z " + motionVecerino.z);

								float megaJoules = ms*ms*0.5f*(getPlaneType().mass/1000);
								float damageVplane = 0;
								if(megaJoules/10 > 31999)
									damageVplane = 31999;
								else
									damageVplane = megaJoules/10;

								//System.out.println("damage vs plane: " + damageVplane);
								if(victim.getDriveableData().parts != null && victim.getDriveableData().parts.get(EnumDriveablePart.leftWing) != null && victim.getDriveableData().parts.get(EnumDriveablePart.leftWing).maxHealth > 0) //damage wing
									PlaneVictim.getDriveableData().parts.get(EnumDriveablePart.leftWing).health -= damageVplane;
								else if(victim.getDriveableData().parts != null && victim.getDriveableData().parts.get(EnumDriveablePart.rightWing) != null && victim.getDriveableData().parts.get(EnumDriveablePart.rightWing).maxHealth > 0) //or damage other tail
									PlaneVictim.getDriveableData().parts.get(EnumDriveablePart.rightWing).health -= damageVplane;
								//damage airframe as backup
								else if(victim.getDriveableData().parts != null && victim.getDriveableData().parts.get(EnumDriveablePart.airframe) != null && victim.getDriveableData().parts.get(EnumDriveablePart.airframe).maxHealth > 0)
									PlaneVictim.getDriveableData().parts.get(EnumDriveablePart.airframe).health -= damageVplane;
								//last resort damage core
								else if(victim.getDriveableData().parts != null && victim.getDriveableData().parts.get(EnumDriveablePart.core) != null && victim.getDriveableData().parts.get(EnumDriveablePart.core).maxHealth > 0)
									PlaneVictim.getDriveableData().parts.get(EnumDriveablePart.core).health -= damageVplane;

								//particles and feedback n shit
								if(damageVplane>10000)
								{
									FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(posX, posY, posZ, 1, "tankkuDeath"), posX, posY, posZ, 200, dimension);
									PacketPlaySound.sendSoundPacket(posX, posY, posZ, 250, dimension, "Crash", false);
									PacketPlaySound.sendSoundPacket(posX, posY, posZ, 250, dimension, "explcls6", false);
								}
								else 	if(damageVplane>250)
								{
									FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(posX, posY, posZ, 1, "hugeexplosion"), posX, posY, posZ, 200, dimension);
									PacketPlaySound.sendSoundPacket(posX, posY, posZ, 250, dimension, "Crash", false);
									PacketPlaySound.sendSoundPacket(posX, posY, posZ, 250, dimension, "explcls6", false);
								}
								else
								{
									FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(posX, posY, posZ, 1, "largeexplode"), posX, posY, posZ, 200, dimension);
									PacketPlaySound.sendSoundPacket(posX, posY, posZ, 250, dimension, "Crash", false);
								}

								//kill yourself
								if(this.getDriveableData().parts != null && this.getDriveableData().parts.get(EnumDriveablePart.leftWing) != null && this.getDriveableData().parts.get(EnumDriveablePart.leftWing).maxHealth > 0) //damage wing
									this.getDriveableData().parts.get(EnumDriveablePart.leftWing).health -= damageVplane;
								else if(this.getDriveableData().parts != null && this.getDriveableData().parts.get(EnumDriveablePart.rightWing) != null && this.getDriveableData().parts.get(EnumDriveablePart.rightWing).maxHealth > 0) //or damage other tail
									this.getDriveableData().parts.get(EnumDriveablePart.rightWing).health -= damageVplane;
								//damage airframe as backup
								else if(this.getDriveableData().parts != null && this.getDriveableData().parts.get(EnumDriveablePart.airframe) != null && this.getDriveableData().parts.get(EnumDriveablePart.airframe).maxHealth > 0)
									this.getDriveableData().parts.get(EnumDriveablePart.airframe).health -= damageVplane;
								//last resort damage core
								else if(this.getDriveableData().parts != null && this.getDriveableData().parts.get(EnumDriveablePart.core) != null && this.getDriveableData().parts.get(EnumDriveablePart.core).maxHealth > 0)
									this.getDriveableData().parts.get(EnumDriveablePart.core).health -= damageVplane;

							}//end of side collision


							//generic collision last resort
							else
							{
								// System.out.println("generic collision!");


								float megaJoules = ms*ms*0.5f*(getPlaneType().mass/1000);
								float damageVplane = 0;
								if(megaJoules/10 > 31999)
									damageVplane = 31999;
								else
									damageVplane = megaJoules/10;

								//damage airframe as default
								if(victim.getDriveableData().parts != null && victim.getDriveableData().parts.get(EnumDriveablePart.airframe) != null && victim.getDriveableData().parts.get(EnumDriveablePart.airframe).maxHealth > 0)
									PlaneVictim.getDriveableData().parts.get(EnumDriveablePart.airframe).health -= damageVplane;
								//last resort damage core
								else if(victim.getDriveableData().parts != null && victim.getDriveableData().parts.get(EnumDriveablePart.core) != null && victim.getDriveableData().parts.get(EnumDriveablePart.core).maxHealth > 0)
									PlaneVictim.getDriveableData().parts.get(EnumDriveablePart.core).health -= damageVplane;

								//particles and feedback n shit
								if(damageVplane>10000)
								{
									FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(posX, posY, posZ, 1, "tankkuDeath"), posX, posY, posZ, 200, dimension);
									PacketPlaySound.sendSoundPacket(posX, posY, posZ, 250, dimension, "Crash", false);
									PacketPlaySound.sendSoundPacket(posX, posY, posZ, 250, dimension, "explcls6", false);
								}
								else 	if(damageVplane>250)
								{
									FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(posX, posY, posZ, 1, "hugeexplosion"), posX, posY, posZ, 200, dimension);
									PacketPlaySound.sendSoundPacket(posX, posY, posZ, 250, dimension, "Crash", false);
									PacketPlaySound.sendSoundPacket(posX, posY, posZ, 250, dimension, "explcls6", false);
								}
								else
								{
									FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(posX, posY, posZ, 1, "largeexplode"), posX, posY, posZ, 200, dimension);
									PacketPlaySound.sendSoundPacket(posX, posY, posZ, 250, dimension, "Crash", false);
								}

								//kill yourself   actually dont kill yourself in a plane collision since enemy will hit you too (unless enemy plane too slow to deliver damage)
								if(PlaneVictim.control.V < 20)
								{

									float msEffective = ms - PlaneVictim.control.V/2.24f; //uses effective speed by accounting for enemy speed
									//System.out.println("effective speed: " + msEffective);
									float megaJoulesEnemy = msEffective*msEffective*0.5f*(PlaneVictim.getPlaneType().mass/1000); //use enemy mass
									float damageVyou = 0;
									if(megaJoules/10 > 31999)
										damageVyou = 31999;
									else
										damageVyou = megaJoules/10;


									if(this.getDriveableData().parts != null && this.getDriveableData().parts.get(EnumDriveablePart.airframe) != null && this.getDriveableData().parts.get(EnumDriveablePart.airframe).maxHealth > 0)
										this.getDriveableData().parts.get(EnumDriveablePart.airframe).health -= damageVyou;
									//last resort damage core
									else if(this.getDriveableData().parts != null && this.getDriveableData().parts.get(EnumDriveablePart.core) != null && this.getDriveableData().parts.get(EnumDriveablePart.core).maxHealth > 0)
										this.getDriveableData().parts.get(EnumDriveablePart.core).health -= damageVyou;
								}

							}//end of generic collision


						}//end of no kamikaze parasite mothership defense

					}//end of plane collisions

					//vehicle collisions
					if (victim instanceof EntityVehicle)
					{
						EntityVehicle VehicleVictim = (EntityVehicle)victim;
						//System.out.println("victim is indeed a vehicle");

						// this.motionX += ((float)Math.random()- 0.5f) * 9 * (mph/getPlaneType().maxSpeed);
						this.motionY += ((float)Math.random()- 0.25f) * 9 * (mph/getPlaneType().maxSpeed);
						// this.motionZ += ((float)Math.random()- 0.5f) * 9 * (mph/getPlaneType().maxSpeed);


						//ship collision block
						if ( VehicleVictim.getVehicleType().epicShip)
						{
							//System.out.println("ship collision!");

							float megaJoules = ms*ms*0.5f*(getPlaneType().mass/1000);
							float damageVship = 0;
							if((megaJoules/40 + getPlaneType().kamikazeBonus) > 31999)
								damageVship = 31999;
							else
								damageVship = megaJoules/40 + getPlaneType().kamikazeBonus;

							//System.out.println("damage vs vehicle: " + damageVship);
							if(victim.getDriveableData().parts != null && victim.getDriveableData().parts.get(EnumDriveablePart.bow) != null && victim.getDriveableData().parts.get(EnumDriveablePart.bow).maxHealth > 0) //damage wing
								VehicleVictim.getDriveableData().parts.get(EnumDriveablePart.bow).health -= damageVship;
							else if(victim.getDriveableData().parts != null && victim.getDriveableData().parts.get(EnumDriveablePart.stern) != null && victim.getDriveableData().parts.get(EnumDriveablePart.stern).maxHealth > 0) //or damage other tail
								VehicleVictim.getDriveableData().parts.get(EnumDriveablePart.stern).health -= damageVship;
							//damage airframe as backup
							else if(victim.getDriveableData().parts != null && victim.getDriveableData().parts.get(EnumDriveablePart.left) != null && victim.getDriveableData().parts.get(EnumDriveablePart.left).maxHealth > 0)
								VehicleVictim.getDriveableData().parts.get(EnumDriveablePart.left).health -= damageVship;
							//last resort damage core
							else if(victim.getDriveableData().parts != null && victim.getDriveableData().parts.get(EnumDriveablePart.right) != null && victim.getDriveableData().parts.get(EnumDriveablePart.right).maxHealth > 0)
								VehicleVictim.getDriveableData().parts.get(EnumDriveablePart.right).health -= damageVship;


							//particles and feedback n shit
							if(damageVship>10000)
							{
								FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(posX, posY, posZ, 1, "tankkuDeath"), posX, posY, posZ, 200, dimension);
								PacketPlaySound.sendSoundPacket(posX, posY, posZ, 250, dimension, "Crash", false);
								PacketPlaySound.sendSoundPacket(posX, posY, posZ, 250, dimension, "explcls6", false);
							}
							else 	if(damageVship>250)
							{
								FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(posX, posY, posZ, 1, "hugeexplosion"), posX, posY, posZ, 200, dimension);
								PacketPlaySound.sendSoundPacket(posX, posY, posZ, 250, dimension, "Crash", false);
								PacketPlaySound.sendSoundPacket(posX, posY, posZ, 250, dimension, "explcls6", false);
							}
							else
							{
								FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(posX, posY, posZ, 1, "largeexplode"), posX, posY, posZ, 200, dimension);
								PacketPlaySound.sendSoundPacket(posX, posY, posZ, 250, dimension, "Crash", false);
							}

							//kill yourself right to the core
							if(this.getDriveableData().parts != null && this.getDriveableData().parts.get(EnumDriveablePart.core) != null && this.getDriveableData().parts.get(EnumDriveablePart.core).maxHealth > 0)
								this.getDriveableData().parts.get(EnumDriveablePart.core).health -= damageVship;


						}//end of ship collision


						//tank collision last resort
						else
						{
							//System.out.println("tank collision!");


							float megaJoules = ms*ms*0.05f*(getPlaneType().mass/1000); //nerfed to 0.05 instead of 0.5
							float damageVship = 0;
							if((megaJoules/200 + getPlaneType().kamikazeBonus) > 31999)
								damageVship = 31999;
							else
								damageVship = megaJoules/200 + getPlaneType().kamikazeBonus;
							//System.out.println("damage vs vehicle: " + damageVship);
							//damage airframe as default     fuck it sniping turret too op, go for core
							// if(victim.getDriveableData().parts != null && victim.getDriveableData().parts.get(EnumDriveablePart.turret) != null && victim.getDriveableData().parts.get(EnumDriveablePart.turret).maxHealth > 0)
							//	VehicleVictim.getDriveableData().parts.get(EnumDriveablePart.turret).health -= damageVship;
							//last resort damage core
							if(victim.getDriveableData().parts != null && victim.getDriveableData().parts.get(EnumDriveablePart.core) != null && victim.getDriveableData().parts.get(EnumDriveablePart.core).maxHealth > 0)
								VehicleVictim.getDriveableData().parts.get(EnumDriveablePart.core).health -= damageVship;

							//particles and feedback n shit
							if(damageVship>10000)
							{
								FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(posX, posY, posZ, 1, "tankkuDeath"), posX, posY, posZ, 200, dimension);
								PacketPlaySound.sendSoundPacket(posX, posY, posZ, 250, dimension, "Crash", false);
								PacketPlaySound.sendSoundPacket(posX, posY, posZ, 250, dimension, "explcls6", false);
							}
							else 	if(damageVship>250)
							{
								FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(posX, posY, posZ, 1, "hugeexplosion"), posX, posY, posZ, 200, dimension);
								PacketPlaySound.sendSoundPacket(posX, posY, posZ, 250, dimension, "Crash", false);
								PacketPlaySound.sendSoundPacket(posX, posY, posZ, 250, dimension, "explcls6", false);
							}
							else
							{
								FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(posX, posY, posZ, 1, "largeexplode"), posX, posY, posZ, 200, dimension);
								PacketPlaySound.sendSoundPacket(posX, posY, posZ, 250, dimension, "Crash", false);
							}

							//kill yourself
							if(this.getDriveableData().parts != null && this.getDriveableData().parts.get(EnumDriveablePart.airframe) != null && this.getDriveableData().parts.get(EnumDriveablePart.airframe).maxHealth > 0)
								this.getDriveableData().parts.get(EnumDriveablePart.airframe).health -= damageVship;
							//last resort damage core
							else if(this.getDriveableData().parts != null && this.getDriveableData().parts.get(EnumDriveablePart.core) != null && this.getDriveableData().parts.get(EnumDriveablePart.core).maxHealth > 0)
								this.getDriveableData().parts.get(EnumDriveablePart.core).health -= damageVship;



						}//end of tank collision


					}//end of vehicle collisions

				}

			}

		}//end of entire collision system



		//Stuka sound
		if (this.control.V * 2.23694 > getPlaneType().stukaSpeed && stukaSoundDelay <= 0 && !worldObj.isRemote)
		{
			PacketPlaySound.sendSoundPacket(posX, posY, posZ, getPlaneType().stukaSoundRange, dimension, getPlaneType().stukaSound, false);
			stukaSoundDelay = getPlaneType().stukaSoundLength;
		}

		//carrier catapult effects
		if(this.driveableData.catapult > 0)
		{
			this.driveableData.catapult --;

		}


		//seatbelterino

		if(this.ticksExisted == 19 && (getDriveableData().seatBelt == null || getDriveableData().seatBelt.length() == 0))
			getDriveableData().seatBelt = "null";

		if(this.ticksExisted > 20)
		{
			if(this.seats[0] != null && this.seats[0].riddenByEntity != null && this.seats[0].riddenByEntity instanceof EntityPlayer)
			{
				EntityPlayer Master = (EntityPlayer)this.seats[0].riddenByEntity;
				//getDriveableData().saveMaster(Master.getDisplayName());
				getDriveableData().seatBelt = Master.getDisplayName();

				/*
			//if remounting an emergency mode plane, give altitude bonus
			if (getDriveableData().emergencyMode)
			{
				((EntityPlayer)seats[0].riddenByEntity).addChatMessage(new ChatComponentText("Enjoy a free altitude boost!"));
				this.posY += 100;
				for(EntityWheel wheel : wheels)
				{
					if(wheel != null && worldObj != null)
					{
						wheel.posY += 100;
					}
				}				
			}
				 */ 



				getDriveableData().emergencyMode = false;
				//FlansMod.getPacketHandler().sendToServer(new PacketVehicleControl(this));
			}

			//master is online check
			if (getDriveableData().seatBelt != null && !getDriveableData().seatBelt.equals("null") && getDriveableData().seatBelt.length() != 0)
			{

				if(worldObj.getPlayerEntityByName(getDriveableData().seatBelt) == null) //check if master offline
				{
					//System.out.println("oh fuck master is offline: " + getDriveableData().seatBelt);
					//System.out.println("emergency mode status: " + getDriveableData().emergencyMode);

					if (getDriveableData().emergencyMode == false)
					{
						getDriveableData().emergencyMode = true; 
						//System.out.println("emergency mode enabled!");

						//respawn itself so turret grows back		
						rebirth();
					}


				}
			}
			//else
			//System.out.println("seatbelter is null ok");

			//System.out.println("from plane seatbelt: " + getDriveableData().seatBelt);
			//	System.out.println("nbt seatbelt: " + seatBeltTrue);


			//if(this.seats[0] == null)
			//	System.out.println("oh fuck pilot gone!");
		}
		//end of seatbelterino


		//dont spam emergency mode that much
		boolean isDivisibleBy10 = this.ticksExisted % 5 == 0;


		//emergency mode suck in driver
		if(getDriveableData().emergencyMode && isDivisibleBy10)
		{

			this.throttle = 1;

			varGear = false;

			List<Entity> foxes = this.worldObj.getEntitiesWithinAABBExcludingEntity(this, AxisAlignedBB.getBoundingBox(this.posX - 200, this.posY - 1000, this.posZ - 200, this.posX + 200, this.posY + 1000, this.posZ + 200));

			for (Entity stuff : foxes) {
				if (stuff instanceof EntityPlayer == false)
					continue;	

				EntityPlayer human = (EntityPlayer)stuff;

				//System.out.println("human name: " + human.getDisplayName());


				if (worldObj.getPlayerEntityByName(getDriveableData().seatBelt) == human)
				{
					human.mountEntity(this.seats[0]);
					//MinecraftServer.getServer().getCommandManager().executeCommand(MinecraftServer.getServer(), "/tp " + getDriveableData().seatBelt + " " + this.posX + " " + this.posY+1 + " " + this.posZ);
					//System.out.println("Attempted to suck back into plane!");
				}




			}
		}
		//end of emergency mode stuff




		//landbrake reset to 0 when button not held
		if(driveableData.landBrake > 0)
			driveableData.landBrake --;


		if(initiatedAnim && throttle > 0.2F)
		{
			Vector3f v = anim.getFullPosition(new Vector3f(151, -25, -24), anim.parts.get(5));
			v = axes.findLocalVectorGlobally(new Vector3f(-v.x, -v.y, v.z));
			Vector3f v2 = anim.getFullPosition(new Vector3f(151, -25, 24), anim.parts.get(8));

			v2 = axes.findLocalVectorGlobally(new Vector3f(-v2.x, -v2.y, v2.z));
			for(int i = 0; i < 4; i++){
				if(!(Float.isNaN(v.x))){
					//FlansMod.proxy.spawnParticle("flansmod.afterburn", posX+v2.x/16F, posY+(v2.y/16F), posZ+(v2.z/16F), 0, 0F, 0);
					FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("flansmod.afterburn",posX + v2.x/16F, posY + v2.y/16F, posZ + v2.z/16F, 0,0,0),posX + v2.x/16F, posY + v2.y/16F, posZ + v2.z/16F, 150, dimension);
				}
				if(!(Float.isNaN(v.x)))
				{
					//FlansMod.proxy.spawnParticle("flansmod.afterburn", posX+v.x/16F, posY+(v.y/16F), posZ+(v.z/16F), 0, 0F, 0);
					FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("flansmod.afterburn",posX + v.x/16F, posY + v.y/16F, posZ + v.z/16F, 0,0,0),posX + v.x/16F, posY + v.y/16F, posZ + v.z/16F, 150, dimension);
				}
			}

		}



		//Get plane type
		PlaneType type = getPlaneType();
		DriveableData data = getDriveableData();
		if(type == null)
		{
			FlansMod.log("Plane type null. Not ticking plane");
			return;
		}

		
		if(this.ticksExisted == 10 ) //let non carrier planes mount for doolittle raid
		{
				double checkCarrierRange = 20;
			if (type.carrierLandable || type.parasitePlane || type.helipadLandable) //so carrier planes wont warp all over the place and vibrate like dildo
				checkCarrierRange = 3;
			
			List carrier = worldObj.getEntitiesWithinAABB(EntitySeat.class, AxisAlignedBB.getBoundingBox(posX - checkCarrierRange, posY - checkCarrierRange, posZ - checkCarrierRange, posX + checkCarrierRange, posY + checkCarrierRange, posZ + checkCarrierRange));
			//if(type.carrierLandable==true && this.ticksExisted == 20 || type.helipadLandable==true && this.ticksExisted == 20 || type.parasitePlane==true && this.ticksExisted == 20) //allow doolittle
			{ 	
				if(riddenByEntity != null && riddenByEntity instanceof EntityPlane && !(riddenByEntity instanceof EntityPlayer))
				{
					riddenByEntity.mountEntity(null);

				}
				for(Object obj : carrier)
				{
					EntitySeat carrierSpot = (EntitySeat)obj;
					if(obj!= null && carrierSpot != null && carrierSpot.seatInfo != null && ( (carrierSpot.riddenByEntity == null && carrierSpot.seatInfo.carrier == true) || (carrierSpot.riddenByEntity == null && carrierSpot.seatInfo.helipad == true && type.helipadLandable == true) || (carrierSpot.riddenByEntity == null && carrierSpot.seatInfo.hardpoint == true && type.parasitePlane == true)  )   ) //last || option is to allow land based planes to doolittle
					{

						if(carrierSpot.driveable != null && type.mass <= (carrierSpot.driveable).getDriveableType().weightLimit && (type.carrierLandable || (type.parasitePlane && carrierSpot.seatInfo.hardpoint) || (type.helipadLandable && carrierSpot.seatInfo.helipad) )) // check if too heavy
						{
							//System.out.println("land based plane? " + landPlace); failure
							this.mountEntity(carrierSpot);
						}
						else if ( type.mass <= 1.5f*(carrierSpot.driveable).getDriveableType().weightLimit) //allow 1.5x overweight for doolittle raids
						{

							this.mountEntity(carrierSpot);
						}
						// if WAY too heavy, do not even mount
					}

				}
			}
		}

		//switch f-14 to subsonic mode by default
		if(type.swapInitialWing && this.ticksExisted == 30)
			anim.changeState(!this.afterBurning?0:1);

		//Work out if this is the client side and the player is driving
		boolean thePlayerIsDrivingThis = worldObj.isRemote && seats[0] != null && seats[0].riddenByEntity instanceof EntityPlayer && FlansMod.proxy.isThePlayer((EntityPlayer)seats[0].riddenByEntity);

		//Despawning
		ticksSinceUsed++;
		if(!worldObj.isRemote && seats[0].riddenByEntity != null)
			ticksSinceUsed = 0;
		if(!worldObj.isRemote && TeamsManager.planeLife > 0 && ticksSinceUsed > TeamsManager.planeLife * 20)
		{
			setDead();
		}

		if(this.worldObj.isRemote && (this.varFlare || this.ticksFlareUsing > 0))
		{
			if(this.ticksExisted % 5 ==0)
			{
				Vector3f dir = axes.findLocalVectorGlobally(new Vector3f(0,-0.5F,0));
				FlansMod.proxy.spawnParticle("flansmod.flare", this.posX, this.posY, this.posZ,
						dir.x,
						dir.y,
						dir.z);
			}
		}
		if(this.ticksFlareUsing > 0)
			this.ticksFlareUsing--;
		if(this.flareDelay > 0)
			this.flareDelay--;


		//	System.out.println(this.mode);



		//carrier plane auto mount after 1 second when first born
		



		//"landing" on deck
		if(this.mode == EnumPlaneMode.PLANE && type.carrierLandable  && this.throttle < 0.2f && (this.varGear || !type.needsGear) && driveableData.catapult == 0 ) // you must also be at a landing safe speed and have gear out
		{
			List carrierLanding = worldObj.getEntitiesWithinAABB(EntitySeat.class, AxisAlignedBB.getBoundingBox(posX - 3, posY - 1, posZ - 3, posX + 3, posY + 1, posZ + 3)); //smaller range so you actually have to "land" on the "deck"
			if(type.carrierLandable==true || type.helipadLandable==true || type.parasitePlane)
			{
				if(riddenByEntity != null && riddenByEntity instanceof EntityPlane && !(riddenByEntity instanceof EntityPlayer))
				{
					riddenByEntity.mountEntity(null);
					//System.out.println("carrier suction did this");

				}
				for(Object obj : carrierLanding)
				{
					EntitySeat carrierSpot = (EntitySeat)obj;
					if(obj!= null && carrierSpot != null && carrierSpot.seatInfo != null && ((carrierSpot.riddenByEntity == null && carrierSpot.seatInfo.carrier == true) || (carrierSpot.riddenByEntity == null && carrierSpot.seatInfo.helipad == true && type.helipadLandable == true) || (carrierSpot.riddenByEntity == null && carrierSpot.seatInfo.hardpoint == true && type.parasitePlane == true) ))
					{			

						if(carrierSpot.driveable != null && type.mass <= (carrierSpot.driveable).getDriveableType().weightLimit) // check if too heavy
							this.mountEntity(carrierSpot);
						else if ((EntityPlayer)seats[0].riddenByEntity != null)
						{
							((EntityPlayer)seats[0].riddenByEntity).addChatMessage(new ChatComponentText("Your aircraft (" + type.mass + " kg) is too heavy to dock! Weight limit: " + (carrierSpot.driveable).getDriveableType().weightLimit + " kg" ));
						}


					}

				}
			}
		}






		if(this.nintendoSwitchLite < 10)
			this.nintendoSwitchLite++;


		//exit timer
		if (this.exitTimer<type.exitTimer)
			this.exitTimer++;

		//thermal timer
		if(driveableData.thermalTimer > 0)
			driveableData.thermalTimer--;

		//repair timer
		if(this.ticksRepairing > 0)
			this.ticksRepairing --;



		//vaccine attempt
		if (this.exitTimer<0 && seats[0] != null)
		{

			//seats[0].riddenByEntity.setInvisible(false);
			if(seats[0] != null && (seats[0].riddenByEntity) != null)
			{
				//	this.getDriveableData().seatBelt = ""; //forget master
				seats[0].riddenByEntity.mountEntity(null);
				exitTimer = type.exitTimer;
			}
		}


		//clientside kick test for triggering seatcheck
		if (this.testerino > 5 && seats[0] != null)
		{
			if(worldObj.isRemote)
				seats[0].riddenByEntity = null;


		}

		//afterburner on throttle up
		if(this.afterBurning && type.hasAfterBurner)
		{
			if(throttle<1)
				throttle += 0.005F;
		}



		//supersonic noise
		if(this.afterBurning && throttle>0.5 && poopooTimer==0 && this.getSpeedXYZ()>1.7f)
		{

			FlansMod.packetHandler.sendToDonut(new PacketPlaySound(this.posX, this.posY,
					this.posZ, type.sonicBoomSound), this.posX, this.posY,
					this.posZ, 15, 120, this.dimension);


			this.poopooTimer = 140;
		}

		//Shooting, inventories, etc.
		//Decrement bomb and gun timers
		if(bombDelay > 0)
			bombDelay--;
		if(gunDelay > 0)
			gunDelay--;
		if(toggleTimer > 0)
			toggleTimer--;

		if(carrierTimer < 0)
			carrierTimer++;

		//sonicboom timer reset
		if(this.poopooTimer > 0)
			this.poopooTimer--;


		if(!varWing){
			wingPos = transformPart(wingPos, type.wingPos1, type.wingRate);
			wingRot = transformPart(wingRot, type.wingRot1, type.wingRotRate);
		} else {
			wingPos = transformPart(wingPos, type.wingPos2, type.wingRate);	
			wingRot = transformPart(wingRot, type.wingRot2, type.wingRotRate);
		}

		if(varGear){
			wingWheelPos = transformPart(wingWheelPos, type.wingWheelPos1, type.wingWheelRate);
			wingWheelRot = transformPart(wingWheelRot, type.wingWheelRot1, type.wingWheelRotRate);			
			coreWheelPos = transformPart(coreWheelPos, type.bodyWheelPos1, type.bodyWheelRate);
			coreWheelRot = transformPart(coreWheelRot, type.bodyWheelRot1, type.bodyWheelRotRate);
			tailWheelPos = transformPart(tailWheelPos, type.tailWheelPos1, type.tailWheelRate);
			tailWheelRot = transformPart(tailWheelRot, type.tailWheelRot1, type.tailWheelRotRate);

		} else {
			wingWheelPos = transformPart(wingWheelPos, type.wingWheelPos2, type.wingWheelRate);
			wingWheelRot = transformPart(wingWheelRot, type.wingWheelRot2, type.wingWheelRotRate);			
			coreWheelPos = transformPart(coreWheelPos, type.bodyWheelPos2, type.bodyWheelRate);
			coreWheelRot = transformPart(coreWheelRot, type.bodyWheelRot2, type.bodyWheelRotRate);
			tailWheelPos = transformPart(tailWheelPos, type.tailWheelPos2, type.tailWheelRate);
			tailWheelRot = transformPart(tailWheelRot, type.tailWheelRot2, type.tailWheelRotRate);
		}

		if(!varDoor){
			doorPos = transformPart(doorPos, type.doorPos1, type.doorRate);
			doorRot = transformPart(doorRot, type.doorRot1, type.doorRotRate);
		} else {
			doorPos = transformPart(doorPos, type.doorPos2, type.doorRate);
			doorRot = transformPart(doorRot, type.doorRot2, type.doorRotRate);
		}

		if(!worldObj.isAirBlock((int)posX, (int)(posY-10), (int)posZ) && throttle <= 0.2){

			//labjac damage control attempt

			for(EntitySeat seat : seats)
				if(seat != null)
					//damage control machine
				{
					if(!varGear && type.needsGear && seats != null && seats[0] != null && seats[0].riddenByEntity != null && (EntityPlayer)seats[0].riddenByEntity != null && poopooTimer == 0 && !this.mounted) //covered with a fuck ton of bonus nullticker vaccines

					{
						//keyboard only exists clientside so must worldobj remote this
						//((EntityPlayer)seats[0].riddenByEntity).addChatMessage(new ChatComponentText("Low Altitude! Press " + Keyboard.getKeyName(KeyInputHandler.gearKey.getKeyCode()) + " to Deploy Landing Gear!"));
						if(worldObj.isRemote)
							((EntityPlayer)seats[0].riddenByEntity).addChatMessage(new ChatComponentText("Low Altitude! Deploy Landing Gear!")); //had to remove button prompt since kept causign crashes
						else
							((EntityPlayer)seats[0].riddenByEntity).addChatMessage(new ChatComponentText("Low Altitude! Deploy Landing Gear!"));
						poopooTimer = 60;
					}
				} //close damage control
			//varGear = true;
			if(type.foldWingForLand){
				if(varWing && (EntityPlayer)seats[0].riddenByEntity != null){
					((EntityPlayer)seats[0].riddenByEntity).addChatMessage(new ChatComponentText("Extending wings"));
				}
				varWing = false;
			}
		}

		if(!worldObj.isAirBlock((int)posX, (int)(posY-3), (int)posZ) && throttle <= 0.05){
			if(!doorsHaveShut){
				varDoor = true;
			}
			doorsHaveShut = true;
		} else if(!type.flyWithOpenDoor){
			varDoor = false;
			doorsHaveShut = false;
		}

		if(locked){
			varDoor = false;
			doorsHaveShut = false;
		}
		//lose airworthiness without tail
		if(!isPartIntact(EnumDriveablePart.tail) && type.spinWithoutTail)
		{flapsYaw = 15;
		//if lost airworthiness and plane drowned, then die
		if (isInWater())
			attackPart(EnumDriveablePart.core, DamageSource.cactus, 10);	
		}

		//Return the flaps to their resting position
		flapsYaw *= 0.9F;
		flapsPitchLeft *= 0.9F;
		flapsPitchRight *= 0.9F;

		//Limit flap angles
		if(flapsYaw > 20)
			flapsYaw = 20;
		if(flapsYaw < -20)
			flapsYaw = -20;
		if(flapsPitchRight > 20)
			flapsPitchRight = 20;
		if(flapsPitchRight < -20)
			flapsPitchRight = -20;
		if(flapsPitchLeft > 20)
			flapsPitchLeft = 20;
		if(flapsPitchLeft < -20)
			flapsPitchLeft = -20;

		//Player is not driving this. Update its position from server update packets
		if(worldObj.isRemote && !thePlayerIsDrivingThis)
		{
			//The driveable is currently moving towards its server position. Continue doing so.
			if (serverPositionTransitionTicker > 0)
			{
				double x = posX + (serverPosX - posX) / serverPositionTransitionTicker;
				double y = posY + (serverPosY - posY) / serverPositionTransitionTicker;
				double z = posZ + (serverPosZ - posZ) / serverPositionTransitionTicker;
				double dYaw = MathHelper.wrapAngleTo180_double(serverYaw - axes.getYaw());
				double dPitch = MathHelper.wrapAngleTo180_double(serverPitch - axes.getPitch());
				double dRoll = MathHelper.wrapAngleTo180_double(serverRoll - axes.getRoll());
				rotationYaw = (float)(axes.getYaw() + dYaw / serverPositionTransitionTicker);
				rotationPitch = (float)(axes.getPitch() + dPitch / serverPositionTransitionTicker);
				float rotationRoll = (float)(axes.getRoll() + dRoll / serverPositionTransitionTicker);
				--serverPositionTransitionTicker;
				setPosition(x, y, z);
				setRotation(rotationYaw, rotationPitch, rotationRoll);
				//return;
			}
			//If the driveable is at its server position and does not have the next update, it should just simulate itself as a server side plane would, so continue
		}

		if(type.labjacFuel>15)
		{
			if(labjacFuel<=0)
			{
				throttle=0;
				afterBurning=false;
			}

			//refuel superfast in a carrier
			if(mounted && labjacFuel<type.labjacFuel)
				labjacFuel+=50;

			//parasite planes
			if(type.parasitePlane && mounted && this.ridingEntity != null && this.ridingEntity instanceof EntitySeat && ((EntitySeat)this.ridingEntity).driveable instanceof EntityPlane)
			{
				EntityDriveable Mothership = ((EntitySeat)this.ridingEntity).driveable;
				this.rotationPitch = Mothership.rotationPitch;
				this.rotationYaw = Mothership.rotationYaw;
				this.varGear = false;
				//System.out.println("kamikaze loaded");
			}


			//refuel if parked on ground
			if(labjacFuel<type.labjacFuel && throttle<=0.1 && throttle > -0.1 && worldObj.isAirBlock((int)posX, (int)(posY+1), (int)posZ) && !worldObj.isAirBlock((int)posX, (int)(posY-10), (int)posZ))
				labjacFuel+=30;

			//prevent overflow
			if(labjacFuel>type.labjacFuel)
				labjacFuel=type.labjacFuel;

			//fuel consumption based on throttle and afterburning, and also back to -10 if no afterburner at all
			if(throttle>0.05f&&afterBurning)
				labjacFuel -=10f*(float)throttle*type.afterBurnFuelPenalty;
			else if (throttle>0.05f && !afterBurning)
				labjacFuel -=10f*(float)throttle;


		}

		if(mounted)
		{
			if(mode != EnumPlaneMode.HELI) //no cataboost for heli
				driveableData.catapult = 44;

			varGear = true;

			this.rotationPitch *= 0.9f;


			//if(type.parasitePlane) //give 5 second window of safety for kamikazes mothership
			accidentDelay = 100;

			if(mode != EnumPlaneMode.HELI || throttle > 0.5f) //let heli have high throttle
				throttle *= 0.97f;

			if(!type.parasitePlane) //parasite planes should match mothersip speed
				this.control.V *= 0.95f;

			//maybe this will prevent vibration?
			/*
			this.motionX *= 0.69f;
			this.motionY *= 0.69f;
			this.motionZ *= 0.69f;
			 */

			//attempt 2
			if(this.ridingEntity!=null && this.ridingEntity instanceof EntitySeat && type.parasitePlane)
			{
				EntitySeat Seat = (EntitySeat)ridingEntity;
				if(Seat != null && Seat.driveable != null)
				{
					EntityDriveable Mothership = (EntityDriveable)Seat.driveable;
					this.motionX = Mothership.motionX;
					this.motionY = Mothership.motionY;
					this.motionZ = Mothership.motionZ;
					if(Mothership instanceof EntityPlane)
					{
						EntityPlane Mommy = (EntityPlane)Mothership;
						if (Mommy.control != null && this.control != null)
							this.control.V = Mommy.control.V;  //match mothership speed
					}


				}
			} 


			if(throttle <= 0.05f && this.ticksExisted % 10 == 0) //fold wings on carrier
			{
				if(!type.carrierWingFlip) //in case modeled weirdly, config can swap wing fold
					varWing = false;
				else
					varWing = true;

				anim.changeState(this.varWing?0:1);
				//System.out.println("swapped varWing:" + varWing);

			}

		}

		if(throttle>0.05f && this.ticksExisted % 10 == 0 && !type.AfterburnWing) //un fold wings
		{
			if(!type.carrierWingFlip) //in case modeled weirdly, config can swap wing fold
				varWing = true;
			else
				varWing = false;

			anim.changeState(this.varWing?0:1);
			//System.out.println("swapped varWing:" + varWing);

		}



		if(driveableData.catapult < 44 && driveableData.catapult > 0)
		{
			this.throttle += 0.025f;
			FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("cloud",this.posX, this.posY, this.posZ , 0,0,0),this.posX, this.posY , this.posZ, 150, this.dimension);
		}


		//carrier announcement message   fuck it crashes if you place vehicles too much must scrap :(    - nvm my iq is high enough now to fix the null pointers


		if(worldObj != null)
		{
			if(type.carrierLandable && this.ticksExisted>40 || type.helipadLandable && this.ticksExisted>40)
			{
				List carrier = worldObj.getEntitiesWithinAABB(EntitySeat.class, AxisAlignedBB.getBoundingBox(posX - 20, posY - 20, posZ - 20, posX + 20, posY + 20, posZ + 20));
				//System.out.println("it tried finding entity");
				for(Object obj : carrier)
				{
					if (obj instanceof EntitySeat == false)
						continue;	

					if(obj instanceof EntitySeat)
					{
						EntitySeat carrierSpot = (EntitySeat)obj;
						//System.out.println("it found a carrier spot");

						//added even more extra anti-crash vaccines
						if(carrierSpot.seatInfo != null && ( ( carrierSpot.riddenByEntity == null && carrierSpot.seatInfo.carrier == true) || ( carrierSpot.riddenByEntity == null && carrierSpot.seatInfo.helipad == true && type.helipadLandable == true) ) )
						{			
							data.carrierTip ++;
							data.carrierTip ++;
							//System.out.println("its trying to tip : " + data.carrierTip);
						}


					}

				}
			}		
		}
		//tickhandler doesnt like it if i try booleans
		if(data.carrierTip>0)
			data.carrierTip --;

		if(data.carrierTip>5)
			data.carrierTip = 5;




		//Movement

		boolean canThrust = (seats[0] != null && seats[0].riddenByEntity instanceof EntityPlayer && ((EntityPlayer)seats[0].riddenByEntity).capabilities.isCreativeMode) || data.fuelInTank > 0;

		//Throttle handling
		//Without a player, default to 0
		//With a player default to 0.5 for helicopters (hover speed)
		//And default to the range 0.25 ~ 0.5 for planes (taxi speed ~ take off speed)
		float throttlePull = 0.99F;
		if(seats[0] != null && seats[0].riddenByEntity != null && mode == EnumPlaneMode.HELI && canThrust)
		{
			if(type.rocketThrottle && throttle > 0.1F && fuelTimer>0)
			{
				throttle = 1F; 
				fuelTimer--;
			}
			else if (fuelTimer <= 0)
				throttle=0;
			else
				throttle = (throttle - 0.5F) * throttlePull + 0.5F;
		}

		//if(!this.mounted) //maybe turn off flight model to fix jittering?
		control.fly(this);
		/*
		if(this.mounted && type.parasitePlane && this.ridingEntity != null && this.ridingEntity instanceof EntitySeat)
		{
			EntitySeat seat = (EntitySeat)this.ridingEntity;
			//System.out.println("seats looking: " + seat.pitc);
			System.out.println("my rotation: " + this.rotationYaw);
			this.rotationPitch = 0;
			//this.rotationYaw = seat.looking;
		} 
		 */
		double motion = Math.sqrt(motionX * motionX + motionY * motionY + motionZ * motionZ);
		if(motion > 10)
		{
			motionX *= 10 / motion;
			motionY *= 10 / motion;
			motionZ *= 10 / motion;
		}

		for(EntityWheel wheel : wheels)
		{
			if(wheel != null && worldObj != null)
			{
				if(type.floatOnWater && worldObj.isAnyLiquid(this.boundingBox))
				{
					this.motionY = type.buoyancy;
				}
				if(type.floatOnWater==false && worldObj.isAnyLiquid(this.boundingBox))
				{
					throttle = 0;
				}
			}
		}



		//Move the wheels first
		for(EntityWheel wheel : wheels)
		{
			if(wheel != null)
			{
				wheel.prevPosY = wheel.posY;
				wheel.moveEntity(motionX, (onDeck)?0:motionY, motionZ);
			}
		}

		correctWheelPos();

		//Update wheels
		for(int i = 0; i < 2; i++)
		{
			Vector3f amountToMoveCar = new Vector3f(motionX / 2F, (onDeck)?0:motionY / 2F, motionZ / 2F);

			for(EntityWheel wheel : wheels)
			{
				if(wheel == null)
					continue;

				//Hacky way of forcing the car to step up blocks
				onGround = true;
				wheel.onGround = true;

				//Update angles
				wheel.rotationYaw = axes.getYaw();

				//Pull wheels towards car
				Vector3f wPos = getPlaneType().wheelPositions[wheel.ID].position;
				if(type.valkyrie && varWing) wPos = new Vector3f(wPos.x, wPos.y + 90/16F, wPos.z);
				Vector3f targetWheelPos = axes.findLocalVectorGlobally(wPos);
				Vector3f currentWheelPos = new Vector3f(wheel.posX - posX, wheel.posY - posY, wheel.posZ - posZ);

				float targetWheelLength = targetWheelPos.length();
				float currentWheelLength = currentWheelPos.length();

				float dLength = targetWheelLength - currentWheelLength;
				float dAngle = Vector3f.angle(targetWheelPos, currentWheelPos);

				//if(dLength > 0.01F || dAngle > 1F)
				{
					//Now Lerp by wheelSpringStrength and work out the new positions
					float newLength = currentWheelLength + dLength * type.wheelSpringStrength;
					Vector3f rotateAround = Vector3f.cross(targetWheelPos, currentWheelPos, null);

					Matrix4f mat = new Matrix4f();
					mat.m00 = currentWheelPos.x;
					mat.m10 = currentWheelPos.y;
					mat.m20 = currentWheelPos.z;
					mat.rotate(dAngle * type.wheelSpringStrength, rotateAround);

					if(this.ticksExisted > 5)
					{
						if(!(type.valkyrie && anim.timeSinceSwitch < 10))
							axes.rotateGlobal(-dAngle * type.wheelSpringStrength, rotateAround);
					}

					Vector3f newWheelPos = new Vector3f(mat.m00, mat.m10, mat.m20);
					newWheelPos.normalise().scale(newLength);

					//The proportion of the spring adjustment that is applied to the wheel. 1 - this is applied to the plane
					float wheelProportion = 0.75F;

					//wheel.motionX = (newWheelPos.x - currentWheelPos.x) * wheelProportion;
					//wheel.motionY = (newWheelPos.y - currentWheelPos.y) * wheelProportion;
					//wheel.motionZ = (newWheelPos.z - currentWheelPos.z) * wheelProportion;

					Vector3f amountToMoveWheel = new Vector3f();

					amountToMoveWheel.x = (newWheelPos.x - currentWheelPos.x) * (1F - wheelProportion);
					amountToMoveWheel.y = (newWheelPos.y - currentWheelPos.y) * (1F - wheelProportion);
					amountToMoveWheel.z = (newWheelPos.z - currentWheelPos.z) * (1F - wheelProportion);

					amountToMoveCar.x -= (newWheelPos.x - currentWheelPos.x) * (1F - wheelProportion);
					amountToMoveCar.y -= (newWheelPos.y - currentWheelPos.y) * (1F - wheelProportion);
					amountToMoveCar.z -= (newWheelPos.z - currentWheelPos.z) * (1F - wheelProportion);

					//The difference between how much the wheel moved and how much it was meant to move. i.e. the reaction force from the block
					//amountToMoveCar.x += ((wheel.posX - wheel.prevPosX) - (motionX)) * 0.616F / wheels.length;
					amountToMoveCar.y += ((wheel.posY - wheel.prevPosY) - ((onDeck)?0:motionY)) * 0.5F / wheels.length;
					//amountToMoveCar.z += ((wheel.posZ - wheel.prevPosZ) - (motionZ)) * 0.0616F / wheels.length;

					wheel.moveEntity(amountToMoveWheel.x, amountToMoveWheel.y, amountToMoveWheel.z);
				}
			}

			moveEntity(amountToMoveCar.x, amountToMoveCar.y, amountToMoveCar.z);

		}

		if(this.ridingEntity != null)
		{
			if(this.ridingEntity.getClass().toString().indexOf("mcheli.aircraft.MCH_EntitySeat") > 0)
			{
				axes.setAngles(this.ridingEntity.rotationYaw+90, 0, 0);
			}
		}

		checkForCollisions();

		//Sounds
		//Starting sound
		if (throttle > 0.01F && throttle < 0.2F && soundPosition == 0)
		{
			PacketPlaySound.sendSoundPacket(posX, posY, posZ, FlansMod.soundRange, dimension, type.startSound, false);
			soundPosition = type.startSoundLength;
		}
		//Flying sound
		if (throttle > 0.2F && soundPosition == 0)
		{
			PacketPlaySound.sendSoundPacket(posX, posY, posZ, FlansMod.soundRange, dimension, type.engineSound, false);
			soundPosition = type.engineSoundLength;
		}		

		//Sound decrementer
		if(soundPosition > 0)
			soundPosition--;

		if(stukaSoundDelay > 0)
			stukaSoundDelay--;

		for(EntitySeat seat : seats)
		{
			//if((seat != null && seat.riddenByEntity != null ) || (seat != null && seat.riddenByEntity == null && this.ticksExisted % 10 ==0) ) 
			if((seat != null && seat.riddenByEntity != null && seat.riddenByEntity instanceof EntityPlane) || (seat != null && seat.riddenByEntity != null && seat.riddenByEntity instanceof EntityPlayer) || (seat != null && seat.riddenByEntity != null && this.ticksExisted % 4 == 0) || (seat != null && seat.riddenByEntity == null && this.ticksExisted % 10 == 0) ) 
				seat.updatePosition();  //case 1: if human driver, instant update     case 2: non human passenger 4x slow     case 3: empty seat  10x slow
		}


		int packetRate = 1; //for seatkick reduction???


		//Calculate movement on the client and then send position, rotation etc to the server
		if(thePlayerIsDrivingThis && this.ticksExisted % 1 == 0)
		{
			FlansMod.getPacketHandler().sendToServer(new PacketPlaneControl(this));
			FlansMod.getPacketHandler().sendToServer(new PacketPlaneAnimator(this));

			serverPosX = posX;
			serverPosY = posY;
			serverPosZ = posZ;
			serverYaw = axes.getYaw();
		}

		//If this is the server, send position updates to everyone, having received them from the driver
		float updateSpeed = 0.01F;
		if(!worldObj.isRemote && this.ticksExisted % packetRate == 0)// && (Math.abs(posX - prevPosX) > updateSpeed || Math.abs(posY - prevPosY) > updateSpeed || Math.abs(posZ - prevPosZ) > updateSpeed))
		{
			FlansMod.getPacketHandler().sendToAllAround(new PacketPlaneControl(this), posX, posY, posZ, FlansMod.driveableUpdateRange, dimension);
			FlansMod.getPacketHandler().sendToAllAround(new PacketPlaneAnimator(this), posX, posY, posZ, FlansMod.driveableUpdateRange, dimension);

		}

	}

	@Override
	public void setDead()
	{
		super.setDead();
		for(EntityWheel wheel : wheels)
			if(wheel != null)
				wheel.setDead();
	}

	@Override
	public boolean gearDown()
	{
		return varGear;
	}

	public boolean attackEntityFrom(DamageSource damagesource, float i, boolean doDamage)
	{
		PlaneType type = PlaneType.getPlane(driveableType);
		if(worldObj.isRemote || isDead || damagesource.damageType.equals("arrow")|| !type.vanillaDamage && damagesource.damageType.equals("player") && !(seats[0] == null || seats[0].riddenByEntity == null || type.evilGolem))
			return true;

		if(damagesource.damageType.equals("player") && damagesource.getEntity().onGround && (seats[0] == null || seats[0].riddenByEntity == null) && !(locked && owner != Factions.getFactionFromPlayer((EntityPlayer) damagesource.getEntity())) && !type.unpunchable){
			driveableData.seatBelt = "null"; //forget master
			ItemStack planeStack = new ItemStack(type.item, 1, driveableData.paintjobID);
			planeStack.stackTagCompound = new NBTTagCompound();
			driveableData.writeToNBT(planeStack.stackTagCompound);
			entityDropItem(planeStack, 0.5F);
			setDead();
		}
		return super.attackEntityFrom(damagesource, i);
	}

	@Override
	public boolean canHitPart(EnumDriveablePart part)
	{
		return varGear || (part != EnumDriveablePart.coreWheel && part != EnumDriveablePart.leftWingWheel && part != EnumDriveablePart.rightWingWheel && part != EnumDriveablePart.tailWheel);
	}

	@Override
	public boolean attackEntityFrom(DamageSource damagesource, float i)
	{
		return attackEntityFrom(damagesource, i, true);
	}

	public PlaneType getPlaneType()
	{
		return PlaneType.getPlane(driveableType);
	}

	@Override
	protected void dropItemsOnPartDeath(Vector3f midpoint, DriveablePart part)
	{
	}

	public Vector3f transformPart(Vector3f current, Vector3f target, Vector3f rate){
		Vector3f newPos = current;

		if(Math.sqrt((current.x - target.x)*(current.x - target.x)) > rate.x/2){
			if(current.x > target.x){
				current.x = current.x - rate.x;
			} else if (current.x < target.x){
				current.x = current.x + rate.x;
			}
		} else {
			current.x = target.x;
		}

		if(Math.sqrt((current.y - target.y)*(current.y - target.y)) > rate.y/2){
			if(current.y > target.y){
				current.y = current.y - rate.y;
			} else if (current.y < target.y){
				current.y = current.y + rate.y;
			}
		} else {
			current.y = target.y;
		}

		if(Math.sqrt((current.z - target.z)*(current.z - target.z)) > rate.z/2){
			if(current.z > target.z){
				current.z = current.z - rate.z;
			} else if (current.z < target.z){
				current.z = current.z + rate.z;
			}
		} else {
			current.z = target.z;
		}

		return newPos;
	}

	@Override
	public String getBombInventoryName()
	{
		return "Bombs";
	}

	@Override
	public String getMissileInventoryName()
	{
		return "Missiles";
	}

	@Override
	public boolean hasMouseControlMode()
	{
		return true;
	}
}
