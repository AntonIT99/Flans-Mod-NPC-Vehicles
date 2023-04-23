package com.wolffsmod.entity.manus.mw;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityLeopard2A6 extends EntityFlanVehicleNPC
{
	public EntityLeopard2A6(World w)
	{
		super(w);
		setSize(3.5F, 2.5F);
	}

	@Override
	public void setupConfig()
	{
		setDriver("0 21 0 -360 360 -10 20");
		addBarrelPosition("0 21 0");
	}
}
