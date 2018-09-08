// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.controllers;

import noppes.npcs.NoppesStringUtils;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.nbt.NBTTagCompound;
import java.util.Map;
import java.io.InputStream;
import net.minecraft.nbt.CompressedStreamTools;
import java.io.FileInputStream;
import noppes.npcs.util.NBTJsonUtil;
import java.util.Iterator;
import noppes.npcs.LogWriter;
import java.io.File;
import noppes.npcs.CustomNpcs;
import java.util.HashMap;

public class QuestController
{
    public HashMap<Integer, QuestCategory> categories;
    public HashMap<Integer, Quest> quests;
    public static QuestController instance;
    private int lastUsedCatID;
    private int lastUsedQuestID;
    
    public QuestController() {
        this.categories = new HashMap<Integer, QuestCategory>();
        this.quests = new HashMap<Integer, Quest>();
        this.lastUsedCatID = 0;
        this.lastUsedQuestID = 0;
        QuestController.instance = this;
    }
    
    public void load() {
        this.categories.clear();
        this.quests.clear();
        this.lastUsedCatID = 0;
        this.lastUsedQuestID = 0;
        try {
            File file = new File(CustomNpcs.getWorldSaveDirectory(), "quests.dat");
            if (file.exists()) {
                this.loadCategoriesOld(file);
                file.delete();
                file = new File(CustomNpcs.getWorldSaveDirectory(), "quests.dat_old");
                if (file.exists()) {
                    file.delete();
                }
                return;
            }
        }
        catch (Exception ex) {}
        final File dir = this.getDir();
        if (!dir.exists()) {
            dir.mkdir();
        }
        else {
            for (final File file2 : dir.listFiles()) {
                if (file2.isDirectory()) {
                    final QuestCategory category = this.loadCategoryDir(file2);
                    final Iterator<Integer> ite = category.quests.keySet().iterator();
                    while (ite.hasNext()) {
                        final int id = ite.next();
                        if (id > this.lastUsedQuestID) {
                            this.lastUsedQuestID = id;
                        }
                        final Quest quest = category.quests.get(id);
                        if (this.quests.containsKey(id)) {
                            LogWriter.error("Duplicate id " + quest.id + " from category " + category.title);
                            ite.remove();
                        }
                        else {
                            this.quests.put(id, quest);
                        }
                    }
                    ++this.lastUsedCatID;
                    category.id = this.lastUsedCatID;
                    this.categories.put(category.id, category);
                }
            }
        }
    }
    
    private QuestCategory loadCategoryDir(final File dir) {
        final QuestCategory category = new QuestCategory();
        category.title = dir.getName();
        for (final File file : dir.listFiles()) {
            if (file.isFile()) {
                if (file.getName().endsWith(".json")) {
                    try {
                        final Quest quest = new Quest();
                        quest.id = Integer.parseInt(file.getName().substring(0, file.getName().length() - 5));
                        quest.readNBTPartial(NBTJsonUtil.LoadFile(file));
                        category.quests.put(quest.id, quest);
                        quest.category = category;
                    }
                    catch (Exception e) {
                        LogWriter.error("Error loading: " + file.getAbsolutePath(), e);
                    }
                }
            }
        }
        return category;
    }
    
    private void loadCategoriesOld(final File file) throws Exception {
        final File dir = this.getDir();
        if (!dir.exists()) {
            dir.mkdir();
        }
        final NBTTagCompound nbttagcompound1 = CompressedStreamTools.readCompressed((InputStream)new FileInputStream(file));
        this.lastUsedCatID = nbttagcompound1.getInteger("lastID");
        this.lastUsedQuestID = nbttagcompound1.getInteger("lastQuestID");
        final NBTTagList list = nbttagcompound1.getTagList("Data", 10);
        if (list != null) {
            for (int i = 0; i < list.tagCount(); ++i) {
                final QuestCategory category = new QuestCategory();
                category.readNBT(list.getCompoundTagAt(i));
                this.categories.put(category.id, category);
                this.saveCategory(category);
                final Iterator<Map.Entry<Integer, Quest>> ita = category.quests.entrySet().iterator();
                while (ita.hasNext()) {
                    final Map.Entry<Integer, Quest> entry = ita.next();
                    final Quest quest = entry.getValue();
                    quest.id = entry.getKey();
                    quest.category = category;
                    if (this.quests.containsKey(quest.id)) {
                        ita.remove();
                    }
                    else {
                        this.saveQuest(category.id, quest);
                    }
                }
            }
        }
    }
    
