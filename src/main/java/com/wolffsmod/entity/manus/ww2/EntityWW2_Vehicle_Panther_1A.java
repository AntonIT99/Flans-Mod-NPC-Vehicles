package com.wolffsmod.entity.manus.ww2;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityWW2_Vehicle_Panther_1A extends EntityFlanVehicleNPC
{
    public EntityWW2_Vehicle_Panther_1A(World w)
    {
        super(w);
        setSize(3.5F, 2.8F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.425F);
        setDriver("0 23 0 -360 360 -8 20");
        setRotatedDriverOffset("-3 0 -5");
        setPassenger("1 -30 21 12 core -360 360 -89 89 dummygun DummyGun");
        setPassenger("2 -30 21 -12 core -360 360 -89 89");
        addShootPointPrimary("34 28 0 turret");
        addShootPointSecondary("34 28 4 turret");
        addShootParticlesPrimary("largeexplode 5 0 0");
        addShootParticlesPrimary("explode 4 0 0");
        addShootParticlesPrimary("explode 3 0 1");
        addShootParticlesPrimary("explode 3 0 -1");
        addShootParticlesPrimary("explode 4 0 0");
        addShootParticlesPrimary("explode 3 0 1");
        addShootParticlesPrimary("explode 3 0 -1");
        addShootParticlesPrimary("explode 4 0 0");
        addShootParticlesPrimary("explode 3 0 1");
        addShootParticlesPrimary("explode 3 0 -1");
        addShootParticlesPrimary("explode 4 0 0");
        addShootParticlesPrimary("explode 3 0 1");
        addShootParticlesPrimary("explode 3 0 -1");
        addShootParticlesPrimary("explode 4 0 0");
        addShootParticlesPrimary("explode 3 0 1");
        addShootParticlesPrimary("explode 3 0 -1");
        addShootParticlesPrimary("explode 4 0 0");
        addShootParticlesPrimary("explode 3 0 1");
        addShootParticlesPrimary("explode 3 0 -1");
        addShootParticlesPrimary("explode 4 0 0");
        addShootParticlesPrimary("explode 3 0 1");
        addShootParticlesPrimary("explode 3 0 -1");
        addShootParticlesPrimary("explode 4 0 0");
        addShootParticlesPrimary("explode 3 0 1");
        addShootParticlesPrimary("explode 3 0 -1");
        addShootParticlesPrimary("cloud 4 0 0");
        addShootParticlesPrimary("cloud 3 0 1");
        addShootParticlesPrimary("cloud 3 0 -1");
        addShootParticlesPrimary("cloud 4 0 0");
        addShootParticlesPrimary("cloud 3 0 1");
        addShootParticlesPrimary("cloud 3 0 -1");
        addShootParticlesPrimary("cloud 4 0 0");
        addShootParticlesPrimary("cloud 3 0 1");
        addShootParticlesPrimary("cloud 3 0 -1");
        addShootParticlesPrimary("cloud 4 0 0");
        addShootParticlesPrimary("cloud 3 0 1");
        addShootParticlesPrimary("cloud 3 0 -1");
        addShootParticlesPrimary("cloud 4 0 0");
        addShootParticlesPrimary("cloud 3 0 1");
        addShootParticlesPrimary("cloud 3 0 -1");
        addShootParticlesPrimary("cloud 4 0 0");
        addShootParticlesPrimary("cloud 4 0 0");
        addShootParticlesPrimary("cloud 4 0 0");
        
    }
}
