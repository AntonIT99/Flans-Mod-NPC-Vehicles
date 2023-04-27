package com.wolffsmod.entity.w44;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class Entity44_M8A1GMC extends EntityFlanVehicleNPC
{
    public Entity44_M8A1GMC(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.535F);
        setDriver("0 30 0 -360 360 -10 30");
        setRotatedDriverOffset("-20 0 4");
        setDriverAimSpeed("0.56 0.46 0");
        addBarrelPosition("51 31 0");
        addGun("15 42 7 turret 44_50Cal");
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
        addLeftLinkPoint("[39.5,8,19.8]");
        addLeftLinkPoint("[42.5,6,19.8]");
        addLeftLinkPoint("[42.5,1,19.8]");
        addLeftLinkPoint("[32,-9.5,19.8]");
        addLeftLinkPoint("[-39,-9.5,19.8]");
        addLeftLinkPoint("[-42.3,-6,19.8]");
        addLeftLinkPoint("[-42.5,5,19.8]");
        addLeftLinkPoint("[-39,6,19.8]");
        addLeftLinkPoint("[-31,8,19.8]");
        addLeftLinkPoint("[19,9,19.8]");
        addLeftLinkPoint("[36,9,19.8]");
        addRightLinkPoint("[39.5,8,-19.8]");
        addRightLinkPoint("[42.5,6,-19.8]");
        addRightLinkPoint("[42.5,1,-19.8]");
        addRightLinkPoint("[32,-9.5,-19.8]");
        addRightLinkPoint("[-39,-9.5,-19.8]");
        addRightLinkPoint("[-42.3,-6,-19.8]");
        addRightLinkPoint("[-42.5,5,-19.8]");
        addRightLinkPoint("[-39,6,-19.8]");
        addRightLinkPoint("[-31,8,-19.8]");
        addRightLinkPoint("[19,9,-19.8]");
        addRightLinkPoint("[36,9,-19.8]");
        setTrackLinkLength(3.0F);
        
    }
}