    public void removeCategory(final int category) {
        final QuestCategory cat = this.categories.get(category);
        if (cat == null) {
            return;
        }
        final File dir = new File(this.getDir(), cat.title);
        if (!dir.delete()) {
            return;
        }
        for (final int dia : cat.quests.keySet()) {
            this.quests.remove(dia);
        }
        this.categories.remove(category);
    }
    
    public void saveCategory(final QuestCategory category) {
        category.title = NoppesStringUtils.cleanFileName(category.title);
        if (this.categories.containsKey(category.id)) {
            final QuestCategory currentCategory = this.categories.get(category.id);
            if (!currentCategory.title.equals(category.title)) {
                while (this.containsCategoryName(category.title)) {
                    category.title += "_";
                }
                final File newdir = new File(this.getDir(), category.title);
                final File olddir = new File(this.getDir(), currentCategory.title);
                if (newdir.exists()) {
                    return;
                }
                if (!olddir.renameTo(newdir)) {
                    return;
                }
            }
            category.quests = currentCategory.quests;
        }
        else {
            if (category.id < 0) {
                ++this.lastUsedCatID;
                category.id = this.lastUsedCatID;
            }
            while (this.containsCategoryName(category.title)) {
                category.title += "_";
            }
            final File dir = new File(this.getDir(), category.title);
            if (!dir.exists()) {
                dir.mkdirs();
            }
        }
        this.categories.put(category.id, category);
    }
    
    private boolean containsCategoryName(String name) {
        name = name.toLowerCase();
        for (final QuestCategory cat : this.categories.values()) {
            if (cat.title.toLowerCase().equals(name)) {
                return true;
            }
        }
        return false;
    }
    
    private boolean containsQuestName(final QuestCategory category, final Quest quest) {
        for (final Quest q : category.quests.values()) {
            if (q.id != quest.id && q.title.equalsIgnoreCase(quest.title)) {
                return true;
            }
        }
        return false;
    }
    
    public void saveQuest(final int categoryID, final Quest quest) {
        final QuestCategory category = this.categories.get(categoryID);
        if (category == null) {
            return;
        }
        quest.category = category;
        while (this.containsQuestName(quest.category, quest)) {
            quest.title += "_";
        }
        if (quest.id < 0) {
            ++this.lastUsedQuestID;
            quest.id = this.lastUsedQuestID;
        }
        this.quests.put(quest.id, quest);
        category.quests.put(quest.id, quest);
        final File dir = new File(this.getDir(), category.title);
        if (!dir.exists()) {
            dir.mkdirs();
        }
        final File file = new File(dir, quest.id + ".json_new");
        final File file2 = new File(dir, quest.id + ".json");
        try {
            NBTJsonUtil.SaveFile(file, quest.writeToNBTPartial(new NBTTagCompound()));
            if (file2.exists()) {
                file2.delete();
            }
            file.renameTo(file2);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void removeQuest(final Quest quest) {
        final File file = new File(new File(this.getDir(), quest.category.title), quest.id + ".json");
        if (!file.delete()) {
            return;
        }
        this.quests.remove(quest.id);
        quest.category.quests.remove(quest.id);
    }
    
    private File getDir() {
        return new File(CustomNpcs.getWorldSaveDirectory(), "quests");
    }
}
