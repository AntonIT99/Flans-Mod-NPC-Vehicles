// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.blocks;

import net.minecraft.util.MathHelper;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.world.IBlockAccess;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;
import net.minecraft.creativetab.CreativeTabs;
import noppes.npcs.CustomItems;
import cpw.mods.fml.client.registry.RenderingRegistry;
import net.minecraft.block.material.Material;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.util.IIcon;
import net.minecraft.block.Block;

public class BlockBlood extends Block
{
    @SideOnly(Side.CLIENT)
    private IIcon blockIcon2;
    @SideOnly(Side.CLIENT)
    private IIcon blockIcon3;
    private final int renderId;
    
    public BlockBlood() {
        super(Material.rock);
        this.renderId = RenderingRegistry.getNextAvailableRenderId();
        this.setBlockUnbreakable();
        this.setCreativeTab((CreativeTabs)CustomItems.tabMisc);
        this.setBlockBounds(0.01f, 0.01f, 0.01f, 0.99f, 0.99f, 0.99f);
        this.setLightLevel(0.08f);
    }
    
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(final int side, int metadata) {
        metadata += side;
        if (metadata % 3 == 1) {
            return this.blockIcon2;
        }
        if (metadata % 3 == 2) {
            return this.blockIcon3;
        }
        return this.blockIcon;
    }
    
    public AxisAlignedBB getCollisionBoundingBoxFromPool(final World world, final int i, final int j, final int k) {
        return null;
    }
    
    public AxisAlignedBB getSelectedBoundingBoxFromPool(final World par1World, final int par2, final int par3, final int par4) {
        return AxisAlignedBB.getBoundingBox((double)par2, (double)par3, (double)par4, (double)par2, (double)par3, (double)par4);
    }
    
    public boolean renderAsNormalBlock() {
        return false;
    }
    
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(final IIconRegister par1IconRegister) {
        this.blockIcon = par1IconRegister.registerIcon(this.getTextureName());
        this.blockIcon2 = par1IconRegister.registerIcon(this.getTextureName() + "2");
        this.blockIcon3 = par1IconRegister.registerIcon(this.getTextureName() + "3");
    }
    
    public boolean shouldSideBeRendered(final IBlockAccess world, final int par2, final int par3, final int par4, final int par5) {
        final Block block = world.getBlock(par2, par3, par4);
        return block != Blocks.air && block.renderAsNormalBlock();
    }
    
    public boolean isOpaqueCube() {
        return false;
    }
    
    public int getRenderBlockPass() {
        return 1;
    }
    
    public void onBlockPlacedBy(final World par1World, final int par2, final int par3, final int par4, final EntityLivingBase par5EntityLiving, final ItemStack item) {
        final int var6 = MathHelper.floor_double(par5EntityLiving.rotationYaw / 90.0f + 0.5) & 0x3;
        par1World.setBlockMetadataWithNotify(par2, par3, par4, var6, 2);
    }
    
    public int getRenderType() {
        return this.renderId;
    }
}
