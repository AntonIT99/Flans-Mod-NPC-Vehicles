package com.flansmod.common;

import com.flansmod.common.driveables.EntityDriveable;
import com.flansmod.common.driveables.EntitySeat;
import com.flansmod.common.guns.EntityBullet;
import com.flansmod.common.guns.EntityDamageSourceFlans;
import com.flansmod.common.guns.EntityGrenade;
import com.flansmod.common.guns.ShootableType;
import com.flansmod.common.network.PacketRequestDebug;
import com.flansmod.common.teams.PlayerStats;
import com.flansmod.common.teams.TeamsManager;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.PlayerLoggedOutEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.PlayerRespawnEvent;
import cpw.mods.fml.relauncher.Side;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.server.MinecraftServer;
import net.minecraft.world.WorldServer;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.living.LivingAttackEvent;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingHurtEvent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@SuppressWarnings("unused")
public class PlayerHandler {
    private static final Random rand = new Random();
    private boolean statsSynced=false;
    public static Map<String, PlayerData> serverSideData = new HashMap<String, PlayerData>();
    public static Map<String, PlayerData> clientSideData = new HashMap<String, PlayerData>();
    public static Map<String, PlayerStats> serverSidePlayerStats = new HashMap<String, PlayerStats>();
    public static Map<String, PlayerStats> clientSidePlayerStats = new HashMap<String, PlayerStats>();
    public static ArrayList<String> clientsToRemoveAfterThisRound = new ArrayList<String>();

    public PlayerHandler() {
        MinecraftForge.EVENT_BUS.register(this);
        FMLCommonHandler.instance().bus().register(this);
    }

    @SubscribeEvent
    public void onEntityHurt(LivingAttackEvent event) {
        EntityLivingBase entity = event.entityLiving;
        if (entity.ridingEntity instanceof EntityDriveable || entity.ridingEntity instanceof EntitySeat) {
            event.setCanceled(true);
        }
    }

    @SubscribeEvent
    public void onLivingHurtEvent(LivingHurtEvent event) {
        float damage = event.ammount;
        if (damage > 0 && event.source instanceof EntityDamageSourceFlans) {
            EntityDamageSourceFlans source = (EntityDamageSourceFlans) event.source;

            ShootableType shootableType = null;
            Entity damageSouceEntity = source.getDamageSourceEntity();
            if (damageSouceEntity instanceof EntityBullet) {
                shootableType = ((EntityBullet) damageSouceEntity).type;
            }
            if (damageSouceEntity instanceof EntityGrenade) {
                shootableType = ((EntityGrenade) damageSouceEntity).type;
            }
            if (shootableType != null && shootableType.ignoreArmorProbability > 0 && rand.nextFloat() < shootableType.ignoreArmorProbability) {
                EntityLivingBase entity = event.entityLiving;
                float f1 = damage;
                damage = Math.max(damage - entity.getAbsorptionAmount(), 0.0F);
                entity.setAbsorptionAmount(entity.getAbsorptionAmount() - (f1 - damage));

                damage *= shootableType.ignoreArmorDamageFactor;

                if (damage != 0.0F) {
                    float health = entity.getHealth();
                    entity.setHealth(health - damage);
                    entity.func_110142_aN().func_94547_a(source, health, damage);
                    entity.setAbsorptionAmount(entity.getAbsorptionAmount() - damage);

//					FlansMod.log("Ignore armor damage = " + damage);
                }

                event.setCanceled(true);
            }
        }
    }

    @SubscribeEvent
    public void onEntityKilled(LivingDeathEvent event) {
        EntityLivingBase entity = event.entityLiving;
        if (entity instanceof EntityPlayer) {
            getPlayerData((EntityPlayer) entity).playerKilled();
        }
    }

