package com.wolffsmod.entity.kikkoceccato;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntitySkwI extends EntityFlanVehicleNPC
{
	public EntitySkwI(World w)
	{
		super(w);
		setSize(3.5F, 2.8F);
	}

	@Override
	public void setupConfig()
	{
		setTurnSpeed(0.4F);
		setDriver("-2 9 1");
		setPassenger("1 -16 12 -5 core -360 360 -1 1");
	}
}
