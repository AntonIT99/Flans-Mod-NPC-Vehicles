package com.wolffsmod.entity.manus.dayz;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityDayZ_Vehicle_IkarusZ60_1A extends EntityFlanVehicleNPC
{
    public EntityDayZ_Vehicle_IkarusZ60_1A(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setDriver("82 14 -12 -80 80 -45 45");
        setPassenger("1 64 19 -14 core -80 80 -45 45");
        setPassenger("2 64 19 14 core -80 80 -45 45");
        setPassenger("3 48 19 -14 core -80 80 -45 45");
        setPassenger("4 48 19 14 core -80 80 -45 45");
        setPassenger("5 32 19 -14 core -80 80 -45 45");
        setPassenger("6 32 19 14 core -80 80 -45 45");
        setPassenger("7 16 19 -14 core -80 80 -45 45");
        setPassenger("8 16 19 14 core -80 80 -45 45");
        setPassenger("9 0 19 -14 core -80 80 -45 45");
        setPassenger("10 0 19 14 core -80 80 -45 45");
        setPassenger("11 -16 19 -14 core -80 80 -45 45");
        setPassenger("12 -16 19 14 core -80 80 -45 45");
        setPassenger("13 -32 19 -14 core -80 80 -45 45");
        setPassenger("14 -32 19 14 core -80 80 -45 45");
        setPassenger("15 -48 19 -14 core -80 80 -45 45");
        setPassenger("16 -48 19 14 core -80 80 -45 45");
        setPassenger("17 -64 19 -14 core -80 80 -45 45");
        setPassenger("18 -64 19 14 core -80 80 -45 45");
        setPassenger("19 -80 19 -14 core -80 80 -45 45");
        setPassenger("20 -96 19 14 core -80 80 -45 45");
        setPassenger("21 -96 19 0 core -80 80 -45 45");
        setPassenger("22 -96 19 -14 core -80 80 -45 45");
        
    }
}
