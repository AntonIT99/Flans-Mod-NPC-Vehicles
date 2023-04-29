package com.wolffsmod.entity.ez8;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityA39Tortoise extends EntityFlanVehicleNPC
{
    public EntityA39Tortoise(World w)
    {
        super(w);
        setSize(3.8F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.4F);
        setDriver("-37 17 -21 -20 20 -10 20");
        setRotatedDriverOffset("0 0 0");
        setPassenger("1 -41 23 21 core -360 360 -10 40 pg_7.7mm_browning Browning");
        setPassenger("2 -72 12 16 core -360 360 -89 89");
        setPassenger("3 -72 12 -16 core -360 360 -89 89");
        addShootPointPrimary("20 20 0 turret");
        
        addGunOrigin("1 -39 13 22");
        addShootParticlesPrimary("largeexplode 4 0 0");
        addShootParticlesPrimary("explode 4 0 0");
        addShootParticlesPrimary("explode 3 0 1");
        addShootParticlesPrimary("explode 3 0 -1");
        addShootParticlesPrimary("explode 4 0 0");
        addShootParticlesPrimary("explode 3 0 1");
        addShootParticlesPrimary("explode 3 0 -1");
        addShootParticlesPrimary("explode 4 0 0");
        addShootParticlesPrimary("explode 3 0 1");
        addShootParticlesPrimary("explode 3 0 -1");
        addShootParticlesPrimary("explode 4 0 0");
        addShootParticlesPrimary("explode 3 0 1");
        addShootParticlesPrimary("explode 3 0 -1");
        addShootParticlesPrimary("explode 4 0 0");
        addShootParticlesPrimary("explode 3 0 1");
        addShootParticlesPrimary("explode 3 0 -1");
        addShootParticlesPrimary("explode 4 0 0");
        addShootParticlesPrimary("explode 3 0 1");
        addShootParticlesPrimary("explode 3 0 -1");
        addShootParticlesPrimary("explode 4 0 0");
        addShootParticlesPrimary("explode 3 0 1");
        addShootParticlesPrimary("explode 3 0 -1");
        addShootParticlesPrimary("explode 4 0 0");
        addShootParticlesPrimary("explode 3 0 1");
        addShootParticlesPrimary("explode 3 0 -1");
        addShootParticlesPrimary("cloud 4 0 0");
        addShootParticlesPrimary("cloud 3 0 1");
        addShootParticlesPrimary("cloud 3 0 -1");
        addShootParticlesPrimary("cloud 4 0 0");
        addShootParticlesPrimary("cloud 3 0 1");
        addShootParticlesPrimary("cloud 3 0 -1");
        addShootParticlesPrimary("cloud 4 0 0");
        addShootParticlesPrimary("cloud 3 0 1");
        addShootParticlesPrimary("cloud 3 0 -1");
        addShootParticlesPrimary("cloud 4 0 0");
        addShootParticlesPrimary("cloud 3 0 1");
        addShootParticlesPrimary("cloud 3 0 -1");
        addShootParticlesPrimary("cloud 4 0 0");
        addShootParticlesPrimary("cloud 3 0 1");
        addShootParticlesPrimary("cloud 3 0 -1");
        addShootParticlesPrimary("cloud 4 0 0");
        addShootParticlesPrimary("cloud 4 0 0");
        addShootParticlesPrimary("cloud 4 0 0");
        
    }
}
