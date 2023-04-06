package com.flansmod.common.driveables;

import java.util.ArrayList;

public enum EnumDriveablePart 
{
	//Plane parts
	tailWheel(new EnumDriveablePart[] { }, "tailWheel", "Wheel (Tail)"),
	tail(new EnumDriveablePart[] { tailWheel }, "tail", "Tail"),
	bay(new EnumDriveablePart[] { tail }, "bay", "Bay"),
	topWing(new EnumDriveablePart[] {}, "topWing", "Top Wing"),
	leftWingWheel(new EnumDriveablePart[] { }, "leftWingWheel", "Wheel (Left Wing)"),
	leftWing(new EnumDriveablePart[] { topWing, leftWingWheel }, "leftWing", "Left Wing"),
	rightWingWheel(new EnumDriveablePart[] { }, "rightWingWheel", "Wheel (Right Wing)"),
	rightWing(new EnumDriveablePart[] { topWing, rightWingWheel }, "rightWing", "Right Wing"),
	nose(new EnumDriveablePart[] { }, "nose", "Nose"),
	coreWheel(new EnumDriveablePart[] { }, "coreWheel", "Wheel (Core)"),
	
	//Helicopter parts
	skids(new EnumDriveablePart[] { }, "skids", "Skids"),
	blades(new EnumDriveablePart[] { }, "blades", "Blades"),
	
	//Vehicle parts
	turret(new EnumDriveablePart[] { }, "turret", "Turret"),
	backWheel(new EnumDriveablePart[] { }, "backWheel", "Back Wheel"),
	frontWheel(new EnumDriveablePart[] { }, "frontWheel", "Front Wheel"),
	backLeftWheel(new EnumDriveablePart[] { }, "backLeftWheel", "Back Left Wheel"),	
	frontLeftWheel(new EnumDriveablePart[] { }, "frontLeftWheel", "Front Left Wheel"),
	backRightWheel(new EnumDriveablePart[] { }, "backRightWheel", "Back Right Wheel"),
	frontRightWheel(new EnumDriveablePart[] { }, "frontRightWheel", "Front Right Wheel"),
	leftTrack(new EnumDriveablePart[] { }, "leftTrack", "Left Track"),
	rightTrack(new EnumDriveablePart[] { }, "rightTrack", "Right Track"),
	trailer(new EnumDriveablePart[] { }, "trailer", "AdditionArmor"),	
	harvester(new EnumDriveablePart[] { }, "harvester", "Harvester"),	//This is the drill bit, combine blades or excavator for utility vehicles
	//New parts
	frontalArmor(new EnumDriveablePart[] { }, "frontalArmor", "Frontal Armor"),
	leftsideArmor(new EnumDriveablePart[] { }, "leftsideArmor", "Left Side Armor"),
	rightsideArmor(new EnumDriveablePart[] { }, "rightsideArmor", "Right Side Armor"),
	additionalArmor(new EnumDriveablePart[] { }, "additionalArmor", "Additional Armor"),
	ERA(new EnumDriveablePart[] { }, "ERA", "ERA"),
	APS(new EnumDriveablePart[] { }, "APS", "APS"),
	ADS(new EnumDriveablePart[] { }, "ADS", "ADS"),
	//LabJac parts
	composite(new EnumDriveablePart[] { }, "composite", "Composite Armor"),
	composite2(new EnumDriveablePart[] { }, "composite2", "More Comp Armor"),
	spaced(new EnumDriveablePart[] { }, "spaced", "Spaced Armor"),
	compositeL(new EnumDriveablePart[] { }, "compositeL", "Left Comp Armor"),
	compositeR(new EnumDriveablePart[] { }, "compositeR", "Right Comp Armor"),
	generic0(new EnumDriveablePart[] { }, "generic0", "Extra Armor"),
	generic1(new EnumDriveablePart[] { }, "generic1", "Extra Armor 1"),
	generic2(new EnumDriveablePart[] { }, "generic2", "Extra Armor 2"),
	generic3(new EnumDriveablePart[] { }, "generic3", "Extra Armor 3"),
	generic4(new EnumDriveablePart[] { }, "generic4", "Extra Armor 4"),
	generic5(new EnumDriveablePart[] { }, "generic5", "Extra Armor 5"),
	generic6(new EnumDriveablePart[] { }, "generic6", "Extra Armor 6"),
	generic7(new EnumDriveablePart[] { }, "generic7", "Extra Armor 7"),
	generic8(new EnumDriveablePart[] { }, "generic8", "Extra Armor 8"),
	generic9(new EnumDriveablePart[] { }, "generic9", "Extra Armor 9"),
	turret1(new EnumDriveablePart[] { }, "turret1", "Turret 1"),
	turret2(new EnumDriveablePart[] { }, "turret2", "Turret 2"),
	turret3(new EnumDriveablePart[] { }, "turret3", "Turret 3"),
	turret4(new EnumDriveablePart[] { }, "turret4", "Turret 4"),
	turret5(new EnumDriveablePart[] { }, "turret5", "Turret 5"),
	turret6(new EnumDriveablePart[] { }, "turret6", "Turret 6"),
	turret7(new EnumDriveablePart[] { }, "turret7", "Turret 7"),
	turret8(new EnumDriveablePart[] { }, "turret8", "Turret 8"),
	turret9(new EnumDriveablePart[] { }, "turret9", "Turret 9"),
	bias(new EnumDriveablePart[] { }, "russianBias", "Stalinium"),
	bulge(new EnumDriveablePart[] { }, "bulge", "Torpedo Bulge"),
	bulgel(new EnumDriveablePart[] { }, "bulgel", "Left Torpedo Bulge"),
	bulger(new EnumDriveablePart[] { }, "bulger", "Right Torpedo Bulge"),
	superstructure(new EnumDriveablePart[] { }, "superstructure", "Super Structure"),
	bow(new EnumDriveablePart[] { }, "bow", "Bow"),
	stern(new EnumDriveablePart[] { }, "stern", "Stern"),
	midsection(new EnumDriveablePart[] { }, "midsection", "Midsection"),
	left(new EnumDriveablePart[] { }, "left", "Center Port"),
	right(new EnumDriveablePart[] { }, "right", "Center Starboard"),
	citadel(new EnumDriveablePart[] { }, "citadel", "Citadel"),
	belt(new EnumDriveablePart[] { }, "belt", "Armor Belt"),
	beltl(new EnumDriveablePart[] { }, "beltl", "Left Armor Belt"),
	beltr(new EnumDriveablePart[] { }, "beltr", "Right Armor Belt"),
	deck(new EnumDriveablePart[] { }, "deck", "Deck"),
	steering(new EnumDriveablePart[] { }, "steering", "Steering System"),
	ERA2(new EnumDriveablePart[] { }, "ERA2", "More ERA"),
	ERA3(new EnumDriveablePart[] { }, "ERA3", "Even More ERA"),
	infantry(new EnumDriveablePart[] { }, "infantry", "Meat Shield"),
	turretarmor(new EnumDriveablePart[] { }, "turretarmor", "Turret Armor"),
	moreturretarmor(new EnumDriveablePart[] { }, "moreturretarmor", "Turret Comp Armor"),
	turretside(new EnumDriveablePart[] { }, "turretside", "Turret Side Armor"),
	airframe(new EnumDriveablePart[] { }, "airframe", "Air Frame"),
	gasbag(new EnumDriveablePart[] { }, "gasbag", "Gas Bag"),
	buoyancy(new EnumDriveablePart[] { }, "buoyancy", "Buoyancy"),
	shield(new EnumDriveablePart[] { }, "shield", "Energy Shield"),
	
