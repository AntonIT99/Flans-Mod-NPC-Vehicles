// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.items;

import org.lwjgl.opengl.GL11;
import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;
import noppes.npcs.CustomItems;

public class ItemWand extends ItemNpcInterface
{
    public ItemWand(final int par1) {
        super(par1);
        this.setCreativeTab((CreativeTabs)CustomItems.tabMisc);
    }
    
    public boolean hasEffect(final ItemStack par1ItemStack, final int pass) {
        return true;
    }
    
    @Override
    public void renderSpecial() {
        GL11.glScalef(0.54f, 0.54f, 0.54f);
        GL11.glTranslatef(0.1f, 0.5f, 0.1f);
    }
}
