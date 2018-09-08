// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.blocks;

import noppes.npcs.CustomItems;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import org.lwjgl.opengl.GL11;
import java.util.Random;
import net.minecraft.item.ItemStack;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.entity.EntityLivingBase;
import noppes.npcs.NoppesUtilServer;
import noppes.npcs.CustomNpcs;
import net.minecraft.init.Items;
import net.minecraft.entity.player.EntityPlayer;
import noppes.npcs.blocks.tiles.TileCampfire;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;
import net.minecraft.init.Blocks;

public class BlockCampfire extends BlockLightable
{
    public BlockCampfire(final boolean lit) {
        super(Blocks.cobblestone, lit);
        this.setBlockBounds(0.0f, 0.0f, 0.0f, 1.0f, 0.5f, 1.0f);
        if (lit) {
            this.setLightLevel(0.9375f);
        }
    }
    
    public TileEntity createNewTileEntity(final World var1, final int var2) {
        return new TileCampfire();
    }
    
    @Override
    public boolean onBlockActivated(final World world, final int x, final int y, final int z, final EntityPlayer player, final int par6, final float par7, final float par8, final float par9) {
        final ItemStack item = player.inventory.getCurrentItem();
        if (item == null) {
            return true;
        }
        final int meta = world.getBlockMetadata(x, y, z);
        if ((item.getItem() == Items.flint || item.getItem() == Items.flint_and_steel) && this.unlitBlock() == this) {
            if (world.rand.nextInt(3) == 0 && !world.isRemote) {
                super.onBlockActivated(world, x, y, z, player, par6, par7, par8, par9);
            }
            CustomNpcs.proxy.spawnParticle("largesmoke", x + 0.5f, y + 0.5f, z + 0.5f, 0.0, 0.0, 0.0, 2.0f);
            if (item.getItem() == Items.flint) {
                NoppesUtilServer.consumeItemStack(1, player);
            }
            else {
                item.damageItem(1, (EntityLivingBase)player);
            }
            return true;
        }
        if (item.getItem() == Item.getItemFromBlock((Block)Blocks.sand) && this.litBlock() == this) {
            super.onBlockActivated(world, x, y, z, player, par6, par7, par8, par9);
        }
        return true;
    }
    
    @Override
    public int maxRotation() {
        return 8;
    }
    
    @SideOnly(Side.CLIENT)
    public void randomDisplayTick(final World world, final int x, final int y, final int z, final Random random) {
        final int meta = world.getBlockMetadata(x, y, z);
        if (meta == 1) {
            return;
        }
        if (random.nextInt(36) == 0) {
            world.playSound((double)(x + 0.5f), (double)(y + 0.5f), (double)(z + 0.5f), "fire.fire", 1.0f + random.nextFloat(), 0.3f + random.nextFloat() * 0.7f, false);
        }
        final TileCampfire tile = (TileCampfire)world.getTileEntity(x, y, z);
        final float xOffset = 0.5f;
        final float yOffset = 0.7f;
        final float zOffset = 0.5f;
        final double d0 = x + xOffset;
        final double d2 = y + yOffset;
        final double d3 = z + zOffset;
        GL11.glPushMatrix();
        CustomNpcs.proxy.spawnParticle("largesmoke", d0, d2, d3, 0.0, 0.0, 0.0, 2.0f);
        CustomNpcs.proxy.spawnParticle("flame", d0, d2, d3, 0.0, 0.0, 0.0, 4.0f);
        GL11.glPopMatrix();
    }
    
    @Override
    public Block unlitBlock() {
        return CustomItems.campfire_unlit;
    }
    
    @Override
    public Block litBlock() {
        return CustomItems.campfire;
    }
}
