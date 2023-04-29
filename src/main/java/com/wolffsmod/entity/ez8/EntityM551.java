package com.wolffsmod.entity.ez8;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityM551 extends EntityFlanVehicleNPC
{
    public EntityM551(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.4F);
        setDriver("0 15 0 -360 360 -10 20");
        setRotatedDriverOffset("-12 0 8");
        setPassenger("1 -34 13 12 core -360 360 -89 89 dummygun DummyGun");
        setPassenger("2 -34 13 -12 core -360 360 -89 89");
        addShootPointPrimary("25 20 0 turret");
        addShootPointSecondary("25 20 -7 turret");
        addShootParticlesPrimary("hugeexplosion 4 0 0");
        addShootParticlesPrimary("largeexplode 2 0 0");
        addShootParticlesPrimary("explode 2 0 0");
        addShootParticlesPrimary("explode 2 0 0");
        addShootParticlesPrimary("explode 2 0 0");
        addShootParticlesPrimary("explode 2 0 0");
        addShootParticlesPrimary("explode 2 0 0");
        addShootParticlesPrimary("explode 2 0 0");
        addShootParticlesPrimary("explode 3 0 0");
        addShootParticlesPrimary("explode 3 0 0");
        addShootParticlesPrimary("explode 3 0 0");
        addShootParticlesPrimary("explode 3 0 0");
        addShootParticlesPrimary("explode 3 0 0");
        addShootParticlesPrimary("explode 3 0 0");
        addShootParticlesPrimary("cloud 2 0 0");
        addShootParticlesPrimary("cloud 2 0 0");
        addShootParticlesPrimary("cloud 2 0 0");
        addShootParticlesPrimary("cloud 2 0 0");
        addShootParticlesPrimary("cloud 2 0 0");
        addShootParticlesPrimary("cloud 2 0 0");
        addShootParticlesPrimary("cloud 3 0 0");
        addShootParticlesPrimary("cloud 3 0 0");
        addShootParticlesPrimary("cloud 3 0 0");
        addShootParticlesPrimary("cloud 3 0 0");
        addShootParticlesPrimary("cloud 3 0 0");
        addShootParticlesPrimary("cloud 3 0 0");
        
    }
}
