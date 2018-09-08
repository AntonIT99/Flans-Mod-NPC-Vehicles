// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs;

import net.minecraft.entity.player.EntityPlayer;
import java.util.Iterator;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.item.ItemStack;
import java.util.HashMap;
import net.minecraft.inventory.IInventory;

public class NpcMiscInventory implements IInventory
{
    public HashMap<Integer, ItemStack> items;
    public int stackLimit;
    private int size;
    
    public NpcMiscInventory(final int size) {
        this.items = new HashMap<Integer, ItemStack>();
        this.stackLimit = 64;
        this.size = size;
    }
    
    public NBTTagCompound getToNBT() {
        final NBTTagCompound nbttagcompound = new NBTTagCompound();
        nbttagcompound.setTag("NpcMiscInv", (NBTBase)NBTTags.nbtItemStackList(this.items));
        return nbttagcompound;
    }
    
    public void setFromNBT(final NBTTagCompound nbttagcompound) {
        this.items = NBTTags.getItemStackList(nbttagcompound.getTagList("NpcMiscInv", 10));
    }
    
    public int getSizeInventory() {
        return this.size;
    }
    
    public ItemStack getStackInSlot(final int var1) {
        return this.items.get(var1);
    }
    
    public ItemStack decrStackSize(final int par1, final int par2) {
        if (this.items.get(par1) == null) {
            return null;
        }
        ItemStack var4 = null;
        if (this.items.get(par1).stackSize <= par2) {
            var4 = this.items.get(par1);
            this.items.put(par1, null);
        }
        else {
            var4 = this.items.get(par1).splitStack(par2);
            if (this.items.get(par1).stackSize == 0) {
                this.items.put(par1, null);
            }
        }
        return var4;
    }
    
    public boolean decrStackSize(final ItemStack eating, final int decrease) {
        for (final int slot : this.items.keySet()) {
            final ItemStack item = this.items.get(slot);
            if (this.items != null && eating == item && item.stackSize >= decrease) {
                item.splitStack(decrease);
                if (item.stackSize <= 0) {
                    this.items.put(slot, null);
                }
                return true;
            }
        }
        return false;
    }
    
    public ItemStack getStackInSlotOnClosing(final int var1) {
        if (this.items.get(var1) != null) {
            final ItemStack var2 = this.items.get(var1);
            this.items.put(var1, null);
            return var2;
        }
        return null;
    }
    
    public void setInventorySlotContents(final int var1, final ItemStack var2) {
        if (var1 >= this.getSizeInventory()) {
            return;
        }
        this.items.put(var1, var2);
    }
    
    public int getInventoryStackLimit() {
        return this.stackLimit;
    }
    
    public boolean isUseableByPlayer(final EntityPlayer var1) {
        return true;
    }
    
    public boolean isItemValidForSlot(final int i, final ItemStack itemstack) {
        return true;
    }
    
    public String getInventoryName() {
        return "Npc Misc Inventory";
    }
    
    public boolean hasCustomInventoryName() {
        return true;
    }
    
    public void markDirty() {
    }
    
    public void openInventory() {
    }
    
    public void closeInventory() {
    }
    
    public boolean addItemStack(final ItemStack item) {
        boolean merged = false;
        ItemStack mergable;
        while ((mergable = this.getMergableItem(item)) != null && mergable.stackSize > 0) {
            final int size = mergable.getMaxStackSize() - mergable.stackSize;
            if (size > item.stackSize) {
                mergable.stackSize = mergable.getMaxStackSize();
                item.stackSize -= size;
                merged = true;
            }
            else {
                final ItemStack itemStack = mergable;
                itemStack.stackSize += item.stackSize;
                item.stackSize = 0;
            }
        }
        if (item.stackSize <= 0) {
            return true;
        }
        final int slot = this.firstFreeSlot();
        if (slot >= 0) {
            this.items.put(slot, item.copy());
            item.stackSize = 0;
            return true;
        }
        return merged;
    }
    
    public ItemStack getMergableItem(final ItemStack item) {
        for (final ItemStack is : this.items.values()) {
            if (NoppesUtilPlayer.compareItems(item, is, false, false) && is.stackSize < is.getMaxStackSize()) {
                return is;
            }
        }
        return null;
    }
    
    public int firstFreeSlot() {
        for (int i = 0; i < this.getSizeInventory(); ++i) {
            if (this.items.get(i) == null) {
                return i;
            }
        }
        return -1;
    }
    
    public void setSize(final int i) {
        this.size = i;
    }
}
