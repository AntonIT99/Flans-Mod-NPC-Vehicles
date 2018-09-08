// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.containers;

import java.util.Iterator;
import noppes.npcs.controllers.PlayerMailData;
import noppes.npcs.controllers.PlayerDataController;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.Slot;
import net.minecraft.inventory.IInventory;
import net.minecraft.entity.player.EntityPlayer;
import noppes.npcs.controllers.PlayerMail;

public class ContainerMail extends ContainerNpcInterface
{
    private static final String __OBFID = "CL_00001742";
    public static PlayerMail staticmail;
    public PlayerMail mail;
    private boolean canEdit;
    private boolean canSend;
    
    public ContainerMail(final EntityPlayer player, final boolean canEdit, final boolean canSend) {
        super(player);
        this.mail = new PlayerMail();
        this.mail = ContainerMail.staticmail;
        ContainerMail.staticmail = new PlayerMail();
        this.canEdit = canEdit;
        this.canSend = canSend;
        player.inventory.openInventory();
        for (int k = 0; k < 4; ++k) {
            this.addSlotToContainer((Slot)new SlotValid((IInventory)this.mail, k, 179 + k * 24, 138, canEdit));
        }
        for (int j = 0; j < 3; ++j) {
            for (int k = 0; k < 9; ++k) {
                this.addSlotToContainer(new Slot((IInventory)player.inventory, k + j * 9 + 9, 28 + k * 18, 175 + j * 18));
            }
        }
        for (int j = 0; j < 9; ++j) {
            this.addSlotToContainer(new Slot((IInventory)player.inventory, j, 28 + j * 18, 230));
        }
    }
    
    public ItemStack transferStackInSlot(final EntityPlayer par1EntityPlayer, final int par2) {
        ItemStack itemstack = null;
        final Slot slot = (Slot) this.inventorySlots.get(par2);
        if (slot != null && slot.getHasStack()) {
            final ItemStack itemstack2 = slot.getStack();
            itemstack = itemstack2.copy();
            if (par2 < 4) {
                if (!this.mergeItemStack(itemstack2, 4, this.inventorySlots.size(), true)) {
                    return null;
                }
            }
            else if (!this.canEdit || !this.mergeItemStack(itemstack2, 0, 4, false)) {
                return null;
            }
            if (itemstack2.stackSize == 0) {
                slot.putStack((ItemStack)null);
            }
            else {
                slot.onSlotChanged();
            }
        }
        return itemstack;
    }
    
    public void onContainerClosed(final EntityPlayer player) {
        super.onContainerClosed(player);
        if (!this.canEdit && !player.worldObj.isRemote) {
            final PlayerMailData data = PlayerDataController.instance.getPlayerData(player).mailData;
            for (final PlayerMail mail : data.playermail) {
                if (mail.time == this.mail.time && mail.sender.equals(this.mail.sender)) {
                    mail.readNBT(this.mail.writeNBT());
                    break;
                }
            }
        }
    }
    
    static {
        ContainerMail.staticmail = new PlayerMail();
    }
}
