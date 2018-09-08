// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.containers;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.IInventory;

public class InventoryNPC implements IInventory
{
    private String inventoryTitle;
    private int slotsCount;
    private ItemStack[] inventoryContents;
    private Container con;
    
    public InventoryNPC(final String s, final int i, final Container con) {
        this.con = con;
        this.inventoryTitle = s;
        this.slotsCount = i;
        this.inventoryContents = new ItemStack[i];
    }
    
    public ItemStack getStackInSlot(final int i) {
        return this.inventoryContents[i];
    }
    
    public ItemStack decrStackSize(final int i, final int j) {
        if (this.inventoryContents[i] == null) {
            return null;
        }
        if (this.inventoryContents[i].stackSize <= j) {
            final ItemStack itemstack = this.inventoryContents[i];
            this.inventoryContents[i] = null;
            return itemstack;
        }
        final ItemStack itemstack2 = this.inventoryContents[i].splitStack(j);
        if (this.inventoryContents[i].stackSize == 0) {
            this.inventoryContents[i] = null;
        }
        return itemstack2;
    }
    
    public void setInventorySlotContents(final int i, final ItemStack itemstack) {
        this.inventoryContents[i] = itemstack;
        if (itemstack != null && itemstack.stackSize > this.getInventoryStackLimit()) {
            itemstack.stackSize = this.getInventoryStackLimit();
        }
    }
    
    public int getSizeInventory() {
        return this.slotsCount;
    }
    
    public int getInventoryStackLimit() {
        return 64;
    }
    
    public boolean isUseableByPlayer(final EntityPlayer entityplayer) {
        return false;
    }
    
    public ItemStack getStackInSlotOnClosing(final int i) {
        return null;
    }
    
    public boolean isItemValidForSlot(final int i, final ItemStack itemstack) {
        return true;
    }
    
    public String getInventoryName() {
        return this.inventoryTitle;
    }
    
    public boolean hasCustomInventoryName() {
        return true;
    }
    
    public void markDirty() {
        this.con.onCraftMatrixChanged((IInventory)this);
    }
    
    public void openInventory() {
    }
    
    public void closeInventory() {
    }
}
