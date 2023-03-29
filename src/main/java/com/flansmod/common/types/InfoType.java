package com.flansmod.common.types;

import com.flansmod.api.IInfoType;
import com.flansmod.common.FlansMod;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.material.Material;
import net.minecraft.client.model.ModelBase;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemDye;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

import java.util.ArrayList;
import java.util.List;

public abstract class InfoType implements IInfoType {
    /**
     * infoTypes
     */
    public static List<InfoType> infoTypes = new ArrayList<>();

    public String contentPack;
    public Item item;
    public int colour = 0xffffff;
    public String iconPath;
    public Object[] recipe;
    public String[] recipeLine;
    public int recipeOutput = 1;
    public boolean shapeless;
    public String smeltableFrom = null;
    public String name;
    public String shortName;
    public String texture;
    public String modelString;
    public String description;
    public float modelScale = 1F;
    /**
     * If this is set to false, then this item cannot be dropped
     */
    public boolean canDrop = true;

    public final String packName;

    public InfoType(TypeFile file) {
        contentPack = file.name;
        packName = file.pack;
        infoTypes.add(this);
    }

    public void read(TypeFile file) {
        preRead(file);
        for (; ; ) {
            String line;
            line = file.readLine();
            if (line == null)
                break;
            if (line.startsWith("//"))
                continue;
            String[] split = line.split(" ");
            if (split.length < 2)
                continue;
            read(split, file);
        }
        postRead(file);

        if (shortName == null) {
            infoTypes.remove(this);
        }
    }

    /**
     * Method for performing actions prior to reading the type file
     */
    protected abstract void preRead(TypeFile file);

    /**
     * Method for performing actions after reading the type file
     */
    protected abstract void postRead(TypeFile file);

    /**
     * Pack reader
     */
    protected void read(String[] split, TypeFile file) {
        try {
            if (split[0].equals("Model"))
                modelString = split[1];
            else if (split[0].equals("ModelScale"))
                modelScale = Float.parseFloat(split[1]);
            else if (split[0].equals("Name")) {
                name = split[1];
                for (int i = 0; i < split.length - 2; i++)
                    name += " " + split[i + 2];
            } else if (split[0].equals("Description")) {
                description = split[1];
                for (int i = 0; i < split.length - 2; i++) {
                    description = description + " " + split[i + 2];
                }
            } else if (split[0].equals("ShortName")) {
                shortName = split[1];
                if (iconPath == null || iconPath.isEmpty()) {
                    // bogus default icon, if none is given at all - otherwise texture is blank.
                    iconPath = "Missing-Icon-" + shortName;
                }
            } else if (split[0].equals("Colour") || split[0].equals("Color")) {
                colour = (Integer.parseInt(split[1]) << 16) + ((Integer.parseInt(split[2])) << 8) + ((Integer.parseInt(split[3])));
            } else if (split[0].equals("Icon")) {
                iconPath = split[1];
            } else if (split[0].equals("RecipeOutput")) {
                recipeOutput = Integer.parseInt(split[1]);
            } else if (split[0].equals("Recipe")) {
                recipe = new Object[split.length + 2];
                for (int i = 0; i < 3; i++) {
                    String line;
                    line = file.readLine();
                    if (line == null) {
                        continue;
                    }
                    if (line.startsWith("//")) {
                        i--;
                        continue;
                    }
                    recipe[i] = line;
                }
                recipeLine = split;
                shapeless = false;
            } else if (split[0].equals("ShapelessRecipe")) {
                recipeLine = split;
                shapeless = true;
            } else if (split[0].equals("SmeltableFrom")) {
                smeltableFrom = split[1];
            } else if (split[0].equals("CanDrop"))
                canDrop = Boolean.parseBoolean(split[1]);

        } catch (Exception e) {
            FlansMod.log("Reading file failed : " + shortName);
            e.printStackTrace();
        }
    }

