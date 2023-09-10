package com.wolffsmod.entity.cow;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class Entityt80b extends EntityFlanVehicleNPC
{
    public Entityt80b(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.4F);
        setDriver("0 28 0 -360 360 -5 15");
        setRotatedDriverOffset("-11 0 -12");
        setDriverAimSpeed("4.0 4.0 0");
        addBarrelPosition("138 27 0");
        addGun("32 45 12 turret 50calg");
        addGun("33 27 7 turret 30calg");
        addShootParticlesPrimary("largesmoke 0.5 0 0.1");
        addShootParticlesPrimary("largesmoke 0.5 0 -0.1");
        addShootParticlesPrimary("largesmoke 0.5 0.06 0.06");
        addShootParticlesPrimary("largesmoke 0.5 0.06 -0.06");
        addShootParticlesPrimary("largesmoke 0.5 -0.06 0.06");
        addShootParticlesPrimary("largesmoke 0.5 -0.06 -0.06");
        addShootParticlesPrimary("largesmoke 0.5 -0.1 0");
        addShootParticlesPrimary("largesmoke 0.5 0.1 0");
        addShootParticlesPrimary("cloud 0.05 0 0.2");
        addShootParticlesPrimary("cloud 0.05 0 -0.2");
        addShootParticlesPrimary("cloud 0.05 0.13 0.13");
        addShootParticlesPrimary("cloud 0.05 0.13 -0.13");
        addShootParticlesPrimary("cloud 0.05 -0.13 0.13");
        addShootParticlesPrimary("cloud 0.05 -0.13 -0.13");
        addShootParticlesPrimary("cloud 0.05 -0.2 0");
        addShootParticlesPrimary("cloud 0.05 0.2 0");
        addShootParticlesSecondary("crit 0.5 0 0");
        addLeftLinkPoint("[70,13.5,30.5]");
        addLeftLinkPoint("[74,9.5,30.5]");
        addLeftLinkPoint("[74,4.5,30.5]");
        addLeftLinkPoint("[70,0.5,30.5]");
        addLeftLinkPoint("[51.5,-9.5,30.5]");
        addLeftLinkPoint("[-46.5,-9.5,30.5]");
        addLeftLinkPoint("[-60,-1.5,30.5]");
        addLeftLinkPoint("[-64,2.5,30.5]");
        addLeftLinkPoint("[-64,7.5,30.5]");
        addLeftLinkPoint("[-60,11.5,30.5]");
        addRightLinkPoint("[70,13.5,-30.5]");
        addRightLinkPoint("[74,9.5,-30.5]");
        addRightLinkPoint("[74,4.5,-30.5]");
        addRightLinkPoint("[70,0.5,-30.5]");
        addRightLinkPoint("[51.5,-9.5,-30.5]");
        addRightLinkPoint("[-46.5,-9.5,-30.5]");
        addRightLinkPoint("[-60,-1.5,-30.5]");
        addRightLinkPoint("[-64,2.5,-30.5]");
        addRightLinkPoint("[-64,7.5,-30.5]");
        addRightLinkPoint("[-60,11.5,-30.5]");
        setTrackLinkLength(6.0F);
        
    }
}
