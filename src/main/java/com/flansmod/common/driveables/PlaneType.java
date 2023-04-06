package com.flansmod.common.driveables;

import java.util.ArrayList;

import net.minecraft.item.ItemStack;

import com.flansmod.client.model.ModelPlane;
import com.flansmod.common.FlansMod;
import com.flansmod.common.parts.PartType;
import com.flansmod.common.types.TypeFile;
import com.flansmod.common.vector.Vector3f;

public class PlaneType extends DriveableType
{
	/** What type of flying vehicle is this? */
	public EnumPlaneMode mode = EnumPlaneMode.PLANE;	
	/** Pitch modifiers */
	public float lookDownModifier = 1F, lookUpModifier = 1F;
	/** Roll modifiers */
	public float rollLeftModifier = 1F, rollRightModifier = 1F;
	/** Yaw modifiers */
	public float turnLeftModifier = 1F, turnRightModifier = 1F;
	/** Co-efficient of lift which determines how the plane flies */
	public float lift = 1F;
	
	/** The point at which bomb entities spawn */
	public Vector3f bombPosition;
	/** The time in ticks between bullets fired by the nose / wing guns */
	public int planeShootDelay;
	/** The time in ticks between bombs dropped */
	public int planeBombDelay;
	
	public float ceiling = 800f;
	
	//default is high performance jet when afterburner on
	public float speedLimit = 2f;
	public float speedLimitHigh = 4f;
	
	//default is stuck under mach 1
	public float speedLimitDry = 1f;
	public float speedLimitHighDry = 1.5f;
	
	//Wing Animations
	public Vector3f wingPos1 = new Vector3f(0,0,0);
	public Vector3f wingPos2 = new Vector3f(0,0,0);
	public Vector3f wingRot1 = new Vector3f(0,0,0);
	public Vector3f wingRot2 = new Vector3f(0,0,0);
	public Vector3f wingRate = new Vector3f(0,0,0);
	public Vector3f wingRotRate = new Vector3f(0,0,0);
	
	//Wing Wheel Animations
	public Vector3f wingWheelPos1 = new Vector3f(0,0,0);
	public Vector3f wingWheelPos2 = new Vector3f(0,0,0);
	public Vector3f wingWheelRot1 = new Vector3f(0,0,0);
	public Vector3f wingWheelRot2 = new Vector3f(0,0,0);
	public Vector3f wingWheelRate = new Vector3f(0,0,0);
	public Vector3f wingWheelRotRate = new Vector3f(0,0,0);
	
	//Body Wheel Animations
	public Vector3f bodyWheelPos1 = new Vector3f(0,0,0);
	public Vector3f bodyWheelPos2 = new Vector3f(0,0,0);
	public Vector3f bodyWheelRot1 = new Vector3f(0,0,0);
	public Vector3f bodyWheelRot2 = new Vector3f(0,0,0);
	public Vector3f bodyWheelRate = new Vector3f(0,0,0);
	public Vector3f bodyWheelRotRate = new Vector3f(0,0,0);
	
	//Tail Wheel Animations
	public Vector3f tailWheelPos1 = new Vector3f(0,0,0);
	public Vector3f tailWheelPos2 = new Vector3f(0,0,0);
	public Vector3f tailWheelRot1 = new Vector3f(0,0,0);
	public Vector3f tailWheelRot2 = new Vector3f(0,0,0);
	public Vector3f tailWheelRate = new Vector3f(0,0,0);
	public Vector3f tailWheelRotRate = new Vector3f(0,0,0);
	
	//Door animations
	public Vector3f doorPos1 = new Vector3f(0,0,0);
	public Vector3f doorPos2 = new Vector3f(0,0,0);
	public Vector3f doorRot1 = new Vector3f(0,0,0);
	public Vector3f doorRot2 = new Vector3f(0,0,0);
	public Vector3f doorRate = new Vector3f(0,0,0);
	public Vector3f doorRotRate = new Vector3f(0,0,0);
	
	/** The positions, parent parts and recipe items of the propellers, used to calculate forces and render the plane correctly */
	public ArrayList<Propeller> propellers = new ArrayList<Propeller>();
	/** The positions, parent parts and recipe items of the helicopter propellers, used to calculate forces and render the plane correctly */
	public ArrayList<Propeller> heliPropellers = new ArrayList<Propeller>(), heliTailPropellers = new ArrayList<Propeller>();
				
	/** Aesthetic features */
    public boolean hasGear = false, hasDoor = false, hasWing = false;
    public boolean foldWingForLand = false;
    public boolean flyWithOpenDoor = false;
    /** Default pitch for when parked. Will implement better system soon */
    public float restingPitch = 0F;
    
