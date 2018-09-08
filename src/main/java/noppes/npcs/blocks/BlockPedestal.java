// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.blocks;

import noppes.npcs.blocks.tiles.TileNpcContainer;
import net.minecraft.block.Block;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.util.IIcon;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.tileentity.TileEntity;
import noppes.npcs.blocks.tiles.TileColorable;
import net.minecraft.world.IBlockAccess;
import java.util.List;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSword;
import net.minecraft.item.ItemStack;
import noppes.npcs.blocks.tiles.TilePedestal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraft.init.Blocks;

public class BlockPedestal extends BlockTrigger
{
    public BlockPedestal() {
        super(Blocks.stone);
    }
    
    public boolean onBlockActivated(final World par1World, final int i, final int j, final int k, final EntityPlayer player, final int side, final float hitX, final float hitY, final float hitZ) {
        if (par1World.isRemote) {
            return true;
        }
        final TilePedestal tile = (TilePedestal)par1World.getTileEntity(i, j, k);
        final ItemStack item = player.getCurrentEquippedItem();
        final ItemStack weapon = tile.getStackInSlot(0);
        if (item == null && weapon != null) {
            tile.setInventorySlotContents(0, null);
            player.inventory.setInventorySlotContents(player.inventory.currentItem, weapon);
            par1World.markBlockForUpdate(i, j, k);
            this.updateSurrounding(par1World, i, j, k);
        }
        else {
            if (item == null || item.getItem() == null || !(item.getItem() instanceof ItemSword)) {
                return true;
            }
            if (item != null && weapon == null) {
                tile.setInventorySlotContents(0, item);
                player.inventory.setInventorySlotContents(player.inventory.currentItem, (ItemStack)null);
                par1World.markBlockForUpdate(i, j, k);
                this.updateSurrounding(par1World, i, j, k);
            }
        }
        return true;
    }
    
    public void getSubBlocks(final Item par1, final CreativeTabs par2CreativeTabs, final List par3List) {
        par3List.add(new ItemStack(par1, 1, 0));
        par3List.add(new ItemStack(par1, 1, 1));
        par3List.add(new ItemStack(par1, 1, 2));
        par3List.add(new ItemStack(par1, 1, 3));
        par3List.add(new ItemStack(par1, 1, 4));
    }
    
    public int damageDropped(final int par1) {
        return par1;
    }
    
    public void setBlockBoundsBasedOnState(final IBlockAccess world, final int x, final int y, final int z) {
        final TileEntity tileentity = world.getTileEntity(x, y, z);
        if (!(tileentity instanceof TileColorable)) {
            super.setBlockBoundsBasedOnState(world, x, y, z);
            return;
        }
        final TileColorable tile = (TileColorable)tileentity;
        if (tile.rotation % 2 == 0) {
            this.setBlockBounds(0.0f, 0.0f, 0.2f, 1.0f, 0.5f, 0.8f);
        }
        else {
            this.setBlockBounds(0.2f, 0.0f, 0.0f, 0.8f, 0.5f, 1.0f);
        }
    }
    
    @Override
    public void onBlockPlacedBy(final World par1World, final int par2, final int par3, final int par4, final EntityLivingBase par5EntityLivingBase, final ItemStack par6ItemStack) {
        super.onBlockPlacedBy(par1World, par2, par3, par4, par5EntityLivingBase, par6ItemStack);
        par1World.setBlockMetadataWithNotify(par2, par3, par4, par6ItemStack.getItemDamage(), 2);
    }
    
    @SideOnly(Side.CLIENT)
    @Override
    public IIcon getIcon(final int p_149691_1_, int meta) {
        meta %= 7;
        if (meta == 1) {
            return Blocks.stone.getIcon(p_149691_1_, 0);
        }
        if (meta == 2) {
            return Blocks.iron_block.getIcon(p_149691_1_, 0);
        }
        if (meta == 3) {
            return Blocks.gold_block.getIcon(p_149691_1_, 0);
        }
        if (meta == 4) {
            return Blocks.diamond_block.getIcon(p_149691_1_, 0);
        }
        return Blocks.planks.getIcon(p_149691_1_, 0);
    }
    
    public TileEntity createNewTileEntity(final World var1, final int var2) {
        return new TilePedestal();
    }
    
    public void breakBlock(final World world, final int x, final int y, final int z, final Block block, final int p_149749_6_) {
        final TileNpcContainer tile = (TileNpcContainer)world.getTileEntity(x, y, z);
        if (tile == null) {
            return;
        }
        tile.dropItems(world, x, y, z);
        world.func_147453_f(x, y, z, block);
        super.breakBlock(world, x, y, z, block, p_149749_6_);
    }
}
