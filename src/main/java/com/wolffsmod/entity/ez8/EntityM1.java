package com.wolffsmod.entity.ez8;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityM1 extends EntityFlanVehicleNPC
{
    public EntityM1(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.45F);
        setDriver("0 17 0 -360 360 -8 20");
        setRotatedDriverOffset("-12 0 9");
        setPassenger("1 -58 17 14 core -360 360 -89 89 dummygun DummyGun");
        setPassenger("2 -58 17 -14 core -360 360 -89 89");
        addShootPointPrimary("40 20 0 turret");
        addShootPointSecondary("34 20 5 turret");
        addShootParticlesPrimary("largeexplode 3 0 0");
        addShootParticlesPrimary("explode 3 0 0");
        addShootParticlesPrimary("explode 3 0 0");
        addShootParticlesPrimary("explode 3 0 0");
        addShootParticlesPrimary("explode 3 0 0");
        addShootParticlesPrimary("explode 3 0 0");
        addShootParticlesPrimary("explode 3 0 0");
        addShootParticlesPrimary("explode 4 0 0");
        addShootParticlesPrimary("explode 4 0 0");
        addShootParticlesPrimary("explode 4 0 0");
        addShootParticlesPrimary("explode 4 0 0");
        addShootParticlesPrimary("explode 4 0 0");
        addShootParticlesPrimary("explode 4 0 0");
        addShootParticlesPrimary("cloud 3 0 0");
        addShootParticlesPrimary("cloud 3 0 0");
        addShootParticlesPrimary("cloud 3 0 0");
        addShootParticlesPrimary("cloud 3 0 0");
        addShootParticlesPrimary("cloud 3 0 0");
        addShootParticlesPrimary("cloud 3 0 0");
        addShootParticlesPrimary("cloud 4 0 0");
        addShootParticlesPrimary("cloud 4 0 0");
        addShootParticlesPrimary("cloud 4 0 0");
        addShootParticlesPrimary("cloud 4 0 0");
        addShootParticlesPrimary("cloud 4 0 0");
        addShootParticlesPrimary("cloud 4 0 0");
        
    }
}
