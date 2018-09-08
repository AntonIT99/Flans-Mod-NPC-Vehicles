// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.blocks;

import net.minecraft.block.material.MapColor;
import net.minecraft.world.IBlockAccess;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.item.ItemStack;
import java.util.List;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.block.material.Material;
import net.minecraft.block.BlockBreakable;

public class BlockCrystal extends BlockBreakable
{
    public BlockCrystal() {
        super("customnpcs:npcCrystal", Material.glass, false);
        this.setLightLevel(0.8f);
    }
    
    public boolean isOpaqueCube() {
        return false;
    }
    
    public boolean renderAsNormalBlock() {
        return false;
    }
    
    public int getRenderBlockPass() {
        return 1;
    }
    
    public int damageDropped(final int meta) {
        return meta;
    }
    
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(final Item item, final CreativeTabs tab, final List list) {
        for (int i = 0; i < 16; ++i) {
            list.add(new ItemStack(item, 1, i));
        }
    }
    
    @SideOnly(Side.CLIENT)
    public int colorMultiplier(final IBlockAccess world, final int x, final int y, final int z) {
        return this.getRenderColor(world.getBlockMetadata(x, y, z));
    }
    
    @SideOnly(Side.CLIENT)
    public int getRenderColor(final int meta) {
        return MapColor.getMapColorForBlockColored(meta).colorValue;
    }
    
    public MapColor getMapColor(final int p_149728_1_) {
        return MapColor.getMapColorForBlockColored(p_149728_1_);
    }
    
    public String getUnlocalizedName() {
        return "item.npcCrystal";
    }
}
