package com.wolffsmod.entity.cow;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class Entitym103 extends EntityFlanVehicleNPC
{
    public Entitym103(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.4F);
        setDriver("0 47 0 -360 360 -8 15");
        setRotatedDriverOffset("-30 0 0");
        setDriverAimSpeed("2 2.5 0");
        addBarrelPosition("153.6 31 0");
        addGun("24 42 6 turret 50calg");
        addGun("24 42 -6 turret 30calg");
        addGun("13.8 70.2 0 turret 30calg");
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
        addLeftLinkPoint("[34,15.5,30.5]");
        addLeftLinkPoint("[42,7.5,30.5]");
        addLeftLinkPoint("[42,3.5,30.5]");
        addLeftLinkPoint("[37,-1.5,30.5]");
        addLeftLinkPoint("[20,-9.5,30.5]");
        addLeftLinkPoint("[-59,-9.5,30.5]");
        addLeftLinkPoint("[-74,-8,30.5]");
        addLeftLinkPoint("[-85,0.5,30.5]");
        addLeftLinkPoint("[-90,5.5,30.5]");
        addLeftLinkPoint("[-90,10.5,30.5]");
        addLeftLinkPoint("[-85,15.5,30.5]");
        addRightLinkPoint("[34,15.5,-30.5]");
        addRightLinkPoint("[42,7.5,-30.5]");
        addRightLinkPoint("[42,3.5,-30.5]");
        addRightLinkPoint("[37,-1.5,-30.5]");
        addRightLinkPoint("[20,-9.5,-30.5]");
        addRightLinkPoint("[-59,-9.5,-30.5]");
        addRightLinkPoint("[-74,-8,-30.5]");
        addRightLinkPoint("[-85,0.5,-30.5]");
        addRightLinkPoint("[-90,5.5,-30.5]");
        addRightLinkPoint("[-90,10.5,-30.5]");
        addRightLinkPoint("[-85,15.5,-30.5]");
        setTrackLinkLength(3.0F);
        
    }
}
