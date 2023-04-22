package com.wolffsmod.entity.wolff;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntitySdKfz251D extends EntityFlanVehicleNPC
{
	public EntitySdKfz251D(World world)
	{
		super(world);
		setSize(2.6F, 1.8F);
	}

	@Override
	public void setupConfig()
	{
		setTurnSpeed(0.35F);
		setDriver("4 -1 -5");
		setPassenger("1 4 -1 -5 core");
		setPassenger("2 -21 -2 -6 core");
		setPassenger("3 -21 -2 6 core");
		setPassenger("4 -10 12 0 core -60 60 -15 25 maschinengewehr34 MGFront");
		setPassenger("5 -32 12 0 core 135 225 -10 40 maschinengewehr34 MGRear");
		addGunOrigin("4 2 5 0");
		addGunOrigin("5 -43 6 0");

	}
}
