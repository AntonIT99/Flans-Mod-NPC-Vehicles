package com.wolffsmod.entity.ez8;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityBM21 extends EntityFlanVehicleNPC
{
    public EntityBM21(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.3F);
        setDriver("17 11 -8 -115 115 5 45");
        setPassenger("1 17 11 8 nose -130 130 -89 89 dummygun DummyGun");
        addShootPointPrimary("-38 30 -11 turret");
        addShootPointPrimary("-38 30 -9 turret");
        addShootPointPrimary("-38 30 -6 turret");
        addShootPointPrimary("-38 30 -3 turret");
        addShootPointPrimary("-38 30 -1 turret");
        addShootPointPrimary("-38 30 2 turret");
        addShootPointPrimary("-38 30 4 turret");
        addShootPointPrimary("-38 30 7 turret");
        addShootPointPrimary("-38 30 9 turret");
        addShootPointPrimary("-38 30 12 turret");
        addShootPointPrimary("-38 28 -11 turret");
        addShootPointPrimary("-38 28 -9 turret");
        addShootPointPrimary("-38 28 -6 turret");
        addShootPointPrimary("-38 28 -3 turret");
        addShootPointPrimary("-38 28 -1 turret");
        addShootPointPrimary("-38 28 2 turret");
        addShootPointPrimary("-38 28 4 turret");
        addShootPointPrimary("-38 28 7 turret");
        addShootPointPrimary("-38 28 9 turret");
        addShootPointPrimary("-38 28 12 turret");
        addShootPointPrimary("-38 25 -11 turret");
        addShootPointPrimary("-38 25 -9 turret");
        addShootPointPrimary("-38 25 -6 turret");
        addShootPointPrimary("-38 25 -3 turret");
        addShootPointPrimary("-38 25 -1 turret");
        addShootPointPrimary("-38 25 2 turret");
        addShootPointPrimary("-38 25 4 turret");
        addShootPointPrimary("-38 25 7 turret");
        addShootPointPrimary("-38 25 9 turret");
        addShootPointPrimary("-38 25 12 turret");
        addShootPointPrimary("-38 23 -11 turret");
        addShootPointPrimary("-38 23 -9 turret");
        addShootPointPrimary("-38 23 -6 turret");
        addShootPointPrimary("-38 23 -3 turret");
        addShootPointPrimary("-38 23 -1 turret");
        addShootPointPrimary("-38 23 2 turret");
        addShootPointPrimary("-38 23 4 turret");
        addShootPointPrimary("-38 23 7 turret");
        addShootPointPrimary("-38 23 9 turret");
        addShootPointPrimary("-38 23 12 turret");
        addShootParticlesPrimary("cloud 3 0 0");
        addShootParticlesPrimary("cloud -1 0 0");
        addShootParticlesPrimary("cloud -2 0 0");
        addShootParticlesPrimary("explode 3 0 0");
        addShootParticlesPrimary("explode -1 0 0");
        addShootParticlesPrimary("explode -2 0 0");
        addShootParticlesPrimary("flame -1 0 0");
        setTurretOrigin("-39 13 0");
        
    }
}
