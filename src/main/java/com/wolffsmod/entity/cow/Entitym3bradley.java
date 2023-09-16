package com.wolffsmod.entity.cow;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class Entitym3bradley extends EntityFlanVehicleNPC
{
    public Entitym3bradley(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.5F);
        setDriver("0 38 0 -360 360 -9 45");
        setRotatedDriverOffset("-17 0 11");
        setDriverAimSpeed("3.5 4.0 0");
        addBarrelPosition("-47 20 -21.5");
        addGun("48 39 5 turret 25mmgun");
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
        addLeftLinkPoint("[58.5,10.5,24]");
        addLeftLinkPoint("[61.5,7.5,24]");
        addLeftLinkPoint("[61.5,3.5,24]");
        addLeftLinkPoint("[58.5,0.5,24]");
        addLeftLinkPoint("[41.5,-9,24]");
        addLeftLinkPoint("[-42.5,-9,24]");
        addLeftLinkPoint("[-54,-2,24]");
        addLeftLinkPoint("[-58,2.5,24]");
        addLeftLinkPoint("[-58,7,24]");
        addLeftLinkPoint("[-54,11,24]");
        addRightLinkPoint("[58.5,10.5,-24]");
        addRightLinkPoint("[61.5,7.5,-24]");
        addRightLinkPoint("[61.5,3.5,-24]");
        addRightLinkPoint("[58.5,0.5,-24]");
        addRightLinkPoint("[41.5,-9,-24]");
        addRightLinkPoint("[-42.5,-9,-24]");
        addRightLinkPoint("[-54,-2,-24]");
        addRightLinkPoint("[-58,2.5,-24]");
        addRightLinkPoint("[-58,7,-24]");
        addRightLinkPoint("[-54,11,-24]");
        setTrackLinkLength(3.0F);
        
    }
}
