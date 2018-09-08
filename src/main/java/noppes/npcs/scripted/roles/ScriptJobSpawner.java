// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.scripted.roles;

import java.util.Iterator;
import java.util.ArrayList;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;
import noppes.npcs.controllers.ScriptController;
import noppes.npcs.scripted.ScriptLivingBase;
import noppes.npcs.entity.EntityNPCInterface;
import noppes.npcs.roles.JobSpawner;

public class ScriptJobSpawner extends ScriptJobInterface
{
    private JobSpawner job;
    
    public ScriptJobSpawner(final EntityNPCInterface npc) {
        super(npc);
        this.job = (JobSpawner)npc.jobInterface;
    }
    
    @Override
    public int getType() {
        return 6;
    }
    
    public ScriptLivingBase spawnEntity(final int number) {
        final EntityLivingBase base = this.job.spawnEntity(number);
        if (base == null) {
            return null;
        }
        return (ScriptLivingBase)ScriptController.Instance.getScriptForEntity((Entity)base);
    }
    
    public void removeAllSpawned() {
        for (final EntityLivingBase entity : this.job.spawned) {
            entity.isDead = true;
        }
        this.job.spawned = new ArrayList<EntityLivingBase>();
    }
}
