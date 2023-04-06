package com.flansmod.common.network;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import com.flansmod.common.driveables.EntityDriveable;
import com.flansmod.common.driveables.EntityPlane;
import com.flansmod.common.driveables.EntityVehicle;

public class PacketDriveableControl extends PacketBase
{
	public int entityId;
	public double posX, posY, posZ;
	public double prevPosX, prevPosY, prevPosZ;
	public float yaw, pitch, roll;
	public double motX, motY, motZ;
	public float avelx, avely, avelz;
	public float throttle;
	public float throttlePeepee; //for background button pressing measurements to help me play with throttle in more detail
	//for missile control
	public float pitchSignal;
	public float yawSignal;
	//for epic ships TM
	public int bouyancy;
	public int morale;
	public int landBrake;
	public int catapult;
	public int thermalTimer;
	public int scopeTimer;
	public float fuelInTank;
	public int sinkLimit;
	public int sinkingTimer;
	public int repairLimit;
	public int repairingTimer;
//	public int ticksRepairing;
	public float steeringYaw;
	public float recoilPos;
	public float lastRecoilPos;
	public float propAngle;
	public float prevPropAngle;
	public float rotorAngle;
	public float prevRotorAngle;
	public boolean flare;
	public boolean activeRadar;
	public boolean repairerino;
	public boolean afterBurning;
	public boolean mounted;
	public boolean canFire;
	public boolean reload;
	public int stage;
	public int stageDelay;
	
	public PacketDriveableControl() {}
	
	public PacketDriveableControl(EntityDriveable driveable)
	{
		entityId = driveable.getEntityId();
		posX = driveable.posX;
		posY = driveable.posY;
		posZ = driveable.posZ;
		prevPosX = driveable.prevPosX;
		prevPosY = driveable.prevPosY;
		prevPosZ = driveable.prevPosZ;
		yaw = driveable.axes.getYaw();
		pitch = driveable.axes.getPitch();
		roll = driveable.axes.getRoll();
		motX = driveable.motionX;
		motY = driveable.motionY;
		motZ = driveable.motionZ;
		avelx = driveable.angularVelocity.x;
		avely = driveable.angularVelocity.y;
		avelz = driveable.angularVelocity.z;
		throttle = driveable.throttle;
		throttlePeepee = driveable.throttlePeepee;
		pitchSignal = driveable.pitchSignal;
		yawSignal = driveable.yawSignal;
		morale = driveable.driveableData.morale;
		landBrake = driveable.driveableData.landBrake;
		catapult = driveable.driveableData.catapult;
		thermalTimer = driveable.driveableData.thermalTimer;
		scopeTimer = driveable.driveableData.scopeTimer;
//		ticksRepairing = driveable.ticksRepairing;

//		bouyancy = driveable.driveableData.bouyancy;
		fuelInTank = driveable.driveableData.fuelInTank;
		sinkingTimer = driveable.driveableData.sinkingTimer;
		sinkLimit = driveable.driveableData.sinkLimit;
		repairingTimer = driveable.driveableData.repairingTimer;
		repairLimit = driveable.driveableData.repairLimit;
		recoilPos = driveable.recoilPos;
		lastRecoilPos = driveable.lastRecoilPos;
		flare = driveable.ticksFlareUsing > 0;
		activeRadar = driveable.activeRadar;
		repairerino = driveable.ticksRepairing > 0;
		afterBurning = driveable.afterBurning;
		mounted = driveable.mounted;
		if(driveable instanceof EntityVehicle)
		{
			EntityVehicle veh = (EntityVehicle)driveable;
			steeringYaw = veh.wheelsYaw;
		}
		else if(driveable instanceof EntityPlane)
		{
			EntityPlane plane = (EntityPlane)driveable;
			steeringYaw = plane.flapsYaw;
		}
		propAngle = driveable.propAngle;
		prevPropAngle = driveable.prevPropAngle;
		rotorAngle = driveable.rotorAngle;
		prevRotorAngle = driveable.prevRotorAngle;
		stage = driveable.stage;
		stageDelay = driveable.reloadAnimTime;
		canFire = driveable.canFireIT1;
		reload = driveable.reloadingDrakon;
	}
		