    public void serverTick() {
        for (WorldServer world : MinecraftServer.getServer().worldServers) {
            for (Object player : world.playerEntities) {
                getPlayerData((EntityPlayer) player).tick((EntityPlayer) player);
            }
        }
        if(TeamsManager.getInstance().currentRound!=null) {
            if (!statsSynced) {
                if (PlayerStats.getAllPlayersStats() != null) {
                    for (PlayerStats stats : PlayerStats.getAllPlayersStats()) {
                        serverSidePlayerStats.put(stats.nickname, stats);
                        statsSynced = true;
                    }
                } else {
                    statsSynced = true;
                }
            }
        }
    }

    public void clientTick() {
        if (Minecraft.getMinecraft().theWorld != null) {
            for (Object player : Minecraft.getMinecraft().theWorld.playerEntities) {
                getPlayerData((EntityPlayer) player).tick((EntityPlayer) player);
            }
        }
    }

    public static PlayerData getPlayerData(EntityPlayer player) {
        if (player == null)
            return null;
        return getPlayerData(player.getCommandSenderName(), player.worldObj.isRemote ? Side.CLIENT : Side.SERVER);
    }

    public static PlayerData getPlayerData(String username) {
        return getPlayerData(username, Side.SERVER);
    }

    public static PlayerData getPlayerData(EntityPlayer player, Side side) {
        if (player == null)
            return null;
        return getPlayerData(player.getCommandSenderName(), side);
    }

    public static PlayerData getPlayerData(String username, Side side) {
        if (side.isClient()) {
            if (!clientSideData.containsKey(username))
                clientSideData.put(username, new PlayerData(username));
        } else {
            if (!serverSideData.containsKey(username))
                serverSideData.put(username, new PlayerData(username));
        }
        return side.isClient() ? clientSideData.get(username) : serverSideData.get(username);
    }

    //---

    public static PlayerStats getPlayerStats(EntityPlayerMP player) {
        if (player == null)
            return null;
        return getPlayerStats(player, player.worldObj.isRemote ? Side.CLIENT : Side.SERVER);
    }

    public static PlayerStats getPlayerStats(EntityPlayerMP player, Side side) {
        String username = player.getCommandSenderName();
        if (side.isClient()) {
            if (!clientSidePlayerStats.containsKey(username))
                clientSidePlayerStats.put(username, new PlayerStats(player.worldObj, player));
        } else {
            if (!serverSidePlayerStats.containsKey(username))
                serverSidePlayerStats.put(username, new PlayerStats(player.worldObj, player));
        }
        return side.isClient() ? clientSidePlayerStats.get(username) : serverSidePlayerStats.get(username);
    }

    @SubscribeEvent
    public void onPlayerEvent(PlayerEvent event) {
        if (event instanceof PlayerLoggedInEvent) {
            if (event.player instanceof EntityPlayerMP) {
                FlansMod.packetHandler.sendTo(new PacketRequestDebug(false), (EntityPlayerMP) event.player);
            }

            EntityPlayer player = event.player;
            String username = player.getCommandSenderName();
            if (!serverSideData.containsKey(username))
                serverSideData.put(username, new PlayerData(username));
            clientsToRemoveAfterThisRound.remove(username);
            if (!serverSidePlayerStats.containsKey(username))
                serverSidePlayerStats.put(username, new PlayerStats(player.worldObj, (EntityPlayerMP)player));

        } else if (event instanceof PlayerLoggedOutEvent) {
            EntityPlayer player = event.player;
            String username = player.getCommandSenderName();
            if (TeamsManager.getInstance().currentRound == null)
                serverSideData.remove(username);
            else clientsToRemoveAfterThisRound.add(username);
        } else if (event instanceof PlayerRespawnEvent) {
            EntityPlayer player = event.player;
            String username = player.getCommandSenderName();
            if (!serverSideData.containsKey(username))
                serverSideData.put(username, new PlayerData(username));
            if (!serverSidePlayerStats.containsKey(username))
                serverSidePlayerStats.put(username, new PlayerStats(player.worldObj, (EntityPlayerMP)player));

        }
    }

    /**
     * Called by teams manager to remove lingering player data
     */
    public static void roundEnded() {
        for (String username : clientsToRemoveAfterThisRound) {
            serverSideData.remove(username);
        }
    }
}
