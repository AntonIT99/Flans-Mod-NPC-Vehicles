// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.controllers;

import noppes.npcs.NoppesStringUtils;
import noppes.npcs.constants.EnumOptionType;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.nbt.NBTTagCompound;
import java.util.Map;
import java.io.InputStream;
import net.minecraft.nbt.CompressedStreamTools;
import java.io.FileInputStream;
import noppes.npcs.util.NBTJsonUtil;
import java.util.Iterator;
import java.io.File;
import noppes.npcs.CustomNpcs;
import noppes.npcs.LogWriter;
import java.util.HashMap;

public class DialogController
{
    public HashMap<Integer, DialogCategory> categories;
    public HashMap<Integer, Dialog> dialogs;
    public static DialogController instance;
    private int lastUsedDialogID;
    private int lastUsedCatID;
    
    public DialogController() {
        this.categories = new HashMap<Integer, DialogCategory>();
        this.dialogs = new HashMap<Integer, Dialog>();
        this.lastUsedDialogID = 0;
        this.lastUsedCatID = 0;
        (DialogController.instance = this).load();
    }
    
    public void load() {
        LogWriter.info("Loading Dialogs");
        this.loadCategories();
        LogWriter.info("Done loading Dialogs");
    }
    
    private void loadCategories() {
        this.categories.clear();
        this.dialogs.clear();
        this.lastUsedCatID = 0;
        this.lastUsedDialogID = 0;
        try {
            File file = new File(CustomNpcs.getWorldSaveDirectory(), "dialog.dat");
            if (file.exists()) {
                this.loadCategoriesOld(file);
                file.delete();
                file = new File(CustomNpcs.getWorldSaveDirectory(), "dialog.dat_old");
                if (file.exists()) {
                    file.delete();
                }
                return;
            }
        }
        catch (Exception e) {
            LogWriter.except(e);
        }
        final File dir = this.getDir();
        if (!dir.exists()) {
            dir.mkdir();
            this.loadDefaultDialogs();
        }
        else {
            for (final File file2 : dir.listFiles()) {
                if (file2.isDirectory()) {
                    final DialogCategory category = this.loadCategoryDir(file2);
                    final Iterator<Integer> ite = category.dialogs.keySet().iterator();
                    while (ite.hasNext()) {
                        final int id = ite.next();
                        if (id > this.lastUsedDialogID) {
                            this.lastUsedDialogID = id;
                        }
                        final Dialog dialog = category.dialogs.get(id);
                        if (this.dialogs.containsKey(id)) {
                            LogWriter.error("Duplicate id " + dialog.id + " from category " + category.title);
                            ite.remove();
                        }
                        else {
                            this.dialogs.put(id, dialog);
                        }
                    }
                    ++this.lastUsedCatID;
                    category.id = this.lastUsedCatID;
                    this.categories.put(category.id, category);
                }
            }
        }
    }
    
