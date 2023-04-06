package com.flansmod.common.guns.raytracing;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

import com.flansmod.client.debug.EntityDebugAABB;
import com.flansmod.client.debug.EntityDebugDot;
import com.flansmod.common.FlansMod;
import com.flansmod.common.PlayerData;
import com.flansmod.common.PlayerHandler;
import com.flansmod.common.RotatedAxes;
import com.flansmod.common.guns.EntityBullet;
import com.flansmod.common.guns.GunType;
import com.flansmod.common.guns.ItemGun;
import com.flansmod.common.network.PacketFlak;
import com.flansmod.common.network.PacketParticle;
import com.flansmod.common.network.PacketPlaySound;
import com.flansmod.common.teams.ItemTeamArmour;
import com.flansmod.common.teams.TeamsManager;
import com.flansmod.common.vector.Vector3f;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class PlayerHitbox 
{
	/** */
	public EntityPlayer player;
	/** The angles of this box */
	public RotatedAxes axes;
	/** The origin of rotation for this box */
	public Vector3f rP;
	/** The lower left corner of this box */
	public Vector3f o;
	/** The dimensions of this box */
	public Vector3f d;
	/** The type of hitbox */
	public EnumHitboxType type;
	
	public static int lefty = 0;
	public static int righty = 0;
	public static int topy = 0;
	public static int bottomy = 0;
	
	public static int shieldHit = 0;
	
	public PlayerHitbox(EntityPlayer player, RotatedAxes axes, Vector3f rotationPoint, Vector3f origin, Vector3f dimensions, EnumHitboxType type)
	{
		this.player = player;
		this.axes = axes;
		this.o = origin;
		this.d = dimensions;
		this.type = type;
		this.rP = rotationPoint;
	}
	
	@SideOnly(Side.CLIENT)
	public void renderHitbox(World world, Vector3f pos)
	{
		
		Vector3f boxOrigin = new Vector3f(pos.x + rP.x, pos.y + rP.y, pos.z + rP.z);
		
		//so nearby player hitbox wont happen in thermal vision
		
		if(type != EnumHitboxType.NEARBY && (PlayerHandler.getPlayerData(player).shieldHit>0 || FlansMod.DEBUG))
		world.spawnEntityInWorld(new EntityDebugAABB(world, boxOrigin, d, 2, 1F, 1F, 0F, axes.getYaw(), axes.getPitch(), axes.getRoll(), o, PlayerHandler.getPlayerData(player).shieldHit));
		// System.out.println("from hitbox" + PlayerHandler.getPlayerData(player).shieldHit);
		/*
		for(int i = 0; i < 3; i++)
			for(int j = 0; j < 3; j++)
				for(int k = 0; k < 3; k++)
				{
					Vector3f point = new Vector3f(o.x + d.x * i / 2, o.y + d.y * j / 2, o.z + d.z * k / 2);
					point = axes.findLocalVectorGlobally(point);
					world.spawnEntityInWorld(new EntityDebugDot(world, new Vector3f(pos.x + rP.x + point.x, pos.y + rP.y + point.y, pos.z + rP.z + point.z), 1, 0F, 1F, 0F));
				}
		*/
		
	}

	public PlayerBulletHit raytrace(Vector3f origin, Vector3f motion) 
	{
		//Move to local coords for this hitbox, but don't modify the original "origin" vector
		origin = Vector3f.sub(origin, rP, null);
		origin = axes.findGlobalVectorLocally(origin);
		motion = axes.findGlobalVectorLocally(motion);
		
		//We now have an AABB starting at o and with dimensions d and our ray in the same coordinate system
		//We are looking for a point at which the ray enters the box, so we need only consider faces that the ray can see. Partition the space into 3 areas in each axis
		
		//X - axis and faces x = o.x and x = o.x + d.x
		if(motion.x != 0F)
		{
			if(origin.x < o.x) //Check face x = o.x
			{
				float intersectTime = (o.x - origin.x) / motion.x;
				float intersectY = origin.y + motion.y * intersectTime;
				float intersectZ = origin.z + motion.z * intersectTime;
				if(intersectY >= o.y && intersectY <= o.y + d.y && intersectZ >= o.z && intersectZ <= o.z + d.z)
					return new PlayerBulletHit(this, intersectTime);
			}
			else if(origin.x > o.x + d.x) //Check face x = o.x + d.x
			{
				float intersectTime = (o.x + d.x - origin.x) / motion.x;
				float intersectY = origin.y + motion.y * intersectTime;
				float intersectZ = origin.z + motion.z * intersectTime;
				if(intersectY >= o.y && intersectY <= o.y + d.y && intersectZ >= o.z && intersectZ <= o.z + d.z)
					return new PlayerBulletHit(this, intersectTime);
			}
		}
		
		//Z - axis and faces z = o.z and z = o.z + d.z
		if(motion.z != 0F)
		{
			if(origin.z < o.z) //Check face z = o.z
			{
				float intersectTime = (o.z - origin.z) / motion.z;
				float intersectX = origin.x + motion.x * intersectTime;
				float intersectY = origin.y + motion.y * intersectTime;
				if(intersectX >= o.x && intersectX <= o.x + d.x && intersectY >= o.y && intersectY <= o.y + d.y)
					return new PlayerBulletHit(this, intersectTime);
			}
			else if(origin.z > o.z + d.z) //Check face z = o.z + d.z
			{
				float intersectTime = (o.z + d.z - origin.z) / motion.z;
				float intersectX = origin.x + motion.x * intersectTime;
				float intersectY = origin.y + motion.y * intersectTime;
				if(intersectX >= o.x && intersectX <= o.x + d.x && intersectY >= o.y && intersectY <= o.y + d.y)
					return new PlayerBulletHit(this, intersectTime);
			}
		}
		
		//Y - axis and faces y = o.y and y = o.y + d.y
		if(motion.y != 0F)
		{
			if(origin.y < o.y) //Check face y = o.y
			{
				float intersectTime = (o.y - origin.y) / motion.y;
				float intersectX = origin.x + motion.x * intersectTime;
				float intersectZ = origin.z + motion.z * intersectTime;
				if(intersectX >= o.x && intersectX <= o.x + d.x && intersectZ >= o.z && intersectZ <= o.z + d.z)
					return new PlayerBulletHit(this, intersectTime);
			}
			else if(origin.y > o.y + d.y) //Check face x = o.x + d.x
			{
				float intersectTime = (o.y + d.y - origin.y) / motion.y;
				float intersectX = origin.x + motion.x * intersectTime;
				float intersectZ = origin.z + motion.z * intersectTime;
				if(intersectX >= o.x && intersectX <= o.x + d.x && intersectZ >= o.z && intersectZ <= o.z + d.z)
					return new PlayerBulletHit(this, intersectTime);
			}
		}

		return null;
	}

	public float hitByBullet(EntityBullet bullet, float penetratingPower) 
	{
		if(bullet.type.setEntitiesOnFire)
			player.setFire(20);
		//for(PotionEffect effect : bullet.type.hitEffects)
		//{
		//	player.addPotionEffect(new PotionEffect(effect));
		//}
		float damageModifier = bullet.type.penetratingPower < 0.1F ? penetratingPower / bullet.type.penetratingPower : 1;
		float trueBodyArmorPen = bullet.type.bodyarmorPen;
		//different pen at long range
		if (bullet.ticksExisted > bullet.type.dynamicBulletDelay)
			trueBodyArmorPen = bullet.type.dynamicBodyarmorPen;

		switch(type)
		{
		case BODY : 
			//labjac special armor system TM
			for(int i = 0; i < 5; i++)
			{
			ItemStack stack = player.getEquipmentInSlot(i);

//retcon blocking system check my archive for october 2021 if want to dig it up
			
			
			if(stack != null && stack.getItem() instanceof ItemTeamArmour)
			{
				//sneaking in armor reload key here of all places because itemgun retarded
				PlayerHandler.getPlayerData(player).pouchMultiplier = ((ItemTeamArmour)stack.getItem()).type.pouchMultiplier;
				
				//apply potion effect if not gas masked
				if((!((ItemTeamArmour)stack.getItem()).type.smokeProtection && bullet.type.smokeProtectable) || !bullet.type.smokeProtectable)
					for(PotionEffect effect : bullet.type.hitEffects)
					{
						player.addPotionEffect(new PotionEffect(effect));
					}
				
					
				//labjac secret flan armor system body armor TM
				//barely pen
				if((trueBodyArmorPen)>=(((ItemTeamArmour)stack.getItem()).secretBody*0.85f) && (trueBodyArmorPen)<=(((ItemTeamArmour)stack.getItem()).secretBody))
				{
					damageModifier *= bullet.type.barelypenPenalty;
					//Damage the armor item even if 0 damage
					if(damageModifier <= 0.1f)
					stack.setItemDamage(stack.getItemDamage() + 1);
					
					PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, 5, player.dimension, "armorDeflect", true);
					FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(player.posX, player.posY, player.posZ, 25, "crit"), player.posX, player.posY, player.posZ, 5, player.dimension);
					}
				//non pen
				else if((trueBodyArmorPen)<(((ItemTeamArmour)stack.getItem()).secretBody*0.85f))
				{
					//Damage the armor item even if 0 damage
					stack.setItemDamage(stack.getItemDamage() + 1);
					
					damageModifier *= bullet.type.nonpenPenalty;
					PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, 5, player.dimension, "armorDeflect", true);
					FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(player.posX, player.posY, player.posZ, 25, "crit"), player.posX, player.posY, player.posZ, 5, player.dimension);
					//force it to take durability damage
					
					}
			}
			else
				PlayerHandler.getPlayerData(player).pouchMultiplier = 1;
			}
			//end of labjac armor system TM
			break;
			
		case BACK : damageModifier *= 1.0F;
			//labjac special armor system TM
			for(int i = 0; i < 5; i++)
			{
			ItemStack stack = player.getEquipmentInSlot(i);
			
			
			if(stack != null && stack.getItem() instanceof ItemTeamArmour)
			{
				//apply potion effect if not gas masked
				if((!((ItemTeamArmour)stack.getItem()).type.smokeProtection && bullet.type.smokeProtectable) || !bullet.type.smokeProtectable)
					for(PotionEffect effect : bullet.type.hitEffects)
					{
						player.addPotionEffect(new PotionEffect(effect));
					}
				
				//labjac secret flan armor system body armor TM
				 if(((((ItemTeamArmour)stack.getItem()).secretBack)*0.85f)>(trueBodyArmorPen))
				{
					damageModifier *= bullet.type.nonpenPenalty;
					PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, 5, player.dimension, "armorDeflect", true);
					FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(player.posX, player.posY, player.posZ, 25, "crit"), player.posX, player.posY, player.posZ, 5, player.dimension);
					}
				 else if(((ItemTeamArmour)stack.getItem()).secretBack>(trueBodyArmorPen))
				{
					damageModifier *= bullet.type.barelypenPenalty;
					PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, 5, player.dimension, "armorDeflect", true);
					FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(player.posX, player.posY, player.posZ, 25, "crit"), player.posX, player.posY, player.posZ, 5, player.dimension);
					}
				//barely pen
				
			}
			}
			//end of labjac armor system TM
			break;
			
			
		case NAPE : damageModifier *= 3.5F;  //sever brain stem = instant kill so most damage
		
		//labjac special armor system TM
		for(int i = 0; i < 5; i++)
		{
		ItemStack stack = player.getEquipmentInSlot(i);
		
		
		
		if(stack != null && stack.getItem() instanceof ItemTeamArmour)
		{
			//apply potion effect if not gas masked
			if((!((ItemTeamArmour)stack.getItem()).type.smokeProtection && bullet.type.smokeProtectable) || !bullet.type.smokeProtectable)
				for(PotionEffect effect : bullet.type.hitEffects)
				{
					player.addPotionEffect(new PotionEffect(effect));
				}
			
			//labjac secret flan armor system helmet armor TM
			 if(((((ItemTeamArmour)stack.getItem()).secretNape)*0.85)>(trueBodyArmorPen))
			{
				damageModifier *= bullet.type.nonpenPenalty;
				PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, 5, player.dimension, "armorDeflect", true);
				FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(player.posX, player.posY, player.posZ, 25, "crit"), player.posX, player.posY, player.posZ, 5, player.dimension);
				}
			 else if(((ItemTeamArmour)stack.getItem()).secretNape>(trueBodyArmorPen))
			{
				damageModifier *= bullet.type.barelypenPenalty;
				PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, 5, player.dimension, "armorDeflect", true);
				FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(player.posX, player.posY, player.posZ, 25, "crit"), player.posX, player.posY, player.posZ, 5, player.dimension);
				}
			//barely pen
			
		}
		}
		//end of labjac armor system TM
		break;
		
		case CRANIUM : damageModifier *= 2F;
		//less damage than nape because frontal lobe damage = you survive but became special ed, brainstem = basic life function control
		//labjac special armor system TM
		for(int i = 0; i < 5; i++)
		{
		ItemStack stack = player.getEquipmentInSlot(i);
		
		

		
		
		
		if(stack != null && stack.getItem() instanceof ItemTeamArmour)
		{
			//apply potion effect if not gas masked
			if((!((ItemTeamArmour)stack.getItem()).type.smokeProtection && bullet.type.smokeProtectable) || !bullet.type.smokeProtectable)
				for(PotionEffect effect : bullet.type.hitEffects)
				{
					player.addPotionEffect(new PotionEffect(effect));
				}
			
			//labjac secret flan armor system helmet armor TM
			if(((((ItemTeamArmour)stack.getItem()).secretHead)*0.85)>(trueBodyArmorPen))
			{
				//damageModifier *= bullet.type.nonpenPenalty;
				damageModifier *= bullet.type.nonpenPenalty;
				PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, 5, player.dimension, "armorDeflect", true);
				FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(player.posX, player.posY, player.posZ, 25, "crit"), player.posX, player.posY, player.posZ, 5, player.dimension);
				}
			//barely pen
			else if(((ItemTeamArmour)stack.getItem()).secretHead>(trueBodyArmorPen))
			{
				damageModifier *= bullet.type.barelypenPenalty;
				PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, 5, player.dimension, "armorDeflect", true);
				FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(player.posX, player.posY, player.posZ, 25, "crit"), player.posX, player.posY, player.posZ, 5, player.dimension);
				}
		}
		}
		//end of labjac armor system TM
		break;
		
