package com.wolffsmod.entity.cow;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityPantherG extends EntityFlanVehicleNPC
{
    public EntityPantherG(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.4F);
        setDriver("0 45 0 -360 360 -10 12");
        setRotatedDriverOffset("-9 0 -7.5");
        setDriverAimSpeed("1 1.5 0");
        addBarrelPosition("126 45.5 0");
        addGun("32 40.5 11 turret 30calg");
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
        addLeftLinkPoint("[63,13,25]");
        addLeftLinkPoint("[67.3,10,25]");
        addLeftLinkPoint("[67.3,3,25]");
        addLeftLinkPoint("[50,-9,25]");
        addLeftLinkPoint("[39,-9,25]");
        addLeftLinkPoint("[-40,-9,25]");
        addLeftLinkPoint("[-52,1,25]");
        addLeftLinkPoint("[-52,6,25]");
        addLeftLinkPoint("[-46,12,25]");
        addLeftLinkPoint("[36,10,25]");
        addLeftLinkPoint("[58,13,25]");
        addRightLinkPoint("[63,13,-25]");
        addRightLinkPoint("[67.3,10,-25]");
        addRightLinkPoint("[67.3,3,-25]");
        addRightLinkPoint("[50,-9,-25]");
        addRightLinkPoint("[39,-9,-25]");
        addRightLinkPoint("[-40,-9,-25]");
        addRightLinkPoint("[-52,1,-25]");
        addRightLinkPoint("[-52,6,-25]");
        addRightLinkPoint("[-46,12,-25]");
        addRightLinkPoint("[36,10,-25]");
        addRightLinkPoint("[58,13,-25]");
        setTrackLinkLength(4.0F);
        setFixTrackLink(4);
        
    }
}
