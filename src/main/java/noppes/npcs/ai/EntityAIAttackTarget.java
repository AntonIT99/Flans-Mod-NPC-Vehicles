// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.ai;

import net.minecraft.util.MathHelper;
import net.minecraft.entity.Entity;
import noppes.npcs.constants.AiMutex;
import net.minecraft.pathfinding.PathEntity;
import net.minecraft.entity.EntityLivingBase;
import noppes.npcs.entity.EntityNPCInterface;
import net.minecraft.world.World;
import net.minecraft.entity.ai.EntityAIBase;

public class EntityAIAttackTarget extends EntityAIBase
{
    World worldObj;
    EntityNPCInterface attacker;
    EntityLivingBase entityTarget;
    int attackTick;
    PathEntity entityPathEntity;
    private int field_75445_i;
    private boolean navOverride;
    
    public EntityAIAttackTarget(final EntityNPCInterface par1EntityLiving) {
        this.navOverride = false;
        this.attackTick = 0;
        this.attacker = par1EntityLiving;
        this.worldObj = par1EntityLiving.worldObj;
        this.setMutexBits(this.navOverride ? AiMutex.PATHING : (AiMutex.LOOK + AiMutex.PASSIVE));
    }
    
    public boolean shouldExecute() {
        final EntityLivingBase entitylivingbase = this.attacker.getAttackTarget();
        if (entitylivingbase == null) {
            return false;
        }
        if (!entitylivingbase.isEntityAlive()) {
            return false;
        }
        if (this.attacker.inventory.getProjectile() != null && this.attacker.ai.useRangeMelee == 0) {
            return false;
        }
        final double var2 = this.attacker.getDistanceSq(entitylivingbase.posX, entitylivingbase.boundingBox.minY, entitylivingbase.posZ);
        final double var3 = this.attacker.ai.distanceToMelee * this.attacker.ai.distanceToMelee;
        if (this.attacker.ai.useRangeMelee == 1 && var2 > var3) {
            return false;
        }
        this.entityTarget = entitylivingbase;
        this.entityPathEntity = this.attacker.getNavigator().getPathToEntityLiving((Entity)entitylivingbase);
        return this.entityPathEntity != null;
    }
    
    public boolean continueExecuting() {
        this.entityTarget = this.attacker.getAttackTarget();
        return this.entityTarget != null && this.entityTarget.isEntityAlive() && this.attacker.getDistanceToEntity((Entity)this.entityTarget) <= this.attacker.stats.aggroRange && (this.attacker.ai.useRangeMelee != 1 || this.attacker.getDistanceSqToEntity((Entity)this.entityTarget) <= this.attacker.ai.distanceToMelee * this.attacker.ai.distanceToMelee) && this.attacker.isWithinHomeDistance(MathHelper.floor_double(this.entityTarget.posX), MathHelper.floor_double(this.entityTarget.posY), MathHelper.floor_double(this.entityTarget.posZ));
    }
    
    public void startExecuting() {
        if (!this.navOverride) {
            this.attacker.getNavigator().setPath(this.entityPathEntity, 1.3);
        }
        this.field_75445_i = 0;
        if (this.attacker.getRangedTask() != null && this.attacker.ai.useRangeMelee == 2) {
            this.attacker.getRangedTask().navOverride(true);
        }
    }
    
    public void resetTask() {
        this.entityPathEntity = null;
        this.entityTarget = null;
        this.attacker.setAttackTarget(null);
        this.attacker.getNavigator().clearPathEntity();
        if (this.attacker.getRangedTask() != null && this.attacker.ai.useRangeMelee == 2) {
            this.attacker.getRangedTask().navOverride(false);
        }
    }
    
    public void updateTask() {
        this.attacker.getLookHelper().setLookPositionWithEntity((Entity)this.entityTarget, 30.0f, 30.0f);
        if (!this.navOverride && --this.field_75445_i <= 0) {
            this.field_75445_i = 4 + this.attacker.getRNG().nextInt(7);
            this.attacker.getNavigator().tryMoveToEntityLiving((Entity)this.entityTarget, 1.2999999523162842);
        }
        this.attackTick = Math.max(this.attackTick - 1, 0);
        final double distance = this.attacker.getDistanceSq(this.entityTarget.posX, this.entityTarget.boundingBox.minY, this.entityTarget.posZ);
        double range = this.attacker.stats.attackRange * this.attacker.stats.attackRange + this.entityTarget.width;
        final double minRange = this.attacker.width * 2.0f * this.attacker.width * 2.0f + this.entityTarget.width;
        if (minRange > range) {
            range = minRange;
        }
        if (distance <= range && (this.attacker.canSee((Entity)this.entityTarget) || distance < minRange) && this.attackTick <= 0) {
            this.attackTick = this.attacker.stats.attackSpeed;
            this.attacker.swingItem();
            this.attacker.attackEntityAsMob((Entity)this.entityTarget);
        }
    }
    
    public void navOverride(final boolean nav) {
        this.navOverride = nav;
        this.setMutexBits(this.navOverride ? AiMutex.PATHING : (AiMutex.LOOK + AiMutex.PASSIVE));
    }
}
