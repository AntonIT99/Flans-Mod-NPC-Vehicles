package com.wolffsmod.entity.w44;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class Entity44_Type4HoRo extends EntityFlanVehicleNPC
{
    public Entity44_Type4HoRo(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.37F);
        setDriver("-7 20 12 -3 3 -10 20");
        setRotatedDriverOffset("0 0 0");
        setDriverAimSpeed("0.28 0.18 0");
        setPassenger("1 -21 33 -10 core -30 30 -10 25 44_Type99 PassengerGun1");
        addBarrelPosition("35 34 0");
        addGunOrigin("1 -9 49 -120");
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
        addLeftLinkPoint("[38,13.5,21.5]");
        addLeftLinkPoint("[41,10,21.5]");
        addLeftLinkPoint("[41,5,21.5]");
        addLeftLinkPoint("[38,2,21.5]");
        addLeftLinkPoint("[27,-9,21.5]");
        addLeftLinkPoint("[-57,-9,21.5]");
        addLeftLinkPoint("[-69,0,21.5]");
        addLeftLinkPoint("[-72,3,21.5]");
        addLeftLinkPoint("[-72,7,21.5]");
        addLeftLinkPoint("[-69,11,21.5]");
        addLeftLinkPoint("[-46,11.5,21.5]");
        addLeftLinkPoint("[-46,11.5,21.5]");
        addLeftLinkPoint("[-14,13,21.5]");
        addLeftLinkPoint("[16,13,21.5]");
        addLeftLinkPoint("[23,13.5,21.5]");
        addRightLinkPoint("[38,13.5,-19]");
        addRightLinkPoint("[41,10,-19]");
        addRightLinkPoint("[41,5,-19]");
        addRightLinkPoint("[38,2,-19]");
        addRightLinkPoint("[27,-9,-19]");
        addRightLinkPoint("[-57,-9,-19]");
        addRightLinkPoint("[-69,0,-19]");
        addRightLinkPoint("[-72,3,-19]");
        addRightLinkPoint("[-72,7,-19]");
        addRightLinkPoint("[-69,11,-19]");
        addRightLinkPoint("[-46,11.5,-19]");
        addRightLinkPoint("[-46,11.5,-19]");
        addRightLinkPoint("[-14,13,-19]");
        addRightLinkPoint("[16,13,-19]");
        addRightLinkPoint("[23,13.5,-19]");
        setTrackLinkLength(1.75F);
        setFixTrackLink(4);
        
    }
}
