package com.flansmod.common.guns;

import com.flansmod.api.IEntityBullet;
import io.netty.buffer.ByteBuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.client.particle.EntityFX;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.item.EntityXPOrb;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.ChatComponentText;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityDamageSourceIndirect;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import net.minecraftforge.client.event.RenderHandEvent;

import com.flansmod.client.FlansModClient;
import com.flansmod.client.debug.EntityDebugDot;
import com.flansmod.common.FlansMod;
import com.flansmod.common.PlayerData;
import com.flansmod.common.PlayerHandler;
import com.flansmod.common.RotatedAxes;
import com.flansmod.common.driveables.EntityDriveable;
import com.flansmod.common.driveables.EntityPlane;
import com.flansmod.common.driveables.EntitySeat;
import com.flansmod.common.driveables.EntityVehicle;
import com.flansmod.common.driveables.mechas.EntityMecha;
import com.flansmod.common.guns.raytracing.BlockHit;
import com.flansmod.common.guns.raytracing.BulletHit;
import com.flansmod.common.guns.raytracing.CustomBlockRaytracing;
import com.flansmod.common.guns.raytracing.DriveableHit;
import com.flansmod.common.guns.raytracing.EntityHit;
import com.flansmod.common.guns.raytracing.EnumHitboxType;
import com.flansmod.common.guns.raytracing.PlayerBulletHit;
import com.flansmod.common.guns.raytracing.PlayerHitbox;
import com.flansmod.common.guns.raytracing.PlayerSnapshot;
import com.flansmod.common.network.PacketFlak;
import com.flansmod.common.network.PacketParticle;
import com.flansmod.common.network.PacketPlaySound;
import com.flansmod.common.teams.Team;
import com.flansmod.common.teams.TeamsManager;
import com.flansmod.common.types.InfoType;
import com.flansmod.common.vector.Vector3f;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.network.ByteBufUtils;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.IEntityAdditionalSpawnData;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class EntityBullet extends EntityShootable implements IEntityAdditionalSpawnData, IEntityBullet {
	private static int bulletLife = 600; //Kill bullets after 30 seconds
	public Entity owner;
	private int ticksInAir;
	public BulletType type;

	public ShootableType getType() { return type; }
	/**
	 * What type of weapon did this come from? For death messages
	 */
	public InfoType firedFrom;
	/**
	 * The amount of damage the gun imparted upon the bullet. Multiplied by the bullet damage to get total damage
	 */
	public float damage;
	public boolean shotgun = false;
	/**
	 * If this is non-zero, then the player raytrace code will look back in time to when the player thinks their bullet should have hit
	 */
	public int pingOfShooter = 0;
	/**
	 * Stop repeat detonations
	 */
	public boolean detonated = false;
	/**
	 * For homing missiles
	 */
	public Entity lockedOnTo;
	//public double distanceToEntity = 0;
	public double prevDistanceToEntity = 0;
	public int cnt;
	//public Vector3f firstVector = new Vector3f(motionX, motionY, motionZ);
	public boolean toggleLock = false;
	//public Vector3f prevPos;
	public double lockedOnToSpeed = 0;
	public double thisSpeed = 0;
	public int closeCount = 0;
	public int soundTime = 0;
	public float speedA;

	//other labjac features
	//armor pen vehicles
	public float truePen;
	public boolean isHEAT;
	public boolean isSword = false;
	//for bullets near but miss player
	public String missNoise = "bulletFlyby";
	//for labcat bob radar
	public boolean radarVisible = false;
	//labjac radar shoehorn declaration
	public boolean entityMissileRadarVisible = false;
	public boolean evilBullet = false;

	public int impactX;
	public int impactY;
	public int impactZ;

	public boolean isFirstPositionSetting = false;
	public boolean isPositionUpper = true;

	public boolean lockAttempted = false; //so moderntorpedo will try to lock on once AFTER entering water

	// For rendering - this applies to the last fired bullet, just before render. (Gets reset at render)
	// This isn't really an optimal place for putting these variables, I can't think of anywhere better though.
	public static boolean hitCrossHair;
	public static float penAmount;
	public static boolean headshot;

	public float penetratingPower;

	public int submunitionDelay = 20;
	public boolean hasSetSubDelay = false;

	public boolean hasSetVLSDelay = false;
	public int VLSDelay = 0;

	public Vector3f lookVector;
	public Vector3f initialPos;
	public boolean hasSetLook = false;

	//speed limit thing to prevent hyperspeed abuse from missile controler and initial speeds
	public float maxspeed;
	public float initialX;
	public float initialY;
	public float initialZ;



	public EntityBullet(World world) {
		super(world);
		ticksInAir = 0;
		setSize(0.5F, 0.5F);
	}

	/**
	 * Private partial constructor to avoid repeated code. All constructors go through this one
	 */
	private EntityBullet(World world, EntityLivingBase shooter, float gunDamage, BulletType bulletType, InfoType shotFrom) {
		this(world);
		owner = shooter;
		if (shooter instanceof EntityPlayerMP)
			pingOfShooter = ((EntityPlayerMP) shooter).ping;
		type = bulletType;
		firedFrom = shotFrom;
		damage = gunDamage;
		penetratingPower = type.penetratingPower;
		setSize(bulletType.hitBoxSize, bulletType.hitBoxSize);
	}

	/**
	 * Method called by ItemGun for creating bullets from a hand held weapon
	 */
	/* before my original offset system TM -t LabJac
    public EntityBullet(World world, EntityLivingBase shooter, float spread, float gunDamage, BulletType type1, float speed, boolean shot, InfoType shotFrom) {
        this(world, Vec3.createVectorHelper(shooter.posX, shooter.posY + shooter.getEyeHeight(), shooter.posZ), shooter.rotationYaw, shooter.rotationPitch, shooter, spread, gunDamage, type1, speed, shotFrom);
        shotgun = shot;
    }
	 */

	public EntityBullet(World world, EntityLivingBase shooter, float spread, float gunDamage, BulletType type1, float speed, boolean shot, InfoType shotFrom, float Xoffset, float Yoffset, float Zoffset)
	{
		this(world, Vec3.createVectorHelper((shooter.posX - MathHelper.cos((shooter.rotationYaw / 180F) * 3.14159265F)*Zoffset - MathHelper.cos((shooter.rotationPitch / 180F) * 3.14159265F)*MathHelper.sin((shooter.rotationYaw / 180F) * 3.14159265F)*Xoffset), (shooter.posY + Yoffset + shooter.getEyeHeight() - MathHelper.sin((shooter.rotationPitch / 180F) * 3.14159265F)*Xoffset), (shooter.posZ + MathHelper.cos((shooter.rotationPitch / 180F) * 3.14159265F)*MathHelper.cos((shooter.rotationYaw / 180F) * 3.14159265F)*Xoffset - MathHelper.sin((shooter.rotationYaw / 180F) * 3.14159265F)*Zoffset)), shooter.rotationYaw, shooter.rotationPitch, shooter, spread, gunDamage, type1, speed, shotFrom);
		shotgun = shot;
	}
	

	/**
	 * Machinegun / AAGun bullet constructor
	 */
	public EntityBullet(World world, Vec3 origin, float yaw, float pitch, EntityLivingBase shooter, float spread, float gunDamage, BulletType type1, InfoType shotFrom) {
		this(world, origin, yaw, pitch, shooter, spread, gunDamage, type1, 3.0F, shotFrom);
	}

	/**
	 * More generalised bullet constructor
	 */
	public EntityBullet(World world, Vec3 origin, float yaw, float pitch, EntityLivingBase shooter, float spread, float gunDamage, BulletType type1, float speed, InfoType shotFrom) {
		this(world, shooter, gunDamage, type1, shotFrom);
		setLocationAndAngles(origin.xCoord, origin.yCoord, origin.zCoord, yaw, pitch);
		setPosition(posX, posY, posZ);
		yOffset = 0.0F;
		motionX = -MathHelper.sin((rotationYaw / 180F) * 3.14159265F) * MathHelper.cos((rotationPitch / 180F) * 3.14159265F);
		motionZ = MathHelper.cos((rotationYaw / 180F) * 3.14159265F) * MathHelper.cos((rotationPitch / 180F) * 3.14159265F);
		motionY = -MathHelper.sin((rotationPitch / 180F) * 3.141593F);
		setArrowHeading(motionX, motionY, motionZ, spread / 2F, speed);
	}

	/**
	 *
	 */
	public EntityBullet(World world, Vector3f origin, Vector3f direction, EntityLivingBase shooter, float spread, float gunDamage, BulletType type1, float speed, InfoType shotFrom) {
		this(world, shooter, gunDamage, type1, shotFrom);
		damage = gunDamage;
		setPosition(origin.x, origin.y, origin.z);
		motionX = direction.x;
		motionY = direction.y;
		motionZ = direction.z;
		setArrowHeading(motionX, motionY, motionZ, spread, speed);
	}
	
	//constructor for evil ai bullets
	public EntityBullet(World world, Vector3f origin, Vector3f direction, EntityLivingBase shooter, float spread, float gunDamage, BulletType type1, float speed, InfoType shotFrom, Boolean ai) {
		this(world, shooter, gunDamage, type1, shotFrom);
		damage = gunDamage;
		evilBullet = ai;
		setPosition(origin.x, origin.y, origin.z);
		motionX = direction.x;
		motionY = direction.y;
		motionZ = direction.z;
		setArrowHeading(motionX, motionY, motionZ, spread, speed);
	}
	

	


	/**
	 * Bomb constructor. Inherits the motion and rotation of the plane
	 */
	public EntityBullet(World world, Vec3 origin, float yaw, float pitch, double motX, double motY, double motZ, EntityLivingBase shooter, float gunDamage, BulletType type1, InfoType shotFrom) {
		this(world, shooter, gunDamage, type1, shotFrom);
		setLocationAndAngles(origin.xCoord, origin.yCoord, origin.zCoord, yaw, pitch);
		setPosition(posX, posY, posZ);
		yOffset = 0.0F;
		motionX = motX;
		motionY = motY;
		motionZ = motZ;
	}

	@Override
	protected void entityInit() {
	}

	public void setArrowHeading(double d, double d1, double d2, float spread, float speed) {
		float f2 = MathHelper.sqrt_double(d * d + d1 * d1 + d2 * d2);
		d /= f2;
		d1 /= f2;
		d2 /= f2;
		d *= speed;
		d1 *= speed;
		d2 *= speed;
		d += rand.nextGaussian() * 0.005D * spread * speed;
		d1 += rand.nextGaussian() * 0.005D * spread * speed;
		d2 += rand.nextGaussian() * 0.005D * spread * speed;
		motionX = d;
		motionY = d1;
		motionZ = d2;
		float f3 = MathHelper.sqrt_double(d * d + d2 * d2);
		prevRotationYaw = rotationYaw = (float) ((Math.atan2(d, d2) * 180D) / 3.1415927410125732D);
		prevRotationPitch = rotationPitch = (float) ((Math.atan2(d1, f3) * 180D) / 3.1415927410125732D);

		//  getLockOnTarget();
	}

	/**
	 * Find the entity nearest to the missile's trajectory, anglewise   ALLAH BOOKMARK, THIS IS KEY TO LOCKON
	 */
	private void getLockOnTarget() {
		if (type.lockOnToPlanes || type.lockOnToVehicles || type.lockOnToMechas || type.lockOnToLivings || type.lockOnToPlayers) {
			Vector3f motionVec = new Vector3f(motionX, motionY, motionZ);
			Entity closestEntity = null;
			float closestAngle = type.maxLockOnAngle * 3.14159265F / 180F;

			for (Object obj : worldObj.loadedEntityList) {
				Entity entity = (Entity) obj;
				String etype = entity.getEntityData().getString("EntityType");
				if ((type.lockOnToMechas && entity instanceof EntityMecha) ||
						(type.lockOnToVehicles && entity instanceof EntityVehicle) ||
						(type.lockOnToVehicles && etype.equals("Vehicle")) || // for vehicle of other Mod
						(type.lockOnToPlanes && entity instanceof EntityPlane) ||
						(type.lockOnToPlanes && etype.equals("Plane")) || // for plane of other Mod
						(type.lockOnToPlayers && entity instanceof EntityPlayer) ||
						(type.lockOnToLivings && entity instanceof EntityLivingBase)) {
					Vector3f relPosVec = new Vector3f(entity.posX - posX, entity.posY - posY, entity.posZ - posZ);
					float angle = Math.abs(Vector3f.angle(motionVec, relPosVec));

					//for early infrared that can only lock onto jet thruster ass
					Vector3f missileDirection = (Vector3f) motionVec.normalise();
					Vector3f targetDirection = (Vector3f) (new Vector3f(entity.motionX,entity.motionY,entity.motionZ)).normalise();
					boolean rearLock = false;

					if ( Math.abs(missileDirection.x-targetDirection.x)<0.5f && Math.abs(missileDirection.y-targetDirection.y)<0.5f && Math.abs(missileDirection.z-targetDirection.z)<0.5f)
					{
						//System.out.println("rear lock");
						rearLock = true;
					}


					if ( (angle < closestAngle && !type.earlyInfrared) || type.infiniteAngle || (angle < closestAngle && type.earlyInfrared && rearLock)) {
						closestEntity = entity;
						closestAngle = angle;
					}

					//beginning of labjac cancer block
					//accoustic range shit. submarine "throttle" = noisiness
					if(entity instanceof EntityDriveable)
					{
						EntityDriveable victim = (EntityDriveable)entity;
						float noisiness = 0;
						if (victim.throttle > 0)
							noisiness = victim.throttle;
						if (victim.throttle < 0)
							noisiness = Math.abs(victim.throttle)/2; //negative throttle is half as noisy because slower

						//	System.out.println("target noisiness " + noisiness);
						//	System.out.println("range " + (type.ASWminRange + type.seekerRange*noisiness));
						//	System.out.println("relposvec " + relPosVec.length());

						//case for anti radiation
						if ((victim.getDriveableType().hasRadar) && victim.activeRadar)
							if( type.antiRadiation )
							{
								closestEntity = entity;
								closestAngle = angle;							
								//System.out.println("successful anti rad lock, victims radar: " + victim.activeRadar);
							}


						//instead of a flat number range, it will be noisiness X range + 5 so enemy throttle causes sonar detection range between 5m and full range
						if (this.owner.ridingEntity != null && victim != this.owner.ridingEntity || !this.owner.isRiding()) //no targeting your own vehicle if riding one
						{   //System.out.println("you seated");

							//case for asw torpedo that doesnt need lock on angle
							//		if( type.modernTorpedo && isInWater() && Math.abs(entity.posX - posX) < (type.ASWminRange + type.seekerRange*noisiness) && Math.abs(entity.posY - posY)< (type.ASWminRange + type.seekerRange*noisiness) && Math.abs(entity.posZ - posZ) < (type.ASWminRange + type.seekerRange*noisiness) )
							if( type.modernTorpedo  && isInWater()  && type.ASWminRange + type.seekerRange*noisiness > relPosVec.length() )

							{
								closestEntity = entity;
								closestAngle = angle;

								//	System.out.println("successful lock within this range " + (type.ASWminRange + type.seekerRange*noisiness));
								//	System.out.println("target locked " + closestEntity);

							}

						}

					} //end of labjac cancer block



				}
			}

			if (closestEntity != null)
			{
				lockedOnTo = closestEntity;

				if(this.owner != null && this.owner instanceof EntityPlayer && lockedOnTo instanceof EntityDriveable && !worldObj.isRemote)
				{
					EntityDriveable target = (EntityDriveable)lockedOnTo;
					EntityPlayer human = (EntityPlayer)this.owner;
					human.addChatMessage(new ChatComponentText(type.name + " has successfully locked onto " + target.getDriveableType().name));
				}
			}

		}
	}

	@Override
	public void setVelocity(double d, double d1, double d2) {
		motionX = d;
		motionY = d1;
		motionZ = d2;
		if (prevRotationPitch == 0.0F && prevRotationYaw == 0.0F) {
			float f = MathHelper.sqrt_double(d * d + d2 * d2);
			prevRotationYaw = rotationYaw = (float) ((Math.atan2(d, d2) * 180D) / 3.1415927410125732D);
			prevRotationPitch = rotationPitch = (float) ((Math.atan2(d1, f) * 180D) / 3.1415927410125732D);
			setLocationAndAngles(posX, posY, posZ, rotationYaw, rotationPitch);
		}
	}

	@Override
	public void onUpdate() {
		super.onUpdate();
		//  System.out.println("bullet motion: x: " + this.motionX + "  y: " + this.motionY + "  z: " + this.motionZ);
		prevPosX = posX;
		prevPosY = posY;
		prevPosZ = posZ;

		if (type == null) {
			FlansMod.log("EntityBullet.onUpdate() Error: BulletType is null (" + this + ")");
			setDead();
			//   System.out.println("Imposter 4");
			return;
		}


		if (this.ticksExisted == type.lockonDelay && !type.modernTorpedo) //so no instant lockon
			getLockOnTarget();

		if (type.modernTorpedo && this.isInWater() && !lockAttempted) //so torpedo will lockon after entering water one time
		{
			getLockOnTarget();
			lockAttempted = true; //so it will only attempt once
		}

		if (type.despawnTime > 0 && ticksExisted > type.despawnTime) {
			detonated = true;
			setDead();
			//   System.out.println("Imposter 5");
			return;
		}


		//vehicle armorpen stuff
		if(this.ticksExisted < 10)
		{ //initialize labjac shit
			truePen = type.armorPen;
			isHEAT = type.HEAT;		
			isSword = type.swordEnergy;		
			missNoise = type.missNoise;
		}

		//if pen decays to half of normal value, then stop decaying
		if((truePen) > 2 && (truePen > 0.5*type.armorPen))
			truePen = truePen - ticksExisted*(type.penDecay);

		if(type.armorPen > 2 && truePen < 2)
			truePen = 2;




		if (!hasSetSubDelay && type.hasSubmunitions) {
			setSubmunitionDelay();
		} else if (type.hasSubmunitions) {
			submunitionDelay--;
		}

		if (!hasSetVLSDelay && type.VLS) {
			VLSDelay = type.VLSTime;
			hasSetVLSDelay = true;
		}

		if (VLSDelay > 0)
			VLSDelay--;

		if (!hasSetLook && owner != null) {
			lookVector = new Vector3f((float) owner.getLookVec().xCoord, (float) owner.getLookVec().yCoord, (float) owner.getLookVec().zCoord);
			initialPos = new Vector3f(owner.posX, owner.posY, owner.posZ);
			hasSetLook = true;
		}


		if (soundTime > 0)
			soundTime--;

		if (owner != null) {
			double rangeX = owner.posX - this.posX;
			double rangeY = owner.posY - this.posY;
			double rangeZ = owner.posZ - this.posZ;
			double range = Math.sqrt((rangeX * rangeX) + (rangeY * rangeY) + (rangeZ * rangeZ));

			if (type.maxRange != -1 && type.maxRange < range) {
				if (ticksExisted > type.fuse && type.fuse > 0)
					detonate();
				setDead();
				//     System.out.println("Imposter 6");
			}
		} else {
			// System.out.println("Imposter 7");
			this.setDead();
		}


		//Check the fuse to see if the bullet should explode
		ticksInAir++;
		if (ticksInAir > type.fuse && type.fuse > 0 && !isDead) {
			//	 System.out.println("Imposter 8");
			setDead();
		}

		if (ticksExisted > bulletLife) {
			//	 System.out.println("Imposter 9");
			setDead();
		}

		if (isDead)
			return;

		//Detonation conditions
		if (!worldObj.isRemote) {
			if (ticksExisted > type.fuse && type.fuse > 0)
				detonate();
			//If this grenade has a proximity trigger, check for living entities within it's range
			if (type.livingProximityTrigger > 0 || type.driveableProximityTrigger > 0) {
				float checkRadius = Math.max(type.livingProximityTrigger, type.driveableProximityTrigger);
				List list = worldObj.getEntitiesWithinAABBExcludingEntity(this, boundingBox.expand(checkRadius, checkRadius, checkRadius));
				for (Object obj : list) {
					if (obj == owner && ticksExisted < 10)
						continue;
					if (obj instanceof EntityLivingBase && getDistanceToEntity((Entity) obj) < type.livingProximityTrigger) {
						//If we are in a gametype and both thrower and triggerer are playing, check for friendly fire
						if (TeamsManager.getInstance() != null && TeamsManager.getInstance().currentRound != null && obj instanceof EntityPlayerMP && owner instanceof EntityPlayer) {
							if (!TeamsManager.getInstance().currentRound.gametype.playerAttacked((EntityPlayerMP) obj, new EntityDamageSourceFlans(type.shortName, this, (EntityPlayer) owner, type, false, false)))
								continue;
						}
						if (type.damageToTriggerer > 0)
							((EntityLivingBase) obj).attackEntityFrom(getBulletDamage(false), type.damageToTriggerer);
						FlansMod.proxy.spawnParticle("redstone", posX, posY, posZ, 0, 0, 0);

						detonate();
						break;
					}
					if (obj instanceof EntityDriveable && getDistanceToEntity((Entity) obj) < type.driveableProximityTrigger) {
						/**
                         if(TeamsManager.getInstance() != null && TeamsManager.getInstance().currentRound != null && ((EntityDriveable)obj).seats[0].riddenByEntity instanceof EntityPlayerMP && owner instanceof EntityPlayer)
                         {
                         EntityPlayerMP player = (EntityPlayerMP)((EntityDriveable)obj).seats[0].riddenByEntity;
                         if(!TeamsManager.getInstance().currentRound.gametype.playerAttacked((EntityPlayerMP)obj, new EntityDamageSourceFlans(type.shortName, this, (EntityPlayer)owner, type, false)))
                         continue;
                         }
						 */
						if (type.damageToTriggerer > 0)
							((EntityDriveable) obj).attackEntityFrom(getBulletDamage(false), type.damageToTriggerer);
						detonate();
						break;
					}
				}
			}
		}
		//Create a list for all bullet hits
		ArrayList<BulletHit> hits = new ArrayList<BulletHit>();

		Vector3f origin = new Vector3f(posX, posY, posZ);
		Vector3f motion = new Vector3f(motionX, motionY, motionZ);
		float hitBoxSize = type.hitBoxSize >= 0 ? type.hitBoxSize : 0;

		float speed = motion.length();

		speedA = speed;

		if (type.hasSubmunitions) {
			if (submunitionDelay < 0) {
				DeploySubmunitions();
				submunitionDelay = 9001;
			}
		}

		//Iterate over all entities
		for (int i = 0; i < worldObj.loadedEntityList.size(); i++) {
			Object obj = worldObj.loadedEntityList.get(i);
			//Get driveables
			if (obj instanceof EntityDriveable ) {
				EntityDriveable driveable = (EntityDriveable) obj;
	
				if (driveable.isDead() || (driveable.isPartOfThis(owner) && !evilBullet && !(driveable.getDriveableType().evilGolem && !evilBullet) ) || (driveable.hitboxPartOfThis(owner) && !evilBullet && !(driveable.getDriveableType().evilGolem && !evilBullet) )  ) //evil bullets dont hurt evil ai vehicles
					continue;

				//If this bullet is within the driveable's detection range
				if (getDistanceToEntity(driveable) <= driveable.getDriveableType().bulletDetectionRadius + speed) {

					//Raytrace the bullet
					if(driveable.getDriveableType().autisticHitDetection && !(driveable.getDriveableType().evilGolem && evilBullet)) //xddd dont want to accidentally convert all bullets to autism
					{
					//	System.out.println("evil bullet: " + evilBullet);
						ArrayList<BulletHit> driveableHits = driveable.attackFromBullet(origin, motion, evilBullet);
						hits.addAll(driveableHits);
					}
					//shoehorn in classic hit detection jamiostyle
					else if(!(driveable.getDriveableType().evilGolem && evilBullet) ) //evil bullets dont hurt evil ai golems!
					{
						//System.out.println("evil bullet: " + evilBullet);
						ArrayList<BulletHit> driveableHiterinos = driveable.attackFromBulletClassic(origin, motion, evilBullet);
						hits.addAll(driveableHiterinos);
					}
				}
			}
			//Get players
			else if (obj instanceof EntityPlayer) {
				EntityPlayer player = (EntityPlayer) obj;
				PlayerData data = PlayerHandler.getPlayerData(player);
				boolean shouldDoNormalHitDetect = false;
				if (data != null) {
					if (player.isDead || data.team == Team.spectators) {
						continue;
					}
					if (player == owner && ticksInAir < 20 && !evilBullet)
						// The shooter of this bullet is immune to it for the first second.
						continue;
					int snapshotToTry = TeamsManager.bulletSnapshotMin;
					if (TeamsManager.bulletSnapshotDivisor > 0) {
						snapshotToTry += pingOfShooter / TeamsManager.bulletSnapshotDivisor;
					}
					if (snapshotToTry >= data.snapshots.length)
						snapshotToTry = data.snapshots.length - 1;
					PlayerSnapshot snapshot;
					if (data.snapshots[snapshotToTry] != null) {
						snapshot = data.snapshots[snapshotToTry];
					} else {
						snapshot = data.snapshots[0];
					}

					//DEBUG
					//snapshot = new PlayerSnapshot(player);

					//Check one last time for a null snapshot. If this is the case, fall back to normal hit detection
					if (snapshot == null)
						shouldDoNormalHitDetect = true;
					else {
						//Raytrace
						ArrayList<BulletHit> playerHits = snapshot.raytrace(origin, motion);

						hits.addAll(playerHits);
					}
				}

				//If we couldn't get a snapshot, use normal entity hitbox calculations
				if (data == null || shouldDoNormalHitDetect) {
					MovingObjectPosition mop = player.boundingBox.expand(hitBoxSize, hitBoxSize, hitBoxSize).calculateIntercept(origin.toVec3(), Vec3.createVectorHelper(posX + motionX, posY + motionY, posZ + motionZ));
					if (mop != null) {
						Vector3f hitPoint = new Vector3f(mop.hitVec.xCoord - posX, mop.hitVec.yCoord - posY, mop.hitVec.zCoord - posZ);
						float hitLambda = 1F;
						if (motion.x != 0F)
							hitLambda = hitPoint.x / motion.x;
						else if (motion.y != 0F)
							hitLambda = hitPoint.y / motion.y;
						else if (motion.z != 0F)
							hitLambda = hitPoint.z / motion.z;
						if (hitLambda < 0)
							hitLambda = -hitLambda;

						hits.add(new PlayerBulletHit(new PlayerHitbox(player, new RotatedAxes(), new Vector3f(), new Vector3f(), new Vector3f(), EnumHitboxType.BODY), hitLambda));
					}
				}
			} else {
				Entity entity = (Entity) obj;
				if (entity != this && (entity != owner && !evilBullet) && !entity.isDead && !(entity instanceof EntityItem) && !(entity instanceof EntityXPOrb) && !(entity instanceof EntityArrow) &&
						(entity.getClass().toString().indexOf("flansmod.") < 0 || entity instanceof EntityAAGun || entity instanceof EntityGrenade)
						&& entity.getClass().toString().indexOf("holographicdisplays") < 0) {
					AxisAlignedBB bb = entity.boundingBox.addCoord(
							-(entity.posX - entity.prevPosX) * 2,
							-(entity.posY - entity.prevPosY) * 2,
							-(entity.posZ - entity.prevPosZ) * 2);
					MovingObjectPosition mop = bb.expand(hitBoxSize, hitBoxSize, hitBoxSize).calculateIntercept(origin.toVec3(), Vec3.createVectorHelper(posX + motionX, posY + motionY, posZ + motionZ));
					if (mop != null) {
						Vector3f hitPoint = new Vector3f(mop.hitVec.xCoord - posX, mop.hitVec.yCoord - posY, mop.hitVec.zCoord - posZ);
						float hitLambda = 1F;
						if (motion.x != 0F)
							hitLambda = hitPoint.x / motion.x;
						else if (motion.y != 0F)
							hitLambda = hitPoint.y / motion.y;
						else if (motion.z != 0F)
							hitLambda = hitPoint.z / motion.z;
						if (hitLambda < 0)
							hitLambda = -hitLambda;

						hits.add(new EntityHit(entity, hitLambda));
					}
				}
			}
		}

		//Ray trace the bullet by comparing its next position to its current position
		Vec3 posVec = Vec3.createVectorHelper(posX, posY, posZ);
		Vec3 nextPosVec = Vec3.createVectorHelper(posX + motionX, posY + motionY, posZ + motionZ);
		//   MovingObjectPosition hit = worldObj.func_147447_a(posVec, nextPosVec, false, true, true);   //this is "raytraceblocks" in disguise   ALLAH BOOKMARK BEFORE INSTALLING GRASS/GLASS FLY THROUGH
		MovingObjectPosition hit = CustomBlockRaytracing.func_147447_a(worldObj, posVec, nextPosVec, false, true, true);   //baris tech TM

		posVec = Vec3.createVectorHelper(posX, posY, posZ);

		if (hit != null) {
			//Calculate the lambda value of the intercept
			Vec3 hitVec = posVec.subtract(hit.hitVec);
			float lambda = 1;
			//Try each co-ordinate one at a time.
			if (motionX != 0)
				lambda = (float) (hitVec.xCoord / motionX);
			else if (motionY != 0)
				lambda = (float) (hitVec.yCoord / motionY);
			else if (motionZ != 0)
				lambda = (float) (hitVec.zCoord / motionZ);

			if (lambda < 0)
				lambda = -lambda;
			hits.add(new BlockHit(hit, lambda));
		}

		//We hit something  after raytracing decides you indeed scored hits
		if (!hits.isEmpty()) {

			//	System.out.println("the hits again but after bullet is convinced that raytraces happened: " + hits);
			//Sort the hits according to the intercept position
			Collections.sort(hits);

			//   System.out.println("also after being sorted: " + hits);

			for (BulletHit bulletHit : hits) {



				if (bulletHit instanceof DriveableHit) {
					//	System.out.println("the hits being looped by hits !empty then being individually cycled back to apply damage: " + hits + " and the indivudal hit being cycled: " + bulletHit + ((DriveableHit)bulletHit).part);
					if (type.entityHitSoundEnable)
						PacketPlaySound.sendSoundPacket(posX, posY, posZ, type.hitSoundRange, dimension, type.hitSound, true);
					if (worldObj.isRemote) {
						if (owner instanceof EntityPlayer) {
							if (FlansMod.proxy.isThePlayer((EntityPlayer) owner)) {
								hitCrossHair = true;
							}
						}
					}
					DriveableHit driveableHit = (DriveableHit) bulletHit;
					driveableHit.driveable.lastAtkEntity = owner;
					//added a bunch of ivermectin to prevent randomc rashes when stabbing a cannon
					if(type != null && type.swordEnergy && driveable != null && driveable.getDriveableType() != null && driveable.getDriveableType().canStab || (!type.swordEnergy && !(driveable instanceof EntityVehicle && ((EntityVehicle)driveable).getVehicleType().evilGolem && evilBullet) )) //sword no stab unstabable vehicles   also evil bullet no stab evil vehicle
					{
						penetratingPower = driveableHit.driveable.bulletHit(this, driveableHit, penetratingPower);
						//	System.out.println("penetrating power returned after entity bullet feeds the data into entitydriveable's depenetrator: " + penetratingPower);
						// 	System.out.println("remaining hits list: " + hits);
					}


					if (type.canSpotEntityDriveable)
						driveableHit.driveable.setEntityMarker(200);
					//driveableHit.driveable.isShowedPosition = true;
					//driveableHit.driveable.tickCount = 200;
					if (FlansMod.DEBUG)
						worldObj.spawnEntityInWorld(new EntityDebugDot(worldObj, new Vector3f(posX + motionX * driveableHit.intersectTime, posY + motionY * driveableHit.intersectTime, posZ + motionZ * driveableHit.intersectTime), 1000, 0F, 0F, 1F));

				} else if (bulletHit instanceof PlayerBulletHit) {
					if (type.entityHitSoundEnable)
						PacketPlaySound.sendSoundPacket(posX, posY, posZ, type.hitSoundRange, dimension, type.hitSound, true);
					if (worldObj.isRemote) {
						if (owner instanceof EntityPlayer) {
							if (FlansMod.proxy.isThePlayer((EntityPlayer) owner) && !evilBullet) {
								hitCrossHair = true;
							}
						}
					}
					PlayerBulletHit playerHit = (PlayerBulletHit) bulletHit;
					penetratingPower = playerHit.hitbox.hitByBullet(this, penetratingPower);
					//     System.out.println("sussy playerhit");
					if (FlansMod.DEBUG)
						worldObj.spawnEntityInWorld(new EntityDebugDot(worldObj, new Vector3f(posX + motionX * playerHit.intersectTime, posY + motionY * playerHit.intersectTime, posZ + motionZ * playerHit.intersectTime), 1000, 1F, 0F, 0F));
				} else if (bulletHit instanceof EntityHit) {
					if (type.entityHitSoundEnable)
						PacketPlaySound.sendSoundPacket(posX, posY, posZ, type.hitSoundRange, dimension, type.hitSound, true);
					if (worldObj.isRemote) {
						if (owner instanceof EntityPlayer) {
							if (FlansMod.proxy.isThePlayer((EntityPlayer) owner) && !evilBullet) {
								hitCrossHair = true;
								// Reset crosshair rendering
								penAmount = 1;
								headshot = false;
							}
						}
					}
					EntityHit entityHit = (EntityHit) bulletHit;
					float d = damage;
					if (entityHit.entity instanceof EntityLivingBase) {
						//dynamic damage
						if(this.ticksExisted>type.dynamicBulletDelay)
							d *= type.dynamicDamage;
						else
							d *= type.damageVsLiving;
						if (entityHit.entity != owner || !(evilBullet && entityHit.entity == owner) )
							FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("flansmod.blood", entityHit.entity.posX, entityHit.entity.posY+1, entityHit.entity.posZ, (float)Math.random()*1, (float)Math.random()*1, -(float)Math.random()*1), entityHit.entity.posX, entityHit.entity.posY, entityHit.entity.posZ, 150, dimension);



						if (d>40)
						{
							PacketPlaySound.sendSoundPacket(entityHit.entity.posX, entityHit.entity.posY, entityHit.entity.posZ, 15, dimension, "goreDeath", true);
							FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("flansmod.overkill", entityHit.entity.posX, entityHit.entity.posY-4, entityHit.entity.posZ, (float)Math.random()*1, (float)Math.random()*1, -(float)Math.random()*1), entityHit.entity.posX, entityHit.entity.posY, entityHit.entity.posZ, 150, dimension);
						}

					} else {
						if(this.ticksExisted>type.dynamicBulletDelay) //dynamic damage
							d *= type.dynamicDamage;
						else
							d *= type.damageVsEntity;


						if (d>40)
						{
							PacketPlaySound.sendSoundPacket(entityHit.entity.posX, entityHit.entity.posY, entityHit.entity.posZ, 15, dimension, "goreDeath", true);
							FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("flansmod.overkill", entityHit.entity.posX, entityHit.entity.posY-4, entityHit.entity.posZ, (float)Math.random()*1, (float)Math.random()*1, -(float)Math.random()*1), entityHit.entity.posX, entityHit.entity.posY, entityHit.entity.posZ, 150, dimension);
						}
					}
					if (entityHit.entity.attackEntityFrom(getBulletDamage(false), d) && entityHit.entity instanceof EntityLivingBase) {
						EntityLivingBase living = (EntityLivingBase) entityHit.entity;
						for (PotionEffect effect : type.hitEffects) {
							living.addPotionEffect(new PotionEffect(effect));
						}
						//If the attack was allowed, we should remove their immortality cooldown so we can shoot them again. Without this, any rapid fire gun become useless
						living.arrowHitTimer++;
						living.hurtResistantTime = living.maxHurtResistantTime / 2;
					}
					if (type.setEntitiesOnFire)
						entityHit.entity.setFire(20);
					
					
					penetratingPower -= 1F; 
					      System.out.println("sussy penetrating power");
					      
					if (FlansMod.DEBUG) {
						worldObj.spawnEntityInWorld(new EntityDebugDot(worldObj, new Vector3f(posX + motionX * entityHit.intersectTime, posY + motionY * entityHit.intersectTime, posZ + motionZ * entityHit.intersectTime), 1000, 1F, 1F, 0F));
						FlansMod.log(entityHit.entity.toString() + ": d=" + d + ": damage=" + damage + ": type.damageVsEntity=" + type.damageVsEntity);
					}
				} else if (bulletHit instanceof BlockHit) {
					BlockHit blockHit = (BlockHit) bulletHit;
					MovingObjectPosition raytraceResult = blockHit.raytraceResult;
					//If the hit wasn't an entity hit, then it must've been a block hit
					int xTile = raytraceResult.blockX;
					int yTile = raytraceResult.blockY;
					int zTile = raytraceResult.blockZ;
					if (FlansMod.DEBUG)
						worldObj.spawnEntityInWorld(new EntityDebugDot(worldObj, new Vector3f(raytraceResult.hitVec.xCoord, raytraceResult.hitVec.yCoord, raytraceResult.hitVec.zCoord), 1000, 0F, 1F, 0F));

					Block block = worldObj.getBlock(xTile, yTile, zTile);
					Material mat = block.getMaterial();
					//If the bullet breaks glass, and can do so according to FlansMod, do so.
					if (type.breaksGlass && mat == Material.glass) {
						if (TeamsManager.canBreakGlass) {
							worldObj.setBlockToAir(xTile, yTile, zTile);
							FlansMod.proxy.playBlockBreakSound(xTile, yTile, zTile, block, this.dimension);
						}
					}

					if (worldObj.isRemote) {
						if (block.getMaterial() != Material.air && this.type.explosionRadius <= 0) {
							int num = 2 + this.rand.nextInt(3);
							for (int i = 0; i < num; i++) {
								FlansMod.proxy.spawnParticle(
										"blockcrack_" + Block.getIdFromBlock(block) + "_" + this.worldObj.getBlockMetadata(xTile, yTile, zTile),
										raytraceResult.hitVec.xCoord + ((double) this.rand.nextFloat() - 0.5D) * (double) this.width,
										raytraceResult.hitVec.yCoord + 0.1D,
										raytraceResult.hitVec.zCoord + ((double) this.rand.nextFloat() - 0.5D) * (double) this.width,
										-this.motionX * 4.0D,
										1.5D,
										-this.motionZ * 4.0D);
								FlansMod.proxy.spawnParticle("explode", raytraceResult.hitVec.xCoord, raytraceResult.hitVec.yCoord, raytraceResult.hitVec.zCoord, 0, 0, 0);
							}
						}
					}

					//penetratingPower -= block.getBlockHardness(worldObj, zTile, zTile, zTile);
					setPosition(hit.hitVec.xCoord, hit.hitVec.yCoord, hit.hitVec.zCoord);
					//play sound when bullet hits block
					if (type.hitSoundEnable)
						PacketPlaySound.sendSoundPacket(posX, posY, posZ, type.hitSoundRange, dimension, type.hitSound, true);
					setDead();
					//  System.out.println("Imposter 1");
					break;
				}
				if (penetratingPower <= 0F || (type.explodeOnImpact && ticksInAir > 1 && !(bulletHit instanceof PlayerBulletHit) )) { //so suppression hitbox wont trigger explodeonimpact
				//	System.out.println("evil bullet check? " + (evilBullet));
					
					setPosition(posX + motionX * bulletHit.intersectTime, posY + motionY * bulletHit.intersectTime, posZ + motionZ * bulletHit.intersectTime);

					setDead();
					break;
				}

			}

		}


		//Movement dampening variables
		float drag = type.dragInAir;
		float gravity = 0.02F;
		//If the bullet is in water, spawn particles and increase the drag
		if (isInWater()) {
			for (int i = 0; i < 4; i++) {
				float bubbleMotion = 0.25F;
				worldObj.spawnParticle("bubble", posX - motionX * bubbleMotion, posY - motionY * bubbleMotion, posZ - motionZ * bubbleMotion, motionX, motionY + 0.1F, motionZ);
			}
			drag = type.dragInWater;
		}
		if (!type.torpedo && !type.modernTorpedo) {
			motionX *= drag;
			motionY *= drag;
			motionZ *= drag;
			motionY -= gravity * type.fallSpeed;

			if(type.jamiogravity) //restored labjac feature
			motionY *= 0.98f;
		}






		// Apply homing action
		if (lockedOnTo != null) {
			if (lockedOnTo instanceof EntityDriveable) {
				EntityDriveable entDriveable = (EntityDriveable) lockedOnTo;
				// entPlane.isLockedOn = true;
				if (entDriveable.getDriveableType().lockedOnSound != null && soundTime <= 0 && !this.worldObj.isRemote) {
					PacketPlaySound.sendSoundPacket(lockedOnTo.posX, lockedOnTo.posY, lockedOnTo.posZ,
							entDriveable.getDriveableType().lockedOnSoundRange, dimension, entDriveable.getDriveableType().lockedOnSound, false);
					soundTime = entDriveable.getDriveableType().soundTime;
				}
			} else {
				lockedOnTo.getEntityData().setBoolean("Tracking", true);
			}

			if (this.ticksExisted > type.tickStartHoming) {
				double dX = lockedOnTo.posX - posX;
				double dY;
				if (type.isDoTopAttack && Math.abs(lockedOnTo.posX - this.posX) > 2 && Math.abs(lockedOnTo.posZ - this.posZ) > 2)
					dY = lockedOnTo.posY + 30 - posY;
				else dY = lockedOnTo.posY - posY;
				double dZ = lockedOnTo.posZ - posZ;
				double dXYZ;
				if (!type.isDoTopAttack)
					dXYZ = getDistanceToEntity(lockedOnTo);
				else dXYZ = Math.sqrt(dX * dX + dY * dY + dZ * dZ);

				if (owner != null && type.enableSACLOS) {
					double dXp = lockedOnTo.posX - owner.posX;
					double dYp = lockedOnTo.posY - owner.posY;
					double dZp = lockedOnTo.posZ - owner.posZ;
					Vec3 playerVec = owner.getLookVec();
					Vector3f playerVec3f = new Vector3f(playerVec.xCoord, playerVec.yCoord, playerVec.zCoord);
					double angles = Math.abs(Vector3f.angle(playerVec3f, new Vector3f(dXp, dYp, dZp)));
					if (angles > Math.toRadians(type.maxDegreeOfSACLOS)) {
						lockedOnTo = null;
					}
				}

				if (this.toggleLock) {
					//prevDistanceToEntity = dXYZ;
					if (dXYZ > type.maxRangeOfMissile)
						lockedOnTo = null;
					toggleLock = false;
				}

				// Vector3f lockedOnToVector = new Vector3f(dX,dY,dZ);

				double dmotion = Math.sqrt(motionX * motionX + motionY * motionY + motionZ * motionZ);

				Vector3f motionVector = new Vector3f(dX * dmotion / dXYZ, dY * dmotion / dXYZ, dZ * dmotion / dXYZ);

				double angle = Math.abs(Vector3f.angle(motion, motionVector));

				if (angle > Math.toRadians(type.maxDegreeOfMissile) && !type.infiniteAngle && !type.antiRadiation && !type.modernTorpedo) { //labjac exceptions
					lockedOnTo = null;
				} else {
					motionX = motionVector.x;
					motionY = motionVector.y;
					motionZ = motionVector.z;
				}

				if (this.ticksExisted > 4 && dXYZ > prevDistanceToEntity) {
					closeCount++;
					if (closeCount > 15) {
						lockedOnTo = null;
					}
				} else {
					if (closeCount > 0)
						closeCount--;
				}
				prevDistanceToEntity = dXYZ;
			}

			if (lockedOnTo instanceof EntityDriveable) {
				EntityDriveable plane = (EntityDriveable) lockedOnTo;

				if (plane.varFlare || plane.ticksFlareUsing > 0)// && !type.enableSACLOS)
				{
					lockedOnTo = null;
					if(this.owner != null && this.owner instanceof EntityPlayer  && !worldObj.isRemote)
					{
						EntityDriveable target = (EntityDriveable)lockedOnTo;
						EntityPlayer human = (EntityPlayer)this.owner;
						human.addChatMessage(new ChatComponentText("Enemy flares have broken " + type.name + "'s lock!"));
					}
				}
			} else if (lockedOnTo != null && lockedOnTo.getEntityData().getBoolean("FlareUsing")) {
				lockedOnTo = null;
			}
		}

		//FlansMod.log((int)posX+","+(int)posY+","+(int)posZ);

		if (owner != null && type.shootForSettingPos && !this.isFirstPositionSetting) {
			if (this.owner instanceof EntityPlayer) {
				EntityPlayer entP = (EntityPlayer) this.owner;
				if (entP.getCurrentEquippedItem() != null)
					if (entP.getCurrentEquippedItem().getItem() instanceof ItemGun) {
						ItemGun itemGun = (ItemGun) entP.getCurrentEquippedItem().getItem();
						this.impactX = itemGun.impactX;
						this.impactY = itemGun.impactY;
						this.impactZ = itemGun.impactZ;
					}

			}
			this.isFirstPositionSetting = true;
		}

		if (type.shootForSettingPos && this.isFirstPositionSetting && this.isPositionUpper) {
			double motionXa = this.motionX;
			double motionYa = this.motionY;
			double motionZa = this.motionZ;
			double motiona = Math.sqrt((motionXa * motionXa) + (motionYa * motionYa) + (motionZa * motionZa));
			this.motionX = 0;
			this.motionY = motiona;
			this.motionZ = 0;

			if (this.posY - type.shootForSettingPosHeight > owner.posY) {
				this.isPositionUpper = false;
			}
		}
		if (type.shootForSettingPos && this.isFirstPositionSetting && !this.isPositionUpper) {
			double rootx = this.impactX - this.posX;
			double rootz = this.impactZ - this.posZ;
			double roota = Math.sqrt((rootx * rootx) + (rootz * rootz));
			double motionXa = this.motionX;
			double motionYa = this.motionY;
			double motionZa = this.motionZ;
			double motiona = Math.sqrt((motionXa * motionXa) + (motionYa * motionYa) + (motionZa * motionZa));
			this.motionX = rootx * motiona / roota;
			this.motionZ = rootz * motiona / roota;
			if (Math.abs(this.impactX - this.posX) < 1 && Math.abs(this.impactZ - this.posZ) < 1) {
				double motionXab = this.motionX;
				double motionYab = this.motionY;
				double motionZab = this.motionZ;
				double motionab = Math.sqrt((motionXa * motionXa) + (motionYa * motionYa) + (motionZa * motionZa));
				this.motionX = 0;
				this.motionY = -motionab;
				this.motionZ = 0;
			}
		}
		this.renderDistanceWeight = 256D;
		if (owner != null && type.manualGuidance && VLSDelay <= 0 && lockedOnTo == null) {

			this.renderDistanceWeight = 256D;
			/**
             boolean beamRider = true;
             if(!beamRider)
             {
             this.rotationYaw = owner.rotationYaw;
             this.rotationPitch = owner.rotationPitch;
             double dist = MathHelper.sqrt_double( motionX*motionX + motionY*motionY + motionZ*motionZ );
             final float PI = (float) Math.PI;
             motionX = dist * -MathHelper.sin((rotationYaw   / 180F) * PI) * MathHelper.cos((rotationPitch / 180F) * PI)*1.02;
             motionZ = dist *  MathHelper.cos((rotationYaw   / 180F) * PI) * MathHelper.cos((rotationPitch / 180F) * PI)*1.02;
             motionY = dist * -MathHelper.sin((rotationPitch / 180F) * PI)*1.02;
             } else
			 */

			Vector3f lookVec;
			Vector3f origin2;
			lookVec = new Vector3f((float) owner.getLookVec().xCoord, (float) owner.getLookVec().yCoord, (float) owner.getLookVec().zCoord);
			origin2 = new Vector3f(owner.posX, owner.posY, owner.posZ);

			if (type.fixedDirection) {
				lookVec = lookVector;
				origin2 = initialPos;
			}
			float x = (float) (posX - origin2.x);
			float y = (float) (posY - origin2.y);
			float z = (float) (posZ - origin2.z);

			float d = (float) Math.sqrt((x * x) + (y * y) + (z * z));
			d = d + type.turnRadius;

			lookVec.normalise();

			Vector3f targetPoint = new Vector3f(origin2.x + (lookVec.x * d), origin2.y + (lookVec.y * d), origin2.z + (lookVec.z * d));
			//FlansMod.proxy.spawnParticle("explode", targetPoint.x,targetPoint.y,targetPoint.z, 0,0,0);
			//double dX = owner.posX - this.posX;
			//double dY = owner.posY - this.posY;
			//double dZ = owner.posZ - this.posZ;
			//targetPoint = new Vector3f(owner.posX, owner.posY, owner.posZ);

			Vector3f diff = Vector3f.sub(targetPoint, new Vector3f(posX, posY, posZ), null);

			float speed2 = type.trackPhaseSpeed;
			float turnSpeed = type.trackPhaseTurn;
			diff.normalise();
			turnSpeed = 0.1F;
			Vector3f targetSpeed = new Vector3f(diff.x * speed2, diff.y * speed2, diff.z * speed2);

			this.motionX += (targetSpeed.x - motionX) * turnSpeed;
			this.motionY += (targetSpeed.y - motionY) * turnSpeed;
			this.motionZ += (targetSpeed.z - motionZ) * turnSpeed;

			//this.rotationYaw = owner.rotationYaw;
			//this.rotationPitch = owner.rotationPitch;
		}


		if (type.torpedo || (type.modernTorpedo && lockedOnTo == null)) {
			if (isInWater()) {
				Vector3f motion2 = new Vector3f(motionX, motionY, motionZ);
				float length = motion.length();
				motion.normalise(); 
				motionX = motion.x * 1;
				motionZ = motion.z * 1;
				if (!type.modernTorpedo) //allow modern torpedos to swim up and down while old ones want to swim up to surface
				{
					motionY += 1.5f * gravity * type.fallSpeed;
				motionY *= 0.3F;
				}
			} else             
				motionY -= gravity * type.fallSpeed * 2.5f; //fall faster in air

		}

		if(type.depthCharge) //labjac depth charge
		{
			if(!isInWater() )
			{
				motionY -= gravity * type.fallSpeed;
				if(this.motionY > 0.1f) //guaruntee it loses positive motion y
					this.motionY *= 0.9f;
			}
			if((TeamsManager.seaLevel-this.posY)<=type.activationDepth && isInWater())
			{
				motionY -= gravity * type.fallSpeed;
				motionX = 0;
				motionZ = 0;
			}

			if((TeamsManager.seaLevel-this.posY)>type.activationDepth && isInWater())
			{
				detonate();
			}
		}


		//Apply motion
		//posX += motionX;
		//posY += motionY;
		//posZ += motionZ;
		setPosition(posX + motionX, posY + motionY, posZ + motionZ);

		//Recalculate the angles from the new motion
		float motionXZ = MathHelper.sqrt_double(motionX * motionX + motionZ * motionZ);
		rotationYaw = (float) ((Math.atan2(motionX, motionZ) * 180D) / 3.1415927410125732D);
		rotationPitch = (float) ((Math.atan2(motionY, motionXZ) * 180D) / 3.1415927410125732D);
		//Reset the range of the angles
		for (; rotationPitch - prevRotationPitch < -180F; prevRotationPitch -= 360F) {
		}
		for (; rotationPitch - prevRotationPitch >= 180F; prevRotationPitch += 360F) {
		}
		for (; rotationYaw - prevRotationYaw < -180F; prevRotationYaw -= 360F) {
		}
		for (; rotationYaw - prevRotationYaw >= 180F; prevRotationYaw += 360F) {
		}
		rotationPitch = prevRotationPitch + (rotationPitch - prevRotationPitch) * 0.2F;  
		rotationYaw = prevRotationYaw + (rotationYaw - prevRotationYaw) * 0.2F;

		//Particles
		if (type.trailParticles && worldObj.isRemote && ticksInAir > 1) {
			spawnParticles();
		}


		if (this.ticksExisted == 3)
		{
			maxspeed = (float) Math.sqrt(motionX * motionX + motionY * motionY + motionZ * motionZ);
			initialX = (float) motionX;
			initialY = (float) motionY;
			initialZ = (float) motionZ;
		}

		//for true manual guidance (not saclos)
		if (type.trueManual && this.owner != null && this.owner.isRiding() && (this.owner.ridingEntity instanceof EntitySeat || this.owner.ridingEntity instanceof EntityDriveable) )
		{

			//System.out.println("she trying to joystick");

			EntityDriveable driverino = null;

			if (this.owner.ridingEntity instanceof EntitySeat)
			{
				EntitySeat seaterino = (EntitySeat)this.owner.ridingEntity;
				driverino = seaterino.driveable;
			}
			else if (this.owner.ridingEntity instanceof EntityDriveable)
				driverino = (EntityDriveable)this.owner.ridingEntity;

			if(driverino != null)
			{
				float cancerZ = -MathHelper.sin((rotationYaw / 180F) * 3.14159265F) * type.joystickSensitivity * MathHelper.cos((rotationPitch / 180F) * 3.14159265F);
				float cancerX = MathHelper.cos((rotationYaw / 180F) * 3.14159265F) * type.joystickSensitivity * MathHelper.cos((rotationPitch / 180F) * 3.14159265F);
				//System.out.println("pitch control " + driverino.pitchSignal);
				//System.out.println("yaw control " + driverino.yawSignal);
				float fakeY = (float) (initialY - gravity * type.fallSpeed * this.ticksExisted);

				Vector3f direction = new Vector3f(motionX, motionY, motionZ);
				direction.normalise(); 
				//  System.out.println("motiono x " + initialX + " y " + initialY + " z " + initialZ);

				//fix the deadzone where controls get reversed at certain angles
				if( (initialX > 0.5f && initialX > 0) || (initialX < 0 && initialX > -0.5f && initialZ < 0.5f) || (initialX > 0 && initialZ < 0.5f))
				{
					motionZ -= (driverino.yawSignal /100) * type.joystickSensitivity * (1-Math.abs(direction.z));
					motionX -= (driverino.yawSignal / 100) * type.joystickSensitivity * (1-Math.abs(direction.x));
				}
				else
				{
					motionZ += (driverino.yawSignal /100) * type.joystickSensitivity * (1-Math.abs(direction.z));
					motionX += (driverino.yawSignal / 100) * type.joystickSensitivity * (1-Math.abs(direction.x));
				}

				motionY += (driverino.pitchSignal / 120) * type.joystickSensitivity * (1- Math.abs(direction.y)) ;
				// motionY += MathHelper.sin((rotationPitch / 180F) * 3.141593F) * type.joystickSensitivity * driverino.pitchSignal / 50;




				//if(Math.abs(motionX*2))

				//  if (Math.sqrt(motionX * motionX + motionY * motionY + motionZ * motionZ) > maxspeed*1.5f)
				//  	motionX *= 0.9f;
				//  	motionY *= 0.9f;
				//  	motionZ *= 0.9f;





				//   if (Math.sqrt(motionX * motionX + motionY * motionY + motionZ * motionZ) > maxspeed)  //prevent farming free speed
				//	 motionX *= 0.95;
				// 	motionY *= 0.95;
				// 	motionZ *= 0.95;

			}

		}

		//Temporary fire glitch fix
		if (worldObj.isRemote)
			extinguish();
	}

	@SideOnly(Side.CLIENT)
	private void spawnParticles() {
		double dX = (posX - prevPosX) / 10;
		double dY = (posY - prevPosY) / 10;
		double dZ = (posZ - prevPosZ) / 10;

		float spread = 0.1F;
		if (VLSDelay > 0 && type.boostPhaseParticle != null) {
			for (int i = 0; i < 10; i++) {
				FlansMod.proxy.spawnParticle(type.boostPhaseParticle,
						prevPosX + dX * i + rand.nextGaussian() * spread, prevPosY + dY * i + rand.nextGaussian() * spread, prevPosZ + dZ * i + rand.nextGaussian() * spread,
						0, 0, 0);
			}
		} else if (!type.VLS || (VLSDelay <= 0)) {
			for (int i = 0; i < 10; i++) {
				//EntityFX particle = FlansModClient.getParticle("flansmod.rocketexhaust", worldObj, prevPosX + dX * i + rand.nextGaussian() * spread, prevPosY + dY * i + rand.nextGaussian() * spread, prevPosZ + dZ * i + rand.nextGaussian() * spread);
				//if(particle != null && Minecraft.getMinecraft().gameSettings.fancyGraphics)
				//particle.renderDistanceWeight = 100D;
				//worldObj.spawnEntityInWorld(particle);
				FlansMod.proxy.spawnParticle(type.trailParticleType,
						prevPosX + dX * i + rand.nextGaussian() * spread, prevPosY + dY * i + rand.nextGaussian() * spread, prevPosZ + dZ * i + rand.nextGaussian() * spread,
						0, 0, 0);
			}

		}
		//FlansMod.proxy.spawnParticle("explode", prevPosX + dX, prevPosY + dY, prevPosZ + dZ, motionX + (float)Math.random()*1 - 0.5, motionY + (float)Math.random()*1 - 0.5, motionZ +(float)Math.random()*1 - 0.5);

	}


	@SideOnly(Side.CLIENT)
	private static void spawnHitParticles(double x, double y, double z) {
		FlansMod.proxy.spawnParticle("explode", x, y, z, 0, 0, 0);
	}

	public DamageSource getBulletDamage(boolean headshot) {
		if (owner instanceof EntityPlayer)
			return (new EntityDamageSourceFlans(type.shortName, this, (EntityPlayer) owner, firedFrom, headshot, false)).setProjectile();
		else return (new EntityDamageSourceIndirect(type.shortName, this, owner)).setProjectile();
	}

	private boolean isPartOfOwner(Entity entity) {
		if (owner == null)
			return false;
		if ( (entity == owner && !evilBullet) || (entity == owner.riddenByEntity && !evilBullet) || (entity == owner.ridingEntity && !evilBullet) )
			return true;
		if (owner instanceof EntityPlayer) {
			if (PlayerHandler.getPlayerData((EntityPlayer) owner, worldObj.isRemote ? Side.CLIENT : Side.SERVER) == null)
				return false;
			EntityMG mg = PlayerHandler.getPlayerData((EntityPlayer) owner, worldObj.isRemote ? Side.CLIENT : Side.SERVER).mountingGun;
			if (mg != null && mg == entity) {
				return true;
			}
		}
		return owner.ridingEntity instanceof EntitySeat && (((EntitySeat) owner.ridingEntity).driveable == null || ((EntitySeat) owner.ridingEntity).driveable.isPartOfThis(entity));
	}

	@Override
	public void setDead() {// System.out.println("bullet wants to die now");
		try {
			//scouting bullet telling master the coords
			if(this.owner != null && this.owner instanceof EntityPlayer && type.scoutBullet && !worldObj.isRemote)
			{
				float xd = (float)owner.posX - (float)this.posX;
				float yd = (float)owner.posY - (float)this.posY;
				float zd = (float)owner.posZ - (float)this.posZ;
				float distance = (float) Math.sqrt((xd*xd) + (yd*yd) + (zd*zd));



				EntityDriveable target = (EntityDriveable)lockedOnTo;
				EntityPlayer human = (EntityPlayer)this.owner;
				human.addChatMessage(new ChatComponentText(EnumChatFormatting.YELLOW.toString() +"Target coordinates are: "));
				human.addChatMessage(new ChatComponentText(EnumChatFormatting.GREEN.toString() + "X: " + EnumChatFormatting.GOLD.toString() + Math.round(this.posX) ));
				human.addChatMessage(new ChatComponentText(EnumChatFormatting.GREEN.toString() + "Y: " + EnumChatFormatting.GOLD.toString() + Math.round(this.posY) ));
				human.addChatMessage(new ChatComponentText(EnumChatFormatting.GREEN.toString() + "Z: " + EnumChatFormatting.GOLD.toString() + Math.round(this.posZ) ));
				human.addChatMessage(new ChatComponentText(EnumChatFormatting.YELLOW.toString() +"Distance from Target to your CURRENT Location: " + EnumChatFormatting.GOLD.toString() + distance));
			}


			if (isDead)
				return;

			super.setDead();

			if (worldObj.isRemote)
				return;

			//			FlansMod.log("EntityBullet.setDead() "+type.shortName + " : "+this);

			if (type.explosionRadius > 0) {
				if (owner instanceof EntityPlayer) {
					new FlansModExplosion(worldObj, this, (EntityPlayer) owner, type, posX, posY, posZ,
							type.explosionRadius, TeamsManager.explosions && type.explosionBreaksBlocks,
							type.explosionDamageVsLiving, type.explosionDamageVsPlayer, type.explosionDamageVsPlane, type.explosionDamageVsVehicle, type.smokeParticleCount, type.debrisParticleCount);
				} else {
					worldObj.createExplosion(this, posX, posY, posZ, type.explosionRadius, TeamsManager.explosions);
				}
			}
			if (type.fireRadius > 0) {
				for (float i = -type.fireRadius; i < type.fireRadius; i++) {
					for (float k = -type.fireRadius; k < type.fireRadius; k++) {
						for (int j = -1; j < 1; j++) {
							if (worldObj.getBlock((int) (posX + i), (int) (posY + j), (int) (posZ + k)).getMaterial() == Material.air) {
								worldObj.setBlock((int) (posX + i), (int) (posY + j), (int) (posZ + k), Blocks.fire);
							}
						}
					}
				}
			}
			//Send flak packet
			if (type.flak > 0)
				FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(posX, posY, posZ, type.flak, type.flakParticles), posX, posY, posZ, 200, dimension);
			// Drop item on hitting if bullet requires it
			if (type.dropItemOnHit != null) {
				String itemName = type.dropItemOnHit;
				int damage = 0;
				if (itemName.contains(".")) {
					damage = Integer.parseInt(itemName.split("\\.")[1]);
					itemName = itemName.split("\\.")[0];
				}
				ItemStack dropStack = InfoType.getRecipeElement(itemName, damage);
				entityDropItem(dropStack, 1.0F);
			}
		} catch (Exception e) {
			//			FlansMod.log("EntityBullet.setDead() Error ("+this+")");
			if (FlansMod.printStackTrace) {
				e.printStackTrace();
			}
		}
	}

	public float moveToTarget(float current, float target, float speed) {

		float pitchToMove = (float) ((Math.sqrt(target * target)) - Math.sqrt((current * current)));
		for (; pitchToMove > 180F; pitchToMove -= 360F) {
		}
		for (; pitchToMove <= -180F; pitchToMove += 360F) {
		}

		float signDeltaY = 0;
		if (pitchToMove > speed) {
			signDeltaY = 1;
		} else if (pitchToMove < -speed) {
			signDeltaY = -1;
		} else {
			signDeltaY = 0;
			return target;
		}


		if (current > target) {
			current = current - speed;
		} else if (current < target) {
			current = current + speed;
		}


		return current;
	}


	public void detonate() {
		//Do not detonate before grenade is primed
		if (ticksExisted < type.primeDelay)
			return;

		/*if(lockedOnTo != null)
		if(lockedOnTo instanceof EntityDriveable){
			EntityDriveable entPlane = (EntityDriveable)lockedOnTo;
			entPlane.isLockedOn = false;
		}*/

		//Stop repeat detonations
		if (detonated)
			return;
		detonated = true;

		//Play detonate sound
		PacketPlaySound.sendSoundPacket(posX, posY, posZ, FlansMod.soundRange, dimension, type.detonateSound, true);

		//Explode
		if (!worldObj.isRemote && type.explosionRadius > 0.1F) {
			if ((owner instanceof EntityPlayer)) {
				new FlansModExplosion(worldObj, this, (EntityPlayer) owner, type, posX, posY, posZ,
						type.explosionRadius, TeamsManager.explosions && type.explosionBreaksBlocks,
						type.explosionDamageVsLiving, type.explosionDamageVsPlayer, type.explosionDamageVsPlane, type.explosionDamageVsVehicle, type.smokeParticleCount, type.debrisParticleCount);
				isDead = true;
			} else {
				worldObj.createExplosion(this, posX, posY, posZ, type.explosionRadius, TeamsManager.explosions && type.explosionBreaksBlocks);
				isDead = true;
			}
		}

		//Make fire
		if (!worldObj.isRemote && type.fireRadius > 0.1F) {
			for (float i = -type.fireRadius; i < type.fireRadius; i++) {
				for (float j = -type.fireRadius; j < type.fireRadius; j++) {
					for (float k = -type.fireRadius; k < type.fireRadius; k++) {
						int x = MathHelper.floor_double(i + posX);
						int y = MathHelper.floor_double(j + posY);
						int z = MathHelper.floor_double(k + posZ);
						if (i * i + j * j + k * k <= type.fireRadius * type.fireRadius && worldObj.getBlock(x, y, z) == Blocks.air && rand.nextBoolean()) {
							worldObj.setBlock(x, y, z, Blocks.fire, 0, 3);
						}
					}
				}
			}
		}

		//Make explosion particles
		for (int i = 0; i < type.explodeParticles; i++) {
			worldObj.spawnParticle(type.explodeParticleType, posX, posY, posZ, rand.nextGaussian(), rand.nextGaussian(), rand.nextGaussian());
		}

		//Drop item upon detonation, after explosions and whatnot
		if (!worldObj.isRemote && type.dropItemOnDetonate != null) {
			String itemName = type.dropItemOnDetonate;
			int damage = 0;
			if (itemName.contains(".")) {
				damage = Integer.parseInt(itemName.split("\\.")[1]);
				itemName = itemName.split("\\.")[0];
			}
			ItemStack dropStack = InfoType.getRecipeElement(itemName, damage);
			entityDropItem(dropStack, 1.0F);
		}
	}

	@Override
	public void writeEntityToNBT(NBTTagCompound tag) {
		if (type == null) {
			FlansMod.log("EntityBullet.writeEntityToNBT() Error: BulletType is null (" + this + ")");
			setDead();
			// System.out.println("Imposter 2");
			return;
		}
		tag.setString("type", type.shortName);
		if (owner == null)
			tag.setString("owner", "null");
		else
			tag.setString("owner", owner.getCommandSenderName());
	}

	@Override
	public void readEntityFromNBT(NBTTagCompound tag) {
		String typeString = tag.getString("type");
		String ownerName = tag.getString("owner");

		if (typeString != null)
			type = BulletType.getBullet(typeString);

		if (type == null) {
			//			FlansMod.log("EntityBullet.readEntityFromNBT() Error: BulletType is null ("+this+")");
			this.isDead = true;
			return;
		}

		if (type.despawnTime <= 0) {
			this.isDead = true;
		}

		if (ownerName != null && !ownerName.equals("null"))
			owner = FMLCommonHandler.instance().getMinecraftServerInstance().getConfigurationManager().func_152612_a(ownerName);
	}

	@Override
	public float getShadowSize() {
		return type.hitBoxSize;
	}

	public void setSubmunitionDelay() {
		submunitionDelay = type.subMunitionTimer;
		hasSetSubDelay = true;
	}

	public void DeploySubmunitions() {
		ItemShootable itemShootable = (ItemShootable) GameRegistry.findItem(FlansMod.MODID, type.submunition);
		ShootableType shootType = itemShootable.type;
		World world = worldObj;
		EntityLivingBase entityplayer = (EntityLivingBase) owner;
		for (int sm = 0; sm < type.numSubmunitions; sm++) {
			world.spawnEntityInWorld(itemShootable.getEntity(
					world,
					new Vector3f(this.posX, this.posY, this.posZ),
					new Vector3f(motionX, motionY, motionZ),
					entityplayer,
					type.submunitionSpread,
					damage,
					speedA,
					0,
					firedFrom));
		}

		if (type.destroyOnDeploySubmunition) {
			detonate();
		}
	}

	public int getBrightnessForRender(float par1) {
		if (type.hasLight) {
			return 15728880;
		} else {
			int i = MathHelper.floor_double(this.posX);
			int j = MathHelper.floor_double(this.posZ);

			if (this.worldObj.blockExists(i, 0, j)) {
				double d0 = (this.boundingBox.maxY - this.boundingBox.minY) * 0.66D;
				int k = MathHelper.floor_double(this.posY - (double) this.yOffset + d0);
				return this.worldObj.getLightBrightnessForSkyBlocks(i, k, j, 0);
			} else {
				return 0;
			}
		}
	}

	@Override
	public void writeSpawnData(ByteBuf data) {
		data.writeDouble(motionX);
		data.writeDouble(motionY);
		data.writeDouble(motionZ);
		data.writeInt(impactX);
		data.writeInt(impactY);
		data.writeInt(impactZ);
		data.writeInt(lockedOnTo == null ? -1 : lockedOnTo.getEntityId());
		ByteBufUtils.writeUTF8String(data, type.shortName);
		if (owner == null)
			ByteBufUtils.writeUTF8String(data, "null");
		else
			ByteBufUtils.writeUTF8String(data, owner.getCommandSenderName());
	}

	@Override
	public void readSpawnData(ByteBuf data) {
		try {
			motionX = data.readDouble();
			motionY = data.readDouble();
			motionZ = data.readDouble();
			impactX = data.readInt();
			impactY = data.readInt();
			impactZ = data.readInt();
			int lockedOnToID = data.readInt();
			if (lockedOnToID != -1)
				lockedOnTo = worldObj.getEntityByID(lockedOnToID);
			type = BulletType.getBullet(ByteBufUtils.readUTF8String(data));
			penetratingPower = type.penetratingPower;
			String name = ByteBufUtils.readUTF8String(data);
			for (Object obj : worldObj.loadedEntityList) {
				if (((Entity) obj).getCommandSenderName().equals(name))
					owner = (EntityPlayer) obj;
			}
		} catch (Exception e) {
			FlansMod.log("Failed to read bullet owner from server.");
			super.setDead();
			//  System.out.println("Imposter 3");
			e.printStackTrace();
		}
	}

	@Override
	public boolean isBurning() {
		return false;
	}
}