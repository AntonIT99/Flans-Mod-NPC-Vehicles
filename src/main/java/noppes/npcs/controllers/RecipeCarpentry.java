// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.controllers;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import java.util.HashMap;
import noppes.npcs.NoppesUtilPlayer;
import net.minecraft.world.World;
import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.nbt.NBTBase;
import noppes.npcs.NoppesUtilServer;
import noppes.npcs.NBTTags;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.ShapedRecipes;

public class RecipeCarpentry extends ShapedRecipes
{
    public int id;
    public String name;
    public Availability availability;
    public boolean isGlobal;
    public boolean ignoreDamage;
    public boolean ignoreNBT;
    
    public RecipeCarpentry(final int width, final int height, final ItemStack[] recipe, final ItemStack result) {
        super(width, height, recipe, result);
        this.id = -1;
        this.name = "";
        this.availability = new Availability();
        this.isGlobal = false;
        this.ignoreDamage = false;
        this.ignoreNBT = false;
    }
    
    public RecipeCarpentry(final String name) {
        super(0, 0, new ItemStack[0], (ItemStack)null);
        this.id = -1;
        this.name = "";
        this.availability = new Availability();
        this.isGlobal = false;
        this.ignoreDamage = false;
        this.ignoreNBT = false;
        this.name = name;
    }
    
    public static RecipeCarpentry read(final NBTTagCompound compound) {
        final RecipeCarpentry recipe = new RecipeCarpentry(compound.getInteger("Width"), compound.getInteger("Height"), NBTTags.getItemStackArray(compound.getTagList("Materials", 10)), NoppesUtilServer.readItem(compound.getCompoundTag("Item")));
        recipe.name = compound.getString("Name");
        recipe.id = compound.getInteger("ID");
        recipe.availability.readFromNBT(compound.getCompoundTag("Availability"));
        recipe.ignoreDamage = compound.getBoolean("IgnoreDamage");
        recipe.ignoreNBT = compound.getBoolean("IgnoreNBT");
        recipe.isGlobal = compound.getBoolean("Global");
        return recipe;
    }
    
    public NBTTagCompound writeNBT() {
        final NBTTagCompound compound = new NBTTagCompound();
        compound.setInteger("ID", this.id);
        compound.setInteger("Width", this.recipeWidth);
        compound.setInteger("Height", this.recipeHeight);
        if (this.getRecipeOutput() != null) {
            compound.setTag("Item", (NBTBase)NoppesUtilServer.writeItem(this.getRecipeOutput(), new NBTTagCompound()));
        }
        compound.setTag("Materials", (NBTBase)NBTTags.nbtItemStackArray(this.recipeItems));
        compound.setTag("Availability", (NBTBase)this.availability.writeToNBT(new NBTTagCompound()));
        compound.setString("Name", this.name);
        compound.setBoolean("Global", this.isGlobal);
        compound.setBoolean("IgnoreDamage", this.ignoreDamage);
        compound.setBoolean("IgnoreNBT", this.ignoreNBT);
        return compound;
    }
    
