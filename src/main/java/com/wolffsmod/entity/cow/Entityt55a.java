package com.wolffsmod.entity.cow;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class Entityt55a extends EntityFlanVehicleNPC
{
    public Entityt55a(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.5F);
        setDriver("0 31 0 -360 360 -4 15");
        setRotatedDriverOffset("-10 0 -10");
        setDriverAimSpeed("2.0 2.0 0");
        addBarrelPosition("123 27 1");
        addGun("30.5 44.5 10 turret 50calg");
        addGun("32 27.5 8.5 turret 30calg");
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
        addLeftLinkPoint("[50.5,9.5,25]");
        addLeftLinkPoint("[53.5,6.5,25]");
        addLeftLinkPoint("[53.5,2.5,25]");
        addLeftLinkPoint("[50.5,-0.5,25]");
        addLeftLinkPoint("[38,-9.5,25]");
        addLeftLinkPoint("[-36,-9.5,25]");
        addLeftLinkPoint("[-49,-1.5,25]");
        addLeftLinkPoint("[-52,1.5,25]");
        addLeftLinkPoint("[-52,6,25]");
        addLeftLinkPoint("[-49,9,25]");
        addRightLinkPoint("[50.5,9.5,-25]");
        addRightLinkPoint("[53.5,6.5,-25]");
        addRightLinkPoint("[53.5,2.5,-25]");
        addRightLinkPoint("[50.5,-0.5,-25]");
        addRightLinkPoint("[38,-9.5,-25]");
        addRightLinkPoint("[-36,-9.5,-25]");
        addRightLinkPoint("[-49,-1.5,-25]");
        addRightLinkPoint("[-52,1.5,-25]");
        addRightLinkPoint("[-52,6,-25]");
        addRightLinkPoint("[-49,9,-25]");
        setTrackLinkLength(3.0F);
        
    }
}
