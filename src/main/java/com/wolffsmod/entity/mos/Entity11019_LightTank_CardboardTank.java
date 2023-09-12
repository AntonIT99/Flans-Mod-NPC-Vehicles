package com.wolffsmod.entity.mos;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class Entity11019_LightTank_CardboardTank extends EntityFlanVehicleNPC
{
    public Entity11019_LightTank_CardboardTank(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(2.0F);
        setDriver("0 7 0 -360 360 -10 20");
        setRotatedDriverOffset("-5 0 2");
        addShootPointPrimary("27 15 0 turret");
        addShootPointSecondary("");
        addShootParticlesPrimary("largeexplode 0 0 0");
        addShootParticlesPrimary("explode 0 0 0");
        addShootParticlesPrimary("explode 0 0 0");
        addShootParticlesPrimary("explode 0 0 0");
        addShootParticlesPrimary("explode 0 0 0");
        addShootParticlesPrimary("explode 0 0 0");
        addShootParticlesPrimary("explode 0 0 0");
        addShootParticlesPrimary("explode 1 0 0");
        addShootParticlesPrimary("explode 1 0 0");
        addShootParticlesPrimary("explode 1 0 0");
        addShootParticlesPrimary("explode 1 0 0");
        addShootParticlesPrimary("explode 1 0 0");
        addShootParticlesPrimary("explode 1 0 0");
        addShootParticlesPrimary("cloud 0 0 0");
        addShootParticlesPrimary("cloud 0 0 0");
        addShootParticlesPrimary("cloud 0 0 0");
        addShootParticlesPrimary("cloud 0 0 0");
        addShootParticlesPrimary("cloud 0 0 0");
        addShootParticlesPrimary("cloud 0 0 0");
        addShootParticlesPrimary("cloud 1 0 0");
        addShootParticlesPrimary("cloud 1 0 0");
        addShootParticlesPrimary("cloud 1 0 0");
        addShootParticlesPrimary("cloud 1 0 0");
        addShootParticlesPrimary("cloud 1 0 0");
        addShootParticlesPrimary("cloud 1 0 0");
        
    }
}
