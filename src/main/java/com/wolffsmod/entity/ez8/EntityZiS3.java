package com.wolffsmod.entity.ez8;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityZiS3 extends EntityFlanVehicleNPC
{
    public EntityZiS3(World w)
    {
        super(w);
        setSize(2.2F, 1.8F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.35F);
        setDriver("0 -6 0 -27 27 -5 37");
        setRotatedDriverOffset("-5 0 -7");
        addShootPointPrimary("26 6 0 turret");
        
        addShootParticlesPrimary("largeexplode 3 0 0");
        addShootParticlesPrimary("explode 3 0 0");
        addShootParticlesPrimary("explode 2 0 1");
        addShootParticlesPrimary("explode 2 0 -1");
        addShootParticlesPrimary("explode 3 0 0");
        addShootParticlesPrimary("explode 2 0 1");
        addShootParticlesPrimary("explode 2 0 -1");
        addShootParticlesPrimary("explode 3 0 0");
        addShootParticlesPrimary("explode 2 0 1");
        addShootParticlesPrimary("explode 2 0 -1");
        addShootParticlesPrimary("explode 3 0 0");
        addShootParticlesPrimary("explode 2 0 1");
        addShootParticlesPrimary("explode 2 0 -1");
        addShootParticlesPrimary("explode 3 0 0");
        addShootParticlesPrimary("explode 2 0 1");
        addShootParticlesPrimary("explode 2 0 -1");
        addShootParticlesPrimary("explode 3 0 0");
        addShootParticlesPrimary("explode 2 0 1");
        addShootParticlesPrimary("explode 2 0 -1");
        addShootParticlesPrimary("explode 3 0 0");
        addShootParticlesPrimary("explode 2 0 1");
        addShootParticlesPrimary("explode 2 0 -1");
        addShootParticlesPrimary("explode 3 0 0");
        addShootParticlesPrimary("explode 2 0 1");
        addShootParticlesPrimary("explode 2 0 -1");
        addShootParticlesPrimary("cloud 3 0 0");
        addShootParticlesPrimary("cloud 2 0 1");
        addShootParticlesPrimary("cloud 2 0 -1");
        addShootParticlesPrimary("cloud 3 0 0");
        addShootParticlesPrimary("cloud 2 0 1");
        addShootParticlesPrimary("cloud 2 0 -1");
        addShootParticlesPrimary("cloud 3 0 0");
        addShootParticlesPrimary("cloud 2 0 1");
        addShootParticlesPrimary("cloud 2 0 -1");
        addShootParticlesPrimary("cloud 3 0 0");
        addShootParticlesPrimary("cloud 2 0 1");
        addShootParticlesPrimary("cloud 2 0 -1");
        addShootParticlesPrimary("cloud 3 0 0");
        addShootParticlesPrimary("cloud 2 0 1");
        addShootParticlesPrimary("cloud 2 0 -1");
        addShootParticlesPrimary("cloud 3 0 0");
        addShootParticlesPrimary("cloud 3 0 0");
        addShootParticlesPrimary("cloud 3 0 0");
        
    }
}
