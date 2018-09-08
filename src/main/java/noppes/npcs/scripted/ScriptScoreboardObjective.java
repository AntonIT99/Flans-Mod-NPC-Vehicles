// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.scripted;

import net.minecraft.scoreboard.ScoreObjective;

public class ScriptScoreboardObjective
{
    private ScoreObjective objective;
    
    protected ScriptScoreboardObjective(final ScoreObjective objective) {
        this.objective = objective;
    }
    
    public String getName() {
        return this.objective.getName();
    }
    
    public String getDisplayName() {
        return this.objective.getDisplayName();
    }
    
    public void setDisplayName(final String name) {
        if (name.length() > 0 && name.length() <= 32) {
            this.objective.setDisplayName(name);
        }
    }
    
    public String getCriteria() {
        return this.objective.getCriteria().func_96636_a();
    }
    
    public boolean isReadyOnly() {
        return this.objective.getCriteria().isReadOnly();
    }
}