    public boolean spinWithoutTail = false;
    
    public boolean valkyrie = false;
    //labjac carrier
    public boolean carrierLandable = false;
    public boolean helipadLandable = false;
    public boolean parasitePlane = false;
    //labjac energy fighter these are multiplier factors also divefactor was abandoned
    public float planeDiveFactor = 0.5f;
    public float deathDiveSpeedLimit = 1.2f;
    public float stallSpeedLimit = 1.9f;
    

    
    /** Whether the player can access the inventory while in the air */
    public boolean invInflight = true;
	public float yawBonus = 1.2f;
	public float pitchBonus = 1.2f;
	public float rollBonus = 1.2f;
	public float yawStall = 0.5f;
	public float pitchStall = 0.5f;
	public float rollStall = 0.5f;
	//afterburners use about 3x fuel cringe!
	public float afterBurnFuelPenalty=3f;
	//for random maneuvrability recoil while shooting
	public boolean gunRecoil = true;
	public boolean swapInitialWing = false;
	public boolean unpunchable = false;
	public float noStallAngle = 15;
	//for misssile model display
	public boolean missileVisible = false;
	//for position of missile model(s)
	public float missileWingSpan = 4;
	public float missileForward = -1;
	public float missileElevation = -1;
	
	//so dill will stop coping about slugglish 50% throttle
	public float afterburnOffBonus = 1.5f;
	
	//nu flight model
	public float mass = 4000;
	public float area = 22;
	public float cruiseSpeed = 362;
	public float takeoffSpeed = 100;
	public float climbRate = 5;
	public float maxSpeed = 440;
	public float turnTime = 0;
	public float accelBonus = 1; //for artifically buffing planes with horrible takeoff
	public float gravityMultiplier = 1;
	
	public boolean carrierWingFlip = false; //for folded wings when parked on carrier flipping if wing modelled backwards
	public boolean AfterburnWing = false; //so afterburn f-14 wings can behave differently than
	public boolean AfterburnWingFlipped=false;
	public boolean needsGear = true;  //set to false for primitive planes with gear always out
	
	//in case you want to artificially buff certain aspects of a plane like fw-190 unnaturally good roll
	public float yawBoost = 1;
	public float rollBoost = 1;
	public float pitchBoost = 1;



	@SuppressWarnings("hiding")
	public static ArrayList<PlaneType> types = new ArrayList<PlaneType>();
	
    public PlaneType(TypeFile file)
    {
		super(file);
		types.add(this);
    }
    
    @Override
    public void preRead(TypeFile file)
    {
    	super.preRead(file);
    }
    
