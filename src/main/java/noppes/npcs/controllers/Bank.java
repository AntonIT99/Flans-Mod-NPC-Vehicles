// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.controllers;

import noppes.npcs.NBTTags;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import noppes.npcs.NpcMiscInventory;
import java.util.HashMap;

public class Bank
{
    public int id;
    public String name;
    public HashMap<Integer, Integer> slotTypes;
    public int startSlots;
    public int maxSlots;
    public NpcMiscInventory currencyInventory;
    public NpcMiscInventory upgradeInventory;
    
    public Bank() {
        this.id = -1;
        this.name = "";
        this.startSlots = 1;
        this.maxSlots = 6;
        this.slotTypes = new HashMap<Integer, Integer>();
        this.currencyInventory = new NpcMiscInventory(6);
        this.upgradeInventory = new NpcMiscInventory(6);
        for (int i = 0; i < 6; ++i) {
            this.slotTypes.put(i, 0);
        }
    }
    
    public void writeEntityToNBT(final NBTTagCompound nbttagcompound) {
        nbttagcompound.setInteger("BankID", this.id);
        nbttagcompound.setTag("BankCurrency", (NBTBase)this.currencyInventory.getToNBT());
        nbttagcompound.setTag("BankUpgrade", (NBTBase)this.upgradeInventory.getToNBT());
        nbttagcompound.setString("Username", this.name);
        nbttagcompound.setInteger("MaxSlots", this.maxSlots);
        nbttagcompound.setInteger("StartSlots", this.startSlots);
        nbttagcompound.setTag("BankTypes", (NBTBase)NBTTags.nbtIntegerIntegerMap(this.slotTypes));
    }
    
    public void readEntityFromNBT(final NBTTagCompound nbttagcompound) {
        this.id = nbttagcompound.getInteger("BankID");
        this.name = nbttagcompound.getString("Username");
        this.startSlots = nbttagcompound.getInteger("StartSlots");
        this.maxSlots = nbttagcompound.getInteger("MaxSlots");
        this.slotTypes = NBTTags.getIntegerIntegerMap(nbttagcompound.getTagList("BankTypes", 10));
        this.currencyInventory.setFromNBT(nbttagcompound.getCompoundTag("BankCurrency"));
        this.upgradeInventory.setFromNBT(nbttagcompound.getCompoundTag("BankUpgrade"));
    }
    
    public boolean isUpgraded(final int slot) {
        return this.slotTypes.get(slot) != null && this.slotTypes.get(slot) == 2;
    }
    
    public boolean canBeUpgraded(final int slot) {
        return this.upgradeInventory.getStackInSlot(slot) != null && (this.slotTypes.get(slot) == null || this.slotTypes.get(slot) == 0);
    }
    
    public int getMaxSlots() {
        for (int i = 0; i < this.maxSlots; ++i) {
            if (this.currencyInventory.getStackInSlot(i) == null && i > this.startSlots - 1) {
                return i;
            }
        }
        return this.maxSlots;
    }
}
