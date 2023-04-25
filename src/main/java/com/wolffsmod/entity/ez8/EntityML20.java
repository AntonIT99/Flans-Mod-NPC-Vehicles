package com.wolffsmod.entity.ez8;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityML20 extends EntityFlanVehicleNPC
{
    public EntityML20(World w)
    {
        super(w);
        setSize(2.8F, 2.2F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.25F);
        setDriver("0 1 0 -29 29 -2 45");
        setRotatedDriverOffset("-10 0 -8");
        addShootPointPrimary("20 14 0 turret");
        
        addShootParticlesPrimary("largeexplode 5 0 0");
        addShootParticlesPrimary("hugeexplosion 7 0 0");
        addShootParticlesPrimary("explode 4 0 0");
        addShootParticlesPrimary("explode 4 0 0");
        addShootParticlesPrimary("explode 4 0 0");
        addShootParticlesPrimary("explode 4 0 0");
        addShootParticlesPrimary("explode 4 0 0");
        addShootParticlesPrimary("explode 4 1 0");
        addShootParticlesPrimary("explode 4 1 0");
        addShootParticlesPrimary("explode 4 1 0");
        addShootParticlesPrimary("explode 4 1 0");
        addShootParticlesPrimary("explode 4 1 0");
        addShootParticlesPrimary("explode 4 -1 0");
        addShootParticlesPrimary("explode 4 -1 0");
        addShootParticlesPrimary("explode 4 -1 0");
        addShootParticlesPrimary("explode 4 -1 0");
        addShootParticlesPrimary("explode 4 -1 0");
        addShootParticlesPrimary("explode 4 0 1");
        addShootParticlesPrimary("explode 4 0 1");
        addShootParticlesPrimary("explode 4 0 1");
        addShootParticlesPrimary("explode 4 0 1");
        addShootParticlesPrimary("explode 4 0 1");
        addShootParticlesPrimary("explode 4 0 -1");
        addShootParticlesPrimary("explode 4 0 -1");
        addShootParticlesPrimary("explode 4 0 -1");
        addShootParticlesPrimary("explode 4 0 -1");
        addShootParticlesPrimary("explode 4 0 -1");
        addShootParticlesPrimary("explode 5 0 0");
        addShootParticlesPrimary("explode 5 0 0");
        addShootParticlesPrimary("explode 5 0 0");
        addShootParticlesPrimary("explode 5 0 0");
        addShootParticlesPrimary("explode 5 0 0");
        addShootParticlesPrimary("explode 5 1 0");
        addShootParticlesPrimary("explode 5 1 0");
        addShootParticlesPrimary("explode 5 1 0");
        addShootParticlesPrimary("explode 5 1 0");
        addShootParticlesPrimary("explode 5 1 0");
        addShootParticlesPrimary("explode 5 1 1");
        addShootParticlesPrimary("explode 5 1 1");
        addShootParticlesPrimary("explode 5 1 1");
        addShootParticlesPrimary("explode 5 1 1");
        addShootParticlesPrimary("explode 5 1 1");
        addShootParticlesPrimary("explode 5 1 -1");
        addShootParticlesPrimary("explode 5 1 -1");
        addShootParticlesPrimary("explode 5 1 -1");
        addShootParticlesPrimary("explode 5 1 -1");
        addShootParticlesPrimary("explode 5 1 -1");
        addShootParticlesPrimary("explode 5 -1 0");
        addShootParticlesPrimary("explode 5 -1 0");
        addShootParticlesPrimary("explode 5 -1 0");
        addShootParticlesPrimary("explode 5 -1 0");
        addShootParticlesPrimary("explode 5 -1 0");
        addShootParticlesPrimary("explode 5 -1 -1");
        addShootParticlesPrimary("explode 5 -1 -1");
        addShootParticlesPrimary("explode 5 -1 -1");
        addShootParticlesPrimary("explode 5 -1 -1");
        addShootParticlesPrimary("explode 5 -1 -1");
        addShootParticlesPrimary("explode 5 -1 1");
        addShootParticlesPrimary("explode 5 -1 1");
        addShootParticlesPrimary("explode 5 -1 1");
        addShootParticlesPrimary("explode 5 -1 1");
        addShootParticlesPrimary("explode 5 -1 1");
        addShootParticlesPrimary("explode 5 0 1");
        addShootParticlesPrimary("explode 5 0 1");
        addShootParticlesPrimary("explode 5 0 1");
        addShootParticlesPrimary("explode 5 0 1");
        addShootParticlesPrimary("explode 5 0 1");
        addShootParticlesPrimary("explode 5 0 -1");
        addShootParticlesPrimary("explode 5 0 -1");
        addShootParticlesPrimary("explode 5 0 -1");
        addShootParticlesPrimary("explode 5 0 -1");
        addShootParticlesPrimary("explode 5 0 -1");
        addShootParticlesPrimary("cloud 4 0 0");
        addShootParticlesPrimary("cloud 4 0 0");
        addShootParticlesPrimary("cloud 4 0 0");
        addShootParticlesPrimary("cloud 4 0 0");
        addShootParticlesPrimary("cloud 4 0 0");
        addShootParticlesPrimary("cloud 4 1 0");
        addShootParticlesPrimary("cloud 4 1 0");
        addShootParticlesPrimary("cloud 4 1 0");
        addShootParticlesPrimary("cloud 4 1 0");
        addShootParticlesPrimary("cloud 4 1 0");
        addShootParticlesPrimary("cloud 4 -1 0");
        addShootParticlesPrimary("cloud 4 -1 0");
        addShootParticlesPrimary("cloud 4 -1 0");
        addShootParticlesPrimary("cloud 4 -1 0");
        addShootParticlesPrimary("cloud 4 -1 0");
        addShootParticlesPrimary("cloud 4 0 1");
        addShootParticlesPrimary("cloud 4 0 1");
        addShootParticlesPrimary("cloud 4 0 1");
        addShootParticlesPrimary("cloud 4 0 1");
        addShootParticlesPrimary("cloud 4 0 1");
        addShootParticlesPrimary("cloud 4 0 -1");
        addShootParticlesPrimary("cloud 4 0 -1");
        addShootParticlesPrimary("cloud 4 0 -1");
        addShootParticlesPrimary("cloud 4 0 -1");
        addShootParticlesPrimary("cloud 4 0 -1");
        addShootParticlesPrimary("cloud 5 0 0");
        addShootParticlesPrimary("cloud 5 0 0");
        addShootParticlesPrimary("cloud 5 0 0");
        addShootParticlesPrimary("cloud 5 0 0");
        addShootParticlesPrimary("cloud 5 0 0");
        addShootParticlesPrimary("cloud 5 1 0");
        addShootParticlesPrimary("cloud 5 1 0");
        addShootParticlesPrimary("cloud 5 1 0");
        addShootParticlesPrimary("cloud 5 1 0");
        addShootParticlesPrimary("cloud 5 1 0");
        addShootParticlesPrimary("cloud 5 1 1");
        addShootParticlesPrimary("cloud 5 1 1");
        addShootParticlesPrimary("cloud 5 1 1");
        addShootParticlesPrimary("cloud 5 1 1");
        addShootParticlesPrimary("cloud 5 1 1");
        addShootParticlesPrimary("cloud 5 1 -1");
        addShootParticlesPrimary("cloud 5 1 -1");
        addShootParticlesPrimary("cloud 5 1 -1");
        addShootParticlesPrimary("cloud 5 1 -1");
        addShootParticlesPrimary("cloud 5 1 -1");
        addShootParticlesPrimary("cloud 5 -1 0");
        addShootParticlesPrimary("cloud 5 -1 0");
        addShootParticlesPrimary("cloud 5 -1 0");
        addShootParticlesPrimary("cloud 5 -1 0");
        addShootParticlesPrimary("cloud 5 -1 0");
        addShootParticlesPrimary("cloud 5 -1 -1");
        addShootParticlesPrimary("cloud 5 -1 -1");
        addShootParticlesPrimary("cloud 5 -1 -1");
        addShootParticlesPrimary("cloud 5 -1 -1");
        addShootParticlesPrimary("cloud 5 -1 -1");
        addShootParticlesPrimary("cloud 5 -1 1");
        addShootParticlesPrimary("cloud 5 -1 1");
        addShootParticlesPrimary("cloud 5 -1 1");
        addShootParticlesPrimary("cloud 5 -1 1");
        addShootParticlesPrimary("cloud 5 -1 1");
        addShootParticlesPrimary("cloud 5 0 1");
        addShootParticlesPrimary("cloud 5 0 1");
        addShootParticlesPrimary("cloud 5 0 1");
        addShootParticlesPrimary("cloud 5 0 1");
        addShootParticlesPrimary("cloud 5 0 1");
        addShootParticlesPrimary("cloud 5 0 -1");
        addShootParticlesPrimary("cloud 5 0 -1");
        addShootParticlesPrimary("cloud 5 0 -1");
        addShootParticlesPrimary("cloud 5 0 -1");
        addShootParticlesPrimary("cloud 5 0 -1");
        
    }
}
