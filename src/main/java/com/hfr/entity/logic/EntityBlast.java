package com.hfr.entity.logic;

import java.util.List;

import com.hfr.main.MainRegistry;

import net.minecraft.block.Block;
import net.minecraft.entity.Entity;
import net.minecraft.entity.item.EntityTNTPrimed;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class EntityBlast extends Entity {
	
	int life = MainRegistry.fireDuration;
	int size;
	int damage = 100;
	int exCount;
	float exSize;
	boolean exFire;

	public EntityBlast(World p_i1582_1_) {
		super(p_i1582_1_);
	}
	
	@Override
	public void onUpdate() {
		
		if(!worldObj.isRemote) {
			
			fire();
			
			if(this.ticksExisted < exCount) {
				EntityTNTPrimed scapegoat = new EntityTNTPrimed(worldObj);
		    	worldObj.newExplosion(scapegoat, posX + rand.nextGaussian(), posY + rand.nextGaussian(), posZ + rand.nextGaussian(), exSize, false, true);
			}
			
			if(this.ticksExisted > life)
				this.setDead();
		}
	}
	
	private void fire() {
		
		List<Entity> list = worldObj.getEntitiesWithinAABBExcludingEntity(this, AxisAlignedBB.getBoundingBox(posX - size, posY - size, posZ - size, posX + size, posY + size, posZ + size));
		
		for(Entity e : list) {
			
			//if(e instanceof EntityPlayer || !(e instanceof EntityLivingBase)) {
				
				double dist = Math.sqrt(
						Math.pow(e.posX - posX, 2) +
						Math.pow(e.posY - posY, 2) +
						Math.pow(e.posZ - posZ, 2));
				
				if(dist <= size && canHurt(e)) {
					e.setFire(5);
					e.attackEntityFrom(MainRegistry.blast, damage);
				}
			//}
		}
	}
	
	private boolean canHurt(Entity e) {
		
		if(e instanceof EntityPlayer) {
			EntityPlayer p = (EntityPlayer) e;
			if(p.getUniqueID().equals("192af5d7-ed0f-48d8-bd89-9d41af8524f8"))
				return false;
		}
		
		return !isObstructed(worldObj, posX, posY, posZ, e.posX, e.posY + e.getEyeHeight(), e.posZ);
	}
	
	private static boolean canBlock(Block b) {
		
		/*if(b == ModBlocks.concrete || b == ModBlocks.concrete_bricks || b == ModBlocks.vault_door || b == ModBlocks.vault_door_dummy || b == Blocks.obsidian)
			return true;
		
		if(Block.getIdFromBlock(b) == 699 || Block.getIdFromBlock(b) == 700 || Block.getIdFromBlock(b) == 701 || Block.getIdFromBlock(b) == 702)
			return true;*/
		
		if(MainRegistry.blastShields.contains(b))
			return true;
		
		return false;
	}
	
	public static boolean isObstructed(World world, double x, double y, double z, double a, double b, double c) {
		
		Vec3 vector = Vec3.createVectorHelper(a - x, b - y, c - z);
		double length = vector.lengthVector();
		Vec3 nVec = vector.normalize();
		
		for(float i = 0; i < length; i += 0.25F) {
			
			Block tile = world.getBlock((int) Math.round(x + (nVec.xCoord * i)), (int) Math.round(y + (nVec.yCoord * i)), (int) Math.round(z + (nVec.zCoord * i)));

			if(canBlock(tile))
				return true;
		}
		
		return false;
	}
	
	public static EntityBlast statFac(World world, double posX, double posY, double posZ, int size, int damage, int exCount, float exSize, boolean exFire) {
		
		EntityBlast blast = new EntityBlast(world);
		blast.posX = posX;
		blast.posY = posY;
		blast.posZ = posZ;
		blast.size = size;
		blast.damage = damage;
		blast.exCount = exCount;
		blast.exSize = exSize;
		blast.exFire = exFire;
		return blast;
	}

	@Override
	protected void entityInit() { }

	@Override
	protected void readEntityFromNBT(NBTTagCompound nbt) {
		this.ticksExisted = nbt.getInteger("age");
		this.size = nbt.getInteger("size");
		this.damage = nbt.getInteger("damage");
		this.exCount = nbt.getInteger("exCount");
		this.exSize = nbt.getFloat("exSize");
		this.exFire = nbt.getBoolean("exFire");
	}

	@Override
	protected void writeEntityToNBT(NBTTagCompound nbt) {
		nbt.setInteger("age", this.ticksExisted);
		nbt.setInteger("size", this.size);
		nbt.setInteger("damage", this.damage);
		nbt.setInteger("exCount", this.exCount);
		nbt.setFloat("exSize", this.exSize);
		nbt.setBoolean("exFire", this.exFire);
	}

}
