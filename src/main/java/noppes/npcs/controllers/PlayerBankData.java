// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.controllers;

import java.util.Iterator;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.nbt.NBTTagCompound;
import java.util.HashMap;

public class PlayerBankData
{
    public HashMap<Integer, BankData> banks;
    
    public PlayerBankData() {
        this.banks = new HashMap<Integer, BankData>();
    }
    
    public void loadNBTData(final NBTTagCompound compound) {
        final HashMap<Integer, BankData> banks = new HashMap<Integer, BankData>();
        final NBTTagList list = compound.getTagList("BankData", 10);
        if (list == null) {
            return;
        }
        for (int i = 0; i < list.tagCount(); ++i) {
            final NBTTagCompound nbttagcompound = list.getCompoundTagAt(i);
            final BankData data = new BankData();
            data.readNBT(nbttagcompound);
            banks.put(data.bankId, data);
        }
        this.banks = banks;
    }
    
    public void saveNBTData(final NBTTagCompound playerData) {
        final NBTTagList list = new NBTTagList();
        for (final BankData data : this.banks.values()) {
            final NBTTagCompound nbttagcompound = new NBTTagCompound();
            data.writeNBT(nbttagcompound);
            list.appendTag((NBTBase)nbttagcompound);
        }
        playerData.setTag("BankData", (NBTBase)list);
    }
    
    public BankData getBank(final int bankId) {
        return this.banks.get(bankId);
    }
    
    public BankData getBankOrDefault(final int bankId) {
        final BankData data = this.banks.get(bankId);
        if (data != null) {
            return data;
        }
        final Bank bank = BankController.getInstance().getBank(bankId);
        return this.banks.get(bank.id);
    }
    
    public boolean hasBank(final int bank) {
        return this.banks.containsKey(bank);
    }
    
    public void loadNew(final int bank) {
        final BankData data = new BankData();
        data.bankId = bank;
        this.banks.put(bank, data);
    }
}
