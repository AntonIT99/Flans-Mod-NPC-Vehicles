// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.blocks.tiles;

import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.world.World;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.IInventory;

public abstract class TileNpcContainer extends TileColorable implements IInventory
{
    private ItemStack[] chestContents;
    public String customName;
    public int playerUsing;
    
    public TileNpcContainer() {
        this.customName = "";
        this.playerUsing = 0;
        this.chestContents = new ItemStack[this.getSizeInventory()];
    }
    
    @Override
    public void readFromNBT(final NBTTagCompound compound) {
        super.readFromNBT(compound);
        final NBTTagList nbttaglist = compound.getTagList("Items", 10);
        this.chestContents = new ItemStack[this.getSizeInventory()];
        if (compound.hasKey("CustomName", 8)) {
            this.customName = compound.getString("CustomName");
        }
        for (int i = 0; i < nbttaglist.tagCount(); ++i) {
            final NBTTagCompound nbttagcompound1 = nbttaglist.getCompoundTagAt(i);
            final int j = nbttagcompound1.getByte("Slot") & 0xFF;
            if (j >= 0 && j < this.chestContents.length) {
                this.chestContents[j] = ItemStack.loadItemStackFromNBT(nbttagcompound1);
            }
        }
    }
    
    @Override
    public void writeToNBT(final NBTTagCompound compound) {
        super.writeToNBT(compound);
        final NBTTagList nbttaglist = new NBTTagList();
        for (int i = 0; i < this.chestContents.length; ++i) {
            if (this.chestContents[i] != null) {
                final NBTTagCompound nbttagcompound1 = new NBTTagCompound();
                nbttagcompound1.setByte("Slot", (byte)i);
                this.chestContents[i].writeToNBT(nbttagcompound1);
                nbttaglist.appendTag((NBTBase)nbttagcompound1);
            }
        }
        compound.setTag("Items", (NBTBase)nbttaglist);
        if (this.hasCustomInventoryName()) {
            compound.setString("CustomName", this.customName);
        }
    }
    
    public boolean receiveClientEvent(final int p_145842_1_, final int p_145842_2_) {
        if (p_145842_1_ == 1) {
            this.playerUsing = p_145842_2_;
            return true;
        }
        return super.receiveClientEvent(p_145842_1_, p_145842_2_);
    }
    
    public int getSizeInventory() {
        return 54;
    }
    
    public ItemStack getStackInSlot(final int var1) {
        return this.chestContents[var1];
    }
    
    public ItemStack decrStackSize(final int par1, final int par2) {
        if (this.chestContents[par1] == null) {
            return null;
        }
        if (this.chestContents[par1].stackSize <= par2) {
            final ItemStack itemstack = this.chestContents[par1];
            this.chestContents[par1] = null;
            this.markDirty();
            return itemstack;
        }
        final ItemStack itemstack = this.chestContents[par1].splitStack(par2);
        if (this.chestContents[par1].stackSize == 0) {
            this.chestContents[par1] = null;
        }
        this.markDirty();
        return itemstack;
    }
    
    public ItemStack getStackInSlotOnClosing(final int par1) {
        if (this.chestContents[par1] != null) {
            final ItemStack itemstack = this.chestContents[par1];
            this.chestContents[par1] = null;
            return itemstack;
        }
        return null;
    }
    
    public void setInventorySlotContents(final int par1, final ItemStack par2ItemStack) {
        this.chestContents[par1] = par2ItemStack;
        if (par2ItemStack != null && par2ItemStack.stackSize > this.getInventoryStackLimit()) {
            par2ItemStack.stackSize = this.getInventoryStackLimit();
        }
        this.markDirty();
    }
    
    public String getInventoryName() {
        return this.hasCustomInventoryName() ? this.customName : this.getName();
    }
    
    public abstract String getName();
    
    public boolean hasCustomInventoryName() {
        return !this.customName.isEmpty();
    }
    
    public int getInventoryStackLimit() {
        return 64;
    }
    
    public boolean isUseableByPlayer(final EntityPlayer player) {
        return !player.isDead && this.worldObj.getTileEntity(this.xCoord, this.yCoord, this.zCoord) == this && player.getDistanceSq(this.xCoord + 0.5, this.yCoord + 0.5, this.zCoord + 0.5) <= 64.0;
    }
    
    public void openInventory() {
        ++this.playerUsing;
    }
    
    public void closeInventory() {
        --this.playerUsing;
    }
    
    public boolean isItemValidForSlot(final int var1, final ItemStack var2) {
        return true;
    }
    
    public void dropItems(final World world, final int x, final int y, final int z) {
        for (int i1 = 0; i1 < this.getSizeInventory(); ++i1) {
            final ItemStack itemstack = this.getStackInSlot(i1);
            if (itemstack != null) {
                final float f = world.rand.nextFloat() * 0.8f + 0.1f;
                final float f2 = world.rand.nextFloat() * 0.8f + 0.1f;
                final float f3 = world.rand.nextFloat() * 0.8f + 0.1f;
                while (itemstack.stackSize > 0) {
                    int j1 = world.rand.nextInt(21) + 10;
                    if (j1 > itemstack.stackSize) {
                        j1 = itemstack.stackSize;
                    }
                    final ItemStack itemStack = itemstack;
                    itemStack.stackSize -= j1;
                    final EntityItem entityitem = new EntityItem(world, (double)(x + f), (double)(y + f2), (double)(z + f3), new ItemStack(itemstack.getItem(), j1, itemstack.getItemDamage()));
                    final float f4 = 0.05f;
                    entityitem.motionX = (float)world.rand.nextGaussian() * f4;
                    entityitem.motionY = (float)world.rand.nextGaussian() * f4 + 0.2f;
                    entityitem.motionZ = (float)world.rand.nextGaussian() * f4;
                    if (itemstack.hasTagCompound()) {
                        entityitem.getEntityItem().setTagCompound((NBTTagCompound)itemstack.getTagCompound().copy());
                    }
                    world.spawnEntityInWorld((Entity)entityitem);
                }
            }
        }
    }
}
