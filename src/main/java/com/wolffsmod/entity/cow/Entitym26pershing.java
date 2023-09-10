package com.wolffsmod.entity.cow;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class Entitym26pershing extends EntityFlanVehicleNPC
{
    public Entitym26pershing(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.4F);
        setDriver("0 42 0 -360 360 -8 15");
        setRotatedDriverOffset("-6 0 10");
        setDriverAimSpeed("2 2.5 0");
        addBarrelPosition("136 43 0");
        addGun("6 57.5 -2.5 turret 50calg");
        addGun("36 45 13 turret 30calg");
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
        addLeftLinkPoint("[54,12.5,32.5]");
        addLeftLinkPoint("[54,7.5,32.5]");
        addLeftLinkPoint("[49,2.5,32.5]");
        addLeftLinkPoint("[36,-8.5,32.5]");
        addLeftLinkPoint("[-56,-8.5,32.5]");
        addLeftLinkPoint("[-73,-2.5,32.5]");
        addLeftLinkPoint("[-78,2.5,32.5]");
        addLeftLinkPoint("[-78,9.5,32.5]");
        addLeftLinkPoint("[-46,17.5,32.5]");
        addLeftLinkPoint("[49,17.5,32.5]");
        addRightLinkPoint("[54,12.5,-32.5]");
        addRightLinkPoint("[54,7.5,-32.5]");
        addRightLinkPoint("[49,2.5,-32.5]");
        addRightLinkPoint("[36,-8.5,-32.5]");
        addRightLinkPoint("[-56,-8.5,-32.5]");
        addRightLinkPoint("[-73,-2.5,-32.5]");
        addRightLinkPoint("[-78,2.5,-32.5]");
        addRightLinkPoint("[-78,9.5,-32.5]");
        addRightLinkPoint("[-46,17.5,-32.5]");
        addRightLinkPoint("[49,17.5,-32.5]");
        setTrackLinkLength(4.0F);
        
    }
}
