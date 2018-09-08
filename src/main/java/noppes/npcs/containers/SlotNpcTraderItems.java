// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.containers;

import net.minecraft.item.ItemStack;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;

class SlotNpcTraderItems extends Slot
{
    public SlotNpcTraderItems(final IInventory iinventory, final int i, final int j, final int k) {
        super(iinventory, i, j, k);
    }
    
    public void onPickupFromSlot(final ItemStack itemstack) {
        if (itemstack == null) {
            return;
        }
        if (this.getStack() == null) {
            return;
        }
        if (itemstack.getItem() != this.getStack().getItem()) {
            return;
        }
        --itemstack.stackSize;
    }
    
    public int getSlotStackLimit() {
        return 64;
    }
    
    public boolean isItemValid(final ItemStack itemstack) {
        return false;
    }
}
