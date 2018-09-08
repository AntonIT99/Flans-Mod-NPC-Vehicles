// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.controllers;

import java.util.Map;
import java.util.Collection;
import net.minecraft.util.WeightedRandom;
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
import java.util.Random;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

public class SpawnController
{
    public HashMap<String, List<SpawnData>> biomes;
    public ArrayList<SpawnData> data;
    public Random random;
    public static SpawnController instance;
    private int lastUsedID;
    
    public SpawnController() {
        this.biomes = new HashMap<String, List<SpawnData>>();
        this.data = new ArrayList<SpawnData>();
        this.random = new Random();
        this.lastUsedID = 0;
        (SpawnController.instance = this).loadData();
    }
    
    private void loadData() {
        final File saveDir = CustomNpcs.getWorldSaveDirectory();
        if (saveDir == null) {
            return;
        }
        try {
            final File file = new File(saveDir, "spawns.dat");
            if (file.exists()) {
                this.loadDataFile(file);
            }
        }
        catch (Exception e) {
            try {
                final File file2 = new File(saveDir, "spawns.dat_old");
                if (file2.exists()) {
                    this.loadDataFile(file2);
                }
            }
            catch (Exception ex) {}
        }
    }
    
    private void loadDataFile(final File file) throws IOException {
        final DataInputStream var1 = new DataInputStream(new BufferedInputStream(new GZIPInputStream(new FileInputStream(file))));
        this.loadData(var1);
        var1.close();
    }
    
    public void loadData(final DataInputStream stream) throws IOException {
        final ArrayList<SpawnData> data = new ArrayList<SpawnData>();
        final NBTTagCompound nbttagcompound1 = CompressedStreamTools.read(stream);
        this.lastUsedID = nbttagcompound1.getInteger("lastID");
        final NBTTagList nbtlist = nbttagcompound1.getTagList("NPCSpawnData", 10);
        if (nbtlist != null) {
            for (int i = 0; i < nbtlist.tagCount(); ++i) {
                final NBTTagCompound nbttagcompound2 = nbtlist.getCompoundTagAt(i);
                final SpawnData spawn = new SpawnData();
                spawn.readNBT(nbttagcompound2);
                data.add(spawn);
            }
        }
        this.data = data;
        this.fillBiomeData();
    }
    
    public NBTTagCompound getNBT() {
        final NBTTagList list = new NBTTagList();
        for (final SpawnData spawn : this.data) {
            final NBTTagCompound nbtfactions = new NBTTagCompound();
            spawn.writeNBT(nbtfactions);
            list.appendTag((NBTBase)nbtfactions);
        }
        final NBTTagCompound nbttagcompound = new NBTTagCompound();
        nbttagcompound.setInteger("lastID", this.lastUsedID);
        nbttagcompound.setTag("NPCSpawnData", (NBTBase)list);
        return nbttagcompound;
    }
    
    public void saveData() {
        try {
            final File saveDir = CustomNpcs.getWorldSaveDirectory();
            final File file = new File(saveDir, "spawns.dat_new");
            final File file2 = new File(saveDir, "spawns.dat_old");
            final File file3 = new File(saveDir, "spawns.dat");
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
    
    public SpawnData getSpawnData(final int id) {
        for (final SpawnData spawn : this.data) {
            if (spawn.id == id) {
                return spawn;
            }
        }
        return null;
    }
    
    public void saveSpawnData(final SpawnData spawn) {
        if (spawn.id < 0) {
            spawn.id = this.getUnusedId();
        }
        final SpawnData original = this.getSpawnData(spawn.id);
        if (original == null) {
            this.data.add(spawn);
        }
        else {
            original.readNBT(spawn.writeNBT(new NBTTagCompound()));
        }
        this.fillBiomeData();
        this.saveData();
    }
    
    private void fillBiomeData() {
        final HashMap<String, List<SpawnData>> biomes = new HashMap<String, List<SpawnData>>();
        for (final SpawnData spawn : this.data) {
            for (final String s : spawn.biomes) {
                List<SpawnData> list = biomes.get(s);
                if (list == null) {
                    biomes.put(s, list = new ArrayList<SpawnData>());
                }
                list.add(spawn);
            }
        }
        this.biomes = biomes;
    }
    
    public int getUnusedId() {
        return ++this.lastUsedID;
    }
    
    public void removeSpawnData(final int id) {
        final ArrayList<SpawnData> data = new ArrayList<SpawnData>();
        for (final SpawnData spawn : this.data) {
            if (spawn.id == id) {
                continue;
            }
            data.add(spawn);
        }
        this.data = data;
        this.fillBiomeData();
        this.saveData();
    }
    
    public List<SpawnData> getSpawnList(final String biome) {
        return this.biomes.get(biome);
    }
    
    public SpawnData getRandomSpawnData(final String biome, final boolean isAir) {
        final List<SpawnData> list = this.getSpawnList(biome);
        if (list == null || list.isEmpty()) {
            return null;
        }
        return (SpawnData)WeightedRandom.getRandomItem(this.random, (Collection)list);
    }
    
    public Map<String, Integer> getScroll() {
        final Map<String, Integer> map = new HashMap<String, Integer>();
        for (final SpawnData spawn : this.data) {
            map.put(spawn.name, spawn.id);
        }
        return map;
    }
}
