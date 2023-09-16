package com.wolffsmod.entity.official.ww2;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityPanzerIV extends EntityFlanVehicleNPC
{
    public EntityPanzerIV(World w)
    {
        super(w);
        setSize(3.5F, 2.8F);
    }
    
    @Override
    public void setupConfig()
    {
        setDriver("0 22 0 -360 360 -10 20");
        setRotatedDriverOffset("-9 0 0");
        setPassenger("1 -32 18 14 core -360 360 -89 89 dummygun DummyGun");
        setPassenger("2 -32 18 -14 core -360 360 -89 89");
        addShootPointPrimary("28 30 -1 turret");
        addShootPointSecondary("28 30 7 turret");
        addShootParticlesPrimary("largeexplode 3 0 0");
        addShootParticlesPrimary("explode 3 0 0");
        addShootParticlesPrimary("explode 2 0 1");
        addShootParticlesPrimary("explode 2 0 -1");
        addShootParticlesPrimary("explode 3 0 0");
        addShootParticlesPrimary("explode 2 0 1");
        addShootParticlesPrimary("explode 2 0 -1");
        addShootParticlesPrimary("explode 3 0 0");
        addShootParticlesPrimary("explode 2 0 1");
        addShootParticlesPrimary("explode 2 0 -1");
        addShootParticlesPrimary("explode 3 0 0");
        addShootParticlesPrimary("explode 2 0 1");
        addShootParticlesPrimary("explode 2 0 -1");
        addShootParticlesPrimary("explode 3 0 0");
        addShootParticlesPrimary("explode 2 0 1");
        addShootParticlesPrimary("explode 2 0 -1");
        addShootParticlesPrimary("explode 3 0 0");
        addShootParticlesPrimary("explode 2 0 1");
        addShootParticlesPrimary("explode 2 0 -1");
        addShootParticlesPrimary("explode 3 0 0");
        addShootParticlesPrimary("explode 2 0 1");
        addShootParticlesPrimary("explode 2 0 -1");
        addShootParticlesPrimary("explode 3 0 0");
        addShootParticlesPrimary("explode 2 0 1");
        addShootParticlesPrimary("explode 2 0 -1");
        addShootParticlesPrimary("cloud 3 0 0");
        addShootParticlesPrimary("cloud 2 0 1");
        addShootParticlesPrimary("cloud 2 0 -1");
        addShootParticlesPrimary("cloud 3 0 0");
        addShootParticlesPrimary("cloud 2 0 1");
        addShootParticlesPrimary("cloud 2 0 -1");
        addShootParticlesPrimary("cloud 3 0 0");
        addShootParticlesPrimary("cloud 2 0 1");
        addShootParticlesPrimary("cloud 2 0 -1");
        addShootParticlesPrimary("cloud 3 0 0");
        addShootParticlesPrimary("cloud 2 0 1");
        addShootParticlesPrimary("cloud 2 0 -1");
        addShootParticlesPrimary("cloud 3 0 0");
        addShootParticlesPrimary("cloud 2 0 1");
        addShootParticlesPrimary("cloud 2 0 -1");
        addShootParticlesPrimary("cloud 3 0 0");
        addShootParticlesPrimary("cloud 3 0 0");
        addShootParticlesPrimary("cloud 3 0 0");
        
    }
}
