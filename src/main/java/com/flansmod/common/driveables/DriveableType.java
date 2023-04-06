package com.flansmod.common.driveables;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBase;
import net.minecraft.init.Items;
import net.minecraft.item.ItemDye;
import net.minecraft.item.ItemStack;

import com.flansmod.client.model.AnimTankTrack;
import com.flansmod.client.model.ModelDriveable;
import com.flansmod.common.FlansMod;
import com.flansmod.common.guns.BulletType;
import com.flansmod.common.guns.EnumFireMode;
import com.flansmod.common.guns.GunType;
import com.flansmod.common.paintjob.PaintableType;
import com.flansmod.common.parts.PartType;
import com.flansmod.common.types.InfoType;
import com.flansmod.common.types.TypeFile;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.common.driveables.ShootPoint;
import com.flansmod.common.driveables.collisions.CollisionShapeBox;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class DriveableType extends PaintableType{
	//@SideOnly(value = Side.CLIENT)
	/** The plane model */
	public ModelDriveable model;


	//labjac scopes for vehicles
	public String overlay = null;
	public String heliGUI = null;
	public boolean hasScope = false;

	//moved afterburn stuff here for tick handler
	public String afterBurnName = "Afterburner";
	public boolean hasAfterBurner = false;
	
	public boolean evilGolem = false; //evil ai ships
	public int evilRange = 188;
	public int evilGravity = 0; //tweak how much the evil ai adjusts its pitch to account for long range gravity ballistics
	public float evilSpread = 1; //spread multiplier for evil AA gun

	//auto smoke
	public boolean autoSmoke = false;

	//vanilla damage disable
	public boolean vanillaDamage = false;

	//labjac animal checker otherwise swords will ignore the vehicle
	public boolean canStab = false;

	//labjac fuel
	public float labjacFuel = 10;

	//cow west stabilizer
	public boolean Stabilizer = true;

	//for transport warp disembark
	public boolean transport = false;

	//Health and recipe
	/** Health of each driveable part */
	public HashMap<EnumDriveablePart, CollisionBox> health = new HashMap<EnumDriveablePart, CollisionBox>();
	public HashMap<EnumDriveablePart, CollisionBox> crew = new HashMap<EnumDriveablePart, CollisionBox>();
	/** Recipe parts associated to each driveable part */
	public HashMap<EnumDriveablePart, ItemStack[]> partwiseRecipe = new HashMap<EnumDriveablePart, ItemStack[]>();
	/** Recipe parts as one complete list */
	public ArrayList<ItemStack> driveableRecipe = new ArrayList<ItemStack>();

	//Ammo
	/** If true, then all ammo is accepted. Default is true to minimise backwards compatibility issues */
	public boolean acceptAllAmmo = true;
	/** The list of bullet types that can be used in this driveable for the main gun (tank shells, plane bombs etc) */
	public List<BulletType> ammo = new ArrayList<BulletType>();

	//Harvesting variables
	/** If true, then this vehicle harvests blocks from the harvester hitbox and places them in the inventory */
	public boolean harvestBlocks = false;
	/** What materials this harvester eats */
	public ArrayList<Material> materialsHarvested = new ArrayList<Material>();
	public boolean collectHarvest= false;
	public boolean dropHarvest = false;
	public boolean needsThrottle = false;
	public Vector3f harvestBoxSize = new Vector3f(0,0,0);
	public Vector3f harvestBoxPos = new Vector3f(0,0,0);
	public int reloadSoundTick = 15214541;
	public float fallDamageFactor = 1.0F;

	public String Gunsight = null;
	public String passengerGUI = null;
	public float gunsightZoom = 1f;
	public boolean nightScope = false;

	public boolean unlimitedOxygen = false;

	//ship revolution
	public boolean epicShip = false;

	public int weightLimit = 5000; //in kilograms for fatty planes - note: f-4 phantom should be above 12000kg

	//radar stuff

	public boolean radarVisible = true;
	public boolean hasRadar = false;
	public boolean hasPlaneRadar = false;
	public float radarRange = 69f;
	public int radarPositionOffset = 0;
	public int radarRefreshDelay = 0;


	//bob gang
	public int slbmFlightType = 0;
	//0 for no missile   1 for teleport   2 for ballistic   3 for cruise   4 for artillery
	public int slbmDelay = 80;
	public int slbmRange = 300;
	public int slbmStrength = 10;
	public int slbmWarheadType = 0;
	//1 for incendiary    2 for nuke


	// energy fighting tm -labjac
	public float energyRate = 1f;
	//rate at which energy is both gained
	public float energyLossRate = 1f;
	//lost

	//neo flight model recoil system
	public float muzzleVelocity = 1000f;
	public float projectileMass = 0.1f;


	//reload timer

	public boolean showReload = true;

	//proto autism bypass

	public boolean solid = false;

	//Weapon variables
	/** The weapon type assigned to left mouse */
	public EnumWeaponType primary = EnumWeaponType.NONE, secondary = EnumWeaponType.NONE;
	/** Whether to alternate weapons or fire all at once */
	public boolean alternatePrimary = false, alternateSecondary = false;
	/** Delays. Can override gun delays */
	public int shootDelayPrimary = 1, shootDelaySecondary = 1;
	/** Firing modes for primary and secondary guns. Minigun also an option */
	public EnumFireMode modePrimary = EnumFireMode.FULLAUTO, modeSecondary = EnumFireMode.FULLAUTO;
	/** Sounds */
	public String shootSoundPrimary, shootSoundSecondary, shootReloadSound;
	/** Positions of primary and secondary weapons */
	public ArrayList<ShootPoint> shootPointsPrimary = new ArrayList<ShootPoint>(), shootPointsSecondary = new ArrayList<ShootPoint>();
	/** Pilot guns also have their own seperate array so ammo handling can be done */
	public ArrayList<PilotGun> pilotGuns = new ArrayList<PilotGun>();

	public int		reloadTimePrimary		= 0,
			reloadTimeSecondary		= 0;
	public String	reloadSoundPrimary		= "",
			reloadSoundSecondary	= "";
	public int		placeTimePrimary		= 5,
			placeTimeSecondary		= 5;
	public String	placeSoundPrimary		= "",
			placeSoundSecondary		= "";
	//Passengers
	/** The number of passengers, not including the pilot */
	public int numPassengers = 0;
	/** Seat objects for holding information about the position and gun setup of each seat */
	public Seat[] seats;
	/** Automatic counter used to setup ammo inventory for gunners */
	public int numPassengerGunners = 0;

	public float vehicleGunModelScale = 1f;

	public class ShootParticle{
		public ShootParticle(String s, float x1, float y1, float z1){
			x=x1; y=y1; z=z1;
			name = s;
		}
		float	x=0, y=0, z=0;
		@SuppressWarnings("hiding")
		String  name;
	}
	public ArrayList<ShootParticle> shootParticlesPrimary = new ArrayList<ShootParticle>();
	public ArrayList<ShootParticle> shootParticlesSecondary = new ArrayList<ShootParticle>();

	//Inventory + Pilot guns
	/** Inventory sizes */
	public int numCargoSlots, numBombSlots, numMissileSlots;
	/** The fuel tank size */
	public int fuelTankSize = 100;

	//Rendering variables
	/** The yOffset of the model. Shouldn't be needed if you made your model properly */
	public float yOffset = 10F / 16F;
	/** Third person render distance */
	public float cameraDistance = 5F;

	//Particle system
	/** A list of ambient particle emitters on this vehicle */
	public ArrayList<ParticleEmitter> emitters = new ArrayList<ParticleEmitter>();

	public ArrayList<AfterBurnEmitter> afterBurns = new ArrayList<AfterBurnEmitter>();

	//Movement variables
	/** Generic movement modifiers, no longer repeated for plane and vehicle */
	public float maxThrottle = 1F, maxNegativeThrottle = 0F;
	public float ClutchBrake = 0F;
	/** The origin of the tank turret */
	public Vector3f turretOrigin = new Vector3f();
	public Vector3f turretOriginOffset = new Vector3f();

	/** Wheel positions */
	public DriveablePosition[] wheelPositions = new DriveablePosition[0];
	/** Strength of springs connecting car to wheels */
	public float wheelSpringStrength = 0.5F;
	/** The wheel radius for onGround checks */
	public float wheelStepHeight = 1.5F;
	/** Whether or not the vehicle rolls */
	public boolean canRoll = true;

	/** Collision points for block based collisions */
	public ArrayList<DriveablePosition> collisionPoints = new ArrayList<DriveablePosition>();

	/** Coefficient of drag */
	public float drag = 1F;

	//Boat Stuff
	/** If true, then the vehicles wheels float on water */
	public boolean floatOnWater = false;
	/** Defines where you can place this vehicle */
	public boolean placeableOnLand = true, placeableOnWater = false, placeableOnSponge = false, placeableOnPumpkin = false;
	/** The upwards force to apply to the vehicle per wheel when on water */
	public float buoyancy = 0.0165F;

	public float floatOffset = 0;

	/** The radius within which to check for bullets */
	public float bulletDetectionRadius = 5F;

	/** Plane is shown on ICBM Radar and engaged by AA Guns */
	public boolean onRadar = false;

	/**Track animation frames */
	public int animFrames = 2;

	/** Sounds */
	public int startSoundRange = 50;
	public String startSound = "";
	public int startSoundLength;
	public int engineSoundRange = 50;
	public String engineSound = "";
	public int engineSoundLength;
	public int backSoundRange = 50;
	public String idleSound = "";
	public int idleSoundLength = 50;
	public String backSound = "";
	public int backSoundLength;
	public String sonicBoomSound = "sonicBoom";

	public int stukaSoundLength;
	public int stukaSoundRange = 50;
	public String stukaSound = "";
	public int stukaSpeed = 9000;

	public boolean collisionDamageEnable = true;
	public boolean pushOnCollision = true;
	public float collisionDamageThrottle = 0.3f;
	public float collisionDamageTimes = 25;

	public boolean enableReloadTime = false;

	public boolean canMountEntity = false;
	public boolean inshallah = false;
	
    public boolean centralControl = false; //experimental system for driver to control all passenger guns at once

	public float bulletSpread = 0F;
	public float bulletSpeed = 3F;
	public boolean rangingGun = false;
	//labjac
	public boolean isExplosionWhenDestroyed = false;
	public boolean nuclearDeath = false;
	public boolean bigDeath = false;
	public boolean Death = false;
	public float isExplosionWhenDestroyedRadius = 0;

	//labjac
	public String lockedOnSound = "";
	public int soundTime = 0;

	public int canLockOnAngle = 10;
	public int lockOnSoundTime = 60;
	public String lockOnSound = "";
	public int maxRangeLockOn = 500;
	public int lockedOnSoundRange = 5;
	public String lockingOnSound = "";

	public boolean lockOnToPlanes = false, lockOnToVehicles = false, lockOnToMechas = false, lockOnToPlayers = false, lockOnToLivings = false;

	//flares
	public boolean	hasFlare	= false;
	public int		flareDelay	= 20*25;
	public String	flareSound	= "";
	public int 		timeFlareUsing = 10;

	public int ticksRepairing = 200;
	public int repairDelay = 200;

	//labjac aps
	public int APSdelayMax	= 295;
	public boolean hasAPS = false;

	// radar (for mapwriter)
	/** The height of the entity that can be detected by radar.<br>
	 * -1 = It does not detect.<br> */
	public int radarDetectableAltitude = -1;
	public boolean stealth = false;

	/** Barrel Recoil stuff */
	public float recoilDist = 7F;
	public float recoilTime = 7F;

	/** more nonsense */
	public boolean fixedPrimaryFire = false;
	public Vector3f primaryFireAngle = new Vector3f(0,0,0);
	public boolean fixedSecondaryFire = false;
	public Vector3f secondaryFireAngle = new Vector3f(0,0,0);

	/** backwards compatibility attempt */
	public float gunLength = 0;

	public boolean setPlayerInvisible = false;
	//labjac killable pilot
	public boolean invinciblePilotType = true;

	public float maxThrottleInWater = 0.5F;

	public ArrayList<Vector3f> leftTrackPoints = new ArrayList<Vector3f>();
	public ArrayList<Vector3f> rightTrackPoints = new ArrayList<Vector3f>();
	public float trackLinkLength = 0;

	/** activator boolean for IT-1 reloads */
	public boolean IT1 = false;

	public static ArrayList<DriveableType> types = new ArrayList<DriveableType>();

	public ArrayList<CollisionShapeBox> collisionBox = new ArrayList<CollisionShapeBox>();
	public boolean fancyCollision = false;

	public CollisionShapeBox colbox;

	// submarine shit
	public float maxDepth = 40;
	public float maxOxygen = 9001f;
	public float oxygen = 9001f;
	public boolean canDive = false;

	public boolean fancyShip = false;

	//elephant run amok
	public boolean panic = false;
	public boolean mechStomp = false;

	//if ship takes 100 damage, 100 * this = amount of dead crew members
	public float damageVsCrew = 0.5F;
	//if set to true, losing crew men = less throttle. needed for Oar powered galleys
	public boolean crewEngine = false;

	//for disabling prototype theta super hit detection
	public boolean autisticHitDetection = false;

	//exit timer
	public int exitTimer = 20;

	//for labjac rocket throttle
	public boolean rocketThrottle = false;
	public int fuelTimer = 300;

	//for recoil
	public boolean primaryRecoil = false;
	public boolean secondaryRecoil = false;
	public boolean bigRecoil = false;

	//labjac recoil
	public float primaryRecoilHeight = 2;
	public float secondaryRecoilHeight = 2;

	public boolean digitalRadar = false;

	public float radarDetectionRangeMultiplier = 1;

	//allah gun ranger for artillery
	public boolean gunRange = false;
	//walter ballistic formula
	public boolean walterGunRange = false;
	public boolean walterMortar = false;

	//stolen from sloth for item limitation
	public boolean filterAmmunition = false;

	//far sound
	public String farSound;

	public boolean showTurretIndicator = true;

	//show turret in 1st person by force
	public boolean alwaysShowTurret = false;

	public float explosionResistance = 1f;

	public boolean hasMagicArtilleryMode = false;

	public boolean lessOverpen = true;

	//for affecting vehicles pushed by explosions
	public float explosionPush = 0.25f;

	//over heat sound effect
	public String overheatSound = "overheatSound";

	//how high the heat counter is before it roasts
	public int overheatLimit = 250;

	//how many ticks it roasts
	public int overheatPenalty = 75;

	//cooling bonus so you wont hae to wait forever after an overheat
	public int coolingBonus = 1;

	public boolean hijackablePilot = false;

	public int kamikazeBonus = 0; //kamikaze damage bonus

	//for extra volume tank cannons
	public boolean loudCannon = false;
	public boolean earRape = false;

	public float farSoundRange = 300;

	//so planes can shoot pilotguns in any direction
	public boolean planeCoaxPrimary = false;
	public boolean planeCoaxSecondary = false;


	public DriveableType(TypeFile file){
		super(file);
	}

	@Override
	public void preRead(TypeFile file){
		super.preRead(file);
		//Make sure the passenger arrays are set up first
		for(String line : file.lines){
			if(line == null)
				break;
			if(line.startsWith("//"))
				continue;
			String[] split = line.split(" ");
			if(split.length < 2)
				continue;

			if(split[0].equals("Passengers")){
				numPassengers = Integer.parseInt(split[1]);
				seats = new Seat[numPassengers + 1];
				break;
			}
		}
		//Make sure NumWheels is read before anything else
		for(String line : file.lines){
			if(line == null)
				break;
			if(line.startsWith("//"))
				continue;
			String[] split = line.split(" ");
			if(split.length < 2)
				continue;

			if (split[0].equals("NumWheels")){
				wheelPositions = new DriveablePosition[Integer.parseInt(split[1])];
				break;
			}
		}
		types.add(this);
	}

	@Override
	public void postRead(TypeFile file){
		super.postRead(file);
	}

	@Override
	protected void read(String[] split, TypeFile file){
		super.read(split, file);
		try{ 
			if(split[0].equals("VehicleGunModelScale"))
				vehicleGunModelScale = Float.parseFloat(split[1]);

			if(FMLCommonHandler.instance().getSide().isClient() && split[0].equals("Model"))
				model = FlansMod.proxy.loadModel(split[1], shortName, ModelDriveable.class);
			else if(split[0].equals("VehicleGunReloadTick"))
				reloadSoundTick = Integer.parseInt(split[1]);
			else if(split[0].equals("Texture"))
				texture = split[1];

			else if(split[0].equals("IsExplosionWhenDestroyed"))
				isExplosionWhenDestroyed = Boolean.parseBoolean(split[1]);
			else if(split[0].equals("isExplosionWhenDestroyedRadius"))
				isExplosionWhenDestroyedRadius = Float.parseFloat(split[1]);
			else if(split[0].equals("FallDamageFactor"))
				fallDamageFactor = Float.parseFloat(split[1]);

			//always show turret in 1st person
			else if(split[0].equals("lessOverpen"))
				lessOverpen = Boolean.parseBoolean(split[1]);
			
			if(split[0].equals("evilGolem")) //evil ai ships
				evilGolem = Boolean.parseBoolean(split[1].toLowerCase());
			
			if(split[0].equals("evilRange"))
				evilRange = Integer.parseInt(split[1]);
			
			if(split[0].equals("evilSpread"))
				evilSpread = Float.parseFloat(split[1]);
			
			if(split[0].equals("evilGravity"))
				evilGravity = Integer.parseInt(split[1]); //default is -2 at point blank, then +8 at 230m (so +6 degree pitch long range) then this config adds to the 8

			//ear rape cannons
			else if(split[0].equals("loudCannon"))
				loudCannon = Boolean.parseBoolean(split[1]);
			else if(split[0].equals("earRape"))
				earRape = Boolean.parseBoolean(split[1]);

			//recoil labjac system
			else if(split[0].equals("primaryRecoilStrength"))
				primaryRecoilHeight = Float.parseFloat(split[1]);

			else if(split[0].equals("farSoundRange"))
				farSoundRange = Float.parseFloat(split[1]);			

			//always show turret in 1st person
			else if(split[0].equals("alwaysShowTurret"))
				alwaysShowTurret = Boolean.parseBoolean(split[1]);

			else if(split[0].equals("kamikazeBonus"))   //kamikaze bonus collision damage
				kamikazeBonus = Integer.parseInt(split[1]);

			//for artillery/bombs/missiles to have magic vision
			else if(split[0].equals("hasMagicArtilleryMode"))
				hasMagicArtilleryMode = Boolean.parseBoolean(split[1]);

			//shoot anywhere for plane pilot
			else if(split[0].equals("planeCoaxPrimary"))
				planeCoaxPrimary = Boolean.parseBoolean(split[1]);
			else if(split[0].equals("planeCoaxSecondary"))
				planeCoaxSecondary = Boolean.parseBoolean(split[1]);

			//mrap resistance to explosions
			else if(split[0].equals("explosionResistance"))
				explosionResistance = Float.parseFloat(split[1]);

			//labjac animal canstab checker otherwise swords phase through vehicle harmlessly to kill crew
			else if(split[0].equals("canStab"))
				canStab = Boolean.parseBoolean(split[1]);
			else if(split[0].equals("canPanic"))
				panic = Boolean.parseBoolean(split[1]);
			else if(split[0].equals("MechStomp"))
				mechStomp = Boolean.parseBoolean(split[1]);

			//labjac artillery range system
			else if(split[0].equals("artilleryCalculator"))
				gunRange = Boolean.parseBoolean(split[1]);

			else if(split[0].equals("walterCalculator"))
				walterGunRange = Boolean.parseBoolean(split[1]);

			else if(split[0].equals("walterMortar"))
				walterMortar = Boolean.parseBoolean(split[1]);

			//to hide turret animated icon
			else if(split[0].equals("showTurretIndicator"))
				showTurretIndicator = Boolean.parseBoolean(split[1]);

			//labjac rocket timer
			if(split[0].equals("fuelTimer"))
				fuelTimer = Integer.parseInt(split[1]);
			if(split[0].equals("rocketThrottle"))
				rocketThrottle = Boolean.parseBoolean(split[1]);
			//advanced fue for planes
			else if(split[0].equals("labjacFuel"))
				labjacFuel = 200*Float.parseFloat(split[1]);

			//explosion push multiplier
			else if(split[0].equals("explosionPush"))
				explosionPush = Float.parseFloat(split[1]);

			//plane recoil for neo flight model
			else if(split[0].equals("muzzleVelocity"))
				muzzleVelocity = Float.parseFloat(split[1]);
			else if(split[0].equals("projectileMass"))
				projectileMass = Float.parseFloat(split[1]);

			//for vanilla weapon resistance
			else if(split[0].equals("vanillaDamage"))
				vanillaDamage = Boolean.parseBoolean(split[1]);

			//for hijacking pilot seat
			else if(split[0].equals("hijackablePilot"))
				hijackablePilot = Boolean.parseBoolean(split[1]);

			//Movement Variables
			else if(split[0].equals("MaxThrottle"))
				maxThrottle = Float.parseFloat(split[1])*0.8f; //added universal 0.8 nerf
			else if(split[0].equals("MaxNegativeThrottle"))
				maxNegativeThrottle = Float.parseFloat(split[1])*0.8f; //added unviersal 0.8 nerf
			else if(split[0].equals("ClutchBrake"))
				ClutchBrake = Float.parseFloat(split[1]);
			else if(split[0].equals("MaxThrottleInWater"))
				maxThrottleInWater = Float.parseFloat(split[1])*0.8f; //universal 0.8 nerf
			else if(split[0].equals("MaxDepth"))
				maxDepth = Integer.parseInt(split[1]);

			else if(split[0].equals("oxygen"))
				oxygen = Integer.parseInt(split[1]);
			else if(split[0].equals("maxOxygen"))
				maxOxygen = Integer.parseInt(split[1]);

			//exit timer
			else if(split[0].equals("exitTimer"))
				exitTimer = Integer.parseInt(split[1]);

			//shooting recoil w throttle
			if(split[0].equals("primaryRecoil")){
				bigRecoil = true;
				primaryRecoil = Boolean.parseBoolean(split[1].toLowerCase());
			}
			if(split[0].equals("secondaryRecoil")){
				bigRecoil = true;
				secondaryRecoil = Boolean.parseBoolean(split[1].toLowerCase());
			}

			//scopes
			if(split[0].equals("Gunsight"))
				overlay = split[1];
			if(split[0].equals("heliGUI"))
				heliGUI = split[1];
			else if(split[0].equals("hasScope"))
				hasScope = Boolean.parseBoolean(split[1]);
			else if(split[0].equals("nightScope"))
				nightScope = Boolean.parseBoolean(split[1]);
			else if(split[0].equals("gunsightZoom"))
				gunsightZoom = Float.parseFloat(split[1]);

			else if(split[0].equals("Drag"))
				drag = Float.parseFloat(split[1]);
			else if(split[0].equals("TurretOrigin"))
				turretOrigin = new Vector3f(Float.parseFloat(split[1]) / 16F, Float.parseFloat(split[2]) / 16F, Float.parseFloat(split[3]) / 16F);
			else if(split[0].equals("TurretOriginOffset"))
				turretOriginOffset = new Vector3f(Float.parseFloat(split[1]) / 16F, Float.parseFloat(split[2]) / 16F, Float.parseFloat(split[3]) / 16F);
			else if(split[0].equals("CollisionPoint") || split[0].equals("AddCollisionPoint"))
				collisionPoints.add(new DriveablePosition(split));
			else if(split[0].equals("CollisionDamageEnable"))
				collisionDamageEnable = Boolean.parseBoolean(split[1]);

			else if(split[0].equals("unlimitedOxygen"))
				unlimitedOxygen = Boolean.parseBoolean(split[1]);

			else if(split[0].equals("damageVsCrew"))
				damageVsCrew = Float.parseFloat(split[1]);
			else if(split[0].equals("crewEngine"))
				crewEngine = Boolean.parseBoolean(split[1].toLowerCase());
			else if(split[0].equals("autisticHitDetection"))
				autisticHitDetection = Boolean.parseBoolean(split[1]);
			if(split[0].equals("weightLimit"))
				weightLimit = Integer.parseInt(split[1]);	//carrier weight limit

			//moved afterburn here for tick handler stuff
			if(split[0].equals("hasAfterBurner"))
				hasAfterBurner = Boolean.parseBoolean(split[1]);
			if(split[0].equals("afterBurnName"))
				afterBurnName = split[1];

			else if(split[0].equals("CollisionDamageThrottle"))
				collisionDamageThrottle = Float.parseFloat(split[1]);
			else if(split[0].equals("CollisionDamageTimes"))
				collisionDamageTimes = Float.parseFloat(split[1]);
			else if(split[0].equals("CanLockAngle"))
				canLockOnAngle = Integer.parseInt(split[1]);
			else if(split[0].equals("LockOnSoundTime"))
				lockOnSoundTime = Integer.parseInt(split[1]);
			else if(split[0].equals("LockOnToDriveables"))
				lockOnToPlanes = lockOnToVehicles = lockOnToMechas = Boolean.parseBoolean(split[1].toLowerCase());
			else if(split[0].equals("LockOnToVehicles"))
				lockOnToVehicles = Boolean.parseBoolean(split[1].toLowerCase());
			else if(split[0].equals("LockOnToPlanes"))
				lockOnToPlanes = Boolean.parseBoolean(split[1].toLowerCase());
			else if(split[0].equals("LockOnToMechas"))
				lockOnToMechas = Boolean.parseBoolean(split[1].toLowerCase());
			else if(split[0].equals("LockOnToPlayers"))
				lockOnToPlayers = Boolean.parseBoolean(split[1].toLowerCase());
			else if(split[0].equals("LockOnToLivings"))
				lockOnToLivings = Boolean.parseBoolean(split[1].toLowerCase());
			else if(split[0].equals("LockedOnSoundRange"))
				lockedOnSoundRange = Integer.parseInt(split[1]);
			else if(split[0].equals("CanRoll"))
				canRoll = Boolean.parseBoolean(split[1]);

			//Flares
			if(split[0].equals("HasFlare"))
				hasFlare = Boolean.parseBoolean(split[1]);
			if(split[0].equals("FlareDelay")){
				flareDelay = Integer.parseInt(split[1]);
				if(flareDelay<=0)
					flareDelay = 1;
			}
			if(split[0].equals("TimeFlareUsing")){
				timeFlareUsing = Integer.parseInt(split[1]);
				if(timeFlareUsing<=0)
					timeFlareUsing = 1;
			}

			//labjac APS
			if(split[0].equals("APSdelayMax")){
				APSdelayMax = Integer.parseInt(split[1]);
				if(APSdelayMax<=0)
					APSdelayMax = 1;
			}

			else if(split[0].equals("hasAPS"))
				hasAPS = Boolean.parseBoolean(split[1]);

			//labjac death particles
			if(split[0].equals("nuclearDeath"))
				nuclearDeath = Boolean.parseBoolean(split[1]);
			if(split[0].equals("bigDeath"))
				bigDeath = Boolean.parseBoolean(split[1]);
			if(split[0].equals("Death"))
				Death = Boolean.parseBoolean(split[1]);

			//labjac radar	
			if(split[0].equals("radarVisible"))
				radarVisible = Boolean.parseBoolean(split[1]);
			if(split[0].equals("hasRadar"))
				hasRadar = Boolean.parseBoolean(split[1]);
			if(split[0].equals("hasPlaneRadar"))
				hasPlaneRadar = Boolean.parseBoolean(split[1]);
			if(split[0].equals("radarRange"))
				radarRange = Float.parseFloat(split[1]);			
			if(split[0].equals("radarPositionOffset"))
				radarPositionOffset = Integer.parseInt(split[1]);
			if(split[0].equals("radarRefreshDelay"))
				radarRefreshDelay = Integer.parseInt(split[1]);
			if(split[0].equals("digitalRadar"))
				digitalRadar = Boolean.parseBoolean(split[1]);
			if(split[0].equals("radarDetectionRangeMultiplier"))
				radarDetectionRangeMultiplier = Float.parseFloat(split[1]);

			if(split[0].equals("solid"))
				solid = Boolean.parseBoolean(split[1]);
			//labjac radar end

			//bobcat's cathouse
			if(split[0].equals("slbmFlightType"))
				slbmFlightType = Integer.parseInt(split[1]);
			if(split[0].equals("slbmDelay"))
				slbmDelay = Integer.parseInt(split[1]);
			if(split[0].equals("slbmRange"))
				slbmRange = Integer.parseInt(split[1]);
			if(split[0].equals("slbmStrength"))
				slbmStrength = Integer.parseInt(split[1]);
			if(split[0].equals("slbmWarheadType"))
				slbmWarheadType = Integer.parseInt(split[1]);

			else if(split[0].equals("showReload"))
				showReload = Boolean.parseBoolean(split[1]);

			else if(split[0].equals("transport"))
				transport = Boolean.parseBoolean(split[1]);

			//Boats
			else if(split[0].equals("PlaceableOnLand"))
				placeableOnLand = Boolean.parseBoolean(split[1]);
			else if(split[0].equals("PlaceableOnWater"))
				placeableOnWater = Boolean.parseBoolean(split[1]);
			else if(split[0].equals("PlaceableOnSponge"))
				placeableOnSponge = Boolean.parseBoolean(split[1]);
			//labjac pumpkin
			else if(split[0].equals("placeableOnPumpkin"))
				placeableOnPumpkin = Boolean.parseBoolean(split[1]);
			else if(split[0].equals("FloatOnWater"))
				floatOnWater = Boolean.parseBoolean(split[1]);
			else if(split[0].equals("Boat")){
				placeableOnLand = false;
				placeableOnWater = true;
				floatOnWater = true;
				wheelStepHeight = 0F;
			}
			else if(split[0].equals("Buoyancy"))
				buoyancy = Float.parseFloat(split[1]);
			else if(split[0].equals("FloatOffset"))
				floatOffset = Float.parseFloat(split[1]);

			else if(split[0].equals("CanMountEntity"))
				canMountEntity = Boolean.parseBoolean(split[1]);
			
			else if(split[0].equals("centralControl"))
				centralControl = Boolean.parseBoolean(split[1]);

			else if(split[0].equals("InshaAllah"))
				inshallah = Boolean.parseBoolean(split[1]);

			//labjac ramming code
			if(split[0].equals("needsThrottle"))
				needsThrottle = Boolean.parseBoolean(split[1].toLowerCase());

			//labjac gun sight
			if(split[0].equals("Gunsight"))
				Gunsight = split[1];

			//Wheels
			else if(split[0].equals("Wheel") || split[0].equals("WheelPosition")){
				wheelPositions[Integer.parseInt(split[1])] = new DriveablePosition(new Vector3f(Float.parseFloat(split[2]) / 16F, Float.parseFloat(split[3]) / 16F, Float.parseFloat(split[4]) / 16F), split.length > 5 ? EnumDriveablePart.getPart(split[5]) : EnumDriveablePart.coreWheel);
			}
			else if(split[0].equals("WheelRadius") || split[0].equals("WheelStepHeight"))
				wheelStepHeight = Float.parseFloat(split[1]);
			else if(split[0].equals("WheelSpringStrength") || split[0].equals("SpringStrength"))
				wheelSpringStrength = Float.parseFloat(split[1]);
			else if(split[0].equals("TrackFrames"))
				animFrames = Integer.parseInt(split[1])-1;

			//Harvesting
			else if(split[0].equals("Harvester"))
				harvestBlocks = Boolean.parseBoolean(split[1]);
			else if(split[0].equals("CollectHarvest"))
				collectHarvest = Boolean.parseBoolean(split[1]);
			else if(split[0].equals("DropHarvest"))
				dropHarvest = Boolean.parseBoolean(split[1]);
			else if(split[0].equals("HarvestBox")){
				harvestBoxSize = new Vector3f(split[1], shortName);
				harvestBoxPos = new Vector3f(split[2], shortName);
			}
			else if(split[0].equals("HarvestMaterial")){
				materialsHarvested.add(getMaterial(split[1]));
			}
			else if(split[0].equals("HarvestToolType")){
				if(split[1].equals("Axe")){
					materialsHarvested.add(Material.wood);
					materialsHarvested.add(Material.plants);
					materialsHarvested.add(Material.vine);
				} else if(split[1].equals("Pickaxe") || split[1].equals("Drill")){
					materialsHarvested.add(Material.iron);
					materialsHarvested.add(Material.anvil);
					materialsHarvested.add(Material.rock);
				} else if(split[1].equals("Spade") || split[1].equals("Shovel") || split[1].equals("Excavator")){
					materialsHarvested.add(Material.ground);
					materialsHarvested.add(Material.grass);
					materialsHarvested.add(Material.sand);
					materialsHarvested.add(Material.snow);
					materialsHarvested.add(Material.clay);
				} else if(split[1].equals("Hoe") || split[1].equals("Combine")){
					materialsHarvested.add(Material.plants);
					materialsHarvested.add(Material.leaves);
					materialsHarvested.add(Material.vine);
					materialsHarvested.add(Material.cactus);
					materialsHarvested.add(Material.gourd);
				} else if(split[1].equals("Tank")){
					materialsHarvested.add(Material.leaves);	
					materialsHarvested.add(Material.cactus);
					materialsHarvested.add(Material.wood);
					materialsHarvested.add(Material.plants);
				}
			}

			//Cargo / Payload
			else if(split[0].equals("CargoSlots"))
				numCargoSlots = Integer.parseInt(split[1]);
			else if(split[0].equals("BombSlots") || split[0].equals("MineSlots"))
				numBombSlots = Integer.parseInt(split[1]);
			else if(split[0].equals("MissileSlots") || split[0].equals("ShellSlots"))
				numMissileSlots = Integer.parseInt(split[1]);
			else if(split[0].equals("FuelTankSize"))
				fuelTankSize = Integer.parseInt(split[1]);

			else if(split[0].equals("BulletDetection"))
				bulletDetectionRadius = Integer.parseInt(split[1]);

			//Ammo limiters
			else if(split[0].equals("AddAmmo"))
				ammo.add(BulletType.getBullet(split[1]));
			else if(split[0].equals("AllowAllAmmo") || split[0].equals("AcceptAllAmmo"))
				acceptAllAmmo = Boolean.parseBoolean(split[1]);

			//Weaponry
			else if(split[0].equals("Primary"))
				primary = EnumWeaponType.valueOf(split[1].toUpperCase());
			else if(split[0].equals("Secondary"))
				secondary = EnumWeaponType.valueOf(split[1].toUpperCase());
			else if(split[0].equals("ShootDelayPrimary"))
				shootDelayPrimary = Integer.parseInt(split[1]);
			else if(split[0].equals("ShootDelaySecondary"))
				shootDelaySecondary = Integer.parseInt(split[1]);
			else if(split[0].equals("PlaceTimePrimary"))
				placeTimePrimary = Integer.parseInt(split[1]);
			else if(split[0].equals("PlaceTimeSecondary"))
				placeTimeSecondary = Integer.parseInt(split[1]);
			else if(split[0].equals("ReloadTimePrimary"))
				reloadTimePrimary = Integer.parseInt(split[1]);
			else if(split[0].equals("ReloadTimeSecondary"))
				reloadTimeSecondary = Integer.parseInt(split[1]);
			else if(split[0].equals("AlternatePrimary"))
				alternatePrimary = Boolean.parseBoolean(split[1]);
			else if(split[0].equals("AlternateSecondary"))
				alternateSecondary = Boolean.parseBoolean(split[1]);
			else if(split[0].equals("ModePrimary"))
				modePrimary = EnumFireMode.valueOf(split[1].toUpperCase());
			else if(split[0].equals("ModeSecondary"))
				modeSecondary = EnumFireMode.valueOf(split[1].toUpperCase());
			else if(split[0].equals("BulletSpeed"))
				bulletSpeed = Float.parseFloat(split[1]);
			else if(split[0].equals("BulletSpread"))
				bulletSpread = Float.parseFloat(split[1]);
			else if(split[0].equals("RangingGun"))
				rangingGun = Boolean.parseBoolean(split[1]);
			else if(split[0].equals("GunLength"))
				gunLength = Float.parseFloat(split[1]);
			else if(split[0].equals("RecoilDistance"))
				recoilDist = Float.parseFloat(split[1]);
			else if(split[0].equals("RecoilTime"))
				recoilTime = Float.parseFloat(split[1]);
			else if(split[0].equals("ShootPointPrimary")){
				DriveablePosition rootPos;
				Vector3f offPos;
				String[] gun;
				Float diverge = 0f;
				Boolean musik = false;
				if(split.length == 9){
					gun = new String[]{split[0], split[1], split[2], split[3], split[4], split[5]};
					offPos = new Vector3f(Float.parseFloat(split[6])/16F,Float.parseFloat(split[7])/16F,Float.parseFloat(split[8])/16F);
				} else if(split.length == 10) /* for gun divergence*/{
					gun = new String[]{split[0], split[1], split[2], split[3], split[4], split[5]};
					offPos = new Vector3f(Float.parseFloat(split[6])/16F,Float.parseFloat(split[7])/16F,Float.parseFloat(split[8])/16F);
					diverge = Float.parseFloat(split[9]);
				}  else if(split.length == 11) /* for schrage musik*/{
					gun = new String[]{split[0], split[1], split[2], split[3], split[4], split[5]};
					offPos = new Vector3f(Float.parseFloat(split[6])/16F,Float.parseFloat(split[7])/16F,Float.parseFloat(split[8])/16F);
					diverge = Float.parseFloat(split[9]);
					musik = Boolean.parseBoolean(split[10]);
				} else if (split.length == 8){
					gun = new String[]{split[0], split[1], split[2], split[3], split[4]};
					offPos = new Vector3f(Float.parseFloat(split[5])/16F,Float.parseFloat(split[6])/16F,Float.parseFloat(split[7])/16F);
				} else {
					gun = split;
					offPos = new Vector3f(0,0,0);
				}
				rootPos = getShootPoint(gun);
				ShootPoint sPoint = new ShootPoint(rootPos, offPos, diverge, musik);
				shootPointsPrimary.add(sPoint);
				if(rootPos instanceof PilotGun)
					pilotGuns.add((PilotGun)sPoint.rootPos);
			} else if(split[0].equals("ShootPointSecondary")){
				DriveablePosition rootPos;
				Vector3f offPos;
				String[] gun;
				Float diverge = 0f;
				Boolean musik = false;
				if(split.length == 9){
					gun = new String[]{split[0], split[1], split[2], split[3], split[4], split[5]};
					offPos = new Vector3f(Float.parseFloat(split[6])/16F,Float.parseFloat(split[7])/16F,Float.parseFloat(split[8])/16F);
				} else if(split.length == 10) /* for gun divergence*/{
					gun = new String[]{split[0], split[1], split[2], split[3], split[4], split[5]};
					offPos = new Vector3f(Float.parseFloat(split[6])/16F,Float.parseFloat(split[7])/16F,Float.parseFloat(split[8])/16F);
					diverge = Float.parseFloat(split[9]);
				} else if(split.length == 11) /* for schrage musik*/{
					gun = new String[]{split[0], split[1], split[2], split[3], split[4], split[5]};
					offPos = new Vector3f(Float.parseFloat(split[6])/16F,Float.parseFloat(split[7])/16F,Float.parseFloat(split[8])/16F);
					diverge = Float.parseFloat(split[9]);
					musik = Boolean.parseBoolean(split[10]);
				} else if (split.length == 8){
					gun = new String[]{split[0], split[1], split[2], split[3], split[4]};
					offPos = new Vector3f(Float.parseFloat(split[5])/16F,Float.parseFloat(split[6])/16F,Float.parseFloat(split[7])/16F);
				} else {
					gun = split;
					offPos = new Vector3f(0,0,0);
				}
				rootPos = getShootPoint(gun);
				ShootPoint sPoint = new ShootPoint(rootPos, offPos, diverge, musik);
				shootPointsSecondary.add(sPoint);
				if(rootPos instanceof PilotGun)
					pilotGuns.add((PilotGun)sPoint.rootPos);
			}
			else if(split[0].equals("EnableReloadTime"))
				enableReloadTime = Boolean.parseBoolean(split[1]);

			else if(split[0].equals("ShootParticlesPrimary"))
				shootParticlesPrimary.add(new ShootParticle(
						split[1],
						Float.valueOf(split[2]),
						Float.valueOf(split[3]),
						Float.valueOf(split[4])));
			else if(split[0].equals("ShootParticlesSecondary"))
				shootParticlesSecondary.add(new ShootParticle(split[1],Float.valueOf(split[2]),
						Float.valueOf(split[3]),
						Float.valueOf(split[4])));

			if(split[0].equals("SetPlayerInvisible"))
				setPlayerInvisible = Boolean.parseBoolean(split[1].toLowerCase());
			if(split[0].equals("IT1"))
				IT1 = Boolean.parseBoolean(split[1].toLowerCase());
			if(split[0].equals("FixedPrimary"))
				fixedPrimaryFire = Boolean.parseBoolean(split[1].toLowerCase());
			if(split[0].equals("PrimaryAngle"))
				primaryFireAngle = new Vector3f(Float.parseFloat(split[1]), Float.parseFloat(split[2]), Float.parseFloat(split[3]));

			if(split[0].equals("FixedSecondary"))
				fixedSecondaryFire = Boolean.parseBoolean(split[1].toLowerCase());
			if(split[0].equals("SecondaryAngle"))
				secondaryFireAngle = new Vector3f(Float.parseFloat(split[1]), Float.parseFloat(split[2]), Float.parseFloat(split[3]));

			//Backwards compatibility stuff
			else if(split[0].equals("AddGun")){
				DriveablePosition rootPos;
				Vector3f offPos;
				secondary = EnumWeaponType.GUN;
				PilotGun pilotGun;
				if(split.length == 6){
					rootPos = (PilotGun)getShootPoint(split);
					offPos = new Vector3f(0,0,0);
					pilotGun = (PilotGun)getShootPoint(split);
				} else {
					String[] gun = new String[]{split[0],split[1],split[2],split[3],split[4], split[5]};
					rootPos = (PilotGun)getShootPoint(gun);
					pilotGun = (PilotGun)getShootPoint(gun);
					offPos = new Vector3f(Float.parseFloat(split[6])/16F,Float.parseFloat(split[7])/16F,Float.parseFloat(split[8])/16F);
				}
				ShootPoint sPoint = new ShootPoint(rootPos, offPos, 0f, false);
				shootPointsSecondary.add(sPoint);
				pilotGuns.add(pilotGun);
				driveableRecipe.add(new ItemStack(pilotGun.type.item));
			} else if(split[0].equals("BombPosition")){
				primary = EnumWeaponType.BOMB;
				if(split.length == 4)
					shootPointsPrimary.add(new ShootPoint(new DriveablePosition(new Vector3f(Float.parseFloat(split[1]) / 16F, Float.parseFloat(split[2]) / 16F, Float.parseFloat(split[3]) / 16F), EnumDriveablePart.core), new Vector3f(0,0,0), 0f, false));
				else if (split.length == 7)
					shootPointsPrimary.add(new ShootPoint(new DriveablePosition(new Vector3f(Float.parseFloat(split[1]) / 16F, Float.parseFloat(split[2]) / 16F, Float.parseFloat(split[3]) / 16F), EnumDriveablePart.core), new Vector3f(Float.parseFloat(split[4]) / 16F,Float.parseFloat(split[5]) / 16F,Float.parseFloat(split[6]) / 16F), 0f, false));

			} else if(split[0].equals("BarrelPosition")){
				primary = EnumWeaponType.SHELL;
				if(split.length == 4)
					shootPointsPrimary.add(new ShootPoint(new DriveablePosition(new Vector3f(Float.parseFloat(split[1]) / 16F, Float.parseFloat(split[2]) / 16F, Float.parseFloat(split[3]) / 16F), EnumDriveablePart.turret), new Vector3f(0,0,0), 0f, false));
				else if (split.length == 7)
					shootPointsPrimary.add(new ShootPoint(new DriveablePosition(new Vector3f(Float.parseFloat(split[1]) / 16F, Float.parseFloat(split[2]) / 16F, Float.parseFloat(split[3]) / 16F), EnumDriveablePart.turret), new Vector3f(Float.parseFloat(split[4]) / 16F,Float.parseFloat(split[5]) / 16F,Float.parseFloat(split[6]) / 16F), 0f, false));
			} else if(split[0].equals("ShootDelay"))
				shootDelaySecondary = Integer.parseInt(split[1]);
			else if(split[0].equals("ShellDelay") || split[0].equals("BombDelay"))
				shootDelayPrimary = Integer.parseInt(split[1]);

			//Recipe
			else if(split[0].equals("AddRecipeParts")){
				EnumDriveablePart part = EnumDriveablePart.getPart(split[1]);
				ItemStack[] stacks = new ItemStack[(split.length - 2) / 2];
				for(int i = 0; i < (split.length - 2) / 2; i++){
					int amount = Integer.parseInt(split[2 * i + 2]);
					boolean damaged = split[2 * i + 3].contains(".");
					String itemName = damaged ? split[2 * i + 3].split("\\.")[0] : split[2 * i + 3];
					int damage = damaged ? Integer.parseInt(split[2 * i + 3].split("\\.")[1]) : 0;
					stacks[i] = getRecipeElement(itemName, amount, damage, shortName);
					driveableRecipe.add(stacks[i]);
				}
				partwiseRecipe.put(part, stacks);
			}

			//Dyes
			else if(split[0].equals("AddDye")){
				int amount = Integer.parseInt(split[1]);
				int damage = -1;
				for(int i = 0; i < ItemDye.field_150923_a.length; i++){
					if(ItemDye.field_150923_a[i].equals(split[2]))
						damage = i;
				}
				if(damage == -1){
					FlansMod.log("Failed to find dye colour : " + split[2] + " while adding " + file.name);
					return;
				}
				driveableRecipe.add(new ItemStack(Items.dye, amount, damage));
			}

			//Health   ---  xddd i made it that with old config it automatically sets it to 1 armor
			else if(split[0].equals("SetupPart")){
				EnumDriveablePart part = EnumDriveablePart.getPart(split[1]);
				CollisionBox box = new CollisionBox(Integer.parseInt(split[2]), Integer.parseInt(split[3]), Integer.parseInt(split[4]), Integer.parseInt(split[5]), Integer.parseInt(split[6]), Integer.parseInt(split[7]), Integer.parseInt(split[8]), 1, 1, 1, 1);
				health.put(part, box);
				crew.put(part, box);
			}
			//labjac armor system TM
			else if(split[0].equals("SetupArmoredPart")){
				EnumDriveablePart part = EnumDriveablePart.getPart(split[1]);
				CollisionBox box = new CollisionBox(Integer.parseInt(split[2]), Integer.parseInt(split[3]), Integer.parseInt(split[4]), Integer.parseInt(split[5]), Integer.parseInt(split[6]), Integer.parseInt(split[7]), Integer.parseInt(split[8]), Integer.parseInt(split[9]), Integer.parseInt(split[9]), 1, 1);
				health.put(part, box);
				crew.put(part, box);
			}
			//labjac armor system TM but with crew
			else if(split[0].equals("SetupCrewedPart")){
				EnumDriveablePart part = EnumDriveablePart.getPart(split[1]);
				CollisionBox box = new CollisionBox(Integer.parseInt(split[2]), Integer.parseInt(split[3]), Integer.parseInt(split[4]), Integer.parseInt(split[5]), Integer.parseInt(split[6]), Integer.parseInt(split[7]), Integer.parseInt(split[8]), Integer.parseInt(split[9]), Integer.parseInt(split[9]), 1, Integer.parseInt(split[10]));
				health.put(part, box);
				crew.put(part, box);
			}
			//labjac true composite armor oy vey
			else if(split[0].equals("SetupCompositeArmoredPart")){
				EnumDriveablePart part = EnumDriveablePart.getPart(split[1]);
				CollisionBox box = new CollisionBox(Integer.parseInt(split[2]), Integer.parseInt(split[3]), Integer.parseInt(split[4]), Integer.parseInt(split[5]), Integer.parseInt(split[6]), Integer.parseInt(split[7]), Integer.parseInt(split[8]), Integer.parseInt(split[9]), Integer.parseInt(split[10]), 1, 1);
				health.put(part, box);
				crew.put(part, box);
			} else if(split[0].equals("SetupAnimalPart")){
				//setting that 2nd to last number to 2 enables taking damage vs living for that hitbox
				EnumDriveablePart part = EnumDriveablePart.getPart(split[1]);
				CollisionBox box = new CollisionBox(Integer.parseInt(split[2]), Integer.parseInt(split[3]), Integer.parseInt(split[4]), Integer.parseInt(split[5]), Integer.parseInt(split[6]), Integer.parseInt(split[7]), Integer.parseInt(split[8]), Integer.parseInt(split[9]), Integer.parseInt(split[10]), 2, 1);
				health.put(part, box);
				crew.put(part, box);
			}

			//Driver Position
			else if(split[0].equals("Driver") || split[0].equals("Pilot")){
				if(split.length > 4)
					seats[0] = new Seat(Integer.parseInt(split[1]), Integer.parseInt(split[2]), Integer.parseInt(split[3]), Float.parseFloat(split[4]), Float.parseFloat(split[5]), Float.parseFloat(split[6]), Float.parseFloat(split[7]));
				else seats[0] = new Seat(Integer.parseInt(split[1]), Integer.parseInt(split[2]), Integer.parseInt(split[3]));
			} else if(split[0].equals("DriverPart")){
				seats[0].part = EnumDriveablePart.getPart(split[1]);
			} else if(split[0].equals("DriverGun") || split[0].equals("PilotGun")){
				seats[0].gunName = split[2];
			} else if(split[0].equals("DriverGunOrigin"))
				seats[0].gunOrigin = new Vector3f(Float.parseFloat(split[1]) / 16F, Float.parseFloat(split[2]) / 16F, Float.parseFloat(split[3]) / 16F);
			else if(split[0].equals("RotatedDriverOffset")){
				seats[0].rotatedOffset = new Vector3f(Integer.parseInt(split[1]) / 16F, Integer.parseInt(split[2]) / 16F, Integer.parseInt(split[3]) / 16F);
			} else if(split[0].equals("RotatedPassengerOffset")){
				seats[Integer.parseInt(split[1])].rotatedOffset = new Vector3f(Integer.parseInt(split[2]) / 16F, Integer.parseInt(split[3]) / 16F, Integer.parseInt(split[4]) / 16F);
			} else if(split[0].equals("DriverAimSpeed")){
				seats[0].aimingSpeed = new Vector3f(Float.parseFloat(split[1]), Float.parseFloat(split[2]), Float.parseFloat(split[3]));
				seats[0].aimingSpeedBackup = new Vector3f(Float.parseFloat(split[1]), Float.parseFloat(split[2]), Float.parseFloat(split[3]));
			} else if(split[0].equals("PassengerAimSpeed")){
				seats[Integer.parseInt(split[1])].aimingSpeed = new Vector3f(Float.parseFloat(split[2]), Float.parseFloat(split[3]), Float.parseFloat(split[4]));
			}
			//lab carrier
			else if(split[0].equals("carrier")){
				seats[Integer.parseInt(split[1])].carrier = Boolean.parseBoolean(split[2]);
			} else if(split[0].equals("parkingSpot")){
				seats[Integer.parseInt(split[1])].parkingSpot = Boolean.parseBoolean(split[2]);
			} else if(split[0].equals("helipad")){
				seats[Integer.parseInt(split[1])].helipad = Boolean.parseBoolean(split[2]);
			} else if(split[0].equals("hardpoint")){
				seats[Integer.parseInt(split[1])].hardpoint = Boolean.parseBoolean(split[2]);
			} else if(split[0].equals("invisiblePassenger")){
				seats[Integer.parseInt(split[1])].invisiblePassenger = Boolean.parseBoolean(split[2]);
			} else if(split[0].equals("heliGuiSeat")) {
				seats[Integer.parseInt(split[1])].heliGuiSeat = Boolean.parseBoolean(split[2]);
			} else if(split[0].equals("passengerZoom")) {
				seats[Integer.parseInt(split[1])].passengerZoom = Float.parseFloat(split[2]);
			} else if(split[0].equals("canSmallArms")) {
				seats[Integer.parseInt(split[1])].canSmallArms = Boolean.parseBoolean(split[2]);
			}
			//lab carrier
			else if(split[0].equals("invincible")){
				seats[Integer.parseInt(split[1])].invincible = Boolean.parseBoolean(split[2]);
			} else if(split[0].equals("enterable")){
				seats[Integer.parseInt(split[1])].enterable = Boolean.parseBoolean(split[2]);
			}
			if(split[0].equals("SetDriverInvincible"))
				invinciblePilotType = Boolean.parseBoolean(split[1].toLowerCase());
			else if(split[0].equals("barrels")){
				seats[Integer.parseInt(split[1])].barrels = Integer.parseInt(split[2]);
			}
			else if(split[0].equals("barrelSpread")){
				seats[Integer.parseInt(split[1])].barrelSpread = Float.parseFloat(split[2]);
			}

			//baris hud and colors per seat
			else if(split[0].equals("hasHUD")){
				seats[Integer.parseInt(split[1])].hasHUD = Boolean.parseBoolean(split[2]);
			}
			else if(split[0].equals("hudColorR")){
				seats[Integer.parseInt(split[1])].hudColorR = Integer.parseInt(split[2]);
			}
			else if(split[0].equals("hudColorG")){
				seats[Integer.parseInt(split[1])].hudColorG = Integer.parseInt(split[2]);
			}
			else if(split[0].equals("hudColorB")){
				seats[Integer.parseInt(split[1])].hudColorB = Integer.parseInt(split[2]);
			}

			//labjac auto smoke
			if(split[0].equals("autoSmoke"))
				autoSmoke = Boolean.parseBoolean(split[1].toLowerCase());

			//labjac energy system TM
			else if(split[0].equals("energyGainRate"))
				energyRate = Float.parseFloat(split[1]);
			else if(split[0].equals("energyLossRate"))
				energyLossRate = Float.parseFloat(split[1]);
			else if(split[0].equals("DriverLegacyAiming")){
				seats[0].legacyAiming = Boolean.parseBoolean(split[1]);
			}
			else if(split[0].equals("PassengerLegacyAiming")){
				seats[Integer.parseInt(split[1])].legacyAiming = Boolean.parseBoolean(split[2]);
			}
			else if(split[0].equals("DriverYawBeforePitch")){
				seats[0].yawBeforePitch = Boolean.parseBoolean(split[1]);
			}
			else if(split[0].equals("PassengerYawBeforePitch")){
				seats[Integer.parseInt(split[1])].yawBeforePitch = Boolean.parseBoolean(split[2]);
			}
			else if(split[0].equals("DriverLatePitch")){
				seats[0].latePitch = Boolean.parseBoolean(split[1]);
			}
			else if(split[0].equals("PassengerLatePitch")){
				seats[Integer.parseInt(split[1])].latePitch = Boolean.parseBoolean(split[2]);
			}
			else if(split[0].equals("DriverTraverseSounds")){
				seats[0].traverseSounds = Boolean.parseBoolean(split[1]);
			}
			else if(split[0].equals("PassengerTraverseSounds")){
				seats[Integer.parseInt(split[1])].traverseSounds = Boolean.parseBoolean(split[2]);
			}

			//Passengers / Gunner Seats
			else if(split[0].equals("Passenger")){
				Seat seat = new Seat(split);
				seats[seat.id] = seat;
				if(seat.gunType != null){
					seat.gunnerID = numPassengerGunners++;
					driveableRecipe.add(new ItemStack(seat.gunType.item));
				}
			}
			else if(split[0].equals("GunOrigin"))
				seats[Integer.parseInt(split[1])].gunOrigin = new Vector3f(Float.parseFloat(split[2]) / 16F, Float.parseFloat(split[3]) / 16F, Float.parseFloat(split[4]) / 16F);

			//Y offset for badly built models :P
			else if(split[0].equals("YOffset"))
				yOffset = Float.parseFloat(split[1]);
			//Third person camera distance
			else if(split[0].equals("CameraDistance"))
				cameraDistance = Float.parseFloat(split[1]);

			//Sound
			else if(split[0].equals("StartSoundRange"))
				startSoundRange = Integer.parseInt(split[1]);
			else if(split[0].equals("StartSoundLength"))
				startSoundLength = Integer.parseInt(split[1]);
			else if(split[0].equals("EngineSoundRange"))
				engineSoundRange = Integer.parseInt(split[1]);
			else if(split[0].equals("EngineSoundLength"))
				engineSoundLength = Integer.parseInt(split[1]);
			else if(split[0].equals("IdleSoundLength"))
				idleSoundLength = Integer.parseInt(split[1]);
			else if(split[0].equals("BackSoundRange"))
				backSoundRange = Integer.parseInt(split[1]);
			else if(split[0].equals("BackSoundLength"))
				backSoundLength = Integer.parseInt(split[1]);
			else if(split[0].equals("SoundTime"))
				soundTime = Integer.parseInt(split[1]);
			else if(split[0].equals("YawSoundLength"))
				seats[0].yawSoundLength = Integer.parseInt(split[1]);
			else if(split[0].equals("PitchSoundLength"))
				seats[0].pitchSoundLength = Integer.parseInt(split[1]);
			else if(split[0].equals("PassengerYawSoundLength"))
				seats[Integer.parseInt(split[1])].yawSoundLength = Integer.parseInt(split[2]);
			else if(split[0].equals("PassengerPitchSoundLength"))
				seats[Integer.parseInt(split[1])].pitchSoundLength = Integer.parseInt(split[2]);
			else if(split[0].equals("StartSound")){
				startSound = split[1];
				FlansMod.proxy.loadSound(contentPack, "driveables", split[1]);
			} else if(split[0].equals("sonicBoomSound")){
				sonicBoomSound = split[1];
				FlansMod.proxy.loadSound(contentPack, "driveables", split[1]);
			} else if(split[0].equals("EngineSound")){
				engineSound = split[1];
				FlansMod.proxy.loadSound(contentPack, "driveables", split[1]);
			} else if(split[0].equals("overheatSound")){
				overheatSound = split[1];
				FlansMod.proxy.loadSound(contentPack, "overheatSound", split[1]);
			} else if(split[0].equals("StukaSound")){
				stukaSound = split[1];
				FlansMod.proxy.loadSound(contentPack, "driveables", split[1]);
			} else if(split[0].equals("StukaSoundLength"))
				stukaSoundLength = Integer.parseInt(split[1]);
			else if(split[0].equals("StukaSpeed"))
				stukaSpeed = Integer.parseInt(split[1]);

			//Stabilizer Stuff cow west tech
			else if(split[0].equals("Stabilizer"))
				Stabilizer = Boolean.parseBoolean(split[1]);

			else if(split[0].equals("IdleSound")){
				idleSound = split[1];
				FlansMod.proxy.loadSound(contentPack, "driveables", split[1]);
			} else if(split[0].equals("BackSound")){
				backSound = split[1];
				FlansMod.proxy.loadSound(contentPack, "driveables", split[1]);
			} else if(split[0].equals("YawSound")){
				seats[0].yawSound = split[1];
				FlansMod.proxy.loadSound(contentPack, "driveables", split[1]);
			} else if(split[0].equals("PitchSound")){
				seats[0].pitchSound = split[1];
				FlansMod.proxy.loadSound(contentPack, "driveables", split[1]);
			} else if(split[0].equals("PassengerYawSound")){
				seats[Integer.parseInt(split[1])].yawSound = split[2];
				FlansMod.proxy.loadSound(contentPack, "driveables", split[1]);
			} else if(split[0].equals("PassengerPitchSound")){
				seats[Integer.parseInt(split[1])].pitchSound = split[2];
				FlansMod.proxy.loadSound(contentPack, "driveables", split[1]);
			} else if(split[0].equals("ShootMainSound") || split[0].equals("ShootSoundPrimary") || split[0].equals("ShellSound") || split[0].equals("BombSound")){
				shootSoundPrimary = split[1];
				FlansMod.proxy.loadSound(contentPack, "driveables", split[1]);
			} else if(split[0].equals("ShootReloadSound")) {
				shootReloadSound = split[1];
				FlansMod.proxy.loadSound(contentPack, "driveables", split[1]);
			}   
			//far away cannon sound
			else if(split[0].equals("farSound")){
				farSound = split[1];
				FlansMod.proxy.loadSound(contentPack, "driveables", split[1]);
			} else if(split[0].equals("ShootSecondarySound") || split[0].equals("ShootSoundSecondary")){
				shootSoundSecondary = split[1];
				FlansMod.proxy.loadSound(contentPack, "driveables", split[1]);
			} else if(split[0].equals("PlaceSoundPrimary")){
				placeSoundPrimary = split[1];
				FlansMod.proxy.loadSound(contentPack, "driveables", split[1]);
			} else if(split[0].equals("PlaceSoundSecondary")){
				placeSoundSecondary = split[1];
				FlansMod.proxy.loadSound(contentPack, "driveables", split[1]);
			} else if(split[0].equals("ReloadSoundPrimary")){
				reloadSoundPrimary = split[1];
				FlansMod.proxy.loadSound(contentPack, "driveables", split[1]);
			} else if(split[0].equals("ReloadSoundSecondary")){
				reloadSoundSecondary = split[1];
				FlansMod.proxy.loadSound(contentPack, "driveables", split[1]);
			} else if(split[0].equals("LockedOnSound")){
				lockedOnSound = split[1];
				FlansMod.proxy.loadSound(contentPack, "driveables", split[1]);
			} else if(split[0].equals("LockOnSound")){
				lockOnSound = split[1];
				FlansMod.proxy.loadSound(contentPack, "guns", split[1]);
			}

			//golden sloth item restriction system
			else if (split[0].equals("FilterAmmunitionInput"))
				filterAmmunition = Boolean.parseBoolean(split[1]);

			else if(split[0].equals("LockingOnSound")){
				lockingOnSound = split[1];
				FlansMod.proxy.loadSound(contentPack, "guns", split[1]);
			}
			if(split[0].equals("FlareSound")){
				flareSound = split[1];
				FlansMod.proxy.loadSound(contentPack, "driveables", split[1]);
			}

			if(split[0].equals("FancyCollision")) 
				fancyCollision = Boolean.parseBoolean(split[1]);

			if(split[0].equals("fancyShip")) 
				fancyShip = Boolean.parseBoolean(split[1]);

			if(split[0].equals("AddCollisionMesh")){
				CollisionShapeBox box = new CollisionShapeBox(new Vector3f(split[1], shortName), new Vector3f(split[2], shortName), new Vector3f(split[3], shortName), new Vector3f(split[4], shortName), new Vector3f(split[5], shortName), new Vector3f(split[6], shortName), new Vector3f(split[7], shortName), new Vector3f(split[8], shortName), new Vector3f(split[9], shortName), new Vector3f(split[10], shortName), "core");
				collisionBox.add(box);
				//colbox = box;
			}

			if(split[0].equals("AddCollisionMeshRaw")){
				Vector3f pos = new Vector3f(Float.parseFloat(split[1]),Float.parseFloat(split[2]), Float.parseFloat(split[3]));
				Vector3f size = new Vector3f(Float.parseFloat(split[4]),Float.parseFloat(split[5]), Float.parseFloat(split[6]));
				Vector3f p1 = new Vector3f(Float.parseFloat(split[8]),Float.parseFloat(split[9]), Float.parseFloat(split[10]));
				Vector3f p2 = new Vector3f(Float.parseFloat(split[11]),Float.parseFloat(split[12]), Float.parseFloat(split[13]));
				Vector3f p3 = new Vector3f(Float.parseFloat(split[14]),Float.parseFloat(split[15]), Float.parseFloat(split[16]));
				Vector3f p4 = new Vector3f(Float.parseFloat(split[17]),Float.parseFloat(split[18]), Float.parseFloat(split[19]));
				Vector3f p5 = new Vector3f(Float.parseFloat(split[20]),Float.parseFloat(split[21]), Float.parseFloat(split[22]));
				Vector3f p6 = new Vector3f(Float.parseFloat(split[23]),Float.parseFloat(split[24]), Float.parseFloat(split[25]));
				Vector3f p7 = new Vector3f(Float.parseFloat(split[26]),Float.parseFloat(split[27]), Float.parseFloat(split[28]));
				Vector3f p8 = new Vector3f(Float.parseFloat(split[29]),Float.parseFloat(split[30]), Float.parseFloat(split[31]));				
				CollisionShapeBox box = new CollisionShapeBox(pos, size, p1, p2, p3, p4, p5, p6, p7, p8, "core");
				collisionBox.add(box);
				//colbox = box;
			}

			if(split[0].equals("AddTurretCollisionMesh")){
				CollisionShapeBox box = new CollisionShapeBox(new Vector3f(split[1], shortName), new Vector3f(split[2], shortName), new Vector3f(split[3], shortName), new Vector3f(split[4], shortName), new Vector3f(split[5], shortName), new Vector3f(split[6], shortName), new Vector3f(split[7], shortName), new Vector3f(split[8], shortName), new Vector3f(split[9], shortName), new Vector3f(split[10], shortName), "turret");
				collisionBox.add(box);
				//colbox = box;
			}

			if(split[0].equals("AddTurretCollisionMeshRaw")){
				Vector3f pos = new Vector3f(Float.parseFloat(split[1]),Float.parseFloat(split[2]), Float.parseFloat(split[3]));
				Vector3f size = new Vector3f(Float.parseFloat(split[4]),Float.parseFloat(split[5]), Float.parseFloat(split[6]));
				Vector3f p1 = new Vector3f(Float.parseFloat(split[8]),Float.parseFloat(split[9]), Float.parseFloat(split[10]));
				Vector3f p2 = new Vector3f(Float.parseFloat(split[11]),Float.parseFloat(split[12]), Float.parseFloat(split[13]));
				Vector3f p3 = new Vector3f(Float.parseFloat(split[14]),Float.parseFloat(split[15]), Float.parseFloat(split[16]));
				Vector3f p4 = new Vector3f(Float.parseFloat(split[17]),Float.parseFloat(split[18]), Float.parseFloat(split[19]));
				Vector3f p5 = new Vector3f(Float.parseFloat(split[20]),Float.parseFloat(split[21]), Float.parseFloat(split[22]));
				Vector3f p6 = new Vector3f(Float.parseFloat(split[23]),Float.parseFloat(split[24]), Float.parseFloat(split[25]));
				Vector3f p7 = new Vector3f(Float.parseFloat(split[26]),Float.parseFloat(split[27]), Float.parseFloat(split[28]));
				Vector3f p8 = new Vector3f(Float.parseFloat(split[29]),Float.parseFloat(split[30]), Float.parseFloat(split[31]));				
				CollisionShapeBox box = new CollisionShapeBox(pos, size, p1, p2, p3, p4, p5, p6, p7, p8, "turret");
				collisionBox.add(box);
				//colbox = box;
			}

			if(split[0].equals("LeftLinkPoint")){
				leftTrackPoints.add(new Vector3f(split[1], shortName));
			}

			if(split[0].equals("RightLinkPoint")){
				rightTrackPoints.add(new Vector3f(split[1], shortName));
			}

			if(split[0].equals("TrackLinkLength")){
				trackLinkLength = Float.parseFloat(split[1]);
			}

			// ICBM Mod Radar
			else if(split[0].equals("OnRadar"))
				onRadar = split[1].equals("True");

			else if(split[0].equalsIgnoreCase("AddParticle") || split[0].equalsIgnoreCase("AddEmitter")){
				ParticleEmitter emitter = new ParticleEmitter();
				emitter.effectType = split[1];
				emitter.emitRate = Integer.parseInt(split[2]);
				emitter.origin = new Vector3f(split[3], shortName);
				emitter.extents = new Vector3f(split[4], shortName);
				emitter.velocity = new Vector3f(split[5], shortName);
				emitter.minThrottle = Float.parseFloat(split[6]);
				emitter.maxThrottle = Float.parseFloat(split[7]);
				emitter.minHealth = Float.parseFloat(split[8]);
				emitter.maxHealth = Float.parseFloat(split[9]);
				emitter.part = split[10];
				//Scale from model coords to world coords
				emitter.origin.scale(1.0f / 16.0f);
				emitter.extents.scale(1.0f / 16.0f);
				emitter.velocity.scale(1.0f / 16.0f);
				emitters.add(emitter);
			}

			//cringe ripoff of proto emitter but depends on afterburn true/false to activate
			else if(split[0].equalsIgnoreCase("particleAfterBurn") || split[0].equalsIgnoreCase("particleTrailBurner")){
				AfterBurnEmitter emitter = new AfterBurnEmitter();
				emitter.effectType = split[1];
				emitter.emitRate = Integer.parseInt(split[2]);
				emitter.origin = new Vector3f(split[3], shortName);
				emitter.extents = new Vector3f(split[4], shortName);
				emitter.velocity = new Vector3f(split[5], shortName);
				emitter.part = split[6];
				//Scale from model coords to world coords
				emitter.origin.scale(1.0f / 16.0f);
				emitter.extents.scale(1.0f / 16.0f);
				emitter.velocity.scale(1.0f / 16.0f);
				afterBurns.add(emitter);
			}

			// radar (for mapwriter)
			else if(split[0].equals("RadarDetectableAltitude"))
				radarDetectableAltitude = Integer.parseInt(split[1]);
			else if(split[0].equals("Stealth"))
				stealth = split[1].equals("True");
		} catch (Exception e){
			if(split != null){
				String msg = " : ";
				for(String s : split) msg = msg + " " + s;
				FlansMod.log("Errored reading " + file.name + "");
			} else {
				FlansMod.log("Errored reading " + file.name);
			}
			if(FlansMod.printStackTrace){
				e.printStackTrace();
			}
		}
	}

	private static DriveablePosition getShootPoint(String[] split){
		//Its a gun with a type
		if(split.length == 6){
			return new PilotGun(split);
		} else if(split.length == 5){
			return new DriveablePosition(split);
		}
		return new DriveablePosition(new Vector3f(), EnumDriveablePart.core);
	}

	public ArrayList<ShootPoint> shootPoints(boolean s){
		return s ? shootPointsSecondary : shootPointsPrimary;
	}

	public boolean alternate(boolean s){
		return s ? alternateSecondary : alternatePrimary;
	}

	public EnumWeaponType weaponType(boolean s){
		return s ? secondary : primary;
	}

	public int shootDelay(boolean s){
		return s ? shootDelaySecondary : shootDelayPrimary;
	}

	public String shootSound(boolean s){
		return s ? shootSoundSecondary : shootSoundPrimary;
	}

	public ArrayList<ShootParticle> shootParticle(boolean s){
		return s ? shootParticlesSecondary : shootParticlesPrimary;
	}

	public int numEngines(){
		return 1;
	}

	public int ammoSlots(){
		return numPassengerGunners + pilotGuns.size();
	}

	public boolean isValidAmmo(BulletType bulletType, EnumWeaponType weaponType){
		return (acceptAllAmmo || ammo.contains(bulletType)) && bulletType.weaponType == weaponType;
	}

	/** Find the items needed to rebuild a part. The returned array is disconnected from the template items it has looked up */
	public ArrayList<ItemStack> getItemsRequired(DriveablePart part, PartType engine){
		ArrayList<ItemStack> stacks = new ArrayList<ItemStack>();
		//Start with the items required to build this part
		if(partwiseRecipe.get(part.type) != null){
			for(ItemStack stack : partwiseRecipe.get(part.type)){
				stacks.add(stack.copy());
			}
		}
		//Add the items required for the guns connected to this part
		for(PilotGun gun : pilotGuns){
			if(gun.part == part.type && gun.type != null && gun.type.item != null)
				stacks.add(new ItemStack(gun.type.item));
		}
		for(Seat seat : seats){
			if(seat != null && seat.part == part.type && seat.gunType != null)
				stacks.add(new ItemStack(seat.gunType.item));
		}
		return stacks;
	}

	public static DriveableType getDriveable(String find){
		for(DriveableType type : types){
			if(type.shortName.equals(find))
				return type;
		}
		return null;
	}

	@Override
	public float GetRecommendedScale(){
		return 100.0f / cameraDistance;
	}

	public class ParticleEmitter{
		/** The name of the effect */
		public String effectType;
		/** The rate of emission */
		public int emitRate;
		/** The centre of the effect emitter */
		public Vector3f origin;
		/** The size of the box in which it emits */
		public Vector3f extents;
		/** The velocity of the particle */
		public Vector3f velocity;
		/** Lower throttle bound */
		public float minThrottle;
		/** Upper throttle bound */
		@SuppressWarnings("hiding")
		public float maxThrottle;
		/** Model part the emitter is bound to */
		public String part;
		/** Minimum health for the emitter to work */
		public float minHealth;
		/** Maximum health for the emitter to work */
		public float maxHealth;
	}

	public class AfterBurnEmitter{
		/** The name of the effect */
		public String effectType;
		/** The rate of emission */
		public int emitRate;
		/** The centre of the effect emitter */
		public Vector3f origin;
		/** The size of the box in which it emits */
		public Vector3f extents;
		/** The velocity of the particle */
		public Vector3f velocity;
		/** Model part the emitter is bound to */
		public String part;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public ModelBase GetModel() {
		return model;
	}
}