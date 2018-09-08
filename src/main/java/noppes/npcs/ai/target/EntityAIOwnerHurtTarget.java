// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.ai.target;

import noppes.npcs.constants.AiMutex;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLivingBase;
import noppes.npcs.entity.EntityNPCInterface;
import net.minecraft.entity.ai.EntityAITarget;

public class EntityAIOwnerHurtTarget extends EntityAITarget
{
    EntityNPCInterface npc;
    EntityLivingBase theTarget;
    private int field_142050_e;
    
    public EntityAIOwnerHurtTarget(final EntityNPCInterface npc) {
        super((EntityCreature)npc, false);
        this.npc = npc;
        this.setMutexBits((int)AiMutex.PASSIVE);
    }
    
    public boolean shouldExecute() {
        if (!this.npc.isFollower() || this.npc.roleInterface == null || !this.npc.roleInterface.defendOwner()) {
            return false;
        }
        final EntityLivingBase entitylivingbase = this.npc.getOwner();
        if (entitylivingbase == null) {
            return false;
        }
        this.theTarget = entitylivingbase.getLastAttacker();
        final int i = entitylivingbase.getLastAttackerTime();
        return i != this.field_142050_e && this.isSuitableTarget(this.theTarget, false);
    }
    
    public void startExecuting() {
        this.taskOwner.setAttackTarget(this.theTarget);
        final EntityLivingBase entitylivingbase = this.npc.getOwner();
        if (entitylivingbase != null) {
            this.field_142050_e = entitylivingbase.getLastAttackerTime();
        }
        super.startExecuting();
    }
}
