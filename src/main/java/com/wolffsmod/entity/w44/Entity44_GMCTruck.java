package com.wolffsmod.entity.w44;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class Entity44_GMCTruck extends EntityFlanVehicleNPC
{
    public Entity44_GMCTruck(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.45F);
        setDriver("23 12 -7");
        setRotatedDriverOffset("0 0 0");
        setPassenger("1 23 12 7 core");
        setPassenger("2 2 19 -14 core");
        setPassenger("3 2 19 14 core");
        setPassenger("4 -17 19 -14 core");
        setPassenger("5 -17 19 14 core");
        setPassenger("6 -36 19 -14 core");
        setPassenger("7 -36 19 14 core");
        
    }
}
