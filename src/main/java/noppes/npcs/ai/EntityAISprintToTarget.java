// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.ai;

import net.minecraft.entity.Entity;
import noppes.npcs.constants.AiMutex;
import net.minecraft.entity.EntityLivingBase;
import noppes.npcs.entity.EntityNPCInterface;
import net.minecraft.entity.ai.EntityAIBase;

public class EntityAISprintToTarget extends EntityAIBase
{
    EntityNPCInterface runner;
    EntityLivingBase runTarget;
    
    public EntityAISprintToTarget(final EntityNPCInterface par1EntityLiving) {
        this.runner = par1EntityLiving;
        this.setMutexBits(AiMutex.PASSIVE + AiMutex.PATHING);
    }
    
    public boolean shouldExecute() {
        this.runTarget = this.runner.getAttackTarget();
        if (this.runTarget == null) {
            return false;
        }
        if (this.runner.getNavigator().noPath()) {
            return false;
        }
        switch (this.runner.ai.onAttack) {
            case 0: {
                return this.runner.getDistanceSqToEntity((Entity)this.runTarget) >= 64.0 && this.runner.onGround;
            }
            case 2: {
                return this.runner.getDistanceSqToEntity((Entity)this.runTarget) <= 49.0 && this.runner.onGround;
            }
            default: {
                return false;
            }
        }
    }
    
    public boolean continueExecuting() {
        return this.runner.isEntityAlive() && this.runner.onGround && this.runner.hurtTime <= 0 && this.runner.motionX != 0.0 && this.runner.motionZ != 0.0;
    }
    
    public void startExecuting() {
        this.runner.setSprinting(true);
    }
    
    public void resetTask() {
        this.runner.setSprinting(false);
    }
}
