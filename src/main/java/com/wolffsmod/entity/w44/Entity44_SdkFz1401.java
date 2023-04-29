package com.wolffsmod.entity.w44;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class Entity44_SdkFz1401 extends EntityFlanVehicleNPC
{
    public Entity44_SdkFz1401(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.58F);
        setDriver("0 21 0 -360 360 -4 70");
        setRotatedDriverOffset("-5 0 6");
        setDriverAimSpeed("0.7 0.6 0");
        addBarrelPosition("45 29 0");
        addGun("16 29 -6 turret 44_Mg34");
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
        addShootParticlesSecondary("crit 0.5 0 0");
        addLeftLinkPoint("[36.5,10,18.5]");
        addLeftLinkPoint("[37.5,7,18.5]");
        addLeftLinkPoint("[37.5,2,18.5]");
        addLeftLinkPoint("[24,-7.5,18.5]");
        addLeftLinkPoint("[-35,-7.5,18.5]");
        addLeftLinkPoint("[-50.5,-2,18.5]");
        addLeftLinkPoint("[-50.3,6,18.5]");
        addLeftLinkPoint("[-43,8,18.5]");
        addLeftLinkPoint("[-8,10,18.5]");
        addLeftLinkPoint("[17,10,18.5]");
        addLeftLinkPoint("[34,11,18.5]");
        addRightLinkPoint("[36.5,10,-17]");
        addRightLinkPoint("[37.5,7,-17]");
        addRightLinkPoint("[37.5,2,-17]");
        addRightLinkPoint("[24,-7.5,-17]");
        addRightLinkPoint("[-35,-7.5,-17]");
        addRightLinkPoint("[-50.5,-2,-17]");
        addRightLinkPoint("[-50.3,6,-17]");
        addRightLinkPoint("[-43,8,-17]");
        addRightLinkPoint("[-8,10,-17]");
        addRightLinkPoint("[17,10,-17]");
        addRightLinkPoint("[34,11,-17]");
        setTrackLinkLength(3.0F);
        
    }
}
