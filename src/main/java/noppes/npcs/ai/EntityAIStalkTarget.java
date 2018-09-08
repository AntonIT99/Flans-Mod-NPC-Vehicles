// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.ai;

import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.MathHelper;
import net.minecraft.entity.Entity;
import noppes.npcs.constants.AiMutex;
import net.minecraft.world.World;
import net.minecraft.util.Vec3;
import net.minecraft.entity.EntityLivingBase;
import noppes.npcs.entity.EntityNPCInterface;
import net.minecraft.entity.ai.EntityAIBase;

public class EntityAIStalkTarget extends EntityAIBase
{
    private EntityNPCInterface theEntity;
    private EntityLivingBase targetEntity;
    private Vec3 movePosition;
    private double distance;
    private boolean overRide;
    private World theWorld;
    private int delay;
    private int tick;
    
    public EntityAIStalkTarget(final EntityNPCInterface par1EntityCreature, final double par2) {
        this.tick = 0;
        this.theEntity = par1EntityCreature;
        this.theWorld = par1EntityCreature.worldObj;
        this.distance = par2 * par2;
        this.overRide = false;
        this.delay = 0;
        this.setMutexBits(AiMutex.PASSIVE + AiMutex.LOOK);
    }
    
    public boolean shouldExecute() {
        this.targetEntity = this.theEntity.getAttackTarget();
        if (this.targetEntity == null) {
            return false;
        }
        if (this.tick > 0) {
            --this.tick;
            return false;
        }
        return this.targetEntity.getDistanceSqToEntity((Entity)this.theEntity) > this.distance;
    }
    
    public void resetTask() {
        this.theEntity.getNavigator().clearPathEntity();
        if (this.theEntity.getAttackTarget() == null && this.targetEntity != null) {
            this.theEntity.setAttackTarget(this.targetEntity);
        }
        if (this.theEntity.getRangedTask() != null) {
            this.theEntity.getRangedTask().navOverride(false);
        }
    }
    
    public void startExecuting() {
        if (this.theEntity.getRangedTask() != null) {
            this.theEntity.getRangedTask().navOverride(true);
        }
    }
    
    public void updateTask() {
        this.theEntity.getLookHelper().setLookPositionWithEntity((Entity)this.targetEntity, 30.0f, 30.0f);
        if (this.theEntity.getNavigator().noPath() || this.overRide) {
            if (this.isLookingAway()) {
                this.movePosition = this.stalkTarget();
                if (this.movePosition != null) {
                    this.theEntity.getNavigator().tryMoveToXYZ(this.movePosition.xCoord, this.movePosition.yCoord, this.movePosition.zCoord, 1.0);
                    this.overRide = false;
                }
                else {
                    this.tick = 100;
                }
            }
            else if (this.theEntity.canSee((Entity)this.targetEntity)) {
                this.movePosition = this.hideFromTarget();
                if (this.movePosition != null) {
                    this.theEntity.getNavigator().tryMoveToXYZ(this.movePosition.xCoord, this.movePosition.yCoord, this.movePosition.zCoord, 1.33);
                    this.overRide = false;
                }
                else {
                    this.tick = 100;
                }
            }
        }
        if (this.delay > 0) {
            --this.delay;
        }
        if (!this.isLookingAway() && this.theEntity.canSee((Entity)this.targetEntity) && this.delay == 0) {
            this.overRide = true;
            this.delay = 60;
        }
    }
    
    private Vec3 hideFromTarget() {
        for (int i = 1; i <= 8; ++i) {
            final Vec3 vec = this.findSecludedXYZ(i, false);
            if (vec != null) {
                return vec;
            }
        }
        return null;
    }
    
    private Vec3 stalkTarget() {
        for (int i = 8; i >= 1; --i) {
            final Vec3 vec = this.findSecludedXYZ(i, true);
            if (vec != null) {
                return vec;
            }
        }
        return null;
    }
    
    private Vec3 findSecludedXYZ(final int radius, final boolean nearest) {
        Vec3 idealPos = null;
        double dist = this.targetEntity.getDistanceSqToEntity((Entity)this.theEntity);
        double u = 0.0;
        double v = 0.0;
        double w = 0.0;
        if (this.movePosition != null) {
            u = this.movePosition.xCoord;
            v = this.movePosition.yCoord;
            w = this.movePosition.zCoord;
        }
        for (int y = -2; y <= 2; ++y) {
            for (int x = -radius; x <= radius; ++x) {
                for (int z = -radius; z <= radius; ++z) {
                    final double j = MathHelper.floor_double(this.theEntity.posX + x) + 0.5;
                    final double k = MathHelper.floor_double(this.theEntity.boundingBox.minY + y);
                    final double l = MathHelper.floor_double(this.theEntity.posZ + z) + 0.5;
                    if (this.theWorld.getBlock((int)j, (int)k, (int)l).isOpaqueCube() && !this.theWorld.getBlock((int)j, (int)k + 1, (int)l).isOpaqueCube() && !this.theWorld.getBlock((int)j, (int)k + 2, (int)l).isOpaqueCube()) {
                        final Vec3 vec1 = Vec3.createVectorHelper(this.targetEntity.posX, this.targetEntity.posY + this.targetEntity.getEyeHeight(), this.targetEntity.posZ);
                        final Vec3 vec2 = Vec3.createVectorHelper(j, k + this.theEntity.getEyeHeight(), l);
                        final MovingObjectPosition movingobjectposition = this.theWorld.rayTraceBlocks(vec1, vec2);
                        if (movingobjectposition != null) {
                            final boolean weight = !nearest || this.targetEntity.getDistanceSq(j, k, l) <= dist;
                            if (weight && (j != u || k != v || l != w)) {
                                idealPos = Vec3.createVectorHelper(j, k, l);
                                if (nearest) {
                                    dist = this.targetEntity.getDistanceSq(j, k, l);
                                }
                            }
                        }
                    }
                }
            }
        }
        return idealPos;
    }
    
    private boolean isLookingAway() {
        final Vec3 vec3 = this.targetEntity.getLook(1.0f).normalize();
        Vec3 vec4 = Vec3.createVectorHelper(this.theEntity.posX - this.targetEntity.posX, this.theEntity.boundingBox.minY + this.theEntity.height / 2.0f - (this.targetEntity.posY + this.targetEntity.getEyeHeight()), this.theEntity.posZ - this.targetEntity.posZ);
        final double d0 = vec4.lengthVector();
        vec4 = vec4.normalize();
        final double d2 = vec3.dotProduct(vec4);
        return d2 < 0.6;
    }
}
