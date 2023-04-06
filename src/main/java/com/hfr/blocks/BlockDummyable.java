package com.hfr.blocks;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.hfr.handler.MultiblockHandler;
import com.hfr.util.ThreeInts;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;
import net.minecraftforge.common.util.ForgeDirection;

public abstract class BlockDummyable extends BlockContainer {

	public BlockDummyable(Material mat) {
		super(mat);
		this.setTickRandomly(true);
	}
	
	/// BLOCK METADATA ///
	
	//0-5 		dummy rotation 		(for dummy neighbor checks)
	//6-11 		extra 				(6 rotations with flag, for pipe connectors and the like)
	//12-15 	block rotation 		(for rendering the TE)

	//meta offset from dummy to TE rotation
	public static final int offset = 10;
	//meta offset from dummy to extra rotation
	public static final int extra = 6;
	
	public static boolean safeRem = false;
	
    public void onNeighborBlockChange(World world, int x, int y, int z, Block block) {
    	
    	super.onNeighborBlockChange(world, x, y, z, block);
    	
    	if(world.isRemote)
    		return;
    	
    	int metadata = world.getBlockMetadata(x, y, z);
    	
    	//if it's an extra, remove the extra-ness
    	if(metadata >= extra)
    		metadata -= extra;
    	
    	ForgeDirection dir = ForgeDirection.getOrientation(metadata).getOpposite();
    	Block b = world.getBlock(x + dir.offsetX, y + dir.offsetY, z + dir.offsetZ);
    	
    	if(b != this) {
    		world.setBlockToAir(x, y, z);
    	}
    }
    
    public void updateTick(World world, int x, int y, int z, Random rand) {
    	
    	super.updateTick(world, x, y, z, rand);
    	
    	if(world.isRemote)
    		return;
    	
    	int metadata = world.getBlockMetadata(x, y, z);
    	
    	//if it's an extra, remove the extra-ness
    	if(metadata >= extra)
    		metadata -= extra;
    	
    	ForgeDirection dir = ForgeDirection.getOrientation(metadata).getOpposite();
    	Block b = world.getBlock(x + dir.offsetX, y + dir.offsetY, z + dir.offsetZ);
    	
    	if(b != this) {
    		world.setBlockToAir(x, y, z);
    	}
    	
    }
    
    public int[] findCore(World world, int x, int y, int z) {
    	positions.clear();
    	return findCoreRec(world, x, y, z);
    }
    
    List<ThreeInts> positions = new ArrayList();
    public int[] findCoreRec(World world, int x, int y, int z) {
    	
    	ThreeInts pos = new ThreeInts(x, y, z);
    	
    	int metadata = world.getBlockMetadata(x, y, z);
    	
    	//if it's an extra, remove the extra-ness
    	if(metadata >= extra)
    		metadata -= extra;
    	
    	//if the block matches and the orientation is "UNKNOWN", it's the core
    	if(world.getBlock(x, y, z) == this && ForgeDirection.getOrientation(metadata) == ForgeDirection.UNKNOWN)
    		return new int[] { x, y, z };
    	
    	if(positions.contains(pos))
    		return null;

    	ForgeDirection dir = ForgeDirection.getOrientation(metadata).getOpposite();
    	
    	Block b = world.getBlock(x + dir.offsetX, y + dir.offsetY, z + dir.offsetZ);
    	
    	if(b != this) {
    		return null;
    	}
    	
    	positions.add(pos);
    	
    	return findCoreRec(world, x + dir.offsetX, y + dir.offsetY, z + dir.offsetZ);
    }
	
