// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.ai;

import net.minecraft.pathfinding.PathPoint;
import net.minecraft.pathfinding.PathEntity;
import net.minecraft.util.Vec3;
import net.minecraft.util.MathHelper;
import net.minecraft.entity.Entity;
import noppes.npcs.constants.AiMutex;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.ai.EntityAIBase;

public class EntityAIZigZagTarget extends EntityAIBase
{
    private EntityCreature theEntity;
    private EntityLivingBase targetEntity;
    private double movePosX;
    private double movePosY;
    private double movePosZ;
    private int entityPosX;
    private int entityPosY;
    private int entityPosZ;
    private double speed;
    private float maxTargetDistance;
    
    public EntityAIZigZagTarget(final EntityCreature par1EntityCreature, final double par2, final float par4) {
        this.theEntity = par1EntityCreature;
        this.speed = par2;
        this.maxTargetDistance = par4;
        this.setMutexBits(AiMutex.PASSIVE + AiMutex.LOOK);
    }
    
    public boolean shouldExecute() {
        this.targetEntity = this.theEntity.getAttackTarget();
        if (this.targetEntity == null) {
            return false;
        }
        if (this.targetEntity.getDistanceSqToEntity((Entity)this.theEntity) < this.maxTargetDistance * this.maxTargetDistance) {
            return false;
        }
        final PathEntity pathentity = this.theEntity.getNavigator().getPathToEntityLiving((Entity)this.targetEntity);
        if (pathentity != null && pathentity.getCurrentPathLength() >= this.maxTargetDistance) {
            final PathPoint pathpoint = pathentity.getPathPointFromIndex(MathHelper.floor_double(this.maxTargetDistance / 2.0));
            this.entityPosX = pathpoint.xCoord;
            this.entityPosY = pathpoint.yCoord;
            this.entityPosZ = pathpoint.zCoord;
            final Vec3 vec3 = RandomPositionGeneratorAlt.findRandomTargetBlockTowards(this.theEntity, (int)this.maxTargetDistance, 3, Vec3.createVectorHelper((double)this.entityPosX, (double)this.entityPosY, (double)this.entityPosZ));
            if (vec3 != null && this.targetEntity.getDistanceSq(vec3.xCoord, vec3.yCoord, vec3.zCoord) < this.targetEntity.getDistanceSq((double)this.entityPosX, (double)this.entityPosY, (double)this.entityPosZ)) {
                this.movePosX = vec3.xCoord;
                this.movePosY = vec3.yCoord;
                this.movePosZ = vec3.zCoord;
                return true;
            }
        }
        return false;
    }
    
    public boolean continueExecuting() {
        return !this.theEntity.getNavigator().noPath() && this.targetEntity.isEntityAlive() && this.targetEntity.getDistanceSqToEntity((Entity)this.theEntity) > this.maxTargetDistance * this.maxTargetDistance;
    }
    
    public void startExecuting() {
        this.theEntity.getNavigator().tryMoveToXYZ(this.movePosX, this.movePosY, this.movePosZ, this.speed);
    }
    
    public void updateTask() {
        this.theEntity.getLookHelper().setLookPositionWithEntity((Entity)this.targetEntity, 30.0f, 30.0f);
    }
}
