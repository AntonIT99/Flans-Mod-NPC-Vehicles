package com.flansmod.common.guns;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import org.lwjgl.input.Keyboard;

import com.flansmod.client.model.ModelAttachment;
import com.flansmod.client.model.ModelCasing;
import com.flansmod.client.model.ModelFlash;
import net.minecraft.client.model.ModelBase;
import net.minecraft.init.Items;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemDye;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;

import com.flansmod.client.model.ModelGun;
import com.flansmod.client.model.ModelMG;
import com.flansmod.common.FlansMod;
import com.flansmod.common.paintjob.PaintableType;
import com.flansmod.common.paintjob.Paintjob;
import com.flansmod.common.types.InfoType;
import com.flansmod.common.types.TypeFile;
import com.flansmod.common.vector.Vector3f;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class GunType extends PaintableType implements IScope
{
	public static final Random rand = new Random();
	
	//Gun Behaviour Variables
	/** The list of bullet types that can be used in this gun */
	public List<ShootableType> ammo = new ArrayList<ShootableType>();
	/** Whether the player can press the reload key (default R) to reload this gun */
	public boolean canForceReload = true;
	//labjac blocking
	public boolean canBlock = false;
	public boolean matchlock = false;
	
	//for armor reload multipliers
	public boolean RepeatingGun = false;
	public boolean OldGun = false;
	public boolean Heavy = false;
	public boolean Bow = false;
	
	//labjac melee animatio for "guns" spear is to hold it pointing forward with bow animation
	public boolean shootMelee = false;
	public boolean spear = false;
	public int drawTime = 30;
	
	
	
	public String actionSound;
	
	
	/** The time (in ticks) it takes to reload this gun */
	public int reloadTime;
	/** The amount to recoil the player's view by when firing a single shot from this gun */
	public float recoilPitch = 0.0F;
	public float recoilYaw = 0.0F;
	public float rndRecoilPitchRange = 1;
	public float rndRecoilYawRange = 1;
	public float decreaseRecoilPitch = 1;
	public float decreaseRecoilYaw = 1;
	/** The amount that bullets spread out when fired from this gun */
	public float bulletSpread;
	public float sneakSpreadMultiplier = 0.63F;
	public float sprintSpreadMultiplier = 1.75F;
	public boolean allowSpreadByBullet = false;
	/** Damage inflicted by this gun. Multiplied by the bullet damage. */
	public float damage = 0;
	/** The damage inflicted upon punching someone with this gun */
	public float meleeDamage = 1;
	/** The speed of bullets upon leaving this gun */
	public float bulletSpeed = 5.0F;
	/** The number of bullet entities created by each shot */
	public int numBullets = 1;
	public boolean allowNumBulletsByBulletType = false;
	/** The delay between shots in ticks (1/20ths of seconds) */
	public float shootDelay = 0; //chang eto float to allow rpm
	/** Number of ammo items that the gun may hold. Most guns will hold one magazine.
	 * Some may hold more, such as Nerf pistols, revolvers or shotguns */
	public int numPrimaryAmmoItems = 1;
	//public int numAmmoItemsInGun = 1;
	/** The firing mode of the gun. One of semi-auto, full-auto, minigun or burst */
	public EnumFireMode mode = EnumFireMode.FULLAUTO;
	public EnumFireMode[] submode = new EnumFireMode[]{ EnumFireMode.FULLAUTO };
	public EnumFireMode defaultmode = mode;
	/** The number of bullets to fire per burst in burst mode */
	public int numBurstRounds = 3;
	/** The required speed for minigun mode guns to start firing */
	public int minigunStartSpeed = 15;
	/** Whether this gun can be used underwater */
	public boolean canShootUnderwater = true;
	/** The amount of knockback to impact upon the player per shot */
	public float knockback = 0F;
	/** The secondary function of this gun. By default, the left mouse button triggers this */
	public EnumSecondaryFunction secondaryFunction = EnumSecondaryFunction.ADS_ZOOM;
	public EnumSecondaryFunction secondaryFunctionWhenShoot = null;
	/** If true, then this gun can be dual wielded */
	public boolean oneHanded = false;
	
	//labjac minigun replacement
	public int labigunLimit = 0;
	public boolean labigunDelay = false;

	/** For one shot items like a panzerfaust */
	public boolean consumeGunUponUse = false;
	/** Show the crosshair when holding this weapon */
	public boolean showCrosshair = true;
	/** Item to drop on shooting */
	public String dropItemOnShoot = null;
	//Custom Melee Stuff
	/** The time delay between custom melee attacks */
	public int meleeTime = 1;

	/** The path the melee weapon takes */
	public ArrayList<Vector3f> meleePath = new ArrayList<Vector3f>(), meleePathAngles = new ArrayList<Vector3f>();
	/** The points on the melee weapon that damage is actually done from. */
	public ArrayList<Vector3f> meleeDamagePoints = new ArrayList<Vector3f>();
	/** Set these to make guns only usable by a certain type of entity */
	
	
	//labjac mount and blade
	public int meleeLeftTime = 1;
	public float swordArmorPen = 10;
	
	//infnatry shootpoint offset
	public float Xoffset = -0.05f;
	public float Yoffset = -0.015f;
	public float Zoffset = 0.05f; //more big positive z = spawn point further to right
	
	public ArrayList<Vector3f> meleeLeftPath = new ArrayList<Vector3f>(), meleeLeftPathAngles = new ArrayList<Vector3f>();
	/** The points on the melee weapon that damage is actually done from. */
	public ArrayList<Vector3f> meleeLeftDamagePoints = new ArrayList<Vector3f>();
	/** Set these to make guns only usable by a certain type of entity */	
	public boolean meleeLeft = false;

	public int meleeRightTime = 1;	
	public ArrayList<Vector3f> meleeRightPath = new ArrayList<Vector3f>(), meleeRightPathAngles = new ArrayList<Vector3f>();
	/** The points on the melee weapon that damage is actually done from. */
	public ArrayList<Vector3f> meleeRightDamagePoints = new ArrayList<Vector3f>();
	/** Set these to make guns only usable by a certain type of entity */	
	public boolean meleeRight = false;	
	
	public String bulletInsert = "defaultshellinsert";
	
	public int meleeDownTime = 1;
	public ArrayList<Vector3f> meleeDownPath = new ArrayList<Vector3f>(), meleeDownPathAngles = new ArrayList<Vector3f>();
	/** The points on the melee weapon that damage is actually done from. */
	public ArrayList<Vector3f> meleeDownDamagePoints = new ArrayList<Vector3f>();
	/** Set these to make guns only usable by a certain type of entity */
	public boolean meleeDown = false;
	//mount and blade booleans done
	
	public boolean usableByPlayers = true, usableByMechas = true;
	/** Whether Gun makes players to be EnumAction.bow */
	public EnumAction itemUseAction = EnumAction.bow;
	public int canLockOnAngle = 5;
	public int lockOnSoundTime = 0;
	public String lockOnSound = "";
	public int maxRangeLockOn = 80;

	public boolean canSetPosition = false;
	public boolean lance = false;

	public boolean lockOnToPlanes = false, lockOnToVehicles = false, lockOnToMechas = false, lockOnToPlayers = false, lockOnToLivings = false;

	//Information
	//Show any variables into the GUI when hovering over items.
	/** If false, then attachments wil not be listed in item GUI */
	public boolean showAttachments = true;
	/** Show statistics */
	public boolean showDamage = false, showRecoil = false, showSpread = false;
	/** Show reload time in seconds */
	public boolean showReloadTime = false;

	//Shields
	//A shield is actually a gun without any shoot functionality (similar to knives or binoculars)
	//and a load of shield code on top. This means that guns can have in built shields (think Nerf Stampede)
	/** Whether or not this gun has a shield piece */
	public boolean shield = false;
	/** Shield collision box definition. In model co-ordinates */
	public Vector3f shieldOrigin, shieldDimensions;
	/** Float between 0 and 1 denoting the proportion of damage blocked by the shield */
	public float shieldDamageAbsorption = 0.1F;

	//Sounds
	/** The sound played upon shooting */
	public String shootSound;
	
	//goldsloth long range noise
	public String distantShootSound;
	
	
	/** The sound to play upon shooting on last round */
    public String lastShootSound;
	/** The sound played upon shooting with a suppressor */
	public String suppressedShootSound;
	/** The length of the sound for looping sounds */
	public int shootSoundLength;
	/** Whether to distort the sound or not. Generally only set to false for looping sounds */
	public boolean distortSound = true;
	/** The sound to play upon reloading */
	public String reloadSound;
	/** The sound to play upon reloading when empty */
	public String reloadSoundOnEmpty;
	public String clickSoundOnEmpty;
	public int idleSoundRange = 50;
	public int meleeSoundRange = 50;
	public int reloadSoundRange = 50;
	public int gunSoundRange = 50;
	public int distantSoundRange = 200;

	//Looping sounds
	/** Whether the looping sounds should be used. Automatically set if the player sets any one of the following sounds */
	public boolean useLoopingSounds = false;
	/** Played when the player starts to hold shoot */
	public String warmupSound;
	public int warmupSoundLength = 20;
	/** Played in a loop until player stops holding shoot */
	public String loopedSound;
	public int loopedSoundLength = 20;
	/** Played when the player stops holding shoot */
	public String cooldownSound;


	/** The sound to play upon weapon swing */
	public String meleeSound;
	public String meleeHitSound;
	public String ShieldHitSound;
	/** The sound to play while holding the weapon in the hand*/
	public String idleSound;
	public int idleSoundLength;


	//Deployable Settings
	/** If true, then the bullet does not shoot when right clicked, but must instead be placed on the ground */
	public boolean deployable = false;
	/** The deployable model */
	@SideOnly(Side.CLIENT)
	public ModelMG deployableModel;
	/** The deployable model's texture*/
	public String deployableTexture;
	/** Various deployable settings controlling the player view limits and standing position */
	public float standBackDist = 1.5F, topViewLimit = -60F, bottomViewLimit = 30F, sideViewLimit = 45F, pivotHeight = 0.375F;

	//Default Scope Settings. Overriden by scope attachments
	//In many cases, this will simply be iron sights
	/** Default scope overlay texture */
	public String defaultScopeTexture;
	/** Whether the default scope has an overlay */
	public boolean hasScopeOverlay = false;
	/** The zoom level of the default scope */
	public float zoomLevel = 1.0F;
	/** The FOV zoom level of the default scope */
	public float FOVFactor = 1.5F;

	public boolean allowNightVision = false;

	/** For guns with 3D models */
	@SideOnly(Side.CLIENT)
	public ModelGun model;
	/** For making detailed models and scaling down */
	@SuppressWarnings("hiding")
	public float modelScale = 1F;
	/** For adding a bullet casing model to render */
	public ModelCasing casingModel;
	/** For adding a muzzle flash model to render */
	public ModelFlash flashModel;
	/** Set a bullet casing texture */
	public String casingTexture;
	/** Set a muzzle flash texture */
	public String flashTexture;
	/** Set a hit marker texture */
	public String hitTexture;

	//Attachment settings
	/** If this is true, then all attachments are allowed. Otherwise the list is checked */
	public boolean allowAllAttachments = false;
	/** The list of allowed attachments for this gun */
	public ArrayList<AttachmentType> allowedAttachments = new ArrayList<AttachmentType>();
	/** Whether each attachment slot is available */
	public boolean allowBarrelAttachments = false, allowScopeAttachments = false,
			allowStockAttachments = false, allowGripAttachments = false, allowGadgetAttachments = false,
			allowSlideAttachments = false, allowPumpAttachments = false, allowAccessoryAttachments = false;
	/** The number of generic attachment slots there are on this gun */
	public int numGenericAttachmentSlots = 0;

	/** The static hashmap of all guns by shortName */
	public static HashMap<String, GunType> guns = new HashMap<String, GunType>();
	/** The static list of all guns */
	public static ArrayList<GunType> gunList = new ArrayList<GunType>();

	//Modifiers
	/** Speeds up or slows down player movement when this item is held */
	public float moveSpeedModifier = 1F;

	/** Gives knockback resistance to the player */
	public float knockbackModifier = 0F;

	/** Default spread of the gun. Do not modify. */
	private float defaultSpread = 0F;

	//for pistol using sword energy reload
	public boolean sidearm = false;

	public int blockTime = 100;

	
	//for dill to prevent zooming a gun into your face
	public float dillZoomModifier = 1f;
	//adjust ads elevation
	public float dillElevator = 1f;
	
	//for battlefielderino recoilerino
	public float recoilElevator = 0f;
	public float sustainedelevator = 0.25f;
	public float firstShotRecoil = 0.1f;

	
	//for sustained fire max recoilf actor
	public float sustainedRecoilPitch = 1f;
	public float sustainedRecoilYaw = 1f;

	//how far away from muzzle the particle will spawn -t labjac
	public float muzzleOffset = 5;
	//what type of particle comes out of muzzle, default is for muskets
	public String muzzleParticle = "smallSmoke";
	//how many particles
	public int muzzleParticleCount = 7;
	//should they spawn at all
	public boolean muzzleParticleHave = false;



	public GunType(TypeFile file)
	{
		super(file);
	}

	@Override
	public void preRead(TypeFile file) 
	{	
		super.preRead(file);
	}
	
	@Override
	public void postRead(TypeFile file)
	{
		super.postRead(file);
		
		gunList.add(this);
		guns.put(shortName, this);
	}

	@Override
	protected void read(String[] split, TypeFile file)
	{
		super.read(split, file);
		try
		{
			if(split[0].equals("Damage"))
				damage = Float.parseFloat(split[1]);
			//xddd i broke it on purpose -t labjac
			else if(split[0].equals("MeleeDamaged"))
			{
				meleeDamage = Float.parseFloat(split[1]);
				if(meleeDamage > 0.5F)
					secondaryFunction = EnumSecondaryFunction.MELEE;
			}
			//for dill
			else if(split[0].equals("dillZoomModifier"))
				dillZoomModifier = Float.parseFloat(split[1]);
			else if(split[0].equals("dillElevator"))
				dillElevator = Float.parseFloat(split[1]);
			
			//for muzzle aprticles
			else if(split[0].equals("muzzleParticleHave"))
				muzzleParticleHave = Boolean.parseBoolean(split[1].toLowerCase());
			else if(split[0].equals("muzzleOffset"))
				muzzleOffset = Float.parseFloat(split[1]);
			else if(split[0].equals("muzzleParticleCount"))
				muzzleParticleCount = Integer.parseInt(split[1]);
			else if(split[0].equals("muzzleParticle"))
				muzzleParticle = split[1];
			
			
			//infantry offset bullet origin
			else if(split[0].equals("Xoffset"))
				Xoffset = Float.parseFloat(split[1]);
			else if(split[0].equals("Yoffset"))
				Yoffset = Float.parseFloat(split[1]);
			else if(split[0].equals("Zoffset"))
				Zoffset = Float.parseFloat(split[1]);
            

			
			//battlefielderino
			else if(split[0].equals("recoilElevator"))
				recoilElevator = Float.parseFloat(split[1]);
			else if(split[0].equals("sustainedelevator"))
				sustainedelevator = Float.parseFloat(split[1]);
			else if(split[0].equals("firstShotRecoil"))
				firstShotRecoil = Float.parseFloat(split[1]);
			
			//for nu recoil
			else if(split[0].equals("sustainedRecoilPitch"))
				sustainedRecoilPitch = 0.3f * Float.parseFloat(split[1]); //universal x0.3 nerf to prevent redoing all configs
			else if(split[0].equals("sustainedRecoilYaw"))
				sustainedRecoilYaw = 0.3f * Float.parseFloat(split[1]);
			
			else if(split[0].equals("CanForceReload"))
				canForceReload = Boolean.parseBoolean(split[1].toLowerCase());
			else if(split[0].equals("ReloadTime"))
				reloadTime = Integer.parseInt(split[1]);
			else if(split[0].equals("Recoil"))
				recoilPitch = 0.3f * Float.parseFloat(split[1]);
			else if(split[0].equals("RecoilYaw"))
				recoilYaw = 0.3f * Float.parseFloat(split[1]);
			else if(split[0].equals("RandomRecoilRange"))
				rndRecoilPitchRange = Float.parseFloat(split[1]);
			else if(split[0].equals("RandomRecoilYawRange"))
				rndRecoilYawRange = Float.parseFloat(split[1]);
			else if(split[0].equals("DecreaseRecoil"))
				decreaseRecoilPitch = Float.parseFloat(split[1]);
			else if(split[0].equals("DecreaseRecoilYaw"))
				decreaseRecoilYaw = Float.parseFloat(split[1]);
			else if(split[0].equals("Knockback"))
				knockback = Float.parseFloat(split[1]);
			else if(split[0].equals("Accuracy") || split[0].equals("Spread"))
				defaultSpread = bulletSpread = Float.parseFloat(split[1]);
			else if(split[0].equals("SneakSpreadModifier"))
				sneakSpreadMultiplier = Float.parseFloat(split[1]);
			else if (split[0].equals("SprintSpreadModifier"))
				sprintSpreadMultiplier = Float.parseFloat(split[1]);
			else if(split[0].equals("NumBullets"))
				numBullets = Integer.parseInt(split[1]);
			else if(split[0].equals("AllowNumBulletsByBulletType"))
				allowNumBulletsByBulletType = Boolean.parseBoolean(split[1]);
			else if(split[0].equals("AllowSpreadByBullet"))
				allowSpreadByBullet = Boolean.parseBoolean(split[1]);
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
			
			//sidearm reload
			else if(split[0].equals("sidearm"))
				sidearm = Boolean.parseBoolean(split[1].toLowerCase());
			
			else if(split[0].equals("ConsumeGunOnUse"))
				consumeGunUponUse = Boolean.parseBoolean(split[1]);
			else if(split[0].equals("ShowCrosshair"))
				showCrosshair = Boolean.parseBoolean(split[1]);
			else if(split[0].equals("DropItemOnShoot"))
				dropItemOnShoot = split[1];
			else if(split[0].equals("NumBurstRounds"))
				numBurstRounds = Integer.parseInt(split[1]);
			//too bad break free of jamio chains, -t labjac
			else if(split[0].equals("MinigunStartSpeed"))
				minigunStartSpeed = Integer.parseInt(split[1]);
			else if(split[0].equals("ItemUseAction")){
				itemUseAction = EnumAction.valueOf(split[1].toLowerCase());
			}
			else if(split[0].equals("MaxRangeLockOn"))
				maxRangeLockOn = Integer.parseInt(split[1]);


			//Information
			else if(split[0].equals("ShowAttachments"))
				showAttachments = Boolean.parseBoolean(split[1]);
			else if(split[0].equals("ShowDamage"))
				showDamage = Boolean.parseBoolean(split[1]);
			else if(split[0].equals("ShowRecoil"))
				showRecoil = Boolean.parseBoolean(split[1]);
			else if(split[0].equals("ShowAccuracy"))
				showSpread = Boolean.parseBoolean(split[1]);
			else if(split[0].equals("ShowReloadTime"))
				showReloadTime = Boolean.parseBoolean(split[1]);
			


			//Sounds
			else if(split[0].equals("ShootDelay"))
				shootDelay = Float.parseFloat(split[1]);
			else if(split[0].equals("RPM"))
				shootDelay = 20f / (Float.parseFloat(split[1])/60f); //1200rpm is still maximum
			else if(split[0].equals("SoundLength"))
				shootSoundLength = Integer.parseInt(split[1]);
			else if(split[0].equals("DistortSound"))
				distortSound = split[1].equals("True");
			else if(split[0].equals("IdleSoundRange"))
				idleSoundRange = Integer.parseInt(split[1]);
			else if(split[0].equals("MeleeSoundRange"))
				meleeSoundRange = Integer.parseInt(split[1]);
			else if(split[0].equals("ReloadSoundRange"))
				reloadSoundRange = Integer.parseInt(split[1]);
			else if(split[0].equals("GunSoundRange"))
				gunSoundRange = Integer.parseInt(split[1]);
			
			//goldsloth
			else if(split[0].equals("distantSoundRange"))
				distantSoundRange = Integer.parseInt(split[1]);
			
			
			else if(split[0].equals("ShootSound"))
			{
				shootSound = split[1];
				FlansMod.proxy.loadSound(contentPack, "guns", split[1]);
			}
			
			//goldsloth
			else if(split[0].equals("distantShootSound"))
			{
				distantShootSound = split[1];
				FlansMod.proxy.loadSound(contentPack, "guns", split[1]);
			}
			
			
			else if(split[0].equals("LastShootSound"))
			{
				lastShootSound = split[1];
				FlansMod.proxy.loadSound(contentPack, "guns", split[1]);
			}
			else if(split[0].equals("SuppressedShootSound"))
			{
				suppressedShootSound = split[1];
				FlansMod.proxy.loadSound(contentPack, "guns", split[1]);
			}
			else if(split[0].equals("ReloadSound"))
			{
				reloadSound = split[1];
				FlansMod.proxy.loadSound(contentPack, "guns", split[1]);
			}
			else if(split[0].equals("EmptyReloadSound"))
			{
				reloadSoundOnEmpty = split[1];
				FlansMod.proxy.loadSound(contentPack, "guns", split[1]);
			}
			else if(split[0].equals("EmptyClickSound"))
			{
				clickSoundOnEmpty = split[1];
				FlansMod.proxy.loadSound(contentPack, "guns", split[1]);
			}
			else if(split[0].equals("IdleSound"))
			{
				idleSound = split[1];
				FlansMod.proxy.loadSound(contentPack, "guns", split[1]);
			}
			else if(split[0].equals("IdleSoundLength"))
				idleSoundLength = Integer.parseInt(split[1]);
			else if(split[0].equals("MeleeSound"))
			{
				meleeSound = split[1];
				FlansMod.proxy.loadSound(contentPack, "guns", split[1]);
			}
			else if(split[0].equals("MeleeHitSound"))
			{
				meleeHitSound = split[1];
				FlansMod.proxy.loadSound(contentPack, "guns", split[1]);
			}
			else if(split[0].equals("ShieldHitSound"))
			{
				ShieldHitSound = split[1];
				FlansMod.proxy.loadSound(contentPack, "guns", split[1]);
			}
			//Looping sounds
			else if(split[0].equals("WarmupSound"))
			{
				warmupSound = split[1];
				FlansMod.proxy.loadSound(contentPack, "guns", split[1]);
			}
			else if(split[0].equals("WarmupSoundLength"))
				warmupSoundLength = Integer.parseInt(split[1]);
			else if(split[0].equals("LoopedSound") || split[0].equals("SpinSound"))
			{
				loopedSound = split[1];
				useLoopingSounds = true;
				FlansMod.proxy.loadSound(contentPack, "guns", split[1]);
			}
			else if(split[0].equals("LoopedSoundLength") || split[0].equals("SpinSoundLength"))
				loopedSoundLength = Integer.parseInt(split[1]);
			else if(split[0].equals("CooldownSound"))
			{
				cooldownSound = split[1];
				FlansMod.proxy.loadSound(contentPack, "guns", split[1]);
			}
			else if(split[0].equals("LockOnSound"))
			{
				lockOnSound = split[1];
				FlansMod.proxy.loadSound(contentPack, "guns", split[1]);
			}

			//Modes and zoom settings
			else if(split[0].equals("Mode"))
			{
				mode = EnumFireMode.getFireMode(split[1]);
				defaultmode = mode;
				submode = new EnumFireMode[ split.length - 1 ];
				for(int i=0; i<submode.length; i++)
				{
					submode[i] = EnumFireMode.getFireMode(split[1 + i]);
				}
			}
			else if(split[0].equals("Scope"))
			{
				hasScopeOverlay = true;
				if (split[1].equals("None"))
					hasScopeOverlay = false;
				else defaultScopeTexture = split[1];
			}
			else if(split[0].equals("AllowNightVision"))
			{
				allowNightVision = Boolean.parseBoolean(split[1]);
			}
			else if(split[0].equals("ZoomLevel"))
			{
				zoomLevel = Float.parseFloat(split[1]);
				if(zoomLevel > 1F)
					secondaryFunction = EnumSecondaryFunction.ZOOM;
			}
			else if(split[0].equals("FOVZoomLevel"))
			{
				FOVFactor = Float.parseFloat(split[1]);
				if(FOVFactor > 1F)
					secondaryFunction = EnumSecondaryFunction.ADS_ZOOM;
			}
			else if(split[0].equals("Deployable"))
				deployable = split[1].equals("True");
			else if(FMLCommonHandler.instance().getSide().isClient() && deployable && split[0].equals("DeployedModel"))
				deployableModel = FlansMod.proxy.loadModel(split[1], shortName, ModelMG.class);
			else if(FMLCommonHandler.instance().getSide().isClient() && (split[0].equals("Model")))
				model = FlansMod.proxy.loadModel(split[1], shortName, ModelGun.class);
			else if(FMLCommonHandler.instance().getSide().isClient() && (split[0].equals("CasingModel")))
				casingModel = FlansMod.proxy.loadModel(split[1], shortName, ModelCasing.class);
			else if(FMLCommonHandler.instance().getSide().isClient() && (split[0].equals("FlashModel")))
				flashModel = FlansMod.proxy.loadModel(split[1], shortName, ModelFlash.class);
			else if(split[0].equals("CasingTexture"))
				casingTexture = split[1];
			else if(split[0].equals("FlashTexture"))
				flashTexture = split[1];
			else if(split[0].equals("ModelScale"))
				modelScale = Float.parseFloat(split[1]);
			else if(split[0].equals("Texture"))
				texture = split[1];
			else if(split[0].equals("HitTexture"))
				hitTexture = split[1];
			else if(split[0].equals("DeployedTexture"))
				deployableTexture = split[1];
			else if(split[0].equals("StandBackDistance"))
				standBackDist = Float.parseFloat(split[1]);
			else if(split[0].equals("TopViewLimit"))
				topViewLimit = -Float.parseFloat(split[1]);
			else if(split[0].equals("BottomViewLimit"))
				bottomViewLimit = Float.parseFloat(split[1]);
			else if(split[0].equals("SideViewLimit"))
				sideViewLimit = Float.parseFloat(split[1]);
			else if(split[0].equals("PivotHeight"))
				pivotHeight = Float.parseFloat(split[1]);
			else if(split[0].equals("Ammo"))
			{
				ShootableType type = ShootableType.getShootableType(split[1]);
				if(type != null)
					ammo.add(type);
			}
			else if(split[0].equals("NumAmmoSlots") || split[0].equals("NumAmmoItemsInGun") || split[0].equals("LoadIntoGun"))
				numPrimaryAmmoItems = Integer.parseInt(split[1]);
			else if(split[0].equals("BulletSpeed"))
				bulletSpeed = Float.parseFloat(split[1]);
			else if(split[0].equals("CanShootUnderwater"))
				canShootUnderwater = Boolean.parseBoolean(split[1].toLowerCase());
			else if(split[0].equals("CanSetPosition"))
				canSetPosition = Boolean.parseBoolean(split[1].toLowerCase());
			else if(split[0].equals("OneHanded"))
				oneHanded = Boolean.parseBoolean(split[1].toLowerCase());
			else if(split[0].equals("SecondaryFunction"))
				secondaryFunction = EnumSecondaryFunction.get(split[1]);
			else if(split[0].equals("UsableByPlayers"))
				usableByPlayers = Boolean.parseBoolean(split[1]);
			else if(split[0].equals("UsableByMechas"))
				usableByMechas = Boolean.parseBoolean(split[1]);

			//Custom Melee Stuff
			else if(split[0].equals("UseCustomMelee") && Boolean.parseBoolean(split[1]))
				secondaryFunction = EnumSecondaryFunction.CUSTOM_MELEE;
			else if(split[0].equals("UseCustomMeleeWhenShoot") && Boolean.parseBoolean(split[1]))
				secondaryFunctionWhenShoot = EnumSecondaryFunction.CUSTOM_MELEE;
			else if(split[0].equals("MeleeTime"))
				meleeTime = Integer.parseInt(split[1]);
			//mount and blade
			
			
			else if(split[0].equals("swordArmorPen") || split[0].equals("swordArmorPen"))
				swordArmorPen = Float.parseFloat(split[1]);
			//for new armor system
			
			else if(split[0].equals("MeleeLeftTime"))
				meleeLeftTime = Integer.parseInt(split[1]);
			else if(split[0].equals("AddLeftNode"))
			{
				meleeLeftPath.add(new Vector3f(Float.parseFloat(split[1]) / 16F, Float.parseFloat(split[2]) / 16F, Float.parseFloat(split[3]) / 16F));
				meleeLeftPathAngles.add(new Vector3f(Float.parseFloat(split[4]), Float.parseFloat(split[5]), Float.parseFloat(split[6])));
			}		
			else if(split[0].equals("meleeLeft"))
				meleeLeft = Boolean.parseBoolean(split[1]);


			else if(split[0].equals("spear"))
				spear = Boolean.parseBoolean(split[1]);
			else if(split[0].equals("MeleeLeftDamagePoint") || split[0].equals("MeleeLeftDamageOffset"))
			{
				meleeLeftDamagePoints.add(new Vector3f(Float.parseFloat(split[1]) / 16F, Float.parseFloat(split[2]) / 16F, Float.parseFloat(split[3]) / 16F));
			}
			
			
			
			
			else if(split[0].equals("MeleeRightTime"))
				meleeRightTime = Integer.parseInt(split[1]);
			else if(split[0].equals("AddRightNode"))
			{
				meleeRightPath.add(new Vector3f(Float.parseFloat(split[1]) / 16F, Float.parseFloat(split[2]) / 16F, Float.parseFloat(split[3]) / 16F));
				meleeRightPathAngles.add(new Vector3f(Float.parseFloat(split[4]), Float.parseFloat(split[5]), Float.parseFloat(split[6])));
			}		
			else if(split[0].equals("meleeRight"))
				meleeRight = Boolean.parseBoolean(split[1]);
			else if(split[0].equals("MeleeRightDamagePoint") || split[0].equals("MeleeRightDamageOffset"))
			{
				meleeRightDamagePoints.add(new Vector3f(Float.parseFloat(split[1]) / 16F, Float.parseFloat(split[2]) / 16F, Float.parseFloat(split[3]) / 16F));
			}
			
			
			
			
			
			else if(split[0].equals("MeleeUpTime"))
				meleeDownTime = Integer.parseInt(split[1]);
			else if(split[0].equals("AddUpNode"))
			{
				meleeDownPath.add(new Vector3f(Float.parseFloat(split[1]) / 16F, Float.parseFloat(split[2]) / 16F, Float.parseFloat(split[3]) / 16F));
				meleeDownPathAngles.add(new Vector3f(Float.parseFloat(split[4]), Float.parseFloat(split[5]), Float.parseFloat(split[6])));
			}		
			else if(split[0].equals("meleeUp"))
				meleeDown = Boolean.parseBoolean(split[1]);
			else if(split[0].equals("MeleeUpDamagePoint") || split[0].equals("MeleeUpDamageOffset"))
			{
				meleeDownDamagePoints.add(new Vector3f(Float.parseFloat(split[1]) / 16F, Float.parseFloat(split[2]) / 16F, Float.parseFloat(split[3]) / 16F));
			}
			//mount and blade labjac config text finish
			
			else if(split[0].equals("lance"))
				lance = Boolean.parseBoolean(split[1].toLowerCase());
			
			
			//labjac matchlock cance
			
			else if(split[0].equals("match"))
				matchlock = Boolean.parseBoolean(split[1].toLowerCase());

			else if(split[0].equals("AddNode"))
			{
				meleePath.add(new Vector3f(Float.parseFloat(split[1]) / 16F, Float.parseFloat(split[2]) / 16F, Float.parseFloat(split[3]) / 16F));
				meleePathAngles.add(new Vector3f(Float.parseFloat(split[4]), Float.parseFloat(split[5]), Float.parseFloat(split[6])));
			}
			

			
			
			

			

			
			
			else if(split[0].equals("MeleeDamagePoint") || split[0].equals("MeleeDamageOffset"))
			{
				meleeDamagePoints.add(new Vector3f(Float.parseFloat(split[1]) / 16F, Float.parseFloat(split[2]) / 16F, Float.parseFloat(split[3]) / 16F));
			}
			


			//Player modifiers

			

			else if(split[0].equals("MoveSpeedModifier") || split[0].equals("Slowness"))
				moveSpeedModifier = Float.parseFloat(split[1]);

			else if(split[0].equals("KnockbackReduction") || split[0].equals("KnockbackModifier"))
				knockbackModifier = Float.parseFloat(split[1]);
	


			//Attachment settings
			else if(split[0].equals("AllowAllAttachments"))
				allowAllAttachments = Boolean.parseBoolean(split[1].toLowerCase());

			else if(split[0].equals("AllowAttachments"))
			{
				for(int i = 1; i < split.length; i++)
				{
					allowedAttachments.add(AttachmentType.getAttachment(split[i]));
				}
			}
			else if(split[0].equals("AllowBarrelAttachments"))
				allowBarrelAttachments = Boolean.parseBoolean(split[1].toLowerCase());
			else if(split[0].equals("AllowScopeAttachments"))
				allowScopeAttachments = Boolean.parseBoolean(split[1].toLowerCase());
			else if(split[0].equals("AllowStockAttachments"))
				allowStockAttachments = Boolean.parseBoolean(split[1].toLowerCase());
			else if(split[0].equals("AllowGripAttachments"))
				allowGripAttachments = Boolean.parseBoolean(split[1].toLowerCase());
			else if(split[0].equals("AllowGadgetAttachments"))
				allowGadgetAttachments = Boolean.parseBoolean(split[1].toLowerCase());
			else if(split[0].equals("AllowSlideAttachments"))
				allowSlideAttachments = Boolean.parseBoolean(split[1].toLowerCase());
			else if(split[0].equals("AllowPumpAttachments"))
				allowPumpAttachments = Boolean.parseBoolean(split[1].toLowerCase());
			else if(split[0].equals("AllowAccessoryAttachments"))
				allowAccessoryAttachments = Boolean.parseBoolean(split[1].toLowerCase());
			else if(split[0].equals("NumGenericAttachmentSlots"))
				numGenericAttachmentSlots = Integer.parseInt(split[1]);

			//Shield settings
			else if(split[0].toLowerCase().equals("shield"))
			{
				shield = true;
				shieldOrigin = new Vector3f(Float.parseFloat(split[2]) / 16F, Float.parseFloat(split[3]) / 16F, Float.parseFloat(split[4]) / 16F);
				shieldDimensions = new Vector3f(Float.parseFloat(split[5]) / 16F, Float.parseFloat(split[6]) / 16F, Float.parseFloat(split[7]) / 16F);
				shieldDamageAbsorption = Float.parseFloat(split[1]);
			}
			
			//labjac minigun
			else if(split[0].equals("labigunLimit"))
				labigunLimit = Integer.parseInt(split[1]);
			else if(split[0].equals("hasLabigunDelay"))
				labigunDelay = Boolean.parseBoolean(split[1]);
			
			
			
			//labjac sword autobuff bullshit cancer
			else if(split[0].equals("shootMelee"))
			{
				shootMelee = Boolean.parseBoolean(split[1]);
				defaultSpread = bulletSpread = 10*defaultSpread;
				bulletSpeed = 0.8f*bulletSpeed;
				consumeGunUponUse = Boolean.parseBoolean(split[1]);
				canBlock = Boolean.parseBoolean(split[1]);
			}
			
			//after this incase you want a sword that cannot block
			else if(split[0].equals("canBlock"))
				canBlock = Boolean.parseBoolean(split[1]);
			
			//for armor reload multipliers
			else if(split[0].equals("OldGun"))
				OldGun = Boolean.parseBoolean(split[1]);
			else if(split[0].equals("Bow"))
				Bow = Boolean.parseBoolean(split[1]);
			else if(split[0].equals("Heavy"))
				Heavy = Boolean.parseBoolean(split[1]);
			else if(split[0].equals("RepeatingGun"))
				RepeatingGun = Boolean.parseBoolean(split[1]);

			
		}
		catch (Exception e)
		{
			if(split!=null)
			{
				String msg = " : ";
				for(String s : split) msg = msg +" "+ s;
				System.out.println("Reading gun file failed. " + file.name + msg);
			}
			else
			{
				System.out.println("Reading gun file failed. " + file.name);
			}
			if(FlansMod.printStackTrace)
			{
				e.printStackTrace();
			}
		}


	}

	
	
	/** Used only for driveables */
	public boolean isAmmo(ShootableType type)
	{
		return ammo.contains(type);
	}

	public boolean isAmmo(ShootableType type, ItemStack stack)
	{
		boolean result = ammo.contains(type);

		if(getGrip(stack) != null && getSecondaryFire(stack))
		{
			List<ShootableType> t = new ArrayList<ShootableType>();
			for(String s: getGrip(stack).secondaryAmmo)
			{
				ShootableType shoot = ShootableType.getShootableType(s);
				if(type != null)
					t.add(shoot);
			}
			result = t.contains(type);
		}

		return result;
	}

	public boolean isAmmo(ItemStack stack)
	{
		if (stack == null)
			return false;
		else if(stack.getItem() instanceof ItemBullet)
			{
			return isAmmo(((ItemBullet)stack.getItem()).type, stack);
		}
		else if(stack.getItem() instanceof ItemGrenade)
		{
			return isAmmo(((ItemGrenade)stack.getItem()).type, stack);
		}
		return false;
	}

	/** To be overriden by subtypes for model reloading */
	public void reloadModel()
	{
		model = FlansMod.proxy.loadModel(modelString, shortName, ModelGun.class);
	}

	@Override
	public float getZoomFactor()
	{
		return zoomLevel;
	}

	@Override
	public boolean hasZoomOverlay()
	{
		return hasScopeOverlay;
	}

	@Override
	public String getZoomOverlay()
	{
		return defaultScopeTexture;
	}

	@Override
	public float getFOVFactor()
	{
		return FOVFactor;
	}

	//ItemStack specific methods

	/** Return the currently active scope on this gun. Search attachments, and by default, simply give the gun */
	public IScope getCurrentScope(ItemStack gunStack)
	{
		IScope attachedScope = getScope(gunStack);
		return attachedScope == null ? this : attachedScope;
	}

	/** Returns all attachments currently attached to the specified gun */
	public ArrayList<AttachmentType> getCurrentAttachments(ItemStack gun)
	{
		checkForTags(gun);
		ArrayList<AttachmentType> attachments = new ArrayList<AttachmentType>();
		NBTTagCompound attachmentTags = gun.stackTagCompound.getCompoundTag("attachments");
		NBTTagList genericsList = attachmentTags.getTagList("generics", (byte)10); //TODO : Check this 10 is correct
		for(int i = 0; i < numGenericAttachmentSlots; i++)
		{
			appendToList(gun, "generic_" + i, attachments);
		}
		appendToList(gun, "barrel", attachments);
		appendToList(gun, "scope", attachments);
		appendToList(gun, "stock", attachments);
		appendToList(gun, "grip", attachments);
		appendToList(gun, "gadget", attachments);
		appendToList(gun, "slide", attachments);
		appendToList(gun, "pump", attachments);
		appendToList(gun, "accessory", attachments);
		return attachments;
	}

	/** Private method for attaching attachments to a list of attachments with a nullcheck */
	private void appendToList(ItemStack gun, String name, ArrayList<AttachmentType> attachments)
	{
		AttachmentType type = getAttachment(gun, name);
		if(type != null) attachments.add(type);
	}

	//Attachment getter methods
	public AttachmentType getBarrel(ItemStack gun) { return getAttachment(gun, "barrel"); }
	public AttachmentType getScope(ItemStack gun) { return getAttachment(gun, "scope"); }
	public AttachmentType getStock(ItemStack gun) { return getAttachment(gun, "stock"); }
	public AttachmentType getGrip(ItemStack gun) { return getAttachment(gun, "grip"); }
	public AttachmentType getGadget(ItemStack gun) { return getAttachment(gun, "gadget"); }
	public AttachmentType getSlide(ItemStack gun) { return getAttachment(gun, "slide"); }
	public AttachmentType getPump(ItemStack gun) { return getAttachment(gun, "pump"); }
	public AttachmentType getAccessory(ItemStack gun) { return getAttachment(gun, "accessory"); }
	public AttachmentType getGeneric(ItemStack gun, int i) { return getAttachment(gun, "generic_" + i); }

	//Attachment ItemStack getter methods
	public ItemStack getBarrelItemStack(ItemStack gun) { return getAttachmentItemStack(gun, "barrel"); }
	public ItemStack getScopeItemStack(ItemStack gun) { return getAttachmentItemStack(gun, "scope"); }
	public ItemStack getStockItemStack(ItemStack gun) { return getAttachmentItemStack(gun, "stock"); }
	public ItemStack getGripItemStack(ItemStack gun) { return getAttachmentItemStack(gun, "grip"); }
	public ItemStack getGadgetItemStack(ItemStack gun) { return getAttachmentItemStack(gun, "gadget"); }
	public ItemStack getSlideItemStack(ItemStack gun) { return getAttachmentItemStack(gun, "slide"); }
	public ItemStack getPumpItemStack(ItemStack gun) { return getAttachmentItemStack(gun, "pump"); }
	public ItemStack getAccessoryItemStack(ItemStack gun) { return getAttachmentItemStack(gun, "accessory"); }
	public ItemStack getGenericItemStack(ItemStack gun, int i) { return getAttachmentItemStack(gun, "generic_" + i); }

	/** Generalised attachment getter method */
	public AttachmentType getAttachment(ItemStack gun, String name)
	{
		checkForTags(gun);
		return AttachmentType.getFromNBT(gun.stackTagCompound.getCompoundTag("attachments").getCompoundTag(name));
	}

	/** Generalised attachment ItemStack getter method */
	public ItemStack getAttachmentItemStack(ItemStack gun, String name)
	{
		checkForTags(gun);
		return ItemStack.loadItemStackFromNBT(gun.stackTagCompound.getCompoundTag("attachments").getCompoundTag(name));
	}

	/** Method to check for null tags and assign default empty tags in that case */
	private void checkForTags(ItemStack gun)
	{
		//If the gun has no tags, give it some
		if(!gun.hasTagCompound())
		{
			gun.stackTagCompound = new NBTTagCompound();
		}
		//If the gun has no attachment tags, give it some
		if(!gun.stackTagCompound.hasKey("attachments"))
		{
			NBTTagCompound attachmentTags = new NBTTagCompound();
			for(int i = 0; i < numGenericAttachmentSlots; i++)
				attachmentTags.setTag("generic_" + i, new NBTTagCompound());
			attachmentTags.setTag("barrel", new NBTTagCompound());
			attachmentTags.setTag("scope", new NBTTagCompound());
			attachmentTags.setTag("stock", new NBTTagCompound());
			attachmentTags.setTag("grip", new NBTTagCompound());
			attachmentTags.setTag("gadget", new NBTTagCompound());
			attachmentTags.setTag("slide", new NBTTagCompound());
			attachmentTags.setTag("pump", new NBTTagCompound());
			attachmentTags.setTag("accessory", new NBTTagCompound());

			gun.stackTagCompound.setTag("attachments", attachmentTags);
		}
	}

	/** Get the melee damage of a specific gun, taking into account attachments */
	public float getMeleeDamage(ItemStack stack)
	{
		float stackMeleeDamage = meleeDamage;
		for(AttachmentType attachment : getCurrentAttachments(stack))
		{
			stackMeleeDamage *= attachment.meleeDamageMultiplier;
		}
		return stackMeleeDamage;
	}

	/** Get the damage of a specific gun, taking into account attachments */
	public float getDamage(ItemStack stack)
	{
		float stackDamage = damage;

		if(getGrip(stack) != null && getSecondaryFire(stack))
			stackDamage = getGrip(stack).secondaryDamage;

		for(AttachmentType attachment : getCurrentAttachments(stack))
		{
			stackDamage *= attachment.damageMultiplier;
		}
		return stackDamage;
	}

	/** Get the bullet spread of a specific gun, taking into account attachments */
//	public float getSpread(ItemStack stack) before goldsloth
	public float getSpread(ItemStack stack, boolean sneaking, boolean sprinting)
	{
		float stackSpread = bulletSpread;

		if(getGrip(stack) != null && getSecondaryFire(stack))
			stackSpread = getGrip(stack).secondarySpread;

		for(AttachmentType attachment : getCurrentAttachments(stack))
		{
			stackSpread *= attachment.spreadMultiplier;
		}
		if (sprinting) {
			stackSpread *= sprintSpreadMultiplier;
		} else if (sneaking) {
			stackSpread *= sneakSpreadMultiplier;
		}
		return stackSpread;
	}

	/** Get the default spread of a specific gun, taking into account attachments */
	public float getDefaultSpread(ItemStack stack)
	{
		float stackSpread = defaultSpread;

		if(getGrip(stack) != null && getSecondaryFire(stack))
			stackSpread = getGrip(stack).secondaryDefaultSpread;

		for(AttachmentType attachment : getCurrentAttachments(stack))
		{
			stackSpread *= attachment.spreadMultiplier;
		}
		
		return stackSpread;
	}

	/** Get the recoil of a specific gun, taking into account attachments */
	public float getRecoilPitch(ItemStack stack)
	{
		//float stackRecoil = this.recoilPitch + (rand.nextFloat() * this.rndRecoilPitchRange);
		//allah bookmark. chaged the -0.5 to -0.3 so biased for positive recoil   do it for sustained recoil too!
		//float stackRecoil = this.recoilPitch * (rand.nextFloat()-0.1f); death to random!
		float stackRecoil = this.recoilPitch;
		for(AttachmentType attachment : getCurrentAttachments(stack))
		{
			stackRecoil *= attachment.recoilMultiplier;
		}
		return stackRecoil;
	}

	public float getRecoilYaw(ItemStack stack)
	{
		//float stackRecoilYaw = this.recoilYaw + ((rand.nextFloat()-0.5F) * this.rndRecoilYawRange);
		float stackRecoilYaw = this.recoilYaw * (rand.nextFloat()-0.5f);
		for(AttachmentType attachment : getCurrentAttachments(stack))
		{
			stackRecoilYaw *= attachment.recoilMultiplier;
		}
		return stackRecoilYaw;
	}
	
	
	
	//again but for sustained fire
	public float getSustainedRecoilPitch(ItemStack stack)
	{
		//float stackRecoil = this.recoilPitch + (rand.nextFloat() * this.rndRecoilPitchRange);
		//float stackSustainedRecoil = this.sustainedRecoilPitch * (rand.nextFloat()-0.1f); death to random!
		float stackSustainedRecoil = this.sustainedRecoilPitch;
		for(AttachmentType attachment : getCurrentAttachments(stack))
		{
			stackSustainedRecoil *= attachment.recoilMultiplier;
		}
		return stackSustainedRecoil;
	}

	public float getSustainedRecoilYaw(ItemStack stack)
	{
		//float stackRecoilYaw = this.recoilYaw + ((rand.nextFloat()-0.5F) * this.rndRecoilYawRange);
		float stackSustainedRecoilYaw = this.sustainedRecoilYaw * (rand.nextFloat()-0.5f);
		for(AttachmentType attachment : getCurrentAttachments(stack))
		{
			stackSustainedRecoilYaw *= attachment.recoilMultiplier;
		}
		return stackSustainedRecoilYaw;
	}

	/** Get the bullet speed of a specific gun, taking into account attachments */
	public float getBulletSpeed(ItemStack stack)
	{
		float stackBulletSpeed = bulletSpeed;

		// grip bulletspeed 
		if(getGrip(stack) != null && getSecondaryFire(stack))
			stackBulletSpeed = getGrip(stack).secondarySpeed;

		for(AttachmentType attachment : getCurrentAttachments(stack))
		{
			stackBulletSpeed *= attachment.bulletSpeedMultiplier;
		}
		return stackBulletSpeed;
	}

	/** Get the reload time of a specific gun, taking into account attachments */
	public float getReloadTime(ItemStack stack)
	{
		float stackReloadTime = reloadTime;

		if(getGrip(stack) != null && getSecondaryFire(stack))
			stackReloadTime = getGrip(stack).secondaryReloadTime;

		for(AttachmentType attachment : getCurrentAttachments(stack))
		{
			stackReloadTime *= attachment.reloadTimeMultiplier;
		}
		return stackReloadTime;
	}

	/** Get the fire rate of a specific gun */
	public float getShootDelay(ItemStack stack)
	{
		float fireRate = shootDelay;

		if(getGrip(stack) != null && getSecondaryFire(stack))
			fireRate = getGrip(stack).secondaryShootDelay;

		return fireRate;
	}

	/** Get the number of bullets fired per shot of a specific gun */
	public int getNumBullets(ItemStack stack)
	{
		int amount = numBullets;

		if(getGrip(stack) != null && getSecondaryFire(stack))
			amount = getGrip(stack).secondaryNumBullets;

		return amount;
	}

	/** Get the movement speed of a specific gun, taking into account attachments */
	public float getMovementSpeed(ItemStack stack)
	{
		float stackMovement = moveSpeedModifier;
		for(AttachmentType attachment : getCurrentAttachments(stack))
		{
			stackMovement *= attachment.moveSpeedMultiplier;
		}
		return stackMovement;
	}

	public void setFireMode(ItemStack stack, int fireMode)
	{
		if(!stack.hasTagCompound())
		{
			stack.setTagCompound(new NBTTagCompound());
		}
		
		if(fireMode < EnumFireMode.values().length)
		{
			stack.getTagCompound().setByte("GunMode", (byte)fireMode);
		}
		else
		{
			stack.getTagCompound().setByte("GunMode", (byte)mode.ordinal());
		}
	}

	/** Get the firing mode of a specific gun, taking into account attachments and secondary fire mode */
	public EnumFireMode getFireMode(ItemStack stack)
	{
		//Check for secondary fire mode
		if(getGrip(stack) != null && getSecondaryFire(stack))
			return getGrip(stack).secondaryFireMode;

		//Else check for any mode overrides from attachments
		for(AttachmentType attachment : getCurrentAttachments(stack))
		{
			if(attachment.modeOverride != null)
				return attachment.modeOverride;
		}

		//Else set the fire mode from the gun
		if(stack.hasTagCompound() && stack.getTagCompound().hasKey("GunMode"))
		{
			int gm = stack.getTagCompound().getByte("GunMode");
			if(gm < EnumFireMode.values().length)
			{
				for(int i=0; i<submode.length; i++)
				{
					if(gm == submode[i].ordinal())
					{
						return EnumFireMode.values()[gm];
					}
				}
			}
		}

		setFireMode(stack, mode.ordinal());
		return mode;
	}

	/** Set the secondary or primary fire mode */
	public void setSecondaryFire(ItemStack stack, boolean mode)
	{
		if(!stack.hasTagCompound())
			stack.setTagCompound(new NBTTagCompound());

		stack.stackTagCompound.setBoolean("secondaryFire", mode);
	}

	/** Get whether the gun is in secondary or primary fire mode */
	public boolean getSecondaryFire(ItemStack stack)
	{
		if(!stack.hasTagCompound())
			stack.setTagCompound(new NBTTagCompound());

		if(!stack.getTagCompound().hasKey("secondaryFire"))
		{
			stack.stackTagCompound.setBoolean("secondaryFire", false);
			return stack.getTagCompound().getBoolean("secondaryFire");
		}

		return stack.getTagCompound().getBoolean("secondaryFire");
	}

	/** Get the max size of ammo items depending on what mode the gun is in */
	public int getNumAmmoItemsInGun(ItemStack stack)
	{
		if(getGrip(stack) != null && getSecondaryFire(stack))
			return getGrip(stack).numSecAmmoItems;
		else
			return numPrimaryAmmoItems;
	}

	/** Static String to GunType method */
	public static GunType getGun(String s)
	{
		return guns.get(s);
	}
	
	//labjac
	public static GunType getGunForMech(String s)
	{
		for(GunType gun : gunList)
		{
			if(gun.shortName.equals(s))
				return gun;
		}
		return null;
	}

	public Paintjob getPaintjob(String s)
	{
		for(Paintjob paintjob : paintjobs)
		{
			if(paintjob.iconName.equals(s))
				return paintjob;
		}
		return defaultPaintjob;
	}
	
	@Override
	public float GetRecommendedScale()
	{
		return 60.0f;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public ModelBase GetModel() 
	{
		return model;
	}
}