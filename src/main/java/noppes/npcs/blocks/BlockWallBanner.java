// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.blocks;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.init.Blocks;
import net.minecraft.util.IIcon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import java.util.List;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.IChatComponent;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.MathHelper;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import noppes.npcs.NoppesUtilServer;
import net.minecraft.block.BlockColored;
import net.minecraft.init.Items;
import noppes.npcs.blocks.tiles.TileWallBanner;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraft.block.material.Material;
import net.minecraft.block.BlockContainer;

public class BlockWallBanner extends BlockContainer
{
    public int renderId;
    
    public BlockWallBanner() {
        super(Material.rock);
        this.renderId = -1;
    }
    
    public boolean onBlockActivated(final World par1World, final int i, final int j, final int k, final EntityPlayer player, final int par6, final float par7, final float par8, final float par9) {
        final ItemStack item = player.inventory.getCurrentItem();
        if (item == null) {
            return false;
        }
        final TileWallBanner tile = (TileWallBanner)par1World.getTileEntity(i, j, k);
        if (tile.canEdit()) {
            return true;
        }
        if (item.getItem() != Items.dye) {
            return false;
        }
        final int color = BlockColored.func_150031_c(item.getItemDamage());
        if (tile.color != color) {
            NoppesUtilServer.consumeItemStack(1, player);
            tile.color = color;
            par1World.markBlockForUpdate(i, j, k);
        }
        return true;
    }
    
    public void onBlockPlacedBy(final World par1World, final int par2, final int par3, final int par4, final EntityLivingBase par5EntityLivingBase, final ItemStack par6ItemStack) {
        int l = MathHelper.floor_double(par5EntityLivingBase.rotationYaw * 4.0f / 360.0f + 0.5) & 0x3;
        l %= 4;
        final TileWallBanner tile = (TileWallBanner)par1World.getTileEntity(par2, par3, par4);
        tile.rotation = l;
        tile.color = 15 - par6ItemStack.getItemDamage();
        tile.time = System.currentTimeMillis();
        par1World.setBlockMetadataWithNotify(par2, par3, par4, par6ItemStack.getItemDamage(), 2);
        if (par5EntityLivingBase instanceof EntityPlayer && par1World.isRemote) {
            ((EntityPlayer)par5EntityLivingBase).addChatComponentMessage((IChatComponent)new ChatComponentTranslation("availability.editIcon", new Object[0]));
        }
    }
    
    public AxisAlignedBB getCollisionBoundingBoxFromPool(final World p_149668_1_, final int p_149668_2_, final int p_149668_3_, final int p_149668_4_) {
        return null;
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
        return new TileWallBanner();
    }
}
