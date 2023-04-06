/*
 * Decompiled with CFR 0_123.
 */
package com.flansmod.common.driveables;

import com.flansmod.common.FlansMod;
import com.flansmod.common.RotatedAxes;
import com.flansmod.common.driveables.DriveableData;
import com.flansmod.common.driveables.EntityPlane;
import com.flansmod.common.driveables.EnumDriveablePart;
import com.flansmod.common.driveables.EnumPlaneMode;
import com.flansmod.common.driveables.PlaneType;
import com.flansmod.common.driveables.Propeller;
import com.flansmod.common.network.PacketParticle;
import com.flansmod.common.parts.PartType;
import com.flansmod.common.vector.Vector;
import com.flansmod.common.vector.Vector3f;
import java.util.ArrayList;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;

public class FlightController {
	public boolean leftWing = true;
	public boolean rightWing = true;
	public boolean tail = true;
    public float throttle;
    public float yawControl;
    public float pitchControl;
    public float rollControl;
    public EnumPlaneMode mode;
    public float gravity = 1.0f;
    public float drag = 0.0f;
    public float dragerino = 5.0f;
    public float thrust = 0.0f;
    public float lift = 0.0f;	//jamio variable i might repurpose
    public float V = 0f;  //plane thrust/drag velocity
    public float T = 0f;	//plane thrust force
    public float Vh = 0f; //vertical velocity
    public float stallMS = 0; //stall speed m/s
    public float Lc = 0; //lift coefficient
    public float Lcc = 0; //correction lift coefficient to force rate of climb to be true
    public float Gfactor = 1;
    public float speedBleedGrace = 0;
    public Vector3f angularMomentum = new Vector3f(0.0f, 0.0f, 0.0f);
	private Object mounted;
	
	public float acceleration;

	public float doomsday = 0;
	
    public void UpdateParams(EntityPlane plane) {
        this.throttle = plane.throttle;
        this.yawControl = plane.flapsYaw;
        this.pitchControl = (plane.flapsPitchLeft + plane.flapsPitchRight) / 2.0f;
        this.rollControl = (plane.flapsPitchRight - plane.flapsPitchLeft) / 2.0f;
        this.mode = plane.mode;
    }

    public void fly(EntityPlane plane) {
        PlaneType type = plane.getPlaneType();
        DriveableData data = plane.getDriveableData();
        this.UpdateParams(plane);
        this.SetAxes(plane);

       // this.thrust = 0.01f * (type.maxThrottle + (data.engine == null ? 0.0f : data.engine.engineSpeed));
        this.thrust = 0.01f * (0.85f + (data.engine == null ? 0.0f : 2.5f));
        
        
        //convert takeoff speed to m*tric system
        this.stallMS = 0.44704f*type.takeoffSpeed;
  
        //lift coefficient
        this.Lc = (float) ((9.8*type.mass)/(stallMS*stallMS));
        
        //corrective lift coefficient
        this.Lcc = (float) ((Lc*(0.44704f*type.maxSpeed*0.44704f*type.maxSpeed) - type.mass * 9.8) / (type.climbRate*type.climbRate));

        this.gravity = 0.098000005f;
        //this.drag = 1.0f - 0.05f * type.drag;   replace type.drag with drag velocity system TM
        
        switch (this.mode) {
            case PLANE: {
                this.PlaneModeFly(plane);
            }
            case HELI: {
                this.HeliModeFly(plane);
                this.drag = 1.0f - 0.05f * type.drag; 
            }
		default:
			break;
        }
    }

