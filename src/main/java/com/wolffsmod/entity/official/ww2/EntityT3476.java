package com.wolffsmod.entity.official.ww2;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityT3476 extends EntityFlanVehicleNPC
{

	public EntityT3476(World w) {
		super(w);
		this.setSize(3.5F, 2.5F);
	}

	@Override
	public void setupConfig()
	{
		setTurnSpeed(0.3F);
		//TODO: add driver and barrel position

	}
}
