package com.flansmod.common.eventhandlers;

import com.flansmod.common.guns.EntityGrenade;

import cpw.mods.fml.common.eventhandler.Cancelable;
import cpw.mods.fml.common.eventhandler.Event;
import net.minecraft.entity.Entity;

@Cancelable
public class GrenadeProximityEvent extends Event {
	
	private EntityGrenade grenade;
	private Entity trigger;
	
	public GrenadeProximityEvent(EntityGrenade grenade, Entity trigger) {
		this.grenade = grenade;
		this.trigger = trigger;
	}
	
	public EntityGrenade getGrenade() {
		return grenade;
	}
	
	public Entity getTrigger() {
		return trigger;
	}
	
}
