// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.items;

import cpw.mods.fml.common.registry.GameRegistry;
import org.lwjgl.opengl.GL11;
import noppes.npcs.CustomNpcs;
import net.minecraft.creativetab.CreativeTabs;
import noppes.npcs.CustomItems;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;

public class ItemNpcWeaponInterface extends ItemSword implements ItemRenderInterface
{
    public ItemNpcWeaponInterface(final int par1, final Item.ToolMaterial material) {
        this(material);
    }
    
    public ItemNpcWeaponInterface(final Item.ToolMaterial material) {
        super(material);
        this.setCreativeTab((CreativeTabs)CustomItems.tab);
        CustomNpcs.proxy.registerItem((Item)this);
        this.setCreativeTab((CreativeTabs)CustomItems.tabWeapon);
    }
    
    public void renderSpecial() {
        GL11.glScalef(0.66f, 0.66f, 0.66f);
        GL11.glTranslatef(0.16f, 0.26f, 0.06f);
    }
    
    public Item setUnlocalizedName(final String name) {
        GameRegistry.registerItem((Item)this, name);
        return super.setUnlocalizedName(name);
    }
}
