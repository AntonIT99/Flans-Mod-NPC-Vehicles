package com.wolffsmod.entity.cvts;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class Entity11970_Navalgun_155mm_3rdYearType_SINGLE extends EntityFlanVehicleNPC
{
    public Entity11970_Navalgun_155mm_3rdYearType_SINGLE(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.0F);
        setDriver("0 28 0 -360 360 -10 75");
        setRotatedDriverOffset("20 0 0");
        addShootPointPrimary("32 18 0 turret");
        addShootParticlesPrimary("hugeexplosion 10 0 0");
        addShootParticlesPrimary("largeexplode 8 0 0");
        addShootParticlesPrimary("explode 8 0 0");
        addShootParticlesPrimary("explode 8 0 0");
        addShootParticlesPrimary("explode 8 0 0");
        addShootParticlesPrimary("explode 8 0 0");
        addShootParticlesPrimary("explode 8 0 0");
        addShootParticlesPrimary("explode 8 0 0");
        addShootParticlesPrimary("explode 9 0 0");
        addShootParticlesPrimary("explode 9 0 0");
        addShootParticlesPrimary("explode 9 0 0");
        addShootParticlesPrimary("explode 9 0 0");
        addShootParticlesPrimary("explode 9 0 0");
        addShootParticlesPrimary("explode 9 0 0");
        addShootParticlesPrimary("cloud 8 0 0");
        addShootParticlesPrimary("cloud 8 0 0");
        addShootParticlesPrimary("cloud 8 0 0");
        addShootParticlesPrimary("cloud 8 0 0");
        addShootParticlesPrimary("cloud 8 0 0");
        addShootParticlesPrimary("cloud 8 0 0");
        addShootParticlesPrimary("cloud 9 0 0");
        addShootParticlesPrimary("cloud 9 0 0");
        addShootParticlesPrimary("cloud 9 0 0");
        addShootParticlesPrimary("cloud 9 0 0");
        addShootParticlesPrimary("cloud 9 0 0");
        addShootParticlesPrimary("cloud 9 0 0");
        
    }
}
