package com.wolffsmod.entity;

import net.minecraft.world.World;

public class EntityM1Abrams extends EntityFlanVehicleNPC
{

	public float wheelsAngle;

	public EntityM1Abrams(World w) {
		super(w);
		setSize(5F, 3.0F);
	}
	
	@Override
	public void onUpdate()
    {
		wheelsAngle += 100.F / 7F;
    }

}