package com.wolffsmod.entity.w44;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class Entity44_ChiRi extends EntityFlanVehicleNPC
{
    public Entity44_ChiRi(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.425F);
        setDriver("0 43 0 -360 360 -10 20");
        setRotatedDriverOffset("-16 0 -7");
        setDriverAimSpeed("0.43 0.33 0");
        setPassenger("1 30 11 -7 core -10 10 -5 8 44_47mmCannon PassengerGun1");
        addBarrelPosition("88 34 0");
        addGun("14 56 -8 turret 44_Type99");
        addGunOrigin("1 48 -2 -9");
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
        addLeftLinkPoint("[62.5,14,27]");
        addLeftLinkPoint("[66.5,9.5,27]");
        addLeftLinkPoint("[66.5,2.5,27]");
        addLeftLinkPoint("[62.5,-4.5,27]");
        addLeftLinkPoint("[49.5,-9.5,27]");
        addLeftLinkPoint("[-59,-9.5,27]");
        addLeftLinkPoint("[-68,-5.5,27]");
        addLeftLinkPoint("[-74.5,1.5,27]");
        addLeftLinkPoint("[-74.5,7.5,27]");
        addLeftLinkPoint("[-72.5,9.5,27]");
        addLeftLinkPoint("[-71.5,9.5,27]");
        addLeftLinkPoint("[-35.5,14.25,27]");
        addLeftLinkPoint("[25.5,14.25,27]");
        addLeftLinkPoint("[56.5,14,27]");
        addRightLinkPoint("[62.5,14,-23]");
        addRightLinkPoint("[66.5,9.5,-23]");
        addRightLinkPoint("[66.5,2.5,-23]");
        addRightLinkPoint("[62.5,-4.5,-23]");
        addRightLinkPoint("[49.5,-9.5,-23]");
        addRightLinkPoint("[-59,-9.5,-23]");
        addRightLinkPoint("[-68,-5.5,-23]");
        addRightLinkPoint("[-74.5,1.5,-23]");
        addRightLinkPoint("[-74.5,7.5,-23]");
        addRightLinkPoint("[-72.5,9.5,-23]");
        addRightLinkPoint("[-71.5,9.5,-23]");
        addRightLinkPoint("[-35.5,14.25,-23]");
        addRightLinkPoint("[25.5,14.25,-23]");
        addRightLinkPoint("[56.5,14,-23]");
        setTrackLinkLength(3.95F);
        setFixTrackLink(4);
        
    }
}
