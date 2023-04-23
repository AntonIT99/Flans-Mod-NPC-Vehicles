package com.wolffsmod.entity.manus.mw;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;
public class EntityBwTruck extends EntityFlanVehicleNPC
{
	public EntityBwTruck(World w)
	{
		super(w);
		setSize(3.0F, 2.5F);
	}

	@Override
	public void setupConfig()
	{
		setDriver("12 15 -9 -80 80 -45 45");
	}
}