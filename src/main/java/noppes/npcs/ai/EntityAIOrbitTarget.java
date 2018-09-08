// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.ai;

import net.minecraft.util.MathHelper;
import java.util.Random;
import net.minecraft.entity.Entity;
import noppes.npcs.constants.AiMutex;
import net.minecraft.entity.EntityLivingBase;
import noppes.npcs.entity.EntityNPCInterface;
import net.minecraft.entity.ai.EntityAIBase;

public class EntityAIOrbitTarget extends EntityAIBase
{
    private EntityNPCInterface theEntity;
    private EntityLivingBase targetEntity;
    private double movePosX;
    private double movePosY;
    private double movePosZ;
    private double speed;
    private float distance;
    private int delay;
    private float angle;
    private int direction;
    private float targetDistance;
    private boolean decay;
    private boolean canNavigate;
    private float decayRate;
    private int tick;
    
    public EntityAIOrbitTarget(final EntityNPCInterface par1EntityCreature, final double par2, final float par4, final boolean par5) {
        this.delay = 0;
        this.angle = 0.0f;
        this.direction = 1;
        this.canNavigate = true;
        this.decayRate = 1.0f;
        this.tick = 0;
        this.theEntity = par1EntityCreature;
        this.speed = par2;
        this.distance = par4;
        this.decay = par5;
        this.setMutexBits(AiMutex.PASSIVE + AiMutex.LOOK);
    }
    
    public boolean shouldExecute() {
        final int delay = this.delay - 1;
        this.delay = delay;
        if (delay > 0) {
            return false;
        }
        this.targetEntity = this.theEntity.getAttackTarget();
        if (this.targetEntity == null) {
            return false;
        }
        final double d0 = this.theEntity.getDistanceToEntity((Entity)this.targetEntity);
        return d0 >= this.distance / 2.0f && (this.theEntity.inventory.getProjectile() != null || d0 <= this.distance);
    }
    
    public boolean continueExecuting() {
        final double d0 = this.targetEntity.getDistanceToEntity((Entity)this.theEntity);
        return this.targetEntity.isEntityAlive() && d0 >= this.distance / 2.0f && d0 <= this.distance * 1.5f && !this.theEntity.isInWater() && this.canNavigate;
    }
    
    public void resetTask() {
        this.theEntity.getNavigator().clearPathEntity();
        this.delay = 60;
        if (this.theEntity.getRangedTask() != null) {
            this.theEntity.getRangedTask().navOverride(false);
        }
    }
    
    public void startExecuting() {
        this.canNavigate = true;
        final Random random = this.theEntity.getRNG();
        this.direction = ((random.nextInt(10) > 5) ? 1 : -1);
        this.decayRate = random.nextFloat() + this.distance / 16.0f;
        this.targetDistance = this.theEntity.getDistanceToEntity((Entity)this.targetEntity);
        final double d0 = this.theEntity.posX - this.targetEntity.posX;
        final double d2 = this.theEntity.posZ - this.targetEntity.posZ;
        this.angle = (float)(Math.atan2(d2, d0) * 180.0 / 3.141592653589793);
        if (this.theEntity.getRangedTask() != null) {
            this.theEntity.getRangedTask().navOverride(true);
        }
    }
    
    public void updateTask() {
        this.theEntity.getLookHelper().setLookPositionWithEntity((Entity)this.targetEntity, 30.0f, 30.0f);
        if (this.theEntity.getNavigator().noPath() && this.tick >= 0 && this.theEntity.onGround && !this.theEntity.isInWater()) {
            final double d0 = this.targetDistance * MathHelper.cos(this.angle / 180.0f * 3.1415927f);
            final double d2 = this.targetDistance * MathHelper.sin(this.angle / 180.0f * 3.1415927f);
            this.movePosX = this.targetEntity.posX + d0;
            this.movePosY = this.targetEntity.boundingBox.maxY;
            this.movePosZ = this.targetEntity.posZ + d2;
            this.theEntity.getNavigator().tryMoveToXYZ(this.movePosX, this.movePosY, this.movePosZ, this.speed);
            this.angle += 15.0f * this.direction;
            this.tick = MathHelper.ceiling_double_int(this.theEntity.getDistance(this.movePosX, this.movePosY, this.movePosZ) / (this.theEntity.getSpeed() / 20.0f));
            if (this.decay) {
                this.targetDistance -= this.decayRate;
            }
        }
        if (this.tick >= 0) {
            --this.tick;
        }
    }
}
