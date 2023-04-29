package com.wolffsmod.entity.w44;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class Entity44_Panzer2C extends EntityFlanVehicleNPC
{
    public Entity44_Panzer2C(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.44F);
        setDriver("0 18 0 -360 360 -10 20");
        setRotatedDriverOffset("0 0 5");
        setDriverAimSpeed("0.65 0.55 0");
        addBarrelPosition("40 20 -4");
        addGun("21 23 5 turret 44_Mg34");
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
        addLeftLinkPoint("[37,11,22.2]");
        addLeftLinkPoint("[40.3,10,22.2]");
        addLeftLinkPoint("[40.3,1,22.2]");
        addLeftLinkPoint("[28,-9,22.2]");
        addLeftLinkPoint("[-32,-9,22.2]");
        addLeftLinkPoint("[-46.5,-1,22.2]");
        addLeftLinkPoint("[-46.5,5,22.2]");
        addLeftLinkPoint("[-43,8,22.2]");
        addLeftLinkPoint("[-27,10,22.2]");
        addLeftLinkPoint("[30,11,22.2]");
        addLeftLinkPoint("[35,11,22.2]");
        addRightLinkPoint("[37,11,-12.2]");
        addRightLinkPoint("[40.3,10,-12.2]");
        addRightLinkPoint("[40.3,1,-12.2]");
        addRightLinkPoint("[28,-9,-12.2]");
        addRightLinkPoint("[-32,-9,-12.2]");
        addRightLinkPoint("[-46.5,-1,-12.2]");
        addRightLinkPoint("[-46.5,5,-12.2]");
        addRightLinkPoint("[-43,8,-12.2]");
        addRightLinkPoint("[-27,10,-12.2]");
        addRightLinkPoint("[30,11,-12.2]");
        addRightLinkPoint("[35,11,-12.2]");
        setTrackLinkLength(2.75F);
        setFixTrackLink(4);
        
    }
}
