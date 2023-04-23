package com.wolffsmod.entity.manus.mw;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityBoxer5 extends EntityFlanVehicleNPC
{
	public EntityBoxer5(World w)
	{
		super(w);
		setSize(3.5F, 2.5F);
	}

	@Override
	public void setupConfig()
	{
		setDriver("42 9 9 -360 360 -10 20");
		addBarrelPosition("0 44 0");
	}
}
