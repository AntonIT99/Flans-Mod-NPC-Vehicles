// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.scripted;

import net.minecraft.util.EnumChatFormatting;
import java.util.Iterator;
import java.util.List;
import java.util.Collection;
import java.util.ArrayList;
import net.minecraft.scoreboard.Scoreboard;
import net.minecraft.scoreboard.ScorePlayerTeam;

public class ScriptScoreboardTeam
{
    private ScorePlayerTeam team;
    private Scoreboard board;
    
    protected ScriptScoreboardTeam(final ScorePlayerTeam team, final Scoreboard board) {
        this.team = team;
        this.board = board;
    }
    
    public String getName() {
        return this.team.getRegisteredName();
    }
    
    public String getDisplayName() {
        return this.team.func_96669_c();
    }
    
    public void setDisplayName(final String name) {
        if (name.length() > 0 && name.length() <= 32) {
            this.team.setTeamName(name);
        }
    }
    
    public void addPlayer(final String player) {
        this.board.func_151392_a(player, this.getName());
    }
    
    public void removePlayer(final String player) {
        this.board.removePlayerFromTeam(player, this.team);
    }
    
    public String[] getPlayers() {
        final List<String> list = new ArrayList<String>(this.team.getMembershipCollection());
        return list.toArray(new String[list.size()]);
    }
    
    public void clearPlayers() {
        final List<String> list = new ArrayList<String>(this.team.getMembershipCollection());
        for (final String player : list) {
            this.board.removePlayerFromTeam(player, this.team);
        }
    }
    
    public boolean getFriendlyFire() {
        return this.team.getAllowFriendlyFire();
    }
    
    public void setFriendlyFire(final boolean bo) {
        this.team.setAllowFriendlyFire(bo);
    }
    
    public void setColor(final String color) {
        final EnumChatFormatting enumchatformatting = EnumChatFormatting.getValueByName(color);
        if (enumchatformatting == null || enumchatformatting.isFancyStyling()) {
            return;
        }
        this.team.setNamePrefix(enumchatformatting.toString());
        this.team.setNameSuffix(EnumChatFormatting.RESET.toString());
    }
    
    public String getColor() {
        final String prefix = this.team.getColorPrefix();
        if (prefix == null || prefix.isEmpty()) {
            return null;
        }
        for (final EnumChatFormatting format : EnumChatFormatting.values()) {
            if (prefix.equals(format.toString()) && format != EnumChatFormatting.RESET) {
                return format.getFriendlyName();
            }
        }
        return null;
    }
    
    public void setSeeInvisibleTeamPlayers(final boolean bo) {
        this.team.setSeeFriendlyInvisiblesEnabled(bo);
    }
    
    public boolean getSeeInvisibleTeamPlayers() {
        return this.team.func_98297_h();
    }
}
