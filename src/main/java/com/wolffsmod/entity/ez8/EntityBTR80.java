package com.wolffsmod.entity.ez8;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityBTR80 extends EntityFlanVehicleNPC
{
    public EntityBTR80(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.65F);
        setDriver("14 12 0 -360 360 -5 80");
        setPassenger("1 -6 19 -13 core -360 360 -90 85 dummygun DummyGun");
        setPassenger("2 -6 19 13 core -360 360 -90 85");
        setPassenger("3 -21 19 -13 core -360 360 -90 85");
        setPassenger("4 -21 19 13 core -360 360 -90 85");
        setPassenger("5 -35 19 0 core -360 360 -90 85");
        setPassenger("6 30 4 6 core -360 360 -90 85");
        addShootPointPrimary("25 23 0 turret");
        addShootPointSecondary("25 23 2 turret");
        addShootParticlesPrimary("cloud 1 0 0");
        setTurretOrigin("14 22 0");
        
    }
}
