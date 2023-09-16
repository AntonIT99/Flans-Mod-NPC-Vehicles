package com.wolffsmod.entity.cow;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class Entityleclerc extends EntityFlanVehicleNPC
{
    public Entityleclerc(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.5F);
        setDriver("0 27 0 -360 360 -8 15");
        setRotatedDriverOffset("-6 0 14");
        setDriverAimSpeed("4.5 4.5 0");
        addBarrelPosition("130 29 -0.5");
        addGun("37 25.5 -5.5 turret 50calg");
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
        addLeftLinkPoint("[57,9.5,24.5]");
        addLeftLinkPoint("[59,7.5,24.5]");
        addLeftLinkPoint("[59,1.5,24.5]");
        addLeftLinkPoint("[57,-0.5,24.5]");
        addLeftLinkPoint("[46,-9.5,24.5]");
        addLeftLinkPoint("[-47,-9.5,24.5]");
        addLeftLinkPoint("[-60.5,-1.5,24.5]");
        addLeftLinkPoint("[-64.5,2.5,24.5]");
        addLeftLinkPoint("[-64.5,9.5,24.5]");
        addLeftLinkPoint("[-60.5,13.5,24.5]");
        addRightLinkPoint("[57,9.5,-24.5]");
        addRightLinkPoint("[59,7.5,-24.5]");
        addRightLinkPoint("[59,1.5,-24.5]");
        addRightLinkPoint("[57,-0.5,-24.5]");
        addRightLinkPoint("[46,-9.5,-24.5]");
        addRightLinkPoint("[-47,-9.5,-24.5]");
        addRightLinkPoint("[-60.5,-1.5,-24.5]");
        addRightLinkPoint("[-64.5,2.5,-24.5]");
        addRightLinkPoint("[-64.5,9.5,-24.5]");
        addRightLinkPoint("[-60.5,13.5,-24.5]");
        setTrackLinkLength(5.0F);
        
    }
}
