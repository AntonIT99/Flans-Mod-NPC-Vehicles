package com.wolffsmod.entity.w44;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class Entity44_HoI extends EntityFlanVehicleNPC
{
    public Entity44_HoI(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.435F);
        setDriver("0 34 0 -360 360 -7 20");
        setRotatedDriverOffset("-16 0 -6");
        setDriverAimSpeed("0.65 0.55 0");
        setPassenger("1 34 0 7 core -10 10 -10 10 44_Type99 PassengerGun1");
        addBarrelPosition("41 26 0");
        addGun("21 47 6 turret 44_Type99");
        addGunOrigin("1 24 -6 -5");
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
        addLeftLinkPoint("[35.5,9.5,17]");
        addLeftLinkPoint("[37.5,6.5,17]");
        addLeftLinkPoint("[37.5,2.5,17]");
        addLeftLinkPoint("[35.5,1,17]");
        addLeftLinkPoint("[25.5,-7,17]");
        addLeftLinkPoint("[-41.5,-7,17]");
        addLeftLinkPoint("[-54.5,1,17]");
        addLeftLinkPoint("[-54.5,4,17]");
        addLeftLinkPoint("[-52.5,6.5,17]");
        addLeftLinkPoint("[-52.5,6.5,17]");
        addLeftLinkPoint("[-48.5,6.5,17]");
        addLeftLinkPoint("[-48.5,6.5,17]");
        addLeftLinkPoint("[-34,9,17]");
        addLeftLinkPoint("[-34,9,17]");
        addLeftLinkPoint("[32.5,9.5,17]");
        addRightLinkPoint("[35.5,9.5,-17]");
        addRightLinkPoint("[37.5,6.5,-17]");
        addRightLinkPoint("[37.5,2.5,-17]");
        addRightLinkPoint("[35.5,1,-17]");
        addRightLinkPoint("[25.5,-7,-17]");
        addRightLinkPoint("[-41.5,-7,-17]");
        addRightLinkPoint("[-54.5,1,-17]");
        addRightLinkPoint("[-54.5,4,-17]");
        addRightLinkPoint("[-52.5,6.5,-17]");
        addRightLinkPoint("[-52.5,6.5,-17]");
        addRightLinkPoint("[-48.5,6.5,-17]");
        addRightLinkPoint("[-48.5,6.5,-17]");
        addRightLinkPoint("[-34,9,-17]");
        addRightLinkPoint("[-34,9,-17]");
        addRightLinkPoint("[32.5,9.5,-17]");
        setTrackLinkLength(3.0F);
        setFixTrackLink(4);
        
    }
}
