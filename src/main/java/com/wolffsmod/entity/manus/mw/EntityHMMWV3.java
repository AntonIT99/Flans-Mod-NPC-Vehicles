package com.wolffsmod.entity.manus.mw;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityHMMWV3 extends EntityFlanVehicleNPC
{
	public EntityHMMWV3(World w)
	{
		super(w);
		setSize(3.5F, 2.5F);
	}

	@Override
	public void setupConfig()
	{
		setDriver("2 1 -9 -80 80 -45 45");
		setPassenger("1 0 15 0 core -50 50 -10 30 BrowningM2HB M2HB");
	}
}
