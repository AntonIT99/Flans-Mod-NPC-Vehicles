// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.containers;

import net.minecraft.item.ItemStack;
import net.minecraft.inventory.IInventory;
import noppes.npcs.roles.RoleCompanion;
import net.minecraft.inventory.Slot;

class SlotCompanionWeapon extends Slot
{
    final RoleCompanion role;
    
    public SlotCompanionWeapon(final RoleCompanion role, final IInventory iinventory, final int id, final int x, final int y) {
        super(iinventory, id, x, y);
        this.role = role;
    }
    
    public int getSlotStackLimit() {
        return 1;
    }
    
    public boolean isItemValid(final ItemStack itemstack) {
        return this.role.canWearSword(itemstack);
    }
}
