package com.wolffsmod.entity.manus.mw;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityBoxer2 extends EntityFlanVehicleNPC
{
	public EntityBoxer2(World w)
	{
		super(w);
		setSize(3.5F, 2.5F);
	}

	@Override
	public void setupConfig()
	{
		setDriver("42 9 9 -80 80 -45 45");
		setPassenger("1 0 26 0 core -60 60 -15 40 HKGMG HKGMG");
	}
}
