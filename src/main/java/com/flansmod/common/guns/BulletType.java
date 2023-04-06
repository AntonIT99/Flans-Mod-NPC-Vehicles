package com.flansmod.common.guns;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.client.model.ModelBase;
import net.minecraft.item.Item;
import net.minecraft.potion.PotionEffect;

import com.flansmod.common.FlansMod;
import com.flansmod.common.driveables.EnumWeaponType;
import com.flansmod.common.types.TypeFile;

public class BulletType extends ShootableType
{
	//for unrotated projectile
	public boolean Parachute = false;
	//labjac meme bullets
	public boolean Bouncerino = false;
	public boolean Ghost = false;
	public boolean Hesh = false;
	public boolean depthCharge = false;
	public boolean navalMine = false;
	public int activationDepth = 20;
	//theres a sea level in vehicletype too because of labjac incompetance
	public int seaLevel = 55;
	
	/** The number of flak particles to spawn upon exploding */
	public int flak = 0;
	/** The type of flak particles to spawn */
	public String flakParticles = "largesmoke";

	/** If true then this bullet will burn entites it hits */
	public boolean setEntitiesOnFire = false;

	/** If > 0 this will act like a mine and explode when a living entity comes within this radius of the grenade */
	public float livingProximityTrigger = -1F;
	/** If > 0 this will act like a mine and explode when a driveable comes within this radius of the grenade */
	public float driveableProximityTrigger = -1F;
	/** How much damage to deal to the entity that triggered it */
	public float damageToTriggerer = 0F;
	/** Detonation will not occur until after this time */
	public int primeDelay = 0;
	/** Particles given off in the detonation */
	public int explodeParticles = 0;
	public String explodeParticleType = "largesmoke";
	//for delay before missile decides to lock on
	public int lockonDelay = 10;

	/** Exclusively for driveable usage. Replaces old isBomb and isShell booleans with something more flexible */
	public EnumWeaponType weaponType = EnumWeaponType.NONE;

	public String hitSound;
	public float hitSoundRange;
	public boolean hitSoundEnable = false;
	public boolean entityHitSoundEnable = false;

	public boolean hasLight = false;
	public float penetratingPower = 1F;
	//xddd i set default to 2 pen so anything will pierce the default 1 armor - labjac
	public int armorPen = 2;
	public float penDecay = 0;
	public boolean HEAT = false;
	public boolean radarGuided = false;
	public boolean swordEnergy = false;

	/** Lock on variables. If true, then the bullet will search for a target at the moment it is fired */
	public boolean lockOnToPlanes = false, lockOnToVehicles = false, lockOnToMechas = false, lockOnToPlayers = false, lockOnToLivings = false;
	/** Lock on maximum angle for finding a target */
	public float maxLockOnAngle = 45F;
	/** Lock on force that pulls the bullet towards its prey */
	public float lockOnForce = 1F;
	public int maxDegreeOfMissile = 70;
	public int tickStartHoming = 5;
	public boolean enableSACLOS = false;
	public int maxDegreeOfSACLOS = 5;
	public int maxRangeOfMissile = 300;
	//public int maxDegreeOfMissileXAxis = 10;
	//public int maxDegreeOfMissileYAxis = 10;
	//public int maxDegreeOfMissileZAxis = 10;

	public boolean manualGuidance = false;
	public int lockOnFuse = 10;
	
	//tv guided missile
	public boolean TVguided = false;

	
    //armor tech
    public String ricochetSound = "bounceMG";
    public String minorPenSound = "";
    public String penetrateSound = "";
    public String overPenSound = "";
    public String APSsound = "";
    
    
	public ArrayList<PotionEffect> hitEffects = new ArrayList<PotionEffect>();

	public int numBullets = -1;
	public float bulletSpread = -1;

	public float dragInAir   = 1.0F;
	public float dragInWater = 0.80F;

	public boolean canSpotEntityDriveable = false;

	public int maxRange = -1;