case FACE : damageModifier *= 1.5F;
		//less than other head hitboxes because you can survive nose and jaw damage
		//labjac special armor system TM
		for(int i = 0; i < 5; i++)
		{
		ItemStack stack = player.getEquipmentInSlot(i);
		
		
	
	
		if(stack != null && stack.getItem() instanceof ItemTeamArmour)
		{
			
			//apply potion effect if not gas masked
			if((!((ItemTeamArmour)stack.getItem()).type.smokeProtection && bullet.type.smokeProtectable) || !bullet.type.smokeProtectable)
				for(PotionEffect effect : bullet.type.hitEffects)
				{
					player.addPotionEffect(new PotionEffect(effect));
				}
			
			
			//labjac secret flan armor system helmet armor TM
			if(((((ItemTeamArmour)stack.getItem()).secretFace)*0.85)>(trueBodyArmorPen))
			{
				damageModifier *= bullet.type.nonpenPenalty;
				PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, 5, player.dimension, "armorDeflect", true);
				FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(player.posX, player.posY, player.posZ, 25, "crit"), player.posX, player.posY, player.posZ, 5, player.dimension);
				}
			//barely pen
			else if(((ItemTeamArmour)stack.getItem()).secretFace>(trueBodyArmorPen))
			{
				damageModifier *= bullet.type.barelypenPenalty;
				PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, 5, player.dimension, "armorDeflect", true);
				FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(player.posX, player.posY, player.posZ, 25, "crit"), player.posX, player.posY, player.posZ, 5, player.dimension);
				}
		}
		}
		//end of labjac armor system TM
		break;
		
		
		case LEFTARM : damageModifier *= 0.6F;
		//labjac special armor system TM
		for(int i = 0; i < 5; i++)
		{
		ItemStack stack = player.getEquipmentInSlot(i);

		
		
		
		if(stack != null && stack.getItem() instanceof ItemTeamArmour)
		{
			
			//apply potion effect if not gas masked
			if((!((ItemTeamArmour)stack.getItem()).type.smokeProtection && bullet.type.smokeProtectable) || !bullet.type.smokeProtectable)
				for(PotionEffect effect : bullet.type.hitEffects)
				{
					player.addPotionEffect(new PotionEffect(effect));
				}
			
			
			//labjac secret flan armor system helmet armor TM
			if(((((ItemTeamArmour)stack.getItem()).secretArm)*0.85)>(trueBodyArmorPen))
			{
				damageModifier *= bullet.type.nonpenPenalty;
				PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, 5, player.dimension, "armorDeflect", true);
				FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(player.posX, player.posY, player.posZ, 25, "crit"), player.posX, player.posY, player.posZ, 5, player.dimension);
				}
			//barely pen
			else if(((ItemTeamArmour)stack.getItem()).secretArm>(trueBodyArmorPen))
			{
				damageModifier *= bullet.type.barelypenPenalty;
				PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, 5, player.dimension, "armorDeflect", true);
				FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(player.posX, player.posY, player.posZ, 25, "crit"), player.posX, player.posY, player.posZ, 5, player.dimension);
				}
		}
		}
		//end of labjac armor system TM
		break;
		
		case RIGHTARM : damageModifier *= 0.6F; 
		//labjac special armor system TM
		for(int i = 0; i < 5; i++)
		{
		ItemStack stack = player.getEquipmentInSlot(i);

		

		
		if(stack != null && stack.getItem() instanceof ItemTeamArmour)
		{
			
			//apply potion effect if not gas masked
			if((!((ItemTeamArmour)stack.getItem()).type.smokeProtection && bullet.type.smokeProtectable) || !bullet.type.smokeProtectable)
				for(PotionEffect effect : bullet.type.hitEffects)
				{
					player.addPotionEffect(new PotionEffect(effect));
				}
			
			
			//labjac secret flan armor system helmet armor TM
			if(((((ItemTeamArmour)stack.getItem()).secretArm)*0.85)>(trueBodyArmorPen))
			{
				damageModifier *= bullet.type.nonpenPenalty;
				PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, 5, player.dimension, "armorDeflect", true);
				FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(player.posX, player.posY, player.posZ, 25, "crit"), player.posX, player.posY, player.posZ, 5, player.dimension);
					}

			//barely pen
			else if(((ItemTeamArmour)stack.getItem()).secretArm>(trueBodyArmorPen))
			{
				damageModifier *= bullet.type.barelypenPenalty;
				PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, 5, player.dimension, "armorDeflect", true);
				FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(player.posX, player.posY, player.posZ, 25, "crit"), player.posX, player.posY, player.posZ, 5, player.dimension);
				}
		}
		}
		//end of labjac armor system TM
		break;
		
		case LEGS : damageModifier *= 0.6F;
		//labjac special armor system TM
		for(int i = 0; i < 5; i++)
		{
		ItemStack stack = player.getEquipmentInSlot(i);

		
		
		
		if(stack != null && stack.getItem() instanceof ItemTeamArmour)
		{
			
			//apply potion effect if not gas masked
			if( (!((ItemTeamArmour)stack.getItem()).type.smokeProtection && bullet.type.smokeProtectable) || !bullet.type.smokeProtectable)
				for(PotionEffect effect : bullet.type.hitEffects)
				{
					player.addPotionEffect(new PotionEffect(effect));
				}
			
			
			//labjac secret flan armor system helmet armor TM
			if(((((ItemTeamArmour)stack.getItem()).secretLeg)*0.85)>(trueBodyArmorPen))
			{
				damageModifier *= bullet.type.nonpenPenalty;
				PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, 5, player.dimension, "armorDeflect", true);
				FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(player.posX, player.posY, player.posZ, 25, "crit"), player.posX, player.posY, player.posZ, 5, player.dimension);
					}
			//barely pen
			else if(((ItemTeamArmour)stack.getItem()).secretLeg>(trueBodyArmorPen))
			{
				damageModifier *= bullet.type.barelypenPenalty;
				PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, 5, player.dimension, "armorDeflect", true);
				FlansMod.getPacketHandler().sendToAllAround(new PacketFlak(player.posX, player.posY, player.posZ, 25, "crit"), player.posX, player.posY, player.posZ, 5, player.dimension);
					}
		}
		}
		//end of labjac armor system TM
		break;
		
		
		
		
		
		//for bullet not hitting but real damned close effects
		case NEARBY : damageModifier *= 0F;
		//play bullet flyby noise but not for melee
		if (!bullet.type.swordEnergy)
		PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, 8, player.dimension, bullet.missNoise, true);
		//flashing effect shouldnt work while in a vehicle, or else mg blinding a tank bs
		if(!player.isRiding() && !player.worldObj.isRemote)
		player.addPotionEffect(new PotionEffect(Potion.blindness.id, bullet.type.suppression));
		//player.addPotionEffect(new PotionEffect(Potion.confusion.id, 40));
		
		//end of labjac armor system TM
		break;
		//end of nearby
		
		
		case LEFTITEM : 
			PlayerData data = PlayerHandler.getPlayerData(player);
			if(data.offHandGunSlot != 0)
			{
				ItemStack leftHandStack = null;
				if(player.worldObj.isRemote && !FlansMod.proxy.isThePlayer(player))
					leftHandStack = data.offHandGunStack;
				else leftHandStack = player.inventory.getStackInSlot(data.offHandGunSlot - 1);
				
				if(leftHandStack != null && leftHandStack.getItem() instanceof ItemGun)
				{
					GunType leftGunType = ((ItemGun)leftHandStack.getItem()).type;
					//TODO : Shield damage
					if((trueBodyArmorPen)<leftGunType.shieldDamageAbsorption)
					{
						damageModifier *= 0.001f;
						bullet.setDead();
					PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, 5, player.dimension, "shield_metal", true);
					}
				}
			}
		break;
		case RIGHTITEM : 		
			ItemStack currentStack = player.getCurrentEquippedItem();
		if(currentStack != null && currentStack.getItem() instanceof ItemGun)
		{
			GunType gunType = ((ItemGun)currentStack.getItem()).type;
			//TODO : Shield damage - rip i tried jamio
			//currentStack.damageItem(1, player);
			if((trueBodyArmorPen)<gunType.shieldDamageAbsorption)
			{
				damageModifier *= 0.001f;
				bullet.setDead();
			PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, 5, player.dimension, "shield_metal", true);
			}
			
				
		}
		break;
		default : break;
		}
		switch(type)
		{
		case BODY : case BACK :  case NAPE :  case FACE : case LEFTARM :  case RIGHTARM :  case LEGS : case RIGHTITEM : case CRANIUM :	case LEFTITEM : 
		{
			//Calculate the hit damage before dynamic system
			//float hitDamage = bullet.damage * bullet.type.damageVsPlayer * damageModifier;
			
			float hitDamage = bullet.damage * bullet.type.dynamicDamage * damageModifier;
			//default damage if not dynamic change yet
			if (bullet.ticksExisted<bullet.type.dynamicBulletDelay)
				hitDamage = bullet.damage * bullet.type.damageVsPlayer * damageModifier;

			PlayerData data = PlayerHandler.getPlayerData(player);
			//bleed begin with safezone exception -use this line to turn it on or off
			
			//allah bookmark this is the switch to turn on bleeding
			
			if (hitDamage < player.getHealth() && !player.getEntityData().getString("lastClowder").equals("SAFEZONE") && TeamsManager.bleeding)
			data.minorBleed += hitDamage*bullet.type.bleedMultiplier;
			// bleed end
			//Create a damage source object
			
			//entity hit noise
			if(bullet.type.entityHitSoundEnable)
			PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, bullet.type.hitSoundRange, player.dimension, bullet.type.hitSound, true);
			
			//for overkill gory particle
			if (hitDamage > 40 && !player.getEntityData().getString("lastClowder").equals("SAFEZONE"))
			{
				FlansMod.proxy.spawnParticle("flansmod.overkill", player.posX, player.posY-4, player.posZ, 0,0.1f,0);
				PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, 15, player.dimension, "goreDeath", true);
				FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("flansmod.overkill", player.posX, player.posY-4, player.posZ, (float)Math.random()*1, (float)Math.random()*1, -(float)Math.random()*1), player.posX, player.posY, player.posZ, 150, player.dimension);
			}
			
			//for less gory particles
			if (hitDamage > 10 && !player.getEntityData().getString("lastClowder").equals("SAFEZONE"))
			{
				FlansMod.proxy.spawnParticle("flansmod.blood", player.posX, player.posY-4, player.posZ, 0,0.1f,0);
				//PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, 15, player.dimension, "goreDeath", true);
				FlansMod.getPacketHandler().sendToAllAround(new PacketParticle("flansmod.blood", player.posX, player.posY-4, player.posZ, (float)Math.random()*1, (float)Math.random()*1, -(float)Math.random()*1), player.posX, player.posY, player.posZ, 150, player.dimension);
			}
			
			DamageSource damagesource = bullet.owner == null ? DamageSource.generic : bullet.getBulletDamage( (type == EnumHitboxType.NAPE || type == EnumHitboxType.CRANIUM) );

			//When the damage is 0 (such as with Nerf guns) the entityHurt Forge hook is not called, so this hacky thing is here
			if(!player.worldObj.isRemote && hitDamage == 0 && TeamsManager.getInstance().currentRound != null)
				TeamsManager.getInstance().currentRound.gametype.playerAttacked((EntityPlayerMP)player, damagesource);
			
			//Attack the entity!
			if(player.attackEntityFrom(damagesource, hitDamage))
			{
				//If the attack was allowed, we should remove their immortality cooldown so we can shoot them again. Without this, any rapid fire gun become useless
				player.arrowHitTimer++;
				player.hurtResistantTime = player.maxHurtResistantTime / 2;
				//Yuck.
				//PacketDispatcher.sendPacketToAllAround(posX, posY, posZ, 50, dimension, PacketPlaySound.buildSoundPacket(posX, posY, posZ, type.hitSound, true));
				
				/*
				
				//I moved potion effects here so you wont get potioned by hitting the nearby hitbox
				boolean smokeThem = true;
				for(int i = 0; i < 5; i++)
				{
					
				
					//If any currently equipped item has smoke protection (gas masks), stop the effects
					ItemStack stack = player.getEquipmentInSlot(i);
					if(stack != null && stack.getItem() instanceof ItemTeamArmour && bullet.type.smokeProtectable)
					{
						if(((ItemTeamArmour)stack.getItem()).type.smokeProtection)
							smokeThem = false;
					}
				}

				if(smokeThem)
					for(PotionEffect effect : bullet.type.hitEffects)
						player.addPotionEffect(new PotionEffect(effect));
				//sorry for shoving it in here
				  
				 
				  */
				
				
				
			}
			return penetratingPower - 1;
			
			
			
			
			

		
		
		}	
		
		default : return penetratingPower;
		}
	}
}