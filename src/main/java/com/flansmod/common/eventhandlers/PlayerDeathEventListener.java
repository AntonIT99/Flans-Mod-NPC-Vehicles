package com.flansmod.common.eventhandlers;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.LivingDeathEvent;

import com.flansmod.common.FlansMod;
import com.flansmod.common.PlayerHandler;
import com.flansmod.common.guns.EntityBullet;
import com.flansmod.common.guns.EntityGrenade;
import com.flansmod.common.network.PacketKillMessage;
import com.flansmod.common.teams.Team;
import com.flansmod.common.types.InfoType;

import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.PlayerRespawnEvent;

public class PlayerDeathEventListener {

	public PlayerDeathEventListener()
	{
		MinecraftForge.EVENT_BUS.register(this);
	}

	@EventHandler
	@SubscribeEvent
	public void PlayerDied(LivingDeathEvent DamageEvent)
	{
		Entity souceEntity = DamageEvent.source.getSourceOfDamage();
		
		
		
		if( (DamageEvent.source.getDamageType().equalsIgnoreCase("explosion") &&
			((souceEntity instanceof EntityGrenade) || (souceEntity instanceof EntityBullet))) &&
			DamageEvent.entityLiving instanceof EntityPlayer)
		{
			InfoType info;
			EntityPlayer killer = null;
			EntityPlayer killed = (EntityPlayer) DamageEvent.entityLiving;

			if(souceEntity instanceof EntityGrenade)
			{
				killer = (EntityPlayer) ((EntityGrenade) souceEntity).thrower;
				info = ((EntityGrenade) souceEntity).type;
			}
			else
			{
				killer = (EntityPlayer) ((EntityBullet) souceEntity).owner;
				info = ((EntityBullet) souceEntity).type;
			}

			Team killerTeam = null;
			Team killedTeam = null;
			killerTeam = PlayerHandler.getPlayerData(killer).team;
			killedTeam = PlayerHandler.getPlayerData(killed).team;
			
			//bleeding reset upon death -t labjac
			PlayerHandler.getPlayerData((EntityPlayer)killed).blood=100;
			PlayerHandler.getPlayerData((EntityPlayer)killed).minorBleed=0;
			PlayerHandler.getPlayerData((EntityPlayer)killed).Bleed=0;
			PlayerHandler.getPlayerData((EntityPlayer)killed).hemorrhaging=0;

			FlansMod.getPacketHandler().sendToDimension(
					new PacketKillMessage(false,
							info,
							killer.getHeldItem().getItemDamage(),
							(killedTeam == null ? "f" : killedTeam.textColour) + killed.getDisplayName(),
							(killerTeam == null ? "f" : killedTeam.textColour) + killer.getDisplayName(),
							killed.getDistanceToEntity(killer)),
				DamageEvent.entityLiving.dimension);
			// System.out.println("Weapon:"+((EntityBullet)souceEntity).type+" victim:"+killed.getDisplayName()+" Murderer:"+killer.getDisplayName());
			// System.out.println("Weapon:"+((EntityBullet)souceEntity).type+" victim:"+killed.getDisplayName()+" Murderer:"+killer.getDisplayName());
			System.out.println(killer.getDisplayName() + " has killed " + killed.getDisplayName() + " with " + info.name + ". TickExisted:" + killed.ticksExisted / 20 +
				" KilledPos(X:" + (int)(killed.posX) + " Y:" + (int)(killed.posY) + " Z:" + (int)(killed.posZ) + ")" +
				" KillerPos(X:" + (int)(killer.posX) + " Y:" + (int)(killer.posY) + " Z:" + (int)(killer.posZ) + ")");

			if(killed.getCurrentArmor(2) != null) {
				System.out.println("KilledPlayer:" + killed + " wear a " + killed.getCurrentArmor(2).getUnlocalizedName());
			} else {
				System.out.println("KilledPlayer:" + killed + " wear nothing.");
			}

			if(killer.getCurrentArmor(2) != null) {
				System.out.println("Killer:" + killer + " wear a " + killer.getCurrentArmor(2).getUnlocalizedName());
			} else {
				System.out.println("Killer:" + killer + " wear nothing.");
			}

			if(killed.ticksExisted / 20 < FlansMod.noticeSpawnKillTime) {
				System.out.println("Warning! PlayerName:" + killer.getCommandSenderName() + " may do SPAWN KILL. Time:" + killed.ticksExisted / 20 + " " + killed.getCommandSenderName() + " was killed.");
			}
			// System.out.println(killed.getCurrentArmor(2));
		}
	}
	
	
	@SubscribeEvent
    public void onPlayerDeath(LivingDeathEvent event)
    {
      if(event.entity instanceof EntityPlayer) 
      {
        EntityPlayer player = (EntityPlayer)event.entity;
        PlayerHandler.getPlayerData((EntityPlayer)player).blood=100;
        PlayerHandler.getPlayerData((EntityPlayer)player).minorBleed=0;
        PlayerHandler.getPlayerData((EntityPlayer)player).Bleed=0;
        PlayerHandler.getPlayerData((EntityPlayer)player).hemorrhaging=0;
      }
    }
	
	@EventHandler
	public void onRespawnPVPEVENT(PlayerRespawnEvent pvpevent) {
	       EntityPlayer player = (EntityPlayer)pvpevent.player;
		PlayerHandler.getPlayerData((EntityPlayer)player).blood=100;
        PlayerHandler.getPlayerData((EntityPlayer)player).minorBleed=0;
        PlayerHandler.getPlayerData((EntityPlayer)player).Bleed=0;
        PlayerHandler.getPlayerData((EntityPlayer)player).hemorrhaging=0;
	}

}
