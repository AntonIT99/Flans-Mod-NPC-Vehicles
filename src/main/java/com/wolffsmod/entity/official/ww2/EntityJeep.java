package com.wolffsmod.entity.official.ww2;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityJeep extends EntityFlanVehicleNPC
{
    public EntityJeep(World w)
    {
        super(w);
        this.setSize(3.0F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.25F);
        setDriver("-8 5 -7");
        setPassenger("1 -6 5 7 core -360 360 -89 89 0 PassengerGun1");
        setPassenger("2 -27 14 0 core -60 60 -30 60 browning PassengerGun2");
        addGunOrigin("2 -15 9 0");
        
    }
}