    public void addRecipe() {
        this.addRecipe(getItem());
    }

    /**
     * Reimported from old code
     */
    public void addRecipe(Item par1Item) {
        if (smeltableFrom != null) {
            GameRegistry.addSmelting(getRecipeElement(smeltableFrom, 0), new ItemStack(item), 0.0F);
        }
        if (recipeLine == null)
            return;
        try {
            if (!shapeless) {
                // Fix oversized recipes
                int rows = 3;
                // First column
                if (((String) recipe[0]).charAt(0) == ' ' && ((String) recipe[1]).charAt(0) == ' ' && ((String) recipe[2]).charAt(0) == ' ') {
                    for (int i = 0; i < 3; i++)
                        recipe[i] = ((String) recipe[i]).substring(1);
                    // New first column
                    if (((String) recipe[0]).charAt(0) == ' ' && ((String) recipe[1]).charAt(0) == ' ' && ((String) recipe[2]).charAt(0) == ' ') {
                        for (int i = 0; i < 3; i++)
                            recipe[i] = ((String) recipe[i]).substring(1);
                    }
                }
                // Last column
                int last = ((String) recipe[0]).length() - 1;
                if (((String) recipe[0]).charAt(last) == ' ' && ((String) recipe[1]).charAt(last) == ' ' && ((String) recipe[2]).charAt(last) == ' ') {
                    for (int i = 0; i < 3; i++)
                        recipe[i] = ((String) recipe[i]).substring(0, last);
                    // New last column
                    last--;
                    if (((String) recipe[0]).charAt(last) == ' ' && ((String) recipe[1]).charAt(last) == ' ' && ((String) recipe[2]).charAt(last) == ' ') {
                        for (int i = 0; i < 3; i++)
                            recipe[i] = ((String) recipe[i]).substring(0, 0);
                    }
                }
                // Top row
                if (recipe[0].equals(" ") || recipe[0].equals("  ") || recipe[0].equals("   ")) {
                    Object[] newRecipe = new Object[recipe.length - 1];
                    newRecipe[0] = recipe[1];
                    newRecipe[1] = recipe[2];
                    recipe = newRecipe;
                    rows--;
                    // Next top row
                    if (recipe[0].equals(" ") || recipe[0].equals("  ") || recipe[0].equals("   ")) {
                        Object[] newRecipe1 = new Object[recipe.length - 1];
                        newRecipe1[0] = recipe[1];
                        recipe = newRecipe1;
                        rows--;
                    }
                }
                // Bottom row
                if (recipe[rows - 1].equals(" ") || recipe[rows - 1].equals("  ") || recipe[rows - 1].equals("   ")) {
                    Object[] newRecipe = new Object[recipe.length - 1];
                    newRecipe[0] = recipe[0];
                    newRecipe[1] = recipe[1];
                    recipe = newRecipe;
                    rows--;
                    // Next bottom row
                    if (recipe[rows - 1].equals(" ") || recipe[rows - 1].equals("  ") || recipe[rows - 1].equals("   ")) {
                        Object[] newRecipe1 = new Object[recipe.length - 1];
                        newRecipe1[0] = recipe[0];
                        recipe = newRecipe1;
                        rows--;
                    }
                }
                for (int i = 0; i < (recipeLine.length - 1) / 2; i++) {
                    recipe[i * 2 + rows] = recipeLine[i * 2 + 1].charAt(0);
                    // Split ID with . and if it contains a second part, use it
                    // as damage value.
                    if (recipeLine[i * 2 + 2].contains("."))
                        recipe[i * 2 + rows + 1] = getRecipeElement(recipeLine[i * 2 + 2].split("\\.")[0], Integer.parseInt(recipeLine[i * 2 + 2].split("\\.")[1]));
                    else
                        recipe[i * 2 + rows + 1] = getRecipeElement(recipeLine[i * 2 + 2], 0);
                }
                GameRegistry.addRecipe(new ItemStack(item, recipeOutput), recipe);
            } else {
                recipe = new Object[recipeLine.length - 1];
                for (int i = 0; i < (recipeLine.length - 1); i++) {
                    if (recipeLine[i + 1].contains("."))
                        recipe[i] = getRecipeElement(recipeLine[i + 1].split("\\.")[0], Integer.parseInt(recipeLine[i + 1].split("\\.")[1]));
                    else
                        recipe[i] = getRecipeElement(recipeLine[i + 1], 0);
                }
                GameRegistry.addShapelessRecipe(new ItemStack(item, recipeOutput), recipe);
            }
        } catch (Exception e) {
            FlansMod.log("Failed to add recipe for : " + shortName);
            if (FlansMod.printStackTrace) {
                e.printStackTrace();
            }
        }
    }

