// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.controllers;

import java.util.Iterator;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.nbt.NBTTagCompound;
import java.util.HashMap;

public class PlayerFactionData
{
    public HashMap<Integer, Integer> factionData;
    
    public PlayerFactionData() {
        this.factionData = new HashMap<Integer, Integer>();
    }
    
    public void loadNBTData(final NBTTagCompound compound) {
        final HashMap<Integer, Integer> factionData = new HashMap<Integer, Integer>();
        if (compound == null) {
            return;
        }
        final NBTTagList list = compound.getTagList("FactionData", 10);
        if (list == null) {
            return;
        }
        for (int i = 0; i < list.tagCount(); ++i) {
            final NBTTagCompound nbttagcompound = list.getCompoundTagAt(i);
            factionData.put(nbttagcompound.getInteger("Faction"), nbttagcompound.getInteger("Points"));
        }
        this.factionData = factionData;
    }
    
    public void saveNBTData(final NBTTagCompound compound) {
        final NBTTagList list = new NBTTagList();
        for (final int faction : this.factionData.keySet()) {
            final NBTTagCompound nbttagcompound = new NBTTagCompound();
            nbttagcompound.setInteger("Faction", faction);
            nbttagcompound.setInteger("Points", (int)this.factionData.get(faction));
            list.appendTag((NBTBase)nbttagcompound);
        }
        compound.setTag("FactionData", (NBTBase)list);
    }
    
    public int getFactionPoints(final int id) {
        if (!this.factionData.containsKey(id)) {
            final Faction faction = FactionController.getInstance().getFaction(id);
            this.factionData.put(id, (faction == null) ? -1 : faction.defaultPoints);
        }
        return this.factionData.get(id);
    }
    
    public void increasePoints(final int factionId, final int points) {
        if (!this.factionData.containsKey(factionId)) {
            final Faction faction = FactionController.getInstance().getFaction(factionId);
            this.factionData.put(factionId, (faction == null) ? -1 : faction.defaultPoints);
        }
        this.factionData.put(factionId, this.factionData.get(factionId) + points);
    }
    
    public NBTTagCompound getPlayerGuiData() {
        final NBTTagCompound compound = new NBTTagCompound();
        this.saveNBTData(compound);
        final NBTTagList list = new NBTTagList();
        for (final int id : this.factionData.keySet()) {
            final Faction faction = FactionController.getInstance().getFaction(id);
            if (faction != null) {
                if (faction.hideFaction) {
                    continue;
                }
                final NBTTagCompound com = new NBTTagCompound();
                faction.writeNBT(com);
                list.appendTag((NBTBase)com);
            }
        }
        compound.setTag("FactionList", (NBTBase)list);
        return compound;
    }
}
