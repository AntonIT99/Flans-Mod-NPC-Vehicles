// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.blocks.tiles;

import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.AxisAlignedBB;
import java.util.Iterator;
import java.util.List;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import noppes.npcs.CustomNpcs;
import noppes.npcs.blocks.BlockNpcRedstone;
import noppes.npcs.controllers.Availability;
import net.minecraft.tileentity.TileEntity;

public class TileRedstoneBlock extends TileEntity
{
    public int onRange;
    public int offRange;
    public int onRangeX;
    public int onRangeY;
    public int onRangeZ;
    public int offRangeX;
    public int offRangeY;
    public int offRangeZ;
    public boolean isDetailed;
    public Availability availability;
    public boolean isActivated;
    private int ticks;
    
    public TileRedstoneBlock() {
        this.onRange = 6;
        this.offRange = 10;
        this.onRangeX = 6;
        this.onRangeY = 6;
        this.onRangeZ = 6;
        this.offRangeX = 10;
        this.offRangeY = 10;
        this.offRangeZ = 10;
        this.isDetailed = false;
        this.availability = new Availability();
        this.isActivated = false;
        this.ticks = 10;
    }
    
    public void updateEntity() {
        if (this.worldObj.isRemote) {
            return;
        }
        --this.ticks;
        if (this.ticks > 0) {
            return;
        }
        this.ticks = 20;
        final Block block = this.worldObj.getBlock(this.xCoord, this.yCoord, this.zCoord);
        if (block == null || !(block instanceof BlockNpcRedstone)) {
            return;
        }
        if (CustomNpcs.FreezeNPCs) {
            if (this.isActivated) {
                this.setActive(block, false);
            }
            return;
        }
        if (!this.isActivated) {
            final int x = this.isDetailed ? this.onRangeX : this.onRange;
            final int y = this.isDetailed ? this.onRangeY : this.onRange;
            final int z = this.isDetailed ? this.onRangeZ : this.onRange;
            final List<EntityPlayer> list = this.getPlayerList(x, y, z);
            if (list.isEmpty()) {
                return;
            }
            for (final EntityPlayer player : list) {
                if (this.availability.isAvailable(player)) {
                    this.setActive(block, true);
                }
            }
        }
        else {
            final int x = this.isDetailed ? this.offRangeX : this.offRange;
            final int y = this.isDetailed ? this.offRangeY : this.offRange;
            final int z = this.isDetailed ? this.offRangeZ : this.offRange;
            final List<EntityPlayer> list = this.getPlayerList(x, y, z);
            for (final EntityPlayer player : list) {
                if (this.availability.isAvailable(player)) {
                    return;
                }
            }
            this.setActive(block, false);
        }
    }
    
    private void setActive(final Block block, final boolean bo) {
        this.isActivated = bo;
        this.worldObj.setBlockMetadataWithNotify(this.xCoord, this.yCoord, this.zCoord, (int)(this.isActivated ? 1 : 0), 2);
        this.worldObj.markBlockForUpdate(this.xCoord, this.yCoord, this.zCoord);
        block.onBlockAdded(this.worldObj, this.xCoord, this.yCoord, this.zCoord);
    }
    
    private List<EntityPlayer> getPlayerList(final int x, final int y, final int z) {
        return (List<EntityPlayer>)this.worldObj.getEntitiesWithinAABB((Class)EntityPlayer.class, AxisAlignedBB.getBoundingBox((double)this.xCoord, (double)this.yCoord, (double)this.zCoord, (double)(this.xCoord + 1), (double)(this.yCoord + 1), (double)(this.zCoord + 1)).expand((double)x, (double)y, (double)z));
    }
    
    public void readFromNBT(final NBTTagCompound compound) {
        super.readFromNBT(compound);
        this.onRange = compound.getInteger("BlockOnRange");
        this.offRange = compound.getInteger("BlockOffRange");
        this.isDetailed = compound.getBoolean("BlockIsDetailed");
        if (compound.hasKey("BlockOnRangeX")) {
            this.isDetailed = true;
            this.onRangeX = compound.getInteger("BlockOnRangeX");
            this.onRangeY = compound.getInteger("BlockOnRangeY");
            this.onRangeZ = compound.getInteger("BlockOnRangeZ");
            this.offRangeX = compound.getInteger("BlockOffRangeX");
            this.offRangeY = compound.getInteger("BlockOffRangeY");
            this.offRangeZ = compound.getInteger("BlockOffRangeZ");
        }
        this.isActivated = compound.getBoolean("BlockActivated");
        this.availability.readFromNBT(compound);
        if (this.worldObj != null) {
            this.setActive(this.getBlockType(), this.isActivated);
        }
    }
    
    public void writeToNBT(final NBTTagCompound compound) {
        super.writeToNBT(compound);
        compound.setInteger("BlockOnRange", this.onRange);
        compound.setInteger("BlockOffRange", this.offRange);
        compound.setBoolean("BlockActivated", this.isActivated);
        compound.setBoolean("BlockIsDetailed", this.isDetailed);
        if (this.isDetailed) {
            compound.setInteger("BlockOnRangeX", this.onRangeX);
            compound.setInteger("BlockOnRangeY", this.onRangeY);
            compound.setInteger("BlockOnRangeZ", this.onRangeZ);
            compound.setInteger("BlockOffRangeX", this.offRangeX);
            compound.setInteger("BlockOffRangeY", this.offRangeY);
            compound.setInteger("BlockOffRangeZ", this.offRangeZ);
        }
        this.availability.writeToNBT(compound);
    }
    
    public boolean canUpdate() {
        return true;
    }
}
