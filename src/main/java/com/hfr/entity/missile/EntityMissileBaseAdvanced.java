package com.hfr.entity.missile;

import java.util.ArrayList;
import java.util.List;

import com.hfr.entity.IChunkLoader;
import com.hfr.entity.IEmpable;
import com.hfr.main.MainRegistry;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.world.ChunkCoordIntPair;
import net.minecraft.world.World;
import net.minecraftforge.common.ForgeChunkManager;
import net.minecraftforge.common.ForgeChunkManager.Ticket;
import net.minecraftforge.common.ForgeChunkManager.Type;

public abstract class EntityMissileBaseAdvanced extends Entity implements IChunkLoader, IEmpable {
	
	int startX;
	int startZ;
	int targetX;
	int targetZ;
	public int velocity;
	double decelY;
	double accelXZ;
	boolean isCluster = false;
    private Ticket loaderTicket;
    public float health = MainRegistry.mHealth;

	public EntityMissileBaseAdvanced(World p_i1582_1_) {
		super(p_i1582_1_);
		this.ignoreFrustumCheck = true;
		startX = (int) posX;
		startZ = (int) posZ;
		targetX = (int) posX;
		targetZ = (int) posZ;
	}
	
    public boolean canBeCollidedWith()
    {
        return true;
    }
    
    public boolean attackEntityFrom(DamageSource p_70097_1_, float p_70097_2_)
    {
        if (this.isEntityInvulnerable())
        {
            return false;
        }
        else
        {
            if (!this.isDead && !this.worldObj.isRemote)
            {
            	health -= p_70097_2_;
            	
                if (this.health <= 0)
                {
                    this.setDead();
                    this.killMissile();
                }
            }

            return true;
        }
    }
    
    private void killMissile() {
        //ExplosionLarge.explode(worldObj, posX, posY, posZ, 5, true, false, true);
    	worldObj.newExplosion(this, posX, posY, posZ, 5F, true, false);
    }

	public EntityMissileBaseAdvanced(World world, float x, float y, float z, int a, int b) {
		super(world);
		this.ignoreFrustumCheck = true;
		/*this.posX = x;
		this.posY = y;
		this.posZ = z;*/
		this.setLocationAndAngles(x, y, z, 0, 0);
		startX = (int) x;
		startZ = (int) z;
		targetX = a;
		targetZ = b;
		this.motionY = 2;
		
        Vec3 vector = Vec3.createVectorHelper(targetX - startX, 0, targetZ - startZ);
		accelXZ = decelY = 1/vector.lengthVector();
		decelY *= 2;
		
		velocity = 1;

        this.setSize(1.5F, 1.5F);
	}

	@Override
	protected void entityInit() {
		init(ForgeChunkManager.requestTicket(MainRegistry.instance, worldObj, Type.ENTITY));
        this.dataWatcher.addObject(8, Float.valueOf(this.health));
	}

	@Override
	protected void readEntityFromNBT(NBTTagCompound nbt) {
		motionX = nbt.getDouble("moX");
		motionY = nbt.getDouble("moY");
		motionZ = nbt.getDouble("moZ");
		posX = nbt.getDouble("poX");
		posY = nbt.getDouble("poY");
		posZ = nbt.getDouble("poZ");
		decelY = nbt.getDouble("decel");
		accelXZ = nbt.getDouble("accel");
		targetX = nbt.getInteger("tX");
		targetZ = nbt.getInteger("tZ");
		startX = nbt.getInteger("sX");
		startZ = nbt.getInteger("sZ");
		velocity = nbt.getInteger("veloc");
	}

	@Override
	protected void writeEntityToNBT(NBTTagCompound nbt) {
		nbt.setDouble("moX", motionX);
		nbt.setDouble("moY", motionY);
		nbt.setDouble("moZ", motionZ);
		nbt.setDouble("poX", posX);
		nbt.setDouble("poY", posY);
		nbt.setDouble("poZ", posZ);
		nbt.setDouble("decel", decelY);
		nbt.setDouble("accel", accelXZ);
		nbt.setInteger("tX", targetX);
		nbt.setInteger("tZ", targetZ);
		nbt.setInteger("sX", startX);
		nbt.setInteger("sZ", startZ);
		nbt.setInteger("veloc", velocity);
	}
	
	protected void rotation() {
        float f2 = MathHelper.sqrt_double(this.motionX * this.motionX + this.motionZ * this.motionZ);
        this.rotationYaw = (float)(Math.atan2(this.motionX, this.motionZ) * 180.0D / Math.PI);

        for (this.rotationPitch = (float)(Math.atan2(this.motionY, f2) * 180.0D / Math.PI) - 90; this.rotationPitch - this.prevRotationPitch < -180.0F; this.prevRotationPitch -= 360.0F)
        {
            ;
        }

        while (this.rotationPitch - this.prevRotationPitch >= 180.0F)
        {
            this.prevRotationPitch += 360.0F;
        }

        while (this.rotationYaw - this.prevRotationYaw < -180.0F)
        {
            this.prevRotationYaw -= 360.0F;
        }

        while (this.rotationYaw - this.prevRotationYaw >= 180.0F)
        {
            this.prevRotationYaw += 360.0F;
        }
	}
	