	@Override
	public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) 
	{
    	data.writeInt(entityId);
    	data.writeDouble(posX);
    	data.writeDouble(posY);
    	data.writeDouble(posZ);
    	data.writeDouble(prevPosX);
    	data.writeDouble(prevPosY);
    	data.writeDouble(prevPosZ);
    	data.writeFloat(yaw);
    	data.writeFloat(pitch);
    	data.writeFloat(roll);
    	data.writeDouble(motX);
    	data.writeDouble(motY);
    	data.writeDouble(motZ);
    	data.writeFloat(avelx);
    	data.writeFloat(avely);
    	data.writeFloat(avelz);
    	data.writeFloat(throttle);
    	data.writeFloat(throttlePeepee);
    	data.writeFloat(pitchSignal);
    	data.writeFloat(yawSignal);
    	data.writeInt(morale);
    	data.writeInt(landBrake);
    	data.writeInt(catapult);
    	data.writeInt(thermalTimer);
    	data.writeInt(scopeTimer);
    	data.writeInt(bouyancy);
    	data.writeFloat(fuelInTank);
    	data.writeInt(sinkingTimer);
    	data.writeInt(sinkLimit);
    	data.writeInt(repairingTimer);
    	data.writeInt(repairLimit);
    	data.writeFloat(steeringYaw);
    	data.writeFloat(recoilPos);
    	data.writeFloat(lastRecoilPos);
    	data.writeFloat(propAngle);
    	data.writeFloat(prevPropAngle); 
    	data.writeFloat(rotorAngle);
    	data.writeFloat(prevRotorAngle); 
    	data.writeBoolean(flare);
    	data.writeBoolean(activeRadar);
    	data.writeBoolean(repairerino);
       	data.writeBoolean(afterBurning);
       	data.writeBoolean(mounted);
    	data.writeInt(stage);
  //  	data.writeInt(ticksRepairing);
    	data.writeInt(stageDelay);
    	data.writeBoolean(canFire);
    	data.writeBoolean(reload);
	}

	@Override
	public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) 
	{
		entityId = data.readInt();
		posX = data.readDouble();
		posY = data.readDouble();
		posZ = data.readDouble();
		prevPosX = data.readDouble();
		prevPosY = data.readDouble();
		prevPosZ = data.readDouble();
		yaw = data.readFloat();
		pitch = data.readFloat();
		roll = data.readFloat();
		motX = data.readDouble();
		motY = data.readDouble();
		motZ = data.readDouble();
		avelx = data.readFloat();
		avely = data.readFloat();
		avelz = data.readFloat();
		throttle = data.readFloat();
		throttlePeepee = data.readFloat();
		pitchSignal = data.readFloat();
		yawSignal = data.readFloat();
		morale = data.readInt();
		landBrake = data.readInt();
		catapult = data.readInt();
		thermalTimer = data.readInt();
		scopeTimer = data.readInt();
		bouyancy = data.readInt();
		fuelInTank = data.readFloat();
		sinkingTimer = data.readInt();
		sinkLimit = data.readInt();
		repairingTimer = data.readInt();
		repairLimit = data.readInt();
		steeringYaw = data.readFloat();
		recoilPos = data.readFloat();
		lastRecoilPos = data.readFloat();
		propAngle = data.readFloat();
		prevPropAngle = data.readFloat();
		rotorAngle = data.readFloat();
		prevRotorAngle = data.readFloat();
		flare = data.readBoolean();
		activeRadar = data.readBoolean();
		repairerino = data.readBoolean();
		afterBurning = data.readBoolean();
		mounted = data.readBoolean();
		stage = data.readInt();
		stageDelay = data.readInt();
		canFire = data.readBoolean();
		reload = data.readBoolean();
	}


	@Override
	public void handleServerSide(EntityPlayerMP playerEntity) 
	{
		EntityDriveable driveable = null;
		for(Object obj : playerEntity.worldObj.loadedEntityList)
		{
			if(obj instanceof EntityDriveable && ((Entity)obj).getEntityId() == entityId)
			{
				driveable = (EntityDriveable)obj;
				break;
			}
		}
		if(driveable != null)
			updateDriveable(driveable, false);
	}
	
	protected void updateDriveable(EntityDriveable driveable, boolean clientSide)
	{
		driveable.setPositionRotationAndMotion(posX, posY, posZ, yaw, pitch, roll, motX, motY, motZ, avelx, avely, avelz, throttle, steeringYaw, throttlePeepee);
		driveable.pitchSignal = pitchSignal;
		driveable.yawSignal = yawSignal;
		driveable.prevPosX = prevPosX;
		driveable.prevPosY = prevPosY;
		driveable.prevPosZ = prevPosZ;
		driveable.driveableData.fuelInTank = fuelInTank;
		driveable.driveableData.sinkingTimer = sinkingTimer;
		driveable.driveableData.repairingTimer = repairingTimer;
		driveable.recoilPos = recoilPos;
		driveable.lastRecoilPos = lastRecoilPos;
		//plane.setPropPosition(propAngle, prevPropAngle);
		driveable.propAngle = propAngle;
		driveable.prevPropAngle = propAngle;
		//plane.setRotorPosition(rotorAngle, prevRotorAngle);
		driveable.rotorAngle = rotorAngle;
		driveable.prevRotorAngle = prevRotorAngle;
		driveable.varFlare= flare;
		driveable.activeRadar=activeRadar;
		driveable.varRepair= repairerino;
		driveable.afterBurning=afterBurning;
		driveable.mounted=mounted;
		//driveable.key = key;
		driveable.driveableData.morale=morale;
		driveable.driveableData.landBrake=landBrake;
		driveable.driveableData.catapult=catapult;
		driveable.driveableData.sinkLimit=sinkLimit;
		driveable.driveableData.repairLimit=repairLimit;
	//	driveable.ticksRepairing = ticksRepairing;
		driveable.driveableData.thermalTimer=thermalTimer;
		driveable.driveableData.scopeTimer=scopeTimer;
		if(driveable.getDriveableType().IT1)
		{
			driveable.setIT1(canFire, reload, stage, stageDelay);
		}

	}

	@Override
	@SideOnly(Side.CLIENT)
	public void handleClientSide(EntityPlayer clientPlayer) 
	{
		if(clientPlayer == null || clientPlayer.worldObj == null)
			return;
		EntityDriveable driveable = null;
		for(Object obj : clientPlayer.worldObj.loadedEntityList)
		{
			if(obj instanceof EntityDriveable && ((Entity)obj).getEntityId() == entityId)
			{
				driveable = (EntityDriveable)obj;
				driveable.driveableData.fuelInTank = fuelInTank;
				driveable.driveableData.sinkLimit = sinkLimit;
				driveable.driveableData.sinkingTimer = sinkingTimer;
				driveable.driveableData.repairLimit = repairLimit;
				driveable.driveableData.repairingTimer = repairingTimer;
				if(driveable.seats[0] != null && driveable.seats[0].riddenByEntity == clientPlayer)
					return;
				break;
			}
		}
		if(driveable != null){
			updateDriveable(driveable, true);
		}
	}
}
