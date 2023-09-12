package com.wolffsmod.entity.cvts;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class Entity11950_AAGun_88mm_FlaK18 extends EntityFlanVehicleNPC
{
    public Entity11950_AAGun_88mm_FlaK18(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.0F);
        setDriver("0 2 0 -360 360 -3 85");
        setRotatedDriverOffset("0 0 17");
        addShootPointPrimary("24 18 0 turret");
        addShootPointSecondary("");
        addShootParticlesPrimary("largeexplode 4 0 0");
        addShootParticlesPrimary("explode 4 0 0");
        addShootParticlesPrimary("explode 4 0 0");
        addShootParticlesPrimary("explode 4 0 0");
        addShootParticlesPrimary("explode 4 0 0");
        addShootParticlesPrimary("explode 4 0 0");
        addShootParticlesPrimary("explode 4 0 0");
        addShootParticlesPrimary("explode 5 0 0");
        addShootParticlesPrimary("explode 5 0 0");
        addShootParticlesPrimary("explode 5 0 0");
        addShootParticlesPrimary("explode 5 0 0");
        addShootParticlesPrimary("explode 5 0 0");
        addShootParticlesPrimary("explode 5 0 0");
        addShootParticlesPrimary("cloud 4 0 0");
        addShootParticlesPrimary("cloud 4 0 0");
        addShootParticlesPrimary("cloud 4 0 0");
        addShootParticlesPrimary("cloud 4 0 0");
        addShootParticlesPrimary("cloud 4 0 0");
        addShootParticlesPrimary("cloud 4 0 0");
        addShootParticlesPrimary("cloud 5 0 0");
        addShootParticlesPrimary("cloud 5 0 0");
        addShootParticlesPrimary("cloud 5 0 0");
        addShootParticlesPrimary("cloud 5 0 0");
        addShootParticlesPrimary("cloud 5 0 0");
        addShootParticlesPrimary("cloud 5 0 0");
        setRotateWheels(false);
        
    }
}
