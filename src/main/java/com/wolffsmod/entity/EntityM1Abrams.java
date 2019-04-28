package com.wolffsmod.entity;

import net.minecraft.entity.EntityCreature;
import net.minecraft.world.World;

public class EntityM1Abrams extends EntityCreature {

	public float wheelsAngle;

	public EntityM1Abrams(World w) {
		super(w);
		this.setSize(5F, 3.0F);
	}
	
	@Override
	public void onUpdate()
    {
		wheelsAngle += 100.F / 7F;
    }

}