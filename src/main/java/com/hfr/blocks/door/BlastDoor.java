package com.hfr.blocks.door;

import com.hfr.tileentity.machine.TileEntityBlastDoor;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class BlastDoor extends BlockContainer {

	public BlastDoor(Material p_i45386_1_) {
		super(p_i45386_1_);
	}

	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
		return new TileEntityBlastDoor();
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
	
	@Override
	public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase player, ItemStack itemStack) {
		
		TileEntityBlastDoor te = (TileEntityBlastDoor) world.getTileEntity(x, y, z);
		
		int i = MathHelper.floor_double(player.rotationYaw * 4.0F / 360.0F + 0.5D) & 3;
		
		if(i == 0)
		{
			world.setBlockMetadataWithNotify(x, y, z, 2, 2);
		}
		if(i == 1)
		{
			world.setBlockMetadataWithNotify(x, y, z, 3, 2);
		}
		if(i == 2)
		{
			world.setBlockMetadataWithNotify(x, y, z, 2, 2);
		}
		if(i == 3)
		{
			world.setBlockMetadataWithNotify(x, y, z, 3, 2);
		}
		
		//frame
		if(!(te.placeDummy(x, y + 1, z) &&
			te.placeDummy(x, y + 2, z) &&
			te.placeDummy(x, y + 3, z) &&
			te.placeDummy(x, y + 4, z) &&
			te.placeDummy(x, y + 5, z) &&
			te.placeDummy(x, y + 6, z)))
			world.func_147480_a(x, y, z, true);
	}

}
