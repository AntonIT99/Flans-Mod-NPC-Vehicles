package com.wolffsmod.entity.official.ww2;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityB1 extends EntityFlanVehicleNPC
{
    public EntityB1(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.5F);
        setDriver("0 28 0 -360 360 -10 12");
        setRotatedDriverOffset("-6 2 -5");
        setPassenger("1 20 0 -6 core -2 2 -3 12 2Pdr PassengerGun1");
        addBarrelPosition("0 34 0");
        addGun("8 20 0 turret mg42");
        addGunOrigin("1 32 -9 8");
        
    }
}
