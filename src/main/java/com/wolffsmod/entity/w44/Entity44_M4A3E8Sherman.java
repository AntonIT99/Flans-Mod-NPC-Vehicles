package com.wolffsmod.entity.w44;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class Entity44_M4A3E8Sherman extends EntityFlanVehicleNPC
{
    public Entity44_M4A3E8Sherman(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.405F);
        setDriver("0 35 0 -360 360 -8 15");
        setRotatedDriverOffset("-9 0 8");
        setDriverAimSpeed("0.95 0.85 0");
        setPassenger("1 25 10 11 core -10 10 -10 10 44_30Cal PassengerGun1");
        addBarrelPosition("70 33 0");
        addGun("18 33 -5 turret 44_30Cal");
        addGun("8 46 -2 turret 44_30Cal");
        addGun("4 48 -9 turret 44_50Cal");
        addGunOrigin("1 35 -5 9");
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
        addLeftLinkPoint("[41,9,19.1]");
        addLeftLinkPoint("[44,7,19.1]");
        addLeftLinkPoint("[44,2,19.1]");
        addLeftLinkPoint("[33,-7.5,19.1]");
        addLeftLinkPoint("[-38,-7.5,19.1]");
        addLeftLinkPoint("[-48.5,1,19.1]");
        addLeftLinkPoint("[-48.5,6,19.1]");
        addLeftLinkPoint("[-45,9,19.1]");
        addLeftLinkPoint("[-40,9,19.1]");
        addLeftLinkPoint("[30,9,19.1]");
        addLeftLinkPoint("[37,9,19.1]");
        addRightLinkPoint("[41,9,-19.1]");
        addRightLinkPoint("[44,7,-19.1]");
        addRightLinkPoint("[44,2,-19.1]");
        addRightLinkPoint("[33,-7.5,-19.1]");
        addRightLinkPoint("[-38,-7.5,-19.1]");
        addRightLinkPoint("[-48.5,1,-19.1]");
        addRightLinkPoint("[-48.5,6,-19.1]");
        addRightLinkPoint("[-45,9,-19.1]");
        addRightLinkPoint("[-40,9,-19.1]");
        addRightLinkPoint("[30,9,-19.1]");
        addRightLinkPoint("[37,9,-19.1]");
        setTrackLinkLength(3.0F);
        
    }
}
