package com.wolffsmod.entity.ez8;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityBMP1 extends EntityFlanVehicleNPC
{
    public EntityBMP1(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.45F);
        setDriver("6 9 0 -360 360 -4 20");
        setPassenger("1 -10 5 -6 core -360 360 -89 89 dummygun DummyGun");
        setPassenger("2 -10 5 6 core -360 360 -89 89");
        setPassenger("3 -22 5 -6 core -360 360 -89 89");
        setPassenger("4 -22 5 6 core -360 360 -89 89");
        setPassenger("5 -34 5 -6 core -360 360 -89 89");
        setPassenger("6 -34 5 6 core -360 360 -89 89");
        addShootPointPrimary("28 22 0 turret");
        addShootPointSecondary("24 22 2 turret");
        addShootParticlesPrimary("largeexplode 1 0 0");
        addShootParticlesPrimary("explode 1 0 0");
        addShootParticlesPrimary("explode 1 0 0");
        addShootParticlesPrimary("explode 1 0 0");
        addShootParticlesPrimary("explode 1 0 0");
        addShootParticlesPrimary("explode 1 0 0");
        addShootParticlesPrimary("explode 1 0 0");
        addShootParticlesPrimary("explode 2 0 0");
        addShootParticlesPrimary("explode 2 0 0");
        addShootParticlesPrimary("explode 2 0 0");
        addShootParticlesPrimary("explode 2 0 0");
        addShootParticlesPrimary("explode 2 0 0");
        addShootParticlesPrimary("explode 2 0 0");
        addShootParticlesPrimary("cloud 1 0 0");
        addShootParticlesPrimary("cloud 1 0 0");
        addShootParticlesPrimary("cloud 1 0 0");
        addShootParticlesPrimary("cloud 1 0 0");
        addShootParticlesPrimary("cloud 1 0 0");
        addShootParticlesPrimary("cloud 1 0 0");
        addShootParticlesPrimary("cloud 2 0 0");
        addShootParticlesPrimary("cloud 2 0 0");
        addShootParticlesPrimary("cloud 2 0 0");
        addShootParticlesPrimary("cloud 2 0 0");
        addShootParticlesPrimary("cloud 2 0 0");
        addShootParticlesPrimary("cloud 2 0 0");
        setTurretOrigin("6 16 0");
        
    }
}
