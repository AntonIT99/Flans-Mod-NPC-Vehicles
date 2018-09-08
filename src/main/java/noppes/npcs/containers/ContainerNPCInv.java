// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.containers;

import net.minecraft.item.ItemStack;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.IInventory;
import net.minecraft.entity.player.EntityPlayer;
import noppes.npcs.entity.EntityNPCInterface;
import net.minecraft.inventory.Container;

public class ContainerNPCInv extends Container
{
    public ContainerNPCInv(final EntityNPCInterface npc, final EntityPlayer player) {
        for (int l = 0; l < 4; ++l) {
            this.addSlotToContainer((Slot)new SlotNPCArmor((IInventory)npc.inventory, l, 9, 22 + l * 18, l));
        }
        this.addSlotToContainer(new Slot((IInventory)npc.inventory, 4, 81, 22));
        this.addSlotToContainer(new Slot((IInventory)npc.inventory, 5, 81, 40));
        this.addSlotToContainer(new Slot((IInventory)npc.inventory, 6, 81, 58));
        for (int l = 0; l < 9; ++l) {
            this.addSlotToContainer(new Slot((IInventory)npc.inventory, l + 7, 191, 16 + l * 21));
        }
        for (int i1 = 0; i1 < 3; ++i1) {
            for (int l2 = 0; l2 < 9; ++l2) {
                this.addSlotToContainer(new Slot((IInventory)player.inventory, l2 + i1 * 9 + 9, l2 * 18 + 8, 113 + i1 * 18));
            }
        }
        for (int j1 = 0; j1 < 9; ++j1) {
            this.addSlotToContainer(new Slot((IInventory)player.inventory, j1, j1 * 18 + 8, 171));
        }
    }
    
    public ItemStack transferStackInSlot(final EntityPlayer par1EntityPlayer, final int i) {
        return null;
    }
    
    public boolean canInteractWith(final EntityPlayer entityplayer) {
        return true;
    }
}
