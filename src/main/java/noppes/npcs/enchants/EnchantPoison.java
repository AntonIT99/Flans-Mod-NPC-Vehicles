// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.enchants;

import noppes.npcs.items.ItemGun;
import noppes.npcs.items.ItemStaff;

public class EnchantPoison extends EnchantInterface
{
    public EnchantPoison() {
        super(6, new Class[] { ItemStaff.class, ItemGun.class });
        this.setName("poison");
    }
    
    public int getMinEnchantability(final int par1) {
        return 12 + (par1 - 1) * 20;
    }
    
    public int getMaxEnchantability(final int par1) {
        return this.getMinEnchantability(par1) + 25;
    }
    
    public int getMaxLevel() {
        return 2;
    }
}
