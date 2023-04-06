package com.flansmod.common.driveables;

import java.util.ArrayList;

import net.minecraft.client.Minecraft;
import net.minecraft.nbt.NBTTagCompound;

import com.flansmod.common.FlansMod;
import com.flansmod.common.RotatedAxes;
import com.flansmod.common.driveables.collisions.CollisionShapeBox;
import com.flansmod.common.driveables.collisions.CollisionTest;
import com.flansmod.common.driveables.collisions.RidingEntityPosition;
import com.flansmod.common.driveables.mechas.EntityMecha;
import com.flansmod.common.guns.EntityBullet;
import com.flansmod.common.guns.raytracing.DriveableHit;
import com.flansmod.common.network.PacketFlak;
import com.flansmod.common.network.PacketParticle;
import com.flansmod.common.network.PacketPlaySound;
import com.flansmod.common.vector.Vector3f;

public class DriveablePart 
{
	public EnumDriveablePart type;
	public CollisionBox box;
	public int maxHealth=1;
	public int health=1;
	public int fireTime;
	public boolean onFire;
	public int maxCrew=1;
	public int crew=1;
	//labjac
	public int armor;
	public int compArmor;
	public int animal;
	public int crewRegenTimer;
	public int autoRepairTimer;
	public int autoRepairLimit=20;
	public int totalCrewFactor=20;

	/** Keeps track of whether death code has been called or not */
	public boolean dead;
	public EntityDriveable owner;

	
	public DriveablePart(EnumDriveablePart e, CollisionBox b)
	{
		type = e;
		box = b;
		health = maxHealth = b == null ? 0 : b.health;
		crew = maxCrew = b == null ? 0 : b.crew;
		//labjac sneaking in armor system
		armor = b == null ? 0 : b.armor;
		compArmor = b == null ? 0 : b.compArmor;
		animal = b == null ? 0 : b.animal;
	}

	public void update(EntityDriveable driveable)
	{
		if(crew<0)
			crew=0;
		if(fireTime > 0)
			fireTime--;
		if(fireTime == 0)
			onFire = false;
		if(onFire)
			health--;
		if(health <= 0 && maxHealth > 0)
		{
			dead = true;
			crew=0;
		}
		this.owner = driveable;
		
		//ultra crew, then 1 regen per tick simple as    also dont regen if you are shooting
		if(maxCrew>1000 && this.owner.throttle>-0.1 && this.owner.throttle<0.1 && !dead && this.crew<this.maxCrew && this.owner.shootDelaySecondary <= 0 && this.owner.shootDelayPrimary <= 0)
			totalCrewFactor=3;
		
		//big crew, 3 tick delay
		if(maxCrew<1000 && maxCrew>900)
			totalCrewFactor=6;
		
		//big but not quite that big crew, 4 tick delay and so on but also diminishing returns
		if(maxCrew<900 && maxCrew>800)
			totalCrewFactor=8;
		
		if(maxCrew<800 && maxCrew>700)
			totalCrewFactor=12;

		if(maxCrew<700 && maxCrew>600)
			totalCrewFactor=20;
		
		if(maxCrew<600 && maxCrew>500)
			totalCrewFactor=30;
		
		
		if(maxCrew<500 && maxCrew>400)
			totalCrewFactor=46;
		
		if(maxCrew<400 && maxCrew>300)
			totalCrewFactor=56;
		
		if(maxCrew<300 && maxCrew>200)
			totalCrewFactor=72;
		
		if(maxCrew<200 && maxCrew>100)
			totalCrewFactor=90;
		
		if(maxCrew<100 && maxCrew>0)
			totalCrewFactor=110;
		
		//xddd i doubled them all since flooding is too slow in comparison  -t future labjac
			
	
		//shitty timer for crew regeneration
		if(crewRegenTimer>=totalCrewFactor)
			crewRegenTimer=0;
		
		if(crewRegenTimer<totalCrewFactor)
			crewRegenTimer++;
		
		//regenerator based off of crew factor which is autobalanced so total wait time is constant ish relative to crew size per part
		if(crewRegenTimer==(totalCrewFactor-1) && this.owner.throttle>-0.1 && this.owner.throttle<0.1 && !dead && this.crew<this.maxCrew && this.owner.shootDelaySecondary <= 0 && this.owner.shootDelayPrimary <= 0)
			crew++;

		//-----border between crew shit and damage control shit---------
		
		
		//repair timer limit depends on crew percentage in the part

		
		
		
		

				
		//repair shit only if "flare" is deploying, throttle is at zero ish and dont repair buoyancy thats for flood system
		if(type != EnumDriveablePart.buoyancy && driveable.ticksFlareUsing>0 && driveable.throttle > -0.1 && driveable.throttle < 0.1 && health<maxHealth)
		{
			autoRepairTimer++;
			
			//exponential decay,ranging from 20 tick delay to 566 tick delay per repair cycle
			//autoRepairLimit=(int)(666 - 646*(crew*crew)/(maxCrew*maxCrew));
		//non exponential version
		//autoRepairLimit=(int)(566 - (546*(crew)/(maxCrew)));
			//composite system that depends on individual crew AND total crew
			int globalMaximum=driveable.getDriveableData().maximumCrew;
			int globalCrew=driveable.getDriveableData().totalCrew;
			autoRepairLimit=(int)(566 - ( (137*(float)((float)crew)/((float)maxCrew)) + (409*(float)((float)globalCrew)/((float)globalMaximum)) ) );	
		
		if(autoRepairTimer>autoRepairLimit)
			autoRepairTimer=0;
		
		//shitty timers for repair  configurable repair amount per cycle
		//has at least + 1 health per cycle incase percentage is too low otherwise 2.5% of max health
		if(autoRepairTimer==15 && !dead)
			health=health + 1 + (int) (maxHealth*0.025);
		}
		
		
		
		//repair system ported to tanks		also free repair if on a carrier
		if((driveable.ticksRepairing>0 || driveable.mounted) && driveable.throttle > -0.1 && driveable.throttle < 0.1 && health<maxHealth)
		{
			autoRepairTimer++;	
		
		if(autoRepairTimer>20)
			autoRepairTimer=0;
		
		//shitty timers for repair  configurable repair amount per cycle
		//has at least + 1 health per cycle incase percentage is too low otherwise 0.5% of max health
		if(autoRepairTimer==15 && !dead && type != EnumDriveablePart.leftTrack && type != EnumDriveablePart.rightTrack && type != EnumDriveablePart.frontLeftWheel && type != EnumDriveablePart.frontRightWheel && type != EnumDriveablePart.backLeftWheel && type != EnumDriveablePart.backRightWheel && type != EnumDriveablePart.engine && type != EnumDriveablePart.engine2 && type != EnumDriveablePart.engine3 && type != EnumDriveablePart.engine4 && type != EnumDriveablePart.engine5 && type != EnumDriveablePart.engine6)
			health=health + 1 + (int) (maxHealth*0.005);
		//tracks and wheels repair faster   also engines
		if(autoRepairTimer==15 && !dead && (type == EnumDriveablePart.leftTrack || type == EnumDriveablePart.rightTrack || type == EnumDriveablePart.frontLeftWheel || type == EnumDriveablePart.frontRightWheel || type == EnumDriveablePart.backLeftWheel || type == EnumDriveablePart.backRightWheel || type == EnumDriveablePart.engine || type == EnumDriveablePart.engine5 || type == EnumDriveablePart.engine2 || type == EnumDriveablePart.engine3 || type == EnumDriveablePart.engine4 || type == EnumDriveablePart.engine6))
			health=health + 1 + (int) (maxHealth*0.025);
		}
		
		
		
		
		//auto repair for aircraft carrier parked planes
		if(driveable.mounted && health<maxHealth)
			health++;
		
		
		
		//final solution to the crane problem
		if (health>maxHealth)
		health = maxHealth;
		
		//failsafe to prevent crew overflow
		if (crew>maxCrew)
			crew=maxCrew;
			
	}
	
