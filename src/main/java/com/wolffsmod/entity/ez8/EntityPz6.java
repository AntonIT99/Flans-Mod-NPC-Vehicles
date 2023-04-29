package com.wolffsmod.entity.ez8;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityPz6 extends EntityFlanVehicleNPC
{
    public EntityPz6(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.35F);
        setDriver("0 22 0 -360 360 -8 16");
        setRotatedDriverOffset("-6 3 -9");
        setDriverAimSpeed("0.57 0.47");
        setPassenger("1 -34 18 14 core -360 360 -89 89 dummygun DummyGun");
        setPassenger("2 -34 18 -14 core -360 360 -89 89");
        addShootPointPrimary("36 26 0 turret");
        addShootPointSecondary("24 26 8 turret");
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
