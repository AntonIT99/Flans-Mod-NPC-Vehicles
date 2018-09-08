// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.containers;

import java.util.Iterator;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.IInventory;
import noppes.npcs.roles.RoleFollower;
import net.minecraft.inventory.Slot;

class SlotNpcMercenaryCurrency extends Slot
{
    RoleFollower role;
    
    public SlotNpcMercenaryCurrency(final RoleFollower role, final IInventory inv, final int i, final int j, final int k) {
        super(inv, i, j, k);
        this.role = role;
    }
    
    public int getSlotStackLimit() {
        return 64;
    }
    
    public boolean isItemValid(final ItemStack itemstack) {
        final Item item = itemstack.getItem();
        for (final ItemStack is : this.role.inventory.items.values()) {
            if (item == is.getItem()) {
                if (itemstack.getHasSubtypes() && itemstack.getItemDamage() != is.getItemDamage()) {
                    continue;
                }
                return true;
            }
        }
        return false;
    }
}
