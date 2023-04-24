package com.wolffsmod.entity.wolff;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntitySdKfz251DManned extends EntityFlanVehicleNPC
{
	public EntitySdKfz251DManned(World world)
	{
		super(world);
		setSize(2.6F, 1.8F);
	}

	@Override
	public void setupConfig()
	{
		setTurnSpeed(0.35F);
		setDriver("4 -1 -5 -60 60 -15 25");
		setPassenger("4 -10 12 0 core -60 60 -15 25 maschinengewehr34 MGFront");
		addGunOrigin("4 2 5 0");
	}
}