    public void SetAxes(EntityPlane plane) {
        float sensitivityAdjust;
        float sensitivityAdjustYaw;
        PlaneType type = plane.getPlaneType();
        
       // float labjacTickSpeed = (float) (1.0f * Math.exp(0.487708*((this.V * 2.23694f)/767))); classic jet formula
        float labjacTickSpeed = (float) (0.5f * Math.exp(2.25*((this.V * 2.23694f)/767)));     //ww2 formula
        //threw in abs to prevent control switch
      //  float f = sensitivityAdjust = Math.abs((float)plane.getSpeedXYZ() / 2.0f > 0.5f ? 1.5f - (float)plane.getSpeedXYZ() / 2.0f : 4.0f * (float)plane.getSpeedXYZ() / 2.0f - 1.0f);
        //yaw control should be able to work before takeoff lift happens
        float f = sensitivityAdjustYaw = (this.V*2.23694f ) / (type.maxSpeed/1.2f ) > 0.5f ? 0.5f : (this.V*2.23694f ) / (type.maxSpeed/1.2f);
        
        if(plane.mounted || this.V * 2.23694f < 20 )
        	sensitivityAdjustYaw = 0.3f;	//be able to turn around on carrier deck and taxi below 20mph
        
        if(this.mode == EnumPlaneMode.HELI && throttle > 0.3) //unfuck heli and vtol yaw
        	sensitivityAdjustYaw = this.throttle > 0.5f ? 1.5f - this.throttle : 4.0f * this.throttle - 1.0f;
        
        float f3 = sensitivityAdjust = ((this.V*2.23694f - type.takeoffSpeed)/3f) / ((type.maxSpeed - type.takeoffSpeed)/2f) > 0.2f ? 0.2f : ((this.V*2.23694f - type.takeoffSpeed)/3f) / ((type.maxSpeed - type.takeoffSpeed)/2f);
       // float f = sensitivityAdjust = Math.abs((float)labjacTickSpeed / 2.0f > 0.5f ? 1.5f - (float)labjacTickSpeed / 2.0f : 4.0f * (float)labjacTickSpeed / 2.0f - 1.0f);
        if(this.V * 2.23694f < type.takeoffSpeed)
        	sensitivityAdjust = 0;
        //float f3 = sensitivityAdjustYaw = Math.abs((float)labjacTickSpeed / 2.0f > 0.5f ? 1.5f - (float)labjacTickSpeed / 2.0f : 4.0f * (float)labjacTickSpeed / 2.0f - 1.0f);
      
  
        if (this.mode == EnumPlaneMode.HELI) {
        	this.drag = 1.0f - 0.05f * type.drag;  //again just to be sure for drag
            float f2 = sensitivityAdjust = this.throttle > 0.5f ? 1.5f - this.throttle : 4.0f * this.throttle - 1.0f;
        }
        if ((double)((float)plane.getSpeedXYZ()) < 0.5 && sensitivityAdjust < -0.1f) {
            sensitivityAdjust = 0.1f;
        }
        
        float rollerino = 0;
        float pitcherino = 0;
        
        
       float wingLoad = plane.getPlaneType().mass/plane.getPlaneType().area;
        //multiple maneuvrability formulas
        
        //ufo formula for 0-99 wingload - logistic growth reaches 3.5 ufo turning very fast
        float agilityU = 0;
    	float sneed = 7/(plane.getPlaneType().maxSpeed/1.5f); //variable that makes it not "reach" 3.5 maneuvrability until 0.666 to your max speed
    	//dill nerf: did 0.1f +   0.35x(math) so at least 0.1 maneuver, but maximum is 1.225 instead of 3.5
        
        if (this.V*2.23694f < plane.getPlaneType().maxSpeed/1.5f && this.V*2.23694f > 1 && wingLoad < 100)
        {
        	agilityU =  (float) (0.1f + 0.5f*(-3.5f + 7/( 1 +Math.exp(-sneed*this.V*2.23694f) ))); //logistical growth  and dill nerf
        }
        else if (this.V*2.23694f >= plane.getPlaneType().maxSpeed/1.5f && this.V*2.23694f < plane.getPlaneType().maxSpeed/0.75f && this.V*2.23694f > 1 && wingLoad < 100)
        {
        	agilityU = (float) (0.1f + 0.5f*(3.5f - 7/(1 + Math.exp(-sneed*(this.V*2.23694f-plane.getPlaneType().maxSpeed*1.333f)) ) ) );  //logistical decay and dill nerf
        }
        else agilityU = 0;
        //System.out.println("ufo agility from 0 to 3.5 :" + agilityS);
        
        //2nd tier agility, for 100-199 wingload - parabolic curve to 3.25
        float agilityS = 0;
        float feed = 0; //a coefficient for quadratic formula
        if (this.V > 0 && wingLoad >= 0 && wingLoad < 200 && this.V <= plane.getPlaneType().maxSpeed/0.75f)
        {
        	feed = 3.25f / ((plane.getPlaneType().maxSpeed/1.5f)*(plane.getPlaneType().maxSpeed/1.5f));
        	agilityS = (float) 0.1f + 0.5f*3.25f - (feed * (this.V*2.23694f - plane.getPlaneType().maxSpeed/1.5f)*(this.V*2.23694f - plane.getPlaneType().maxSpeed/1.5f) ); //with 0.1f + 0.33*stuff dill nerf
        }
        else agilityS = 0;
        //System.out.println("ssr agility from 0 to 3.5 :" + agilityS);
        
        
        //3rd rate agility, for 200-299 wingload - linear "curve" to 3 then back down to 0
        float agilityE = 0;
        if (this.V*2.23694f < plane.getPlaneType().maxSpeed/1.5f && this.V > 0 && wingLoad >= 100 && wingLoad < 300)
        {
        	agilityE = 0.1f + (0.3f * 3*this.V*2.23694f)/(plane.getPlaneType().maxSpeed/1.5f); //with 0.1f + 0.3*stuff dill nerf
        }
        else if (this.V*2.23694f >= plane.getPlaneType().maxSpeed/1.5f && this.V*2.23694f < plane.getPlaneType().maxSpeed/0.75f && wingLoad >= 100 && wingLoad < 300)
        {
        	agilityE = 0.1f + 0.5f*(3 - (3*(this.V*2.23694f-plane.getPlaneType().maxSpeed/1.5f))/(plane.getPlaneType().maxSpeed/1.5f)); //with 0.1f + 0.3*stuff dill nerf
        }
        else agilityE = 0;
       // System.out.println("elite agility from 0 to 3 :" + agilityE);
        
        
        //4th rate brick agility, 300+ wingload - linear curve to 2 then back to 0
        float agilityR = 0;
        if (this.V*2.23694f < plane.getPlaneType().maxSpeed/1.5f && this.V > 0 && wingLoad >= 200)
        {
        	agilityR = 0.05f + 0.5f*(2*this.V*2.23694f)/(plane.getPlaneType().maxSpeed/1.5f); //with 0.05 + 0.3x dill nerf
        }
        else if (this.V*2.23694f >= plane.getPlaneType().maxSpeed/1.5f && this.V*2.23694f < plane.getPlaneType().maxSpeed/0.75f && wingLoad >= 200)
        {
        	agilityR = 0.05f + 0.5f*(2 - (2*(this.V*2.23694f-plane.getPlaneType().maxSpeed/1.5f))/(plane.getPlaneType().maxSpeed/1.5f));  //with 0.05 + 0.3x dill nerf
        }
        else agilityR = 0;
        
        //more advanced agility formula integration
        float agility = 0;
        
        if(wingLoad < 100)  //the 0.69f* is a universal nerf since i made it too op
        	agility = 0.69f* agilityU * wingLoad/100 + agilityS * (1-wingLoad/100);
        else if(wingLoad >= 100 && wingLoad < 200)
        	agility = 0.69f* agilityS * ((wingLoad-100)/100) + agilityE* (1-((wingLoad-100)/100));
        else if(wingLoad >= 200 && wingLoad < 300)
        	agility = 0.69f* agilityS * ((wingLoad-200)/100) + agilityE* (1-((wingLoad-200)/100));
        
        //have a minimum level of agility
        if(agility<0.2f)
         agility = 0.2f;
        
        float lowpowerAgility = 0;
        
        
        float power = plane.getPlaneType().maxSpeed * plane.getPlaneType().maxSpeed / plane.getPlaneType().mass; //bastardized power to weight equivalent from 3 for heavy bombers to 200 for f-15
        
        //if power less than 100, apply a universal agility penalty
        if(power*throttle < 100)
        {
        	lowpowerAgility = agility*0.5f + (agility*0.5f)*(throttle*power/100);
        	if(lowpowerAgility<0.2f)
        		lowpowerAgility = 0.2f;
        }
        else
        	lowpowerAgility = 0;
        
        //System.out.println("agility :" + agility);
        //System.out.println("wingLoad :" + wingLoad);
        
        /*
        //shitty "formula" to "fit" turn configs to a turn time
        if(type.turnTime > 0)
        {
        	pitcherino = (float) (7.754f * Math.exp(-0.464f * type.turnTime));
        	rollerino = (float) (7.754f * Math.exp(-0.464f * type.turnTime)) / 1.25f;
        	//System.out.println("pitcherino :" + pitcherino);
        	if(rollerino <= 0)
        		rollerino = 0.01f;
        	if(pitcherino <= 0)
        		pitcherino = 0.01f;
        	
        }
        */
        

        float yaw = 0;
        float roll = 0;
        float pitch = 0;

        //energy meter tm

        //higher energy = plane can maintain a higher agility when out of extra energy from sheer engine power "burning through a turn"
      //  float penalty = 6 - 3.5f*(power/200); //high power leads to only divided by 2.5, horrible power means divided by 6
        float penalty = 3 - 1.5f*(power/200); //nerfed the penalty because dill made ufo mode unfun     now min penalty is /1.5  max is /3
        
        //speed bleed
        if (Math.abs(this.yawControl) > 0.1f && this.V > 0)
        {
        	if (speedBleedGrace < power)
        		speedBleedGrace += 0.2f*(0.05f*Math.abs(this.yawControl)); //the 0.2f is an extra buff so more grace period because dill made ufo mode unfun
        	
        	if (speedBleedGrace > power/4)
        	{
        	 this.V = (this.V/(1 + ( 7*((speedBleedGrace-power/4)/(power*0.75f)) ) *this.V*this.V/(0.7f*type.mass*type.mass))); //speed bleed
        	 if(lowpowerAgility > 0)
        		 lowpowerAgility *= (0.99f - 0.7f*((speedBleedGrace-power/penalty)/(power*.75f))*0.55f); //the 0.7f* in front of all the speedbleedgraces = a nerf so energy loss less powerful, compensate for dill nerfs
        	 else
        		 agility *= (0.99f - 0.7f*((speedBleedGrace-power/penalty)/(power*.75f))*0.55f); 
        	}
        	else
        		this.V *= 0.999f;
        }
        else if (Math.abs(pitchControl) > 0.1f && this.V > 0)
        {
        	if (speedBleedGrace < power)
        		speedBleedGrace += 0.2f*(0.05f*Math.abs(this.pitchControl));
        	
        	if (speedBleedGrace > power/4)
        	{
           	 this.V = (this.V/(1 + ( 7*((speedBleedGrace-power/4)/(power*0.75f)) ) *this.V*this.V/(0.7f*type.mass*type.mass))); //speed bleed
           	 if(lowpowerAgility > 0)
           		lowpowerAgility *= (0.99f - 0.7f*((speedBleedGrace-power/penalty)/(power*.75f))*0.55f); 
        	 else
        		 agility *= (0.99f - 0.7f*((speedBleedGrace-power/penalty)/(power*.75f))*0.55f); 
        	}
        	else
        		this.V *= 0.999f;
        }
        else if (Math.abs(rollControl) > 0.1f && this.V > 0)
        {
        	if (speedBleedGrace < power)
        		speedBleedGrace += 0.2f*(0.05f*Math.abs(this.rollControl));
        	
        	if (speedBleedGrace > power/4)
        	{
           	 this.V = (this.V/(1 + ( 7*((speedBleedGrace-power/4)/(power*0.75f)) ) *this.V*this.V/(0.7f*type.mass*type.mass))); //speed bleed
           	 if(lowpowerAgility > 0)
           		lowpowerAgility *= (0.99f - 0.7f*((speedBleedGrace-power/penalty)/(power*.75f))*0.55f); 
        	 else
        		 agility *= (0.99f - 0.7f*((speedBleedGrace-power/penalty)/(power*.75f))*0.55f); 
        	}
        	else
        		this.V *= 0.999f;
        }
        else if (speedBleedGrace > 0)
        {
        	speedBleedGrace -= 0.5f*throttle; //reset the speed bleed grace timer faster if not maneuvering
        }
        
         if (speedBleedGrace > 0)
        {
        	 speedBleedGrace -= 0.01f + (0.04f*throttle);
        	
        }
         
         

         
         if(Gfactor > 5)
         {
        	 agility *= 0.99f;
        	 lowpowerAgility *= 0.99f;
         }
         
         if(Gfactor > 6)
         {
        	 agility *= 0.98f;
        	 lowpowerAgility *= 0.98f;

         }
         
         if(Gfactor > 7)
         {
        	 agility *= 0.9f;
        	 lowpowerAgility *= 0.9f;
         }
         
         if(Gfactor > 10 && plane.isPartIntact(EnumDriveablePart.airframe))
         {
        	 agility *= 0.8f;
        	 lowpowerAgility *= 0.8f;
        	 
         		float hullDamage = 1 + Gfactor * 0.0015f*(plane.getDriveableData().parts.get(EnumDriveablePart.airframe).maxHealth);
         		plane.attackPart(EnumDriveablePart.airframe, DamageSource.cactus, hullDamage);	
        		FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("largeexplode",plane.posX, plane.posY+1, plane.posZ , 0,0,0),plane.posX, plane.posY , plane.posZ, 150, plane.dimension);       		  
         }
         
         
         if(lowpowerAgility > 0)
         {
             yaw = this.yawControl * (this.yawControl > 0.0f ? ((float)type.yawBoost*lowpowerAgility*((float)1)) : (type.yawBoost*lowpowerAgility*((float)1))) * (sensitivityAdjustYaw *= 0.5f);
             roll = this.rollControl * (this.rollControl > 0.0f ? ((float)type.rollBoost*lowpowerAgility*((float)1)) : (type.rollBoost*lowpowerAgility*((float)1))) * sensitivityAdjust;
             pitch = this.pitchControl * (this.pitchControl > 0.0f ? ((float)type.pitchBoost*lowpowerAgility*((float)1)) : (type.pitchBoost*lowpowerAgility*((float)1))) * sensitivityAdjust;
         }
             else
             {
         yaw = this.yawControl * (this.yawControl > 0.0f ? ((float)type.yawBoost*agility*((float)1)) : (type.yawBoost*agility*((float)1))) * (sensitivityAdjustYaw *= 0.5f);
         roll = this.rollControl * (this.rollControl > 0.0f ? ((float)type.rollBoost*agility*((float)1)) : (type.rollBoost*agility*((float)1))) * sensitivityAdjust;
         pitch = this.pitchControl * (this.pitchControl > 0.0f ? ((float)type.pitchBoost*agility*((float)1)) : (type.pitchBoost*agility*((float)1))) * sensitivityAdjust;
         
         //System.out.println("pitch: " + this.pitchControl + "   agility: " + agility + "  sensitivityAdjust: " + sensitivityAdjust + "   final pitch: " + pitch);
             }
         
         

        
         //bookmark for g overload
         float turnRate = ( 0.35f*Math.abs(yaw) + 0.4f*Math.abs(roll) + 0.9f*Math.abs(pitch) )/5; 
         this.Gfactor = this.V*1.5f*turnRate/18 + 1; //the x1.5 is to account for dill nerfs
        
        
        
