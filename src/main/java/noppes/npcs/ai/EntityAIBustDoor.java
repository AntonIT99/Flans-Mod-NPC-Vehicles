// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.ai;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.IBlockAccess;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.ai.EntityAIDoorInteract;

public class EntityAIBustDoor extends EntityAIDoorInteract
{
    private int breakingTime;
    private int field_75358_j;
    
    public EntityAIBustDoor(final EntityLiving par1EntityLiving) {
        super(par1EntityLiving);
        this.field_75358_j = -1;
    }
    
    public boolean shouldExecute() {
        return super.shouldExecute() && this.theEntity.worldObj.getGameRules().getGameRuleBooleanValue("mobGriefing") && !this.field_151504_e.func_150015_f((IBlockAccess)this.theEntity.worldObj, this.entityPosX, this.entityPosY, this.entityPosZ);
    }
    
    public void startExecuting() {
        super.startExecuting();
        this.breakingTime = 0;
    }
    
    public boolean continueExecuting() {
        final double var1 = this.theEntity.getDistanceSq((double)this.entityPosX, (double)this.entityPosY, (double)this.entityPosZ);
        return this.breakingTime <= 240 && !this.field_151504_e.func_150015_f((IBlockAccess)this.theEntity.worldObj, this.entityPosX, this.entityPosY, this.entityPosZ) && var1 < 4.0;
    }
    
    public void resetTask() {
        super.resetTask();
        this.theEntity.worldObj.destroyBlockInWorldPartially(this.theEntity.getEntityId(), this.entityPosX, this.entityPosY, this.entityPosZ, -1);
    }
    
    public void updateTask() {
        super.updateTask();
        if (this.theEntity.getRNG().nextInt(20) == 0) {
            this.theEntity.worldObj.playAuxSFX(1010, this.entityPosX, this.entityPosY, this.entityPosZ, 0);
            this.theEntity.swingItem();
        }
        ++this.breakingTime;
        final int var1 = (int)(this.breakingTime / 240.0f * 10.0f);
        if (var1 != this.field_75358_j) {
            this.theEntity.worldObj.destroyBlockInWorldPartially(this.theEntity.getEntityId(), this.entityPosX, this.entityPosY, this.entityPosZ, var1);
            this.field_75358_j = var1;
        }
        if (this.breakingTime == 240) {
            this.theEntity.worldObj.setBlock(this.entityPosX, this.entityPosY, this.entityPosZ, Blocks.air);
            this.theEntity.worldObj.playAuxSFX(1012, this.entityPosX, this.entityPosY, this.entityPosZ, 0);
            this.theEntity.worldObj.playAuxSFX(2001, this.entityPosX, this.entityPosY, this.entityPosZ, Block.getIdFromBlock((Block)this.field_151504_e));
        }
    }
}
