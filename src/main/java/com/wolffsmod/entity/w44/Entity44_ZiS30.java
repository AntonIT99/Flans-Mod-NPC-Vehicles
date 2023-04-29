package com.wolffsmod.entity.w44;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class Entity44_ZiS30 extends EntityFlanVehicleNPC
{
    public Entity44_ZiS30(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.425F);
        setDriver("0 13 0 -30 30 -4 22");
        setRotatedDriverOffset("-15 0 -6");
        setDriverAimSpeed("0.33 0.23 0");
        setPassenger("1 24 -4 4 core -30 30 -15 15 44_DT28 PassengerGun1");
        addBarrelPosition("85 26 0");
        addGunOrigin("1 40 -7 8");
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
        addLeftLinkPoint("[39.8,6.6,16]");
        addLeftLinkPoint("[42.8,3.6,16]");
        addLeftLinkPoint("[42.8,-1.5,16]");
        addLeftLinkPoint("[39.8,-4.5,16]");
        addLeftLinkPoint("[39.8,-4.5,16]");
        addLeftLinkPoint("[28,-9.5,16]");
        addLeftLinkPoint("[-11,-9.5,16]");
        addLeftLinkPoint("[-21,-4,16]");
        addLeftLinkPoint("[-23,-1.5,16]");
        addLeftLinkPoint("[-23,2,16]");
        addLeftLinkPoint("[-21,4.2,16]");
        addLeftLinkPoint("[-2,5,16]");
        addLeftLinkPoint("[17,6.5,16]");
        addLeftLinkPoint("[17,6.5,16]");
        addLeftLinkPoint("[34,6.6,16]");
        addRightLinkPoint("[39.8,6.6,-16]");
        addRightLinkPoint("[42.8,3.6,-16]");
        addRightLinkPoint("[42.8,-1.5,-16]");
        addRightLinkPoint("[39.8,-4.5,-16]");
        addRightLinkPoint("[39.8,-4.5,-16]");
        addRightLinkPoint("[28,-9.5,-16]");
        addRightLinkPoint("[-11,-9.5,-16]");
        addRightLinkPoint("[-21,-4,-16]");
        addRightLinkPoint("[-23,-1.5,-16]");
        addRightLinkPoint("[-23,2,-16]");
        addRightLinkPoint("[-21,4.2,-16]");
        addRightLinkPoint("[-2,5,-16]");
        addRightLinkPoint("[17,6.5,-16]");
        addRightLinkPoint("[17,6.5,-16]");
        addRightLinkPoint("[34,6.6,-16]");
        setTrackLinkLength(3.0F);
        
    }
}
