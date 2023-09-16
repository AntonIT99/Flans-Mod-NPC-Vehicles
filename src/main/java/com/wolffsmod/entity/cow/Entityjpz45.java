package com.wolffsmod.entity.cow;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class Entityjpz45 extends EntityFlanVehicleNPC
{
    public Entityjpz45(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.5F);
        setDriver("0 11 0 -3 3 -3 10");
        setRotatedDriverOffset("31 0 -12");
        setDriverAimSpeed("1.5 2 0");
        setPassenger("1 10 28 0 turret -360 360 -15 60 type99 Type-99");
        addBarrelPosition("104 13 0.5");
        addGun("56.5 13 6 turret 30calg");
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
        addLeftLinkPoint("[44,7.5,20]");
        addLeftLinkPoint("[47,4.5,20]");
        addLeftLinkPoint("[47,-0.5,20]");
        addLeftLinkPoint("[44,-3.5,20]");
        addLeftLinkPoint("[33,-8,20]");
        addLeftLinkPoint("[-32,-8,20]");
        addLeftLinkPoint("[-45,-3.5,20]");
        addLeftLinkPoint("[-48,-0.5,20]");
        addLeftLinkPoint("[-48,4.5,20]");
        addLeftLinkPoint("[-45,7.5,20]");
        addRightLinkPoint("[44,7.5,-20]");
        addRightLinkPoint("[47,4.5,-20]");
        addRightLinkPoint("[47,-0.5,-20]");
        addRightLinkPoint("[44,-3.5,-20]");
        addRightLinkPoint("[33,-8,-20]");
        addRightLinkPoint("[-32,-8,-20]");
        addRightLinkPoint("[-45,-3.5,-20]");
        addRightLinkPoint("[-48,-0.5,-20]");
        addRightLinkPoint("[-48,4.5,-20]");
        addRightLinkPoint("[-45,7.5,-20]");
        setTrackLinkLength(2.0F);
        
    }
}
