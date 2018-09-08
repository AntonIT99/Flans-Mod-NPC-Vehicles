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
import noppes.npcs.blocks.tiles.TileColorable;
import net.minecraft.world.IBlockAccess;
import noppes.npcs.CustomNpcs;
import net.minecraft.util.MathHelper;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import noppes.npcs.entity.EntityNPCInterface;
import noppes.npcs.NoppesUtilServer;
import noppes.npcs.constants.EnumGuiType;
import noppes.npcs.blocks.tiles.TileBigSign;
import noppes.npcs.CustomNpcsPermissions;
import noppes.npcs.CustomItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;
import net.minecraft.block.material.Material;
import net.minecraft.block.BlockContainer;

public class BlockBigSign extends BlockContainer
{
    public int renderId;
    
    public BlockBigSign() {
        super(Material.wood);
        this.renderId = -1;
    }
    
    public int damageDropped(final int par1) {
        return par1;
    }
    
    public AxisAlignedBB getCollisionBoundingBoxFromPool(final World p_149668_1_, final int p_149668_2_, final int p_149668_3_, final int p_149668_4_) {
        return null;
    }
    
    public boolean onBlockActivated(final World par1World, final int i, final int j, final int k, final EntityPlayer player, final int par6, final float par7, final float par8, final float par9) {
        if (par1World.isRemote) {
            return false;
        }
        final ItemStack currentItem = player.inventory.getCurrentItem();
        if (currentItem != null && currentItem.getItem() == CustomItems.wand && CustomNpcsPermissions.hasPermission(player, CustomNpcsPermissions.EDIT_BLOCKS)) {
            final TileBigSign tile = (TileBigSign)par1World.getTileEntity(i, j, k);
            tile.canEdit = true;
            NoppesUtilServer.sendOpenGui(player, EnumGuiType.BigSign, null, i, j, k);
            return true;
        }
        return false;
    }
    
    public void onBlockPlacedBy(final World par1World, final int par2, final int par3, final int par4, final EntityLivingBase par5EntityLivingBase, final ItemStack par6ItemStack) {
        int l = MathHelper.floor_double(par5EntityLivingBase.rotationYaw * 4.0f / 360.0f + 0.5) & 0x3;
        l %= 4;
        final TileBigSign tile = (TileBigSign)par1World.getTileEntity(par2, par3, par4);
        tile.rotation = l;
        par1World.setBlockMetadataWithNotify(par2, par3, par4, par6ItemStack.getItemDamage(), 2);
        if (par5EntityLivingBase instanceof EntityPlayer && par1World.isRemote) {
            CustomNpcs.proxy.openGui(par2, par3, par4, EnumGuiType.BigSign, (EntityPlayer)par5EntityLivingBase);
        }
    }
    
    public void setBlockBoundsBasedOnState(final IBlockAccess world, final int x, final int y, final int z) {
        final TileEntity tileentity = world.getTileEntity(x, y, z);
        if (!(tileentity instanceof TileColorable)) {
            super.setBlockBoundsBasedOnState(world, x, y, z);
            return;
        }
        final TileColorable tile = (TileColorable)tileentity;
        final int meta = tile.getBlockMetadata();
        float xStart = 0.0f;
        float zStart = 0.0f;
        float xEnd = 1.0f;
        float zEnd = 1.0f;
        if (tile.rotation == 0) {
            zStart = 0.87f;
        }
        else if (tile.rotation == 2) {
            zEnd = 0.13f;
        }
        else if (tile.rotation == 3) {
            xStart = 0.87f;
        }
        else if (tile.rotation == 1) {
            xEnd = 0.13f;
        }
        this.setBlockBounds(xStart, 0.0f, zStart, xEnd, 1.0f, zEnd);
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
        return new TileBigSign();
    }
}