    @Override
	protected void read(String[] split, TypeFile file)
	{
		super.read(split, file);
		try
		{		
			//Plane Mode
			if(split[0].equals("Mode"))
				mode = EnumPlaneMode.getMode(split[1]);
			//labjac fine tuning modifiers in case automatic system is too samey for individual planes
			if(split[0].equals("yawBoost"))
				yawBoost = Float.parseFloat(split[1]);
			if(split[0].equals("rollBoost"))
				rollBoost = Float.parseFloat(split[1]);
			if(split[0].equals("pitchBoost"))
				pitchBoost = Float.parseFloat(split[1]);
			//Yaw modifiers
			if(split[0].equals("TurnLeftSpeed"))
				turnLeftModifier = Float.parseFloat(split[1]);
			if(split[0].equals("TurnRightSpeed"))
				turnRightModifier = Float.parseFloat(split[1]);
			if(split[0].equals("yawBonus"))
				yawBonus = Float.parseFloat(split[1]);
			if(split[0].equals("yawStall"))
				yawStall = Float.parseFloat(split[1]);
			//Pitch modifiers
			if(split[0].equals("LookUpSpeed"))
				lookUpModifier = Float.parseFloat(split[1]);
			if(split[0].equals("LookDownSpeed"))
				lookDownModifier = Float.parseFloat(split[1]);
			if(split[0].equals("pitchBonus"))
				pitchBonus = Float.parseFloat(split[1]);
			if(split[0].equals("pitchStall"))
				pitchStall = Float.parseFloat(split[1]);
			//Roll modifiers
			if(split[0].equals("RollLeftSpeed"))
				rollLeftModifier = Float.parseFloat(split[1]);
			if(split[0].equals("RollRightSpeed"))
				rollRightModifier = Float.parseFloat(split[1]);
			if(split[0].equals("rollBonus"))
				rollBonus = Float.parseFloat(split[1]);
			if(split[0].equals("rollStall"))
				rollStall = Float.parseFloat(split[1]);
			//new bonuses by labjac for extra maneuvrability if high energy
			
			//labjac fuel afterburner or wep fuel guzzlign penalty
			if(split[0].equals("afterBurnFuelPenalty"))
				afterBurnFuelPenalty = Float.parseFloat(split[1]);
			
			//maneuvrability bonus if afterburner is off
			if(split[0].equals("afterburnOffBonus"))
				afterburnOffBonus = Float.parseFloat(split[1]);
			
			//Lift
			if(split[0].equals("Lift"))
				lift = Float.parseFloat(split[1]);
				
			//Propellers and Armaments

			if(split[0].equals("ShootDelay"))
				planeShootDelay = Integer.parseInt(split[1]);
			if(split[0].equals("BombDelay"))
				planeBombDelay = Integer.parseInt(split[1]);
			
			//labjac
			if(split[0].equals("flightCeiling"))
				ceiling = Float.parseFloat(split[1]);
			//cringed 1.5 universal buff
			if(split[0].equals("diveBonus"))
				deathDiveSpeedLimit = Float.parseFloat(split[1]);
			if(split[0].equals("stallSuffering"))
				stallSpeedLimit = Float.parseFloat(split[1]);
			if(split[0].equals("maxSpeed"))
				speedLimit = Float.parseFloat(split[1]);
			if(split[0].equals("accelBonus"))
				accelBonus = Float.parseFloat(split[1]);
			if(split[0].equals("gravityMultiplier"))
				gravityMultiplier = Float.parseFloat(split[1]);
			if(split[0].equals("highAltMax"))
				speedLimitHigh = Float.parseFloat(split[1]);
			if(split[0].equals("maxSpeedDry"))
				speedLimitDry = Float.parseFloat(split[1]);
			if(split[0].equals("highAltMaxDry"))
				speedLimitHighDry = Float.parseFloat(split[1]);
			if(split[0].equals("planeDiveFactor"))
				planeDiveFactor = Float.parseFloat(split[1]);
            if(split[0].equals("carrierLandable"))
            	carrierLandable = Boolean.parseBoolean(split[1]);
            if(split[0].equals("helipadLandable"))
            	helipadLandable = Boolean.parseBoolean(split[1]);
            if(split[0].equals("gunRecoil"))
            	gunRecoil = Boolean.parseBoolean(split[1]);
            if(split[0].equals("unpunchable"))
            	unpunchable = Boolean.parseBoolean(split[1]);
            
            if(split[0].equals("parasitePlane"))
            	parasitePlane = Boolean.parseBoolean(split[1]);
            
            //neo flight model
            if(split[0].equals("mass"))
            	mass = Float.parseFloat(split[1]);
            if(split[0].equals("area"))
            	area = Float.parseFloat(split[1]);
            if(split[0].equals("cruiseSpeed"))
            	cruiseSpeed = Float.parseFloat(split[1]);
            if(split[0].equals("takeoffSpeed"))
            	takeoffSpeed = Float.parseFloat(split[1]);
            if(split[0].equals("climbRate"))
            	climbRate = 0.17f*Float.parseFloat(split[1]);
            if(split[0].equals("maximumSpeed"))
            	maxSpeed = Float.parseFloat(split[1]);
            if(split[0].equals("turnTime"))
            	turnTime = 0.5f*Float.parseFloat(split[1]);	//secret buff since my "data" assumes nonstop ring flight, not a true turn

            
            //to switch wing position once automatically
            if(split[0].equals("swapInitialWing"))
            	swapInitialWing = Boolean.parseBoolean(split[1]);
            
            //to see underwing model
            if(split[0].equals("missileVisible"))
            	missileVisible = Boolean.parseBoolean(split[1]);
            
            //positions for the missiles
			if(split[0].equals("missileWingSpan"))
				missileWingSpan = Float.parseFloat(split[1]);
			if(split[0].equals("missileForward"))
				missileForward = Float.parseFloat(split[1]);
			if(split[0].equals("missileElevation"))
				missileElevation = Float.parseFloat(split[1]);
            
            
            //max speed for helis
			if(split[0].equals("heliSpeedLimit"))
				speedLimit = Float.parseFloat(split[1]);
     
			
			//Propellers
			if(split[0].equals("Propeller"))
			{
				Propeller propeller = new Propeller(Integer.parseInt(split[1]), Integer.parseInt(split[2]), Integer.parseInt(split[3]), Integer.parseInt(split[4]), EnumDriveablePart.getPart(split[5]), PartType.getPart(split[6]));
				propellers.add(propeller);
				driveableRecipe.add(new ItemStack(propeller.itemType.item));
			}
			if(split[0].equals("HeliPropeller"))
			{
				Propeller propeller = new Propeller(Integer.parseInt(split[1]), Integer.parseInt(split[2]), Integer.parseInt(split[3]), Integer.parseInt(split[4]), EnumDriveablePart.getPart(split[5]), PartType.getPart(split[6]));
				heliPropellers.add(propeller);
				driveableRecipe.add(new ItemStack(propeller.itemType.item));
			}
			if(split[0].equals("HeliTailPropeller"))
			{
				Propeller propeller = new Propeller(Integer.parseInt(split[1]), Integer.parseInt(split[2]), Integer.parseInt(split[3]), Integer.parseInt(split[4]), EnumDriveablePart.getPart(split[5]), PartType.getPart(split[6]));
				heliTailPropellers.add(propeller);
				driveableRecipe.add(new ItemStack(propeller.itemType.item));
			}
			

			if(split[0].equals("HasFlare"))
				hasFlare = split[1].equals("True");
			if(split[0].equals("FlareDelay"))
			{
				flareDelay = Integer.parseInt(split[1]);
				if(flareDelay<=0)
					flareDelay = 1;
			}
			if(split[0].equals("TimeFlareUsing"))
			{
				timeFlareUsing = Integer.parseInt(split[1]);
				if(timeFlareUsing<=0)
					timeFlareUsing = 1;
			}

			//Sound
			if(split[0].equals("PropSoundLength"))
				engineSoundLength = Integer.parseInt(split[1]);
			if(split[0].equals("PropSound"))
			{
				engineSound = split[1];
				FlansMod.proxy.loadSound(contentPack, "driveables", split[1]);
			}
			if(split[0].equals("ShootSound"))
			{
				shootSoundPrimary = split[1];
				FlansMod.proxy.loadSound(contentPack, "driveables", split[1]);
			}
			if(split[0].equals("BombSound"))
			{
				shootSoundSecondary = split[1];
				FlansMod.proxy.loadSound(contentPack, "driveables", split[1]);
			}
			
			if(split[0].equals("StukaSoundLength"))
				stukaSoundLength = Integer.parseInt(split[1]);
			if(split[0].equals("StukaSoundRange"))
				stukaSoundRange = Integer.parseInt(split[1]);
			if(split[0].equals("StukaSpeed"))
				stukaSpeed = Integer.parseInt(split[1]);
			if(split[0].equals("StukaSound"))
			{
				stukaSound = split[1];
				FlansMod.proxy.loadSound(contentPack, "driveables", split[1]);
			}

			
			//Aesthetics
            if(split[0].equals("HasGear"))
                hasGear = split[1].equals("True");
            if(split[0].equals("HasDoor"))
                hasDoor = split[1].equals("True");
            if(split[0].equals("HasWing"))
                hasWing = split[1].equals("True");
            if(split[0].equals("FoldWingForLand"))
                foldWingForLand = split[1].equals("True");
            if(split[0].equals("FlyWithOpenDoor"))
                flyWithOpenDoor = split[1].equals("True");
            if(split[0].equals("RestingPitch"))
                restingPitch = Float.parseFloat(split[1]);
            if(split[0].equals("SpinWithoutTail"))
                spinWithoutTail = Boolean.parseBoolean(split[1]);
            if(split[0].equals("Valkyrie"))
                valkyrie = Boolean.parseBoolean(split[1]);
            
            //for wing behaviour when on a carrier and afterburning
            if(split[0].equals("AfterburnWing"))
            	AfterburnWing = Boolean.parseBoolean(split[1]);
            if(split[0].equals("AfterburnWingFlipped"))
            	AfterburnWingFlipped = Boolean.parseBoolean(split[1]);
            if(split[0].equals("carrierWingFlip"))
            	carrierWingFlip = Boolean.parseBoolean(split[1]);
            
            if(split[0].equals("needsGear")) //set to false for primitive planes with no retractable gear
            	needsGear = Boolean.parseBoolean(split[1]);          
            //Animations
            //Wings
            if(split[0].equals("WingPosition1"))
            	wingPos1 = new Vector3f(split[1], shortName);
            if(split[0].equals("WingPosition2"))
            	wingPos2 = new Vector3f(split[1], shortName);
            if(split[0].equals("WingRotation1"))
            	wingRot1 = new Vector3f(split[1], shortName);
            if(split[0].equals("WingRotation2"))
            	wingRot2 = new Vector3f(split[1], shortName);
            if(split[0].equals("WingRate"))
            	wingRate = new Vector3f(split[1], shortName);
            if(split[0].equals("WingRotRate"))
            	wingRotRate = new Vector3f(split[1], shortName);
            
            //Wing Wheels
            if(split[0].equals("WingWheelPosition1"))
            	wingWheelPos1 = new Vector3f(split[1], shortName);
            if(split[0].equals("WingWheelPosition2"))
            	wingWheelPos2 = new Vector3f(split[1], shortName);
            if(split[0].equals("WingWheelRotation1"))
            	wingWheelRot1 = new Vector3f(split[1], shortName);
            if(split[0].equals("WingWheelRotation2"))
            	wingWheelRot2 = new Vector3f(split[1], shortName);
            if(split[0].equals("WingWheelRate"))
            	wingWheelRate = new Vector3f(split[1], shortName);
            if(split[0].equals("WingWheelRotRate"))
            	wingWheelRotRate = new Vector3f(split[1], shortName);
            
            //Body Wheels
            if(split[0].equals("BodyWheelPosition1"))
            	bodyWheelPos1 = new Vector3f(split[1], shortName);
            if(split[0].equals("BodyWheelPosition2"))
            	bodyWheelPos2 = new Vector3f(split[1], shortName);
            if(split[0].equals("BodyWheelRotation1"))
            	bodyWheelRot1 = new Vector3f(split[1], shortName);
            if(split[0].equals("BodyWheelRotation2"))
            	bodyWheelRot2 = new Vector3f(split[1], shortName);
            if(split[0].equals("BodyWheelRate"))
            	bodyWheelRate = new Vector3f(split[1], shortName);
            if(split[0].equals("BodyWheelRotRate"))
            	bodyWheelRotRate = new Vector3f(split[1], shortName);
            
            //overheat but different default numbers for planes
          //overheat stuff
		    if(split[0].equals("overheatLimit"))
                overheatLimit = Integer.parseInt(split[1]);
		    else
		    	overheatLimit = 750; //fire default
		    
		    if(split[0].equals("overheatPenalty"))
		    	overheatPenalty = Integer.parseInt(split[1]);
		    else
		    	overheatPenalty = 240; //fire default
		    
		    if(split[0].equals("coolingBonus"))
		    	coolingBonus = Integer.parseInt(split[1]);
		    else
		    	coolingBonus = 4; //fire default
            
            //Tail Wheels
            if(split[0].equals("TailWheelPosition1"))
            	tailWheelPos1 = new Vector3f(split[1], shortName);
            if(split[0].equals("TailWheelPosition2"))
            	tailWheelPos2 = new Vector3f(split[1], shortName);
            if(split[0].equals("TailWheelRotation1"))
            	tailWheelRot1 = new Vector3f(split[1], shortName);
            if(split[0].equals("TailWheelRotation2"))
            	tailWheelRot2 = new Vector3f(split[1], shortName);
            if(split[0].equals("TailWheelRate"))
            	tailWheelRate = new Vector3f(split[1], shortName);
            if(split[0].equals("TailWheelRotRate"))
            	tailWheelRotRate = new Vector3f(split[1], shortName);
            
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
            
            //In-flight inventory
            if(split[0].equals("InflightInventory"))
                invInflight = split[1].equals("False");
		}
		catch (Exception ignored)
		{
		}
	}
    
