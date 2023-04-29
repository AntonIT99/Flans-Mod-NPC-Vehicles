package com.wolffsmod.entity.w44;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class Entity44_Type3HoNi3 extends EntityFlanVehicleNPC
{
    public Entity44_Type3HoNi3(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.35F);
        setDriver("-6 29 -8 -7 7 -10 20");
        setRotatedDriverOffset("0 0 0");
        setDriverAimSpeed("0.75 0.65 0");
        setPassenger("1 -8 33 8 core -30 30 -10 25 44_Type99 PassengerGun1");
        addBarrelPosition("55 36 0");
        addGunOrigin("1 8 27 8");
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
        addLeftLinkPoint("[36,13.5,21]");
        addLeftLinkPoint("[39,10,21]");
        addLeftLinkPoint("[39,5,21]");
        addLeftLinkPoint("[36,2,21]");
        addLeftLinkPoint("[25,-9,21]");
        addLeftLinkPoint("[-59,-9,21]");
        addLeftLinkPoint("[-71,0,21]");
        addLeftLinkPoint("[-74,3,21]");
        addLeftLinkPoint("[-74,7,21]");
        addLeftLinkPoint("[-71,11,21]");
        addLeftLinkPoint("[-48,11.5,21]");
        addLeftLinkPoint("[-48,11.5,21]");
        addLeftLinkPoint("[-16,13,21]");
        addLeftLinkPoint("[14,13,21]");
        addLeftLinkPoint("[21,13.5,21]");
        addRightLinkPoint("[36,13.5,-21]");
        addRightLinkPoint("[39,10,-21]");
        addRightLinkPoint("[39,5,-21]");
        addRightLinkPoint("[36,2,-21]");
        addRightLinkPoint("[25,-9,-21]");
        addRightLinkPoint("[-59,-9,-21]");
        addRightLinkPoint("[-71,0,-21]");
        addRightLinkPoint("[-74,3,-21]");
        addRightLinkPoint("[-74,7,-21]");
        addRightLinkPoint("[-71,11,-21]");
        addRightLinkPoint("[-48,11.5,-21]");
        addRightLinkPoint("[-48,11.5,-21]");
        addRightLinkPoint("[-16,13,-21]");
        addRightLinkPoint("[14,13,-21]");
        addRightLinkPoint("[21,13.5,-21]");
        setTrackLinkLength(1.75F);
        setFixTrackLink(4);
        
    }
}
