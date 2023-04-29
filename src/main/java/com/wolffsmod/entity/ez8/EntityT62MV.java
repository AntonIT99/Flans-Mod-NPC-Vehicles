package com.wolffsmod.entity.ez8;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityT62MV extends EntityFlanVehicleNPC
{
    public EntityT62MV(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.4F);
        setDriver("0 16 0 -360 360 -6 16");
        setRotatedDriverOffset("-8 0 -10");
        setPassenger("1 -40 12 14 core -360 360 -89 89 dummygun DummyGun");
        setPassenger("2 -40 12 -14 core -360 360 -89 89");
        addShootPointPrimary("25 20 0 turret");
        addShootPointSecondary("25 20 7 turret");
        addShootParticlesPrimary("largeexplode 4 0 0");
        addShootParticlesPrimary("explode 4 0 0");
        addShootParticlesPrimary("explode 4 0 0");
        addShootParticlesPrimary("explode 4 0 0");
        addShootParticlesPrimary("explode 4 0 0");
        addShootParticlesPrimary("explode 4 0 0");
        addShootParticlesPrimary("explode 4 0 0");
        addShootParticlesPrimary("explode 5 0 0");
        addShootParticlesPrimary("explode 5 0 0");
        addShootParticlesPrimary("explode 5 0 0");
        addShootParticlesPrimary("explode 5 0 0");
        addShootParticlesPrimary("explode 5 0 0");
        addShootParticlesPrimary("explode 5 0 0");
        addShootParticlesPrimary("cloud 4 0 0");
        addShootParticlesPrimary("cloud 4 0 0");
        addShootParticlesPrimary("cloud 4 0 0");
        addShootParticlesPrimary("cloud 4 0 0");
        addShootParticlesPrimary("cloud 4 0 0");
        addShootParticlesPrimary("cloud 4 0 0");
        addShootParticlesPrimary("cloud 5 0 0");
        addShootParticlesPrimary("cloud 5 0 0");
        addShootParticlesPrimary("cloud 5 0 0");
        addShootParticlesPrimary("cloud 5 0 0");
        addShootParticlesPrimary("cloud 5 0 0");
        addShootParticlesPrimary("cloud 5 0 0");
        
    }
}
