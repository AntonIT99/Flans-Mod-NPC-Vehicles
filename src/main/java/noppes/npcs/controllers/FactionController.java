// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.controllers;

import java.util.Map;
import noppes.npcs.LogWriter;
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.util.Iterator;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.CompressedStreamTools;
import java.io.IOException;
import java.io.DataInputStream;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;
import java.io.FileInputStream;
import java.io.File;
import noppes.npcs.CustomNpcs;
import java.util.HashMap;

public class FactionController
{
    public HashMap<Integer, Faction> factions;
    private static FactionController instance;
    private int lastUsedID;
    
    public FactionController() {
        this.lastUsedID = 0;
        FactionController.instance = this;
        this.factions = new HashMap<Integer, Faction>();
        this.loadFactions();
        if (this.factions.isEmpty()) {
            this.factions.put(0, new Faction(0, "Friendly", 56576, 2000));
            this.factions.put(1, new Faction(1, "Neutral", 15916288, 1000));
            this.factions.put(2, new Faction(2, "Aggressive", 14483456, 0));
        }
    }
    
    public static FactionController getInstance() {
        return FactionController.instance;
    }
    
    private void loadFactions() {
        final File saveDir = CustomNpcs.getWorldSaveDirectory();
        if (saveDir == null) {
            return;
        }
        try {
            final File file = new File(saveDir, "factions.dat");
            if (file.exists()) {
                this.loadFactionsFile(file);
            }
        }
        catch (Exception e) {
            try {
                final File file2 = new File(saveDir, "factions.dat_old");
                if (file2.exists()) {
                    this.loadFactionsFile(file2);
                }
            }
            catch (Exception ex) {}
        }
    }
    
    private void loadFactionsFile(final File file) throws IOException {
        final DataInputStream var1 = new DataInputStream(new BufferedInputStream(new GZIPInputStream(new FileInputStream(file))));
        this.loadFactions(var1);
        var1.close();
    }
    
    public void loadFactions(final DataInputStream stream) throws IOException {
        final HashMap<Integer, Faction> factions = new HashMap<Integer, Faction>();
        final NBTTagCompound nbttagcompound1 = CompressedStreamTools.read(stream);
        this.lastUsedID = nbttagcompound1.getInteger("lastID");
        final NBTTagList list = nbttagcompound1.getTagList("NPCFactions", 10);
        if (list != null) {
            for (int i = 0; i < list.tagCount(); ++i) {
                final NBTTagCompound nbttagcompound2 = list.getCompoundTagAt(i);
                final Faction faction = new Faction();
                faction.readNBT(nbttagcompound2);
                factions.put(faction.id, faction);
            }
        }
        this.factions = factions;
    }
    
    public NBTTagCompound getNBT() {
        final NBTTagList list = new NBTTagList();
        for (final int slot : this.factions.keySet()) {
            final Faction faction = this.factions.get(slot);
            final NBTTagCompound nbtfactions = new NBTTagCompound();
            faction.writeNBT(nbtfactions);
            list.appendTag((NBTBase)nbtfactions);
        }
        final NBTTagCompound nbttagcompound = new NBTTagCompound();
        nbttagcompound.setInteger("lastID", this.lastUsedID);
        nbttagcompound.setTag("NPCFactions", (NBTBase)list);
        return nbttagcompound;
    }
    
    public void saveFactions() {
        try {
            final File saveDir = CustomNpcs.getWorldSaveDirectory();
            final File file = new File(saveDir, "factions.dat_new");
            final File file2 = new File(saveDir, "factions.dat_old");
            final File file3 = new File(saveDir, "factions.dat");
            CompressedStreamTools.writeCompressed(this.getNBT(), (OutputStream)new FileOutputStream(file));
            if (file2.exists()) {
                file2.delete();
            }
            file3.renameTo(file2);
            if (file3.exists()) {
                file3.delete();
            }
            file.renameTo(file3);
            if (file.exists()) {
                file.delete();
            }
        }
        catch (Exception e) {
            LogWriter.except(e);
        }
    }
    
    public Faction getFaction(final int faction) {
        return this.factions.get(faction);
    }
    
    public void saveFaction(final Faction faction) {
        if (faction.id < 0) {
            faction.id = this.getUnusedId();
            while (this.hasName(faction.name)) {
                faction.name += "_";
            }
        }
        else {
            final Faction existing = this.factions.get(faction.id);
            if (existing != null && !existing.name.equals(faction.name)) {
                while (this.hasName(faction.name)) {
                    faction.name += "_";
                }
            }
        }
        this.factions.remove(faction.id);
        this.factions.put(faction.id, faction);
        this.saveFactions();
    }
    
    public int getUnusedId() {
        if (this.lastUsedID == 0) {
            for (final int catid : this.factions.keySet()) {
                if (catid > this.lastUsedID) {
                    this.lastUsedID = catid;
                }
            }
        }
        return ++this.lastUsedID;
    }
    
    public void removeFaction(final int id) {
        if (id < 0 || this.factions.size() <= 1) {
            return;
        }
        this.factions.remove(id);
        this.saveFactions();
    }
    
    public int getFirstFactionId() {
        return this.factions.keySet().iterator().next();
    }
    
    public Faction getFirstFaction() {
        return this.factions.values().iterator().next();
    }
    
    public boolean hasName(final String newName) {
        if (newName.trim().isEmpty()) {
            return true;
        }
        for (final Faction faction : this.factions.values()) {
            if (faction.name.equals(newName)) {
                return true;
            }
        }
        return false;
    }
    
    public Faction getFactionFromName(final String factioname) {
        for (final Map.Entry<Integer, Faction> entryfaction : getInstance().factions.entrySet()) {
            if (entryfaction.getValue().name.equalsIgnoreCase(factioname)) {
                return entryfaction.getValue();
            }
        }
        return null;
    }
    
    public String[] getNames() {
        final String[] names = new String[this.factions.size()];
        int i = 0;
        for (final Faction faction : this.factions.values()) {
            names[i] = faction.name.toLowerCase();
            ++i;
        }
        return names;
    }
}
