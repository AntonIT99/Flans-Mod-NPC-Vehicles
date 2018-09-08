// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.ai;

import net.minecraft.entity.Entity;
import net.minecraft.util.Vec3;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EntityCreature;
import noppes.npcs.constants.AiMutex;
import noppes.npcs.entity.EntityNPCInterface;
import net.minecraft.entity.ai.EntityAIBase;

public class EntityAIDodgeShoot extends EntityAIBase
{
    private EntityNPCInterface entity;
    private double xPosition;
    private double yPosition;
    private double zPosition;
    
    public EntityAIDodgeShoot(final EntityNPCInterface par1EntityNPCInterface) {
        this.entity = par1EntityNPCInterface;
        this.setMutexBits((int)AiMutex.PASSIVE);
    }
    
    public boolean shouldExecute() {
        final EntityLivingBase var1 = this.entity.getAttackTarget();
        if (var1 == null || !var1.isEntityAlive()) {
            return false;
        }
        if (this.entity.inventory.getProjectile() == null) {
            return false;
        }
        if (this.entity.getRangedTask() == null) {
            return false;
        }
        final Vec3 vec = this.entity.getRangedTask().hasFired() ? RandomPositionGeneratorAlt.findRandomTarget(this.entity, 4, 1) : null;
        if (vec == null) {
            return false;
        }
        this.xPosition = vec.xCoord;
        this.yPosition = vec.yCoord;
        this.zPosition = vec.zCoord;
        return true;
    }
    
    public boolean continueExecuting() {
        return !this.entity.getNavigator().noPath();
    }
    
    public void startExecuting() {
        this.entity.getNavigator().tryMoveToXYZ(this.xPosition, this.yPosition, this.zPosition, 1.2);
    }
    
    public void updateTask() {
        if (this.entity.getAttackTarget() != null) {
            this.entity.getLookHelper().setLookPositionWithEntity((Entity)this.entity.getAttackTarget(), 30.0f, 30.0f);
        }
    }
}
