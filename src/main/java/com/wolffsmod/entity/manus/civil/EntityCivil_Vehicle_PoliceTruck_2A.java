package com.wolffsmod.entity.manus.civil;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityCivil_Vehicle_PoliceTruck_2A extends EntityFlanVehicleNPC
{
    public EntityCivil_Vehicle_PoliceTruck_2A(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setDriver("8 7 -9 -80 80 -45 45");
        setPassenger("1 8 7 9 core -80 80 -45 45");
        setPassenger("2 -7 9 9 core -160 -60 -45 45");
        setPassenger("3 -21 9 9 core -160 -60 -45 45");
        setPassenger("4 -35 9 9 core -160 -60 -45 45");
        setPassenger("5 -7 9 -9 core 60 160 -45 45");
        setPassenger("6 -21 9 -9 core 60 160 -45 45");
        setPassenger("7 -35 9 -9 core 60 160 -45 45");
        
    }
}
