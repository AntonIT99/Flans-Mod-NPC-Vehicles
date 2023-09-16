package com.wolffsmod.entity.cow;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class Entityt44100 extends EntityFlanVehicleNPC
{
    public Entityt44100(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.5F);
        setDriver("0 32 0 -360 360 -5 15");
        setRotatedDriverOffset("-11 0 7");
        setDriverAimSpeed("2.5 2.5 0");
        addBarrelPosition("131 28.5 -0.5");
        addGun("29 48 -0.5 turret 50calg");
        addGun("30 28.5 4.5 turret 30calg");
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
        addLeftLinkPoint("[43,8,25]");
        addLeftLinkPoint("[49,9,25]");
        addLeftLinkPoint("[52.5,9,25]");
        addLeftLinkPoint("[55.5,6,25]");
        addLeftLinkPoint("[55.5,1,25]");
        addLeftLinkPoint("[40,-9.5,25]");
        addLeftLinkPoint("[-37,-9.5,25]");
        addLeftLinkPoint("[-51,-2.5,25]");
        addLeftLinkPoint("[-54,0.5,25]");
        addLeftLinkPoint("[-54,5.5,25]");
        addLeftLinkPoint("[-51,8.5,25]");
        addLeftLinkPoint("[-48,8.5,25]");
        addLeftLinkPoint("[-42,8,25]");
        addRightLinkPoint("[43,8,-25]");
        addRightLinkPoint("[49,9,-25]");
        addRightLinkPoint("[52.5,9,-25]");
        addRightLinkPoint("[55.5,6,-25]");
        addRightLinkPoint("[55.5,1,-25]");
        addRightLinkPoint("[40,-9.5,-25]");
        addRightLinkPoint("[-37,-9.5,-25]");
        addRightLinkPoint("[-51,-2.5,-25]");
        addRightLinkPoint("[-54,0.5,-25]");
        addRightLinkPoint("[-54,5.5,-25]");
        addRightLinkPoint("[-51,8.5,-25]");
        addRightLinkPoint("[-48,8.5,-25]");
        addRightLinkPoint("[-42,8,-25]");
        setTrackLinkLength(3.0F);
        
    }
}
