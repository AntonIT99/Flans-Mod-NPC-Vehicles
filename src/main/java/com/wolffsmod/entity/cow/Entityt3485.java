package com.wolffsmod.entity.cow;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class Entityt3485 extends EntityFlanVehicleNPC
{
    public Entityt3485(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.5F);
        setDriver("0 39 0 -360 360 -5 15");
        setRotatedDriverOffset("-10 0 -8");
        setDriverAimSpeed("2.5 2.5 0");
        addBarrelPosition("109 35.5 -0.5");
        addGun("31.5 35.5 4.5 turret 30calg");
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
        addLeftLinkPoint("[42,9.5,24]");
        addLeftLinkPoint("[45,6.5,24]");
        addLeftLinkPoint("[45,1.5,24]");
        addLeftLinkPoint("[42,-1.5,24]");
        addLeftLinkPoint("[30,-8.5,24]");
        addLeftLinkPoint("[11,-9.5,24]");
        addLeftLinkPoint("[-49,-9.5,24]");
        addLeftLinkPoint("[-64,-5.5,24]");
        addLeftLinkPoint("[-68,-1.5,24]");
        addLeftLinkPoint("[-68,3.5,24]");
        addLeftLinkPoint("[-64,7.5,24]");
        addLeftLinkPoint("[-48,9.5,24]");
        addRightLinkPoint("[42,9.5,-25]");
        addRightLinkPoint("[45,6.5,-25]");
        addRightLinkPoint("[45,1.5,-25]");
        addRightLinkPoint("[42,-1.5,-25]");
        addRightLinkPoint("[30,-8.5,-25]");
        addRightLinkPoint("[11,-9.5,-25]");
        addRightLinkPoint("[-49,-9.5,-25]");
        addRightLinkPoint("[-64,-5.5,-25]");
        addRightLinkPoint("[-68,-1.5,-25]");
        addRightLinkPoint("[-68,3.5,-25]");
        addRightLinkPoint("[-64,7.5,-25]");
        addRightLinkPoint("[-48,9.5,-25]");
        setTrackLinkLength(2.0F);
        
    }
}
