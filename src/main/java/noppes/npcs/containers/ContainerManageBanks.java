// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.containers;

import net.minecraft.item.ItemStack;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.entity.player.EntityPlayer;
import noppes.npcs.controllers.Bank;
import net.minecraft.inventory.Container;

public class ContainerManageBanks extends Container
{
    public Bank bank;
    
    public ContainerManageBanks(final EntityPlayer player) {
        this.bank = new Bank();
        for (int i = 0; i < 6; ++i) {
            final int x = 36;
            int y = 38;
            y += i * 22;
            this.addSlotToContainer(new Slot((IInventory)this.bank.currencyInventory, i, x, y));
        }
        for (int i = 0; i < 6; ++i) {
            final int x = 142;
            int y = 38;
            y += i * 22;
            this.addSlotToContainer(new Slot((IInventory)this.bank.upgradeInventory, i, x, y));
        }
        for (int j1 = 0; j1 < 9; ++j1) {
            this.addSlotToContainer(new Slot((IInventory)player.inventory, j1, 8 + j1 * 18, 171));
        }
    }
    
    public ItemStack transferStackInSlot(final EntityPlayer par1EntityPlayer, final int i) {
        return null;
    }
    
    public boolean canInteractWith(final EntityPlayer entityplayer) {
        return true;
    }
    
    public void setBank(final Bank bank2) {
        for (int i = 0; i < 6; ++i) {
            this.bank.currencyInventory.setInventorySlotContents(i, bank2.currencyInventory.getStackInSlot(i));
            this.bank.upgradeInventory.setInventorySlotContents(i, bank2.upgradeInventory.getStackInSlot(i));
        }
    }
}