	public void writeToNBT(NBTTagCompound tags)
	{
		tags.setInteger(type.getShortName() + "_Health", health);
		tags.setInteger(type.getShortName() + "_Crew", crew);
		tags.setBoolean(type.getShortName() + "_Fire", onFire);
	}
	
	//this was the final solution to make server remember what crew is after restart, do this to morale too to fix elephants?!?!?!?!
	public void readFromNBT(NBTTagCompound tags)
	{
		if(!tags.hasKey(type.getShortName() + "_Health"))
		{
			health = maxHealth;
			onFire = false;
			return;
		}
		if(!tags.hasKey(type.getShortName() + "_Crew"))
		{
			crew = maxCrew;
			onFire = false;
			return;
		}
		health = tags.getInteger(type.getShortName() + "_Health");
		crew = tags.getInteger(type.getShortName() + "_Crew");
		onFire = tags.getBoolean(type.getShortName() + "_Fire");
	}
	
	/** Called when a corner of this part hits the ground.
	 * @return The amount of damage to do to the block */
	public float smashIntoGround(EntityDriveable driveable, float damage)
	{
		//In these cases, there was no collision, so don't damage this or the block
		if(box == null || dead)
			return 0;
		if(!driveable.canHitPart(type))
			return 0;
		//This part is immortal. Smash that block into oblivion
		if(maxHealth == 0)
			return damage;
		//As standard, take half damage and return the other half
		health -= (int)(damage / 2F);
		return damage / 2F;
	}
		
	/** Called by bullets that may have hit the plane 
	 * @param evilBullet 
	 * @return A bullet hit if it hit. Otherwise null */
	
