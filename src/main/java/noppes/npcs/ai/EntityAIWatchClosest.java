// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.ai;

import net.minecraft.entity.player.EntityPlayer;
import noppes.npcs.constants.AiMutex;
import net.minecraft.entity.Entity;
import noppes.npcs.entity.EntityNPCInterface;
import net.minecraft.entity.ai.EntityAIBase;

public class EntityAIWatchClosest extends EntityAIBase
{
    private EntityNPCInterface theWatcher;
    protected Entity closestEntity;
    private float maxDistanceForPlayer;
    private int lookTime;
    private float field_75331_e;
    private Class watchedClass;
    
    public EntityAIWatchClosest(final EntityNPCInterface par1EntityLiving, final Class par2Class, final float par3) {
        this.theWatcher = par1EntityLiving;
        this.watchedClass = par2Class;
        this.maxDistanceForPlayer = par3;
        this.field_75331_e = 0.002f;
        this.setMutexBits((int)AiMutex.LOOK);
    }
    
    public boolean shouldExecute() {
        if (this.theWatcher.getRNG().nextFloat() >= this.field_75331_e || this.theWatcher.isInteracting()) {
            return false;
        }
        if (this.theWatcher.getAttackTarget() != null) {
            this.closestEntity = (Entity)this.theWatcher.getAttackTarget();
        }
        if (this.watchedClass == EntityPlayer.class) {
            this.closestEntity = (Entity)this.theWatcher.worldObj.getClosestPlayerToEntity((Entity)this.theWatcher, (double)this.maxDistanceForPlayer);
        }
        else {
            this.closestEntity = this.theWatcher.worldObj.findNearestEntityWithinAABB(this.watchedClass, this.theWatcher.boundingBox.expand((double)this.maxDistanceForPlayer, 3.0, (double)this.maxDistanceForPlayer), (Entity)this.theWatcher);
            if (this.closestEntity != null) {
                return this.theWatcher.canSee(this.closestEntity);
            }
        }
        return this.closestEntity != null;
    }
    
    public boolean continueExecuting() {
        return !this.theWatcher.isInteracting() && !this.theWatcher.isAttacking() && this.closestEntity.isEntityAlive() && this.theWatcher.isEntityAlive() && this.theWatcher.getDistanceSqToEntity(this.closestEntity) <= this.maxDistanceForPlayer * this.maxDistanceForPlayer && this.lookTime > 0;
    }
    
    public void startExecuting() {
        this.lookTime = 60 + this.theWatcher.getRNG().nextInt(60);
    }
    
    public void resetTask() {
        this.closestEntity = null;
    }
    
    public void updateTask() {
        this.theWatcher.getLookHelper().setLookPosition(this.closestEntity.posX, this.closestEntity.posY + this.closestEntity.getEyeHeight(), this.closestEntity.posZ, 10.0f, (float)this.theWatcher.getVerticalFaceSpeed());
        --this.lookTime;
    }
}
