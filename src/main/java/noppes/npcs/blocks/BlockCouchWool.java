// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.blocks;

import net.minecraft.init.Blocks;
import net.minecraft.util.IIcon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.block.Block;
import noppes.npcs.blocks.tiles.TileCouchWool;
import net.minecraft.util.MathHelper;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.AxisAlignedBB;
import java.util.List;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import noppes.npcs.NoppesUtilServer;
import net.minecraft.block.BlockColored;
import noppes.npcs.blocks.tiles.TileColorable;
import net.minecraft.init.Items;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraft.block.material.Material;
import net.minecraft.block.BlockContainer;

public class BlockCouchWool extends BlockContainer
{
    public int renderId;
    
    public BlockCouchWool() {
        super(Material.wood);
        this.renderId = -1;
    }
    
    public boolean onBlockActivated(final World par1World, final int i, int j, final int k, final EntityPlayer player, final int par6, final float par7, final float par8, final float par9) {
        final ItemStack item = player.inventory.getCurrentItem();
        if (item == null || item.getItem() != Items.dye) {
            return BlockChair.MountBlock(par1World, i, j, k, player);
        }
        final int meta = par1World.getBlockMetadata(i, j, k);
        if (meta >= 7) {
            --j;
        }
        final TileColorable tile = (TileColorable)par1World.getTileEntity(i, j, k);
        final int color = BlockColored.func_150031_c(item.getItemDamage());
        if (tile.color != color) {
            NoppesUtilServer.consumeItemStack(1, player);
            tile.color = color;
            par1World.markBlockForUpdate(i, j, k);
        }
        return true;
    }
    
    public void getSubBlocks(final Item par1, final CreativeTabs par2CreativeTabs, final List par3List) {
        par3List.add(new ItemStack(par1, 1, 0));
        par3List.add(new ItemStack(par1, 1, 1));
        par3List.add(new ItemStack(par1, 1, 2));
        par3List.add(new ItemStack(par1, 1, 3));
        par3List.add(new ItemStack(par1, 1, 4));
        par3List.add(new ItemStack(par1, 1, 5));
    }
    
    public int damageDropped(final int par1) {
        return par1;
    }
    
    public AxisAlignedBB getCollisionBoundingBoxFromPool(final World p_149668_1_, final int x, final int y, final int z) {
        return AxisAlignedBB.getBoundingBox((double)x, (double)y, (double)z, (double)(x + 1), y + 0.5, (double)(z + 1));
    }
    
    public void onBlockPlacedBy(final World par1World, final int par2, final int par3, final int par4, final EntityLivingBase par5EntityLivingBase, final ItemStack par6ItemStack) {
        int l = MathHelper.floor_double(par5EntityLivingBase.rotationYaw * 4.0f / 360.0f + 0.5) & 0x3;
        l %= 4;
        final TileCouchWool tile = (TileCouchWool)par1World.getTileEntity(par2, par3, par4);
        tile.rotation = l;
        tile.color = 15 - par6ItemStack.getItemDamage();
        par1World.setBlockMetadataWithNotify(par2, par3, par4, par6ItemStack.getItemDamage(), 2);
        this.updateModel(par1World, par2, par3, par4, tile);
        this.onNeighborBlockChange(par1World, par2 + 1, par3, par4, (Block)this);
        this.onNeighborBlockChange(par1World, par2 - 1, par3, par4, (Block)this);
        this.onNeighborBlockChange(par1World, par2, par3, par4 + 1, (Block)this);
        this.onNeighborBlockChange(par1World, par2, par3, par4 - 1, (Block)this);
        this.updateModel(par1World, par2, par3, par4, tile);
        par1World.markBlockForUpdate(par2, par3, par4);
    }
    
    public void onNeighborBlockChange(final World worldObj, final int x, final int y, final int z, final Block block) {
        if (worldObj.isRemote || block != this) {
            return;
        }
        final TileEntity tile = worldObj.getTileEntity(x, y, z);
        if (tile == null || !(tile instanceof TileCouchWool)) {
            return;
        }
        this.updateModel(worldObj, x, y, z, (TileCouchWool)tile);
        worldObj.markBlockForUpdate(x, y, z);
    }
    
