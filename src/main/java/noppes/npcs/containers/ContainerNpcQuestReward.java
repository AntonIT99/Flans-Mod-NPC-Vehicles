// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.containers;

import net.minecraft.item.ItemStack;
import noppes.npcs.controllers.Quest;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import noppes.npcs.client.gui.global.GuiNPCManageQuest;
import noppes.npcs.NoppesUtilServer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;

public class ContainerNpcQuestReward extends Container
{
    public ContainerNpcQuestReward(final EntityPlayer player) {
        Quest quest = NoppesUtilServer.getEditingQuest(player);
        if (player.worldObj.isRemote) {
            quest = GuiNPCManageQuest.quest;
        }
        for (int l = 0; l < 3; ++l) {
            for (int k1 = 0; k1 < 3; ++k1) {
                this.addSlotToContainer(new Slot((IInventory)quest.rewardItems, k1 + l * 3, 105 + k1 * 18, 17 + l * 18));
            }
        }
        for (int i1 = 0; i1 < 3; ++i1) {
            for (int l2 = 0; l2 < 9; ++l2) {
                this.addSlotToContainer(new Slot((IInventory)player.inventory, l2 + i1 * 9 + 9, 8 + l2 * 18, 84 + i1 * 18));
            }
        }
        for (int j1 = 0; j1 < 9; ++j1) {
            this.addSlotToContainer(new Slot((IInventory)player.inventory, j1, 8 + j1 * 18, 142));
        }
    }
    
    public ItemStack transferStackInSlot(final EntityPlayer par1EntityPlayer, final int i) {
        return null;
    }
    
    public boolean canInteractWith(final EntityPlayer entityplayer) {
        return true;
    }
}