    private DialogCategory loadCategoryDir(final File dir) {
        final DialogCategory category = new DialogCategory();
        category.title = dir.getName();
        for (final File file : dir.listFiles()) {
            if (file.isFile()) {
                if (file.getName().endsWith(".json")) {
                    try {
                        final Dialog dialog = new Dialog();
                        dialog.id = Integer.parseInt(file.getName().substring(0, file.getName().length() - 5));
                        dialog.readNBTPartial(NBTJsonUtil.LoadFile(file));
                        category.dialogs.put(dialog.id, dialog);
                        dialog.category = category;
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
        final NBTTagList list = nbttagcompound1.getTagList("Data", 10);
        if (list == null) {
            return;
        }
        for (int i = 0; i < list.tagCount(); ++i) {
            final DialogCategory category = new DialogCategory();
            category.readNBT(list.getCompoundTagAt(i));
            this.saveCategory(category);
            final Iterator<Map.Entry<Integer, Dialog>> ita = category.dialogs.entrySet().iterator();
            while (ita.hasNext()) {
                final Map.Entry<Integer, Dialog> entry = ita.next();
                final Dialog dialog = entry.getValue();
                dialog.id = entry.getKey();
                dialog.category = category;
                if (this.dialogs.containsKey(dialog.id)) {
                    ita.remove();
                }
                else {
                    this.saveDialog(category.id, dialog);
                }
            }
        }
    }
    
    private void loadDefaultDialogs() {
        final DialogCategory cat = new DialogCategory();
        cat.id = this.lastUsedCatID++;
        cat.title = "Villager";
        final Dialog dia1 = new Dialog();
        dia1.id = 1;
        dia1.category = cat;
        dia1.title = "Start";
        dia1.text = "Hello {player}, \n\nWelcome to our village. I hope you enjoy your stay";
        final Dialog dia2 = new Dialog();
        dia2.id = 2;
        dia2.category = cat;
        dia2.title = "Ask about village";
        dia2.text = "This village has been around for ages. Enjoy your stay here.";
        final Dialog dia3 = new Dialog();
        dia3.id = 3;
        dia3.category = cat;
        dia3.title = "Who are you";
        dia3.text = "I'm a villager here. I have lived in this village my whole life.";
        cat.dialogs.put(dia1.id, dia1);
        cat.dialogs.put(dia2.id, dia2);
        cat.dialogs.put(dia3.id, dia3);
        final DialogOption option = new DialogOption();
        option.title = "Tell me something about this village";
        option.dialogId = 2;
        option.optionType = EnumOptionType.DialogOption;
        final DialogOption option2 = new DialogOption();
        option2.title = "Who are you?";
        option2.dialogId = 3;
        option2.optionType = EnumOptionType.DialogOption;
        final DialogOption option3 = new DialogOption();
        option3.title = "Goodbye";
        option3.optionType = EnumOptionType.QuitOption;
        dia1.options.put(0, option2);
        dia1.options.put(1, option);
        dia1.options.put(2, option3);
        final DialogOption option4 = new DialogOption();
        option4.title = "Back";
        option4.dialogId = 1;
        dia2.options.put(1, option4);
        dia3.options.put(1, option4);
        this.lastUsedDialogID = 3;
        this.saveCategory(cat);
        this.saveDialog(cat.id, dia1);
        this.saveDialog(cat.id, dia2);
        this.saveDialog(cat.id, dia3);
    }
    
    public void saveCategory(final DialogCategory category) {
        category.title = NoppesStringUtils.cleanFileName(category.title);
        if (this.categories.containsKey(category.id)) {
            final DialogCategory currentCategory = this.categories.get(category.id);
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
            category.dialogs = currentCategory.dialogs;
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
    
    public void removeCategory(final int category) {
        final DialogCategory cat = this.categories.get(category);
        if (cat == null) {
            return;
        }
        final File dir = new File(this.getDir(), cat.title);
        if (!dir.delete()) {
            return;
        }
        for (final int dia : cat.dialogs.keySet()) {
            this.dialogs.remove(dia);
        }
        this.categories.remove(category);
    }
    
    private boolean containsCategoryName(String name) {
        name = name.toLowerCase();
        for (final DialogCategory cat : this.categories.values()) {
            if (cat.title.toLowerCase().equals(name)) {
                return true;
            }
        }
        return false;
    }
    
    private boolean containsDialogName(final DialogCategory category, final Dialog dialog) {
        for (final Dialog dia : category.dialogs.values()) {
            if (dia.id != dialog.id && dia.title.equalsIgnoreCase(dialog.title)) {
                return true;
            }
        }
        return false;
    }
    
    public Dialog saveDialog(final int categoryId, final Dialog dialog) {
        final DialogCategory category = this.categories.get(categoryId);
        if (category == null) {
            return dialog;
        }
        dialog.category = category;
        while (this.containsDialogName(dialog.category, dialog)) {
            dialog.title += "_";
        }
        if (dialog.id < 0) {
            ++this.lastUsedDialogID;
            dialog.id = this.lastUsedDialogID;
        }
        this.dialogs.put(dialog.id, dialog);
        category.dialogs.put(dialog.id, dialog);
        final File dir = new File(this.getDir(), category.title);
        if (!dir.exists()) {
            dir.mkdirs();
        }
        final File file = new File(dir, dialog.id + ".json_new");
        final File file2 = new File(dir, dialog.id + ".json");
        try {
            NBTJsonUtil.SaveFile(file, dialog.writeToNBTPartial(new NBTTagCompound()));
            if (file2.exists()) {
                file2.delete();
            }
            file.renameTo(file2);
        }
        catch (Exception e) {
            LogWriter.except(e);
        }
        return dialog;
    }
    
    public void removeDialog(final Dialog dialog) {
        final DialogCategory category = dialog.category;
        final File file = new File(new File(this.getDir(), category.title), dialog.id + ".json");
        if (!file.delete()) {
            return;
        }
        category.dialogs.remove(dialog.id);
        this.dialogs.remove(dialog.id);
    }
    
    private File getDir() {
        return new File(CustomNpcs.getWorldSaveDirectory(), "dialogs");
    }
    
    public boolean hasDialog(final int dialogId) {
        return this.dialogs.containsKey(dialogId);
    }
    
    public Map<String, Integer> getScroll() {
        final Map<String, Integer> map = new HashMap<String, Integer>();
        for (final DialogCategory category : this.categories.values()) {
            map.put(category.title, category.id);
        }
        return map;
    }
}
