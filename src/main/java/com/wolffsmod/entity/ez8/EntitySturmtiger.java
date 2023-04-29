package com.wolffsmod.entity.ez8;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntitySturmtiger extends EntityFlanVehicleNPC
{
    public EntitySturmtiger(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.4F);
        setDriver("-38 23 -11 -10 10 0 85");
        setRotatedDriverOffset("0 0 0");
        addShootPointPrimary("0 23 0 turret");
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
        addShootParticlesPrimary("flame 1 0 0");
        addShootParticlesPrimary("flame 1 0 0");
        addShootParticlesPrimary("flame 1 0 0");
        addShootParticlesPrimary("flame 1 0 0");
        addShootParticlesPrimary("flame 1 0 0");
        addShootParticlesPrimary("flame 2 0 0");
        addShootParticlesPrimary("flame 2 0 0");
        addShootParticlesPrimary("flame 2 0 0");
        addShootParticlesPrimary("flame 2 0 0");
        addShootParticlesPrimary("flame 2 0 0");
        
    }
}
