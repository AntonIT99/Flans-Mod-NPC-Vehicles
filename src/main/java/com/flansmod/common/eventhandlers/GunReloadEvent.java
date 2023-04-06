package com.flansmod.common.eventhandlers;

import cpw.mods.fml.common.eventhandler.Cancelable;
import cpw.mods.fml.common.eventhandler.Event;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;

@Cancelable
public class GunReloadEvent extends Event {
	
	private Entity entity;
	private ItemStack gun;
	private boolean needsAmmo = true;
	
	public GunReloadEvent(Entity entity, ItemStack gunStack) {
		this.entity = entity;
		gun = gunStack;
	}
	
	
	public Entity getEntity() {
		return entity;
	}
	
	public ItemStack getGun() {
		return gun;
	}
	
	public boolean isNeedsAmmo() {
		return needsAmmo;
	}
	
	public void setNeedsAmmo(boolean needsAmmo) {
		this.needsAmmo = needsAmmo;
	}
	
}
