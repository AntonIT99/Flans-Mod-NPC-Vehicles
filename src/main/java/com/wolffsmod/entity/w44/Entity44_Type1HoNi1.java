package com.wolffsmod.entity.w44;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class Entity44_Type1HoNi1 extends EntityFlanVehicleNPC
{
    public Entity44_Type1HoNi1(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.395F);
        setDriver("-9 29 -10 -7 7 -10 20");
        setRotatedDriverOffset("0 0 0");
        setDriverAimSpeed("0.75 0.65 0");
        setPassenger("1 -9 35 9 core -30 30 -10 25 44_Type99 PassengerGun1");
        addBarrelPosition("55 35 0");
        addGunOrigin("1 7 30 9");
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
        addLeftLinkPoint("[42,13.5,21]");
        addLeftLinkPoint("[45,10,21]");
        addLeftLinkPoint("[45,5,21]");
        addLeftLinkPoint("[42,2,21]");
        addLeftLinkPoint("[31,-9,21]");
        addLeftLinkPoint("[-53,-9,21]");
        addLeftLinkPoint("[-65,0,21]");
        addLeftLinkPoint("[-68,3,21]");
        addLeftLinkPoint("[-68,7,21]");
        addLeftLinkPoint("[-65,11,21]");
        addLeftLinkPoint("[-42,11.5,21]");
        addLeftLinkPoint("[-42,11.5,21]");
        addLeftLinkPoint("[-10,13,21]");
        addLeftLinkPoint("[20,13,21]");
        addLeftLinkPoint("[27,13.5,21]");
        addRightLinkPoint("[42,13.5,-21]");
        addRightLinkPoint("[45,10,-21]");
        addRightLinkPoint("[45,5,-21]");
        addRightLinkPoint("[42,2,-21]");
        addRightLinkPoint("[31,-9,-21]");
        addRightLinkPoint("[-53,-9,-21]");
        addRightLinkPoint("[-65,0,-21]");
        addRightLinkPoint("[-68,3,-21]");
        addRightLinkPoint("[-68,7,-21]");
        addRightLinkPoint("[-65,11,-21]");
        addRightLinkPoint("[-42,11.5,-21]");
        addRightLinkPoint("[-42,11.5,-21]");
        addRightLinkPoint("[-10,13,-21]");
        addRightLinkPoint("[20,13,-21]");
        addRightLinkPoint("[27,13.5,-21]");
        setTrackLinkLength(1.75F);
        setFixTrackLink(4);
        
    }
}
