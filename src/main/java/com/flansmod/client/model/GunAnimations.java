package com.flansmod.client.model;

import java.util.Random;

import com.flansmod.client.FlansModResourceHandler;
import com.flansmod.common.vector.Vector3f;

import cpw.mods.fml.client.FMLClientHandler;
import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.ISound;
import net.minecraft.client.audio.PositionedSoundRecord;
import net.minecraft.util.ResourceLocation;

public class GunAnimations 
{
	public static GunAnimations defaults = new GunAnimations();
	
	
    public Minecraft mc; //attempt to import sound
	public static Random rand = new Random();
    
	/** (Purely aesthetic) gun animation variables */
	public boolean isGunEmpty;
	/** Recoil */
	public float gunRecoil = 0F, lastGunRecoil = 0F, recoilAmount = 0.33F;
	/** Slide */
	public float gunSlide = 0F, lastGunSlide = 0F;
	/** Delayed Reload Animations */
	public int timeUntilPump = 0, timeToPumpFor = 0;
	/** Delayed Reload Animations : -1, 1 = At rest, 0 = Mid Animation */
	public float pumped = -1F, lastPumped = -1F;
	/** Delayed Reload Animations : Doing the delayed animation */
	public boolean pumping = false;
	/** Charge handle variables */
	public int timeUntilCharge = 0, timeToChargeFor = 0;
	public float charged = -1F, lastCharged = -1F;
	public boolean charging = false;
	
	public boolean reloading = false;
	public float reloadAnimationTime = 0;
	public float reloadAnimationProgress = 0F, lastReloadAnimationProgress = 0F;

	public float minigunBarrelRotation = 0F;
	public float minigunBarrelRotationSpeed = 0F;
	
	public int muzzleFlashTime = 0;
	public int flashInt = 0;

	/** Casing mechanics */
	public int timeUntilCasing = 0;
	public int casingStage = 0;
	public int lastCasingStage = 0;

	/** Hammer model mechanics */
	/** If in single action, the model will play a modified animation and delay hammer reset */
	public float hammerRotation = 0F;
	public float althammerRotation = 0F;
	public int timeUntilPullback = 0;
	public float gunPullback = -1F, lastGunPullback = -1F;
	public boolean isFired = false;
    
    public Vector3f casingRandom = new Vector3f(0F, 0F, 0F);
    
	/** Melee animations */ //and warband
	public int meleeAnimationProgress = 0, meleeAnimationLength = 0, meleeLeftAnimationProgress = 0, meleeLeftAnimationLength = 0, meleeRightAnimationProgress = 0, meleeRightAnimationLength = 0, meleeDownAnimationProgress = 0, meleeDownAnimationLength = 0;


	public float reloadAmmoCount;
	
	/**
     * Switch animations goldsloth gundraw
     */
    public float switchAnimationProgress = 0, switchAnimationLength = 0;
    public static int lastInventorySlot = -1;

	
	public GunAnimations()
	{
		
	}
	
	public void update()
	{
		//Assign values
		lastPumped = pumped;
		lastCharged = charged;
		lastGunPullback = gunPullback;
		lastCasingStage = casingStage;

		//Time until pump-action
		if(timeUntilPump > 0)
		{
			timeUntilPump--;
			if(timeUntilPump == 0)
			{
				//Pump it!
				pumping = true;	
				lastPumped = pumped = -1F;
			}
			
		}

		//Timer until pulling back the charge handle/bolt
		if(timeUntilCharge > 0)
		{
			timeUntilCharge--;
			if(timeUntilCharge == 0)
			{
				//Pump it!
				charging = true;	
				lastCharged = charged = -1F;
			}
			
		}

		//Time until hammer pullback
		if(timeUntilPullback > 0)
		{
			timeUntilPullback--;
			if(timeUntilPullback == 0)
			{
				//Reset the hammer
				isFired = true;
				lastGunPullback = gunPullback = -1F;
			}
		}
		else
		{
			//Automatically reset hammer
			hammerRotation *= 0.6F;
			althammerRotation *= 0.6F;
		}

		//Time until bullet casing ejection
		if(timeUntilCasing > 0)
		{
			timeUntilCasing--;
			if(timeUntilCasing == 0)
				casingStage++;
		}
		else
		{
			casingStage++;
		}

		if(muzzleFlashTime > 0)
			muzzleFlashTime--;
		
		if(pumping)
		{
			pumped += 2F / timeToPumpFor;
			if(pumped >= 0.999F)
				pumping = false;
		}
		if(charging)
		{
			charged += 2F / timeToChargeFor;
			if(charged >= 0.999F)
				charging = false;
		}

		if(isFired)
		{
			gunPullback += 2F / 4;
			if(gunPullback >= 0.999F)
				isFired = false;
		}

		//Recoil model
		lastGunRecoil = gunRecoil;
		if(gunRecoil > 0)
			gunRecoil *= 0.7F;

		//Slide model
		lastGunSlide = gunSlide;
		if(isGunEmpty)
			lastGunSlide = gunSlide = 0.5F;
		if(!isGunEmpty && gunSlide > 0.9)	//Add one extra frame to slide
			gunSlide -= 0.1F;
		else if(gunSlide > 0 && !isGunEmpty)
			gunSlide *= 0.5F;

		//Reload
		lastReloadAnimationProgress = reloadAnimationProgress;
		if(reloading)
			reloadAnimationProgress += 1F / reloadAnimationTime;
		if(reloading && reloadAnimationProgress >= 0.9F)	//reset if slide locked
			isGunEmpty = false;
		if(reloading && reloadAnimationProgress >= 1F)
			reloading = false;
		
		minigunBarrelRotation += minigunBarrelRotationSpeed;
		minigunBarrelRotationSpeed *= 0.9F;
		
		if(meleeAnimationLength > 0)
		{
			meleeAnimationProgress++;
			//If we are done, reset
			if(meleeAnimationProgress == meleeAnimationLength)
				meleeAnimationProgress = meleeAnimationLength = 0;
		}
		

        if (switchAnimationProgress > 0) { //goldsloth gundraw
            switchAnimationProgress++;
            //If we are done, reset
            if (switchAnimationProgress == switchAnimationLength) {
                switchAnimationLength = 0;
            }
        } //goldsloth gundraw
        
		//cringed mount and blade animation shit
		if(meleeLeftAnimationLength > 0)
		{
			meleeLeftAnimationProgress++;
			//If we are done, reset
			if(meleeLeftAnimationProgress == meleeLeftAnimationLength)
				meleeLeftAnimationProgress = meleeLeftAnimationLength = 0;
		}
		
		if(meleeRightAnimationLength > 0)
		{
			meleeRightAnimationProgress++;
			//If we are done, reset
			if(meleeRightAnimationProgress == meleeRightAnimationLength)
				meleeRightAnimationProgress = meleeRightAnimationLength = 0;
		}
		
		if(meleeDownAnimationLength > 0)
		{
			meleeDownAnimationProgress++;
			//If we are done, reset
			if(meleeDownAnimationProgress == meleeDownAnimationLength)
				meleeDownAnimationProgress = meleeDownAnimationLength = 0;
		}
	}