    public boolean matches(final InventoryCrafting par1InventoryCrafting, final World world) {
        for (int i = 0; i <= 4 - this.recipeWidth; ++i) {
            for (int j = 0; j <= 4 - this.recipeHeight; ++j) {
                if (this.checkMatch(par1InventoryCrafting, i, j, true)) {
                    return true;
                }
                if (this.checkMatch(par1InventoryCrafting, i, j, false)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    private boolean checkMatch(final InventoryCrafting par1InventoryCrafting, final int par2, final int par3, final boolean par4) {
        for (int i = 0; i < 4; ++i) {
            for (int j = 0; j < 4; ++j) {
                final int var7 = i - par2;
                final int var8 = j - par3;
                ItemStack var9 = null;
                if (var7 >= 0 && var8 >= 0 && var7 < this.recipeWidth && var8 < this.recipeHeight) {
                    if (par4) {
                        var9 = this.recipeItems[this.recipeWidth - var7 - 1 + var8 * this.recipeWidth];
                    }
                    else {
                        var9 = this.recipeItems[var7 + var8 * this.recipeWidth];
                    }
                }
                final ItemStack var10 = par1InventoryCrafting.getStackInRowAndColumn(i, j);
                if ((var10 != null || var9 != null) && !NoppesUtilPlayer.compareItems(var9, var10, this.ignoreDamage, this.ignoreNBT)) {
                    return false;
                }
            }
        }
        return true;
    }
    
    public ItemStack getCraftingResult(final InventoryCrafting var1) {
        if (this.getRecipeOutput() == null) {
            return null;
        }
        return this.getRecipeOutput().copy();
    }
    
    public int getRecipeSize() {
        return 16;
    }
    
    public static RecipeCarpentry saveRecipe(final RecipeCarpentry recipe, final ItemStack par1ItemStack, final Object... par2ArrayOfObj) {
        String var3 = "";
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        if (par2ArrayOfObj[var4] instanceof String[]) {
            final String[] var8;
            final String[] var7 = var8 = (String[])par2ArrayOfObj[var4++];
            for (int var9 = var7.length, var10 = 0; var10 < var9; ++var10) {
                final String var11 = var8[var10];
                ++var6;
                var5 = var11.length();
                var3 += var11;
            }
        }
        else {
            while (par2ArrayOfObj[var4] instanceof String) {
                final String var12 = (String)par2ArrayOfObj[var4++];
                ++var6;
                var5 = var12.length();
                var3 += var12;
            }
        }
        final HashMap var13 = new HashMap();
        while (var4 < par2ArrayOfObj.length) {
            final Character var14 = (Character)par2ArrayOfObj[var4];
            ItemStack var15 = null;
            if (par2ArrayOfObj[var4 + 1] instanceof Item) {
                var15 = new ItemStack((Item)par2ArrayOfObj[var4 + 1]);
            }
            else if (par2ArrayOfObj[var4 + 1] instanceof Block) {
                var15 = new ItemStack((Block)par2ArrayOfObj[var4 + 1], 1, -1);
            }
            else if (par2ArrayOfObj[var4 + 1] instanceof ItemStack) {
                var15 = (ItemStack)par2ArrayOfObj[var4 + 1];
            }
            var13.put(var14, var15);
            var4 += 2;
        }
        final ItemStack[] var16 = new ItemStack[var5 * var6];
        for (int var9 = 0; var9 < var5 * var6; ++var9) {
            final char var17 = var3.charAt(var9);
            if (var13.containsKey(var17)) {
                //var16[var9] = ((NBTBase) var13.get(var17)).copy();
            }
            else {
                var16[var9] = null;
            }
        }
        final RecipeCarpentry newrecipe = new RecipeCarpentry(var5, var6, var16, par1ItemStack);
        newrecipe.copy(recipe);
        if (var5 == 4 || var6 == 4) {
            newrecipe.isGlobal = false;
        }
        return newrecipe;
    }
    
    public void copy(final RecipeCarpentry recipe) {
        this.id = recipe.id;
        this.name = recipe.name;
        this.availability = recipe.availability;
        this.isGlobal = recipe.isGlobal;
        this.ignoreDamage = recipe.ignoreDamage;
        this.ignoreNBT = recipe.ignoreNBT;
    }
    
    public ItemStack getCraftingItem(final int i) {
        if (this.recipeItems == null || i >= this.recipeItems.length) {
            return null;
        }
        return this.recipeItems[i];
    }
    
    public void setCraftingItem(final int i, final ItemStack item) {
        if (i < this.recipeItems.length) {
            this.recipeItems[i] = item;
        }
    }
    
    public boolean isValid() {
        if (this.recipeItems.length == 0 || this.getRecipeOutput() == null) {
            return false;
        }
        for (final ItemStack item : this.recipeItems) {
            if (item != null) {
                return true;
            }
        }
        return false;
    }
}
