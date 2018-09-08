// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.controllers;

import net.minecraft.nbt.NBTBase;
import java.util.ArrayList;
import java.util.List;
import noppes.npcs.util.NBTJsonUtil;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.ChatComponentText;
import net.minecraft.command.ICommandSender;
import net.minecraft.nbt.NBTTagList;
import java.io.InputStream;
import net.minecraft.nbt.CompressedStreamTools;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Iterator;
import noppes.npcs.LogWriter;
import net.minecraft.nbt.NBTTagCompound;
import java.util.Map;
import java.io.File;
import noppes.npcs.CustomNpcs;

public class ServerCloneController
{
    public static ServerCloneController Instance;
    
    public ServerCloneController() {
        this.loadClones();
    }
    
    private void loadClones() {
        try {
            File file = new File(CustomNpcs.getWorldSaveDirectory(), "clonednpcs.dat");
            if (file.exists()) {
                final Map<Integer, Map<String, NBTTagCompound>> clones = this.loadOldClones(file);
                file.delete();
                file = new File(CustomNpcs.getWorldSaveDirectory(), "clonednpcs.dat_old");
                if (file.exists()) {
                    file.delete();
                }
                for (final int tab : clones.keySet()) {
                    final Map<String, NBTTagCompound> map = clones.get(tab);
                    for (final String name : map.keySet()) {
                        this.saveClone(tab, name, map.get(name));
                    }
                }
            }
        }
        catch (Exception e) {
            LogWriter.except(e);
        }
    }
    
    public File getDir() {
        final File dir = new File(CustomNpcs.getWorldSaveDirectory(), "clones");
        if (!dir.exists()) {
            dir.mkdir();
        }
        return dir;
    }
    
    private Map<Integer, Map<String, NBTTagCompound>> loadOldClones(final File file) throws Exception {
        final Map<Integer, Map<String, NBTTagCompound>> clones = new HashMap<Integer, Map<String, NBTTagCompound>>();
        final NBTTagCompound nbttagcompound1 = CompressedStreamTools.readCompressed((InputStream)new FileInputStream(file));
        final NBTTagList list = nbttagcompound1.getTagList("Data", 10);
        if (list == null) {
            return clones;
        }
        for (int i = 0; i < list.tagCount(); ++i) {
            final NBTTagCompound compound = list.getCompoundTagAt(i);
            if (!compound.hasKey("ClonedTab")) {
                compound.setInteger("ClonedTab", 1);
            }
            Map<String, NBTTagCompound> tab = clones.get(compound.getInteger("ClonedTab"));
            if (tab == null) {
                clones.put(compound.getInteger("ClonedTab"), tab = new HashMap<String, NBTTagCompound>());
            }
            String name = compound.getString("ClonedName");
            for (int number = 1; tab.containsKey(name); name = String.format("%s%s", compound.getString("ClonedName"), number)) {
                ++number;
            }
            compound.removeTag("ClonedName");
            compound.removeTag("ClonedTab");
            compound.removeTag("ClonedDate");
            this.cleanTags(compound);
            tab.put(name, compound);
        }
        return clones;
    }
    
    public NBTTagCompound getCloneData(final ICommandSender player, final String name, final int tab) {
        final File file = new File(new File(this.getDir(), tab + ""), name + ".json");
        if (!file.exists()) {
            if (player != null) {
                player.addChatMessage((IChatComponent)new ChatComponentText("Could not find clone file"));
            }
            return null;
        }
        try {
            return NBTJsonUtil.LoadFile(file);
        }
        catch (Exception e) {
            LogWriter.error("Error loading: " + file.getAbsolutePath(), e);
            if (player != null) {
                player.addChatMessage((IChatComponent)new ChatComponentText(e.getMessage()));
            }
            return null;
        }
    }
    
    public void saveClone(final int tab, final String name, final NBTTagCompound compound) {
        try {
            final File dir = new File(this.getDir(), tab + "");
            if (!dir.exists()) {
                dir.mkdir();
            }
            final String filename = name + ".json";
            final File file = new File(dir, filename + "_new");
            final File file2 = new File(dir, filename);
            NBTJsonUtil.SaveFile(file, compound);
            if (file2.exists()) {
                file2.delete();
            }
            file.renameTo(file2);
        }
        catch (Exception e) {
            LogWriter.except(e);
        }
    }
    
    public List<String> getClones(final int tab) {
        final List<String> list = new ArrayList<String>();
        final File dir = new File(this.getDir(), tab + "");
        if (!dir.exists() || !dir.isDirectory()) {
            return list;
        }
        for (final String file : dir.list()) {
            if (file.endsWith(".json")) {
                list.add(file.substring(0, file.length() - 5));
            }
        }
        return list;
    }
    
    public boolean removeClone(final String name, final int tab) {
        final File file = new File(new File(this.getDir(), tab + ""), name + ".json");
        if (!file.exists()) {
            return false;
        }
        file.delete();
        return true;
    }
    
    public String addClone(final NBTTagCompound nbttagcompound, final String name, final int tab) {
        this.cleanTags(nbttagcompound);
        this.saveClone(tab, name, nbttagcompound);
        return name;
    }
    
    public void cleanTags(final NBTTagCompound nbttagcompound) {
        if (nbttagcompound.hasKey("ItemGiverId")) {
            nbttagcompound.setInteger("ItemGiverId", 0);
        }
        if (nbttagcompound.hasKey("TransporterId")) {
            nbttagcompound.setInteger("TransporterId", -1);
        }
        nbttagcompound.removeTag("StartPosNew");
        nbttagcompound.removeTag("StartPos");
        nbttagcompound.removeTag("MovingPathNew");
        nbttagcompound.removeTag("Pos");
        nbttagcompound.removeTag("Riding");
        if (!nbttagcompound.hasKey("ModRev")) {
            nbttagcompound.setInteger("ModRev", 1);
        }
        if (nbttagcompound.hasKey("TransformRole")) {
            final NBTTagCompound adv = nbttagcompound.getCompoundTag("TransformRole");
            adv.setInteger("TransporterId", -1);
            nbttagcompound.setTag("TransformRole", (NBTBase)adv);
        }
        if (nbttagcompound.hasKey("TransformJob")) {
            final NBTTagCompound adv = nbttagcompound.getCompoundTag("TransformJob");
            adv.setInteger("ItemGiverId", 0);
            nbttagcompound.setTag("TransformJob", (NBTBase)adv);
        }
        if (nbttagcompound.hasKey("TransformAI")) {
            final NBTTagCompound adv = nbttagcompound.getCompoundTag("TransformAI");
            adv.removeTag("StartPosNew");
            adv.removeTag("StartPos");
            adv.removeTag("MovingPathNew");
            nbttagcompound.setTag("TransformAI", (NBTBase)adv);
        }
    }
}
