package com.wolffsmod.entity;
import net.minecraft.entity.EntityCreature;
import net.minecraft.world.World;
public class EntityJeep extends EntityCreature {
	public EntityJeep(World w) {
		super(w);
		this.setSize(3.0F, 2.5F);
	}
}