	//more of the secret to hitbox detection parts
	public DriveableHit rayTrace(EntityDriveable driveable, Vector3f origin, Vector3f motion, boolean evilBullet)
	{
		if(box == null || health <= 0 || dead)
			return null;
		if(!driveable.canHitPart(type))
			return null;
		
		if(driveable.type != null && driveable.type.evilGolem && evilBullet)  //evil bullets do not harm evil ai golem ships
			return null;

	//some weird abandoned tech by ancients
		
		/*
		boolean enteringX = coordIsEntering(origin.x, origin.x + motion.x, box.x / 16F, (box.x + box.w) / 16F);
		boolean enteringY = coordIsEntering(origin.y, origin.y + motion.y, box.y / 16F, (box.y + box.h) / 16F);
		boolean enteringZ = coordIsEntering(origin.z, origin.z + motion.z, box.z / 16F, (box.z + box.d) / 16F);
		boolean inX = coordIsIn(origin.x, origin.x + motion.x, box.x / 16F, (box.x + box.w) / 16F);
		boolean inY = coordIsIn(origin.y, origin.y + motion.y, box.y / 16F, (box.y + box.h) / 16F);
		boolean inZ = coordIsIn(origin.z, origin.z + motion.z, box.z / 16F, (box.z + box.d) / 16F);
		boolean hit = (enteringX && inY && inZ) || (inX && enteringY && inZ) || (inX && inY && enteringZ);
		
		*/
	
				
		//We now have an AABB starting at box(x, y, z) and with dimensions box(w, h, d) and our ray in the same coordinate system
		//We are looking for a point at which the ray enters the box, so we need only consider faces that the ray can see. Partition the space into 3 areas in each axis
		
		//X - axis and faces x = box.x and x = box.x + box.w
		if(motion.x != 0F)
		{
			if(origin.x < box.x) //Check face x = o.x
			{
				float intersectTime = (box.x - origin.x) / motion.x;
				float intersectY = origin.y + motion.y * intersectTime;
				float intersectZ = origin.z + motion.z * intersectTime;
			//	if(intersectY/1.5 >= box.y && intersectY <= box.y + box.h/1.5 && intersectZ/1.5 >= box.z && intersectZ <= box.z + box.d/1.5)    gold sloth tech
					if(intersectY >= box.y && intersectY <= box.y + box.h && intersectZ >= box.z && intersectZ <= box.z + box.d && intersectTime >= 0) {
						
					return new DriveableHit(driveable, type, intersectTime);
					}
			}
			else if(origin.x > box.x + box.w) //Check face x = o.x + d.x
			{
				float intersectTime = (box.x + box.w - origin.x) / motion.x;
				float intersectY = origin.y + motion.y * intersectTime;
				float intersectZ = origin.z + motion.z * intersectTime;
			//	if(intersectY/1.5 >= box.y && intersectY <= box.y + box.h/1.5 && intersectZ/1.5 >= box.z && intersectZ <= box.z + box.d/1.5)
					if(intersectY >= box.y && intersectY <= box.y + box.h && intersectZ >= box.z && intersectZ <= box.z + box.d && intersectTime >= 0) {
						
					return new DriveableHit(driveable, type, intersectTime);
					}
			}
		}
		
		//Z - axis and faces z = box.z and z = box.z + box.d
		if(motion.z != 0F)
		{
			if(origin.z < box.z) //Check face z = box.z
			{
				float intersectTime = (box.z - origin.z) / motion.z;
				float intersectX = origin.x + motion.x * intersectTime;
				float intersectY = origin.y + motion.y * intersectTime;
		//		if(intersectX/1.5 >= box.x && intersectX <= box.x + box.w/1.5 && intersectY/1.5 >= box.y && intersectY <= box.y + box.h/1.5)
					if(intersectX >= box.x && intersectX <= box.x + box.w && intersectY >= box.y && intersectY <= box.y + box.h && intersectTime >= 0) {
						
					return new DriveableHit(driveable, type, intersectTime);
					}
			}
			else if(origin.z > box.z + box.d) //Check face z = box.z + box.d
			{
				float intersectTime = (box.z + box.d - origin.z) / motion.z;
				float intersectX = origin.x + motion.x * intersectTime;
				float intersectY = origin.y + motion.y * intersectTime;
			//	if(intersectX/1.5 >= box.x && intersectX <= box.x + box.w/1.5 && intersectY/1.5 >= box.y && intersectY <= box.y + box.h/1.5)
				if(intersectX >= box.x && intersectX <= box.x + box.w && intersectY >= box.y && intersectY <= box.y + box.h && intersectTime >= 0) {

					return new DriveableHit(driveable, type, intersectTime);
				}
			}
		}
		
		//Y - axis and faces y = box.y and y = box.y + box.h
		if(motion.y != 0F)
		{
			if(origin.y < box.y) //Check face y = o.y
			{
			//	float intersectTime = (box.y - origin.y);
			//	float intersectX = origin.x * intersectTime;
			//	float intersectZ = origin.z * intersectTime;
			//	if(intersectX/1.5 >= box.x && intersectX <= box.x + box.w/1.5 && intersectZ/1.5 >= box.z && intersectZ <= box.z + box.d/1.5)
				float intersectTime = (box.y - origin.y) / motion.y;
				float intersectX = origin.x + motion.x * intersectTime;
				float intersectZ = origin.z + motion.z * intersectTime;
				if(intersectX >= box.x && intersectX <= box.x + box.w && intersectZ >= box.z && intersectZ <= box.z + box.d && intersectTime >= 0) {
	
					return new DriveableHit(driveable, type, intersectTime);
				}
			}
			else if(origin.y > box.y + box.h) //Check face x = box.y + box.h
			{
			//	float intersectTime = (box.y + box.h - origin.y);
			//	float intersectX = origin.x * intersectTime;
			//	float intersectZ = origin.z * intersectTime;
			//	if(intersectX/1.5 >= box.x && intersectX <= box.x + box.w/1.5 && intersectZ*2 >= box.z && intersectZ <= box.z + box.d/1.5)
				float intersectTime = (box.y + box.h - origin.y) / motion.y;
				float intersectX = origin.x + motion.x * intersectTime;
				float intersectZ = origin.z + motion.z * intersectTime;
				if(intersectX >= box.x && intersectX <= box.x + box.w && intersectZ >= box.z && intersectZ <= box.z + box.d && intersectTime >= 0) {
	
					return new DriveableHit(driveable, type, intersectTime);
				}
			}
		}

		return null;
	}
	//end of forbidden secret of hit detection
	
	
	
	
	//the part that decides the part!!!
	public RidingEntityPosition rayTraceRider(EntityDriveable driveable, CollisionTest tester, boolean evil)
	{
		if(box == null || health <= 0 || dead)
			return null;
		if(!driveable.canHitPart(type))
			return null;

		
		
		double distance = 10;
		Vector3f collisionPoint = new Vector3f(40,0,0);
		int surface = 0;
		//one simple trick to fix protos defective code  allahu ackbar
		if(tester.didCollide)
		{
			//collisionPoint=tester.intersectionPoint;
			return new RidingEntityPosition(collisionPoint.x, collisionPoint.y, collisionPoint.z, 1, distance, this.type);	
		}
		//like wtf proto why didnt you put the did collide checker first
		
		Vector3f pos = new Vector3f(driveable.posX, driveable.posY, driveable.posZ);
		
		RotatedAxes shift = driveable.axes;

		//Define box verticies, where z > 0 is right. See shapeboxes in the toolbox for a visual reference
		Vector3f p1 = shift.findLocalVectorGlobally(new Vector3f(box.x + box.w, box.y + box.h, box.z)); //Front upper left
		Vector3f p2 = shift.findLocalVectorGlobally(new Vector3f(box.x + box.w, box.y + box.h, box.z + box.d)); //Front upper right
		Vector3f p3 = shift.findLocalVectorGlobally(new Vector3f(box.x, box.y + box.h, box.z + box.d)); //Rear upper right
		Vector3f p4 = shift.findLocalVectorGlobally(new Vector3f(box.x, box.y+ box.h, box.z)); //Rear upper left
		Vector3f p5 = shift.findLocalVectorGlobally(new Vector3f(box.x + box.w, box.y, box.z)); //Front lower left
		Vector3f p6 = shift.findLocalVectorGlobally(new Vector3f(box.x + box.w, box.y, box.z + box.d)); //Front lower right
		Vector3f p7 = shift.findLocalVectorGlobally(new Vector3f(box.x, box.y, box.z + box.d)); //Rear lower right
		Vector3f p8 = shift.findLocalVectorGlobally(new Vector3f(box.x, box.y, box.z)); //Rear lower left
		
		//System.out.println("evil: " + evil);
		//if( (type == EnumDriveablePart.turret1) || (type == EnumDriveablePart.turret2) || (type == EnumDriveablePart.turret3) || (type == EnumDriveablePart.turret4) || (type == EnumDriveablePart.turret5))
		if(driveable.type != null && driveable.type.evilGolem && evil)
		{
			//Define box verticies, where z > 0 is right. See shapeboxes in the toolbox for a visual reference
			 p1 = shift.findLocalVectorGlobally(new Vector3f(0, 0, 0)); //Front upper left
			 p2 = shift.findLocalVectorGlobally(new Vector3f(0, 0, 0)); //Front upper left
			 p3 = shift.findLocalVectorGlobally(new Vector3f(0, 0, 0)); //Front upper left
			 p4 = shift.findLocalVectorGlobally(new Vector3f(0, 0, 0)); //Front upper left
			 p5 = shift.findLocalVectorGlobally(new Vector3f(0, 0, 0)); //Front upper left
			 p6 = shift.findLocalVectorGlobally(new Vector3f(0, 0, 0)); //Front upper left
			 p7 = shift.findLocalVectorGlobally(new Vector3f(0, 0, 0)); //Front upper left
			 p8 = shift.findLocalVectorGlobally(new Vector3f(0, 0, 0)); //Front upper left
		}  
		
		if(type == EnumDriveablePart.turret && driveable.seats[0] != null)
		{
			//Define box verticies, where z > 0 is right. See shapeboxes in the toolbox for a visual reference
			p1 = driveable.getPositionOnTurret(new Vector3f(box.x + box.w, box.y + box.h, box.z), false); //Front upper left
			p2 = driveable.getPositionOnTurret(new Vector3f(box.x + box.w, box.y + box.h, box.z + box.d), false); //Front upper right
			p3 = driveable.getPositionOnTurret(new Vector3f(box.x, box.y + box.h, box.z + box.d), false); //Rear upper right
			p4 = driveable.getPositionOnTurret(new Vector3f(box.x, box.y+ box.h, box.z), false); //Rear upper left
			p5 = driveable.getPositionOnTurret(new Vector3f(box.x + box.w, box.y, box.z), false); //Front lower left
			p6 = driveable.getPositionOnTurret(new Vector3f(box.x + box.w, box.y, box.z + box.d), false); //Front lower right
			p7 = driveable.getPositionOnTurret(new Vector3f(box.x, box.y, box.z + box.d), false); //Rear lower right
			p8 = driveable.getPositionOnTurret(new Vector3f(box.x, box.y, box.z), false); //Rear lower left
		}
		
		//Check top face
		double topFaceDist = 100;


			
		tester.checkTriangle(tester, p3, p2, p1);
		if(tester.didCollide && tester.nearestDistance < distance)
		{
			collisionPoint = tester.intersectionPoint;
			surface = 1;
			tester.part = this.type;
		}
			
		tester.checkTriangle(tester, p4, p3, p1);
		if(tester.didCollide && tester.nearestDistance < distance)
		{
			collisionPoint = tester.intersectionPoint;
			surface = 1;
			tester.part = this.type;
		}
		
		if(tester.didCollide){
			tester.isOnTop = true;
			topFaceDist = tester.nearestDistance;
		}
		
		
		//Check front face
		tester.checkTriangle(tester, p1, p2, p6);
		if(tester.didCollide && tester.nearestDistance < distance)
		{
			distance = tester.nearestDistance;
			collisionPoint = tester.intersectionPoint;
			surface = 2;
			tester.part = this.type;
		}
		tester.checkTriangle(tester, p1, p6, p5);
		if(tester.didCollide && tester.nearestDistance < distance)
		{
			distance = tester.nearestDistance;
			collisionPoint = tester.intersectionPoint;
			surface = 2;
			tester.part = this.type;
		}
		
		//Check rear face
		tester.checkTriangle(tester, p3, p4, p8);
		if(tester.didCollide && tester.nearestDistance < distance)
		{
			distance = tester.nearestDistance;
			collisionPoint = tester.intersectionPoint;
			surface = 3;
			tester.part = this.type;
		}
		tester.checkTriangle(tester, p4, p8, p7);
		if(tester.didCollide && tester.nearestDistance < distance)
		{
			distance = tester.nearestDistance;
			collisionPoint = tester.intersectionPoint;
			surface = 3;
			tester.part = this.type;
		}
		
		//Check Left Face
		tester.checkTriangle(tester, p4, p1, p5);
		if(tester.didCollide && tester.nearestDistance < distance)
		{
			distance = tester.nearestDistance;
			collisionPoint = tester.intersectionPoint;
			surface = 4;
			tester.part = this.type;
		}
		tester.checkTriangle(tester, p1, p5, p8);
		if(tester.didCollide && tester.nearestDistance < distance)
		{
			distance = tester.nearestDistance;
			collisionPoint = tester.intersectionPoint;
			surface = 4;
			tester.part = this.type;
		}
		
		//Check right face
		tester.checkTriangle(tester, p2, p3, p7);
		if(tester.didCollide && tester.nearestDistance < distance)
		{
			distance = tester.nearestDistance;
			collisionPoint = tester.intersectionPoint;
			surface = 5;
			tester.part = this.type;
		}
		tester.checkTriangle(tester, p3, p7, p6);
		if(tester.didCollide && tester.nearestDistance < distance)
		{
			distance = tester.nearestDistance;
			collisionPoint = tester.intersectionPoint;
			surface = 5;
			tester.part = this.type;
		}
		
		if(tester.nearestDistance < topFaceDist) tester.isOnTop = false;
		
		if(surface == 1) tester.isOnTop = true;
		/*
		Vector3f.add(p1, pos, p1);
		Vector3f.add(p2, pos, p2);
		Vector3f.add(p3, pos, p3);
		Vector3f.add(p4, pos, p4);
		Vector3f.add(p5, pos, p5);
		Vector3f.add(p6, pos, p6);
		Vector3f.add(p7, pos, p7);
		Vector3f.add(p8, pos, p8);
		
		boolean muff = false;
		String wank = "crit";
		
		if(muff)
		{
			driveable.worldObj.spawnParticle(wank, p1.x,p1.y,p1.z, 0,0,0);
			driveable.worldObj.spawnParticle(wank, p2.x,p2.y,p2.z, 0,0,0);
			driveable.worldObj.spawnParticle(wank, p3.x,p3.y,p3.z, 0,0,0);
			driveable.worldObj.spawnParticle(wank, p4.x,p4.y,p4.z, 0,0,0);
			driveable.worldObj.spawnParticle(wank, p5.x,p5.y,p5.z, 0,0,0);
			driveable.worldObj.spawnParticle(wank, p6.x,p6.y,p6.z, 0,0,0);
			driveable.worldObj.spawnParticle(wank, p7.x,p7.y,p7.z, 0,0,0);
			driveable.worldObj.spawnParticle(wank, p8.x,p8.y,p8.z, 0,0,0);
		}
		**/
		
		if(tester.part==this.type)
		{
			//return new RidingEntityPosition(collisionPoint.x, collisionPoint.y, collisionPoint.z, 1, distance, this.type);
			return null;
		}
		return null;
	}
	
