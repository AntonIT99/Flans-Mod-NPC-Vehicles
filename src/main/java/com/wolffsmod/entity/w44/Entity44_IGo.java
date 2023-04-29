package com.wolffsmod.entity.w44;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class Entity44_IGo extends EntityFlanVehicleNPC
{
    public Entity44_IGo(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.265F);
        setDriver("0 38 0 -360 360 -15 20");
        setRotatedDriverOffset("-6 0 6");
        setDriverAimSpeed("0.71 0.61 0");
        setPassenger("1 19 8 -7 core -10 10 -10 10 44_Type99 PassengerGun1");
        addBarrelPosition("35 36 0");
        addGunOrigin("1 26 6 8");
        addShootParticlesPrimary("largeexplode 0 0 0");
        addShootParticlesPrimary("explode 1.5 0 0");
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
        addShootParticlesPrimary("flansmod.fmflame 1 0 0");
        addShootParticlesPrimary("flansmod.fmflame 1.75 0 0");
        addShootParticlesPrimary("flansmod.fmflame 1.5 0 0");
        addShootParticlesPrimary("flansmod.fmflame 1.25 0 0");
        addShootParticlesPrimary("flansmod.fmflame 0.75 0 0");
        addShootParticlesPrimary("flansmod.fmflame 0.5 0 0");
        addShootParticlesPrimary("flansmod.fmflame 0.25 0 0");
        addShootParticlesPrimary("flansmod.fmflame 1.5 0 0");
        addShootParticlesPrimary("flansmod.fmflame 0.5 0 0.1");
        addShootParticlesPrimary("flansmod.fmflame 0.5 0 -0.1");
        addShootParticlesPrimary("flansmod.fmflame 0.5 0.06 0.06");
        addShootParticlesPrimary("flansmod.fmflame 0.5 0.06 -0.06");
        addShootParticlesPrimary("flansmod.fmflame 0.5 -0.06 0.06");
        addShootParticlesPrimary("flansmod.fmflame 0.5 -0.06 -0.06");
        addShootParticlesPrimary("flansmod.fmflame 0.5 -0.1 0");
        addShootParticlesPrimary("flansmod.fmflame 0.5 0.1 0");
        addShootParticlesPrimary("flansmod.fmflame 0.05 0 0.2");
        addShootParticlesPrimary("flansmod.fmflame 0.05 0 -0.2");
        addShootParticlesPrimary("flansmod.fmflame 0.05 0.13 0.13");
        addShootParticlesPrimary("flansmod.fmflame 0.05 0.13 -0.13");
        addShootParticlesPrimary("flansmod.fmflame 0.05 -0.13 0.13");
        addShootParticlesPrimary("flansmod.fmflame 0.05 -0.13 -0.13");
        addShootParticlesPrimary("flansmod.fmflame 0.05 -0.2 0");
        addShootParticlesPrimary("flansmod.fmflame 0.05 0.2 0");
        addShootParticlesPrimary("flansmod.fmflame 0.1 0 0.4");
        addShootParticlesPrimary("flansmod.fmflame 0.1 0 -0.4");
        addShootParticlesPrimary("flansmod.fmflame 0.1 0.26 0.26");
        addShootParticlesPrimary("flansmod.fmflame 0.1 0.26 -0.26");
        addShootParticlesPrimary("flansmod.fmflame 0.1 -0.26 0.26");
        addShootParticlesPrimary("flansmod.fmflame 0.1 -0.26 -0.26");
        addShootParticlesPrimary("flansmod.fmflame 0.1 -0.4 0");
        addShootParticlesPrimary("flansmod.fmflame 0.1 0.4 0");
        addShootParticlesSecondary("crit 0.5 0 0");
        addLeftLinkPoint("[36,16.5,20.5]");
        addLeftLinkPoint("[40,12,20.5]");
        addLeftLinkPoint("[40,4,20.5]");
        addLeftLinkPoint("[30,-4,20.5]");
        addLeftLinkPoint("[17.5,-8.5,20.5]");
        addLeftLinkPoint("[10.5,-9,20.5]");
        addLeftLinkPoint("[-50.5,-9,20.5]");
        addLeftLinkPoint("[-65.5,-6.5,20.5]");
        addLeftLinkPoint("[-68,-2.5,20.5]");
        addLeftLinkPoint("[-68,2.5,20.5]");
        addLeftLinkPoint("[-64,6.5,20.5]");
        addLeftLinkPoint("[-54.5,12.5,20.5]");
        addLeftLinkPoint("[-39,13.5,20.5]");
        addLeftLinkPoint("[-23,14.5,20.5]");
        addLeftLinkPoint("[-7,15.5,20.5]");
        addLeftLinkPoint("[7,17,20.5]");
        addLeftLinkPoint("[29,16.5,20.5]");
        addRightLinkPoint("[36,16.5,-20.5]");
        addRightLinkPoint("[40,12,-20.5]");
        addRightLinkPoint("[40,4,-20.5]");
        addRightLinkPoint("[30,-4,-20.5]");
        addRightLinkPoint("[17.5,-8.5,-20.5]");
        addRightLinkPoint("[10.5,-9,-20.5]");
        addRightLinkPoint("[-50.5,-9,-20.5]");
        addRightLinkPoint("[-65.5,-6.5,-20.5]");
        addRightLinkPoint("[-68,-2.5,-20.5]");
        addRightLinkPoint("[-68,2.5,-20.5]");
        addRightLinkPoint("[-64,6.5,-20.5]");
        addRightLinkPoint("[-54.5,12.5,-20.5]");
        addRightLinkPoint("[-39,13.5,-20.5]");
        addRightLinkPoint("[-23,14.5,-20.5]");
        addRightLinkPoint("[-7,15.5,-20.5]");
        addRightLinkPoint("[7,17,-20.5]");
        addRightLinkPoint("[29,16.5,-20.5]");
        setTrackLinkLength(3.0F);
        setFixTrackLink(4);
        
    }
}
