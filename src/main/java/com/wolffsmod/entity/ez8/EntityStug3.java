package com.wolffsmod.entity.ez8;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityStug3 extends EntityFlanVehicleNPC
{
    public EntityStug3(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.45F);
        setDriver("-5 10 6 -6 6 -6 20");
        setRotatedDriverOffset("0 0 0");
        setPassenger("1 -31 15 11 core -360 360 -89 89 dummygun DummyGun");
        setPassenger("2 -31 15 -11 core -360 360 -89 89");
        addShootPointPrimary("66 15 2 turret");
        
        addShootParticlesPrimary("largeexplode 4 0 0");
        addShootParticlesPrimary("explode 4 0 0");
        addShootParticlesPrimary("explode 3 0 1");
        addShootParticlesPrimary("explode 3 0 -1");
        addShootParticlesPrimary("explode 4 0 0");
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
        setTurretOrigin("0 0 0");
        
    }
}
