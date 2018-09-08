// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.containers;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.IInventory;

public class InventoryNpcTrader implements IInventory
{
    private String inventoryTitle;
    private int slotsCount;
    private ItemStack[] inventoryContents;
    private ContainerNPCTrader con;
    
    public InventoryNpcTrader(final String s, final int i, final ContainerNPCTrader con) {
        this.con = con;
        this.inventoryTitle = s;
        this.slotsCount = i;
        this.inventoryContents = new ItemStack[i];
    }
    
    public ItemStack getStackInSlot(final int i) {
        final ItemStack toBuy = this.inventoryContents[i];
        if (toBuy == null) {
            return null;
        }
        return ItemStack.copyItemStack(toBuy);
    }
    
    public ItemStack decrStackSize(final int i, final int j) {
        if (this.inventoryContents[i] != null) {
            final ItemStack itemstack = this.inventoryContents[i];
            return ItemStack.copyItemStack(itemstack);
        }
        return null;
    }
    
    public void setInventorySlotContents(final int i, final ItemStack itemstack) {
        if (itemstack != null) {
            this.inventoryContents[i] = itemstack.copy();
        }
        this.markDirty();
    }
    
    public int getSizeInventory() {
        return this.slotsCount;
    }
    
    public int getInventoryStackLimit() {
        return 64;
    }
    
    public boolean isUseableByPlayer(final EntityPlayer entityplayer) {
        return true;
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
