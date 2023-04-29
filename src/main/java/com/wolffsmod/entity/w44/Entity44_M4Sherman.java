package com.wolffsmod.entity.w44;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class Entity44_M4Sherman extends EntityFlanVehicleNPC
{
    public Entity44_M4Sherman(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.37F);
        setDriver("0 35 0 -360 360 -8 15");
        setRotatedDriverOffset("-9 0 8");
        setDriverAimSpeed("1.13 1.03 0");
        setPassenger("1 29 13 10 core -10 10 -10 10 44_30Cal PassengerGun1");
        addBarrelPosition("48 33 0");
        addGun("20 33 -5 turret 44_30Cal");
        addGun("26 47 13 turret 44_50Cal");
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
        addLeftLinkPoint("[44.5,9,17.5]");
        addLeftLinkPoint("[46.5,7,17.5]");
        addLeftLinkPoint("[46.5,2,17.5]");
        addLeftLinkPoint("[36,-7.5,17.5]");
        addLeftLinkPoint("[-36,-7.5,17.5]");
        addLeftLinkPoint("[-46.5,1,17.5]");
        addLeftLinkPoint("[-46.5,6,17.5]");
        addLeftLinkPoint("[-43,9,17.5]");
        addLeftLinkPoint("[-38,9,17.5]");
        addLeftLinkPoint("[34,9,17.5]");
        addLeftLinkPoint("[41,9,17.5]");
        addRightLinkPoint("[44.5,9,-17.5]");
        addRightLinkPoint("[46.5,7,-17.5]");
        addRightLinkPoint("[46.5,2,-17.5]");
        addRightLinkPoint("[37,-7.5,-17.5]");
        addRightLinkPoint("[-36,-7.5,-17.5]");
        addRightLinkPoint("[-46.5,1,-17.5]");
        addRightLinkPoint("[-46.5,6,-17.5]");
        addRightLinkPoint("[-43,9,-17.5]");
        addRightLinkPoint("[-38,9,-17.5]");
        addRightLinkPoint("[34,9,-17.5]");
        addRightLinkPoint("[41,9,-17.5]");
        setTrackLinkLength(3.0F);
        setFixTrackLink(4);
        
    }
}
