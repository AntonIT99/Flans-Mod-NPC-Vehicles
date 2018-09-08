// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.items;

import net.minecraft.creativetab.CreativeTabs;
import noppes.npcs.CustomItems;
import noppes.npcs.constants.EnumNpcToolMaterial;

public class ItemBullet extends ItemNpcInterface
{
    private EnumNpcToolMaterial material;
    
    public ItemBullet(final int par1, final EnumNpcToolMaterial material) {
        super(par1);
        this.material = material;
        this.setCreativeTab((CreativeTabs)CustomItems.tabWeapon);
    }
    
    public int getBulletDamage() {
        return this.material.getDamageVsEntity();
    }
}
