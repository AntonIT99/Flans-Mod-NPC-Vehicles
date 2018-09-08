// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;

public class CreativeTabNpcs extends CreativeTabs
{
    public Item item;
    public int meta;
    
    public CreativeTabNpcs(final String label) {
        super(label);
        this.item = Items.bowl;
        this.meta = 0;
    }
    
    public Item getTabIconItem() {
        return this.item;
    }
    
    public int func_151243_f() {
        return this.meta;
    }
}