    private void updateModel(final World world, final int x, final int y, final int z, final TileCouchWool tile) {
        if (world.isRemote) {
            return;
        }
        final int meta = tile.getBlockMetadata();
        if (tile.rotation == 0) {
            tile.hasCornerLeft = this.compareCornerTiles(tile, x, y, z - 1, world, meta, true);
            tile.hasCornerRight = this.compareCornerTiles(tile, x, y, z - 1, world, meta, false);
            tile.hasLeft = this.compareTiles(tile, x - 1, y, z, world, meta);
            tile.hasRight = this.compareTiles(tile, x + 1, y, z, world, meta);
        }
        else if (tile.rotation == 2) {
            tile.hasCornerLeft = this.compareCornerTiles(tile, x, y, z + 1, world, meta, true);
            tile.hasCornerRight = this.compareCornerTiles(tile, x, y, z + 1, world, meta, false);
            tile.hasLeft = this.compareTiles(tile, x + 1, y, z, world, meta);
            tile.hasRight = this.compareTiles(tile, x - 1, y, z, world, meta);
        }
        else if (tile.rotation == 1) {
            tile.hasCornerLeft = this.compareCornerTiles(tile, x + 1, y, z, world, meta, true);
            tile.hasCornerRight = this.compareCornerTiles(tile, x + 1, y, z, world, meta, false);
            tile.hasLeft = this.compareTiles(tile, x, y, z - 1, world, meta);
            tile.hasRight = this.compareTiles(tile, x, y, z + 1, world, meta);
        }
        else if (tile.rotation == 3) {
            tile.hasCornerLeft = this.compareCornerTiles(tile, x - 1, y, z, world, meta, true);
            tile.hasCornerRight = this.compareCornerTiles(tile, x - 1, y, z, world, meta, false);
            tile.hasLeft = this.compareTiles(tile, x, y, z + 1, world, meta);
            tile.hasRight = this.compareTiles(tile, x, y, z - 1, world, meta);
        }
    }
    
    private boolean compareCornerTiles(final TileCouchWool tile, final int x, final int y, final int z, final World world, final int meta, final boolean isLeft) {
        final int meta2 = world.getBlockMetadata(x, y, z);
        if (meta2 != meta) {
            return false;
        }
        final TileEntity tile2 = world.getTileEntity(x, y, z);
        final int rotation = (tile.rotation + (isLeft ? 3 : 1)) % 4;
        return (tile2 != null & tile2 instanceof TileCouchWool) && ((TileCouchWool)tile2).rotation == rotation;
    }
    
    private boolean compareTiles(final TileCouchWool tile, final int x, final int y, final int z, final World world, final int meta) {
        final int meta2 = world.getBlockMetadata(x, y, z);
        if (meta2 != meta) {
            return false;
        }
        final TileEntity tile2 = world.getTileEntity(x, y, z);
        if (tile2 == null || !(tile2 instanceof TileCouchWool)) {
            return false;
        }
        final TileCouchWool couch = (TileCouchWool)tile2;
        int rotation = couch.rotation;
        if (tile.rotation == rotation) {
            return true;
        }
        if (couch.hasCornerLeft) {
            rotation += 3;
        }
        else if (couch.hasCornerRight) {
            ++rotation;
        }
        rotation %= 4;
        return tile.rotation == rotation;
    }
    
    public boolean isOpaqueCube() {
        return false;
    }
    
    public boolean renderAsNormalBlock() {
        return false;
    }
    
    public int getRenderType() {
        return this.renderId;
    }
    
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(final IIconRegister par1IconRegister) {
    }
    
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(final int p_149691_1_, final int meta) {
        return Blocks.planks.getIcon(p_149691_1_, meta);
    }
    
    public TileEntity createNewTileEntity(final World var1, final int var2) {
        return new TileCouchWool();
    }
}
