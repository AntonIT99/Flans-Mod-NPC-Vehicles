package com.wolffsmod.entity.ez8;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityPz8 extends EntityFlanVehicleNPC
{
    public EntityPz8(World w)
    {
        super(w);
        setSize(3.7F, 3.6F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.2F);
        setDriver("0 34 0 -360 360 -7 23");
        setRotatedDriverOffset("-4 0 8");
        setDriverAimSpeed("0.35 0.25 0");
        addShootPointPrimary("54 34 0 turret");
        addShootPointSecondary("50 33 7 turret");
        addShootParticlesPrimary("hugeexplosion 6 0 0");
        addShootParticlesPrimary("largeexplode 4 0 0");
        addShootParticlesPrimary("explode 4 0 0");
        addShootParticlesPrimary("explode 4 0 0");
        addShootParticlesPrimary("explode 4 0 0");
        addShootParticlesPrimary("explode 4 0 0");
        addShootParticlesPrimary("explode 4 0 0");
        addShootParticlesPrimary("explode 4 0 0");
        addShootParticlesPrimary("explode 5 0 0");
        addShootParticlesPrimary("explode 5 0 0");
        addShootParticlesPrimary("explode 5 0 0");
        addShootParticlesPrimary("explode 5 0 0");
        addShootParticlesPrimary("explode 5 0 0");
        addShootParticlesPrimary("explode 5 0 0");
        addShootParticlesPrimary("cloud 4 0 0");
        addShootParticlesPrimary("cloud 4 0 0");
        addShootParticlesPrimary("cloud 4 0 0");
        addShootParticlesPrimary("cloud 4 0 0");
        addShootParticlesPrimary("cloud 4 0 0");
        addShootParticlesPrimary("cloud 4 0 0");
        addShootParticlesPrimary("cloud 5 0 0");
        addShootParticlesPrimary("cloud 5 0 0");
        addShootParticlesPrimary("cloud 5 0 0");
        addShootParticlesPrimary("cloud 5 0 0");
        addShootParticlesPrimary("cloud 5 0 0");
        addShootParticlesPrimary("cloud 5 0 0");
        addShootParticlesSecondary("largeexplode 1 0 0");
        addShootParticlesSecondary("explode 1 0 0");
        addShootParticlesSecondary("explode 1 0 0");
        addShootParticlesSecondary("explode 1 0 0");
        addShootParticlesSecondary("explode 1 0 0");
        addShootParticlesSecondary("explode 1 0 0");
        addShootParticlesSecondary("explode 1 0 0");
        addShootParticlesSecondary("explode 2 0 0");
        addShootParticlesSecondary("explode 2 0 0");
        addShootParticlesSecondary("explode 2 0 0");
        addShootParticlesSecondary("explode 2 0 0");
        addShootParticlesSecondary("explode 2 0 0");
        addShootParticlesSecondary("explode 2 0 0");
        addShootParticlesSecondary("cloud 1 0 0");
        addShootParticlesSecondary("cloud 1 0 0");
        addShootParticlesSecondary("cloud 1 0 0");
        addShootParticlesSecondary("cloud 1 0 0");
        addShootParticlesSecondary("cloud 1 0 0");
        addShootParticlesSecondary("cloud 1 0 0");
        addShootParticlesSecondary("cloud 2 0 0");
        addShootParticlesSecondary("cloud 2 0 0");
        addShootParticlesSecondary("cloud 2 0 0");
        addShootParticlesSecondary("cloud 2 0 0");
        addShootParticlesSecondary("cloud 2 0 0");
        addShootParticlesSecondary("cloud 2 0 0");
        
    }
}
