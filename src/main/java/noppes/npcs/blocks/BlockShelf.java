// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.blocks;

import noppes.npcs.blocks.tiles.TileShelf;
import net.minecraft.tileentity.TileEntity;
import noppes.npcs.blocks.tiles.TileColorable;
import java.util.List;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.world.IBlockAccess;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.world.World;
import net.minecraft.init.Blocks;

public class BlockShelf extends BlockRotated
{
    public BlockShelf() {
        super(Blocks.planks);
    }
    
    @Override
    public void onBlockPlacedBy(final World par1World, final int par2, final int par3, final int par4, final EntityLivingBase par5EntityLivingBase, final ItemStack par6ItemStack) {
        super.onBlockPlacedBy(par1World, par2, par3, par4, par5EntityLivingBase, par6ItemStack);
        par1World.setBlockMetadataWithNotify(par2, par3, par4, par6ItemStack.getItemDamage(), 2);
    }
    
    @Override
    public AxisAlignedBB getCollisionBoundingBoxFromPool(final World p_149668_1_, final int x, final int y, final int z) {
        this.setBlockBoundsBasedOnState((IBlockAccess)p_149668_1_, x, y, z);
        return AxisAlignedBB.getBoundingBox(x + this.minX, (double)(y + 0.9f), z + this.minZ, x + this.maxX, (double)(y + 1), z + this.maxZ);
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
        float xStart = 0.0f;
        float zStart = 0.0f;
        float xEnd = 1.0f;
        float zEnd = 1.0f;
        if (tile.rotation == 0) {
            zStart = 0.3f;
        }
        else if (tile.rotation == 2) {
            zEnd = 0.7f;
        }
        else if (tile.rotation == 3) {
            xStart = 0.3f;
        }
        else if (tile.rotation == 1) {
            xEnd = 0.7f;
        }
        this.setBlockBounds(xStart, 0.44f, zStart, xEnd, 1.0f, zEnd);
    }
    
    public int damageDropped(final int par1) {
        return par1;
    }
    
    public TileEntity createNewTileEntity(final World var1, final int var2) {
        return new TileShelf();
    }
}
