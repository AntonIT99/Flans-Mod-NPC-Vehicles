// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.controllers;

import net.minecraft.nbt.NBTBase;
import noppes.npcs.entity.EntityCustomNpc;
import noppes.npcs.NBTTags;
import noppes.npcs.entity.EntityNPCInterface;
import noppes.npcs.util.JsonException;
import java.util.Iterator;
import java.io.IOException;
import net.minecraft.nbt.NBTTagCompound;
import noppes.npcs.util.NBTJsonUtil;
import noppes.npcs.CustomNpcs;
import java.io.File;
import noppes.npcs.LogWriter;
import java.util.ArrayList;
import java.util.List;

public class LinkedNpcController
{
    public static LinkedNpcController Instance;
    public List<LinkedData> list;
    
    public LinkedNpcController() {
        this.list = new ArrayList<LinkedData>();
        (LinkedNpcController.Instance = this).load();
    }
    
    private void load() {
        try {
            this.loadNpcs();
        }
        catch (Exception e) {
            LogWriter.except(e);
        }
    }
    
    public File getDir() {
        final File dir = new File(CustomNpcs.getWorldSaveDirectory(), "linkednpcs");
        if (!dir.exists()) {
            dir.mkdir();
        }
        return dir;
    }
    
    private void loadNpcs() {
        LogWriter.info("Loading Linked Npcs");
        final File dir = this.getDir();
        if (dir.exists()) {
            final List<LinkedData> list = new ArrayList<LinkedData>();
            for (final File file : dir.listFiles()) {
                if (file.getName().endsWith(".json")) {
                    try {
                        final NBTTagCompound compound = NBTJsonUtil.LoadFile(file);
                        final LinkedData linked = new LinkedData();
                        linked.setNBT(compound);
                        list.add(linked);
                    }
                    catch (Exception e) {
                        LogWriter.error("Error loading: " + file.getAbsolutePath(), e);
                    }
                }
            }
            this.list = list;
        }
        LogWriter.info("Done loading Linked Npcs");
    }
    
    public void save() {
        for (final LinkedData npc : this.list) {
            try {
                this.saveNpc(npc);
            }
            catch (IOException e) {
                LogWriter.except(e);
            }
        }
    }
    
    private void saveNpc(final LinkedData npc) throws IOException {
        final File file = new File(this.getDir(), npc.name + ".json_new");
        final File file2 = new File(this.getDir(), npc.name + ".json");
        try {
            NBTJsonUtil.SaveFile(file, npc.getNBT());
            if (file2.exists()) {
                file2.delete();
            }
            file.renameTo(file2);
        }
        catch (JsonException e) {
            LogWriter.except(e);
        }
    }
    
    public void loadNpcData(final EntityNPCInterface npc) {
        if (npc.linkedName.isEmpty()) {
            return;
        }
        final LinkedData data = this.getData(npc.linkedName);
        if (data == null) {
            npc.linkedLast = 0L;
            npc.linkedName = "";
            npc.linkedData = null;
        }
        else {
            npc.linkedData = data;
            if (npc.posX == 0.0 && npc.posY == 0.0 && npc.posX == 0.0) {
                return;
            }
            npc.linkedLast = data.time;
            final List<int[]> points = npc.ai.getMovingPath();
            final NBTTagCompound compound = NBTTags.NBTMerge(this.readNpcData(npc), data.data);
            npc.display.readToNBT(compound);
            npc.stats.readToNBT(compound);
            npc.advanced.readToNBT(compound);
            npc.inventory.readEntityFromNBT(compound);
            if (compound.hasKey("ModelData")) {
                ((EntityCustomNpc)npc).modelData.readFromNBT(compound.getCompoundTag("ModelData"));
            }
            npc.ai.readToNBT(compound);
            npc.transform.readToNBT(compound);
            npc.ai.setMovingPath(points);
            npc.updateClient = true;
        }
    }
    
    private void cleanTags(final NBTTagCompound compound) {
        compound.removeTag("MovingPathNew");
    }
    
    public LinkedData getData(final String name) {
        for (final LinkedData data : this.list) {
            if (data.name.equalsIgnoreCase(name)) {
                return data;
            }
        }
        return null;
    }
    
    private NBTTagCompound readNpcData(final EntityNPCInterface npc) {
        final NBTTagCompound compound = new NBTTagCompound();
        npc.display.writeToNBT(compound);
        npc.inventory.writeEntityToNBT(compound);
        npc.stats.writeToNBT(compound);
        npc.ai.writeToNBT(compound);
        npc.advanced.writeToNBT(compound);
        npc.transform.writeToNBT(compound);
        compound.setTag("ModelData", (NBTBase)((EntityCustomNpc)npc).modelData.writeToNBT());
        return compound;
    }
    
    public void saveNpcData(final EntityNPCInterface npc) {
        final NBTTagCompound compound = this.readNpcData(npc);
        this.cleanTags(compound);
        if (npc.linkedData.data.equals((Object)compound)) {
            return;
        }
        npc.linkedData.data = compound;
        npc.linkedData.time = System.currentTimeMillis();
        this.save();
    }
    
    public void removeData(final String name) {
        final Iterator<LinkedData> ita = this.list.iterator();
        while (ita.hasNext()) {
            if (ita.next().name.equalsIgnoreCase(name)) {
                ita.remove();
            }
        }
        this.save();
    }
    
    public void addData(final String name) {
        if (this.getData(name) != null || name.isEmpty()) {
            return;
        }
        final LinkedData data = new LinkedData();
        data.name = name;
        this.list.add(data);
        this.save();
    }
    
    public static class LinkedData
    {
        public String name;
        public long time;
        public NBTTagCompound data;
        
        public LinkedData() {
            this.name = "LinkedNpc";
            this.time = 0L;
            this.data = new NBTTagCompound();
            this.time = System.currentTimeMillis();
        }
        
        public void setNBT(final NBTTagCompound compound) {
            this.name = compound.getString("LinkedName");
            this.data = compound.getCompoundTag("NPCData");
        }
        
        public NBTTagCompound getNBT() {
            final NBTTagCompound compound = new NBTTagCompound();
            compound.setString("LinkedName", this.name);
            compound.setTag("NPCData", (NBTBase)this.data);
            return compound;
        }
    }
}