    @Override
    public int numEngines()
    {
    	switch(mode)
    	{
    	case VTOL : return Math.max(propellers.size(), heliPropellers.size());
    	case PLANE : return propellers.size();
    	case HELI : return heliPropellers.size();
    	default : return 1;
    	}
    }
    
    /** Find the items needed to rebuild a part. The returned array is disconnected from the template items it has looked up */
    @Override
    public ArrayList<ItemStack> getItemsRequired(DriveablePart part, PartType engine)
    {
    	//Get the list of items required by the driveable
    	ArrayList<ItemStack> stacks = super.getItemsRequired(part, engine);
    	//Add the propellers and engines
    	for(Propeller propeller : propellers)
    	{
    		if(propeller.planePart == part.type)
    		{
	    		stacks.add(new ItemStack(propeller.itemType.item));
	    		stacks.add(new ItemStack(engine.item));
    		}
    	}
    	return stacks;
    }
    
	public static PlaneType getPlane(String find)
	{
		for(PlaneType type : types)
		{
			if(type.shortName.equals(find))
				return type;
		}
		return null;
	}
	
	/** To be overriden by subtypes for model reloading */
	public void reloadModel()
	{
		model = FlansMod.proxy.loadModel(modelString, shortName, ModelPlane.class);
	}
}