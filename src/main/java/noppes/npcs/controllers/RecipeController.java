// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.controllers;

import java.io.IOException;
import net.minecraft.world.World;
import net.minecraft.inventory.InventoryCrafting;
import java.io.OutputStream;
import java.io.FileOutputStream;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.nbt.NBTTagCompound;
import java.io.InputStream;
import net.minecraft.nbt.CompressedStreamTools;
import java.io.FileInputStream;
import java.io.File;
import noppes.npcs.CustomNpcs;
import java.util.Iterator;
import java.util.List;
import java.util.HashSet;
import net.minecraft.item.crafting.CraftingManager;
import java.util.HashMap;
import java.util.Collection;

public class RecipeController
{
    private static Collection<RecipeCarpentry> prevRecipes;
    public HashMap<Integer, RecipeCarpentry> globalRecipes;
    public HashMap<Integer, RecipeCarpentry> anvilRecipes;
    public static RecipeController instance;
    public static final int version = 1;
    public int nextId;
    public static HashMap<Integer, RecipeCarpentry> syncRecipes;
    
    public RecipeController() {
        this.globalRecipes = new HashMap<Integer, RecipeCarpentry>();
        this.anvilRecipes = new HashMap<Integer, RecipeCarpentry>();
        this.nextId = 1;
        RecipeController.instance = this;
    }
    
    public void load() {
        this.loadCategories();
        reloadGlobalRecipes(this.globalRecipes);
    }
    
    public static void reloadGlobalRecipes(final HashMap<Integer, RecipeCarpentry> globalRecipes) {
        final List list = CraftingManager.getInstance().getRecipeList();
        if (RecipeController.prevRecipes != null) {
            list.removeAll(RecipeController.prevRecipes);
        }
        RecipeController.prevRecipes = new HashSet<RecipeCarpentry>();
        for (final RecipeCarpentry recipe : globalRecipes.values()) {
            if (recipe.isValid()) {
                RecipeController.prevRecipes.add(recipe);
            }
        }
        list.addAll(RecipeController.prevRecipes);
    }
    
