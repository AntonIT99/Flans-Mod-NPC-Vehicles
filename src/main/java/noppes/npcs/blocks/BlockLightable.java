// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.blocks;

import net.minecraft.item.ItemStack;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.item.Item;
import java.util.Random;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraft.block.Block;

public abstract class BlockLightable extends BlockRotated
{
    protected BlockLightable(final Block block, final boolean lit) {
        super(block);
        if (lit) {
            this.setLightLevel(1.0f);
        }
    }
    
    public abstract Block unlitBlock();
    
    public abstract Block litBlock();
    
    public boolean onBlockActivated(final World world, final int x, final int y, final int z, final EntityPlayer player, final int par6, final float par7, final float par8, final float par9) {
        final TileEntity tile = world.getTileEntity(x, y, z);
        if (this.litBlock() == this) {
            world.setBlock(x, y, z, this.unlitBlock(), world.getBlockMetadata(x, y, z), 2);
        }
        else {
            world.setBlock(x, y, z, this.litBlock(), world.getBlockMetadata(x, y, z), 2);
        }
        tile.validate();
        world.setTileEntity(x, y, z, tile);
        return true;
    }
    
    public Item getItemDropped(final int p_149650_1_, final Random p_149650_2_, final int p_149650_3_) {
        return Item.getItemFromBlock(this.litBlock());
    }
    
    @SideOnly(Side.CLIENT)
    public Item getItem(final World p_149694_1_, final int p_149694_2_, final int p_149694_3_, final int p_149694_4_) {
        return Item.getItemFromBlock(this.litBlock());
    }
    
    protected ItemStack createStackedBlock(final int p_149644_1_) {
        return new ItemStack(this.litBlock());
    }
}
