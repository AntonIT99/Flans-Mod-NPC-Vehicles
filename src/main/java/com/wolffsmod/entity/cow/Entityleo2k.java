package com.wolffsmod.entity.cow;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class Entityleo2k extends EntityFlanVehicleNPC
{
    public Entityleo2k(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.5F);
        setDriver("0 27 0 -360 360 -8 15");
        setRotatedDriverOffset("-12 0 8");
        setDriverAimSpeed("4.5 4.5 0");
        addBarrelPosition("98 27 0");
        addGun("-6 44.5 -13 turret 20milg");
        addGun("37 26.5 6 turret 30calg");
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
        addLeftLinkPoint("[43,9.5,23]");
        addLeftLinkPoint("[46,6.5,23]");
        addLeftLinkPoint("[46,1.5,23]");
        addLeftLinkPoint("[43,-1.5,23]");
        addLeftLinkPoint("[31,-9,23]");
        addLeftLinkPoint("[-49.5,-9,23]");
        addLeftLinkPoint("[-62,-1.5,23]");
        addLeftLinkPoint("[-65,1.5,23]");
        addLeftLinkPoint("[-65,6.5,23]");
        addLeftLinkPoint("[-62,9.5,23]");
        addRightLinkPoint("[43,9.5,-23]");
        addRightLinkPoint("[46,6.5,-23]");
        addRightLinkPoint("[46,1.5,-23]");
        addRightLinkPoint("[43,-1.5,-23]");
        addRightLinkPoint("[31,-9,-23]");
        addRightLinkPoint("[-49.5,-9,-23]");
        addRightLinkPoint("[-62,-1.5,-23]");
        addRightLinkPoint("[-65,1.5,-23]");
        addRightLinkPoint("[-65,6.5,-23]");
        addRightLinkPoint("[-62,9.5,-23]");
        setTrackLinkLength(3.0F);
        
    }
}
