package com.wolffsmod.entity.ez8;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityDzhighit extends EntityFlanVehicleNPC
{
    public EntityDzhighit(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.0F);
        setDriver("0 -1 0 -360 360 0 60");
        setRotatedDriverOffset("0 0 0");
        addShootPointPrimary("15 15 -12 turret");
        addShootPointSecondary("15 15 12 turret");
        addShootParticlesPrimary("explode 0.5 0.2 0");
        addShootParticlesPrimary("explode 0.5 0.2 0");
        addShootParticlesPrimary("explode 0.5 0.2 0");
        addShootParticlesPrimary("explode -2.3 0.2 0");
        addShootParticlesPrimary("flame -2.3 0.2 0");
        addShootParticlesPrimary("explode -2.3 0.2 0");
        addShootParticlesPrimary("flame -2.3 0.2 0");
        addShootParticlesPrimary("cloud 0.5 0.2 0");
        addShootParticlesPrimary("cloud 0.5 0.2 0");
        addShootParticlesPrimary("cloud 0.5 0.2 0");
        addShootParticlesPrimary("snowshovel -2.3 0.2 0");
        addShootParticlesPrimary("snowshovel -2.3 0.2 0");
        addShootParticlesSecondary("explode 0.5 0.2 0");
        addShootParticlesSecondary("explode 0.5 0.2 0");
        addShootParticlesSecondary("explode 0.5 0.2 0");
        addShootParticlesSecondary("explode -2.3 0.2 0");
        addShootParticlesSecondary("flame -2.3 0.2 0");
        addShootParticlesSecondary("explode -2.3 0.2 0");
        addShootParticlesSecondary("flame -2.3 0.2 0");
        addShootParticlesSecondary("cloud 0.5 0.2 0");
        addShootParticlesSecondary("cloud 0.5 0.2 0");
        addShootParticlesSecondary("cloud 0.5 0.2 0");
        addShootParticlesSecondary("snowshovel -2.3 0.2 0");
        addShootParticlesSecondary("snowshovel -2.3 0.2 0");
        setRotateWheels(false);
        setTurretOrigin("0 14 0");
        
    }
}
