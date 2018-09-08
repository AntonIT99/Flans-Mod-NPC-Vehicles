// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.containers;

import net.minecraft.item.ItemStack;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.entity.player.EntityPlayer;
import noppes.npcs.entity.EntityNPCInterface;
import noppes.npcs.roles.RoleTrader;
import net.minecraft.inventory.Container;

public class ContainerNPCTraderSetup extends Container
{
    public RoleTrader role;
    
    public ContainerNPCTraderSetup(final EntityNPCInterface npc, final EntityPlayer player) {
        this.role = (RoleTrader)npc.roleInterface;
        for (int i = 0; i < 18; ++i) {
            int x = 7;
            x += i % 3 * 94;
            int y = 15;
            y += i / 3 * 22;
            this.addSlotToContainer(new Slot((IInventory)this.role.inventoryCurrency, i + 18, x, y));
            this.addSlotToContainer(new Slot((IInventory)this.role.inventoryCurrency, i, x + 18, y));
            this.addSlotToContainer(new Slot((IInventory)this.role.inventorySold, i, x + 43, y));
        }
        for (int i2 = 0; i2 < 3; ++i2) {
            for (int l1 = 0; l1 < 9; ++l1) {
                this.addSlotToContainer(new Slot((IInventory)player.inventory, l1 + i2 * 9 + 9, 48 + l1 * 18, 147 + i2 * 18));
            }
        }
        for (int j1 = 0; j1 < 9; ++j1) {
            this.addSlotToContainer(new Slot((IInventory)player.inventory, j1, 48 + j1 * 18, 205));
        }
    }
    
    public ItemStack transferStackInSlot(final EntityPlayer par1EntityPlayer, final int i) {
        return null;
    }
    
    public boolean canInteractWith(final EntityPlayer entityplayer) {
        return true;
    }
}
