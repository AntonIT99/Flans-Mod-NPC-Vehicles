package com.wolffsmod.entity.manus.mw;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityBoxer3 extends EntityFlanVehicleNPC
{
	public EntityBoxer3(World w)
	{
		super(w);
		setSize(3.5F, 2.5F);
	}

	@Override
	public void setupConfig()
	{
		setDriver("42 9 9 -80 80 -45 45");
		setPassenger("1 0 26 0 core -60 60 -15 40 BrowningM2HB M2HB");
	}
}
