package com.wolffsmod.entity.cow;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class Entitydickermax extends EntityFlanVehicleNPC
{
    public Entitydickermax(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.5F);
        setDriver("0 18 0 -2 2 -15 12");
        setRotatedDriverOffset("1 0 -11");
        setDriverAimSpeed("1.5 2 0");
        setPassenger("1 10 28 0 turret -360 360 -15 60 type99 Type-99");
        addBarrelPosition("83 32 0");
        addGunOrigin("1 10 24 0");
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
        addLeftLinkPoint("[42,12,24]");
        addLeftLinkPoint("[45,6,24]");
        addLeftLinkPoint("[45,6,24]");
        addLeftLinkPoint("[42,-2,24]");
        addLeftLinkPoint("[27,-9,24]");
        addLeftLinkPoint("[-54,-9,24]");
        addLeftLinkPoint("[-70,-2,24]");
        addLeftLinkPoint("[-73,2,24]");
        addLeftLinkPoint("[-73,6,24]");
        addLeftLinkPoint("[-70,10,24]");
        addLeftLinkPoint("[-48,12,24]");
        addLeftLinkPoint("[30,12,24]");
        addLeftLinkPoint("[38,14,24]");
        addRightLinkPoint("[42,12,-24]");
        addRightLinkPoint("[45,6,-24]");
        addRightLinkPoint("[45,6,-24]");
        addRightLinkPoint("[42,-2,-24]");
        addRightLinkPoint("[27,-9,-24]");
        addRightLinkPoint("[-54,-9,-24]");
        addRightLinkPoint("[-70,-2,-24]");
        addRightLinkPoint("[-73,2,-24]");
        addRightLinkPoint("[-73,6,-24]");
        addRightLinkPoint("[-70,10,-24]");
        addRightLinkPoint("[-48,12,-24]");
        addRightLinkPoint("[30,12,-24]");
        addRightLinkPoint("[38,14,-24]");
        setTrackLinkLength(2.0F);
        
    }
}
