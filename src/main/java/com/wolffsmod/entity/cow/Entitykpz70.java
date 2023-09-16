package com.wolffsmod.entity.cow;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class Entitykpz70 extends EntityFlanVehicleNPC
{
    public Entitykpz70(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.6F);
        setDriver("0 30 0 -360 360 -8 15");
        setRotatedDriverOffset("7 0 -11");
        setDriverAimSpeed("4 4.5 0");
        addBarrelPosition("109.2 22.5 0");
        addGun("19 42.6 -20 turret 20milg");
        addGun("40 27 5 turret 30calg");
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
        addLeftLinkPoint("[48.5,12.5,25.5]");
        addLeftLinkPoint("[52.5,9.5,25.5]");
        addLeftLinkPoint("[52.5,3.5,25.5]");
        addLeftLinkPoint("[49,0.5,25.5]");
        addLeftLinkPoint("[35,-9,25.5]");
        addLeftLinkPoint("[19.5,-9.5,25.5]");
        addLeftLinkPoint("[-50.5,-9.5,25.5]");
        addLeftLinkPoint("[-66,-0.5,25.5]");
        addLeftLinkPoint("[-69.5,2.5,25.5]");
        addLeftLinkPoint("[-69.5,8.5,25.5]");
        addLeftLinkPoint("[-66,11.5,25.5]");
        addLeftLinkPoint("[32,11.5,25.5]");
        addRightLinkPoint("[48.5,12.5,-25.5]");
        addRightLinkPoint("[52.5,9.5,-25.5]");
        addRightLinkPoint("[52.5,3.5,-25.5]");
        addRightLinkPoint("[49,0.5,-25.5]");
        addRightLinkPoint("[35,-9,-25.5]");
        addRightLinkPoint("[19.5,-9.5,-25.5]");
        addRightLinkPoint("[-50.5,-9.5,-25.5]");
        addRightLinkPoint("[-66,-0.5,-25.5]");
        addRightLinkPoint("[-69.5,2.5,-25.5]");
        addRightLinkPoint("[-69.5,8.5,-25.5]");
        addRightLinkPoint("[-66,11.5,-25.5]");
        addRightLinkPoint("[32,11.5,-25.5]");
        setTrackLinkLength(3.0F);
        
    }
}
