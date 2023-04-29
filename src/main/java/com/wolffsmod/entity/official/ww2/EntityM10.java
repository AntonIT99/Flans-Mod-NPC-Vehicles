package com.wolffsmod.entity.official.ww2;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityM10 extends EntityFlanVehicleNPC
{
    public EntityM10(World w)
    {
        super(w);
        setSize(3.0F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.2F);
        setDriver("0 32 0 -360 360 -10 30");
        setRotatedDriverOffset("-14 0 9");
        setPassenger("1 0 32 0 turret -360 360 -20 20 browning PassengerGun1");
        addBarrelPosition("75 28 0");
        addGunOrigin("1 5 20 -11");
        
    }
}
