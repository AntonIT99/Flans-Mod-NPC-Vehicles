package com.wolffsmod.entity.price;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityOccupier extends EntityFlanVehicleNPC
{

	public EntityOccupier(World w)
	{
		super(w);
		setSize(4.5F, 3.0F);
	}

	@Override
	public void setupConfig()
	{
		setDriver("0 12 0 0 0 -90 90");
	}
}
