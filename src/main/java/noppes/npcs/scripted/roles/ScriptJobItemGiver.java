// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.scripted.roles;

import noppes.npcs.entity.EntityNPCInterface;
import noppes.npcs.roles.JobItemGiver;

public class ScriptJobItemGiver extends ScriptJobInterface
{
    private JobItemGiver job;
    
    public ScriptJobItemGiver(final EntityNPCInterface npc) {
        super(npc);
        this.job = (JobItemGiver)npc.jobInterface;
    }
    
    @Override
    public int getType() {
        return 5;
    }
}
