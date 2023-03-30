package com.wolffsmod.entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.world.World;
public class EntityKubel extends EntityCreature {
	public EntityKubel(World w) {
		super(w);
		this.setSize(3.0F, 2.0F);
	}
}