package com.wolffsmod.entity.w44;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class Entity44_ChiHe extends EntityFlanVehicleNPC
{
    public Entity44_ChiHe(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.435F);
        setDriver("0 34 0 -360 360 -15 20");
        setRotatedDriverOffset("-7 0 6");
        setDriverAimSpeed("0.65 0.55 0");
        setPassenger("1 34 0 5 core -10 10 -10 10 44_Type99 PassengerGun1");
        addBarrelPosition("60 30 3");
        addGunOrigin("1 19 14 -5");
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
        addLeftLinkPoint("[35.5,9.5,15]");
        addLeftLinkPoint("[37.5,6.5,15]");
        addLeftLinkPoint("[37.5,2.5,15]");
        addLeftLinkPoint("[35.5,1,15]");
        addLeftLinkPoint("[25.5,-7,15]");
        addLeftLinkPoint("[-41.5,-7,15]");
        addLeftLinkPoint("[-54.5,1,15]");
        addLeftLinkPoint("[-54.5,4,15]");
        addLeftLinkPoint("[-52.5,6.5,15]");
        addLeftLinkPoint("[-52.5,6.5,15]");
        addLeftLinkPoint("[-48.5,6.5,15]");
        addLeftLinkPoint("[-48.5,6.5,15]");
        addLeftLinkPoint("[-34,9,15]");
        addLeftLinkPoint("[-34,9,15]");
        addLeftLinkPoint("[32.5,9.5,15]");
        addRightLinkPoint("[35.5,9.5,-19]");
        addRightLinkPoint("[37.5,6.5,-19]");
        addRightLinkPoint("[37.5,2.5,-19]");
        addRightLinkPoint("[35.5,1,-19]");
        addRightLinkPoint("[25.5,-7,-19]");
        addRightLinkPoint("[-41.5,-7,-19]");
        addRightLinkPoint("[-54.5,1,-19]");
        addRightLinkPoint("[-54.5,4,-19]");
        addRightLinkPoint("[-52.5,6.5,-19]");
        addRightLinkPoint("[-52.5,6.5,-19]");
        addRightLinkPoint("[-48.5,6.5,-19]");
        addRightLinkPoint("[-48.5,6.5,-19]");
        addRightLinkPoint("[-34,9,-19]");
        addRightLinkPoint("[-34,9,-19]");
        addRightLinkPoint("[32.5,9.5,-19]");
        setTrackLinkLength(3.0F);
        setFixTrackLink(4);
        
    }
}