	/** Called when the bullet decided that it hit this driveable part and wants to do damage */
	public void hitByBullet(EntityBullet bullet, DriveableHit hit)
	{
		//prevent doing damage to self or parked planes on your carrier initialized
		EntitySeat parkingSeat = null;
		EntitySeat shooterSeat = null;
		
		//Perform damage code - now with labjac armor system TM
		if(bullet != null )
		{
		
			//suicide prevention part 2
			//assigns parking and shooting seat
			if(hit.driveable != null && hit.driveable.isRiding() && hit.driveable.ridingEntity != null && hit.driveable.ridingEntity instanceof EntitySeat) //checks if this vehicle is parked on carrier
			{
				parkingSeat = (EntitySeat)hit.driveable.ridingEntity; //seat of the carrier you are parked in
				//System.out.println("parking seat: " + parkingSeat);
				
				if (bullet.owner!= null && bullet.owner.isRiding() && bullet.owner.ridingEntity != null && bullet.owner.ridingEntity instanceof EntitySeat) //seat of the vehicle the shooter is riding in
				{
					shooterSeat = (EntitySeat)bullet.owner.ridingEntity;
					//System.out.println("shooterSeat: " + shooterSeat);
				}
			}
			
			
			//checks if parking seat is part of same vehicle shooter is driving  OR   if vehicle shooter is driving IS the same vehicle this hitbox is a part of
			if(shooterSeat != null && parkingSeat != null && shooterSeat.driveable!=null && parkingSeat.driveable!=null && (shooterSeat.driveable == parkingSeat.driveable || shooterSeat.driveable == this.owner) ) 
			{
				//if so, do not damage yourself/your own planes
				System.out.println("Self-damage should have been prevented");
				health -= 0;
			}
			
			else if (hit.driveable != null && hit.driveable.type != null && hit.driveable.type.evilGolem && bullet != null && bullet.evilBullet)
			{
				health -= 0; //evil ai golem do not harm fellow evil ai golems
			}
			
				//otherwise, do normal damage stuff
			else if (hit.driveable.APSdelay <= 0 && bullet.truePen > 30 && (hit.driveable.APSchecker < 3))
			{
				//hit.driveable.APSdelay = (hit.driveable.type).APSdelayMax;
				hit.driveable.APSdelay = hit.driveable.APSmax;
				PacketPlaySound.sendSoundPacket(bullet.posX, bullet.posY, bullet.posZ, 25, 0, bullet.type.APSsound, true);
			}
			

			
			
				
				
			else if(hit.driveable instanceof EntityPlane)
			{
				
				//for shield hit animation
				if (this.type == EnumDriveablePart.shield)
					hit.driveable.shieldHitTimer = 20;
				
				
				if(bullet.isSword && (this.animal==1))
					health -= 0;
				//animal vehicles (horsies elephants) take damage vs living
				else if(this.animal==2)
				{
					health -= (float)bullet.damage * (float)bullet.type.damageVsLiving;
					FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(bullet.posX, bullet.posY, bullet.posZ, 1, "blood"), bullet.posX, bullet.posY, bullet.posZ, 200, 0);	
					FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("flansmod.blood", bullet.posX, bullet.posY+1, bullet.posZ, (float)Math.random()*1, (float)Math.random()*1, -(float)Math.random()*1), bullet.posX, bullet.posY, bullet.posZ, 150, 0);
				}
				//almost pen dents the armor and minor damage
				else if(bullet.truePen<this.armor && (0.9*this.armor)<bullet.truePen && !bullet.isHEAT)
				{
					health -= (float)bullet.damage * (float)bullet.type.damageVsVehicles * (float)bullet.type.barelypenPenalty;
					crew -= (float)(hit.driveable.damageVsCrew)*(float)bullet.damage * (float)bullet.type.damageVsVehicles * (float)bullet.type.barelypenPenalty;
					PacketPlaySound.sendSoundPacket(bullet.posX, bullet.posY, bullet.posZ, 35, 0, bullet.type.minorPenSound, true);
				}
				else if(bullet.truePen<this.compArmor && (0.9*this.compArmor)<bullet.truePen && bullet.isHEAT)
				{
					health -= bullet.damage * (float)bullet.type.damageVsVehicles * (float)bullet.type.barelypenPenalty;
					crew -= (hit.driveable.damageVsCrew)*(float)bullet.damage * (float)bullet.type.damageVsVehicles * (float)bullet.type.barelypenPenalty;
					PacketPlaySound.sendSoundPacket(bullet.posX, bullet.posY, bullet.posZ, 35, 0, bullet.type.minorPenSound, true);
				}

				//no pen zero damage w ricochet noise
				else if((0.9f*(this.armor))>=bullet.truePen && !bullet.isHEAT)
				{
				//health -= (float)bullet.type.nonpenPenalty * (float)bullet.damage;
				PacketPlaySound.sendSoundPacket(bullet.posX, bullet.posY, bullet.posZ, 25, 0, bullet.type.ricochetSound, true);
				}
				else if((0.9f*(this.compArmor))>=bullet.truePen && bullet.isHEAT)
				{
				//health -= (float)bullet.type.nonpenPenalty * (float)bullet.damage;
				PacketPlaySound.sendSoundPacket(bullet.posX, bullet.posY, bullet.posZ, 25, 0, bullet.type.ricochetSound, true);
				}

				
				//normal damage
			else if(bullet.truePen>this.armor && (3*(this.armor))>=bullet.truePen && !bullet.isHEAT)
			{
				health -= (float)bullet.damage * (float)bullet.type.damageVsPlanes;
				crew -= (float)(hit.driveable.damageVsCrew)*(float)bullet.damage * (float)bullet.type.damageVsVehicles;
				PacketPlaySound.sendSoundPacket(bullet.posX, bullet.posY, bullet.posZ, 50, 0, bullet.type.penetrateSound, true);
			}
			else if(bullet.truePen>this.compArmor && (3*(this.compArmor))>=bullet.truePen && bullet.isHEAT)
			{
				health -= (float)bullet.damage * (float)bullet.type.damageVsPlanes;
				crew -= (float)(hit.driveable.damageVsCrew)*(float)bullet.damage * (float)bullet.type.damageVsVehicles;
				PacketPlaySound.sendSoundPacket(bullet.posX, bullet.posY, bullet.posZ, 50, 0, bullet.type.penetrateSound, true);
			}
				
				//overpen penalty
				else if((3*(this.armor))<bullet.truePen  && !bullet.isHEAT)
				{
				health -= (float)bullet.damage * (float)bullet.type.damageVsPlanes * (float)bullet.type.overPenPenalty;
				crew -= (float)(hit.driveable.damageVsCrew)*(float)bullet.damage * (float)bullet.type.damageVsVehicles * (float)bullet.type.overPenPenalty;
				PacketPlaySound.sendSoundPacket(bullet.posX, bullet.posY, bullet.posZ, 50, 0, bullet.type.overPenSound, true);
				}
				else if((3*(this.compArmor))<bullet.truePen  && bullet.isHEAT)
				{
				health -= bullet.damage * (float)bullet.type.damageVsPlanes * (float)bullet.type.overPenPenalty;
				crew -= (float)(hit.driveable.damageVsCrew)*bullet.damage * (float)bullet.type.damageVsVehicles * (float)bullet.type.overPenPenalty;
				PacketPlaySound.sendSoundPacket(bullet.posX, bullet.posY, bullet.posZ, 50, 0, bullet.type.overPenSound, true);
				}
			}


