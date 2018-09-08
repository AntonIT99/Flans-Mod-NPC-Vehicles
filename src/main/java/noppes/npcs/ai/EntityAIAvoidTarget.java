// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.ai;

import java.util.List;
import net.minecraft.entity.EntityLivingBase;
import noppes.npcs.constants.EnumNavType;
import net.minecraft.entity.EntityCreature;
import net.minecraft.util.Vec3;
import net.minecraft.entity.player.EntityPlayer;
import noppes.npcs.constants.AiMutex;
import net.minecraft.pathfinding.PathNavigate;
import net.minecraft.pathfinding.PathEntity;
import net.minecraft.entity.Entity;
import noppes.npcs.entity.EntityNPCInterface;
import net.minecraft.entity.ai.EntityAIBase;

public class EntityAIAvoidTarget extends EntityAIBase
{
    private EntityNPCInterface theEntity;
    private Entity closestLivingEntity;
    private float distanceFromEntity;
    private float health;
    private PathEntity entityPathEntity;
    private PathNavigate entityPathNavigate;
    private Class targetEntityClass;
    
    public EntityAIAvoidTarget(final EntityNPCInterface par1EntityNPC) {
        this.theEntity = par1EntityNPC;
        this.distanceFromEntity = this.theEntity.stats.aggroRange;
        this.health = this.theEntity.getHealth();
        this.entityPathNavigate = par1EntityNPC.getNavigator();
        this.setMutexBits(AiMutex.PASSIVE + AiMutex.LOOK);
    }
    
    public boolean shouldExecute() {
        final EntityLivingBase target = this.theEntity.getAttackTarget();
        if (target == null) {
            return false;
        }
        this.targetEntityClass = target.getClass();
        if (this.targetEntityClass == EntityPlayer.class) {
            this.closestLivingEntity = (Entity)this.theEntity.worldObj.getClosestPlayerToEntity((Entity)this.theEntity, (double)this.distanceFromEntity);
            if (this.closestLivingEntity == null) {
                return false;
            }
        }
        else {
            final List var1 = this.theEntity.worldObj.getEntitiesWithinAABB(this.targetEntityClass, this.theEntity.boundingBox.expand((double)this.distanceFromEntity, 3.0, (double)this.distanceFromEntity));
            if (var1.isEmpty()) {
                return false;
            }
            this.closestLivingEntity = (Entity) var1.get(0);
        }
        if (!this.theEntity.getEntitySenses().canSee(this.closestLivingEntity) && this.theEntity.ai.directLOS) {
            return false;
        }
        final Vec3 var2 = RandomPositionGeneratorAlt.findRandomTargetBlockAwayFrom(this.theEntity, 16, 7, Vec3.createVectorHelper(this.closestLivingEntity.posX, this.closestLivingEntity.posY, this.closestLivingEntity.posZ));
        final boolean var3 = this.theEntity.inventory.getProjectile() == null || this.theEntity.ai.useRangeMelee == 2;
        final boolean var4 = var3 ? (this.health == this.theEntity.getHealth()) : (this.theEntity.getRangedTask() != null && !this.theEntity.getRangedTask().hasFired());
        if (var2 == null) {
            return false;
        }
        if (this.closestLivingEntity.getDistanceSq(var2.xCoord, var2.yCoord, var2.zCoord) < this.closestLivingEntity.getDistanceSqToEntity((Entity)this.theEntity)) {
            return false;
        }
        if (this.theEntity.ai.tacticalVariant == EnumNavType.HitNRun && var4) {
            return false;
        }
        this.entityPathEntity = this.entityPathNavigate.getPathToXYZ(var2.xCoord, var2.yCoord, var2.zCoord);
        return this.entityPathEntity != null && this.entityPathEntity.isDestinationSame(var2);
    }
    
    public boolean continueExecuting() {
        return !this.entityPathNavigate.noPath();
    }
    
    public void startExecuting() {
        this.entityPathNavigate.setPath(this.entityPathEntity, 1.0);
    }
    
    public void resetTask() {
        this.closestLivingEntity = null;
        this.theEntity.setAttackTarget(null);
    }
    
    public void updateTask() {
        if (this.theEntity.getDistanceSqToEntity(this.closestLivingEntity) < 49.0) {
            this.theEntity.getNavigator().setSpeed(1.2);
        }
        else {
            this.theEntity.getNavigator().setSpeed(1.0);
        }
        if (this.theEntity.ai.tacticalVariant == EnumNavType.HitNRun) {
            final float dist = this.theEntity.getDistanceToEntity(this.closestLivingEntity);
            if (dist > this.distanceFromEntity || dist < this.theEntity.ai.tacticalRadius) {
                this.health = this.theEntity.getHealth();
            }
        }
    }
}