        //when almost at flight ceiling, begin pitching down
        if((float)plane.axes.getPitch() < 0 && (plane.posY > (type.ceiling-10f)))
        {
        	plane.axes.rotateLocalPitch(-1f);
        }
        
             
             //  if (plane.axes.getPitch() <= 60.0f && plane.getSpeedXYZ() < 0.2 && this.mode == EnumPlaneMode.PLANE && this.throttle >= 0.1f) {
      //      pitch = -1.0f;
   //     }
        
        if (this.mode == EnumPlaneMode.PLANE) {
        		if (!plane.isPartIntact(EnumDriveablePart.tail)) {
        			if (plane.isInWater())
        				plane.attackPart(EnumDriveablePart.core, DamageSource.cactus, 10);	
        		}
                if (!plane.isPartIntact(EnumDriveablePart.nose)) {

        			//if lost airworthiness and plane drowned, then die
        			if (plane.isInWater())
        				plane.attackPart(EnumDriveablePart.core, DamageSource.cactus, 10);	
        			
                    }
                if (!plane.isPartIntact(EnumDriveablePart.tail)) {

        			//if lost airworthiness and plane drowned, then die
        			if (plane.isInWater())
        				plane.attackPart(EnumDriveablePart.core, DamageSource.cactus, 10);	
                    }
            if (!plane.isPartIntact(EnumDriveablePart.leftWing)) {

    			//if lost airworthiness and plane drowned, then die
    			if (plane.isInWater())
    				plane.attackPart(EnumDriveablePart.core, DamageSource.cactus, 10);	
            }
            if (!plane.isPartIntact(EnumDriveablePart.rightWing)) {

    			//if lost airworthiness and plane drowned, then die
    			if (plane.isInWater())
    				plane.attackPart(EnumDriveablePart.core, DamageSource.cactus, 10);	
            }
        } else if (this.mode == EnumPlaneMode.HELI && !plane.isPartIntact(EnumDriveablePart.tail)) {
            yaw = 25.0f * this.throttle;
            roll = 5.0f * this.throttle;         
            plane.motionY += -gravity;
          //if lost airworthiness and plane drowned, then die
			if (plane.isInWater())
				plane.attackPart(EnumDriveablePart.core, DamageSource.cactus, 10);	
        }
        
