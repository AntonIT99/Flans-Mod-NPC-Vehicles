// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.items;

import net.minecraft.entity.EntityLivingBase;
import noppes.npcs.CustomNpcs;
import net.minecraft.entity.player.EntityPlayer;
import noppes.npcs.CustomItems;
import java.util.List;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import java.awt.Color;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.item.ItemStack;
import noppes.npcs.constants.EnumNpcToolMaterial;

public class ItemElementalStaff extends ItemStaff
{
    public ItemElementalStaff(final int par1, final EnumNpcToolMaterial material) {
        super(par1, material);
        this.setHasSubtypes(true);
    }
    
    public int getColorFromItemStack(final ItemStack par1ItemStack, final int par2) {
        final float[] color = EntitySheep.fleeceColorTable[par1ItemStack.getItemDamage()];
        return new Color(color[0], color[1], color[2]).getRGB();
    }
    
    public boolean requiresMultipleRenderPasses() {
        return true;
    }
    
    public void getSubItems(final Item par1, final CreativeTabs par2CreativeTabs, final List par3List) {
        for (int var4 = 0; var4 < 16; ++var4) {
            par3List.add(new ItemStack(par1, 1, var4));
        }
    }
    
    @Override
    public ItemStack getProjectile(final ItemStack stack) {
        return new ItemStack(CustomItems.orb, 1, stack.getItemDamage());
    }
    
    @Override
    public void spawnParticle(final ItemStack stack, final EntityPlayer player) {
        CustomNpcs.proxy.spawnParticle((EntityLivingBase)player, "Spell", stack.getItemDamage(), 4);
    }
}
