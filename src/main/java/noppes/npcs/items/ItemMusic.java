// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.items;

import net.minecraft.item.Item;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;
import noppes.npcs.CustomItems;

public class ItemMusic extends ItemNpcInterface
{
    private boolean shouldRotate;
    
    public ItemMusic() {
        this.shouldRotate = false;
        this.setCreativeTab((CreativeTabs)CustomItems.tabMisc);
    }
    
    public ItemStack onItemRightClick(final ItemStack par1ItemStack, final World par2World, final EntityPlayer player) {
        if (par2World.isRemote) {
            return par1ItemStack;
        }
        final int note = par2World.rand.nextInt(24);
        final float var7 = (float)Math.pow(2.0, (note - 12) / 12.0);
        final String var8 = "harp";
        par2World.playSoundEffect(player.posX, player.posY, player.posZ, "note." + var8, 3.0f, var7);
        par2World.spawnParticle("note", player.posY, player.posY + 1.2, player.posY, note / 24.0, 0.0, 0.0);
        return par1ItemStack;
    }
    
    public Item setRotated() {
        this.shouldRotate = true;
        return this;
    }
    
    public boolean shouldRotateAroundWhenRendering() {
        return this.shouldRotate;
    }
}
