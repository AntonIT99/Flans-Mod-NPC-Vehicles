// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.ai;

import noppes.npcs.constants.AiMutex;
import noppes.npcs.entity.EntityNPCInterface;
import net.minecraft.entity.ai.EntityAIBase;

public class EntityAIWorldLines extends EntityAIBase
{
    private EntityNPCInterface npc;
    
    public EntityAIWorldLines(final EntityNPCInterface npc) {
        this.npc = npc;
        this.setMutexBits((int)AiMutex.PASSIVE);
    }
    
    public boolean shouldExecute() {
        return !this.npc.isAttacking() && !this.npc.isKilled() && this.npc.advanced.hasWorldLines() && this.npc.getRNG().nextInt(1900) == 1;
    }
    
    public void startExecuting() {
        this.npc.saySurrounding(this.npc.advanced.getWorldLine());
    }
}
