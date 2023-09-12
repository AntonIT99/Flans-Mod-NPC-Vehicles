package com.wolffsmod.entity.mos;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class Entity11021_MediumTank_Type89 extends EntityFlanVehicleNPC
{
    public Entity11021_MediumTank_Type89(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.45F);
        setDriver("0 16 0 -360 360 -10 20");
        setRotatedDriverOffset("0 0 5");
        setPassenger("1 -24 16 8 core -360 360 -89 89 dummygun DummyGun");
        setPassenger("2 -24 16 -8 core -360 360 -89 89");
        setPassenger("3 -48 8 0 core -360 360 -89 89");
        addShootPointPrimary("31 24 0 turret");
        addShootPointSecondary("31 24 0 turret");
        addShootParticlesPrimary("largeexplode 0 0 0");
        addShootParticlesPrimary("explode 0 0 0");
        addShootParticlesPrimary("explode 0 0 0");
        addShootParticlesPrimary("explode 0 0 0");
        addShootParticlesPrimary("explode 0 0 0");
        addShootParticlesPrimary("explode 0 0 0");
        addShootParticlesPrimary("explode 0 0 0");
        addShootParticlesPrimary("explode 1 0 0");
        addShootParticlesPrimary("explode 1 0 0");
        addShootParticlesPrimary("explode 1 0 0");
        addShootParticlesPrimary("explode 1 0 0");
        addShootParticlesPrimary("explode 1 0 0");
        addShootParticlesPrimary("explode 1 0 0");
        addShootParticlesPrimary("cloud 0 0 0");
        addShootParticlesPrimary("cloud 0 0 0");
        addShootParticlesPrimary("cloud 0 0 0");
        addShootParticlesPrimary("cloud 0 0 0");
        addShootParticlesPrimary("cloud 0 0 0");
        addShootParticlesPrimary("cloud 0 0 0");
        addShootParticlesPrimary("cloud 1 0 0");
        addShootParticlesPrimary("cloud 1 0 0");
        addShootParticlesPrimary("cloud 1 0 0");
        addShootParticlesPrimary("cloud 1 0 0");
        addShootParticlesPrimary("cloud 1 0 0");
        addShootParticlesPrimary("cloud 1 0 0");
        
    }
}
