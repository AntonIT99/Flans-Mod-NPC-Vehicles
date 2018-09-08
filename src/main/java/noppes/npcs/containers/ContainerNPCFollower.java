// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.containers;

import net.minecraft.item.ItemStack;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Container;
import net.minecraft.entity.player.EntityPlayer;
import noppes.npcs.entity.EntityNPCInterface;
import noppes.npcs.roles.RoleFollower;

public class ContainerNPCFollower extends ContainerNpcInterface
{
    public InventoryNPC currencyMatrix;
    public RoleFollower role;
    
    public ContainerNPCFollower(final EntityNPCInterface npc, final EntityPlayer player) {
        super(player);
        this.role = (RoleFollower)npc.roleInterface;
        this.currencyMatrix = new InventoryNPC("currency", 1, this);
        this.addSlotToContainer((Slot)new SlotNpcMercenaryCurrency(this.role, (IInventory)this.currencyMatrix, 0, 26, 9));
        for (int j1 = 0; j1 < 9; ++j1) {
            this.addSlotToContainer(new Slot((IInventory)player.inventory, j1, 8 + j1 * 18, 142));
        }
    }
    
    public ItemStack transferStackInSlot(final EntityPlayer par1EntityPlayer, final int i) {
        return null;
    }
    
    public void onContainerClosed(final EntityPlayer entityplayer) {
        super.onContainerClosed(entityplayer);
        if (!entityplayer.worldObj.isRemote) {
            final ItemStack itemstack = this.currencyMatrix.getStackInSlotOnClosing(0);
            if (itemstack != null && !entityplayer.worldObj.isRemote) {
                entityplayer.entityDropItem(itemstack, 0.0f);
            }
        }
    }
}