	public boolean shootForSettingPos = false;
	public int shootForSettingPosHeight = 100;

	public boolean isDoTopAttack = false;
	
	
	//Smoke
	/** Time to remain after detonation */
	public int smokeTime = 0;
	/** Particles given off after detonation */
	public String smokeParticleType = "explode";
	/** The effects to be given to people coming too close */
	public ArrayList<PotionEffect> smokeEffects = new ArrayList<PotionEffect>();
	
	//stealing smoke grenade shit
	public ArrayList<PotionEffect> stolenSmokeEffects = new ArrayList<PotionEffect>();
	public boolean stolenSmoke = false;
	
	
	/** The radius for smoke effects to take place in */
	public float smokeRadius = 5F;
	public boolean TVguide = true;
	
	//Other stuff
	public boolean VLS = false;
	public int VLSTime = 0;
	public boolean fixedDirection = false;
	public float turnRadius = 3;
	public String boostPhaseParticle;
	public float trackPhaseSpeed = 2;
	public float trackPhaseTurn = 0.2F;

	
	
	//labjac ciws defense
	public boolean CIWSable = false;

	
	public boolean torpedo = false;
	public float seekerRange = 250;
	public float nonpenPenalty = 0;
	public float barelypenPenalty = 0.01f;
	public float overPenPenalty = 0.5f;
	public boolean bigWater = false;
	public boolean smallWater = true;
	public boolean modernTorpedo = false;
	public int aftermathFuse = 3;
	public boolean angel = false;
	public float angelSpeed = 2.5f;
	public boolean antiRadiation = false;
	//for bullet misses player
	public String missNoise = "Passby";
	
	//for stealing grenade system
	public boolean grenadeBounce = false;
	public boolean sticky;
	
	//for chemical weapons that can be stopped by gas masks
	public boolean smokeProtectable = false;
	
	//for alternate bullet model while docked on a plane wing
	public boolean hasLauncherModel = false;
	
	//so ww2 flak guns cant ciws effectively
	public boolean CIWSer = false;
	
	//so stolen grenade "smoke" can ignore smoke protection
	public boolean gasmaskable = true;
	
	//for "smoke" grenades that dont use potions and instead just fucking kills you
	public boolean angelOfDeath = false;
	
	public int bulletSmokeTime = 5;
	public int smokeDelay = 30;
	

	public boolean jamiogravity = false;
	
	
	//so damage and penetration can change at range
	public int dynamicBulletDelay = 9000;

	public float dynamicDamage = 1;
	public int suppression = 16;
	
	//star shell
	public boolean starShell = false;
	
	//so only certain bullets can kill ciwsable
	public boolean ciwsBullet = false;
	
	
	//ASW weapons can still lock on at 5 meters even if you are dead quiet
	public float ASWminRange = 5;
	
	//for weapons that dont need lockon angle (asw torp, anti rad or whatever
	public boolean infiniteAngle = false;
	
	//for joystick control missile
	public boolean trueManual = false;
	public float joystickSensitivity = 1;
	
	//for early heat seeker that only locks on to jet ass thruster
	public boolean earlyInfrared = false;
	
	//for recon vehicles that read coords
	public boolean scoutBullet = false;




	/** The static bullets list */
	public static List<BulletType> bullets = new ArrayList<BulletType>();

	public BulletType(TypeFile file)
	{
		super(file);
		texture = "defaultBullet";
		bullets.add(this);
	}

