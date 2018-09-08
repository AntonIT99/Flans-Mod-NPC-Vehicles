// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.scripted.roles;

import noppes.npcs.entity.EntityNPCInterface;
import noppes.npcs.roles.JobBard;

public class ScriptJobBard extends ScriptJobInterface
{
    private JobBard job;
    
    public ScriptJobBard(final EntityNPCInterface npc) {
        super(npc);
        this.job = (JobBard)npc.jobInterface;
    }
    
    @Override
    public int getType() {
        return 1;
    }
    
    public String getSong() {
        return this.job.song;
    }
    
    public void setSong(final String song) {
        this.job.song = song;
        this.npc.script.clientNeedsUpdate = true;
    }
}
