package com.wolffsmod.entity.w44;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class Entity44_M5A1Stuart extends EntityFlanVehicleNPC
{
    public Entity44_M5A1Stuart(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.565F);
        setDriver("0 28 0 -360 360 -8 15");
        setRotatedDriverOffset("-8 0 8");
        setDriverAimSpeed("1.13 1.03 0");
        setPassenger("1 20 7 10 core -10 10 -10 10 44_30Cal PassengerGun1");
        addBarrelPosition("47 30 0");
        addGun("15 33 4 turret 44_30Cal");
        addGun("6 40 17 turret 44_30Cal");
        addGunOrigin("1 44 -12 8");
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
        addLeftLinkPoint("[40.5,8,19.2]");
        addLeftLinkPoint("[43.5,6,19.2]");
        addLeftLinkPoint("[43.5,1,19.2]");
        addLeftLinkPoint("[33,-9.5,19.2]");
        addLeftLinkPoint("[-38,-9.5,19.2]");
        addLeftLinkPoint("[-41.3,-6,19.2]");
        addLeftLinkPoint("[-41.5,5,19.2]");
        addLeftLinkPoint("[-38,6,19.2]");
        addLeftLinkPoint("[-30,8,19.2]");
        addLeftLinkPoint("[20,9,19.2]");
        addLeftLinkPoint("[37,9,19.2]");
        addRightLinkPoint("[40.5,8,-19.2]");
        addRightLinkPoint("[43.5,6,-19.2]");
        addRightLinkPoint("[43.5,1,-19.2]");
        addRightLinkPoint("[33,-9.5,-19.2]");
        addRightLinkPoint("[-38,-9.5,-19.2]");
        addRightLinkPoint("[-41.3,-6,-19.2]");
        addRightLinkPoint("[-41.5,5,-19.2]");
        addRightLinkPoint("[-38,6,-19.2]");
        addRightLinkPoint("[-30,8,-19.2]");
        addRightLinkPoint("[20,9,-19.2]");
        addRightLinkPoint("[37,9,-19.2]");
        setTrackLinkLength(3.0F);
        
    }
}
