// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import org.lwjgl.opengl.GL11;
import net.minecraft.creativetab.CreativeTabs;
import noppes.npcs.CustomItems;
import noppes.npcs.constants.EnumNpcToolMaterial;

public class ItemShield extends ItemNpcInterface
{
    public EnumNpcToolMaterial material;
    
    public ItemShield(final int par1, final EnumNpcToolMaterial material) {
        super(par1);
        this.material = material;
        this.setMaxDamage(material.getMaxUses());
        this.setCreativeTab((CreativeTabs)CustomItems.tabWeapon);
    }
    
    @Override
    public void renderSpecial() {
        GL11.glScalef(0.6f, 0.6f, 0.6f);
        GL11.glTranslatef(0.0f, 0.0f, -0.2f);
        GL11.glRotatef(-6.0f, 0.0f, 1.0f, 0.0f);
    }
    
    public EnumAction getItemUseAction(final ItemStack par1ItemStack) {
        return EnumAction.block;
    }
    
    public ItemStack onItemRightClick(final ItemStack par1ItemStack, final World par2World, final EntityPlayer par3EntityPlayer) {
        par3EntityPlayer.setItemInUse(par1ItemStack, this.getMaxItemUseDuration(par1ItemStack));
        return par1ItemStack;
    }
    
    public int getMaxItemUseDuration(final ItemStack par1ItemStack) {
        return 72000;
    }
}
