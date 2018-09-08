// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.containers;

import net.minecraft.item.ItemStack;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.entity.player.EntityPlayer;
import noppes.npcs.entity.EntityNPCInterface;
import noppes.npcs.roles.RoleFollower;
import net.minecraft.inventory.Container;

public class ContainerNPCFollowerSetup extends Container
{
    private RoleFollower role;
    
    public ContainerNPCFollowerSetup(final EntityNPCInterface npc, final EntityPlayer player) {
        this.role = (RoleFollower)npc.roleInterface;
        for (int i1 = 0; i1 < 3; ++i1) {
            this.addSlotToContainer(new Slot((IInventory)this.role.inventory, i1, 44, 39 + i1 * 25));
        }
        for (int i1 = 0; i1 < 3; ++i1) {
            for (int l1 = 0; l1 < 9; ++l1) {
                this.addSlotToContainer(new Slot((IInventory)player.inventory, l1 + i1 * 9 + 9, 8 + l1 * 18, 113 + i1 * 18));
            }
        }
        for (int j1 = 0; j1 < 9; ++j1) {
            this.addSlotToContainer(new Slot((IInventory)player.inventory, j1, 8 + j1 * 18, 171));
        }
    }
    
    public ItemStack transferStackInSlot(final EntityPlayer par1EntityPlayer, final int i) {
        ItemStack itemstack = null;
        final Slot slot = (Slot) this.inventorySlots.get(i);
        if (slot != null && slot.getHasStack()) {
            final ItemStack itemstack2 = slot.getStack();
            itemstack = itemstack2.copy();
            if (i >= 0 && i < 3) {
                if (!this.mergeItemStack(itemstack2, 3, 38, true)) {
                    return null;
                }
            }
            else if (i >= 3 && i < 30) {
                if (!this.mergeItemStack(itemstack2, 30, 38, false)) {
                    return null;
                }
            }
            else if (i >= 30 && i < 38) {
                if (!this.mergeItemStack(itemstack2, 3, 29, false)) {
                    return null;
                }
            }
            else if (!this.mergeItemStack(itemstack2, 3, 38, false)) {
                return null;
            }
            if (itemstack2.stackSize == 0) {
                slot.putStack((ItemStack)null);
            }
            else {
                slot.onSlotChanged();
            }
            if (itemstack2.stackSize == itemstack.stackSize) {
                return null;
            }
            slot.onPickupFromSlot(par1EntityPlayer, itemstack2);
        }
        return itemstack;
    }
    
    public boolean canInteractWith(final EntityPlayer entityplayer) {
        return true;
    }
}
