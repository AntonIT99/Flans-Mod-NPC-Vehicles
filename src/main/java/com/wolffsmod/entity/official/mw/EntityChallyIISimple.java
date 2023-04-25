package com.wolffsmod.entity.official.mw;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityChallyIISimple extends EntityFlanVehicleNPC
{
    public EntityChallyIISimple(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.3F);
        setDriver("0 28 0 -360 360 -10 20");
        setRotatedDriverOffset("-5 0 10");
        setPassenger("1 0 33 0 turret -360 360 -15 40 m60 PassengerGun1");
        addBarrelPosition("131 26 0");
        addGun("8 34 8 turret m60");
        addGunOrigin("1 -2 28 -13");
        
    }
}