	//Not to be used for mechas
	public void onGunEmpty(boolean atLastBullet)
	{
		isGunEmpty = atLastBullet;
	}
	
	public void doShoot(int pumpDelay, int pumpTime, int hammerDelay, float hammerAngle, float althammerAngle, int casingDelay)
	{
		Random r = new Random();

		//Accumulative recoil function
		lastGunRecoil = gunRecoil += recoilAmount;

		minigunBarrelRotationSpeed += 2F;
		lastGunSlide = gunSlide = 1F;
		timeUntilPump = pumpDelay;
		timeToPumpFor = pumpTime;
		timeUntilPullback = hammerDelay;
		timeUntilCasing = casingDelay;
		hammerRotation = hammerAngle;
		althammerRotation = althammerAngle;
		muzzleFlashTime = 2;

		int Low = -1;
		int High = 3;
		int result = r.nextInt(High-Low) + Low;
		if(result == -1) result = 0;
		if(result == 3) result = 2;
        flashInt = result;
        //xddd hide wally client sound here   fuck it sucks too
       // if (silenced == null)
        //	silenced = false;
      //  FMLClientHandler.instance().getClient().getSoundHandler().playSound((ISound) new PositionedSoundRecord(FlansModResourceHandler.getSound(sound), silenced ? 5F : 10F, (silenced ? 1.0F / (rand.nextFloat() * 0.4F + 0.8F) : 1.0F) * (silenced ? 2F : 1F), (float)mc.thePlayer.posX, (float)mc.thePlayer.posY, (float)mc.thePlayer.posZ));
      //  mc.getSoundHandler().playSound(PositionedSoundRecord.func_147674_a(new ResourceLocation("gui.button.press"), 1.0F));
       // mc.getSoundHandler().playSound(PositionedSoundRecord.func_147674_a(FlansModResourceHandler.getSound("nigger"), 1.0F));
        casingRandom.x = ((r.nextFloat()*2)-1);
        casingRandom.y = ((r.nextFloat()*2)-1);
        casingRandom.z = ((r.nextFloat()*2)-1);
		casingStage = 0;
	}
	
		
	public void doReload(int reloadTime, int pumpDelay, int pumpTime, int chargeDelay, int chargeTime)
	{
		reloading = true;
		lastReloadAnimationProgress = reloadAnimationProgress = 0F;
		reloadAnimationTime = reloadTime;
		timeUntilPump = pumpDelay;
		timeToPumpFor = pumpTime;
		timeUntilCharge = chargeDelay;
		timeToChargeFor = chargeTime;
	}
	
	public void doMelee(int meleeTime)
	{
		if (meleeRightAnimationLength==0&&meleeLeftAnimationLength==0&&meleeDownAnimationLength==0);
		meleeAnimationLength = meleeTime;
	}
	
	public void doBayonet(int meleeTime)
	{
		if (meleeAnimationLength==0&&meleeAnimationLength==0&&meleeAnimationLength==0);
		meleeAnimationLength = meleeTime;
	}
	//mount and blade labjac
	public void doMeleeLeft(int meleeLeftTime)
	{
		if (meleeAnimationLength==0&&meleeRightAnimationLength==0&&meleeDownAnimationLength==0);
		meleeLeftAnimationLength = meleeLeftTime;
	}
	public void doMeleeRight(int meleeRightTime)
	{
		if (meleeAnimationLength==0&&meleeLeftAnimationLength==0&&meleeDownAnimationLength==0);
		meleeRightAnimationLength = meleeRightTime;
	}
	public void doMeleeDown(int meleeDownTime)
	{
		if (meleeAnimationLength==0&&meleeLeftAnimationLength==0&&meleeRightAnimationLength==0);
		meleeDownAnimationLength = meleeDownTime;
	}
}
