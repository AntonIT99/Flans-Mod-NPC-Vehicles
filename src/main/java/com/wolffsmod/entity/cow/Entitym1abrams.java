package com.wolffsmod.entity.cow;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class Entitym1abrams extends EntityFlanVehicleNPC
{
    public Entitym1abrams(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.6F);
        setDriver("0 36 0 -360 360 -8 15");
        setRotatedDriverOffset("-23 0 10");
        setDriverAimSpeed("4.5 4.5 0");
        addBarrelPosition("115.2 27.5 -0.5");
        addGun("46.8 37.2 5.5 turret 50calg");
        addGun("46.8 37.2 5.5 turret 30calg");
        addGun("46.8 37.2 5.5 turret 30calg");
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
        addLeftLinkPoint("[50.5,15,27.5]");
        addLeftLinkPoint("[56,10,27.5]");
        addLeftLinkPoint("[56,5,27.5]");
        addLeftLinkPoint("[50.5,0,27.5]");
        addLeftLinkPoint("[33.5,-9.5,27.5]");
        addLeftLinkPoint("[-60.5,-9.5,27.5]");
        addLeftLinkPoint("[-80.5,6,27.5]");
        addLeftLinkPoint("[-80.5,6,27.5]");
        addLeftLinkPoint("[-80.5,12,27.5]");
        addRightLinkPoint("[50.5,15,-27.5]");
        addRightLinkPoint("[56,10,-27.5]");
        addRightLinkPoint("[56,5,-27.5]");
        addRightLinkPoint("[50.5,0,-27.5]");
        addRightLinkPoint("[33.5,-9.5,-27.5]");
        addRightLinkPoint("[-60.5,-9.5,-27.5]");
        addRightLinkPoint("[-80.5,6,-27.5]");
        addRightLinkPoint("[-80.5,6,-27.5]");
        addRightLinkPoint("[-80.5,12,-27.5]");
        setTrackLinkLength(5.0F);
        
    }
}
