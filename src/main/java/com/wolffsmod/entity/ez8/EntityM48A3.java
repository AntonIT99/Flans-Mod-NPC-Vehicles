package com.wolffsmod.entity.ez8;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityM48A3 extends EntityFlanVehicleNPC
{
    public EntityM48A3(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.4F);
        setDriver("0 27 0 -360 360 -9 19");
        setRotatedDriverOffset("-11 0 9");
        setPassenger("1 -50 19 14 core -360 360 -89 89 dummygun DummyGun");
        setPassenger("2 -50 19 -14 core -360 360 -89 89");
        addShootPointPrimary("26 26 0 turret");
        addShootPointSecondary("26 27 5 turret");
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
