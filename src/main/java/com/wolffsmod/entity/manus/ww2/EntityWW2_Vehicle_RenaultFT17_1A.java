package com.wolffsmod.entity.manus.ww2;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityWW2_Vehicle_RenaultFT17_1A extends EntityFlanVehicleNPC
{
    public EntityWW2_Vehicle_RenaultFT17_1A(World w)
    {
        super(w);
        setSize(2.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.45F);
        setDriver("0 18 0 -360 360 -10 35");
        setRotatedDriverOffset("-2 0 -1");
        setPassenger("1 -24 17 8 core -360 360 -89 89 dummygun DummyGun");
        setPassenger("2 -24 17 -8 core -360 360 -89 89");
        setPassenger("3 -48 12 0 core -360 360 -89 89");
        addShootPointPrimary("18 24 1 turret");
        addShootPointSecondary("");
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
