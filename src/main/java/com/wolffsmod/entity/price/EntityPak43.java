package com.wolffsmod.entity.price;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityPak43 extends EntityFlanVehicleNPC
{

	public EntityPak43(World w)
	{
		super(w);
		setSize(3.5F, 2.5F);
	}

	@Override
	public void setupConfig()
	{
		setDriver("0 -5 0 -10 10 0 0");
	}
}
