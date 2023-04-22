package com.wolffsmod.entity.kikkoceccato;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityPanzerI  extends EntityFlanVehicleNPC
{
	public EntityPanzerI(World w)
	{
		super(w);
		setSize(2.4F, 1.8F);
	}

	@Override
	public void setupConfig()
	{
		setTurnSpeed(0.4F);
		setDriver("0 8 0 -360 360 -30 30");
		addShootPointPrimary("-17.5 17.6 4.2 turret mg13");
		addShootPointPrimary("-17.5 17.6 -4.2 turret mg13");
	}
}