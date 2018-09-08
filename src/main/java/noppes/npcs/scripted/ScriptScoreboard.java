// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.scripted;

import net.minecraft.scoreboard.ScorePlayerTeam;
import net.minecraft.scoreboard.Score;
import net.minecraft.scoreboard.IScoreObjectiveCriteria;
import java.util.List;
import java.util.Collection;
import net.minecraft.scoreboard.ScoreObjective;
import java.util.ArrayList;
import net.minecraft.server.MinecraftServer;
import net.minecraft.scoreboard.Scoreboard;

public class ScriptScoreboard
{
    private Scoreboard board;
    
    protected ScriptScoreboard() {
        this.board = MinecraftServer.getServer().worldServerForDimension(0).getScoreboard();
    }
    
    public ScriptScoreboardObjective[] getObjectives() {
        final List<ScoreObjective> collection = new ArrayList<ScoreObjective>(this.board.getScoreObjectives());
        final ScriptScoreboardObjective[] objectives = new ScriptScoreboardObjective[collection.size()];
        for (int i = 0; i < collection.size(); ++i) {
            objectives[i] = new ScriptScoreboardObjective(collection.get(i));
        }
        return objectives;
    }
    
    public ScriptScoreboardObjective getObjective(final String name) {
        final ScoreObjective obj = this.board.getObjective(name);
        if (obj == null) {
            return null;
        }
        return new ScriptScoreboardObjective(obj);
    }
    
    public boolean hasObjective(final String objective) {
        return this.board.getObjective(objective) != null;
    }
    
    public void removeObjective(final String objective) {
        final ScoreObjective obj = this.board.getObjective(objective);
        if (obj != null) {
            this.board.func_96519_k(obj);
        }
    }
    
    public ScriptScoreboardObjective addObjective(final String objective, final String criteria) {
        if (this.hasObjective(objective)) {
            return null;
        }
        final IScoreObjectiveCriteria icriteria = (IScoreObjectiveCriteria) IScoreObjectiveCriteria.field_96643_a.get(criteria);
        if (icriteria == null) {
            return null;
        }
        if (objective.length() == 0 || objective.length() > 16) {
            return null;
        }
        final ScoreObjective obj = this.board.addScoreObjective(objective, icriteria);
        return new ScriptScoreboardObjective(obj);
    }
    
    public void setPlayerScore(final String player, final String objective, final int score, final String datatag) {
        final ScoreObjective objec = this.board.getObjective(objective);
        if (objec == null || objec.getCriteria().isReadOnly() || score < Integer.MIN_VALUE || score > Integer.MAX_VALUE) {
            return;
        }
        final Score sco = this.board.func_96529_a(player, objec);
        sco.setScorePoints(score);
    }
    
    public int getPlayerScore(final String player, final String objective, final String datatag) {
        final ScoreObjective objec = this.board.getObjective(objective);
        if (objec == null || objec.getCriteria().isReadOnly()) {
            return 0;
        }
        return this.board.func_96529_a(player, objec).getScorePoints();
    }
    
    public boolean hasPlayerObjective(final String player, final String objective, final String datatag) {
        final ScoreObjective objec = this.board.getObjective(objective);
        return objec != null && this.board.func_96510_d(player).get(objec) != null;
    }
    
    public void deletePlayerScore(final String player, final String objective, final String datatag) {
        final ScoreObjective objec = this.board.getObjective(objective);
        if (objec == null) {
            return;
        }
        if (this.board.func_96510_d(player).remove(objec) != null) {
            this.board.func_96516_a(player);
        }
    }
    
    public ScriptScoreboardTeam[] getTeams() {
        final List<ScorePlayerTeam> list = new ArrayList<ScorePlayerTeam>(this.board.getTeams());
        final ScriptScoreboardTeam[] teams = new ScriptScoreboardTeam[list.size()];
        for (int i = 0; i < list.size(); ++i) {
            teams[i] = new ScriptScoreboardTeam(list.get(i), this.board);
        }
        return teams;
    }
    
    public boolean hasTeam(final String name) {
        return this.board.getPlayersTeam(name) != null;
    }
    
    public ScriptScoreboardTeam addTeam(final String name) {
        if (this.hasTeam(name)) {
            return null;
        }
        return new ScriptScoreboardTeam(this.board.createTeam(name), this.board);
    }
    
    public ScriptScoreboardTeam getTeam(final String name) {
        final ScorePlayerTeam team = this.board.getPlayersTeam(name);
        if (team == null) {
            return null;
        }
        return new ScriptScoreboardTeam(team, this.board);
    }
    
    public void removeTeam(final String name) {
        final ScorePlayerTeam team = this.board.getPlayersTeam(name);
        if (team != null) {
            this.board.removeTeam(team);
        }
    }
}
