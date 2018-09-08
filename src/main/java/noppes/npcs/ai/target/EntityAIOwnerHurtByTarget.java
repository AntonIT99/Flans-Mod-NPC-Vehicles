// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.ai.target;

import noppes.npcs.constants.AiMutex;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLivingBase;
import noppes.npcs.entity.EntityNPCInterface;
import net.minecraft.entity.ai.EntityAITarget;

public class EntityAIOwnerHurtByTarget extends EntityAITarget
{
    EntityNPCInterface npc;
    EntityLivingBase theOwnerAttacker;
    private int field_142051_e;
    
    public EntityAIOwnerHurtByTarget(final EntityNPCInterface npc) {
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
        this.theOwnerAttacker = entitylivingbase.getAITarget();
        final int i = entitylivingbase.func_142015_aE();
        return i != this.field_142051_e && this.isSuitableTarget(this.theOwnerAttacker, false);
    }
    
    public void startExecuting() {
        this.taskOwner.setAttackTarget(this.theOwnerAttacker);
        final EntityLivingBase entitylivingbase = this.npc.getOwner();
        if (entitylivingbase != null) {
            this.field_142051_e = entitylivingbase.func_142015_aE();
        }
        super.startExecuting();
    }
}
