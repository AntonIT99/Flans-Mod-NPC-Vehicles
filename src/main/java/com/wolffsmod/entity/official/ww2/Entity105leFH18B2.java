package com.wolffsmod.entity.official.ww2;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class Entity105leFH18B2 extends EntityFlanVehicleNPC
{
	public Entity105leFH18B2(World w)
	{
		super(w);
		this.setSize(3.0F, 3.0F);
	}

	@Override
	public void setupConfig()
	{
		setTurnSpeed(0.5F);
		//TODO: find driver position and barrel position
	}
}