	//new weak spots
	turretWeak(new EnumDriveablePart[] { }, "weakTrt", "Turret Weak Spot"),
	turretWeak2(new EnumDriveablePart[] { }, "weakTrt2", "Turret Weak Spot"),
	engine(new EnumDriveablePart[] { }, "engine", "Engine"),
	engine2(new EnumDriveablePart[] { }, "engine2", "Engine 2"),
	engine3(new EnumDriveablePart[] { }, "engine3", "Engine 3"),
	engine4(new EnumDriveablePart[] { }, "engine4", "Engine 4"),
	engine5(new EnumDriveablePart[] { }, "engine5", "Engine 5"),
	engine6(new EnumDriveablePart[] { }, "engine6", "Engine 6"),
	weakSpot(new EnumDriveablePart[] { }, "weakSpot", "Weak Spot"),
	weakSpot2(new EnumDriveablePart[] { }, "weakSpot2", "Weak Spot"),
	weakSpot3(new EnumDriveablePart[] { }, "weakSpot3", "Weak Spot"),
	
	//Mecha parts
	leftArm(new EnumDriveablePart[] { }, "leftArm", "Left Arm"),
	rightArm(new EnumDriveablePart[] { }, "rightArm", "Right Arm"),
	head(new EnumDriveablePart[] { }, "head", "Head"),
	hips(new EnumDriveablePart[] { }, "hips", "Hips"),
	barrel(new EnumDriveablePart[] { }, "barrel", "Barrel"),

	//Shared part
	core(new EnumDriveablePart[] { bay, leftWing, rightWing, nose, turret, coreWheel, leftArm, rightArm, head, hips, blades, skids, backWheel, frontWheel, backLeftWheel, frontLeftWheel, backRightWheel, frontRightWheel, leftTrack, rightTrack, trailer, harvester, infantry }, "core", "Core");
	
	private String shortName;
	private String name;
	private EnumDriveablePart[] children;
	
	private EnumDriveablePart(EnumDriveablePart[] parts, String s, String s2)
	{
		children = parts;
		shortName = s;
		name = s2;
	}
	
	/** Used to determine what falls off when this part is broken */
	public EnumDriveablePart[] getChildren()
	{
		return children;
	}
	
	/** Used to determine when parts can be stuck back on */
	public EnumDriveablePart[] getParents()
	{
		ArrayList<EnumDriveablePart> parents = new ArrayList<EnumDriveablePart>();
		for(EnumDriveablePart part : values())
		{
			for(EnumDriveablePart childPart : part.getChildren())
			{
				if(childPart == this)
					parents.add(part);
			}
		}
		return parents.toArray(new EnumDriveablePart[parents.size()]);
	}
	
	public String getShortName()
	{
		return shortName;
	}
	
	public String getName()
	{
		return name;
	}
	
	/** For reading parts from driveable files */
	public static EnumDriveablePart getPart(String s)
	{
		for(EnumDriveablePart part : values())
			if(part.getShortName().equals(s))
				return part;
		return null;
	}
	
	public static boolean isWheel(EnumDriveablePart part)
	{
		return part == coreWheel || part == tailWheel || part == leftWingWheel || part == rightWingWheel;
	}
}
