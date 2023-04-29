package com.wolffsmod.entity.manus.civil;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityCivil_Vehicle_Taxi_1A extends EntityFlanVehicleNPC
{
    public EntityCivil_Vehicle_Taxi_1A(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setDriver("6 -4 -7 -80 80 -45 45");
        setPassenger("1 6 -4 7 core -80 80 -45 45");
        setPassenger("2 -12 -4 -7 core -80 80 -45 45");
        setPassenger("3 -12 -4 7 core -80 80 -45 45");
        
    }
}
