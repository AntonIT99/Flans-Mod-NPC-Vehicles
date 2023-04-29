package com.wolffsmod.entity.manus.ww2.legacy;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityT34 extends EntityFlanVehicleNPC
{
	public EntityT34(World w)
	{
		super(w);
		setSize(3.0F, 2.5F);
	}

	@Override
	public void setupConfig()
	{
		setDriver("0 17 0 -360 360 -10 20");
		addBarrelPosition("15 44 0");

	}
}
