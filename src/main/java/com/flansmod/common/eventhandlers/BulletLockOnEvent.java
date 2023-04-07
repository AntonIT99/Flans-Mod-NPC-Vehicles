package com.flansmod.common.eventhandlers;

import com.flansmod.common.guns.EntityBullet;

import cpw.mods.fml.common.eventhandler.Cancelable;
import cpw.mods.fml.common.eventhandler.Event;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;

@Cancelable
public class BulletLockOnEvent extends Event {
	
	private EntityBullet bullet;
	private Entity lockedOnTo;
	
	public BulletLockOnEvent(EntityBullet bullet, Entity lockedOnTo) {
		this.bullet = bullet;
		this.lockedOnTo = lockedOnTo;
	}
	
	
	public EntityBullet getBullet() {
		return bullet;
	}
	
	public Entity getLockedOnTo() {
		return lockedOnTo;
	}
	
	public void setLockedOnTo(Entity lockedOnTo) {
		this.lockedOnTo = lockedOnTo;
	}
	
}
