package com.wolffsmod.entity.ez8;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityLVTA1 extends EntityFlanVehicleNPC
{
    public EntityLVTA1(World w)
    {
        super(w);
        setSize(3.8F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.4F);
        setDriver("0 26 0 -360 360 -10 20");
        setRotatedDriverOffset("0 0 3");
        setPassenger("1 -32 22 12 core -360 360 -89 89 dummygun DummyGun");
        setPassenger("2 -32 22 -12 core -360 360 -89 89");
        addShootPointPrimary("8 35 0 turret");
        addShootPointSecondary("6 35 3 turret");
        addShootParticlesPrimary("largeexplode 3 0 0");
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
        
    }
}
