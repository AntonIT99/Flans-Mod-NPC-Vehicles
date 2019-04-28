package com.wolffsmod.entity;

import net.minecraft.entity.EntityCreature;
import net.minecraft.world.World;

public class EntityPanzerIV extends EntityCreature {

	public float wheelsAngle;

	public EntityPanzerIV(World p_i1602_1_) {
		super(p_i1602_1_);
		// TODO Auto-generated constructor stub
		this.setSize(3.5F, 2.8F);
	}
	
	@Override
	public void onUpdate()
    {
		if(this.motionX!=0 || this.motionZ!=0) wheelsAngle += 15F;
    }

}
