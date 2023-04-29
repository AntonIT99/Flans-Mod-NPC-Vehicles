package com.wolffsmod.entity.official.ww2;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityT3476 extends EntityFlanVehicleNPC
{

	public EntityT3476(World w) {
		super(w);
		setSize(3.5F, 2.5F);
	}

	@Override
	public void setupConfig()
	{
		setTurnSpeed(0.55F);
		setDriver("0 28 0 -360 360 -6 17");
		setRotatedDriverOffset("-5 0 -2");
		addBarrelPosition("0 30 0");
		addGun("8 34 8 turret dp28");

	}
}
