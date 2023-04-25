package com.wolffsmod.entity.ez8;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityUral4320 extends EntityFlanVehicleNPC
{
    public EntityUral4320(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.65F);
        setDriver("17 11 -8 -130 130 -20 85");
        setPassenger("1 17 11 8 core -130 130 -20 85 dummygun DummyGun");
        setPassenger("2 -15 19 -13 core -360 360 -90 85");
        setPassenger("3 -15 19 13 core -360 360 -90 85");
        setPassenger("4 -36 19 -13 core -360 360 -90 85");
        setPassenger("5 -36 19 13 core -360 360 -90 85");
        setPassenger("6 -54 19 -13 core -360 360 -90 85");
        setPassenger("7 -54 19 13 core -360 360 -90 85");
        addShootPointPrimary("24 0 0 core");
        addShootPointSecondary("24 0 0 core");
        addShootParticlesPrimary("note 0 1 0");
        addShootParticlesPrimary("note 0 2 0");
        
    }
}
