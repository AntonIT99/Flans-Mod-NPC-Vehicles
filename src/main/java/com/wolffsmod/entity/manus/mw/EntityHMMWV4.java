package com.wolffsmod.entity.manus.mw;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityHMMWV4 extends EntityFlanVehicleNPC
{
	public EntityHMMWV4(World w)
	{
		super(w);
		setSize(3.5F, 2.5F);
	}

	@Override
	public void setupConfig()
	{
		setDriver("2 1 -9 -80 80 -45 45");
		setPassenger("1 0 15 0 core -50 50 -10 30 M134 M134");
	}
}
