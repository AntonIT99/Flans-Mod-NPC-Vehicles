// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.scripted.roles;

import noppes.npcs.scripted.ScriptLivingBase;
import noppes.npcs.entity.EntityNPCInterface;
import noppes.npcs.roles.JobHealer;

public class ScriptJobHealer extends ScriptJobInterface
{
    private JobHealer job;
    
    public ScriptJobHealer(final EntityNPCInterface npc) {
        super(npc);
        this.job = (JobHealer)npc.jobInterface;
    }
    
    public void heal(final ScriptLivingBase entity, final float amount) {
        this.job.heal(entity.getMinecraftEntity(), amount);
    }
    
    @Override
    public int getType() {
        return 2;
    }
}
