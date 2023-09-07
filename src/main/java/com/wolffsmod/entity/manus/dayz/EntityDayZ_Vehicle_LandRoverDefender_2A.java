package com.wolffsmod.entity.manus.dayz;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityDayZ_Vehicle_LandRoverDefender_2A extends EntityFlanVehicleNPC
{
    public EntityDayZ_Vehicle_LandRoverDefender_2A(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setDriver("0 4 -7 -80 80 -45 45");
        setPassenger("1 0 4 7 core -80 80 -45 45");
        setPassenger("2 -14 4 -7 core -80 80 -45 45");
        setPassenger("3 -14 4 7 core -80 80 -45 45");
        
    }
}
