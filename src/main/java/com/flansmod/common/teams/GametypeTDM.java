package com.flansmod.common.teams;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.Vec3;

import com.flansmod.common.PlayerData;

public class GameTypeTDM extends GameType {
    public boolean friendlyFire = false;
    public boolean autoBalance = true;
    public int scoreLimit = 25;
    public int time;

    public GameTypeTDM() {
        super("Team Deathmatch", "TDM", 2,true);
    }

    @Override
    public void roundStart() {

    }

    @Override
    public void roundEnd()
    {
        if(teamsManager.currentRound.teams!=null && teamsManager.currentRound.teams[0]!=null && teamsManager.currentRound.teams[1]!=null){
            Team teamA = teamsManager.currentRound.teams[0];
            Team teamB = teamsManager.currentRound.teams[1];
            teamA.sortPlayers();
            teamB.sortPlayers();
            EntityPlayerMP bestPlayerA = null;
            EntityPlayerMP bestPlayerB = null;
            if(teamA.members!=null) {
                for (String name : teamA.members) {
                    getPlayerInfo(getPlayer(name)).playedRounds++;
                    getPlayerInfo(getPlayer(name)).updateAVG();
                    getPlayerInfo(getPlayer(name)).savePlayerStats();
                }
            }
            if(teamB.members!=null) {
                for (String name : teamB.members) {
                    getPlayerInfo(getPlayer(name)).playedRounds++;
                    getPlayerInfo(getPlayer(name)).updateAVG();
                    getPlayerInfo(getPlayer(name)).savePlayerStats();
                }
            }
            if(teamA.members!=null) {
                for (String name : teamA.members) {
                    PlayerData data = getPlayerData(getPlayer(name));
                    int bestScore = 0;
                    if (data.score > bestScore) {
                        bestPlayerA = getPlayer(name);
                        bestScore = data.score;
                    }
                }
            }
            if(teamB.members!=null) {
                for (String name : teamB.members) {
                    PlayerData data = getPlayerData(getPlayer(name));
                    int bestScore = 0;
                    if (data.score > bestScore) {
                        bestPlayerB = getPlayer(name);
                        bestScore = data.score;
                    }
                }
            }
            if(bestPlayerA!=null){
                getPlayerInfo(bestPlayerA).addExp(250);
                getPlayerInfo(bestPlayerA).MVPCount++;
                getPlayerInfo(bestPlayerA).savePlayerStats();
            }
            if(bestPlayerB!=null){
                getPlayerInfo(bestPlayerB).addExp(250);
                getPlayerInfo(bestPlayerB).MVPCount++;
                getPlayerInfo(bestPlayerB).savePlayerStats();
            }
        }
    }

    @Override
    public void roundCleanup() {

    }

    @Override
    public void tick() {
//        if (autoBalance && time % autoBalanceInterval == autoBalanceInterval - 200 && needAutobalance()) {
//            TeamsManager.messageAll("\u00a7fAutobalancing teams...");
//        }
//        if (autoBalance && time % autoBalanceInterval == 0 && needAutobalance()) {
//            autobalance();
//        }
    }

//    public boolean needAutobalance() {
//        if (teamsManager.currentRound == null || teamsManager.currentRound.teams[0] == null || teamsManager.currentRound.teams[1] == null)
//            return false;
//        int membersTeamA = teamsManager.currentRound.teams[0].members.size();
//        int membersTeamB = teamsManager.currentRound.teams[1].members.size();
//        if (Math.abs(membersTeamA - membersTeamB) > 1)
//            return true;
//        return false;
//    }
//
//    public void autobalance() {
//        if (teamsManager.currentRound.teams == null || teamsManager.currentRound.teams[0] == null || teamsManager.currentRound.teams[1] == null)
//            return;
//        int membersTeamA = teamsManager.currentRound.teams[0].members.size();
//        int membersTeamB = teamsManager.currentRound.teams[1].members.size();
//        if (membersTeamA - membersTeamB > 1) {
//            for (int i = 0; i < (membersTeamA - membersTeamB) / 2; i++) {
//                //My goodness this is convoluted...
//                EntityPlayerMP player = getPlayer(teamsManager.currentRound.teams[1].addPlayer(teamsManager.currentRound.teams[0].removeWorstPlayer()));
//                if (!player.isDead) {
//                    teamsManager.messagePlayer(player, "You have been moved to " + teamsManager.currentRound.teams[1].name);
//                    teamsManager.sendClassMenuToPlayer(player);
//                }
//            }
//        }
//        if (membersTeamB - membersTeamA > 1) {
//            for (int i = 0; i < (membersTeamB - membersTeamA) / 2; i++) {
//                EntityPlayerMP player = getPlayer(teamsManager.currentRound.teams[0].addPlayer(teamsManager.currentRound.teams[1].removeWorstPlayer()));
//                if (!player.isDead) {
//                    teamsManager.messagePlayer(player, "You have been moved to " + teamsManager.currentRound.teams[0].name);
//                    teamsManager.sendClassMenuToPlayer(player);
//                }
//            }
//        }
//    }

