// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.quests;

import java.util.Vector;
import java.util.Iterator;
import java.util.HashMap;
import noppes.npcs.NoppesUtilPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import noppes.npcs.NpcMiscInventory;

public class QuestItem extends QuestInterface
{
    public NpcMiscInventory items;
    public boolean leaveItems;
    public boolean ignoreDamage;
    public boolean ignoreNBT;
    
    public QuestItem() {
        this.items = new NpcMiscInventory(3);
        this.leaveItems = false;
        this.ignoreDamage = false;
        this.ignoreNBT = false;
    }
    
    @Override
    public void readEntityFromNBT(final NBTTagCompound compound) {
        this.items.setFromNBT(compound.getCompoundTag("Items"));
        this.leaveItems = compound.getBoolean("LeaveItems");
        this.ignoreDamage = compound.getBoolean("IgnoreDamage");
        this.ignoreNBT = compound.getBoolean("IgnoreNBT");
    }
    
    @Override
    public void writeEntityToNBT(final NBTTagCompound compound) {
        compound.setTag("Items", (NBTBase)this.items.getToNBT());
        compound.setBoolean("LeaveItems", this.leaveItems);
        compound.setBoolean("IgnoreDamage", this.ignoreDamage);
        compound.setBoolean("IgnoreNBT", this.ignoreNBT);
    }
    
    @Override
    public boolean isCompleted(final EntityPlayer player) {
        final HashMap<Integer, ItemStack> map = this.getProcessSet(player);
        for (final ItemStack reqItem : this.items.items.values()) {
            boolean done = false;
            for (final ItemStack item : map.values()) {
                if (NoppesUtilPlayer.compareItems(reqItem, item, this.ignoreDamage, this.ignoreNBT) && item.stackSize >= reqItem.stackSize) {
                    done = true;
                    break;
                }
            }
            if (!done) {
                return false;
            }
        }
        return true;
    }
    
    public HashMap<Integer, ItemStack> getProcessSet(final EntityPlayer player) {
        final HashMap<Integer, ItemStack> map = new HashMap<Integer, ItemStack>();
        for (final int slot : this.items.items.keySet()) {
            final ItemStack item = this.items.items.get(slot);
            if (item == null) {
                continue;
            }
            final ItemStack is = item.copy();
            is.stackSize = 0;
            map.put(slot, is);
        }
        for (final ItemStack item2 : player.inventory.mainInventory) {
            if (item2 != null) {
                for (final ItemStack questItem : map.values()) {
                    if (NoppesUtilPlayer.compareItems(questItem, item2, this.ignoreDamage, this.ignoreNBT)) {
                        final ItemStack itemStack = questItem;
                        itemStack.stackSize += item2.stackSize;
                    }
                }
            }
        }
        return map;
    }
    
    @Override
    public void handleComplete(final EntityPlayer player) {
        if (this.leaveItems) {
            return;
        }
        for (final ItemStack questitem : this.items.items.values()) {
            int stacksize = questitem.stackSize;
            for (int i = 0; i < player.inventory.mainInventory.length; ++i) {
                final ItemStack item = player.inventory.mainInventory[i];
                if (item != null) {
                    if (NoppesUtilPlayer.compareItems(item, questitem, this.ignoreDamage, this.ignoreNBT)) {
                        final int size = item.stackSize;
                        if (stacksize - size >= 0) {
                            player.inventory.setInventorySlotContents(i, (ItemStack)null);
                            item.splitStack(size);
                        }
                        else {
                            item.splitStack(stacksize);
                        }
                        stacksize -= size;
                        if (stacksize <= 0) {
                            break;
                        }
                    }
                }
            }
        }
    }
    
    @Override
    public Vector<String> getQuestLogStatus(final EntityPlayer player) {
        final Vector<String> vec = new Vector<String>();
        final HashMap<Integer, ItemStack> map = this.getProcessSet(player);
        for (final int slot : map.keySet()) {
            final ItemStack item = map.get(slot);
            final ItemStack quest = this.items.items.get(slot);
            if (item == null) {
                continue;
            }
            String process = item.stackSize + "";
            if (item.stackSize > quest.stackSize) {
                process = quest.stackSize + "";
            }
            process = process + "/" + quest.stackSize + "";
            if (item.hasDisplayName()) {
                vec.add(item.getDisplayName() + ": " + process);
            }
            else {
                vec.add(item.getUnlocalizedName() + ".name" + ": " + process);
            }
        }
        return vec;
    }
}
