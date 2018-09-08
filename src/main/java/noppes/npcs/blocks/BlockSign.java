// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.blocks;

import net.minecraft.tileentity.TileEntity;
import noppes.npcs.blocks.tiles.TileColorable;
import net.minecraft.world.IBlockAccess;
import java.util.List;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import noppes.npcs.blocks.tiles.TileBanner;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.entity.player.EntityPlayer;
import noppes.npcs.blocks.tiles.TileSign;
import net.minecraft.util.MathHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.world.World;
import net.minecraft.init.Blocks;

public class BlockSign extends BlockRotated
{
    public BlockSign() {
        super(Blocks.planks);
    }
    
    @Override
    public void onBlockPlacedBy(final World par1World, final int par2, final int par3, final int par4, final EntityLivingBase par5EntityLivingBase, final ItemStack par6ItemStack) {
        int l = MathHelper.floor_double(par5EntityLivingBase.rotationYaw * 4.0f / 360.0f + 0.5) & 0x3;
        l %= 4;
        final TileSign tile = (TileSign)par1World.getTileEntity(par2, par3, par4);
        tile.rotation = l;
        tile.time = System.currentTimeMillis();
        par1World.setBlockMetadataWithNotify(par2, par3, par4, par6ItemStack.getItemDamage(), 2);
        if (par5EntityLivingBase instanceof EntityPlayer && par1World.isRemote) {
            ((EntityPlayer)par5EntityLivingBase).addChatComponentMessage((IChatComponent)new ChatComponentTranslation("availability.editIcon", new Object[0]));
        }
    }
    
    public boolean onBlockActivated(final World world, final int x, final int y, final int z, final EntityPlayer player, final int side, final float hitX, final float hitY, final float hitZ) {
        final TileBanner tile = (TileBanner)world.getTileEntity(x, y, z);
        return tile.canEdit();
    }
    
    public void getSubBlocks(final Item par1, final CreativeTabs par2CreativeTabs, final List par3List) {
        par3List.add(new ItemStack(par1, 1, 0));
        par3List.add(new ItemStack(par1, 1, 1));
        par3List.add(new ItemStack(par1, 1, 2));
        par3List.add(new ItemStack(par1, 1, 3));
        par3List.add(new ItemStack(par1, 1, 4));
        par3List.add(new ItemStack(par1, 1, 5));
    }
    
    public void setBlockBoundsBasedOnState(final IBlockAccess world, final int x, final int y, final int z) {
        final TileEntity tileentity = world.getTileEntity(x, y, z);
        if (!(tileentity instanceof TileColorable)) {
            super.setBlockBoundsBasedOnState(world, x, y, z);
            return;
        }
        final TileColorable tile = (TileColorable)tileentity;
        if (tile.rotation % 2 == 1) {
            this.setBlockBounds(0.0f, 0.3f, 0.3f, 1.0f, 1.0f, 0.7f);
        }
        else {
            this.setBlockBounds(0.3f, 0.3f, 0.0f, 0.7f, 1.0f, 1.0f);
        }
    }
    
    public int damageDropped(final int par1) {
        return par1;
    }
    
    public TileEntity createNewTileEntity(final World var1, final int var2) {
        return new TileSign();
    }
}