	@Override
	public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase player, ItemStack itemStack) {
		
		if(!(player instanceof EntityPlayer))
			return;
		
		EntityPlayer pl = (EntityPlayer) player;
		
		int i = MathHelper.floor_double(player.rotationYaw * 4.0F / 360.0F + 0.5D) & 3;
		int o = -getOffset();
		
		ForgeDirection dir = ForgeDirection.NORTH;
		
		if(i == 0)
		{
			//2
			dir = ForgeDirection.getOrientation(2);
		}
		if(i == 1)
		{
			//5
			dir = ForgeDirection.getOrientation(5);
		}
		if(i == 2)
		{
			//3
			dir = ForgeDirection.getOrientation(3);
		}
		if(i == 3)
		{
			//4
			dir = ForgeDirection.getOrientation(4);
		}
		
		if(!MultiblockHandler.checkSpace(world, x + dir.offsetX * o , y + dir.offsetY * o, z + dir.offsetZ * o, getDimensions(), x, y, z, dir)) {
			//world.func_147480_a(x, y, z, true);
			world.setBlockToAir(x, y, z);
			
			if(!pl.capabilities.isCreativeMode) {
				ItemStack stack = pl.inventory.mainInventory[pl.inventory.currentItem];
				Item item = Item.getItemFromBlock(this);
				
				if(stack == null) {
					pl.inventory.mainInventory[pl.inventory.currentItem] = new ItemStack(this);
				} else {
					if(stack.getItem() != item || stack.stackSize == stack.getMaxStackSize()) {
						pl.inventory.addItemStackToInventory(new ItemStack(this));
					} else {
						pl.getHeldItem().stackSize++;
					}
				}
			}
			
			return;
		}
		
		world.setBlock(x + dir.offsetX * o , y + dir.offsetY * o, z + dir.offsetZ * o, this, dir.ordinal() + offset, 3);
		MultiblockHandler.fillSpace(world, x + dir.offsetX * o , y + dir.offsetY * o, z + dir.offsetZ * o, getDimensions(), this, dir);
		world.scheduleBlockUpdate(x, y, z, this, 1);
		world.scheduleBlockUpdate(x, y, z, this, 2);

		super.onBlockPlacedBy(world, x, y, z, player, itemStack);
	}
	
	//"upgrades" regular dummy blocks to ones with the extra flag
	public void makeExtra(World world, int x, int y, int z) {
		
		if(world.getBlock(x, y, z) != this)
			return;
		
		int meta = world.getBlockMetadata(x, y, z);
		
		if(meta > 5)
			return;
		
		//world.setBlockMetadataWithNotify(x, y, z, meta + extra, 3);
		this.safeRem = true;
		world.setBlock(x, y, z, this, meta + extra, 3);
		this.safeRem = false;
		
	}
	
	//checks if the dummy metadata is within the extra range
	public boolean hasExtra(int meta) {
		
		return meta > 5 && meta < 12;
	}
	
	@Override
	public void breakBlock(World world, int x, int y, int z, Block b, int i)
    {
		if(i >= 12) {
			//ForgeDirection d = ForgeDirection.getOrientation(world.getBlockMetadata(x, y, z) - offset);
			//MultiblockHandler.emptySpace(world, x, y, z, getDimensions(), this, d);
		} else if(!safeRem) {
			
	    	if(i >= extra)
	    		i -= extra;

	    	ForgeDirection dir = ForgeDirection.getOrientation(i).getOpposite();
			int[] pos = findCore(world, x + dir.offsetX, y + dir.offsetY, z + dir.offsetZ);
			
			if(pos != null) {

				//ForgeDirection d = ForgeDirection.getOrientation(world.getBlockMetadata(pos[0], pos[1], pos[2]) - offset);
				world.setBlockToAir(pos[0], pos[1], pos[2]);
			}
		}
		
		
		super.breakBlock(world, x, y, z, b, i);
    }
	
	@Override
	public int getRenderType(){
		return -1;
	}
	
	@Override
	public boolean isOpaqueCube() {
		return false;
	}
	
	@Override
	public boolean renderAsNormalBlock() {
		return false;
	}

	public abstract int[] getDimensions();
	public abstract int getOffset();

}
