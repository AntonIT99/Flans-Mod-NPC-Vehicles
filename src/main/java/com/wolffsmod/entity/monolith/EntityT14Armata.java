package com.wolffsmod.entity.monolith;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityT14Armata extends EntityFlanVehicleNPC
{
    public EntityT14Armata(World w)
    {
        super(w);
        setSize(3.5F, 3.0F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.4F);
        setDriver("0 30 0 -360 360 -5 25");
        setRotatedDriverOffset("0 0 0");
        setDriverAimSpeed("3.2 2 0");
        addShootPointPrimary("140 26 0 turret");
        addShootPointSecondary("23 41 0 turret twelveMM");
        addShootParticlesPrimary("largeexplode 6 0 0");
        addShootParticlesPrimary("explode 6 0 0");
        addShootParticlesPrimary("explode 6 0 0");
        addShootParticlesPrimary("explode 6 0 0");
        addShootParticlesPrimary("explode 6 0 0");
        addShootParticlesPrimary("explode 6 0 0");
        addShootParticlesPrimary("explode 6 0 0");
        addShootParticlesPrimary("explode 7 0 0");
        addShootParticlesPrimary("explode 7 0 0");
        addShootParticlesPrimary("explode 7 0 0");
        addShootParticlesPrimary("explode 7 0 0");
        addShootParticlesPrimary("explode 7 0 0");
        addShootParticlesPrimary("explode 7 0 0");
        addShootParticlesPrimary("cloud 6 0 0");
        addShootParticlesPrimary("cloud 6 0 0");
        addShootParticlesPrimary("cloud 6 0 0");
        addShootParticlesPrimary("cloud 6 0 0");
        addShootParticlesPrimary("cloud 6 0 0");
        addShootParticlesPrimary("cloud 6 0 0");
        addShootParticlesPrimary("cloud 7 0 0");
        addShootParticlesPrimary("cloud 7 0 0");
        addShootParticlesPrimary("cloud 7 0 0");
        addShootParticlesPrimary("cloud 7 0 0");
        addShootParticlesPrimary("cloud 7 0 0");
        addShootParticlesPrimary("cloud 7 0 0");
        
    }
}
