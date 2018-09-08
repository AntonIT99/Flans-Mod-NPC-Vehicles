// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.ai;

import net.minecraft.util.MovingObjectPosition;
import java.util.Random;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.entity.Entity;
import noppes.npcs.constants.AiMutex;
import net.minecraft.world.World;
import net.minecraft.entity.EntityLivingBase;
import noppes.npcs.entity.EntityNPCInterface;
import net.minecraft.entity.ai.EntityAIBase;

public class EntityAIAmbushTarget extends EntityAIBase
{
    private EntityNPCInterface theEntity;
    private EntityLivingBase targetEntity;
    private double shelterX;
    private double shelterY;
    private double shelterZ;
    private double movementSpeed;
    private double distance;
    private int delay;
    private World theWorld;
    private int tick;
    private boolean attackFromBehind;
    
    public EntityAIAmbushTarget(final EntityNPCInterface par1EntityCreature, final double par2, final double par3, final boolean par4) {
        this.delay = 0;
        this.theEntity = par1EntityCreature;
        this.movementSpeed = par2;
        this.theWorld = par1EntityCreature.worldObj;
        this.distance = par3 * par3;
        this.attackFromBehind = par4;
        this.setMutexBits(AiMutex.PASSIVE + AiMutex.LOOK);
    }
    
    public boolean shouldExecute() {
        this.targetEntity = this.theEntity.getAttackTarget();
        if (this.targetEntity == null) {
            return false;
        }
        if (this.targetEntity.getDistanceSqToEntity((Entity)this.theEntity) < this.distance || !this.theEntity.canSee((Entity)this.targetEntity)) {
            return false;
        }
        if (this.delay > 0) {
            --this.delay;
            return false;
        }
        final Vec3 vec3 = this.findHidingSpot();
        if (vec3 == null) {
            return false;
        }
        this.shelterX = vec3.xCoord;
        this.shelterY = vec3.yCoord;
        this.shelterZ = vec3.zCoord;
        return true;
    }
    
    public boolean continueExecuting() {
        final boolean shouldHide = this.targetEntity.getDistanceSqToEntity((Entity)this.theEntity) > this.distance;
        final boolean isSeen = this.theEntity.canSee((Entity)this.targetEntity);
        return (!this.theEntity.getNavigator().noPath() && shouldHide) || (!isSeen && (shouldHide || this.theEntity.ai.directLOS));
    }
    
    public void startExecuting() {
        this.theEntity.getNavigator().tryMoveToXYZ(this.shelterX, this.shelterY, this.shelterZ, this.movementSpeed);
    }
    
    public void resetTask() {
        this.theEntity.getNavigator().clearPathEntity();
        if (this.theEntity.getAttackTarget() == null && this.targetEntity != null) {
            this.theEntity.setAttackTarget(this.targetEntity);
        }
        if (this.targetEntity.getDistanceSqToEntity((Entity)this.theEntity) < this.distance) {
            this.delay = 60;
        }
    }
    
    public void updateTask() {
        this.theEntity.getLookHelper().setLookPositionWithEntity((Entity)this.targetEntity, 30.0f, 30.0f);
    }
    
    private Vec3 findHidingSpot() {
        final Random random = this.theEntity.getRNG();
        Vec3 idealPos = null;
        for (int i = 1; i <= 8; ++i) {
            for (int y = -2; y <= 2; ++y) {
                for (int x = -i; x <= i; ++x) {
                    for (int z = -i; z <= i; ++z) {
                        final double j = MathHelper.floor_double(this.theEntity.posX + x) + 0.5;
                        final double k = MathHelper.floor_double(this.theEntity.boundingBox.minY + y);
                        final double l = MathHelper.floor_double(this.theEntity.posZ + z) + 0.5;
                        if (this.theWorld.getBlock((int)j, (int)k, (int)l).isOpaqueCube() && !this.theWorld.getBlock((int)j, (int)k + 1, (int)l).isOpaqueCube() && !this.theWorld.getBlock((int)j, (int)k + 2, (int)l).isOpaqueCube()) {
                            final Vec3 vec1 = Vec3.createVectorHelper(this.targetEntity.posX, this.targetEntity.posY + this.targetEntity.getEyeHeight(), this.targetEntity.posZ);
                            final Vec3 vec2 = Vec3.createVectorHelper(j, k + this.theEntity.getEyeHeight(), l);
                            final MovingObjectPosition movingobjectposition = this.theWorld.rayTraceBlocks(vec1, vec2);
                            if (movingobjectposition != null && this.shelterX != j && this.shelterY != k && this.shelterZ != l) {
                                idealPos = Vec3.createVectorHelper(j, k, l);
                            }
                        }
                    }
                }
            }
            if (idealPos != null) {
                return idealPos;
            }
        }
        this.delay = 60;
        return null;
    }
}
