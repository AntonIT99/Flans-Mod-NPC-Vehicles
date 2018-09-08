// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.containers;

import noppes.npcs.NoppesUtilPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import noppes.npcs.entity.EntityNPCInterface;
import noppes.npcs.roles.RoleTrader;

public class ContainerNPCTrader extends ContainerNpcInterface
{
    public RoleTrader role;
    
    public ContainerNPCTrader(final EntityNPCInterface npc, final EntityPlayer player) {
        super(player);
        this.role = (RoleTrader)npc.roleInterface;
        for (int i = 0; i < 18; ++i) {
            int x = 53;
            x += i % 3 * 72;
            int y = 7;
            y += i / 3 * 21;
            ItemStack item = this.role.inventoryCurrency.items.get(i);
            ItemStack item2 = this.role.inventoryCurrency.items.get(i + 18);
            if (item == null) {
                item = item2;
                item2 = null;
            }
            this.addSlotToContainer(new Slot((IInventory)this.role.inventorySold, i, x, y));
        }
        for (int i2 = 0; i2 < 3; ++i2) {
            for (int l1 = 0; l1 < 9; ++l1) {
                this.addSlotToContainer(new Slot((IInventory)player.inventory, l1 + i2 * 9 + 9, 32 + l1 * 18, 140 + i2 * 18));
            }
        }
        for (int j1 = 0; j1 < 9; ++j1) {
            this.addSlotToContainer(new Slot((IInventory)player.inventory, j1, 32 + j1 * 18, 198));
        }
    }
    
    public ItemStack transferStackInSlot(final EntityPlayer par1EntityPlayer, final int i) {
        return null;
    }
    
    public ItemStack slotClick(final int i, final int j, int par3, final EntityPlayer entityplayer) {
        if (par3 == 6) {
            par3 = 0;
        }
        if (i < 0 || i >= 18) {
            return super.slotClick(i, j, par3, entityplayer);
        }
        if (j == 1) {
            return null;
        }
        final Slot slot = (Slot) this.inventorySlots.get(i);
        if (slot == null || slot.getStack() == null) {
            return null;
        }
        final ItemStack item = slot.getStack();
        if (!this.canGivePlayer(item, entityplayer)) {
            return null;
        }
        if (!this.canBuy(i, entityplayer)) {
            return null;
        }
        NoppesUtilPlayer.consumeItem(entityplayer, this.role.inventoryCurrency.getStackInSlot(i), this.role.ignoreDamage, this.role.ignoreNBT);
        NoppesUtilPlayer.consumeItem(entityplayer, this.role.inventoryCurrency.getStackInSlot(i + 18), this.role.ignoreDamage, this.role.ignoreNBT);
        final ItemStack soldItem = item.copy();
        this.givePlayer(soldItem, entityplayer);
        return soldItem;
    }
    
    public boolean canBuy(final int slot, final EntityPlayer player) {
        ItemStack currency = this.role.inventoryCurrency.getStackInSlot(slot);
        ItemStack currency2 = this.role.inventoryCurrency.getStackInSlot(slot + 18);
        if (currency == null && currency2 == null) {
            return true;
        }
        if (currency == null) {
            currency = currency2;
            currency2 = null;
        }
        if (NoppesUtilPlayer.compareItems(currency, currency2, this.role.ignoreDamage, this.role.ignoreNBT)) {
            final ItemStack copy;
            currency = (copy = currency.copy());
            copy.stackSize += currency2.stackSize;
            currency2 = null;
        }
        if (currency2 == null) {
            return NoppesUtilPlayer.compareItems(player, currency, this.role.ignoreDamage, this.role.ignoreNBT);
        }
        return NoppesUtilPlayer.compareItems(player, currency, this.role.ignoreDamage, this.role.ignoreNBT) && NoppesUtilPlayer.compareItems(player, currency2, this.role.ignoreDamage, this.role.ignoreNBT);
    }
    
    private boolean canGivePlayer(final ItemStack item, final EntityPlayer entityplayer) {
        final ItemStack itemstack3 = entityplayer.inventory.getItemStack();
        if (itemstack3 == null) {
            return true;
        }
        if (NoppesUtilPlayer.compareItems(itemstack3, item, false, false)) {
            final int k1 = item.stackSize;
            if (k1 > 0 && k1 + itemstack3.stackSize <= itemstack3.getMaxStackSize()) {
                return true;
            }
        }
        return false;
    }
    
    private void givePlayer(final ItemStack item, final EntityPlayer entityplayer) {
        final ItemStack itemstack3 = entityplayer.inventory.getItemStack();
        if (itemstack3 == null) {
            entityplayer.inventory.setItemStack(item);
        }
        else if (NoppesUtilPlayer.compareItems(itemstack3, item, false, false)) {
            final int k1 = item.stackSize;
            if (k1 > 0 && k1 + itemstack3.stackSize <= itemstack3.getMaxStackSize()) {
                final ItemStack itemStack = itemstack3;
                itemStack.stackSize += k1;
            }
        }
    }
}
