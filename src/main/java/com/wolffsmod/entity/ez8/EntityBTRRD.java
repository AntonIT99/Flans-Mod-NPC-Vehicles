package com.wolffsmod.entity.ez8;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityBTRRD extends EntityFlanVehicleNPC
{
    public EntityBTRRD(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.45F);
        setDriver("17 1 0 -360 360 -8 20");
        setRotatedDriverOffset("0 0 0");
        setPassenger("1 5 1 -8 core -360 360 -89 89 dummygun DummyGun");
        setPassenger("2 5 1 8 core -360 360 -89 89");
        setPassenger("3 -18 7 0 core -360 360 -89 89");
        setPassenger("4 -32 7 0 core -360 360 -89 89");
        addShootPointPrimary("21 22 11 turret");
        addShootParticlesPrimary("explode 1 0 0");
        addShootParticlesPrimary("explode -2 0 0");
        addShootParticlesPrimary("flame -2 0 0");
        addShootParticlesPrimary("lava -2 0 0");
        addShootParticlesPrimary("cloud 1 0 0");
        addShootParticlesPrimary("snowshovel -2 0 0");
        setTurretOrigin("14 16 11");
        
    }
}
