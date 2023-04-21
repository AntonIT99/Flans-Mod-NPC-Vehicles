package com.wolffsmod.entity.manus.ww2;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityM4Legacy extends EntityFlanVehicleNPC
{

	public EntityM4Legacy(World w)
	{
		super(w);
		setSize(3.0F, 2.5F);
	}

	@Override
	public void setupConfig()
	{
		setDriver("0 21 0 -360 360 -5 45");
		addBarrelPosition("0 31 0");

	}
}