			//not planes
			else
			{
				//for shield hit animation
				if (this.type == EnumDriveablePart.shield)
				{
					hit.driveable.shieldHitTimer = 10;
					FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(bullet.posX, bullet.posY, bullet.posZ, 15, "crit"), bullet.posX, bullet.posY, bullet.posZ, 200, 0);			}
				
				if(bullet.isSword && (this.animal==1))
					health -= 0;
				//animal vehicles (horsies elephants) take damage vs living
				else if(this.animal==2)
				{
					health -= (float)bullet.damage * (float)bullet.type.damageVsLiving;
					FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(bullet.posX, bullet.posY, bullet.posZ, 1, "blood"), bullet.posX, bullet.posY, bullet.posZ, 200, 0);			
					FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("flansmod.blood", bullet.posX, bullet.posY+1, bullet.posZ, (float)Math.random()*1, (float)Math.random()*1, -(float)Math.random()*1), bullet.posX, bullet.posY, bullet.posZ, 150, 0);
					}
				//almost pen dents the armor and minor damage
				else if(bullet.truePen<this.armor && (0.9*(this.armor))<bullet.truePen && !bullet.isHEAT)
				{
					health -= bullet.damage * (float)bullet.type.damageVsVehicles * (float)bullet.type.barelypenPenalty;
					crew -= (float)(hit.driveable.damageVsCrew)*(float)bullet.damage * (float)bullet.type.damageVsVehicles * (float)bullet.type.barelypenPenalty;
					PacketPlaySound.sendSoundPacket(bullet.posX, bullet.posY, bullet.posZ, 35, 0, bullet.type.minorPenSound, true);
					
					float ouch = bullet.damage * (float)bullet.type.damageVsVehicles * (float)bullet.type.barelypenPenalty;
					if (ouch > 2*this.maxHealth && hit.driveable.epicShip && this.maxHealth > 1) //check if overkill damage to intact part
					{
						if(hit.driveable.getDriveableData().parts.get(EnumDriveablePart.bow).maxHealth > 1 && hit.driveable.getDriveableData().parts.get(EnumDriveablePart.left).maxHealth > 1 && hit.driveable.getDriveableData().parts.get(EnumDriveablePart.right).maxHealth > 1 && hit.driveable.getDriveableData().parts.get(EnumDriveablePart.stern).maxHealth > 1)
						{
							hit.driveable.getDriveableData().parts.get(EnumDriveablePart.bow).health -= 0.2*ouch; //do damage to main ship parts
							hit.driveable.getDriveableData().parts.get(EnumDriveablePart.left).health -= 0.2*ouch; //do damage to main ship parts
							hit.driveable.getDriveableData().parts.get(EnumDriveablePart.right).health -= 0.2*ouch; //do damage to main ship parts
							hit.driveable.getDriveableData().parts.get(EnumDriveablePart.stern).health -= 0.2*ouch; //do damage to main ship parts
							if(bullet != null)
							{FlansMod.proxy.spawnParticle("flansmod.tankDeath",
									bullet.posX,
									bullet.posY,
									bullet.posZ,
									0,0,0);
							PacketPlaySound.sendSoundPacket(bullet.posX, bullet.posY, bullet.posZ, 250, bullet.dimension, "explcls6", false);}
						}
					}
					//System.out.println("barely pen part and damage: " + this.type + bullet.damage * (float)bullet.type.damageVsVehicles * (float)bullet.type.barelypenPenalty);

				}				
				else if(bullet.isHEAT && bullet.truePen<this.compArmor && (0.9*(this.compArmor))<bullet.truePen)
				{
					health -= bullet.damage * (float)bullet.type.damageVsVehicles * (float)bullet.type.barelypenPenalty;
					crew -= (float)(hit.driveable.damageVsCrew)*(float)bullet.damage * (float)bullet.type.damageVsVehicles * (float)bullet.type.barelypenPenalty;
					PacketPlaySound.sendSoundPacket(bullet.posX, bullet.posY, bullet.posZ, 35, 0, bullet.type.minorPenSound, true);
					
					float ouch = bullet.damage * (float)bullet.type.damageVsVehicles * (float)bullet.type.barelypenPenalty;
					if (ouch > 2*this.maxHealth && hit.driveable.epicShip && this.maxHealth > 1) //check if overkill damage to intact part
					{
						if(hit.driveable.getDriveableData().parts.get(EnumDriveablePart.bow).maxHealth > 1 && hit.driveable.getDriveableData().parts.get(EnumDriveablePart.left).maxHealth > 1 && hit.driveable.getDriveableData().parts.get(EnumDriveablePart.right).maxHealth > 1 && hit.driveable.getDriveableData().parts.get(EnumDriveablePart.stern).maxHealth > 1)
						{
							hit.driveable.getDriveableData().parts.get(EnumDriveablePart.bow).health -= 0.2*ouch; //do damage to main ship parts
							hit.driveable.getDriveableData().parts.get(EnumDriveablePart.left).health -= 0.2*ouch; //do damage to main ship parts
							hit.driveable.getDriveableData().parts.get(EnumDriveablePart.right).health -= 0.2*ouch; //do damage to main ship parts
							hit.driveable.getDriveableData().parts.get(EnumDriveablePart.stern).health -= 0.2*ouch; //do damage to main ship parts
							if(bullet != null)
							{FlansMod.proxy.spawnParticle("flansmod.tankDeath",
									bullet.posX,
									bullet.posY,
									bullet.posZ,
									0,0,0);
							PacketPlaySound.sendSoundPacket(bullet.posX, bullet.posY, bullet.posZ, 250, bullet.dimension, "explcls6", false);}
						}
					}
				//	System.out.println("barely pen HEAT part and damage: " + this.type + bullet.damage * (float)bullet.type.damageVsVehicles * (float)bullet.type.barelypenPenalty);
				}
					
					
				
				//no pen zero damage w ricochet noise
					else if((0.9f*(this.armor))>=bullet.truePen && !bullet.isHEAT)
					{
				//	health -= (float)bullet.type.nonpenPenalty * (float)bullet.damage; xdddd commented out to make sure non pen is 0 damage
				PacketPlaySound.sendSoundPacket(bullet.posX, bullet.posY, bullet.posZ, 25, 0, bullet.type.ricochetSound, true);
				FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(bullet.posX, bullet.posY, bullet.posZ, 1, "crit"), bullet.posX, bullet.posY, bullet.posZ, 200, 0);
				//System.out.println("non pen part " + this.type );
					}
					else if((0.9f*(this.compArmor))>=bullet.truePen && bullet.isHEAT)
					{
					//health -= (float)bullet.type.nonpenPenalty * (float)bullet.damage;
				PacketPlaySound.sendSoundPacket(bullet.posX, bullet.posY, bullet.posZ, 25, 0, bullet.type.ricochetSound, true);
				FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(bullet.posX, bullet.posY, bullet.posZ, 1, "crit"), bullet.posX, bullet.posY, bullet.posZ, 200, 0);
				//System.out.println("HEAT non pen part " + this.type );
					}
				

					
					//normal damage
				else if(bullet.truePen>this.armor && (3*(this.armor))>=bullet.truePen && !bullet.isHEAT)
				{
					health -= bullet.damage * (float)bullet.type.damageVsVehicles;
					crew -= (float)(hit.driveable.damageVsCrew)*(float)bullet.damage * (float)bullet.type.damageVsVehicles;
					PacketPlaySound.sendSoundPacket(bullet.posX, bullet.posY, bullet.posZ, 50, 0, bullet.type.penetrateSound, true);
				//	System.out.println("normal part and damage: " + this.type + bullet.damage * (float)bullet.type.damageVsVehicles );
					
					float ouch = bullet.damage * (float)bullet.type.damageVsVehicles;
					if (ouch > 2*this.maxHealth && hit.driveable.epicShip && this.maxHealth > 1) //check if overkill damage to intact part
					{
						if(hit.driveable.getDriveableData().parts.get(EnumDriveablePart.bow).maxHealth > 1 && hit.driveable.getDriveableData().parts.get(EnumDriveablePart.left).maxHealth > 1 && hit.driveable.getDriveableData().parts.get(EnumDriveablePart.right).maxHealth > 1 && hit.driveable.getDriveableData().parts.get(EnumDriveablePart.stern).maxHealth > 1)
						{
							hit.driveable.getDriveableData().parts.get(EnumDriveablePart.bow).health -= 0.2*ouch; //do damage to main ship parts
							hit.driveable.getDriveableData().parts.get(EnumDriveablePart.left).health -= 0.2*ouch; //do damage to main ship parts
							hit.driveable.getDriveableData().parts.get(EnumDriveablePart.right).health -= 0.2*ouch; //do damage to main ship parts
							hit.driveable.getDriveableData().parts.get(EnumDriveablePart.stern).health -= 0.2*ouch; //do damage to main ship parts
							if(bullet != null)
							{FlansMod.proxy.spawnParticle("flansmod.tankDeath",
									bullet.posX,
									bullet.posY,
									bullet.posZ,
									0,0,0);
							PacketPlaySound.sendSoundPacket(bullet.posX, bullet.posY, bullet.posZ, 250, bullet.dimension, "explcls6", false);}
						}
					}
				}
				else if(bullet.truePen>this.armor && (3*(this.compArmor))>=bullet.truePen && bullet.isHEAT)
				{
					health -= bullet.damage * (float)bullet.type.damageVsVehicles;
					crew -= (float)(hit.driveable.damageVsCrew)*(float)bullet.damage * (float)bullet.type.damageVsVehicles;
					PacketPlaySound.sendSoundPacket(bullet.posX, bullet.posY, bullet.posZ, 50, 0, bullet.type.penetrateSound, true);
				//	System.out.println("HEAT normal part and damage: " + this.type + bullet.damage * (float)bullet.type.damageVsVehicles );
					
					float ouch = bullet.damage * (float)bullet.type.damageVsVehicles;
					if (ouch > 2*this.maxHealth && hit.driveable.epicShip && this.maxHealth > 1) //check if overkill damage to intact part
					{
						if(hit.driveable.getDriveableData().parts.get(EnumDriveablePart.bow).maxHealth > 1 && hit.driveable.getDriveableData().parts.get(EnumDriveablePart.left).maxHealth > 1 && hit.driveable.getDriveableData().parts.get(EnumDriveablePart.right).maxHealth > 1 && hit.driveable.getDriveableData().parts.get(EnumDriveablePart.stern).maxHealth > 1)
						{
							hit.driveable.getDriveableData().parts.get(EnumDriveablePart.bow).health -= 0.2*ouch; //do damage to main ship parts
							hit.driveable.getDriveableData().parts.get(EnumDriveablePart.left).health -= 0.2*ouch; //do damage to main ship parts
							hit.driveable.getDriveableData().parts.get(EnumDriveablePart.right).health -= 0.2*ouch; //do damage to main ship parts
							hit.driveable.getDriveableData().parts.get(EnumDriveablePart.stern).health -= 0.2*ouch; //do damage to main ship parts
							if(bullet != null)
							{FlansMod.proxy.spawnParticle("flansmod.tankDeath",
									bullet.posX,
									bullet.posY,
									bullet.posZ,
									0,0,0);
							PacketPlaySound.sendSoundPacket(bullet.posX, bullet.posY, bullet.posZ, 250, bullet.dimension, "explcls6", false);}
						}
					}
				}
			
					//overpen penalty
					else if((3*(this.armor))<bullet.truePen && !bullet.isHEAT)
					{
					health -= bullet.damage * (float)bullet.type.damageVsVehicles * (float)bullet.type.overPenPenalty;
					crew -= (float)(hit.driveable.damageVsCrew)*(float)bullet.damage * (float)bullet.type.damageVsVehicles * (float)bullet.type.overPenPenalty;
					PacketPlaySound.sendSoundPacket(bullet.posX, bullet.posY, bullet.posZ, 50, 0, bullet.type.overPenSound, true);
				//	System.out.println("overpen part and damage: " + this.type + bullet.damage * (float)bullet.type.damageVsVehicles * (float)bullet.type.overPenPenalty);
					
					float ouch = bullet.damage * (float)bullet.type.damageVsVehicles * (float)bullet.type.overPenPenalty;
					if (ouch > 2*this.maxHealth && hit.driveable.epicShip && this.maxHealth > 1) //check if overkill damage to intact part
					{
						if(hit.driveable.getDriveableData().parts.get(EnumDriveablePart.bow).maxHealth > 1 && hit.driveable.getDriveableData().parts.get(EnumDriveablePart.left).maxHealth > 1 && hit.driveable.getDriveableData().parts.get(EnumDriveablePart.right).maxHealth > 1 && hit.driveable.getDriveableData().parts.get(EnumDriveablePart.stern).maxHealth > 1)
						{
							hit.driveable.getDriveableData().parts.get(EnumDriveablePart.bow).health -= 0.2*ouch; //do damage to main ship parts
							hit.driveable.getDriveableData().parts.get(EnumDriveablePart.left).health -= 0.2*ouch; //do damage to main ship parts
							hit.driveable.getDriveableData().parts.get(EnumDriveablePart.right).health -= 0.2*ouch; //do damage to main ship parts
							hit.driveable.getDriveableData().parts.get(EnumDriveablePart.stern).health -= 0.2*ouch; //do damage to main ship parts
							if(bullet != null)
							{FlansMod.proxy.spawnParticle("flansmod.tankDeath",
									bullet.posX,
									bullet.posY,
									bullet.posZ,
									0,0,0);
							PacketPlaySound.sendSoundPacket(bullet.posX, bullet.posY, bullet.posZ, 250, bullet.dimension, "explcls6", false);}
						}
					}
					}
					else if((3*(this.compArmor))<bullet.truePen && bullet.isHEAT)
					{
					health -= bullet.damage * (float)bullet.type.damageVsVehicles * (float)bullet.type.overPenPenalty;
					crew -= ((float)hit.driveable.damageVsCrew)*(float)bullet.damage * (float)bullet.type.damageVsVehicles * (float)bullet.type.overPenPenalty;
					PacketPlaySound.sendSoundPacket(bullet.posX, bullet.posY, bullet.posZ, 50, 0, bullet.type.overPenSound, true);
				//	System.out.println("HEAT overpen part and damage: " + this.type + bullet.damage * (float)bullet.type.damageVsVehicles * (float)bullet.type.overPenPenalty);
					
					float ouch = bullet.damage * (float)bullet.type.damageVsVehicles * (float)bullet.type.overPenPenalty;
					if (ouch > 2*this.maxHealth && hit.driveable.epicShip && this.maxHealth > 1) //check if overkill damage to intact part
					{
						if(hit.driveable.getDriveableData().parts.get(EnumDriveablePart.bow).maxHealth > 1 && hit.driveable.getDriveableData().parts.get(EnumDriveablePart.left).maxHealth > 1 && hit.driveable.getDriveableData().parts.get(EnumDriveablePart.right).maxHealth > 1 && hit.driveable.getDriveableData().parts.get(EnumDriveablePart.stern).maxHealth > 1)
						{
							hit.driveable.getDriveableData().parts.get(EnumDriveablePart.bow).health -= 0.2*ouch; //do damage to main ship parts
							hit.driveable.getDriveableData().parts.get(EnumDriveablePart.left).health -= 0.2*ouch; //do damage to main ship parts
							hit.driveable.getDriveableData().parts.get(EnumDriveablePart.right).health -= 0.2*ouch; //do damage to main ship parts
							hit.driveable.getDriveableData().parts.get(EnumDriveablePart.stern).health -= 0.2*ouch; //do damage to main ship parts
							if(bullet != null)
							{FlansMod.proxy.spawnParticle("flansmod.tankDeath",
									bullet.posX,
									bullet.posY,
									bullet.posZ,
									0,0,0);
							PacketPlaySound.sendSoundPacket(bullet.posX, bullet.posY, bullet.posZ, 250, bullet.dimension, "explcls6", false);}
						}
					}
					}

			}
			if(bullet.type.setEntitiesOnFire)
			{
				fireTime = 20;
				onFire = true;
			}
		}
	}
	
	/** Ray traces a single co-ordinate 
	 * But only returns true once upon entering the box, and not while in or exiting
	 * @param start The start of the ray in this co-ordinate 
	 * @param end The end of the ray in this co-ordinate
	 * @param min The start of the box in this co-ordinate
	 * @param max The end of the box in this co-ordinate 
	 * @return true if the ray hits in this co-ordinate */
	private static boolean coordIsEntering(float start, float end, float min, float max)
	{
		//Check to see if ray entered from the left hand side
		if(start < min && end >= min)
			return true;
		//Check to see if ray entered from the right hand side
		if(start > max && end <= max)
			return true;
		return false;	
	}
	
	/** Ray traces a single co-ordinate 
	 * Returns true if the ray is in the bounds at some point along its length
	 * @param start The start of the ray in this co-ordinate 
	 * @param end The end of the ray in this co-ordinate
	 * @param min The start of the box in this co-ordinate
	 * @param max The end of the box in this co-ordinate 
	 * @return true if the ray hits in this co-ordinate */
	private static boolean coordIsIn(float start, float end, float min, float max)
	{
		//Check to see if the start point is in
		if(start >= min && start <= max)
			return true;
		//Check to see if the end point is in
		if(end >= min && end <= max)
			return true;
		//Check to see if the start and end points are either side of the interval
		if(start < min && end > max)
			return true;
		if(end < min && start > max)
			return true;
		return false;	
	}

	public boolean attack(float damage, boolean fireDamage) 
	{
		//oh lol commenting this out is why all attackparts broke xddd but fuck now fire stuff magic
		health -= damage;
		if(fireDamage)
		{			
			//fuck you fire damage mk 2
			fireTime = 0;
			onFire = false;
		}
		if(health<0)
		{
			health = 0;
		}
		return health <= 0;
	}
}
