// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.controllers;

import noppes.npcs.roles.RoleTransporter;
import noppes.npcs.constants.EnumRoleType;
import noppes.npcs.entity.EntityNPCInterface;
import net.minecraft.entity.player.EntityPlayerMP;
import noppes.npcs.LogWriter;
import java.io.OutputStream;
import java.io.FileOutputStream;
import net.minecraft.nbt.NBTBase;
import java.util.Iterator;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.nbt.NBTTagCompound;
import java.io.InputStream;
import net.minecraft.nbt.CompressedStreamTools;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.File;
import noppes.npcs.CustomNpcs;
import java.util.HashMap;

public class TransportController
{
    private HashMap<Integer, TransportLocation> locations;
    public HashMap<Integer, TransportCategory> categories;
    private int lastUsedID;
    private static TransportController instance;
    
    public TransportController() {
        this.locations = new HashMap<Integer, TransportLocation>();
        this.categories = new HashMap<Integer, TransportCategory>();
        this.lastUsedID = 0;
        (TransportController.instance = this).loadCategories();
        if (this.categories.isEmpty()) {
            final TransportCategory cat = new TransportCategory();
            cat.id = 1;
            cat.title = "Default";
            this.categories.put(cat.id, cat);
        }
    }
    
    private void loadCategories() {
        final File saveDir = CustomNpcs.getWorldSaveDirectory();
        if (saveDir == null) {
            return;
        }
        try {
            final File file = new File(saveDir, "transport.dat");
            if (!file.exists()) {
                return;
            }
            this.loadCategories(file);
        }
        catch (IOException e) {
            try {
                final File file2 = new File(saveDir, "transport.dat_old");
                if (!file2.exists()) {
                    return;
                }
                this.loadCategories(file2);
            }
            catch (IOException ex) {}
        }
    }
    
    public void loadCategories(final File file) throws IOException {
        final HashMap<Integer, TransportLocation> locations = new HashMap<Integer, TransportLocation>();
        final HashMap<Integer, TransportCategory> categories = new HashMap<Integer, TransportCategory>();
        final NBTTagCompound nbttagcompound1 = CompressedStreamTools.readCompressed((InputStream)new FileInputStream(file));
        this.lastUsedID = nbttagcompound1.getInteger("lastID");
        final NBTTagList list = nbttagcompound1.getTagList("NPCTransportCategories", 10);
        if (list == null) {
            return;
        }
        for (int i = 0; i < list.tagCount(); ++i) {
            final TransportCategory category = new TransportCategory();
            final NBTTagCompound compound = list.getCompoundTagAt(i);
            category.readNBT(compound);
            for (final TransportLocation location : category.locations.values()) {
                locations.put(location.id, location);
            }
            categories.put(category.id, category);
        }
        this.locations = locations;
        this.categories = categories;
    }
    
    public NBTTagCompound getNBT() {
        final NBTTagList list = new NBTTagList();
        for (final TransportCategory category : this.categories.values()) {
            final NBTTagCompound compound = new NBTTagCompound();
            category.writeNBT(compound);
            list.appendTag((NBTBase)compound);
        }
        final NBTTagCompound nbttagcompound = new NBTTagCompound();
        nbttagcompound.setInteger("lastID", this.lastUsedID);
        nbttagcompound.setTag("NPCTransportCategories", (NBTBase)list);
        return nbttagcompound;
    }
    
    public void saveCategories() {
        try {
            final File saveDir = CustomNpcs.getWorldSaveDirectory();
            final File file = new File(saveDir, "transport.dat_new");
            final File file2 = new File(saveDir, "transport.dat_old");
            final File file3 = new File(saveDir, "transport.dat");
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
    
    public TransportLocation getTransport(final int transportId) {
        return this.locations.get(transportId);
    }
    
    public TransportLocation getTransport(final String name) {
        for (final TransportLocation loc : this.locations.values()) {
            if (loc.name.equals(name)) {
                return loc;
            }
        }
        return null;
    }
    
    private int getUniqueIdLocation() {
        if (this.lastUsedID == 0) {
            for (final int catid : this.locations.keySet()) {
                if (catid > this.lastUsedID) {
                    this.lastUsedID = catid;
                }
            }
        }
        return ++this.lastUsedID;
    }
    
    private int getUniqueIdCategory() {
        int id = 0;
        for (final int catid : this.categories.keySet()) {
            if (catid > id) {
                id = catid;
            }
        }
        return ++id;
    }
    
    public void setLocation(final TransportLocation location) {
        if (this.locations.containsKey(location.id)) {
            for (final TransportCategory cat : this.categories.values()) {
                cat.locations.remove(location.id);
            }
        }
        this.locations.put(location.id, location);
        location.category.locations.put(location.id, location);
    }
    
    public TransportLocation removeLocation(final int location) {
        final TransportLocation loc = this.locations.get(location);
        if (loc == null) {
            return null;
        }
        loc.category.locations.remove(location);
        this.locations.remove(location);
        this.saveCategories();
        return loc;
    }
    
    private boolean containsCategoryName(String name) {
        name = name.toLowerCase();
        for (final TransportCategory cat : this.categories.values()) {
            if (cat.title.toLowerCase().equals(name)) {
                return true;
            }
        }
        return false;
    }
    
    public void saveCategory(String name, int id) {
        if (id < 0) {
            id = this.getUniqueIdCategory();
        }
        if (this.categories.containsKey(id)) {
            final TransportCategory category = this.categories.get(id);
            if (!category.title.equals(name)) {
                while (this.containsCategoryName(name)) {
                    name += "_";
                }
                this.categories.get(id).title = name;
            }
        }
        else {
            while (this.containsCategoryName(name)) {
                name += "_";
            }
            final TransportCategory category = new TransportCategory();
            category.id = id;
            category.title = name;
            this.categories.put(id, category);
        }
        this.saveCategories();
    }
    
    public void removeCategory(final int id) {
        if (this.categories.size() == 1) {
            return;
        }
        final TransportCategory cat = this.categories.get(id);
        if (cat == null) {
            return;
        }
        for (final int i : cat.locations.keySet()) {
            this.locations.remove(i);
        }
        this.categories.remove(id);
        this.saveCategories();
    }
    
    public boolean containsLocationName(String name) {
        name = name.toLowerCase();
        for (final TransportLocation loc : this.locations.values()) {
            if (loc.name.toLowerCase().equals(name)) {
                return true;
            }
        }
        return false;
    }
    
    public static TransportController getInstance() {
        return TransportController.instance;
    }
    
    public TransportLocation saveLocation(final int categoryId, final NBTTagCompound compound, final EntityPlayerMP player, final EntityNPCInterface npc) {
        final TransportCategory category = this.categories.get(categoryId);
        if (category == null || npc.advanced.role != EnumRoleType.Transporter) {
            return null;
        }
        final RoleTransporter role = (RoleTransporter)npc.roleInterface;
        final TransportLocation location = new TransportLocation();
        location.readNBT(compound);
        location.category = category;
        if (role.hasTransport()) {
            location.id = role.transportId;
        }
        if (location.id < 0 || !this.locations.get(location.id).name.equals(location.name)) {
            while (this.containsLocationName(location.name)) {
                final StringBuilder sb = new StringBuilder();
                final TransportLocation transportLocation = location;
                transportLocation.name = sb.append(transportLocation.name).append("_").toString();
            }
        }
        if (location.id < 0) {
            location.id = this.getUniqueIdLocation();
        }
        category.locations.put(location.id, location);
        this.locations.put(location.id, location);
        this.saveCategories();
        return location;
    }
}
