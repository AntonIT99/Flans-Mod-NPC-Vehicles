// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.items;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemStack;
import org.lwjgl.opengl.GL11;

public class ItemMusicClarinet extends ItemMusic
{
    @Override
    public void renderSpecial() {
        GL11.glScalef(0.8f, 0.9f, 0.8f);
        GL11.glRotatef(-90.0f, 0.0f, 1.0f, 0.0f);
        GL11.glRotatef(20.0f, 1.0f, 0.0f, 0.0f);
        GL11.glTranslatef(0.44f, -0.7f, -0.04f);
    }
    
    public EnumAction getItemUseAction(final ItemStack par1ItemStack) {
        return EnumAction.bow;
    }
    
    @Override
    public ItemStack onItemRightClick(final ItemStack par1ItemStack, final World par2World, final EntityPlayer par3EntityPlayer) {
        par3EntityPlayer.setItemInUse(par1ItemStack, this.getMaxItemUseDuration(par1ItemStack));
        return super.onItemRightClick(par1ItemStack, par2World, par3EntityPlayer);
    }
    
    public int getMaxItemUseDuration(final ItemStack par1ItemStack) {
        return 72000;
    }
}