        if(!plane.mounted)
        {
        this.angularMomentum.x = this.moveToTarget(this.angularMomentum.x, yaw, 1.0f);
        this.angularMomentum.y = this.moveToTarget(this.angularMomentum.y, pitch, 1.0f);
        this.angularMomentum.z = this.moveToTarget(this.angularMomentum.z, roll, 1.0f);
        this.LimitAngularMomentum(this.angularMomentum, 20.0f);
        plane.axes.rotateLocalYaw(this.angularMomentum.x);
        plane.axes.rotateLocalPitch(this.angularMomentum.y);
        plane.axes.rotateLocalRoll(- this.angularMomentum.z);
        this.angularMomentum.scale(0.99f);
        }
        else
        {
        	
        	
        	if(this.yawControl > 0.05f)
        		plane.axes.rotateLocalYaw(0.2f*this.yawControl);
        	if(this.yawControl < -0.05f)
        		plane.axes.rotateLocalYaw(0.2f*this.yawControl);
        }
    }

    public float moveToTarget(float current, float target, float speed) {
        float pitchToMove;
        for (pitchToMove = (float)(Math.sqrt((double)((double)(target * target))) - Math.sqrt((double)((double)(current * current)))); pitchToMove > 180.0f; pitchToMove -= 360.0f) {
        }
        while (pitchToMove <= -180.0f) {
            pitchToMove += 360.0f;
        }
        float signDeltaY = 0.0f;
        if (pitchToMove > speed) {
            signDeltaY = 1.0f;
        } else if (pitchToMove < - speed) {
            signDeltaY = -1.0f;
        } else {
            signDeltaY = 0.0f;
            return target;
        }
        if (current > target) {
            current -= speed;
        } else if (current < target) {
            current += speed;
        }
        return current;
    }

    public void LimitAngularMomentum(Vector3f vec, float angle) {
        if (vec.x > angle) {
            vec.x = angle;
        }
        if (vec.x < - angle) {
            vec.x = - angle;
        }
        if (vec.y > angle) {
            vec.y = angle;
        }
        if (vec.y < - angle) {
            vec.y = - angle;
        }
        if (vec.z > angle) {
            vec.z = angle;
        }
        if (vec.z < - angle) {
            vec.z = - angle;
        }
    }

    public void PlaneModeFly(EntityPlane plane) {
        if (plane.mode == EnumPlaneMode.HELI) {
            return;
        }
        PlaneType type = plane.getPlaneType();
        DriveableData data = plane.getDriveableData();
        int numPropsWorking = 0;
        int numProps = 0;
   //     float fuelConsumptionMultiplier = 2.0f;
        float flap = this.angularMomentum.length();
        
        
        this.drag -= flap / 100.0f;
        this.throttle -= (- flap) / 500.0f;
        
        for (Propeller prop : type.propellers) {
            if (!plane.isPartIntact(prop.planePart)) continue;
            ++numPropsWorking;
        }
        numProps = type.propellers.size();
        if (numProps == 0) {
            return;
        }
        //proto speed limit allah bookmark
        Vector3f forwards = (Vector3f)plane.axes.getXAxis().normalise();
        float lastTickSpeed = (float)plane.getSpeedXYZ();
        
        //for sea level v high altitude speed limit  let 70 be sea level world also muh afterburner  this.ticksFlareUsing <= 0
        float currentSpeedLimit = 1f;

        
        
        //attempt to stop backwards planes but only if velocity is supposed to be froward
        if (lastTickSpeed < 0 && this.V > 0)
        	lastTickSpeed = 0;

        
        //punjab limiter to fix speeds disobeying v while not flying horizontally
        if( (this.V* 2.23694f) > 80 && Math.abs(forwards.y) > 0.15f)	//corrections only work if you are not in near horizontal flight and above the 80mph low speed region
        {
        	//float mcSpeed = (float) (1.0f * Math.exp(0.487708*((this.V * 2.23694f)/767))); //convert velocity to lasttickspeed    jet formula
        	float mcSpeed = 0.35f + (float) (0.5f * Math.exp(2.25*((this.V * 2.23694f)/767)));  //ww2 adjusted formula     the 0.3 is a universal buff
        	if (lastTickSpeed < mcSpeed)
        	{
        		 //System.out.println("additive correction!");
        		lastTickSpeed += 0.77f*(mcSpeed - lastTickSpeed);
        	}
        	else if (lastTickSpeed > mcSpeed)
        	{
        		 //System.out.println("subtractive correction!");
        		lastTickSpeed -= 0.77f*(lastTickSpeed - mcSpeed);
        	}
        	
        }
        
        
        
        
        //gentle auto roll normalize      
            if(plane.axes.getRoll() > 0.1f || (!plane.getPlaneType().parasitePlane && plane.mounted))
            	 plane.axes.rotateLocalRoll(-0.15f);
            
            if(plane.axes.getRoll() < -0.1f || (!plane.getPlaneType().parasitePlane && plane.mounted))
           	 plane.axes.rotateLocalRoll(0.15f);
            
            //gentle auto pitch normalize       also if on a carrier, forcibly pitch normalize regardless of angle
            if(plane.axes.getPitch() > 0.01 && (plane.axes.getPitch() < 5f || (!plane.getPlaneType().parasitePlane && plane.mounted) ))
            	 plane.axes.rotateLocalPitch(0.05f);
            
            if(plane.axes.getPitch() < 0f && (plane.axes.getPitch() > -5f || (!plane.getPlaneType().parasitePlane && plane.mounted) ))
           	 plane.axes.rotateLocalPitch(-0.05f);
            
            
           /* if(Math.abs(this.pitchControl) < 0.1f) //not so gentle now    actually retcon it since it does more harm than good
            {
            	//if (plane.axes.getPitch() < -3f) dont need the pitch down
            	//	 plane.axes.rotateLocalPitch(-0.1f);
            	
               	if (plane.axes.getPitch() > 3f)	//these three are needed since an unknown force wants to keep pitching down, so defenders artificially push you back up
           		 plane.axes.rotateLocalPitch(0.1f);
               	
               	if (plane.axes.getPitch() > 9f)
             		 plane.axes.rotateLocalPitch(0.1f);
               	
               	if (plane.axes.getPitch() > 15f)
              		 plane.axes.rotateLocalPitch(0.1f);
               	
               	if (plane.axes.getPitch() > 20f)
             		 plane.axes.rotateLocalPitch(0.1f);
               	
               	if (plane.axes.getPitch() > 25f)
             		 plane.axes.rotateLocalPitch(0.1f);
               	
               	if (plane.axes.getPitch() > 30f)
             		 plane.axes.rotateLocalPitch(0.1f);
            } */
            
            
            //anti-stall auto pull down
            if(plane.axes.getPitch() < -1 && (this.V*2.23694f < type.takeoffSpeed*1.2f))
            {
           	 plane.axes.rotateLocalPitch(-0.4f);
           	//System.out.println("anti stall trying to work");
            }
            
        float newSpeed = lastTickSpeed + this.thrust * 2.0f;
        
        //jamio "acceleration" speed based on mass, and goes 0 to 1
        if(this.acceleration < 1 && this.V> -0.1f)
        this.acceleration += plane.throttle*74f/10f*type.mass - this.acceleration*74f/10f*type.mass;
        
        //for going backwards from gunfire
        if(this.V <= -0.1f && this.V > -1.01f)
        	this.acceleration = this.V/1.01f;
        else if (this.V <= -1.01f)
        	this.acceleration = -1;
        
        if(this.acceleration > 1)
        	this.acceleration = 1;
        
        //prevent empty newly placed plane from flying backwards
        if(plane.seats[0] != null && plane.seats[0].riddenByEntity == null && plane.throttle < 0.05f || (plane.ticksExisted < 140 && throttle < 0.05f))
        {
        	this.acceleration = 0;
        	this.V = 0;
        	this.T = 0;
        }
        if(plane.throttle < 0.05f && this.V < 0)
        	this.acceleration *= 0.95f;
        
        
      //  System.out.println("lasttick: " + lastTickSpeed);
        
        //secretly calculate the real speed for drag and convert to meter/s
        float maxMS = 0.44704f*type.maxSpeed;
        
        //physically accurate drag
        float trueDrag = this.V*this.V;
        
        
        
        //trigonometry thingy for gravity - is at 0 and goes to 1 as you are closer to dive bomb straight down
        float diveAngle = 0;
        
        float trueRoll = Math.abs(plane.axes.getRoll());		
  		if(plane.axes.getPitch() > 0)
  		{
  			if(trueRoll<=90)
  			diveAngle = (plane.axes.getPitch()/90f)*(1-trueRoll/90);
  			else if(trueRoll>90 && trueRoll<180)
  				diveAngle = (plane.axes.getPitch()/90f)*((trueRoll-90)/90);  			
  			}
  		
  		if(plane.isRiding() && plane.ridingEntity != null && plane.ridingEntity instanceof EntitySeat)
  		{
  			if(((EntitySeat)plane.ridingEntity).driveable instanceof EntityPlane)
  			{
  				EntityPlane mothership = (EntityPlane)((EntitySeat)plane.ridingEntity).driveable;
              
  				plane.axes.setAngles(mothership.axes.getYaw(), mothership.axes.getPitch(), mothership.axes.getRoll());
  			}
  		}
  		
  		
  		//initialize
  		if(plane.ticksExisted == 20 )
  		{
  			if(plane.varFlap)
  				plane.varFlap = !plane.varFlap;
  			
  			if(!plane.getDriveableData().emergencyMode)
  			{
  			this.V = 0;
  			this.acceleration = 0;
  			plane.throttle = 0;
  			}
  			
  		}
  		
        
        //gear out = almost DOUBLE drag - but because exponential, its less noticeable at low speed
        if(plane.varGear && type.needsGear)
        	trueDrag = 1.8f*this.V*this.V;
        
        if(plane.varFlap)
        	trueDrag = 3.5f*this.V*this.V;
        
        if(plane.varFlap && plane.varGear)
        	trueDrag = 6f*this.V*this.V;
        
        //so i can swap out acceleration in afterburner mode
        float maxAccel = maxMS*maxMS;
        
        //for carrier takeoff
        float catapultBonus = 0;
        
        if (plane.driveableData.catapult > 0)
        	catapultBonus = 3; //catapult bonus thrust
        else
        	catapultBonus = 0;
        
        if(type.hasAfterBurner && !plane.afterBurning && type.cruiseSpeed == 610)
        	maxAccel = 273f*273f; //610mph is common jet cruise speed;
        
        if(type.cruiseSpeed != 610 && !plane.afterBurning && type.hasAfterBurner)
        	maxAccel = (type.cruiseSpeed*0.44704f)*(type.cruiseSpeed*0.44704f); //auto converts to m*ters per second
        
        
        //thrust / forward acceleration
        this.T = this.throttle*maxAccel - trueDrag;
        //if negative velocity, drag starts helping you go forward again
        if	(this.V<0)
        this.T = this.throttle*maxAccel + trueDrag;
        // this.T = this.throttle*maxMS*maxMS + trueDrag + 9.8f*diveAngle;  using punjab way
        

       
        //Lift failed from too much complexity
        /*
        if(this.Vh > 0 && leftWing && rightWing)
        this.lift = (1 - Math.abs(forwards.y))*(this.Lc*(trueDrag) - Lcc*(this.Vh*this.Vh)) - type.mass*9.8f;  //also the lift only generates if angle of attack is near horizontal. diving/climbing reduces it but gravity ignores your angle
        else  if(this.Vh > 0 && ( (!leftWing && rightWing) || (leftWing && !rightWing) )) //condition if only ONE wing is gone
        this.lift = (1 - Math.abs(forwards.y))*(this.Lc*(trueDrag)/2 - Lcc*(this.Vh*this.Vh)) - type.mass*9.8f;  
        else  if(this.Vh > 0 && !leftWing && !rightWing ) //condition if both wings gone
            this.lift = (1 - Math.abs(forwards.y))*( -1 * Lcc*(this.Vh*this.Vh)) - type.mass*9.8f;       
        else
       	 this.lift = (Lcc*(this.Vh*this.Vh))  - type.mass*9.8f; //anti overflow when falling
       	 */
        
        //lift attempt 2
        this.lift =  ((1 - Math.abs(forwards.y))*(this.V*this.V) - this.stallMS*this.stallMS) /( this.stallMS*this.stallMS )  ;

        
        //fuck vh im using lift directly
        if(this.lift > type.climbRate)
        	lift = type.climbRate;
        
        if(this.lift < -100)
        	this.lift = -100f;
        
        /*
        if( this.Vh < 0 &&  (!plane.worldObj.isAirBlock((int)plane.posX, (int)(plane.posY-2), (int)plane.posZ)  || plane.mounted) )
        	this.Vh = 0;  //normal force of being on the ground or carrier deck kills the vh
        
        //gives correct lift velocity in m/s
        this.Vh += (float)this.lift/(float)(type.mass);
        
        if(this.lift < 0)
        	this.Vh += -9.8/20; //gravity doesnt care about your mass
        
        if(this.Vh <= -25f)
        	this.Vh = -24.9f;	//limit to how much it can fall in level flight to 25m/s
        
        if(this.Vh > type.climbRate)
        	this.Vh = type.climbRate;
        	*/
    
        
       // System.out.println("lift " + this.lift);
     //System.out.println("vh " + this.Vh);
        
        
        float VhMPH = this.Vh*2.23694f; //convert to imperial
        

        float DeltaVh = (float) VhMPH/74; //convert to low speed minecraft units
        
        //ok this hover bullshit is getting out of hand 30m/s hard cap
        if (DeltaVh > 0.9f)
        	DeltaVh = 0.9f;
        

        //applies max speed by swapping around drags
        float Vmph = this.V*2.23694f;
        
        
        //secret normalizer accel bonus for bias/prop planes
        float bonusFactor = 0;
        
        if(Vmph < type.maxSpeed && Vmph > 0 && (plane.afterBurning || !plane.getDriveableType().hasAfterBurner))
        	bonusFactor = type.accelBonus*(1 - (Vmph/type.maxSpeed)); //scale of 0 to 1, where 1 means plane is way beneath true speed
        else if(Vmph < type.cruiseSpeed && Vmph > 0 && (!plane.afterBurning && plane.getDriveableType().hasAfterBurner))
        	bonusFactor = type.accelBonus*(1 - (Vmph/type.cruiseSpeed)); //scale of 0 to 1, where 1 means plane is way beneath true speed
        	
        
       // if(!plane.worldObj.isAirBlock((int)plane.posX, (int)(plane.posY-1), (int)plane.posZ) && throttle <= 0.2 && plane.landBrake > 5)
        
        //force is divided by plane mass and then added to velocity. divide by 20 because per tick not second - actually change to 10 because x2 speed ADHD bonus
        if(plane.planeRecoil > 0 || (plane.driveableData.catapult > 0  && plane.driveableData.catapult < 40))
        { 
        	this.V += (this.T - plane.planeRecoil)/(type.mass) - forwards.y*9.8f/20f + catapultBonus/(20);
        	//System.out.println("delta v recoil " + ((this.T - 20*plane.planeRecoil)/(type.mass*20) - forwards.y*9.8f/20f));
       // System.out.println("V " + this.V);
        	plane.planeRecoil = 0;
        }
        else
        
        this.V += (1 + bonusFactor)*(1 + bonusFactor)*this.T/(type.mass*20) - type.gravityMultiplier*forwards.y*9.8f/20f; //normal formula for velocity from accel, important!
        
        //System.out.println("bonus factor: " + bonusFactor);
       
    	
  		
        
        if(!plane.worldObj.isAirBlock((int)plane.posX, (int)(plane.posY-2), (int)plane.posZ) && throttle <= 0.2 && plane.driveableData.landBrake > 5 && this.V < 1.75f*type.takeoffSpeed) //brake wont work if you are too fast
        {

           // System.out.println("Shes trying to brake");
        	this.V *= 0.965f;
        	if(this.V > -5f && this.V < 5f)
        	{
        		this.acceleration = 0; // come to a complete stop
        		this.V *= 0.3f;
        	}
        	else
        	{
        		FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("cloud",plane.posX, plane.posY, plane.posZ , 0,0,0),plane.posX, plane.posY , plane.posZ, 150, plane.dimension);
        	}
        }
        
        
        //drowning the plane
        if(!plane.worldObj.isAirBlock((int)plane.posX, (int)(plane.posY+1), (int)plane.posZ) && plane.worldObj.isAnyLiquid(plane.boundingBox) ) //check if under water
        {

           // System.out.println("Shes trying to brake");
        	this.V *= 0.96f;
        	if(this.V > -5f && this.V < 5f)
        	{
        		this.acceleration = 0; // come to a complete stop
        		this.V *= 0.3f;
        	}
        	
        }
        
        //no gear airframe scrape
        if(!plane.worldObj.isAirBlock((int)plane.posX, (int)(plane.posY-2), (int)plane.posZ) && !plane.worldObj.isAirBlock((int)plane.posX, (int)(plane.posY-2), (int)plane.posZ) && throttle <= 0.2 && (!plane.varGear && type.needsGear)  && !plane.worldObj.isAnyLiquid(plane.boundingBox))
        {

          // not as fast as true brakes
        	this.V *= 0.975f;
        	if(this.V > -5f && this.V < 5f)
        	{
        		this.acceleration = 0; // come to a complete stop
        		this.V *= 0.3f;
        	}
        	else
        	{
        		FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("cloud",plane.posX, plane.posY, plane.posZ , 0,0,0),plane.posX, plane.posY , plane.posZ, 150, plane.dimension);
        		FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("largeexplode",plane.posX, plane.posY+1, plane.posZ , 0,0,0),plane.posX, plane.posY , plane.posZ, 150, plane.dimension);
        	}
        	
        	
        	if(this.V > 3 && plane.isPartIntact(EnumDriveablePart.airframe) && !plane.mounted) //dont scrape if you are strapped to another plane
        	{  		
        		float hullDamage = 1 + 0.00025f*(plane.getDriveableData().parts.get(EnumDriveablePart.airframe).maxHealth);	//so it will take 400 ticks to die
        		plane.attackPart(EnumDriveablePart.airframe, DamageSource.cactus, hullDamage);	
        		
        	}
        	
        }
        
        
     

        
        
        //for overload effects      
        
        if (Vmph > type.maxSpeed) 
        {
            plane.axes.rotateLocalPitch( (Vmph - type.maxSpeed)/(type.maxSpeed/20f) * ((float)Math.random() - 0.5f) / 4.0f);
            plane.axes.rotateLocalYaw( (Vmph - type.maxSpeed)/(type.maxSpeed/20f) * ((float)Math.random() - 0.5f) / 4.0f);
            plane.axes.rotateLocalRoll( (Vmph - type.maxSpeed)/(type.maxSpeed/20f) * ((float)Math.random() - 0.5f) / 4.0f);
        }
        
        //collision feedback    scrap this shit since it ruined parasite aircraft system
        /*
        if (plane.accidentDelay > 0) 
        {
            plane.axes.rotateLocalPitch( plane.accidentDelay/5 * ((float)Math.random() - 0.5f) / 4.0f);
            plane.axes.rotateLocalYaw( plane.accidentDelay/5 * ((float)Math.random() - 0.5f) / 4.0f);
            plane.axes.rotateLocalRoll( plane.accidentDelay/5 * ((float)Math.random() - 0.5f) / 4.0f);
        }
        */
        
        if(Vmph <= 76 && Vmph >= 0)
        //	this.dragerino = (float) (5.255f - 0.088*Vmph + 0.0005*(Vmph*Vmph));	//low speed polynomial jet formula
            this.dragerino = (float) (-0.04*Vmph + 5) +0.18f; //ww2 adjusted formula   the 0.15f is a universal buff
        else if(Vmph > 76)
        	//this.dragerino = (float) 1.508f * (float)Math.exp(-0.00055f * Math.abs(Vmph));   //high speed exponential function    jet formula
        this.dragerino = (float) (-0.0031f*(Vmph) + 2.3641) +0.18f;   //ww2 adjusted formula  the 0.15f is a universal buff
        else
        	this.dragerino = 5;
        
        //dragerino velocity control TM
        this.drag = 1.0f - 0.05f * dragerino; 
        
        if(this.mode == EnumPlaneMode.HELI ) //maybe this will prevent hyper heli
        this.drag = 1.0f - 0.05f * type.drag; 

        
        //convert to m*tric
       
      
       // float proportionOfMotionToCorrect = 2.0f * this.throttle;
        float proportionOfMotionToCorrect = 2.0f * this.acceleration; //flaw seems negative accel requires thorttle?
        if (proportionOfMotionToCorrect < -1.0f) {
            proportionOfMotionToCorrect = -1.0f;
        }
        if (proportionOfMotionToCorrect > 1.5f) {
            proportionOfMotionToCorrect = 1.5f;
        }
        int numWingsIntact = 0;
        if (plane.isPartIntact(EnumDriveablePart.airframe)) {
            ++numWingsIntact;
        }
        
        /* jamio lift
        this.lift = (float)plane.getSpeedXYZ() * (float)plane.getSpeedXYZ() * (float)numWingsIntact / 1.0f;
        Vector3f up2 = (Vector3f)plane.axes.getYAxis().normalise();
        this.lift = (float)((double)this.lift * Math.sqrt(up2.y * up2.y));
        if (this.lift > this.gravity) {
            this.lift = this.gravity;
        }
        */
        
        //try to cancel carrier jittering
        if(!plane.mounted)
        {
      //Cut out some motion for correction - absolute values prevent hyper acceleration backwards
      		plane.motionX *= 1F - Math.abs(proportionOfMotionToCorrect);
      		plane.motionY *= 1F - Math.abs(proportionOfMotionToCorrect);
      		plane.motionZ *= 1F - Math.abs(proportionOfMotionToCorrect);
      	

      		//Add the corrected motion
      		//if(this.V != 0) //allow negative number so gun firing can make you backup   nvm failed feature
      			if(this.V > 0)
      		{
      		plane.motionX += proportionOfMotionToCorrect * newSpeed * forwards.x;
      		plane.motionY += proportionOfMotionToCorrect * newSpeed * forwards.y;
      		plane.motionZ += proportionOfMotionToCorrect * newSpeed * forwards.z;
      		}
        } //end of stop jittering attempt
      		
     		//apply labjac gravity v lift - use secret 1/2 nerf because 10x lower flight ceiling. also do not apply the negative motion if you are on the ground!
      		/*
            if(DeltaVh>0 && this.doomsday < 1)
            plane.motionY += DeltaVh;
            else  if(plane.worldObj.isAirBlock((int)plane.posX, (int)(plane.posY-2), (int)plane.posZ)  && plane.motionY > -0.4f)
            	plane.motionY += DeltaVh - (doomsday/300f);
            	*/
      		//plane.motionY -= gravity;
            
            //again but use lift instead of failed vh
            if(this.lift>=0 && this.doomsday < 1)
            plane.motionY += this.lift/(74*20f);
            else if(plane.worldObj.isAirBlock((int)plane.posX, (int)(plane.posY-2), (int)plane.posZ) )
            	  plane.motionY += this.lift/(74*20f) + 9.8/(74)*this.lift - (doomsday/300f);
            
            
            if(plane.driveableData.catapult > 0 && plane.motionY < 0)	//no sinking into carrier deck
            	plane.motionY = 0.01f;

      		
      		
    		if (plane.posY > type.ceiling)
    		{
    			plane.motionY = -0.1;
    		}
    		
    		
    		if(plane.getDriveableData().emergencyMode) //for seatkick freezing
    		{
    			plane.motionY = 0.01f;
    			plane.motionX = 0;
    			plane.motionZ = 0;
    			//plane.motionY *= 0.3f;  needed slight forward flight for air collision testing
    			//plane.motionX *= 0.4;
    			//plane.motionZ *= 0.4;
    			
    			//this.V = 0.69f*(0.44704f*type.maxSpeed); real one
    			this.V = 0.69f*(0.44704f*type.maxSpeed);
    		}

    		
    		
    		//no velocity while mounted
    		if(this.V > 0 && plane.mounted)
    			this.V *= 0.9f;
    		
    		
    		
    		//labjac carrier pitch fix TM

	//if (plane.isRiding());
