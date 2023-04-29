package com.wolffsmod.entity.manus.ww2;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityWW2_Vehicle_OpelBlitz_2A extends EntityFlanVehicleNPC
{
    public EntityWW2_Vehicle_OpelBlitz_2A(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setDriver("8 0 -8");
        setPassenger("1 8 0 8 core");
        setPassenger("2 -12 7 -10 core 60 160 -45 45");
        setPassenger("3 -12 7 10 core -160 -60 -45 45");
        setPassenger("4 -28 7 -10 core 60 160 -45 45");
        setPassenger("5 -28 7 10 core -160 -60 -45 45");
        setPassenger("6 -44 7 -10 core 60 160 -45 45");
        setPassenger("7 -44 7 10 core -160 -60 -45 45");
        
    }
}
