package com.wolffsmod.entity.manus.ww2.legacy;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityM4 extends EntityFlanVehicleNPC
{

	public EntityM4(World w)
	{
		super(w);
		setSize(3.0F, 2.5F);
	}

	@Override
	public void setupConfig()
	{
		setDriver("0 21 0 -360 360 -10 20");
		addBarrelPosition("0 31 0");

	}
}
