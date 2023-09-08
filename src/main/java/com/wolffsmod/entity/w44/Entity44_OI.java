package com.wolffsmod.entity.w44;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class Entity44_OI extends EntityFlanVehicleNPC
{
    public Entity44_OI(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.25F);
        setDriver("0 55 0 -360 360 -8 20");
        setRotatedDriverOffset("0 0 10");
        setDriverAimSpeed("0.45 0.35 0");
        setPassenger("1 55 22 -18 core -120 20 -5 5 44_47mmCannon PassengerGun1");
        setPassenger("2 55 22 18 core -20 120 -5 5 44_47mmCannon PassengerGun2");
        setPassenger("3 -77 31 0 core 70 280 -10 5 44_Type99 PassengerGun3");
        setPassengerOffsetYaw(1, 0F);
        setPassengerOffsetYaw(2, 0F);
        addBarrelPosition("76 55 0");
        addGunOrigin("1 60 12 -18");
        addGunOrigin("2 60 12 18");
        addGunOrigin("3 -72 14 0");
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
        addLeftLinkPoint("[93,18,37]");
        addLeftLinkPoint("[98,13,37]");
        addLeftLinkPoint("[98,8,37]");
        addLeftLinkPoint("[89,-4,37]");
        addLeftLinkPoint("[74,-8,37]");
        addLeftLinkPoint("[-63,-8,37]");
        addLeftLinkPoint("[-84,-3,37]");
        addLeftLinkPoint("[-89.5,3.5,37]");
        addLeftLinkPoint("[-84.5,15.5,37]");
        addLeftLinkPoint("[-66.5,18.5,37]");
        addLeftLinkPoint("[74.5,18.5,37]");
        addLeftLinkPoint("[88,17.5,37]");
        addRightLinkPoint("[93,18,-37]");
        addRightLinkPoint("[98,13,-37]");
        addRightLinkPoint("[98,8,-37]");
        addRightLinkPoint("[89,-4,-37]");
        addRightLinkPoint("[74,-8,-37]");
        addRightLinkPoint("[-63,-8,-37]");
        addRightLinkPoint("[-84,-3,-37]");
        addRightLinkPoint("[-89.5,3.5,-37]");
        addRightLinkPoint("[-84.5,15.5,-37]");
        addRightLinkPoint("[-66.5,18.5,-37]");
        addRightLinkPoint("[74.5,18.5,-37]");
        addRightLinkPoint("[88,17.5,-37]");
        setTrackLinkLength(3.8F);
        
    }
}
