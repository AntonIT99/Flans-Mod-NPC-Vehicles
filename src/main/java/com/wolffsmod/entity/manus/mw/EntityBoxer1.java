package com.wolffsmod.entity.manus.mw;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityBoxer1 extends EntityFlanVehicleNPC
{
	public EntityBoxer1(World w)
	{
		super(w);
		setSize(3.5F, 2.5F);
	}

	@Override
	public void setupConfig()
	{
		setDriver("42 9 9 -80 80 -45 45");
	}
}
