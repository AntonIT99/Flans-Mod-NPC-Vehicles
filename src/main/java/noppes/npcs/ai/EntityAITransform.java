// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.ai;

import noppes.npcs.constants.AiMutex;
import noppes.npcs.entity.EntityNPCInterface;
import net.minecraft.entity.ai.EntityAIBase;

public class EntityAITransform extends EntityAIBase
{
    private EntityNPCInterface npc;
    
    public EntityAITransform(final EntityNPCInterface npc) {
        this.npc = npc;
        this.setMutexBits((int)AiMutex.PASSIVE);
    }
    
    public boolean shouldExecute() {
        return !this.npc.isKilled() && !this.npc.isAttacking() && !this.npc.transform.editingModus && ((this.npc.worldObj.getWorldTime() % 24000L < 12000L) ? this.npc.transform.isActive : (!this.npc.transform.isActive));
    }
    
    public void startExecuting() {
        this.npc.transform.transform(!this.npc.transform.isActive);
    }
}
