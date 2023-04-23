package com.wolffsmod.entity.manus.mw;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityHMMWV1 extends EntityFlanVehicleNPC
{
	public EntityHMMWV1(World w)
	{
		super(w);
		setSize(3.5F, 2.5F);
	}

	@Override
	public void setupConfig()
	{
		setDriver("2 1 -9 -80 80 -45 45");
	}
}
