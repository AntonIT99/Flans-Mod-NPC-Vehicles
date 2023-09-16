package com.wolffsmod.entity.w44;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityM7Priest extends EntityFlanVehicleNPC
{
    public EntityM7Priest(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.62F);
        setDriver("23 20 4 0 0 -7 65");
        setRotatedDriverOffset("19 0 0");
        setDriverAimSpeed("0.84 0.74 0");
        setPassenger("1 21 24 27 core -30 30 -9 20 m1919 PassengerGun1");
        setPassenger("2 23 20 4 turret -360 360 0 0");
        setPassengerAimSpeed("1 6.5 2.5 0");
        setPassengerAimSpeed("2 2.5 2.5 0");
        setPassengerAimSpeed("1 1.0 1.0 0");
        addBarrelPosition("42 41 0");
        addGunOrigin("1 10 15 25");
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
        addShootParticlesSecondary("crit 0.5 0 0");
        addLeftLinkPoint("[45.5,9,28.1]");
        addLeftLinkPoint("[48.5,7,28.1]");
        addLeftLinkPoint("[48.5,2,28.1]");
        addLeftLinkPoint("[38,-7.5,28.1]");
        addLeftLinkPoint("[-33,-7.5,28.1]");
        addLeftLinkPoint("[-43.5,1,28.1]");
        addLeftLinkPoint("[-43.5,6,28.1]");
        addLeftLinkPoint("[-40,9,28.1]");
        addLeftLinkPoint("[-35,9,28.1]");
        addLeftLinkPoint("[30,9,28.1]");
        addLeftLinkPoint("[37,9,28.1]");
        addRightLinkPoint("[45.5,9,-9.1]");
        addRightLinkPoint("[48.5,7,-9.1]");
        addRightLinkPoint("[48.5,2,-9.1]");
        addRightLinkPoint("[38,-7.5,-9.1]");
        addRightLinkPoint("[-33,-7.5,-9.1]");
        addRightLinkPoint("[-43.5,1,-9.1]");
        addRightLinkPoint("[-43.5,6,-9.1]");
        addRightLinkPoint("[-40,9,-9.1]");
        addRightLinkPoint("[-35,9,-9.1]");
        addRightLinkPoint("[30,9,-9.1]");
        addRightLinkPoint("[37,9,-9.1]");
        setTrackLinkLength(3.0F);
        setFixTrackLink(4);
        
    }
}
