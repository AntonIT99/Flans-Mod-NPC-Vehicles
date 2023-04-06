package com.hfr.items;

import com.hfr.blocks.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class ItemBlockConqueror extends ItemBlock {
	
    public ItemBlockConqueror(Block p_i45328_1_) {
		super(p_i45328_1_);
	}

	public ItemStack onItemRightClick(ItemStack p_77659_1_, World p_77659_2_, EntityPlayer p_77659_3_)
    {
        MovingObjectPosition movingobjectposition = this.getMovingObjectPositionFromPlayer(p_77659_2_, p_77659_3_, true);

        if (movingobjectposition == null)
        {
            return p_77659_1_;
        }
        else
        {
            if (movingobjectposition.typeOfHit == MovingObjectPosition.MovingObjectType.BLOCK)
            {
                int i = movingobjectposition.blockX;
                int j = movingobjectposition.blockY;
                int k = movingobjectposition.blockZ;

                if (!p_77659_2_.canMineBlock(p_77659_3_, i, j, k))
                {
                    return p_77659_1_;
                }

                if (!p_77659_3_.canPlayerEdit(i, j, k, movingobjectposition.sideHit, p_77659_1_))
                {
                    return p_77659_1_;
                }

                if (p_77659_2_.getBlock(i, j, k).getMaterial() == Material.water && p_77659_2_.getBlockMetadata(i, j, k) == 0 && p_77659_2_.isAirBlock(i, j + 1, k))
                {
                    // special case for handling block placement with water lilies
                    net.minecraftforge.common.util.BlockSnapshot blocksnapshot = net.minecraftforge.common.util.BlockSnapshot.getBlockSnapshot(p_77659_2_, i, j + 1, k);
                    p_77659_2_.setBlock(i, j + 1, k, ModBlocks.clowder_conquerer);
                    if (net.minecraftforge.event.ForgeEventFactory.onPlayerBlockPlace(p_77659_3_, blocksnapshot, net.minecraftforge.common.util.ForgeDirection.UP).isCanceled()) 
                    {
                        blocksnapshot.restore(true, false);
                        return p_77659_1_;
                    }

                    if (!p_77659_3_.capabilities.isCreativeMode)
                    {
                        --p_77659_1_.stackSize;
                    }
                }
            }

            return p_77659_1_;
        }
    }

}
