// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.ai.target;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.EntityLivingBase;
import noppes.npcs.entity.EntityNPCInterface;
import net.minecraft.entity.ai.EntityAITarget;

public class EntityAIClearTarget extends EntityAITarget
{
    private EntityNPCInterface npc;
    private EntityLivingBase target;
    
    public EntityAIClearTarget(final EntityNPCInterface npc) {
        super((EntityCreature)npc, false);
        this.npc = npc;
    }
    
    public boolean shouldExecute() {
        this.target = this.taskOwner.getAttackTarget();
        if (this.target == null) {
            return false;
        }
        if (this.target instanceof EntityPlayer && ((EntityPlayer)this.target).capabilities.disableDamage) {
            return true;
        }
        final int distance = this.npc.stats.aggroRange * 2 * this.npc.stats.aggroRange;
        return (this.npc.getOwner() != null && this.npc.getDistanceSqToEntity((Entity)this.npc.getOwner()) > distance) || this.npc.getDistanceSqToEntity((Entity)this.target) > distance;
    }
    
    public void startExecuting() {
        this.taskOwner.setAttackTarget((EntityLivingBase)null);
        if (this.target == this.taskOwner.getAITarget()) {
            this.taskOwner.setRevengeTarget((EntityLivingBase)null);
        }
        super.startExecuting();
    }
}
