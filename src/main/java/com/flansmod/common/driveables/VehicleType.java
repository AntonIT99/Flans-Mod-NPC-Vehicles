package com.flansmod.common.driveables;

import java.util.ArrayList;

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.common.FlansMod;
import com.flansmod.common.driveables.DriveableType.ParticleEmitter;
import com.flansmod.common.types.TypeFile;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.common.vector.Vector3i;

public class VehicleType extends DriveableType
{
	public float WeakspotCookTime = 3;
	/** Movement modifiers */
	public float turnLeftModifier = 1F, boostLimit = 3F, decelModifier = 1F, accelModifier = 1F, brakeModifier = 1F, turnRightModifier = 1F, diveSpeed = 1F, surfaceSpeed = 1F;
	/** If true, this will crush any living entity under the wheels */
	public boolean squashMobs = false;
	/** If this is true, the vehicle will drive from all wheels */
	public boolean fourWheelDrive = false;
	/** If true, then wheels will rotate as the vehicle drives */
	public boolean rotateWheels = false;
	/** Tank movement system. Uses track collision box for thrust, rather than the wheels */
	public boolean tank = false;

	/** Shoot delays */
	public int vehicleShootDelay, vehicleShellDelay;
	/** Aesthetic door variable */
    public boolean hasDoor = false;
  public boolean canDabOnEntity = false;
    public boolean airship = false;
	public float maxAltitude = 269f;
	//theres a sea level for bullets too because labjac incompetance
	public int seaLevel = 55;

    
    
    
	//Door animations
	public Vector3f doorPos1 = new Vector3f(0,0,0);
	public Vector3f doorPos2 = new Vector3f(0,0,0);
	public Vector3f doorRot1 = new Vector3f(0,0,0);
	public Vector3f doorRot2 = new Vector3f(0,0,0);
	public Vector3f doorRate = new Vector3f(0,0,0);
	public Vector3f doorRotRate = new Vector3f(0,0,0);
	
	public Vector3f door2Pos1 = new Vector3f(0,0,0);
	public Vector3f door2Pos2 = new Vector3f(0,0,0);
	public Vector3f door2Rot1 = new Vector3f(0,0,0);
	public Vector3f door2Rot2 = new Vector3f(0,0,0);
	public Vector3f door2Rate = new Vector3f(0,0,0);
	public Vector3f door2RotRate = new Vector3f(0,0,0);
	
	public float animationMultiplier = 1;
	public float driftMultiplier = 0.1f;
	
	public boolean shootWithOpenDoor = false;
	
	public int trackLinkFix = 5;
	public boolean flipLinkFix = false;
	
	public String driftSound = "";
	public int driftSoundLength;
	
	public ArrayList<SmokePoint> smokers = new ArrayList<SmokePoint>();
	public float Zoom;
	
	//for not cruise control
	public boolean raceCar;
	public boolean unpunchable = false;
	
	//for driving over sand/dirt/snow/grass speed multiplier
	public float terrainPenalty = 0.5f;
	
	//if disabled, tank wont self destruct when dead turret
	//set to fals eby default now because coping - nevermind revived again! Sorry onionman
	public boolean needsTurret = true;
	
	//enable thermal view
	public boolean thermalSight = false;
	
	//self repair ported to non ship
	public boolean canRepair = true;
	
	
	public boolean shiftSides = false;
	public boolean marioKart = true; //experimental driving model



	@SuppressWarnings("hiding")
	public static ArrayList<VehicleType> types = new ArrayList<VehicleType>();

    public VehicleType(TypeFile file)
    {
		super(file);
		types.add(this);
    }

    @Override
	public void preRead(TypeFile file)
    {
    	super.preRead(file);
    	wheelPositions = new DriveablePosition[4];
    }

    @Override
	public void postRead(TypeFile file)
    {
    	super.postRead(file);
    }

