package com.wolffsmod.entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.world.World;
public class EntitySentryGun extends EntityCreature
{
	public EntitySentryGun(World w)
	{
		super(w);
		this.setSize(1.0F, 1.8F);
	}
}