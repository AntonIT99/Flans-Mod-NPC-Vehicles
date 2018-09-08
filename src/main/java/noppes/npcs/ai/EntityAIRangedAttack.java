// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.ai;

import noppes.npcs.constants.EnumAnimation;
import net.minecraft.util.MathHelper;
import noppes.npcs.constants.EnumNavType;
import net.minecraft.entity.Entity;
import noppes.npcs.constants.AiMutex;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IRangedAttackMob;
import noppes.npcs.entity.EntityNPCInterface;
import net.minecraft.entity.ai.EntityAIBase;

public class EntityAIRangedAttack extends EntityAIBase
{
    private final EntityNPCInterface entityHost;
    private final IRangedAttackMob rangedAttackEntityHost;
    private EntityLivingBase attackTarget;
    private int rangedAttackTime;
    private int field_75318_f;
    private int field_70846_g;
    private int attackTick;
    private boolean hasFired;
    private boolean navOverride;
    
    public EntityAIRangedAttack(final IRangedAttackMob par1IRangedAttackMob) {
        this.rangedAttackTime = 0;
        this.field_75318_f = 0;
        this.field_70846_g = 0;
        this.attackTick = 0;
        this.hasFired = false;
        this.navOverride = false;
        if (!(par1IRangedAttackMob instanceof EntityLivingBase)) {
            throw new IllegalArgumentException("ArrowAttackGoal requires Mob implements RangedAttackMob");
        }
        this.rangedAttackEntityHost = par1IRangedAttackMob;
        this.entityHost = (EntityNPCInterface)par1IRangedAttackMob;
        this.rangedAttackTime = this.entityHost.stats.minDelay / 2;
        this.setMutexBits(this.navOverride ? AiMutex.PATHING : (AiMutex.LOOK + AiMutex.PASSIVE));
    }
    
    public boolean shouldExecute() {
        final EntityLivingBase var1 = this.entityHost.getAttackTarget();
        if (var1 == null || !var1.isEntityAlive()) {
            return false;
        }
        if (this.entityHost.getDistanceToEntity((Entity)var1) > this.entityHost.stats.aggroRange) {
            return false;
        }
        if (this.entityHost.inventory.getProjectile() == null) {
            return false;
        }
        final double var2 = this.entityHost.getDistanceSq(var1.posX, var1.boundingBox.minY, var1.posZ);
        final double var3 = this.entityHost.ai.distanceToMelee * this.entityHost.ai.distanceToMelee;
        if (this.entityHost.ai.useRangeMelee >= 1 && var2 <= var3) {
            return false;
        }
        this.attackTarget = var1;
        return true;
    }
    
    public boolean continueExecuting() {
        return this.shouldExecute() || !this.entityHost.getNavigator().noPath();
    }
    
    public void resetTask() {
        this.attackTarget = null;
        this.entityHost.setAttackTarget(null);
        this.entityHost.getNavigator().clearPathEntity();
        this.field_75318_f = 0;
        this.hasFired = false;
        this.rangedAttackTime = this.entityHost.stats.minDelay / 2;
    }
    
    public void updateTask() {
        this.entityHost.getLookHelper().setLookPositionWithEntity((Entity)this.attackTarget, 30.0f, 30.0f);
        final double var1 = this.entityHost.getDistanceSq(this.attackTarget.posX, this.attackTarget.boundingBox.minY, this.attackTarget.posZ);
        final float field_82642_h = this.entityHost.stats.rangedRange * this.entityHost.stats.rangedRange;
        if (!this.navOverride && this.entityHost.ai.directLOS) {
            if (this.entityHost.getEntitySenses().canSee((Entity)this.attackTarget)) {
                ++this.field_75318_f;
            }
            else {
                this.field_75318_f = 0;
            }
            final int v = (this.entityHost.ai.tacticalVariant == EnumNavType.Default) ? 20 : 5;
            if (var1 <= field_82642_h && this.field_75318_f >= v) {
                this.entityHost.getNavigator().clearPathEntity();
            }
            else {
                this.entityHost.getNavigator().tryMoveToEntityLiving((Entity)this.attackTarget, 1.0);
            }
        }
        this.rangedAttackTime = Math.max(this.rangedAttackTime - 1, 0);
        if (this.rangedAttackTime <= 0 && var1 <= field_82642_h && (this.entityHost.getEntitySenses().canSee((Entity)this.attackTarget) || this.entityHost.ai.canFireIndirect == 2)) {
            if (this.field_70846_g++ <= this.entityHost.stats.burstCount) {
                this.rangedAttackTime = this.entityHost.stats.fireRate;
            }
            else {
                this.field_70846_g = 0;
                this.hasFired = true;
                this.rangedAttackTime = this.entityHost.stats.maxDelay - MathHelper.floor_float(this.entityHost.getRNG().nextFloat() * (this.entityHost.stats.maxDelay - this.entityHost.stats.minDelay));
            }
            if (this.field_70846_g > 1) {
                boolean indirect = false;
                switch (this.entityHost.ai.canFireIndirect) {
                    case 1: {
                        indirect = (var1 > field_82642_h / 2.0);
                        break;
                    }
                    case 2: {
                        indirect = !this.entityHost.getEntitySenses().canSee((Entity)this.attackTarget);
                        break;
                    }
                }
                this.rangedAttackEntityHost.attackEntityWithRangedAttack(this.attackTarget, indirect ? 1.0f : 0.0f);
                if (this.entityHost.currentAnimation != EnumAnimation.AIMING) {
                    this.entityHost.swingItem();
                }
            }
        }
    }
    
    public boolean hasFired() {
        return this.hasFired;
    }
    
    public void navOverride(final boolean nav) {
        this.navOverride = nav;
        this.setMutexBits(this.navOverride ? AiMutex.PATHING : (AiMutex.LOOK + AiMutex.PASSIVE));
    }
}
