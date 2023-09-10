package com.wolffsmod.entity.cow;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class Entityt72a extends EntityFlanVehicleNPC
{
    public Entityt72a(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.4F);
        setDriver("0 22 0 -360 360 -6 13");
        setRotatedDriverOffset("-13 0 -10");
        setDriverAimSpeed("4.0 4.0 0");
        addBarrelPosition("138 27 0");
        addGun("32 45 12 turret 50calg");
        addGun("33 27 7 turret 30calg");
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
        addLeftLinkPoint("[62,11.5,29]");
        addLeftLinkPoint("[66,7.5,29]");
        addLeftLinkPoint("[66,2.5,29]");
        addLeftLinkPoint("[62,-1.5,29]");
        addLeftLinkPoint("[48.5,-9.5,29]");
        addLeftLinkPoint("[-43,-9.5,29]");
        addLeftLinkPoint("[-58,-3,29]");
        addLeftLinkPoint("[-62,1,29]");
        addLeftLinkPoint("[-62,6,29]");
        addLeftLinkPoint("[-58,10,29]");
        addRightLinkPoint("[62,11.5,-29]");
        addRightLinkPoint("[66,7.5,-29]");
        addRightLinkPoint("[66,2.5,-29]");
        addRightLinkPoint("[62,-1.5,-29]");
        addRightLinkPoint("[48.5,-9.5,-29]");
        addRightLinkPoint("[-43,-9.5,-29]");
        addRightLinkPoint("[-58,-3,-29]");
        addRightLinkPoint("[-62,1,-29]");
        addRightLinkPoint("[-62,6,-29]");
        addRightLinkPoint("[-58,10,-29]");
        setTrackLinkLength(5.0F);
        
    }
}
