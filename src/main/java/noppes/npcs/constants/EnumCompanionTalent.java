// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.constants;

import net.minecraft.init.Items;
import noppes.npcs.CustomItems;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public enum EnumCompanionTalent
{
    INVENTORY(CustomItems.satchel), 
    ARMOR((Item)Items.iron_chestplate), 
    SWORD(Items.diamond_sword), 
    RANGED((Item)Items.bow), 
    ACROBATS((Item)Items.leather_boots), 
    INTEL(CustomItems.letter);
    
    public ItemStack item;
    
    private EnumCompanionTalent(final Item item) {
        this.item = new ItemStack(item);
    }
}
