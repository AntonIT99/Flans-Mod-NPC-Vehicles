package com.wolffsmod.entity.ez8;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityBMD2 extends EntityFlanVehicleNPC
{
    public EntityBMD2(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.45F);
        setDriver("6 5 0 -360 360 -4 85");
        setRotatedDriverOffset("-3 0 -2");
        setPassenger("1 -18 7 0 core -360 360 -89 89 dummygun DummyGun");
        setPassenger("2 -32 7 0 core -360 360 -89 89");
        addShootPointPrimary("20 3 1 turret");
        addShootPointSecondary("15 3 3 turret");
        addShootParticlesPrimary("explode 2 0 0");
        setTurretOrigin("0 12 0");
        
    }
}
