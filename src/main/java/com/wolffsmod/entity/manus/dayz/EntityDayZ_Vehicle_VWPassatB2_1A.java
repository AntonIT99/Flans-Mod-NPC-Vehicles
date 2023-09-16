package com.wolffsmod.entity.manus.dayz;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityDayZ_Vehicle_VWPassatB2_1A extends EntityFlanVehicleNPC
{
    public EntityDayZ_Vehicle_VWPassatB2_1A(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setDriver("3 0 -9 -80 80 -45 45");
        setPassenger("1 3 0 9 core -80 80 -45 45");
        setPassenger("2 -13 0 -9 core -80 80 -45 45");
        setPassenger("3 -13 0 9 core -80 80 -45 45");
        
    }
}
