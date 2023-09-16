package com.wolffsmod.entity.manus.dayz;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityDayZ_Vehicle_ChevroletSuburban2010_2A extends EntityFlanVehicleNPC
{
    public EntityDayZ_Vehicle_ChevroletSuburban2010_2A(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setDriver("3 5 -9 -80 80 -45 45");
        setPassenger("1 3 5 9 core -80 80 -45 45");
        setPassenger("2 -15 5 -9 core -80 80 -45 45");
        setPassenger("3 -15 5 9 core -80 80 -45 45");
        setPassenger("4 -35 5 -8 core -80 80 -45 45");
        setPassenger("5 -35 5 8 core -80 80 -45 45");
        
    }
}
