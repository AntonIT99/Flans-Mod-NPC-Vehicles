package com.flansmod.common.guns.raytracing;

import net.minecraft.block.Block;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;

public class BlockHit extends BulletHit 
{
	public MovingObjectPosition raytraceResult;
	
	public BlockHit(MovingObjectPosition mop, float f) 
	{
		super(f);
		raytraceResult = mop;
	}
	
}
