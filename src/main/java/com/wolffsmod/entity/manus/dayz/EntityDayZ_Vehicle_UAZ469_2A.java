package com.wolffsmod.entity.manus.dayz;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityDayZ_Vehicle_UAZ469_2A extends EntityFlanVehicleNPC
{
    public EntityDayZ_Vehicle_UAZ469_2A(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setDriver("-2 2 -6 -80 80 -45 45");
        setPassenger("1 -2 2 6 core -80 80 -45 45");
        setPassenger("2 -17 2 -6 core -80 80 -45 45");
        setPassenger("3 -17 2 6 core -80 80 -45 45");
        
    }
}
