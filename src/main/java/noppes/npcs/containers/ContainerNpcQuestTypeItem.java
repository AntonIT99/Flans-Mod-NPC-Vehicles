// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.containers;

import net.minecraft.item.ItemStack;
import noppes.npcs.controllers.Quest;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import noppes.npcs.quests.QuestItem;
import noppes.npcs.client.gui.global.GuiNPCManageQuest;
import noppes.npcs.NoppesUtilServer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.Container;

public class ContainerNpcQuestTypeItem extends Container
{
    public ContainerNpcQuestTypeItem(final EntityPlayer player) {
        Quest quest = NoppesUtilServer.getEditingQuest(player);
        if (player.worldObj.isRemote) {
            quest = GuiNPCManageQuest.quest;
        }
        for (int i1 = 0; i1 < 3; ++i1) {
            this.addSlotToContainer(new Slot((IInventory)((QuestItem)quest.questInterface).items, i1, 44, 39 + i1 * 25));
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
        return null;
    }
    
    public boolean canInteractWith(final EntityPlayer entityplayer) {
        return true;
    }
}
