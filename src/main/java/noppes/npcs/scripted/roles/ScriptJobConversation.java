// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.scripted.roles;

import noppes.npcs.entity.EntityNPCInterface;
import noppes.npcs.roles.JobConversation;

public class ScriptJobConversation extends ScriptJobInterface
{
    private JobConversation job;
    
    public ScriptJobConversation(final EntityNPCInterface npc) {
        super(npc);
        this.job = (JobConversation)npc.jobInterface;
    }
    
    @Override
    public int getType() {
        return 6;
    }
}