    @Override
	protected void read(String[] split, TypeFile file)
	{
		super.read(split, file);
		try
		{
			//Movement modifiers
			if(split[0].equals("canRepair"))
				canRepair = Boolean.parseBoolean(split[1].toLowerCase());
			
			//self repair
			if(split[0].equals("SquashMobs"))
				squashMobs = Boolean.parseBoolean(split[1].toLowerCase());
			
			if(split[0].equals("nuDrivingModel"))
				marioKart = Boolean.parseBoolean(split[1].toLowerCase());			
			
			//labjac ship revolution
			if(split[0].equals("epicShip"))
			{
				epicShip = Boolean.parseBoolean(split[1]);
				explosionPush = 0; //automatically makes ships immune to explosion pushes
				
				overheatLimit = 3000; //bigger number because 90000 aa guns for most ships
				overheatPenalty = 100;
				coolingBonus = 20;
				
				animationMultiplier = 0.25f;
				driftMultiplier = 1.25f;				
				centralControl = true;
			}
			
			
			//multiplier for vehicle silly animations
			if(split[0].equals("animationMultiplier"))
				animationMultiplier = Float.parseFloat(split[1]);
			if(split[0].equals("driftMultiplier"))
				driftMultiplier = Float.parseFloat(split[1]);
			
			
			
			//overheat stuff    also allows player to overwrite default ship numbers
		    if(split[0].equals("overheatLimit"))
                overheatLimit = Integer.parseInt(split[1]);
		    else
		    	overheatLimit = 500; //fire default
		    
		    if(split[0].equals("overheatPenalty"))
		    	overheatPenalty = Integer.parseInt(split[1]);
		    else
		    	overheatPenalty = 100; //fire default
		    
		    if(split[0].equals("coolingBonus"))
		    	coolingBonus = Integer.parseInt(split[1]);
		    else
		    	coolingBonus = 4; //fire default
		    
			
			if(split[0].equals("TurnLeftSpeed"))
			{
				turnLeftModifier = Float.parseFloat(split[1]);
				if (epicShip)
					turnLeftModifier = 1.75f*Float.parseFloat(split[1]);
			}
			if(split[0].equals("TurnRightSpeed"))
			{
				turnRightModifier = Float.parseFloat(split[1]);
				if (epicShip)
					turnRightModifier = 1.75f*Float.parseFloat(split[1]);
			}
			
			//lajac airship
			if(split[0].equals("maxAltitude"))
				maxAltitude = Float.parseFloat(split[1]);
			if(split[0].equals("seaLevel"))
				seaLevel = Integer.parseInt(split[1]);
			if(split[0].equals("TurnRightSpeed"))
				turnRightModifier = Float.parseFloat(split[1]);
			if(split[0].equals("SquashMobs"))
				squashMobs = Boolean.parseBoolean(split[1].toLowerCase());
			
			if(split[0].equals("switchSides"))
				shiftSides = Boolean.parseBoolean(split[1].toLowerCase());
            if(split[0].equals("FourWheelDrive"))
            	fourWheelDrive = Boolean.parseBoolean(split[1].toLowerCase());
            if(split[0].equals("Tank") || split[0].equals("TankMode"))
            	tank = Boolean.parseBoolean(split[1].toLowerCase());
            //labjac speeds
			if(split[0].equals("AccelerationSpeed"))
				accelModifier = Float.parseFloat(split[1]);
			if(split[0].equals("DiveSpeed"))
				diveSpeed = Float.parseFloat(split[1]);
			if(split[0].equals("SurfaceSpeed"))
				surfaceSpeed = Float.parseFloat(split[1]);
			if(split[0].equals("BrakeMultiplier"))
				brakeModifier = Float.parseFloat(split[1]);
			if(split[0].equals("BoostLimit"))
				boostLimit = Float.parseFloat(split[1]);
			if(split[0].equals("DecelerationSpeed"))
				decelModifier = Float.parseFloat(split[1]);
			
			
			if(split[0].equals("terrainPenalty"))
				terrainPenalty = Float.parseFloat(split[1]);
			
			
			//labjac weakspot
			if(split[0].equals("WeakspotCookTime"))
				WeakspotCookTime = Float.parseFloat(split[1]);
			if(split[0].equals("unpunchable"))
				unpunchable = Boolean.parseBoolean(split[1].toLowerCase());
			
			//thermal sight
            if(split[0].equals("thermalSight"))
            	thermalSight = Boolean.parseBoolean(split[1].toLowerCase());
			
			if(split[0].equals("canDabOnEntity"))
				canDabOnEntity = Boolean.parseBoolean(split[1].toLowerCase());
            //Visuals
            if(split[0].equals("HasDoor"))
                hasDoor = Boolean.parseBoolean(split[1].toLowerCase());
            if(split[0].equals("ShootWithOpenDoor"))
                shootWithOpenDoor = Boolean.parseBoolean(split[1].toLowerCase());
            
            //labjac submarines
            if(split[0].equals("canDive"))
                canDive = Boolean.parseBoolean(split[1].toLowerCase());
            if(split[0].equals("airship"))
                airship = Boolean.parseBoolean(split[1].toLowerCase());
            
            //not cruise control
            if(split[0].equals("raceCar"))
            	raceCar = Boolean.parseBoolean(split[1].toLowerCase());
            
            //labjac fancy sinking ship system
            if(split[0].equals("fancyShip"))
            	fancyShip = Boolean.parseBoolean(split[1].toLowerCase());
            
            
            if(split[0].equals("RotateWheels"))
            	rotateWheels = Boolean.parseBoolean(split[1].toLowerCase());
            if(split[0].equals("FixTrackLink"))
            	trackLinkFix = Integer.parseInt(split[1].toLowerCase());
            if(split[0].equals("FlipLinkFix"))
            	flipLinkFix = Boolean.parseBoolean(split[1].toLowerCase());
            
            //disable it to prevent self destructing tank when turret loss
            if(split[0].equals("needsTurret"))
            	needsTurret = Boolean.parseBoolean(split[1].toLowerCase());
            
            //Animations
            if(split[0].equals("DoorPosition1"))
            	doorPos1 = new Vector3f(split[1], shortName);
            if(split[0].equals("DoorPosition2"))
            	doorPos2 = new Vector3f(split[1], shortName);
            if(split[0].equals("DoorRotation1"))
            	doorRot1 = new Vector3f(split[1], shortName);
            if(split[0].equals("DoorRotation2"))
            	doorRot2 = new Vector3f(split[1], shortName);
            if(split[0].equals("DoorRate"))
            	doorRate = new Vector3f(split[1], shortName);
            if(split[0].equals("DoorRotRate"))
            	doorRotRate = new Vector3f(split[1], shortName);
            
            if(split[0].equals("Door2Position1"))
            	door2Pos1 = new Vector3f(split[1], shortName);
            if(split[0].equals("Door2Position2"))
            	door2Pos2 = new Vector3f(split[1], shortName);
            if(split[0].equals("Door2Rotation1"))
            	door2Rot1 = new Vector3f(split[1], shortName);
            if(split[0].equals("Door2Rotation2"))
            	door2Rot2 = new Vector3f(split[1], shortName);
            if(split[0].equals("Door2Rate"))
            	door2Rate = new Vector3f(split[1], shortName);
            if(split[0].equals("Door2RotRate"))
            	door2RotRate = new Vector3f(split[1], shortName);
            
           
            
            
			//Armaments
			if(split[0].equals("ShootDelay"))
				vehicleShootDelay = Integer.parseInt(split[1]);
			if(split[0].equals("ShellDelay"))
				vehicleShellDelay = Integer.parseInt(split[1]);


			//Sound
			if(split[0].equals("ShootSound"))
			{
				shootSoundPrimary = split[1];
				FlansMod.proxy.loadSound(contentPack, "driveables", split[1]);
			}
			if(split[0].equals("ShellSound"))
			{
				shootSoundSecondary = split[1];
				FlansMod.proxy.loadSound(contentPack, "driveables", split[1]);
			}
			else if(split[0].equals("DriftSoundLength"))
				driftSoundLength = Integer.parseInt(split[1]);
			else if(split[0].equals("DriftSound"))
			{
				driftSound = split[1];
				FlansMod.proxy.loadSound(contentPack, "driveables", split[1]);
			}
			if(split[0].equalsIgnoreCase("AddSmokePoint") || split[0].equalsIgnoreCase("AddSmokeDispenser"))
			{
				SmokePoint smoke = new SmokePoint();
				smoke.position = new Vector3f(split[1], shortName);
				smoke.direction = new Vector3f(split[2], shortName);
				smoke.detTime = Integer.parseInt(split[3]);
				smoke.part = split[4];
				smokers.add(smoke);
			}
		}
		catch (Exception ignored)
		{
		}
	}

	public static VehicleType getVehicle(String find)
	{
		for(VehicleType type : types)
		{
			if(type.shortName.equals(find))
				return type;
		}
		return null;
	}
	
	public class SmokePoint
	{
		public Vector3f position;
		public Vector3f direction;
		public int detTime;
		public String part;
	}

	/** To be overriden by subtypes for model reloading */
	public void reloadModel()
	{
		model = FlansMod.proxy.loadModel(modelString, shortName, ModelVehicle.class);
	}
}