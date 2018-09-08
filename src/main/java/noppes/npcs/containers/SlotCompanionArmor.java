// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.containers;

import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor;
import net.minecraft.util.IIcon;
import net.minecraft.inventory.IInventory;
import noppes.npcs.roles.RoleCompanion;
import net.minecraft.inventory.Slot;

class SlotCompanionArmor extends Slot
{
    final int armorType;
    final RoleCompanion role;
    
    public SlotCompanionArmor(final RoleCompanion role, final IInventory iinventory, final int id, final int x, final int y, final int type) {
        super(iinventory, id, x, y);
        this.armorType = type;
        this.role = role;
    }
    
    public int getSlotStackLimit() {
        return 1;
    }
    
    public IIcon getBackgroundIconIndex() {
        return ItemArmor.func_94602_b(this.armorType);
    }
    
    public boolean isItemValid(final ItemStack itemstack) {
        if (itemstack.getItem() instanceof ItemArmor && this.role.canWearArmor(itemstack)) {
            return ((ItemArmor)itemstack.getItem()).armorType == this.armorType;
        }
        return itemstack.getItem() instanceof ItemBlock && this.armorType == 0;
    }
}
