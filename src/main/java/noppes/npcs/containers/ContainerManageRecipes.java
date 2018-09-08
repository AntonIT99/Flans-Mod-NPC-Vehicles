// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.containers;

import java.util.Iterator;
import java.util.Map;
import java.util.ArrayList;
import noppes.npcs.NoppesUtilPlayer;
import java.util.HashMap;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.entity.player.EntityPlayer;
import noppes.npcs.controllers.RecipeCarpentry;
import net.minecraft.inventory.InventoryBasic;
import net.minecraft.inventory.Container;

public class ContainerManageRecipes extends Container
{
    private InventoryBasic craftingMatrix;
    public RecipeCarpentry recipe;
    public int size;
    public int width;
    private boolean init;
    
    public ContainerManageRecipes(final EntityPlayer player, final int size) {
        this.init = false;
        this.size = size * size;
        this.width = size;
        this.craftingMatrix = new InventoryBasic("crafting", false, this.size + 1);
        this.recipe = new RecipeCarpentry("");
        this.addSlotToContainer(new Slot((IInventory)this.craftingMatrix, 0, 87, 61));
        for (int i = 0; i < size; ++i) {
            for (int j = 0; j < size; ++j) {
                this.addSlotToContainer(new Slot((IInventory)this.craftingMatrix, i * this.width + j + 1, j * 18 + 8, i * 18 + 35));
            }
        }
        for (int i2 = 0; i2 < 3; ++i2) {
            for (int l1 = 0; l1 < 9; ++l1) {
                this.addSlotToContainer(new Slot((IInventory)player.inventory, l1 + i2 * 9 + 9, 8 + l1 * 18, 113 + i2 * 18));
            }
        }
        for (int j2 = 0; j2 < 9; ++j2) {
            this.addSlotToContainer(new Slot((IInventory)player.inventory, j2, 8 + j2 * 18, 171));
        }
    }
    
    public ItemStack transferStackInSlot(final EntityPlayer par1EntityPlayer, final int i) {
        return null;
    }
    
    public boolean canInteractWith(final EntityPlayer entityplayer) {
        return true;
    }
    
    public void setRecipe(final RecipeCarpentry recipe) {
        this.craftingMatrix.setInventorySlotContents(0, recipe.getRecipeOutput());
        for (int i = 0; i < this.width; ++i) {
            for (int j = 0; j < this.width; ++j) {
                if (j >= recipe.recipeWidth) {
                    this.craftingMatrix.setInventorySlotContents(i * this.width + j + 1, (ItemStack)null);
                }
                else {
                    this.craftingMatrix.setInventorySlotContents(i * this.width + j + 1, recipe.getCraftingItem(i * recipe.recipeWidth + j));
                }
            }
        }
        this.recipe = recipe;
    }
    
    public void saveRecipe() {
        int nextChar = 0;
        final char[] chars = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P' };
        final Map<ItemStack, Character> nameMapping = new HashMap<ItemStack, Character>();
        int firstRow = this.width;
        int lastRow = 0;
        int firstColumn = this.width;
        int lastColumn = 0;
        boolean seenRow = false;
        for (int i = 0; i < this.width; ++i) {
            boolean seenColumn = false;
            for (int j = 0; j < this.width; ++j) {
                final ItemStack item = this.craftingMatrix.getStackInSlot(i * this.width + j + 1);
                if (item != null) {
                    if (!seenColumn && j < firstColumn) {
                        firstColumn = j;
                    }
                    if (j > lastColumn) {
                        lastColumn = j;
                    }
                    seenColumn = true;
                    Character letter = null;
                    for (final ItemStack mapped : nameMapping.keySet()) {
                        if (NoppesUtilPlayer.compareItems(mapped, item, this.recipe.ignoreDamage, this.recipe.ignoreNBT)) {
                            letter = nameMapping.get(mapped);
                        }
                    }
                    if (letter == null) {
                        letter = chars[nextChar];
                        ++nextChar;
                        nameMapping.put(item, letter);
                    }
                }
            }
            if (seenColumn) {
                if (!seenRow) {
                    firstRow = i;
                    lastRow = i;
                    seenRow = true;
                }
                else {
                    lastRow = i;
                }
            }
        }
        final ArrayList<Object> recipe = new ArrayList<Object>();
        for (int k = 0; k < this.width; ++k) {
            if (k >= firstRow) {
                if (k <= lastRow) {
                    String row = "";
                    for (int l = 0; l < this.width; ++l) {
                        if (l >= firstColumn) {
                            if (l <= lastColumn) {
                                final ItemStack item2 = this.craftingMatrix.getStackInSlot(k * this.width + l + 1);
                                if (item2 == null) {
                                    row += " ";
                                }
                                else {
                                    for (final ItemStack mapped : nameMapping.keySet()) {
                                        if (NoppesUtilPlayer.compareItems(mapped, item2, false, false)) {
                                            row += nameMapping.get(mapped);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    recipe.add(row);
                }
            }
        }
        if (nameMapping.isEmpty()) {
            final RecipeCarpentry r = new RecipeCarpentry(this.recipe.name);
            r.copy(this.recipe);
            this.recipe = r;
            return;
        }
        for (final ItemStack mapped2 : nameMapping.keySet()) {
            final Character letter2 = nameMapping.get(mapped2);
            recipe.add(letter2);
            recipe.add(mapped2);
        }
        this.recipe = RecipeCarpentry.saveRecipe(this.recipe, this.craftingMatrix.getStackInSlot(0), recipe.toArray());
    }
}
