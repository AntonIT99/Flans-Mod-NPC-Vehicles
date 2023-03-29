package com.flansmod.common.teams;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;

import com.flansmod.common.driveables.EntityDriveable;
import com.flansmod.common.driveables.EntityPlane;
import com.flansmod.common.driveables.EntityVehicle;
import com.flansmod.common.driveables.EnumPlaneMode;
import com.flansmod.common.guns.EntityBullet;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityDamageSource;
import net.minecraft.util.Vec3;

import com.flansmod.common.FlansMod;
import com.flansmod.common.PlayerData;
import com.flansmod.common.PlayerHandler;
import com.flansmod.common.network.PacketBase;
import com.flansmod.common.types.InfoType;

public abstract class GameType {
    public static List<GameType> gameTypeList = new ArrayList<>();
    public static HashMap<String, GameType> gameTypes = new HashMap<>();
    public static TeamsManager teamsManager = TeamsManager.getInstance();
    public static Random rand = new Random();
    public boolean allowedForRoundsGenerator;

    public static GameType getGameType(String type) {
        return gameTypes.get(type);
    }

    public String name;
    public String shortName;
    public int numTeamsRequired;

    public GameType(String name, String shortName, int numTeams, boolean allowedForRoundsGenerator) {
        this.name = name;
        this.shortName = shortName;
        numTeamsRequired = numTeams;
        gameTypes.put(this.shortName, this);
        gameTypeList.add(this);
        this.allowedForRoundsGenerator = allowedForRoundsGenerator;
    }

    /**
     * Called when a round starts
     */
    public abstract void roundStart();

    /**
     * Called when a round ends. (The point at which scoreboards are displayed)
     */
    public abstract void roundEnd();

    /**
     * Called when the scoreboards and voting are finished
     */
    public abstract void roundCleanup();

    public abstract boolean teamHasWon(Team team);

    public void tick() {
    }

    public Team[] getTeamsCanSpawnAs(TeamsRound currentRound, EntityPlayer player) {
        return currentRound.teams;
    }

    public void playerJoined(EntityPlayerMP player) {
    }

    public void playerRespawned(EntityPlayerMP player) {
    }

    public void playerQuit(EntityPlayerMP player) {
    }

    //Return true if damage should be dealt.
    public boolean playerAttacked(EntityPlayerMP player, DamageSource source) {
        return true;
    }

    public void playerKilled(EntityPlayerMP player, DamageSource source) {
    }

    public void baseAttacked(ITeamBase base, DamageSource source) {
    }

    public void objectAttacked(ITeamObject object, DamageSource source) {
    }

    public void baseClickedByPlayer(ITeamBase base, EntityPlayerMP player) {
    }

    public void objectClickedByPlayer(ITeamObject object, EntityPlayerMP player) {
    }

    public boolean playerCanLoot(ItemStack stack, InfoType infoType, EntityPlayer player, Team playerTeam) {
        return true;
    }

    public abstract Vec3 getSpawnPoint(EntityPlayerMP player);

    //Return whether or not the variable exists
    public boolean setVariable(String variable, String value) {
        return false;
    }

    public abstract void readFromNBT(NBTTagCompound tags);

    public abstract void saveToNBT(NBTTagCompound tags);

    public boolean sortScoreboardByTeam() {
        return true;
    }

    public boolean showZombieScore() {
        return false;
    }

    /**
     * Whether "attacker" can attack "victim"
     */
    public boolean playerCanAttack(EntityPlayerMP attacker, Team attackerTeam, EntityPlayerMP victim, Team victimTeam) {
        return true;
    }

    /**
     * Called when any entity is killed. This allows one to track mob deaths too
     */
    public void entityKilled(Entity entity, DamageSource source) {

    }

    public void vehicleDestroyed(EntityDriveable driveable2, EntityPlayerMP attacker){
        if (driveable2!=null) {
            if (attacker != null) {
                EntityDriveable driveable = driveable2;
//                if(driveable.riddenByEntity!=null &&
//                        driveable.riddenByEntity instanceof EntityPlayer &&
//                        !getPlayerData((EntityPlayerMP) driveable.riddenByEntity).team.equals(getPlayerData(attacker).team)) {
                    if(true){ //this if() need for next changes
                        getPlayerInfo(attacker).vehiclesDestroyed++;
                        if (driveable instanceof EntityPlane) {
                        EntityPlane plane = (EntityPlane) driveable;
                        if (plane.mode == EnumPlaneMode.PLANE || plane.mode == EnumPlaneMode.VTOL) {
                            getPlayerInfo(attacker).addExp(100);
                            getPlayerInfo(attacker).savePlayerStats();
                        } else if (plane.mode == EnumPlaneMode.HELI) {
                            getPlayerInfo(attacker).addExp(75);
                            getPlayerInfo(attacker).savePlayerStats();
                        }
                    } else if (driveable instanceof EntityVehicle) {
                        EntityVehicle vehicle = (EntityVehicle) driveable;
                        if (vehicle.getVehicleType().tank) {
                            getPlayerInfo(attacker).addExp(75);
                            getPlayerInfo(attacker).savePlayerStats();
                        } else {
                            getPlayerInfo(attacker).addExp(50);
                            getPlayerInfo(attacker).savePlayerStats();
                        }
                    }
                }
            }
        }
    }

    public void playerChoseTeam(EntityPlayerMP player, Team team, Team newTeam) {
    }

    public void playerChoseNewClass(EntityPlayerMP player, PlayerClass playerClass) {
    }

    public void playerDefected(EntityPlayerMP player, Team team, Team newTeam) {
    }

    public void playerEnteredTheGame(EntityPlayerMP player, Team team, PlayerClass playerClass) {
    }

    //--------------------------------------
    // Helper methods - Do not override
    //--------------------------------------



    public static PlayerData getPlayerData(EntityPlayerMP player) {
        return PlayerHandler.getPlayerData(player);
    }

    public static PlayerStats getPlayerInfo(EntityPlayerMP player) {
        return PlayerHandler.getPlayerStats(player);
    }

    public static void sendPacketToPlayer(PacketBase packet, EntityPlayerMP player) {
        FlansMod.getPacketHandler().sendTo(packet, player);
    }

    public static String[] getPlayerNames() {
        return MinecraftServer.getServer().getAllUsernames();
    }

    @SuppressWarnings("unchecked")
    public static List<EntityPlayer> getPlayers() {
        return MinecraftServer.getServer().getConfigurationManager().playerEntityList;
    }

    public static void givePoints(EntityPlayerMP player, int points) {
        PlayerData data = getPlayerData(player);
        data.score += points;
        if (data.team != null)
            data.team.score += points;
    }

    public static EntityPlayerMP getPlayerFromDamageSource(DamageSource source) {
        EntityPlayerMP attacker = null;
        if (source instanceof EntityDamageSource) {
            if (source.getEntity() instanceof EntityPlayerMP)
                attacker = (EntityPlayerMP) source.getEntity();
        }
        return attacker;
    }

    public EntityPlayerMP getPlayer(String username) {
        return MinecraftServer.getServer().getConfigurationManager().func_152612_a(username);
    }

    public boolean shouldAutobalance() {
        return true;
    }
}
