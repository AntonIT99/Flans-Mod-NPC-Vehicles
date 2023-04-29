package com.wolffsmod.entity.wolff;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityPanzerIVJ extends EntityFlanVehicleNPC
{
	public EntityPanzerIVJ(World world)
	{
		super(world);
		setSize(3.5F, 2.8F);
	}

	@Override
	public void setupConfig()
	{
		setTurnSpeed(0.35F);
		setDriver("0 28 0 -360 360 -10 20");
		setRotatedDriverOffset("-13 0 0");
		setPassenger("2 31 8 9 core -40 40 -20 30 maschinengewehr34 FrontMG");
		addShootPointSecondary("30 27.5 6 turret maschinengewehr34");
		addShootPointSecondary("19 44.5 0 turret maschinengewehr42");
		addBarrelPosition("20 34 0");
		addGunOrigin("2 44 20 10");
	}
}