	@Override
	protected void read(String[] split, TypeFile file)
	{
		super.read(split, file);
		try
		{
			if(split[0].equals("FlakParticles"))
				flak = Integer.parseInt(split[1]);
			else if(split[0].equals("FlakParticleType"))
				flakParticles = split[1];
			else if(split[0].equals("SetEntitiesOnFire"))
				setEntitiesOnFire = Boolean.parseBoolean(split[1]);
			
			//for suppression blindness length
			if(split[0].equals("suppression"))
				suppression = Integer.parseInt(split[1]);
			
			//labjac shit
			//for unrotated projectile
			else if(split[0].equals("Parachute"))
				Parachute = Boolean.parseBoolean(split[1]);
			
			//scout coord reader bullet
			else if(split[0].equals("scoutBullet"))
				scoutBullet = Boolean.parseBoolean(split[1]);
			
			else if(split[0].equals("infiniteAngle"))
				infiniteAngle = Boolean.parseBoolean(split[1]);
			
			else if(split[0].equals("earlyInfrared"))
				earlyInfrared = Boolean.parseBoolean(split[1]);
			
			//star shell illumination
			else if(split[0].equals("starShell"))
				starShell = Boolean.parseBoolean(split[1]);
			
			
			//ciwsable only by certain bullets
			else if(split[0].equals("ciwsBullet"))
				ciwsBullet = Boolean.parseBoolean(split[1]);
			
			//true manual guidance (not saclos)
			else if(split[0].equals("joystick"))
				trueManual = Boolean.parseBoolean(split[1]);
			else if(split[0].equals("manualSensitivity"))
				joystickSensitivity = (float) (Float.parseFloat(split[1]));
			
			
			//tv guided missile
			else if(split[0].equals("TVguided"))
				TVguided = Boolean.parseBoolean(split[1]);
			
			
			//so bullet can have different damage/penetration at long range
			if(split[0].equals("dynamicBulletDelay"))
				dynamicBulletDelay = Integer.parseInt(split[1]);
			
			else if(split[0].equals("dynamicDamage"))
				dynamicDamage = (float) (Float.parseFloat(split[1]));
			
			

			
			//for rocket pod models while ammo mounted on a plane
			else if(split[0].equals("hasLauncherModel"))
				hasLauncherModel = Boolean.parseBoolean(split[1]);
			
			//for bullet effects to be stopped by gas masks
			else if(split[0].equals("smokeProtectable"))
				smokeProtectable = Boolean.parseBoolean(split[1]);
			
			//for stolen grenades
			else if(split[0].equals("grenadeBounce"))
				grenadeBounce = Boolean.parseBoolean(split[1]);
			
			//for stolen smoke grenade code to be able to ignore gas masks
			else if(split[0].equals("gasmaskable"))
				gasmaskable = Boolean.parseBoolean(split[1]);
			
			//for stolen smoke
			else if(split[0].equals("stolenSmokeEffect"))
				stolenSmokeEffects.add(getPotionEffect(split));
			
			else if(split[0].equals("stolenSmoke"))
				stolenSmoke = Boolean.parseBoolean(split[1]);
			
			else if(split[0].equals("angelOfDeath"))
				angelOfDeath = Boolean.parseBoolean(split[1]);
			
			else if(split[0].equals("smokeParticleType"))
			{
				smokeParticleType = split[1];
			}
			
			else if(split[0].equals("bulletSmokeTime"))
				bulletSmokeTime = Integer.parseInt(split[1]);
			
			//timer before smoke turns on
			else if(split[0].equals("smokeDelay"))
				smokeDelay = Integer.parseInt(split[1]);
			
			
			
			
			//for angel of death submunition system
			else if(split[0].equals("shrapnelAngel"))
				angel = Boolean.parseBoolean(split[1]);
			else if(split[0].equals("angelSpeed"))
				barelypenPenalty = (float) (Float.parseFloat(split[1]));
			
			//if you want bullets to bypass armor system in unique ways
			else if(split[0].equals("nonPenPenalty"))
				nonpenPenalty = (float) (Float.parseFloat(split[1]));
			else if(split[0].equals("overPenPenalty"))
				overPenPenalty = (float) (Float.parseFloat(split[1]));
			else if(split[0].equals("barelyPenPenalty"))
				barelypenPenalty = (float) (Float.parseFloat(split[1]));

			

			else if(split[0].equals("CIWSable"))
				CIWSable = Boolean.parseBoolean(split[1]);
			
			else if(split[0].equals("CIWSer"))
				CIWSer = Boolean.parseBoolean(split[1]);
			
			else if(split[0].equals("armorPen"))
				armorPen = Integer.parseInt(split[1]);
			else if(split[0].equals("penDecay"))
				penDecay = (float) (Float.parseFloat(split[1])*0.5);
			//threw in a x0.5 to appease cross country shooters

			//this for custom penalties for penetrationa nd barely penetration vs player body armor (not vehicles)
			//default is 1/4 dmg for non pen and 1/2 dmg for barelypen for swords, otherwise the usual 0.001 and .25
			
			//labjac armor tech ricochet noise
			else if(split[0].equals("ricochetSound"))
			{
				ricochetSound = split[1];
				FlansMod.proxy.loadSound(contentPack, "driveables", split[1]);
			}
			else if(split[0].equals("minorPenSound"))
			{
				minorPenSound = split[1];
				FlansMod.proxy.loadSound(contentPack, "driveables", split[1]);
			}
			else if(split[0].equals("penetrateSound"))
			{
				penetrateSound = split[1];
				FlansMod.proxy.loadSound(contentPack, "driveables", split[1]);
			}
			else if(split[0].equals("overPenSound"))
			{
				overPenSound = split[1];
				FlansMod.proxy.loadSound(contentPack, "driveables", split[1]);
			}
			else if(split[0].equals("APSsound"))
			{
				APSsound = split[1];
				FlansMod.proxy.loadSound(contentPack, "driveables", split[1]);
			}
			
			
			else if(split[0].equals("missNoise"))
			{
				missNoise = split[1];
				FlansMod.proxy.loadSound(contentPack, "driveables", split[1]);
			}
			
			//is heat? if so, composite armor is super effective, alsog ood for ERA that stops HEAT only - tlabjac
			else if(split[0].equals("HEAT"))
				HEAT = Boolean.parseBoolean(split[1]);
			//if radar guided, missile ignores flares
			else if(split[0].equals("radarGuided"))
				radarGuided = Boolean.parseBoolean(split[1]);
			
			//labjac meme bullets
			//cannonball bounce on ground
			else if(split[0].equals("Bouncy"))
				Bouncerino = Boolean.parseBoolean(split[1]);
			//spawns a bullet if it hits a block, so you can then spawn a short fuse ghost bullet that kills people through wall
			else if(split[0].equals("Hesh"))
				Hesh = Boolean.parseBoolean(split[1]);
			//can go through walls
			else if(split[0].equals("Ghost"))
				Ghost = Boolean.parseBoolean(split[1]);
			//for shells hitting water
			else if(split[0].equals("bigWater"))
				bigWater = Boolean.parseBoolean(split[1]);
			//for bullets hitting water, on by default
			else if(split[0].equals("smallWater"))
				smallWater = Boolean.parseBoolean(split[1]);
			
			else if(split[0].equals("navalMine"))
				navalMine = Boolean.parseBoolean(split[1]);
			else if(split[0].equals("depthCharge"))
				depthCharge = Boolean.parseBoolean(split[1]);
			//depth at which mine stops moving or depth charge blows up
			else if(split[0].equals("activationDepth"))
				activationDepth = Integer.parseInt(split[1]);
			//bullet fuse after going thorugh weak blocks like wood or dirt
			else if(split[0].equals("aftermathFuse"))
				aftermathFuse = Integer.parseInt(split[1]);



			else if(split[0].equals("HitSoundEnable"))
				hitSoundEnable = Boolean.parseBoolean(split[1]);
			else if(split[0].equals("EntityHitSoundEnable"))
				entityHitSoundEnable = Boolean.parseBoolean(split[1]);
			else if(split[0].equals("HitSound"))
			{
				hitSound = split[1];
				FlansMod.proxy.loadSound(contentPack, "sound", split[1]);
			}
			else if(split[0].equals("HitSoundRange"))
				hitSoundRange = Float.parseFloat(split[1]);
			else if(split[0].equals("Penetrates"))
				penetratingPower = (Boolean.parseBoolean(split[1].toLowerCase()) ? 1F : 0.25F);
			else if(split[0].equals("Penetration") || split[0].equals("PenetratingPower"))
				penetratingPower = Float.parseFloat(split[1]);

			else if(split[0].equals("DragInAir"))
			{
				dragInAir = Float.parseFloat(split[1]);
				dragInAir = dragInAir<0? 0: dragInAir>1? 1: dragInAir;
			}
			else if(split[0].equals("DragInWater"))
			{
				dragInWater = Float.parseFloat(split[1]);
				dragInWater = dragInWater<0? 0: dragInWater>1? 1: dragInWater;
			}
			
			//asw and seeker things
			else if(split[0].equals("ASWminRange"))
				ASWminRange = Float.parseFloat(split[1]);
			else if(split[0].equals("seekerRange"))
				seekerRange = Float.parseFloat(split[1]);


			else if(split[0].equals("NumBullets"))
				numBullets = Integer.parseInt(split[1]);
			else if(split[0].equals("Accuracy") || split[0].equals("Spread"))
				bulletSpread = Float.parseFloat(split[1]);

			else if(split[0].equals("LivingProximityTrigger"))
				livingProximityTrigger = Float.parseFloat(split[1]);
			else if(split[0].equals("VehicleProximityTrigger"))
				driveableProximityTrigger = Float.parseFloat(split[1]);
			else if(split[0].equals("DamageToTriggerer"))
				damageToTriggerer = Float.parseFloat(split[1]);
			else if(split[0].equals("PrimeDelay") || split[0].equals("TriggerDelay"))
				primeDelay = Integer.parseInt(split[1]);
			else if(split[0].equals("NumExplodeParticles"))
				explodeParticles = Integer.parseInt(split[1]);
			else if(split[0].equals("ExplodeParticles"))
				explodeParticleType = split[1];
			else if(split[0].equals("SmokeTime"))
				smokeTime = Integer.parseInt(split[1]);
			else if(split[0].equals("SmokeParticles"))
				smokeParticleType = split[1];
			else if(split[0].equals("SmokeEffect"))
				smokeEffects.add(getPotionEffect(split));
			else if(split[0].equals("SmokeRadius"))
				smokeRadius = Float.parseFloat(split[1]);
			else if(split[0].equals("VLS") || split[0].equals("HasDeadZone"))
				VLS = Boolean.parseBoolean(split[1]);
			else if(split[0].equals("VLSTime") || split[0].equals("DeadZoneTime"))
				VLSTime = Integer.parseInt(split[1]);
			else if(split[0].equals("FixedTrackDirection"))
				fixedDirection = Boolean.parseBoolean(split[1]);
			else if(split[0].equals("GuidedTurnRadius"))
				turnRadius = Float.parseFloat(split[1]);
			else if(split[0].equals("GuidedPhaseSpeed"))
				trackPhaseSpeed = Float.parseFloat(split[1]);
			else if(split[0].equals("GuidedPhaseTurnSpeed"))
				trackPhaseTurn = Float.parseFloat(split[1]);
			else if(split[0].equals("BoostParticle"))
				boostPhaseParticle = split[1];
			else if(split[0].equals("Torpedo"))
				torpedo = Boolean.parseBoolean(split[1]);
			else if(split[0].equals("modernTorpedo"))
				modernTorpedo = Boolean.parseBoolean(split[1]);
			else if(split[0].equals("antiRadiation"))
				antiRadiation = Boolean.parseBoolean(split[1]);
			
			else if(split[0].equals("Bomb"))
				weaponType = EnumWeaponType.BOMB;
			else if(split[0].equals("Shell"))
			{
				weaponType = EnumWeaponType.SHELL;
			//jamiogravity = true;	
			}
			
			
			//jamio gravity final solution
			else if(split[0].equals("jamiogravity"))
				jamiogravity = Boolean.parseBoolean(split[1]);
			
			else if(split[0].equals("Missile"))
				weaponType = EnumWeaponType.MISSILE;
			else if(split[0].equals("WeaponType"))
				weaponType = EnumWeaponType.valueOf(split[1].toUpperCase());

			else if(split[0].equals("HasLight"))
				hasLight = Boolean.parseBoolean(split[1].toLowerCase());
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
			else if(split[0].equals("MaxLockOnAngle"))
				maxLockOnAngle = Float.parseFloat(split[1]);
			else if(split[0].equals("LockOnForce") || split[0].equals("TurningForce"))
				lockOnForce = Float.parseFloat(split[1]);
			else if(split[0].equals("MaxDegreeOfLockOnMissile"))
				maxDegreeOfMissile = Integer.parseInt(split[1]);
			else if(split[0].equals("TickStartHoming"))
				tickStartHoming = Integer.parseInt(split[1]);
			else if(split[0].equals("EnableSACLOS"))
				enableSACLOS = Boolean.parseBoolean(split[1]);
			else if(split[0].equals("MaxDegreeOFSACLOS"))
				maxDegreeOfSACLOS = Integer.parseInt(split[1]);
			else if(split[0].equals("MaxRangeOfMissile"))
				maxRangeOfMissile = Integer.parseInt(split[1]);
			else if(split[0].equals("CanSpotEntityDriveable"))
				canSpotEntityDriveable = Boolean.parseBoolean(split[1].toLowerCase());
			else if(split[0].equals("ShootForSettingPos"))
				shootForSettingPos = Boolean.parseBoolean(split[1].toLowerCase());
			else if(split[0].equals("ShootForSettingPosHeight"))
				shootForSettingPosHeight = Integer.parseInt(split[1]);
			else if(split[0].equals("IsDoTopAttack"))
				isDoTopAttack = Boolean.parseBoolean(split[1].toLowerCase());



			else if(split[0].equals("PotionEffect"))
				hitEffects.add(getPotionEffect(split));
			else if(split[0].equals("ManualGuidance"))
				manualGuidance = Boolean.parseBoolean(split[1].toLowerCase());
			else if(split[0].equals("LockOnFuse"))
				lockOnFuse = Integer.parseInt(split[1]);
			else if(split[0].equals("MaxRange"))
				maxRange = Integer.parseInt(split[1]);
			
			
			//labjac sword energy so swords phase through vehicles to kill crew, but will hurt animal "vehicles"

			else if(split[0].equals("SwordEnergy"))
			{
				swordEnergy = Boolean.parseBoolean(split[1].toLowerCase());
				penetratingPower = 9000;
				//beginning of cancer
				tickStartHoming = 1;
				lockOnForce = 300;
				maxLockOnAngle = 90;
				lockOnToPlayers = true;
				lockOnToLivings = true;
				seekerRange = 3;
				//now swords still do 1/4 damage if non pen but can still be manually changed for maces, clubs, spears etc
				barelypenPenalty = 0.5f;
				nonpenPenalty = 0.25f;
				//xdddd this is cancer
			}
			
			else if(split[0].equals("nonpenPenalty"))
				nonpenPenalty = Float.parseFloat(split[1]);
			else if(split[0].equals("barelypenPenalty"))
				barelypenPenalty = Float.parseFloat(split[1]);
			
		}
		catch (Exception e)
		{
			System.out.println("Reading bullet file failed.");
			if(FlansMod.printStackTrace)
			{
				e.printStackTrace();
			}
		}
	}

	public static BulletType getBullet(String s)
	{
		for(BulletType bullet : bullets)
		{
			if(bullet.shortName.equals(s))
				return bullet;
		}
		return null;
	}

	public static BulletType getBullet(Item item)
	{
		for(BulletType bullet : bullets)
		{
			if(bullet.item == item)
				return bullet;
		}
		return null;
	}

	/** To be overriden by subtypes for model reloading */
	public void reloadModel()
	{
		model = FlansMod.proxy.loadModel(modelString, shortName, ModelBase.class);
	}
}