package com.wolffsmod.entity.manus.dayz;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityDayZ_Vehicle_IkarusZ260_1A extends EntityFlanVehicleNPC
{
    public EntityDayZ_Vehicle_IkarusZ260_1A(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setDriver("84 14 -13 -80 80 -45 45");
        setPassenger("1 56 17 -14 core -80 80 -45 45");
        setPassenger("2 47 17 -14 core 160 200 -45 45");
        setPassenger("3 25 17 -14 core -80 80 -45 45");
        setPassenger("4 11 17 -14 core -80 80 -45 45");
        setPassenger("5 -3 17 -14 core -80 80 -45 45");
        setPassenger("6 -17 17 -14 core -80 80 -45 45");
        setPassenger("7 -31 17 -14 core -80 80 -45 45");
        setPassenger("8 -49 17 -14 core -80 80 -45 45");
        setPassenger("9 -59 17 -14 core 160 200 -45 45");
        setPassenger("10 28 17 14 core -80 80 -45 45");
        setPassenger("11 12 17 14 core -80 80 -45 45");
        setPassenger("12 -33 17 14 core -80 80 -45 45");
        setPassenger("13 -49 17 14 core -80 80 -45 45");
        setPassenger("14 -59 17 14 core 160 200 -45 45");
        
    }
}
