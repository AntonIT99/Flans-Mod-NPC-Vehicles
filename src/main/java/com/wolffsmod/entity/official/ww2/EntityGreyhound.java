package com.wolffsmod.entity.official.ww2;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityGreyhound extends EntityFlanVehicleNPC
{
    public EntityGreyhound(World w)
    {
        super(w);
        this.setSize(3.0F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.35F);
        setDriver("0 14 0 -360 360 -5 20");
        setPassenger("1 22 0 7 core -30 30 -5 20 browning PassengerGun1");
        addBarrelPosition("40 28 0");
        addGun("8 20 10 turret browning");
        addGunOrigin("1 50 -1 10");
        
    }
}
