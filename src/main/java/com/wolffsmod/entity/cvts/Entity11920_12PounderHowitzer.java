package com.wolffsmod.entity.cvts;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class Entity11920_12PounderHowitzer extends EntityFlanVehicleNPC
{
    public Entity11920_12PounderHowitzer(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.5F);
        setDriver("0 -4 0 -5 5 3 40");
        setRotatedDriverOffset("-16 0 8");
        addShootPointPrimary("0 7 0 turret");
        addShootPointSecondary("");
        addShootParticlesPrimary("largeexplode 1 0 0");
        addShootParticlesPrimary("explode 1 0 0");
        addShootParticlesPrimary("explode 1 0 0");
        addShootParticlesPrimary("explode 1 0 0");
        addShootParticlesPrimary("explode 1 0 0");
        addShootParticlesPrimary("explode 1 0 0");
        addShootParticlesPrimary("explode 1 0 0");
        addShootParticlesPrimary("explode 2 0 0");
        addShootParticlesPrimary("explode 2 0 0");
        addShootParticlesPrimary("explode 2 0 0");
        addShootParticlesPrimary("explode 2 0 0");
        addShootParticlesPrimary("explode 2 0 0");
        addShootParticlesPrimary("explode 2 0 0");
        addShootParticlesPrimary("cloud 1 0 0");
        addShootParticlesPrimary("cloud 1 0 0");
        addShootParticlesPrimary("cloud 1 0 0");
        addShootParticlesPrimary("cloud 1 0 0");
        addShootParticlesPrimary("cloud 1 0 0");
        addShootParticlesPrimary("cloud 1 0 0");
        addShootParticlesPrimary("cloud 2 0 0");
        addShootParticlesPrimary("cloud 2 0 0");
        addShootParticlesPrimary("cloud 2 0 0");
        addShootParticlesPrimary("cloud 2 0 0");
        addShootParticlesPrimary("cloud 2 0 0");
        addShootParticlesPrimary("cloud 2 0 0");
        
    }
}
