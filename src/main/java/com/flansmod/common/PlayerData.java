package com.flansmod.common;

import java.util.ArrayList;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

import com.flansmod.client.FlansModClient;
import com.flansmod.common.driveables.EntitySeat;
import com.flansmod.common.guns.EntityGrenade;
import com.flansmod.common.guns.EntityMG;
import com.flansmod.common.guns.GunType;
import com.flansmod.common.guns.ItemGun;
import com.flansmod.common.guns.raytracing.PlayerSnapshot;
import com.flansmod.common.network.PacketBlockerino;
import com.flansmod.common.network.PacketBlood;
import com.flansmod.common.network.PacketPlaySound;
import com.flansmod.common.network.PacketSelectOffHandGun;
import com.flansmod.common.teams.ItemTeamArmour;
import com.flansmod.common.teams.PlayerClass;
import com.flansmod.common.teams.Team;
import com.flansmod.common.vector.Vector3f;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class PlayerData 
{
	/** Their username */
	public String username;

	//Movement related fields
	/** Roll variables */
	public float prevRotationRoll, rotationRoll;
	/** Snapshots for bullet hit detection. Array size is set to number of snapshots required. When a new one is taken, 
	 * each snapshot is moved along one place and new one is added at the start, so that when the array fills up, the oldest one is lost */
	public PlayerSnapshot[] snapshots;
	
	//Gun related fields
	/** The slotID of the gun being used by the off-hand. 0 = no slot. 1 ~ 9 = hotbar slots */
	public int offHandGunSlot = 0;
	/** The off hand gun stack. For viewing other player's off hand weapons only (since you don't know what is in their inventory and hence just the ID is insufficient) */
	@SideOnly(Side.CLIENT)
	public ItemStack offHandGunStack;
	/** The MG this player is using */
	public EntityMG mountingGun;
	/** Tickers to stop shooting too fast */
	public int   isBlockingLeft, isBlockingRight, isBlockingTop, isBlockingBottom, minigunSpeed, nintendoSwitch, drawTime, s0, s1, s2, s3, s4, s5, s6, s7, s8, s9;
	public float shootTimeRight, shootTimeLeft, stabTimeLeft, stabTimeRight; //make them floats for goldsloth rpm
	//labjac seat switch timer
	/** Stops player shooting immediately after swapping weapons */
	public int shootClickDelay;
	/** True if this player is shooting  or blocking allah*/
	public boolean isShootingRight, isShootingLeft;
	/** The speed of the minigun the player is using */
	
	//replacement for minigun labjac style
	public int labigunTimer = 0;
	
	
	/** Reloading booleans */
	public boolean reloadingRight, reloadingLeft;
	/** When remote explosives are thrown they are added to this list. When the player uses a remote, the first one from this list detonates */
	public ArrayList<EntityGrenade> remoteExplosives = new ArrayList<EntityGrenade>();
	/** Sound delay parameters */
	public int loopedSoundDelay;
	/** Sound delay parameters */
	public boolean shouldPlayCooldownSound, shouldPlayWarmupSound;
	/** Melee weapon custom hit simulation */
	public int meleeProgress, meleeLength;
	
	public float pouchMultiplier = 1f;

	/** When the player shoots a burst fire weapon, one shot is fired immediately and this counter keeps track of how many more should be fired */
	public int burstRoundsRemainingLeft = 0, burstRoundsRemainingRight = 0;
	
	public boolean isAmmoEmpty;
	
	//for invis
	public boolean invisArmor = false;

	public Vector3f[] lastMeleePositions;
//labjac mount and blade
	public Vector3f[] lastMeleeLeftPositions;
	public Vector3f[] lastMeleeRightPositions;
	public Vector3f[] lastMeleeDownPositions;
	public int meleeProgressLeft, meleeLengthLeft, meleeLeftLength;	
	public int meleeProgressRight, meleeLengthRight, meleeRightLength;	
	public int meleeProgressDown, meleeLengthDown, meleeDownLength;	
	//labjac mount and blade intialize final
	//Teams related fields
	/** Gametype variables */
	public int score, kills, deaths, shekels;
	//labjac shitty progression attempt
	
	
	
	//labjac bleeding system
	public float blood = 100;
	
	//super timer 
	public int timer = 0;
	
	//super timer slow 
	public int timerSlow = 0;
	
	//minor bleeding timer
	public int minorBleed = 0;
	
	//heavy bleeding timer
		public int Bleed = 0;
		
		//hemorrhaging  timer
		public int hemorrhaging = 0;

	public int totalScore;
	/** Zombies variables */
	public int zombieScore;
	/** Gametype variable for Nerf */
	public boolean out;
	/** The player's vote for the next round from 1 ~ 5. 0 is not yet voted */
	public int vote;
	/** The team this player is currently on */
	public Team team;
	/** The team this player will switch to upon respawning */
	public Team newTeam;
	/** The class the player is currently using */
	public PlayerClass playerClass;
	/** The class the player will switch to upon respawning */
	public PlayerClass newPlayerClass;
	/** Keeps the player out of having to rechose their team each round */
	public boolean builder;
	/** Save the player's skin here, to replace after having done a swap for a certain class override */
	@SideOnly(Side.CLIENT)
	public ResourceLocation skin;

	//halo armor
	public int shieldTimer = 0;
	public int rechargeTimer=0;
	public int SoundTimer=0;
	public int shieldHit = 0;
	
	public PlayerData(String name) 
	{
		username = name;	
		snapshots = new PlayerSnapshot[FlansMod.numPlayerSnapshots];
	}
	
	
	
	
	
	public void tick(EntityPlayer player)
	{

		
		if (this.shieldHit > 0)
			this.shieldHit --;
		
		
		if(player.worldObj.isRemote)
			clientTick(player);
		if(shootTimeRight > 0)
			shootTimeRight--;
		if(shootTimeRight <= 0)
			reloadingRight = false;
		
		if(stabTimeRight > 0)
			stabTimeRight--;
		if(stabTimeRight <= 0)
			reloadingRight = false;
		
		if(isBlockingLeft > 0)
		{
		isBlockingLeft--;
		//System.out.println("allahu ackbar blocking ticker" + isBlockingLeft);
		}
		if(isBlockingRight > 0)
			isBlockingRight--;
		if(isBlockingTop > 0)
			isBlockingTop--;
		if(isBlockingBottom > 0)
			isBlockingBottom--;
		
		
		
		//minigunSpeed *= 0.9F;
		if(loopedSoundDelay > 0)
		{
			loopedSoundDelay--;
			if(loopedSoundDelay == 0 && !isShootingRight)
				shouldPlayCooldownSound = true;
		}
		
		
		if(minigunSpeed > -3)
		{
			minigunSpeed--;
		//System.out.println("allahu ackbar minigun ticker" + minigunSpeed);
		}

		
        FlansMod.getPacketHandler().sendToServer(new PacketBlockerino(isBlockingLeft, isBlockingRight, isBlockingTop, isBlockingBottom, minigunSpeed));    
    	
		
		if(shootTimeLeft > 0)
			shootTimeLeft--;
		if(shootTimeLeft <= 0)
			reloadingLeft = false;
		
		if(stabTimeLeft > 0)
			stabTimeLeft--;
		if(stabTimeLeft <= 0)
			reloadingLeft = false;
		
		if(nintendoSwitch > 0)
			nintendoSwitch--;
		
		if(drawTime>0)
			drawTime--;
		
		//seat switch manual
		if(s0 > 0)
			s0--;
		if(s1 > 0)
			s1--;
		if(s2 > 0)
			s2--;
		if(s3 > 0)
			s3--;
		if(s4 > 0)
			s4--;
		if(s5 > 0)
			s5--;
		if(s6 > 0)
			s6--;
		if(s7 > 0)
			s7--;
		if(s8 > 0)
			s8--;
		if(s9 > 0)
			s9--;
		
		if(shootClickDelay > 0)
			shootClickDelay--;
		

				
		//final solution to invisibility
		
		for(int i = 0; i < 5; i++)
		{
		ItemStack stack = player.getEquipmentInSlot(i);
		
		
		if(stack != null)
		{
		if((player.ridingEntity instanceof EntitySeat)==false && !player.isPotionActive(Potion.invisibility.id) && !(stack.getItem() instanceof ItemTeamArmour))
				player.setInvisible(false);
		}
		else
			if((player.ridingEntity instanceof EntitySeat)==false && !player.isPotionActive(Potion.invisibility.id))
				player.setInvisible(false);
		
		}
		
		//blood stuff
		
		
		//labjac three second counter
		if(timer < 60 && (player.ridingEntity instanceof EntitySeat)==false)
			timer++;
		if(timer >= 60)
			timer = 0;
		
		//labjac six second counter
		if(timerSlow < 120 && (player.ridingEntity instanceof EntitySeat)==false)
			timerSlow++;
		if(timerSlow >= 120)
			timerSlow = 0;
		
		//healthy blood regeneration    +1 blood / 3 seconds
		if(blood > 50 && blood < 100 && timer == 59)
			blood++;
		
		//dying blood regeneration  +1 blood / 6 seconds
		if(blood > 30 && blood <= 50 && timerSlow == 119)
			blood++;
		
		//minorbleeding  -3 blood / 6 seconds  and minorbleed timer goes down by one
		if(timerSlow == 119 && minorBleed > 0)
		{
			blood--;
			blood--;
		    blood--;
			minorBleed--;
		}
		
		//normalbleeding  if minorbleed too high, add this too on top of it
		if(timerSlow == 119 && Bleed > 0)
		{
			blood--;
			blood--;
			Bleed--;
		}
		
		//hemorrhaging  if bleed too high, add this too on top of it
		if(timer == 59 && hemorrhaging > 0)
		{
			blood--;
			blood--;
			Bleed--;
		}
		
		//sanity checks
		if(blood>100)
			blood = 100;
		if(minorBleed<0)
			minorBleed = 0;
		if(Bleed<0)
			Bleed = 0;
		if(hemorrhaging<0)
			hemorrhaging = 0;
		
		if(minorBleed > 5)
			Bleed = minorBleed-5;
		
		if(Bleed > 25)
			hemorrhaging = (Bleed-25)*2;
		
		
		
		//apply potioneffects depending on blood level
		if(blood <= 80)
		player.addPotionEffect(new PotionEffect(Potion.hunger.id, 200));
		
		if(blood <= 60)
		player.addPotionEffect(new PotionEffect(Potion.weakness.id, 200));
		
		if(blood <= 45)
		player.addPotionEffect(new PotionEffect(Potion.weakness.id, 400));
		
		if(blood <= 40)
		player.addPotionEffect(new PotionEffect(Potion.confusion.id, 240));
		
		if(blood <= 30)
		player.addPotionEffect(new PotionEffect(Potion.blindness.id, 240));
		
		//no being immortal using vehicles 
	//	if(blood <= 0 && (player.ridingEntity instanceof EntitySeat && ((EntitySeat)player.ridingEntity).seatInfo.invincible))
		if(blood <= 0)
		{
		player.addPotionEffect(new PotionEffect(Potion.harm.id, 10, 5));
		minorBleed=0;
		Bleed=0;
		hemorrhaging=0;
		blood=100;
		}
		
		
		if(pouchMultiplier != 1)
	
	
		
		
		//Handle minigun speed
		if(isShootingRight && !reloadingRight)
		{
			minigunSpeed += 2; 
			System.out.println(minigunSpeed + "from growth");
		}
	

			
		/*
		if(player.getCurrentEquippedItem().getItem() instanceof ItemGun)
		if(((ItemGun)player.getCurrentEquippedItem().getItem()).type.labigunDelay && (((ItemGun)player.getCurrentEquippedItem().getItem()).type.labigunLimit <= labigunTimer))
			labigunTimer--;
		
		
		if(isShootingRight && !reloadingRight && ((ItemGun)player.getCurrentEquippedItem().getItem()).type.labigunDelay)
		{
			labigunTimer++; 
			labigunTimer++; 
		}
		*/
		
		if (labigunTimer > 0)
			labigunTimer--;
		
		
		
		//Move all snapshots along one place
        System.arraycopy(snapshots, 0, snapshots, 1, snapshots.length - 2 + 1);
		//Take new snapshot
		snapshots[0] = new PlayerSnapshot(player);
	}
	
	public void clientTick(EntityPlayer player)
	{
		if(player.getCurrentEquippedItem() == null || !(player.getCurrentEquippedItem().getItem() instanceof ItemGun) || ((ItemGun)player.getCurrentEquippedItem().getItem()).type.oneHanded || player.getCurrentEquippedItem() == offHandGunStack)
		{
			//offHandGunSlot = 0;
			offHandGunStack = null;
		}
	}

	public PlayerClass getPlayerClass()
	{
		if(playerClass != newPlayerClass)
			playerClass = newPlayerClass;
		return playerClass;
	}

	public void resetScore() 
	{
		score = zombieScore = kills = deaths = 0;
		team = newTeam = null;
		playerClass = newPlayerClass = null;
	}
	
	public void playerKilled()
	{
		mountingGun = null;
		isShootingRight = isShootingLeft = false;
		snapshots = new PlayerSnapshot[FlansMod.numPlayerSnapshots];
	}
	
	public void selectOffHandWeapon(EntityPlayer player, int slot)
	{
		if(isValidOffHandWeapon(player, slot))
			offHandGunSlot = slot;
	}
	
	public boolean isValidOffHandWeapon(EntityPlayer player, int slot)
	{
		if(slot == 0)
			return true;
		if(slot - 1 == player.inventory.currentItem)
			return false;
		ItemStack stackInSlot = player.inventory.getStackInSlot(slot - 1);
		if(stackInSlot == null)
			return false;
		if(stackInSlot.getItem() instanceof ItemGun)
		{
			ItemGun item = ((ItemGun)stackInSlot.getItem());
			if(item.type.oneHanded)
				return true;
		}
		return false;
		

	}

	public void cycleOffHandItem(EntityPlayer player, int dWheel) 
	{
		if(dWheel < 0)
			for(offHandGunSlot = ((offHandGunSlot + 1) % 10); !isValidOffHandWeapon(player, offHandGunSlot); offHandGunSlot = ((offHandGunSlot + 1) % 10)) ;
		else if(dWheel > 0)
			for(offHandGunSlot = ((offHandGunSlot + 9) % 10); !isValidOffHandWeapon(player, offHandGunSlot); offHandGunSlot = ((offHandGunSlot + 9) % 10)) ;
		
		FlansModClient.currentScope = null;
		
		FlansMod.getPacketHandler().sendToServer(new PacketSelectOffHandGun(offHandGunSlot));
	}
	
	public void doMelee(EntityPlayer player, int meleeTime, GunType type)	
	{
		meleeLength = meleeTime;
		lastMeleePositions = new Vector3f[type.meleePath.size()];
		
		for(int k = 0; k < type.meleeDamagePoints.size(); k++)
		{
			Vector3f meleeDamagePoint = type.meleeDamagePoints.get(k);
			//Do a raytrace from the prev pos to the current pos and attack anything in the way
			Vector3f nextPos = type.meleePath.get(0);
			Vector3f nextAngles = type.meleePathAngles.get(0);
			RotatedAxes nextAxes = new RotatedAxes(-nextAngles.y, -nextAngles.z, nextAngles.x);
			
			Vector3f nextPosInPlayerCoords = new RotatedAxes(player.rotationYaw + 90F, player.rotationPitch, 0F).findLocalVectorGlobally(nextAxes.findLocalVectorGlobally(meleeDamagePoint));
			Vector3f.add(nextPos, nextPosInPlayerCoords, nextPosInPlayerCoords);
			
			if(!FlansMod.proxy.isThePlayer(player))
				nextPosInPlayerCoords.y += 1.6F;
			
			lastMeleePositions[k] = new Vector3f(player.posX + nextPosInPlayerCoords.x, player.posY + nextPosInPlayerCoords.y, player.posZ + nextPosInPlayerCoords.z);
		}
	}
	
	
	//mount and blade public void
	
	public void doMeleeLeft(EntityPlayer player, int meleeLeftTime, GunType type)	
	{
		meleeLeftLength = meleeLeftTime;
		lastMeleeLeftPositions = new Vector3f[type.meleeLeftPath.size()];
		
		for(int k = 0; k < type.meleeLeftDamagePoints.size(); k++)
		{
			Vector3f meleeDamagePoint = type.meleeLeftDamagePoints.get(k);
			//Do a raytrace from the prev pos to the current pos and attack anything in the way
			Vector3f nextPos = type.meleeLeftPath.get(0);
			Vector3f nextAngles = type.meleeLeftPathAngles.get(0);
			RotatedAxes nextAxes = new RotatedAxes(-nextAngles.y, -nextAngles.z, nextAngles.x);
			
			Vector3f nextPosInPlayerCoordsLeft = new RotatedAxes(player.rotationYaw + 90F, player.rotationPitch, 0F).findLocalVectorGlobally(nextAxes.findLocalVectorGlobally(meleeDamagePoint));
			Vector3f.add(nextPos, nextPosInPlayerCoordsLeft, nextPosInPlayerCoordsLeft);
			
			if(!FlansMod.proxy.isThePlayer(player))
				nextPosInPlayerCoordsLeft.y += 1.6F;
			
			lastMeleeLeftPositions[k] = new Vector3f(player.posX + nextPosInPlayerCoordsLeft.x, player.posY + nextPosInPlayerCoordsLeft.y, player.posZ + nextPosInPlayerCoordsLeft.z);
		}
	}
	
	public void doMeleeRight(EntityPlayer player, int meleeRightTime, GunType type)	
	{
		meleeRightLength = meleeRightTime;
		lastMeleeRightPositions = new Vector3f[type.meleeRightPath.size()];
		
		for(int k = 0; k < type.meleeRightDamagePoints.size(); k++)
		{
			Vector3f meleeDamagePoint = type.meleeRightDamagePoints.get(k);
			//Do a raytrace from the prev pos to the current pos and attack anything in the way
			Vector3f nextPos = type.meleeRightPath.get(0);
			Vector3f nextAngles = type.meleeRightPathAngles.get(0);
			RotatedAxes nextAxes = new RotatedAxes(-nextAngles.y, -nextAngles.z, nextAngles.x);
			
			Vector3f nextPosInPlayerCoords = new RotatedAxes(player.rotationYaw + 90F, player.rotationPitch, 0F).findLocalVectorGlobally(nextAxes.findLocalVectorGlobally(meleeDamagePoint));
			Vector3f.add(nextPos, nextPosInPlayerCoords, nextPosInPlayerCoords);
			
			if(!FlansMod.proxy.isThePlayer(player))
				nextPosInPlayerCoords.y += 1.6F;
			
			lastMeleeRightPositions[k] = new Vector3f(player.posX + nextPosInPlayerCoords.x, player.posY + nextPosInPlayerCoords.y, player.posZ + nextPosInPlayerCoords.z);
		}
	}
	
	public void doMeleeDown(EntityPlayer player, int meleeDownTime, GunType type)	
	{
		meleeDownLength = meleeDownTime;
		lastMeleeDownPositions = new Vector3f[type.meleeDownPath.size()];
		
		for(int k = 0; k < type.meleeDownDamagePoints.size(); k++)
		{
			Vector3f meleeDamagePointDown = type.meleeDownDamagePoints.get(k);
			//Do a raytrace from the prev pos to the current pos and attack anything in the way
			Vector3f nextPosDown = type.meleeDownPath.get(0);
			Vector3f nextAnglesDown = type.meleeDownPathAngles.get(0);
			RotatedAxes nextAxesDown = new RotatedAxes(-nextAnglesDown.y, -nextAnglesDown.z, nextAnglesDown.x);
			
			Vector3f nextPosInPlayerCoordsDown = new RotatedAxes(player.rotationYaw + 90F, player.rotationPitch, 0F).findLocalVectorGlobally(nextAxesDown.findLocalVectorGlobally(meleeDamagePointDown));
			Vector3f.add(nextPosDown, nextPosInPlayerCoordsDown, nextPosInPlayerCoordsDown);
			
			if(!FlansMod.proxy.isThePlayer(player))
				nextPosInPlayerCoordsDown.y += 1.6F;
			
			lastMeleeDownPositions[k] = new Vector3f(player.posX + nextPosInPlayerCoordsDown.x, player.posY + nextPosInPlayerCoordsDown.y, player.posZ + nextPosInPlayerCoordsDown.z);
		}
	}
	

	
	

	
}