    public static ItemStack getRecipeElement(String s, int damage) {
        return getRecipeElement(s, 1, damage);
    }

    public static ItemStack getRecipeElement(String s, int amount, int damage) {
        return getRecipeElement(s, amount, damage, "nothing");
    }

    public static ItemStack getRecipeElement(String s, int amount, int damage, String requester) {
        if (s.equals("doorIron")) {
            return new ItemStack(Items.iron_door, amount);
        }
        if (s.equals("doorWood")) {
            return new ItemStack(Items.wooden_door, amount);
        }
        if (s.equals("clayItem")) {
            return new ItemStack(Items.clay_ball, amount);
        }
        for (Object object : Item.itemRegistry) {
            Item item = (Item) object;
            if (item != null && item.getUnlocalizedName() != null && (item.getUnlocalizedName().equals("item." + s) || item.getUnlocalizedName().equals("tile." + s))) {
                return new ItemStack(item, amount, damage);
            }
        }
        for (InfoType type : infoTypes) {
            if (type.shortName.equals(s))
                return new ItemStack(type.item, amount, damage);
        }
        if (s.equals("gunpowder")) {
            return new ItemStack(Items.gunpowder, amount);
        }
        if (s.equals("iron")) {
            return new ItemStack(Items.iron_ingot, amount);
        }
        FlansMod.log("Could not find " + s + " when adding recipe for " + requester);
        return null;
    }

    /**
     * Return a dye damage value from a string name
     */
    protected int getDyeDamageValue(String dyeName) {
        int damage = -1;
        for (int i = 0; i < ItemDye.field_150923_a.length; i++) {
            if (ItemDye.field_150923_a[i].equals(dyeName))
                damage = i;
        }
        if (damage == -1)
            FlansMod.log("Failed to find dye colour : " + dyeName + " while adding " + contentPack);

        return damage;
    }

    /**
     * To be overriden by subtypes for model reloading
     */
    public void reloadModel() {

    }

    public static InfoType getType(String s) {
        for (InfoType type : infoTypes) {
            if (type.shortName.equals(s))
                return type;
        }
        return null;
    }

    public void onWorldLoad(World world) {

    }

    public abstract float GetRecommendedScale();

    @SideOnly(Side.CLIENT)
    public abstract ModelBase GetModel();

    public static InfoType getType(ItemStack itemStack) {
        if (itemStack == null)
            return null;
        Item item = itemStack.getItem();
        if (item instanceof IFlanItem)
            return ((IFlanItem) item).getInfoType();
        return null;
    }

    public static PotionEffect getPotionEffect(String[] split) {
        int potionID = Integer.parseInt(split[1]);
        int duration = Integer.parseInt(split[2]);
        int amplifier = Integer.parseInt(split[3]);
        return new PotionEffect(potionID, duration, amplifier, false);
    }

    //TODO: This seems to always return "Material.ground", regardless of the input...
    public static Material getMaterial(String material) {
        return Material.ground;
    }

    @Override
    public String getContentPack() {
        return contentPack;
    }

    @Override
    public Item getItem() {
        return item;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getShortName() {
        return shortName;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
