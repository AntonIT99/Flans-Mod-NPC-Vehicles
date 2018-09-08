// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.controllers;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagList;
import noppes.npcs.NoppesUtilServer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.inventory.IInventory;

public class PlayerMail implements IInventory
{
    public String subject;
    public String sender;
    public NBTTagCompound message;
    public long time;
    public boolean beenRead;
    public int questId;
    public String questTitle;
    public ItemStack[] items;
    public long timePast;
    
    public PlayerMail() {
        this.subject = "";
        this.sender = "";
        this.message = new NBTTagCompound();
        this.time = 0L;
        this.beenRead = false;
        this.questId = -1;
        this.questTitle = "";
        this.items = new ItemStack[4];
    }
    
    public void readNBT(final NBTTagCompound compound) {
        this.subject = compound.getString("Subject");
        this.sender = compound.getString("Sender");
        this.time = compound.getLong("Time");
        this.beenRead = compound.getBoolean("BeenRead");
        this.message = compound.getCompoundTag("Message");
        this.timePast = compound.getLong("TimePast");
        if (compound.hasKey("MailQuest")) {
            this.questId = compound.getInteger("MailQuest");
        }
        this.questTitle = compound.getString("MailQuestTitle");
        this.items = new ItemStack[this.getSizeInventory()];
        final NBTTagList nbttaglist = compound.getTagList("MailItems", 10);
        for (int i = 0; i < nbttaglist.tagCount(); ++i) {
            final NBTTagCompound nbttagcompound1 = nbttaglist.getCompoundTagAt(i);
            final int j = nbttagcompound1.getByte("Slot") & 0xFF;
            if (j >= 0 && j < this.items.length) {
                this.items[j] = NoppesUtilServer.readItem(nbttagcompound1);
            }
        }
    }
    
    public NBTTagCompound writeNBT() {
        final NBTTagCompound compound = new NBTTagCompound();
        compound.setString("Subject", this.subject);
        compound.setString("Sender", this.sender);
        compound.setLong("Time", this.time);
        compound.setBoolean("BeenRead", this.beenRead);
        compound.setTag("Message", (NBTBase)this.message);
        compound.setLong("TimePast", System.currentTimeMillis() - this.time);
        compound.setInteger("MailQuest", this.questId);
        if (this.hasQuest()) {
            compound.setString("MailQuestTitle", this.getQuest().title);
        }
        final NBTTagList nbttaglist = new NBTTagList();
        for (int i = 0; i < this.items.length; ++i) {
            if (this.items[i] != null) {
                final NBTTagCompound nbttagcompound1 = new NBTTagCompound();
                nbttagcompound1.setByte("Slot", (byte)i);
                NoppesUtilServer.writeItem(this.items[i], nbttagcompound1);
                nbttaglist.appendTag((NBTBase)nbttagcompound1);
            }
        }
        compound.setTag("MailItems", (NBTBase)nbttaglist);
        return compound;
    }
    
    public boolean isValid() {
        return !this.subject.isEmpty() && !this.message.hasNoTags() && !this.sender.isEmpty();
    }
    
    public boolean hasQuest() {
        return this.getQuest() != null;
    }
    
    public Quest getQuest() {
        return (QuestController.instance != null) ? QuestController.instance.quests.get(this.questId) : null;
    }
    
    public int getSizeInventory() {
        return 4;
    }
    
    public int getInventoryStackLimit() {
        return 64;
    }
    
    public ItemStack getStackInSlot(final int var1) {
        return this.items[var1];
    }
    
    public ItemStack decrStackSize(final int par1, final int par2) {
        if (this.items[par1] == null) {
            return null;
        }
        if (this.items[par1].stackSize <= par2) {
            final ItemStack itemstack = this.items[par1];
            this.items[par1] = null;
            this.markDirty();
            return itemstack;
        }
        final ItemStack itemstack = this.items[par1].splitStack(par2);
        if (this.items[par1].stackSize == 0) {
            this.items[par1] = null;
        }
        this.markDirty();
        return itemstack;
    }
    
    public ItemStack getStackInSlotOnClosing(final int var1) {
        if (this.items[var1] != null) {
            final ItemStack itemstack = this.items[var1];
            this.items[var1] = null;
            return itemstack;
        }
        return null;
    }
    
    public void setInventorySlotContents(final int par1, final ItemStack par2ItemStack) {
        this.items[par1] = par2ItemStack;
        if (par2ItemStack != null && par2ItemStack.stackSize > this.getInventoryStackLimit()) {
            par2ItemStack.stackSize = this.getInventoryStackLimit();
        }
        this.markDirty();
    }
    
    public String getInventoryName() {
        return null;
    }
    
    public boolean hasCustomInventoryName() {
        return false;
    }
    
    public void markDirty() {
    }
    
    public boolean isUseableByPlayer(final EntityPlayer var1) {
        return true;
    }
    
    public void openInventory() {
    }
    
    public void closeInventory() {
    }
    
    public boolean isItemValidForSlot(final int var1, final ItemStack var2) {
        return true;
    }
    
    public PlayerMail copy() {
        final PlayerMail mail = new PlayerMail();
        mail.readNBT(this.writeNBT());
        return mail;
    }
}
