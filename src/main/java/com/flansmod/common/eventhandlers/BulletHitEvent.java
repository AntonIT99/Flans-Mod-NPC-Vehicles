package com.flansmod.common.eventhandlers;

import com.flansmod.client.debug.EntityDebugDot;
import com.flansmod.common.FlansMod;
import com.flansmod.common.guns.EntityBullet;
import com.flansmod.common.guns.EntityShootable;
import com.flansmod.common.guns.raytracing.BlockHit;
import com.flansmod.common.guns.raytracing.BulletHit;
import com.flansmod.common.guns.raytracing.DriveableHit;
import com.flansmod.common.guns.raytracing.EntityHit;
import com.flansmod.common.guns.raytracing.PlayerBulletHit;
import com.flansmod.common.vector.Vector3f;

import cpw.mods.fml.common.eventhandler.Cancelable;
import cpw.mods.fml.common.eventhandler.Event;
import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;

@Cancelable
public class BulletHitEvent extends Event {
	
	private EntityBullet bullet;
	private BulletHit hit;
	private Entity entity;
	private Block block;
	
	private boolean allowBlockDestruction = true;
	
	
	public BulletHitEvent(EntityBullet bullet, BulletHit hit) {
		this.bullet = bullet;
		this.hit = hit;
		
		//Try to set the entity field
		if(hit instanceof DriveableHit) {
			entity = ((DriveableHit)hit).driveable;
		} else if(hit instanceof PlayerBulletHit) {
			entity = ((PlayerBulletHit)hit).hitbox.player;
		} else if(hit instanceof EntityHit) {
			entity = ((EntityHit)hit).entity;
		}
		
		//Try to set the block field
		if(hit instanceof BlockHit) {
            MovingObjectPosition raytraceResult = ((BlockHit)hit).raytraceResult; 
           	block = bullet.worldObj.getBlock(raytraceResult.blockX, raytraceResult.blockY, raytraceResult.blockZ);
		}
		
	}
	
	public EntityBullet getBullet() {
		return bullet;
	}
	
	public BulletHit getHit() {
		return hit;
	}
	
	public boolean hitEntity() {
		return entity != null;
	}
	
	/**
	 * Returns null if the the bullet didn't hit an entity
	 */
	public Entity getHitEntity() {
		return entity;
	}
	
	/**
	 * Returns null if the the bullet didn't hit a block
	 */
	public Block getHitBlock() {
		return block;
	}
	
	public boolean isAllowBlockDestruction() {
		return allowBlockDestruction;
	}
	
	public void setAllowBlockDestruction(boolean allowBlockDestruction) {
		this.allowBlockDestruction = allowBlockDestruction;
	}
	
}
