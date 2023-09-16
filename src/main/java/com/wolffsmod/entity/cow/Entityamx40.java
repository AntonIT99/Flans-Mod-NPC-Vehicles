package com.wolffsmod.entity.cow;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class Entityamx40 extends EntityFlanVehicleNPC
{
    public Entityamx40(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.4F);
        setDriver("0 32 0 -360 360 -8 15");
        setRotatedDriverOffset("-14 0 12");
        setDriverAimSpeed("3.5 4.0 0");
        addBarrelPosition("122 28 0");
        addGun("60 28 -8.5 turret 20milg");
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
        addLeftLinkPoint("[54,14,26]");
        addLeftLinkPoint("[58,10,26]");
        addLeftLinkPoint("[58,6,26]");
        addLeftLinkPoint("[54,2,26]");
        addLeftLinkPoint("[40,-9,26]");
        addLeftLinkPoint("[-53,-9,26]");
        addLeftLinkPoint("[-69,0,26]");
        addLeftLinkPoint("[-73,5,26]");
        addLeftLinkPoint("[-73,10,26]");
        addLeftLinkPoint("[-69,14,26]");
        addRightLinkPoint("[54,14,-26]");
        addRightLinkPoint("[58,10,-26]");
        addRightLinkPoint("[58,6,-26]");
        addRightLinkPoint("[54,2,-26]");
        addRightLinkPoint("[40,-9,-26]");
        addRightLinkPoint("[-53,-9,-26]");
        addRightLinkPoint("[-69,0,-26]");
        addRightLinkPoint("[-73,5,-26]");
        addRightLinkPoint("[-73,10,-26]");
        addRightLinkPoint("[-69,14,-26]");
        setTrackLinkLength(5.0F);
        
    }
}
