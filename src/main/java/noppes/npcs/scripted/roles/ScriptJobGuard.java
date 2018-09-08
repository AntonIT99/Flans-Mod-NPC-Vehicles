// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.scripted.roles;

import noppes.npcs.entity.EntityNPCInterface;
import noppes.npcs.roles.JobGuard;

public class ScriptJobGuard extends ScriptJobInterface
{
    private JobGuard job;
    
    public ScriptJobGuard(final EntityNPCInterface npc) {
        super(npc);
        this.job = (JobGuard)npc.jobInterface;
    }
    
    @Override
    public int getType() {
        return 3;
    }
}