	@Override
    public void onUpdate()
    {
		//super.onUpdate();
		
		/*if(!worldObj.isRemote) {
			TileEntityMachineRadar.allMissiles.remove(this);
			TileEntityMachineRadar.allMissiles.add(this);
		}*/
		
		//if(!worldObj.loadedEntityList.contains(this))
		//	worldObj.loadedEntityList.add(this);
		
		//System.out.println(this.posX + " " + this.posY + " " + this.posZ);
		
		
		
		if(velocity < 1)
			velocity = 1;
		if(this.ticksExisted > 40)
			velocity = 3;
		else if(this.ticksExisted > 20)
			velocity = 2;
		
        this.dataWatcher.updateObject(8, Float.valueOf(this.health));
        
        this.prevPosX = this.posX;
        this.prevPosY = this.posY;
        this.prevPosZ = this.posZ;
		
		for(int i = 0; i < velocity; i++) {
	        //this.posX += this.motionX;
	        //this.posY += this.motionY;
	        //this.posZ += this.motionZ;
			this.setLocationAndAngles(posX + this.motionX, posY + this.motionY, posZ + this.motionZ, 0, 0);
	        
	        this.rotation();
	        
	        this.motionY -= decelY;
	        
	        Vec3 vector = Vec3.createVectorHelper(targetX - startX, 0, targetZ - startZ);
	        vector = vector.normalize();
	        vector.xCoord *= accelXZ;
	        vector.zCoord *= accelXZ;
	        
	        if(motionY > 0) {
	        	motionX += vector.xCoord;
	        	motionZ += vector.zCoord;
	        }
	        
	        if(motionY < 0) {
	        	motionX -= vector.xCoord;
	        	motionZ -= vector.zCoord;
	        }
	
			if(this.worldObj.isRemote && trailing()) {
				//PacketDispatcher.wrapper.sendToAllAround(new ParticleControlPacket(posX, posY, posZ, 0), new TargetPoint(this.dimension, posX, posY, posZ, 500));
				//Minecraft.getMinecraft().effectRenderer.addEffect(new EntitySmokeFX(this.worldObj, this.posX, this.posY, this.posZ, 0.0, 0.0, 0.0));
	            //this.worldObj.spawnParticle("largeexplode", this.posX, this.posY, this.posZ, 1.0D, 0.0D, 0.0D);
				
				//EntityLargeExplodeFX effect = new EntityLargeExplodeFX(Minecraft.getMinecraft().getTextureManager(), worldObj, posX, posY, posZ, 0.0, 0.0, 0.0);
				//Minecraft.getMinecraft().effectRenderer.addEffect(effect);
				
				MainRegistry.proxy.howDoIUseTheZOMG(worldObj, posX, posY, posZ, 0);
			}
	        
	        if(this.worldObj.getBlock((int)this.posX, (int)this.posY, (int)this.posZ) != Blocks.air && 
        			this.worldObj.getBlock((int)this.posX, (int)this.posY, (int)this.posZ) != Blocks.water && 
        			this.worldObj.getBlock((int)this.posX, (int)this.posY, (int)this.posZ) != Blocks.flowing_water) {
        	
    			if(!this.worldObj.isRemote)
    			{
    				onImpact();
    			}
    			this.setDead();
    			return;
        	}
        
        	if(motionY < -1 && this.isCluster && !worldObj.isRemote) {
        		cluster();
    			this.setDead();
    			return;
        	}
        	
        	if(!worldObj.isRemote) {
        		loadNeighboringChunks((int)(posX / 16), (int)(posZ / 16));
        	}
		}
		
		if(!worldObj.isRemote) {
			Vec3 movement = Vec3.createVectorHelper(motionX, motionY, motionZ);
			
			if(movement.lengthVector() < 0.1)
				this.setDead();
		}
    }
	
    @Override
	@SideOnly(Side.CLIENT)
    public boolean isInRangeToRenderDist(double distance)
    {
        return distance < 500000;
    }

	public abstract void onImpact();

	public abstract int getMissileType();
	
	public void cluster() { }
	
	protected boolean trailing() {
		return true;
	}
	
	public void init(Ticket ticket) {
		if(!worldObj.isRemote) {
			
            if(ticket != null) {
            	
                if(loaderTicket == null) {
                	
                	loaderTicket = ticket;
                	loaderTicket.bindEntity(this);
                	loaderTicket.getModData();
                }

                ForgeChunkManager.forceChunk(loaderTicket, new ChunkCoordIntPair(chunkCoordX, chunkCoordZ));
            }
        }
	}

	List<ChunkCoordIntPair> loadedChunks = new ArrayList<ChunkCoordIntPair>();

    public void loadNeighboringChunks(int newChunkX, int newChunkZ)
    {
        if(!worldObj.isRemote && loaderTicket != null)
        {
            for(ChunkCoordIntPair chunk : loadedChunks)
            {
                ForgeChunkManager.unforceChunk(loaderTicket, chunk);
            }

            loadedChunks.clear();
            loadedChunks.add(new ChunkCoordIntPair(newChunkX, newChunkZ));
            loadedChunks.add(new ChunkCoordIntPair(newChunkX + 1, newChunkZ + 1));
            loadedChunks.add(new ChunkCoordIntPair(newChunkX - 1, newChunkZ - 1));
            loadedChunks.add(new ChunkCoordIntPair(newChunkX + 1, newChunkZ - 1));
            loadedChunks.add(new ChunkCoordIntPair(newChunkX - 1, newChunkZ + 1));
            loadedChunks.add(new ChunkCoordIntPair(newChunkX + 1, newChunkZ));
            loadedChunks.add(new ChunkCoordIntPair(newChunkX, newChunkZ + 1));
            loadedChunks.add(new ChunkCoordIntPair(newChunkX - 1, newChunkZ));
            loadedChunks.add(new ChunkCoordIntPair(newChunkX, newChunkZ - 1));

            for(ChunkCoordIntPair chunk : loadedChunks)
            {
                ForgeChunkManager.forceChunk(loaderTicket, chunk);
            }
        }
    }
    
    @Override
    public void pulse() {
    	
    	this.motionX += rand.nextGaussian() * 0.1;
    	this.motionZ += rand.nextGaussian() * 0.1;
    }
}
