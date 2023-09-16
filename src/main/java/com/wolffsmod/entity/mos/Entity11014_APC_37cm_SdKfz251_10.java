package com.wolffsmod.entity.mos;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class Entity11014_APC_37cm_SdKfz251_10 extends EntityFlanVehicleNPC
{
    public Entity11014_APC_37cm_SdKfz251_10(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.65F);
        setDriver("0 19 0 -25 25 -5 45");
        setRotatedDriverOffset("-10 0 -5");
        setPassenger("1 -24 8 -8 core -360 360 -89 89 dummygun DummyGun");
        setPassenger("2 -24 8 8 core -360 360 -89 89");
        setPassenger("3 -37 8 -8 core -360 360 -89 89");
        setPassenger("4 -37 8 8 core -360 360 -89 89");
        addShootPointPrimary("16 30 0 turret");
        addShootPointSecondary("");
        addShootParticlesPrimary("largeexplode 1 0 0");
        addShootParticlesPrimary("explode 1 0 0");
        addShootParticlesPrimary("explode 1 0 0");
        addShootParticlesPrimary("explode 1 0 0");
        addShootParticlesPrimary("explode 1 0 0");
        addShootParticlesPrimary("explode 1 0 0");
        addShootParticlesPrimary("explode 2 0 0");
        addShootParticlesPrimary("explode 2 0 0");
        addShootParticlesPrimary("explode 2 0 0");
        addShootParticlesPrimary("explode 2 0 0");
        addShootParticlesPrimary("explode 2 0 0");
        addShootParticlesPrimary("cloud 1 0 0");
        addShootParticlesPrimary("cloud 1 0 0");
        addShootParticlesPrimary("cloud 1 0 0");
        addShootParticlesPrimary("cloud 1 0 0");
        addShootParticlesPrimary("cloud 1 0 0");
        addShootParticlesPrimary("cloud 2 0 0");
        addShootParticlesPrimary("cloud 2 0 0");
        addShootParticlesPrimary("cloud 2 0 0");
        addShootParticlesPrimary("cloud 2 0 0");
        addShootParticlesPrimary("cloud 2 0 0");
        addShootParticlesSecondary("note 0 1 0");
        addShootParticlesSecondary("note 0 2 0");
        setTurretOrigin("0 0 0");
        
    }
}
