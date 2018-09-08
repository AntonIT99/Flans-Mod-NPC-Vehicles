// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.ai;

import noppes.npcs.entity.EntityNPCInterface;
import net.minecraft.entity.ai.EntityAIBase;

public class EntityAIRole extends EntityAIBase
{
    private EntityNPCInterface npc;
    
    public EntityAIRole(final EntityNPCInterface npc) {
        this.npc = npc;
    }
    
    public boolean shouldExecute() {
        return !this.npc.isKilled() && this.npc.roleInterface != null && this.npc.roleInterface.aiShouldExecute();
    }
    
    public void startExecuting() {
        this.npc.roleInterface.aiStartExecuting();
    }
    
    public boolean continueExecuting() {
        return !this.npc.isKilled() && this.npc.roleInterface != null && this.npc.roleInterface.aiContinueExecute();
    }
    
    public void updateTask() {
        if (this.npc.roleInterface != null) {
            this.npc.roleInterface.aiUpdateTask();
        }
    }
}
