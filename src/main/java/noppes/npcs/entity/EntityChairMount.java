// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.entity;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraft.entity.Entity;

public class EntityChairMount extends Entity
{
    public EntityChairMount(final World world) {
        super(world);
        this.setSize(0.0f, 0.0f);
    }
    
    public double getMountedYOffset() {
        return 0.5;
    }
    
    protected void entityInit() {
    }
    
    public void onEntityUpdate() {
        super.onEntityUpdate();
        if (this.worldObj != null && !this.worldObj.isRemote && this.riddenByEntity == null) {
            this.isDead = true;
        }
    }
    
    public boolean isEntityInvulnerable() {
        return true;
    }
    
    public boolean isInvisible() {
        return true;
    }
    
    public void moveEntity(final double p_70091_1_, final double p_70091_3_, final double p_70091_5_) {
    }
    
    protected void readEntityFromNBT(final NBTTagCompound p_70037_1_) {
    }
    
    protected void writeEntityToNBT(final NBTTagCompound p_70014_1_) {
    }
    
    public boolean canBeCollidedWith() {
        return false;
    }
    
    public boolean canBePushed() {
        return false;
    }
    
    protected void fall(final float p_70069_1_) {
    }
    
    @SideOnly(Side.CLIENT)
    public void setPositionAndRotation2(final double p_70056_1_, final double p_70056_3_, final double p_70056_5_, final float p_70056_7_, final float p_70056_8_, final int p_70056_9_) {
        this.setPosition(p_70056_1_, p_70056_3_, p_70056_5_);
        this.setRotation(p_70056_7_, p_70056_8_);
    }
}