    private void loadCategories() {
        final File saveDir = CustomNpcs.getWorldSaveDirectory();
        try {
            final File file = new File(saveDir, "recipes.dat");
            if (file.exists()) {
                this.loadCategories(file);
            }
            else {
                this.globalRecipes.clear();
                this.anvilRecipes.clear();
                this.loadDefaultRecipes(-1);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
            try {
                final File file2 = new File(saveDir, "recipes.dat_old");
                if (file2.exists()) {
                    this.loadCategories(file2);
                }
            }
            catch (Exception ee) {
                e.printStackTrace();
            }
        }
    }
    
    private void loadDefaultRecipes(final int i) {
        if (i == 1) {
            return;
        }
        RecipesDefault.loadDefaultRecipes(i);
        this.saveCategories();
    }
    
    private void loadCategories(final File file) throws Exception {
        final NBTTagCompound nbttagcompound1 = CompressedStreamTools.readCompressed((InputStream)new FileInputStream(file));
        this.nextId = nbttagcompound1.getInteger("LastId");
        final NBTTagList list = nbttagcompound1.getTagList("Data", 10);
        final HashMap<Integer, RecipeCarpentry> globalRecipes = new HashMap<Integer, RecipeCarpentry>();
        final HashMap<Integer, RecipeCarpentry> anvilRecipes = new HashMap<Integer, RecipeCarpentry>();
        if (list != null) {
            for (int i = 0; i < list.tagCount(); ++i) {
                final RecipeCarpentry recipe = RecipeCarpentry.read(list.getCompoundTagAt(i));
                if (recipe.isGlobal) {
                    globalRecipes.put(recipe.id, recipe);
                }
                else {
                    anvilRecipes.put(recipe.id, recipe);
                }
                if (recipe.id > this.nextId) {
                    this.nextId = recipe.id;
                }
            }
        }
        this.anvilRecipes = anvilRecipes;
        this.globalRecipes = globalRecipes;
        this.loadDefaultRecipes(nbttagcompound1.getInteger("Version"));
    }
    
    private void saveCategories() {
        try {
            final File saveDir = CustomNpcs.getWorldSaveDirectory();
            final NBTTagList list = new NBTTagList();
            for (final RecipeCarpentry recipe : this.globalRecipes.values()) {
                list.appendTag((NBTBase)recipe.writeNBT());
            }
            for (final RecipeCarpentry recipe : this.anvilRecipes.values()) {
                list.appendTag((NBTBase)recipe.writeNBT());
            }
            final NBTTagCompound nbttagcompound = new NBTTagCompound();
            nbttagcompound.setTag("Data", (NBTBase)list);
            nbttagcompound.setInteger("LastId", this.nextId);
            nbttagcompound.setInteger("Version", 1);
            final File file = new File(saveDir, "recipes.dat_new");
            final File file2 = new File(saveDir, "recipes.dat_old");
            final File file3 = new File(saveDir, "recipes.dat");
            CompressedStreamTools.writeCompressed(nbttagcompound, (OutputStream)new FileOutputStream(file));
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
            e.printStackTrace();
        }
    }
    
    public RecipeCarpentry findMatchingRecipe(final InventoryCrafting par1InventoryCrafting) {
        for (final RecipeCarpentry recipe : this.anvilRecipes.values()) {
            if (recipe.isValid() && recipe.matches(par1InventoryCrafting, null)) {
                return recipe;
            }
        }
        return null;
    }
    
    public RecipeCarpentry getRecipe(final int id) {
        if (this.globalRecipes.containsKey(id)) {
            return this.globalRecipes.get(id);
        }
        if (this.anvilRecipes.containsKey(id)) {
            return this.anvilRecipes.get(id);
        }
        return null;
    }
    
    public RecipeCarpentry saveRecipe(final NBTTagCompound compound) throws IOException {
        final RecipeCarpentry recipe = RecipeCarpentry.read(compound);
        final RecipeCarpentry current = this.getRecipe(recipe.id);
        if (current != null && !current.name.equals(recipe.name)) {
            while (this.containsRecipeName(recipe.name)) {
                final StringBuilder sb = new StringBuilder();
                final RecipeCarpentry recipeCarpentry = recipe;
                recipeCarpentry.name = sb.append(recipeCarpentry.name).append("_").toString();
            }
        }
        if (recipe.id == -1) {
            recipe.id = this.getUniqueId();
            while (this.containsRecipeName(recipe.name)) {
                final StringBuilder sb2 = new StringBuilder();
                final RecipeCarpentry recipeCarpentry2 = recipe;
                recipeCarpentry2.name = sb2.append(recipeCarpentry2.name).append("_").toString();
            }
        }
        if (recipe.isGlobal) {
            this.anvilRecipes.remove(recipe.id);
            this.globalRecipes.put(recipe.id, recipe);
        }
        else {
            this.globalRecipes.remove(recipe.id);
            this.anvilRecipes.put(recipe.id, recipe);
        }
        this.saveCategories();
        reloadGlobalRecipes(this.globalRecipes);
        return recipe;
    }
    
    private int getUniqueId() {
        return this.nextId++;
    }
    
    private boolean containsRecipeName(String name) {
        name = name.toLowerCase();
        for (final RecipeCarpentry recipe : this.globalRecipes.values()) {
            if (recipe.name.toLowerCase().equals(name)) {
                return true;
            }
        }
        for (final RecipeCarpentry recipe : this.anvilRecipes.values()) {
            if (recipe.name.toLowerCase().equals(name)) {
                return true;
            }
        }
        return false;
    }
    
    public RecipeCarpentry removeRecipe(final int id) {
        final RecipeCarpentry recipe = this.getRecipe(id);
        this.globalRecipes.remove(recipe.id);
        this.anvilRecipes.remove(recipe.id);
        this.saveCategories();
        reloadGlobalRecipes(this.globalRecipes);
        return recipe;
    }
    
    public void addRecipe(final RecipeCarpentry recipeAnvil) {
        recipeAnvil.id = this.getUniqueId();
        if (!recipeAnvil.isGlobal) {
            RecipeController.instance.anvilRecipes.put(recipeAnvil.id, recipeAnvil);
        }
        else {
            RecipeController.instance.globalRecipes.put(recipeAnvil.id, recipeAnvil);
        }
    }
    
    static {
        RecipeController.syncRecipes = new HashMap<Integer, RecipeCarpentry>();
    }
}
