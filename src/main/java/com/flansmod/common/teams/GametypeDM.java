package com.flansmod.common.teams;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.Vec3;

import com.flansmod.common.PlayerData;

public class GameTypeDM extends GameType {
    public int scoreLimit = 25;
    public int newRoundTimer = 0;
    public int time;

    public GameTypeDM() {
        super("Free For All", "DM", 2, true);
    }

    @Override
    public void roundStart() {

    }

    @Override
    public void roundEnd() {
        if (teamsManager.currentRound.teams != null && teamsManager.currentRound.teams[0] != null && teamsManager.currentRound.teams[1] != null) {
            Team teamA = teamsManager.currentRound.teams[0];
            Team teamB = teamsManager.currentRound.teams[1];
            teamA.sortPlayers();
            teamB.sortPlayers();
            EntityPlayerMP bestPlayerA = null;
            EntityPlayerMP bestPlayerB = null;
            if (teamA.members != null) {
                for (String name : teamA.members) {
                    getPlayerInfo(getPlayer(name)).playedRounds++;
                    getPlayerInfo(getPlayer(name)).updateAVG();
                    getPlayerInfo(getPlayer(name)).savePlayerStats();
                }
            }
            if (teamB.members != null) {
                for (String name : teamB.members) {
                    getPlayerInfo(getPlayer(name)).playedRounds++;
                    getPlayerInfo(getPlayer(name)).updateAVG();
                    getPlayerInfo(getPlayer(name)).savePlayerStats();
                }
            }
            if (teamA.members != null) {
                for (String name : teamA.members) {
                    PlayerData data = getPlayerData(getPlayer(name));
                    int bestScore = 0;
                    if (data.score > bestScore) {
                        bestPlayerA = getPlayer(name);
                        bestScore = data.score;
                    }
                }
            }
            if (teamB.members != null) {
                for (String name : teamB.members) {
                    PlayerData data = getPlayerData(getPlayer(name));
                    int bestScore = 0;
                    if (data.score > bestScore) {
                        bestPlayerB = getPlayer(name);
                        bestScore = data.score;
                    }
                }
            }
            if (bestPlayerA != null && bestPlayerB != null) {
                if (getPlayerData(bestPlayerA).score > getPlayerData(bestPlayerB).score) {
                    getPlayerInfo(bestPlayerA).addExp(250);
                    getPlayerInfo(bestPlayerA).MVPCount++;
                    getPlayerInfo(bestPlayerA).savePlayerStats();
                } else if (getPlayerData(bestPlayerA).score < getPlayerData(bestPlayerB).score) {
                    getPlayerInfo(bestPlayerB).addExp(250);
                    getPlayerInfo(bestPlayerB).MVPCount++;
                    getPlayerInfo(bestPlayerB).savePlayerStats();
                }
            }
        }
    }

    @Override
    public void roundCleanup() {

    }

    @Override
    public void tick() {
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
            //Spectators may not attack players
            if (getPlayerData(attacker).team == Team.spectators)
                return false;
        }
        //Players may not attack spectators
        if (getPlayerData(player).team == Team.spectators)
            return false;
        return true;
    }

    @Override
    public void playerKilled(EntityPlayerMP player, DamageSource source) {
        EntityPlayerMP attacker = getPlayerFromDamageSource(source);
        if (attacker != null) {
            if (attacker == player)
                getPlayerData(player).score--;
            else {
                getPlayerData(attacker).score++;
                getPlayerData(attacker).kills++;
                getPlayerInfo(attacker).kills++;
                getPlayerInfo(attacker).addExp(getPlayerInfo(player).rank * 2.2F);
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
    public Vec3 getSpawnPoint(EntityPlayerMP player) {
        if (teamsManager.currentRound == null)
            return null;
        PlayerData data = getPlayerData(player);
        List<ITeamObject> validSpawnPoints = new ArrayList<ITeamObject>();
        if (data.newTeam == null)
            return null;

        //Check each team's spawnpoints
        if (data.newTeam == Team.spectators) {
            ArrayList<ITeamBase> bases = teamsManager.currentRound.map.getBasesPerTeam(teamsManager.currentRound.getTeamID(data.newTeam));
            for (ITeamBase base : bases) {
                if (base.getMap().equals(teamsManager.currentRound.map)) {
                    for (int i = 0; i < base.getObjects().size(); i++) {
                        if (base.getObjects().get(i).isSpawnPoint())
                            validSpawnPoints.add(base.getObjects().get(i));
                    }
                }
            }
        } else {
            for (int k = 2; k < 4; k++) {
                ArrayList<ITeamBase> bases = teamsManager.currentRound.map.getBasesPerTeam(k);
                for (ITeamBase base : bases) {
                    if (base.getMap() != teamsManager.currentRound.map)
                        continue;
                    for (int i = 0; i < base.getObjects().size(); i++) {
                        if (base.getObjects().get(i).isSpawnPoint())
                            validSpawnPoints.add(base.getObjects().get(i));
                    }
                }
            }
        }
        if (validSpawnPoints.size() > 0) {
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
        if (variable.toLowerCase().equals("scorelimit")) {
            scoreLimit = Integer.parseInt(value);
            return true;
        }
        return false;
    }

    @Override
    public void readFromNBT(NBTTagCompound tags) {
        scoreLimit = tags.getInteger("DMScoreLimit");
    }

    @Override
    public void saveToNBT(NBTTagCompound tags) {
        tags.setInteger("DMScoreLimit", scoreLimit);
    }


    @Override
    public boolean sortScoreboardByTeam() {
        return false;
    }

    public boolean shouldAutobalance() {
        return false;
    }

    @Override
    public boolean teamHasWon(Team team) {
        return false;
    }
}
