package com.wolffsmod.entity.cow;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class Entityis4 extends EntityFlanVehicleNPC
{
    public Entityis4(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.4F);
        setDriver("0 38 0 -360 360 -5 15");
        setRotatedDriverOffset("-14 0 -11");
        setDriverAimSpeed("1 1.5 0");
        addBarrelPosition("146 36.5 0.5");
        addGun("47 37.5 8.5 turret 50calg");
        addGun("6 59.5 1 turret 50calg");
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
        addLeftLinkPoint("[47,11.5,27]");
        addLeftLinkPoint("[51,7.5,27]");
        addLeftLinkPoint("[51,2.5,27]");
        addLeftLinkPoint("[47,-1.5,27]");
        addLeftLinkPoint("[33.5,-9.5,27]");
        addLeftLinkPoint("[-62.5,-9.5,27]");
        addLeftLinkPoint("[-78.5,-5,27]");
        addLeftLinkPoint("[-83.5,0,27]");
        addLeftLinkPoint("[-83.5,5,27]");
        addLeftLinkPoint("[-78.5,10,27]");
        addRightLinkPoint("[47,11.5,-27]");
        addRightLinkPoint("[51,7.5,-27]");
        addRightLinkPoint("[51,2.5,-27]");
        addRightLinkPoint("[47,-1.5,-27]");
        addRightLinkPoint("[33.5,-9.5,-27]");
        addRightLinkPoint("[-62.5,-9.5,-27]");
        addRightLinkPoint("[-78.5,-5,-27]");
        addRightLinkPoint("[-83.5,0,-27]");
        addRightLinkPoint("[-83.5,5,-27]");
        addRightLinkPoint("[-78.5,10,-27]");
        setTrackLinkLength(3.0F);
        
    }
}
