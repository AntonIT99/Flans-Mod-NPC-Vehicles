package com.wolffsmod.entity.ez8;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityT64A extends EntityFlanVehicleNPC
{
    public EntityT64A(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.4F);
        setDriver("-6 10 0 -360 360 -5 16");
        setRotatedDriverOffset("-2 0 8");
        setPassenger("1 -40 10 12 core -360 360 -89 89 dummygun DummyGun");
        setPassenger("2 -40 10 -12 core -360 360 -89 89");
        addShootPointPrimary("15 17 0 turret");
        addShootPointSecondary("15 15 4 turret");
        addShootParticlesPrimary("largeexplode 6 0 0");
        addShootParticlesPrimary("explode 6 0 0");
        addShootParticlesPrimary("explode 6 0 0");
        addShootParticlesPrimary("explode 6 0 0");
        addShootParticlesPrimary("explode 6 0 0");
        addShootParticlesPrimary("explode 6 0 0");
        addShootParticlesPrimary("explode 6 0 0");
        addShootParticlesPrimary("explode 7 0 0");
        addShootParticlesPrimary("explode 7 0 0");
        addShootParticlesPrimary("explode 7 0 0");
        addShootParticlesPrimary("explode 7 0 0");
        addShootParticlesPrimary("explode 7 0 0");
        addShootParticlesPrimary("explode 7 0 0");
        addShootParticlesPrimary("cloud 6 0 0");
        addShootParticlesPrimary("cloud 6 0 0");
        addShootParticlesPrimary("cloud 6 0 0");
        addShootParticlesPrimary("cloud 6 0 0");
        addShootParticlesPrimary("cloud 6 0 0");
        addShootParticlesPrimary("cloud 6 0 0");
        addShootParticlesPrimary("cloud 7 0 0");
        addShootParticlesPrimary("cloud 7 0 0");
        addShootParticlesPrimary("cloud 7 0 0");
        addShootParticlesPrimary("cloud 7 0 0");
        addShootParticlesPrimary("cloud 7 0 0");
        addShootParticlesPrimary("cloud 7 0 0");
        setTurretOrigin("-6 0 0");
        
    }
}
