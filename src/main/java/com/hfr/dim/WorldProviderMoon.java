package com.hfr.dim;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.Entity;
import net.minecraft.util.Vec3;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.*;
import net.minecraft.world.chunk.Chunk;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraftforge.client.IRenderHandler;

public class WorldProviderMoon extends WorldProvider {
	
	public void registerWorldChunkManager() {
		
		this.worldChunkMgr = new WorldChunkManagerHell(new BiomeGenMoon(111), dimensionId);
		this.dimensionId = 15;
		this.hasNoSky = false;
	}

	@Override
	public String getDimensionName() {
		return "Moon";
	}
	
    public IChunkProvider createChunkGenerator()
    {
        return new ChunkProviderMoon(this.worldObj, this.getSeed(), false);
    }
    
	public void renderClouds() {
	}
    
    @SideOnly(Side.CLIENT)
    public Vec3 getFogColor(float x, float y) {
      return Vec3.createVectorHelper(0.0D, 0.0D, 0.0D);
    }
    
    public Vec3 getSkyColor(Entity camera, float partialTicks) {
      return Vec3.createVectorHelper(0.0D, 0.0D, 0.0D);
    }
    
    @SideOnly(Side.CLIENT)
    public float[] calcSunriseSunsetColors(float p_76560_1_, float p_76560_2_) {
    	return null;
    }

    public boolean canDoLightning(Chunk chunk)
    {
        return false;
    }

    public boolean canDoRainSnowIce(Chunk chunk)
    {
        return false;
    }
    
    public boolean canRespawnHere()
    {
        return false;
    }
    
    @SideOnly(Side.CLIENT)
    public float getCloudHeight()
    {
		return -100;
	}

	@SideOnly(Side.CLIENT)
	public IRenderHandler getSkyRenderer() {
		return new SkyProviderMoon();
	}
}
