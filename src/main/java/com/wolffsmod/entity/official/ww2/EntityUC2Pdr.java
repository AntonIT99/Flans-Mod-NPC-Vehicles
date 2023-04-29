package com.wolffsmod.entity.official.ww2;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityUC2Pdr extends EntityFlanVehicleNPC
{
    public EntityUC2Pdr(World w)
    {
        super(w);
        setSize(3.0F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.4F);
        setDriver("13 3 8 -360 360 -89 89");
        setPassenger("1 13 3 -7 core -10 10 -3 15 bren PassengerGun1");
        setPassenger("2 -9 16 -10 core -35 35 -5 15 2Pdr PassengerGun2");
        addGunOrigin("1 27 -5 -7");
        addGunOrigin("2 0 10 0");
        
    }
}
