package com.wolffsmod.entity.w44;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityOstwind extends EntityFlanVehicleNPC
{
    public EntityOstwind(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.3F);
        setDriver("0 26 0 -360 360 -15 80");
        setRotatedDriverOffset("0 0 13");
        setDriverAimSpeed("1.67 1.67 0");
        setPassenger("1 26 6 13 core -10 10 -10 10 MG34Tank PassengerGun1");
        setPassenger("2 0 27 0 turret -360 360 -10 80");
        setPassengerAimSpeed("2 8.5 2.5 0");
        addBarrelPosition("50 29 0");
        addGunOrigin("1 36 -7 11");
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
        addLeftLinkPoint("[48,12,23.2]");
        addLeftLinkPoint("[50.3,10,23.2]");
        addLeftLinkPoint("[50.3,3,23.2]");
        addLeftLinkPoint("[39,-9,23.2]");
        addLeftLinkPoint("[-30,-9,23.2]");
        addLeftLinkPoint("[-47.5,1,23.2]");
        addLeftLinkPoint("[-47.5,6,23.2]");
        addLeftLinkPoint("[-43,10,23.2]");
        addLeftLinkPoint("[-40,11,23.2]");
        addLeftLinkPoint("[30,13,23.2]");
        addLeftLinkPoint("[45,12,23.2]");
        addRightLinkPoint("[48,12,-23.2]");
        addRightLinkPoint("[50.3,10,-23.2]");
        addRightLinkPoint("[50.3,3,-23.2]");
        addRightLinkPoint("[45,-5,-23.2]");
        addRightLinkPoint("[39,-9,-23.2]");
        addRightLinkPoint("[-30,-9,-23.2]");
        addRightLinkPoint("[-47.5,1,-23.2]");
        addRightLinkPoint("[-47.5,6,-23.2]");
        addRightLinkPoint("[-43,10,-23.2]");
        addRightLinkPoint("[-40,11,-23.2]");
        addRightLinkPoint("[30,13,-23.2]");
        addRightLinkPoint("[45,12,-23.2]");
        setTrackLinkLength(3.0F);
        setFixTrackLink(4);
        
    }
}
