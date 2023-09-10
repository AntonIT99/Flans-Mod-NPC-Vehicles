package com.wolffsmod.entity.cow;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class Entityleo2a4 extends EntityFlanVehicleNPC
{
    public Entityleo2a4(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.5F);
        setDriver("0 33 0 -360 360 -8 15");
        setRotatedDriverOffset("-16 0 10");
        setDriverAimSpeed("4.5 4.5 0");
        addBarrelPosition("112.8 26 0");
        addGun("32.4 30.6 5 turret 30calg");
        addGun("1.2 46.8 -17 turret 30calg");
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
        addLeftLinkPoint("[49,11.5,24.5]");
        addLeftLinkPoint("[53,8.5,24.5]");
        addLeftLinkPoint("[52.5,4.5,24.5]");
        addLeftLinkPoint("[48.5,-0.5,24.5]");
        addLeftLinkPoint("[33.5,-9.5,24.5]");
        addLeftLinkPoint("[-61.5,-9.5,24.5]");
        addLeftLinkPoint("[-71,-0.5,24.5]");
        addLeftLinkPoint("[-75,3.5,24.5]");
        addLeftLinkPoint("[-75,8.5,24.5]");
        addLeftLinkPoint("[-71,11.5,24.5]");
        addRightLinkPoint("[49,11.5,-25.5]");
        addRightLinkPoint("[53,8.5,-25.5]");
        addRightLinkPoint("[52.5,4.5,-25.5]");
        addRightLinkPoint("[48.5,-0.5,-25.5]");
        addRightLinkPoint("[33.5,-9.5,-25.5]");
        addRightLinkPoint("[-61.5,-9.5,-25.5]");
        addRightLinkPoint("[-71,-0.5,-25.5]");
        addRightLinkPoint("[-75,3.5,-25.5]");
        addRightLinkPoint("[-75,8.5,-25.5]");
        addRightLinkPoint("[-71,11.5,-25.5]");
        setTrackLinkLength(5.0F);
        
    }
}
