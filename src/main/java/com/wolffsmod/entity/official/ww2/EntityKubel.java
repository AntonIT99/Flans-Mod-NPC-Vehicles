package com.wolffsmod.entity.official.ww2;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityKubel extends EntityFlanVehicleNPC
{
    public EntityKubel(World w)
    {
        super(w);
        setSize(3.0F, 2.0F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.25F);
        setDriver("1 3 -7");
        setPassenger("1 -19 10 0 core -60 60 -30 60 mg42 PassengerGun1");
        setPassenger("2 1 3 7 core");
        addGunOrigin("1 -5 4 0");
        
    }
}
