package com.wolffsmod.entity.cvts;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class Entity11932_RocketLauncher_28cm_Wurfgerat40 extends EntityFlanVehicleNPC
{
    public Entity11932_RocketLauncher_28cm_Wurfgerat40(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(7.5F);
        setDriver("0 -9 0 -0 0 5 40");
        setRotatedDriverOffset("-12 0 30");
        addShootPointPrimary("0 6 11 turret");
        addShootPointPrimary("0 6 -13 turret");
        addShootPointPrimary("0 6 5 turret");
        addShootPointPrimary("0 6 -4 turret");
        addShootPointSecondary("");
        addShootParticlesPrimary("cloud 1 0 0");
        addShootParticlesPrimary("cloud 0 0 0");
        addShootParticlesPrimary("cloud -1 0 0");
        addShootParticlesPrimary("cloud -2 0 0");
        addShootParticlesPrimary("explode 1 0 0");
        addShootParticlesPrimary("explode 0 0 0");
        addShootParticlesPrimary("explode -1 0 0");
        addShootParticlesPrimary("explode -2 0 0");
        addShootParticlesPrimary("flame -2 0 0");
        
    }
}
