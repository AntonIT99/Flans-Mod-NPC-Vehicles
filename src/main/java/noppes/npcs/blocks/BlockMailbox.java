// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.blocks;

import noppes.npcs.blocks.tiles.TileMailbox;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.init.Blocks;
import net.minecraft.util.IIcon;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.MathHelper;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.block.Block;
import java.util.ArrayList;
import noppes.npcs.Server;
import noppes.npcs.constants.EnumGuiType;
import noppes.npcs.constants.EnumPacketClient;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import java.util.List;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.block.material.Material;
import net.minecraft.block.BlockContainer;

public class BlockMailbox extends BlockContainer
{
    public int renderId;
    
    public BlockMailbox() {
        super(Material.iron);
        this.renderId = -1;
    }
    
    public void getSubBlocks(final Item par1, final CreativeTabs par2CreativeTabs, final List par3List) {
        par3List.add(new ItemStack(par1, 1, 0));
        par3List.add(new ItemStack(par1, 1, 1));
    }
    
    public boolean onBlockActivated(final World par1World, final int i, final int j, final int k, final EntityPlayer player, final int par6, final float par7, final float par8, final float par9) {
        if (!par1World.isRemote) {
            Server.sendData((EntityPlayerMP)player, EnumPacketClient.GUI, EnumGuiType.PlayerMailbox, i, j, k);
        }
        return true;
    }
    
    public ArrayList<ItemStack> getDrops(final World world, final int x, final int y, final int z, final int metadata, final int fortune) {
        final ArrayList<ItemStack> ret = new ArrayList<ItemStack>();
        final int damage = this.getDamageValue(world, x, y, z);
        ret.add(new ItemStack((Block)this, 1, damage));
        return ret;
    }
    
    public int damageDropped(final int par1) {
        return par1 >> 2;
    }
    
    public void onBlockPlacedBy(final World par1World, final int par2, final int par3, final int par4, final EntityLivingBase par5EntityLivingBase, final ItemStack par6ItemStack) {
        int l = MathHelper.floor_double(par5EntityLivingBase.rotationYaw * 4.0f / 360.0f + 0.5) & 0x3;
        l %= 4;
        par1World.setBlockMetadataWithNotify(par2, par3, par4, l | par6ItemStack.getItemDamage() << 2, 2);
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
    public IIcon getIcon(final int p_149691_1_, final int p_149691_2_) {
        return Blocks.soul_sand.getBlockTextureFromSide(p_149691_1_);
    }
    
    public TileEntity createNewTileEntity(final World var1, final int var2) {
        return new TileMailbox();
    }
}
