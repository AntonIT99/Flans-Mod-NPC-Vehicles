package com.wolffsmod.entity.mos;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class Entity11042_SPG_Navy12cmSPG extends EntityFlanVehicleNPC
{
    public Entity11042_SPG_Navy12cmSPG(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.35F);
        setDriver("0 20 0 -360 360 -10 20");
        setRotatedDriverOffset("-4 0 -15");
        addShootPointPrimary("24 29 0 turret");
        addShootPointSecondary("");
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
        setTurretOrigin("0 0 0");
        
    }
}