    @Override
    public void playerJoined(EntityPlayerMP player) {
    }

    @Override
    public void playerQuit(EntityPlayerMP player) {
    }

    @Override
    public boolean playerAttacked(EntityPlayerMP player, DamageSource source) {
        if (getPlayerData(player) == null || getPlayerData(player).team == null)
            return false;
        EntityPlayerMP attacker = getPlayerFromDamageSource(source);
        if (attacker != null) {
            if (getPlayerData(attacker) == null || getPlayerData(attacker).team == null)
                return false;
            //Check for friendly fire
            if (getPlayerData(player).team == getPlayerData(attacker).team)
                return friendlyFire;
        }
        //Players may not attack spectators
        return getPlayerData(player).team != Team.spectators;
    }

    @Override
    public boolean playerCanAttack(EntityPlayerMP attacker, Team attackerTeam, EntityPlayerMP victim, Team victimTeam) {
        return attackerTeam != victimTeam || friendlyFire;
    }

    @Override
    public void playerKilled(EntityPlayerMP player, DamageSource source) {
        EntityPlayerMP attacker = getPlayerFromDamageSource(source);
        if (attacker != null) {
            //They killed themself. -1 point.
            if (attacker == player)
                getPlayerData(player).score--;
                //They teamkilled. -1 point.
            else if (getPlayerData(attacker).team == getPlayerData(player).team) {
                getPlayerData(attacker).score--;
            }
            //They killed an enemy. +1 point to them and their team
            else {
                givePoints(attacker, 1);
                getPlayerData(attacker).kills++;
                getPlayerInfo(attacker).kills++;
                getPlayerInfo(attacker).addExp(getPlayerInfo(player).rank*2);
                getPlayerInfo(attacker).updateLongestKill(attacker.getDistanceToEntity(player));
                getPlayerInfo(attacker).savePlayerStats();
            }
        } else {
            getPlayerData(player).score--;
        }
        getPlayerData(player).deaths++;
        getPlayerInfo(player).deaths++;
        getPlayerInfo(player).savePlayerStats();
    }

    @Override
    public void baseAttacked(ITeamBase base, DamageSource source) {

    }

    @Override
    public void objectAttacked(ITeamObject object, DamageSource source) {

    }

    @Override
    public void baseClickedByPlayer(ITeamBase base, EntityPlayerMP player) {

    }

    @Override
    public void objectClickedByPlayer(ITeamObject object, EntityPlayerMP player) {

    }

    @Override
    public Vec3 getSpawnPoint(EntityPlayerMP player)
    {
        if(teamsManager.currentRound == null) {
            return null;
        }
        PlayerData data = getPlayerData(player);
        List<ITeamObject> validSpawnPoints = new ArrayList<ITeamObject>();
        if(data.newTeam == null){
            return null;
        }

        ArrayList<ITeamBase> bases = teamsManager.currentRound.map.getBasesPerTeam(teamsManager.currentRound.getTeamID(data.newTeam));
        for (ITeamBase base : bases) {
            if (base.getMap().equals(teamsManager.currentRound.map)) {
                for (int i = 0; i < base.getObjects().size(); i++) {
                    if (base.getObjects().get(i).isSpawnPoint())
                        validSpawnPoints.add(base.getObjects().get(i));
                }
            }
        }

        if(validSpawnPoints.size() > 0)
        {
            ITeamObject spawnPoint = validSpawnPoints.get(rand.nextInt(validSpawnPoints.size()));
            return Vec3.createVectorHelper(spawnPoint.getPosX(), spawnPoint.getPosY(), spawnPoint.getPosZ());
        }
        return null;
    }


    @Override
    public void playerRespawned(EntityPlayerMP player) {

    }

    @Override
    public boolean setVariable(String variable, String value) {
        if (variable.equalsIgnoreCase("scorelimit")) {
            scoreLimit = Integer.parseInt(value);
            return true;
        }
        if (variable.equalsIgnoreCase("friendlyfire")) {
            friendlyFire = Boolean.parseBoolean(value);
            return true;
        }
        if (variable.equalsIgnoreCase("autobalance")) {
            autoBalance = Boolean.parseBoolean(value);
            return true;
        }
        return false;
    }

    @Override
    public void readFromNBT(NBTTagCompound tags) {
        scoreLimit = tags.getInteger("TDMScoreLimit");
        friendlyFire = tags.getBoolean("TDMFriendlyFire");
        autoBalance = tags.getBoolean("TDMAutoBalance");
    }

    @Override
    public void saveToNBT(NBTTagCompound tags) {
        tags.setInteger("TDMScoreLimit", scoreLimit);
        tags.setBoolean("TDMFriendlyFire", friendlyFire);
        tags.setBoolean("TDMAutoBalance", autoBalance);
    }

    @Override
    public boolean sortScoreboardByTeam() {
        return true;
    }

    @Override
    public boolean teamHasWon(Team team) {
        return teamsManager.currentRound != null && team.score == teamsManager.currentRound.scoreLimit;
    }
}
