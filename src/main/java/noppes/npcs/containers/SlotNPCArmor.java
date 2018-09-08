// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.containers;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor;
import net.minecraft.util.IIcon;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;

class SlotNPCArmor extends Slot
{
    final int armorType;
    
    SlotNPCArmor(final IInventory iinventory, final int i, final int j, final int k, final int l) {
        super(iinventory, i, j, k);
        this.armorType = l;
    }
    
    public int getSlotStackLimit() {
        return 1;
    }
    
    public IIcon getBackgroundIconIndex() {
        return ItemArmor.func_94602_b(this.armorType);
    }
    
    public boolean isItemValid(final ItemStack itemstack) {
        if (itemstack.getItem() instanceof ItemArmor) {
            return ((ItemArmor)itemstack.getItem()).armorType == this.armorType;
        }
        return itemstack.getItem() instanceof ItemBlock && this.armorType == 0;
    }
}
