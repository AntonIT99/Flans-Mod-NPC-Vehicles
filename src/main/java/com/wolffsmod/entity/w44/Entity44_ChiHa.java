package com.wolffsmod.entity.w44;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class Entity44_ChiHa extends EntityFlanVehicleNPC
{
    public Entity44_ChiHa(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.385F);
        setDriver("0 28 0 -360 360 -15 20");
        setRotatedDriverOffset("-3 0 2");
        setDriverAimSpeed("0.71 0.61 0");
        setPassenger("1 25 0 2 core -10 10 -10 10 44_Type99 PassengerGun1");
        addBarrelPosition("34 31 2.5");
        addGunOrigin("1 30 -2 -12");
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
        addLeftLinkPoint("[48,13.5,15]");
        addLeftLinkPoint("[51,10,15]");
        addLeftLinkPoint("[51,5,15]");
        addLeftLinkPoint("[48,2,15]");
        addLeftLinkPoint("[37,-9,15]");
        addLeftLinkPoint("[-47,-9,15]");
        addLeftLinkPoint("[-59,0,15]");
        addLeftLinkPoint("[-62,3,15]");
        addLeftLinkPoint("[-62,7,15]");
        addLeftLinkPoint("[-59,11,15]");
        addLeftLinkPoint("[-36,11.5,15]");
        addLeftLinkPoint("[-36,11.5,15]");
        addLeftLinkPoint("[-4,13,15]");
        addLeftLinkPoint("[26,13,15]");
        addLeftLinkPoint("[43,13.5,15]");
        addRightLinkPoint("[48,13.5,-25]");
        addRightLinkPoint("[51,10,-25]");
        addRightLinkPoint("[51,5,-25]");
        addRightLinkPoint("[48,2,-25]");
        addRightLinkPoint("[37,-9,-25]");
        addRightLinkPoint("[-47,-9,-25]");
        addRightLinkPoint("[-59,0,-25]");
        addRightLinkPoint("[-62,3,-25]");
        addRightLinkPoint("[-62,7,-25]");
        addRightLinkPoint("[-59,11,-25]");
        addRightLinkPoint("[-36,11.5,-25]");
        addRightLinkPoint("[-36,11.5,-25]");
        addRightLinkPoint("[-4,13,-25]");
        addRightLinkPoint("[26,13,-25]");
        addRightLinkPoint("[43,13.5,-25]");
        setTrackLinkLength(1.75F);
        setFixTrackLink(4);
        
    }
}
