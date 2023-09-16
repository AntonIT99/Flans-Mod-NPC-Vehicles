package com.wolffsmod.entity.cow;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class Entityt10m extends EntityFlanVehicleNPC
{
    public Entityt10m(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.45F);
        setDriver("0 44 0 -360 360 -4 15");
        setRotatedDriverOffset("-17 0 -10");
        setDriverAimSpeed("1.5 2.0 0");
        addBarrelPosition("160 36 1");
        addGun("50 38 9 turret 14.5mmgun");
        addGun("33.5 57.5 13.5 turret 14.5mmgun");
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
        addLeftLinkPoint("[48.5,10.5,30]");
        addLeftLinkPoint("[52.5,8.5,30]");
        addLeftLinkPoint("[52.5,3.5,30]");
        addLeftLinkPoint("[48.5,-0.5,30]");
        addLeftLinkPoint("[31.5,-9,30]");
        addLeftLinkPoint("[-71.5,-9,30]");
        addLeftLinkPoint("[-86.5,-4.5,30]");
        addLeftLinkPoint("[-92,0.5,30]");
        addLeftLinkPoint("[-92,5.5,30]");
        addLeftLinkPoint("[-86.5,10.5,30]");
        addLeftLinkPoint("[-62.5,10.5,30]");
        addRightLinkPoint("[48.5,10.5,-28]");
        addRightLinkPoint("[52.5,8.5,-28]");
        addRightLinkPoint("[52.5,3.5,-28]");
        addRightLinkPoint("[48.5,-0.5,-28]");
        addRightLinkPoint("[31.5,-9,-28]");
        addRightLinkPoint("[-71.5,-9,-28]");
        addRightLinkPoint("[-86.5,-4.5,-28]");
        addRightLinkPoint("[-92,0.5,-28]");
        addRightLinkPoint("[-92,5.5,-28]");
        addRightLinkPoint("[-86.5,10.5,-28]");
        addRightLinkPoint("[-62.5,10.5,-28]");
        setTrackLinkLength(3.0F);
        
    }
}