//	plane.rotationPitch = 0f;
    		
     //labjac big gay code
      		//altitude flight ceiling

    		 
       		
      		if (!plane.isPartIntact(EnumDriveablePart.airframe)) {
                plane.motionY += -gravity;
                lift=-9.8f;
                plane.throttle = 0;
                
                if(plane.axes.getRoll() > 0.1f)
               	 plane.axes.rotateLocalRoll(-5f);
               
               if(plane.axes.getRoll() < -0.1f)
              	 plane.axes.rotateLocalRoll(5f);
               
              // System.out.println("doomsday: " + doomsday);
               doomsday ++;
                
               //shooting star into the earth    no timed explosion
                if(plane.axes.getPitch() < 35f)
                	plane.axes.rotateLocalPitch(-0.05f*doomsday);
                	
               
                	
          //if lost airworthiness and plane drowned, then die
			if (plane.isInWater())
				plane.attackPart(EnumDriveablePart.core, DamageSource.cactus, 10);	
            
        }
       
        /*
		if(plane.posY - plane.prevPosY < 0)
		{
			plane.motionY *= drag < 1? 0.999: 1;
		}
		else
		{
			plane.motionY *= drag;
		}
		*/
        
        /*
        if(plane.posY - plane.prevPosY < 0) //descending check
        	plane.motionY *=  Math.pow(drag, 5f); //labjac shitty correction  way too high 2 when should be 1.34     now at 0.9 its 1.9 but should be 1.3    1.87 when should be 1.44      1.1p  1.96 when want 1.3
        else
        	plane.motionY *=  Math.pow(drag, 0.15f); //labjac shitty correction sort of works
        	*/
        //allah bookmark drag world
        
      //	plane.motionX *= drag + 1*Math.abs(forwards.y) - drag*Math.abs(forwards.y);
		//plane.motionZ *= drag + 1*Math.abs(forwards.y) - drag*Math.abs(forwards.y);
		plane.motionX *= drag;
		plane.motionZ *= drag;
        plane.lastPos = new Vector3f(plane.motionX, plane.motionY, plane.motionZ);
       // data.fuelInTank -= this.thrust * fuelConsumptionMultiplier * data.engine.fuelConsumption;
        //allah randomizer effect
        /*
        if (plane.getSpeedXYZ() > 2.0) {
            plane.axes.rotateLocalPitch(((float)Math.random() - 0.5f) / 3.0f);
            plane.axes.rotateLocalYaw(((float)Math.random() - 0.5f) / 3.0f);
            plane.axes.rotateLocalRoll(((float)Math.random() - 0.5f) / 3.0f);
        }
        */
        if (!plane.isPartIntact(EnumDriveablePart.tail)) {
            plane.motionY += -gravity;
            lift *= 0.8f; //doesnt lose ALL lift
            lift -= 9.8*0.2f; //but gravity losses are restored
            this.tail = false; //to fuck with other parts of the code
            
            //spin like crazy
            if(doomsday < 750)
            doomsday ++;
            
            //die once you spin too fast
            if(doomsday >= 750)
            	plane.attackPart(EnumDriveablePart.core, DamageSource.cactus, 10);	
            
           // plane.motionY = -0.01 * doomsday;
            
            plane.axes.rotateLocalPitch(type.lookUpModifier*doomsday/(doomsday/2)); //the lift generated from tail gone so wing lift will make you spin up
            
          //if lost airworthiness and plane drowned, then die
			if (plane.isInWater())
				plane.attackPart(EnumDriveablePart.core, DamageSource.cactus, 10);	
        }
        
        if (!plane.isPartIntact(EnumDriveablePart.leftWing)) {
            plane.motionY += -gravity;
            this.leftWing = false; //used to fuck with lift in lift section
            
            //spin like crazy
            if(doomsday < 750)
            doomsday ++;
            
            //die once you spin too fast
            if(doomsday >= 750)
            	plane.attackPart(EnumDriveablePart.core, DamageSource.cactus, 10);	
            
            
            plane.axes.rotateLocalRoll(type.rollRightModifier*doomsday/(doomsday/10)); //now proportional to remianing wings lift
            
           // plane.motionY = -0.01 * doomsday;
            
          //if lost airworthiness and plane drowned, then die
			if (plane.isInWater())
				plane.attackPart(EnumDriveablePart.core, DamageSource.cactus, 10);	
        }
 		
 		if (!plane.isPartIntact(EnumDriveablePart.rightWing)) {
            plane.motionY += -gravity;
            this.rightWing = false; //used to fuck with lift in lift section
            
            //spin like crazy, also -1.5 so rightwing will win if both wings die
            if(doomsday < 750)
            doomsday ++;
            
            //die once you spin too fast
            if(doomsday >= 750)
            	plane.attackPart(EnumDriveablePart.core, DamageSource.cactus, 10);	
            
          //  plane.motionY = -0.01 * Math.abs(doomsday);
            
            plane.axes.rotateLocalRoll(-type.rollLeftModifier*doomsday/(doomsday/15)); //now proportional to remianing wings lift
            
          //if lost airworthiness and plane drowned, then die
			if (plane.isInWater())
				plane.attackPart(EnumDriveablePart.core, DamageSource.cactus, 10);	
        }
 		
 		 if(doomsday >= 100) //particle for burning up exploding plane
 			FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("largeexplode",plane.posX, plane.posY+1, plane.posZ , 0,0,0),plane.posX, plane.posY , plane.posZ, 150, plane.dimension);
 		 if(doomsday >= 100) //particle for burning up exploding plane
  			FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("largesmoke",plane.posX, plane.posY, plane.posZ , 0,0,0),plane.posX, plane.posY , plane.posZ, 150, plane.dimension);
 		 if(doomsday >= 20) //particle for burning up exploding plane
   			FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("flame",plane.posX, plane.posY, plane.posZ+1 , 0,0,0),plane.posX, plane.posY , plane.posZ, 150, plane.dimension);
 		 if(doomsday >= 20) //particle for burning up exploding plane
    			FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("flame",plane.posX, plane.posY+3, plane.posZ-0.7 , 0,0,0),plane.posX, plane.posY , plane.posZ, 150, plane.dimension);
 		 if(doomsday >= 20) //particle for burning up exploding plane
 			FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("flame",plane.posX, plane.posY+1, plane.posZ+1.3 , 0,0,0),plane.posX, plane.posY , plane.posZ, 150, plane.dimension);
 		 if(doomsday >= 100) //particle for burning up exploding plane
    			FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("largesmoke",plane.posX, plane.posY+1.5f, plane.posZ+0.5f , 0,0,0),plane.posX, plane.posY , plane.posZ, 150, plane.dimension);
 		 if(doomsday >= 100) //particle for burning up exploding plane
 			FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("flame",plane.posX, plane.posY+1f, plane.posZ-0.5f , 0,0,0),plane.posX, plane.posY , plane.posZ, 150, plane.dimension);
 		 if(doomsday >= 100) //particle for burning up exploding plane
 			FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("flame",plane.posX, plane.posY, plane.posZ+0.5f , 0,0,0),plane.posX, plane.posY , plane.posZ, 150, plane.dimension);
 		 if(doomsday >= 100) //particle for burning up exploding plane
 			FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("flame",plane.posX, plane.posY-0.5, plane.posZ-2f , 0,0,0),plane.posX, plane.posY , plane.posZ, 150, plane.dimension);
 		 if(doomsday >= 100) //particle for burning up exploding plane
  			FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("flansmod.fmflame",plane.posX, plane.posY+1f, plane.posZ , 0,0,0),plane.posX, plane.posY , plane.posZ, 150, plane.dimension);
 		 
 		 
 		 if(doomsday == 5) //particle for burning up exploding plane
  			FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("hugeexplosion",plane.posX, plane.posY+1, plane.posZ , 0,0,0),plane.posX, plane.posY , plane.posZ, 150, plane.dimension);
 		 if(doomsday == 18) //particle for burning up exploding plane
   			FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("largeexplode",plane.posX, plane.posY+1, plane.posZ , 0,0,0),plane.posX, plane.posY , plane.posZ, 150, plane.dimension);
 		 if(doomsday == 30) //particle for burning up exploding plane
   			FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("largeexplode",plane.posX, plane.posY+1, plane.posZ , 0,0,0),plane.posX, plane.posY , plane.posZ, 150, plane.dimension);
 		 
 		if(doomsday == 100) //one big exlosion before the particles start bleeding out
  			FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("hugeexplosion",plane.posX, plane.posY+1, plane.posZ , 0,0,0),plane.posX, plane.posY , plane.posZ, 150, plane.dimension);
 		
 		
 		if(doomsday == 700 && !(leftWing && tail && rightWing)) //final warnings also do not do this if airframe only is dead. no explode, plane just dives until it meets the earth
  			FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("hugeexplosion",plane.posX, plane.posY+1, plane.posZ , 0,0,0),plane.posX, plane.posY , plane.posZ, 150, plane.dimension);
 		
 		if(doomsday == 720 && !(leftWing && tail && rightWing)) //final warnings
  			FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("hugeexplosion",plane.posX, plane.posY+1, plane.posZ , 0,0,0),plane.posX, plane.posY , plane.posZ, 150, plane.dimension);
 		
 		if(doomsday == 725 && !(leftWing && tail && rightWing)) //final warnings
  			FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("hugeexplosion",plane.posX, plane.posY+1, plane.posZ , 0,0,0),plane.posX, plane.posY , plane.posZ, 150, plane.dimension);
 		
 		if(doomsday == 740 && !(leftWing && tail && rightWing)) //final warnings
  			FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("hugeexplosion",plane.posX, plane.posY+1, plane.posZ , 0,0,0),plane.posX, plane.posY , plane.posZ, 150, plane.dimension);
 		
 		if(doomsday == 748 && !(leftWing && tail && rightWing)) //one big exlosion before death
  			FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("flansmod.tankDeath",plane.posX, plane.posY+1, plane.posZ , 0,0,0),plane.posX, plane.posY , plane.posZ, 150, plane.dimension);
 			 
    }
    
    
    ///end of labjac big gay airframe code

    public void HeliModeFly(EntityPlane plane) {
    	
        PlaneType type = plane.getPlaneType();
        this.drag = 1.0f - 0.05f * type.drag;  //another attempt to make sure heli drag is normal
        DriveableData data = plane.getDriveableData();
        int numPropsWorking = 0;
        int numProps = 0;
 //       float fuelConsumptionMultiplier = 2.0f;
        for (Propeller prop : type.heliPropellers) {
            if (!plane.isPartIntact(prop.planePart)) continue;
            ++numPropsWorking;
        }
        numProps = type.heliPropellers.size();
        this.gravity = 0.05f;
        if (numProps == 0) {
            return;
        }
        Vector3f up = (Vector3f)plane.axes.getYAxis().normalise();
        this.thrust *= (float)(numPropsWorking / numProps) * 2.0f;
        float upwardsForce = this.throttle * this.thrust + (this.gravity - this.thrust / 2.0f);
        


        if (this.throttle < 0.5f) {
            upwardsForce = this.gravity * this.throttle * 2.0f;
            

        }
        if (!plane.isPartIntact(EnumDriveablePart.blades)) {
            upwardsForce = 0.04f;
        }
        if (this.throttle < 0.52f && this.throttle > 0.48f && up.y >= 0.7f) {
            upwardsForce = this.gravity / up.y;
        }
        if (plane.getPlaneType().mode != EnumPlaneMode.VTOL && up.y < 0.0f) {
            up.y *= -1.0f;
            up.x *= -1.0f;
            up.z *= -1.0f;
        }
    	//Throttle - 0.5 means that the positive throttle scales from -0.5 to +0.5. Thus it accounts for gravity-ish
        if(plane.motionX<1)
		plane.motionX += upwardsForce * up.x * 0.5F;
        if(plane.motionY<1)
		plane.motionY += (upwardsForce * up.y) - gravity;
        if(plane.motionZ<1)
		plane.motionZ += upwardsForce * up.z * 0.5F;
		
        if(plane.motionY>=1)
        	upwardsForce = 0.04f;
        if(plane.motionX>=1)
        	upwardsForce = 0.04f;
        if(plane.motionZ>=1)
        	upwardsForce = 0.04f;
        
		//heli ceiling
		if (plane.posY > type.ceiling)
		{
			plane.motionY = -0.1;
		}
			

		//Apply wobble
		//motionX += rand.nextGaussian() * wobbleFactor;
		//motionY += rand.nextGaussian() * wobbleFactor;
		//motionZ += rand.nextGaussian() * wobbleFactor;
		//Apply drag
		plane.motionX *= 1-(1-drag)/5;
		plane.motionY *= drag;
		plane.motionZ *= 1-(1-drag)/5;

		plane.lastPos = new Vector3f(plane.motionX, plane.motionY, plane.motionZ);
		

    }
    
    




}

