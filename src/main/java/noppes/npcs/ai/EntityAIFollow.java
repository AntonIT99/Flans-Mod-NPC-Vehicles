// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.ai;

import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.util.MathHelper;
import net.minecraft.entity.Entity;
import noppes.npcs.constants.EnumAnimation;
import noppes.npcs.constants.AiMutex;
import net.minecraft.entity.EntityLivingBase;
import noppes.npcs.entity.EntityNPCInterface;
import net.minecraft.entity.ai.EntityAIBase;

public class EntityAIFollow extends EntityAIBase
{
    private EntityNPCInterface npc;
    private EntityLivingBase owner;
    private double distance;
    public int updateTick;
    
    public EntityAIFollow(final EntityNPCInterface npc) {
        this.updateTick = 0;
        this.npc = npc;
        this.setMutexBits(AiMutex.PASSIVE + AiMutex.LOOK);
    }
    
    public boolean shouldExecute() {
        return this.excute() && this.distance > this.npc.followRange();
    }
    
    public boolean excute() {
        if (!this.npc.isEntityAlive() || !this.npc.isFollower() || this.npc.isAttacking() || (this.owner = this.npc.getOwner()) == null || this.npc.ai.animationType == EnumAnimation.SITTING) {
            return false;
        }
        this.distance = this.npc.getDistanceSqToEntity((Entity)this.owner);
        return true;
    }
    
    public void startExecuting() {
        this.updateTick = 10;
    }
    
    public boolean continueExecuting() {
        return !this.npc.getNavigator().noPath() && this.distance > 4.0 && this.excute();
    }
    
    public void resetTask() {
        this.owner = null;
        this.npc.getNavigator().clearPathEntity();
    }
    
    public void updateTask() {
        ++this.updateTick;
        if (this.updateTick < 10) {
            return;
        }
        this.updateTick = 0;
        this.npc.getLookHelper().setLookPositionWithEntity((Entity)this.owner, 10.0f, (float)this.npc.getVerticalFaceSpeed());
        double speed = 1.0 + this.distance / 150.0;
        if (speed > 3.0) {
            speed = 3.0;
        }
        if (this.npc.getNavigator().tryMoveToEntityLiving((Entity)this.owner, speed) || this.distance < 225.0) {
            return;
        }
        final int i = MathHelper.floor_double(this.owner.posX) - 2;
        final int j = MathHelper.floor_double(this.owner.posZ) - 2;
        final int k = MathHelper.floor_double(this.owner.boundingBox.minY);
        for (int l = 0; l <= 4; ++l) {
            for (int i2 = 0; i2 <= 4; ++i2) {
                if ((l < 1 || i2 < 1 || l > 3 || i2 > 3) && World.doesBlockHaveSolidTopSurface((IBlockAccess)this.npc.worldObj, i + l, k - 1, j + i2) && !this.npc.worldObj.getBlock(i + l, k, j + i2).isNormalCube() && !this.npc.worldObj.getBlock(i + l, k + 1, j + i2).isNormalCube()) {
                    this.npc.setLocationAndAngles((double)(i + l + 0.5f), (double)k, (double)(j + i2 + 0.5f), this.npc.rotationYaw, this.npc.rotationPitch);
                    this.npc.getNavigator().clearPathEntity();
                    return;
                }
            }
        }
    }
}
