// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.items;

import noppes.npcs.client.NoppesUtil;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;
import noppes.npcs.CustomItems;
import net.minecraft.item.Item;

public class ItemMoneyBag extends Item
{
    public ItemMoneyBag(final int i) {
        this.maxStackSize = 1;
        this.setCreativeTab((CreativeTabs)CustomItems.tab);
    }
    
    public ItemStack onItemRightClick(final ItemStack par1ItemStack, final World par2World, final EntityPlayer par3EntityPlayer) {
        if (par2World.isRemote) {
            return par1ItemStack;
        }
        if (par1ItemStack.stackTagCompound == null) {
            par1ItemStack.stackTagCompound = new NBTTagCompound();
        }
        final MoneyBagContents contents = new MoneyBagContents(par3EntityPlayer);
        NoppesUtil.openGUI(par3EntityPlayer, new GuiScreen());
        return par1ItemStack;
    }
}
