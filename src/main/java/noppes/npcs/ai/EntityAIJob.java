// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.ai;

import noppes.npcs.entity.EntityNPCInterface;
import net.minecraft.entity.ai.EntityAIBase;

public class EntityAIJob extends EntityAIBase
{
    private EntityNPCInterface npc;
    
    public EntityAIJob(final EntityNPCInterface npc) {
        this.npc = npc;
    }
    
    public boolean shouldExecute() {
        return !this.npc.isKilled() && this.npc.jobInterface != null && this.npc.jobInterface.aiShouldExecute();
    }
    
    public void startExecuting() {
        this.npc.jobInterface.aiStartExecuting();
    }
    
    public boolean continueExecuting() {
        return !this.npc.isKilled() && this.npc.jobInterface != null && this.npc.jobInterface.aiContinueExecute();
    }
    
    public void updateTask() {
        this.npc.jobInterface.aiUpdateTask();
    }
    
    public void resetTask() {
        if (this.npc.jobInterface != null) {
            this.npc.jobInterface.resetTask();
        }
    }
}
