package com.wolffsmod.entity.official.ww2;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class Entity105leFH18B2 extends EntityFlanVehicleNPC
{
	public Entity105leFH18B2(World w)
	{
		super(w);
		setSize(3.0F, 3.0F);
	}

	@Override
	public void setupConfig()
	{
		setTurnSpeed(0.5F);
		//TODO: check driver position and barrel position
		setDriver("0 28 0 -30 30 -4 45");
		setRotatedDriverOffset("-6 2 -5");
		addBarrelPosition("0 34 0");
	}
}
