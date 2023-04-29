package com.wolffsmod.entity.manus.civil;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityCivil_Vehicle_GolfCart_1A extends EntityFlanVehicleNPC
{
    public EntityCivil_Vehicle_GolfCart_1A(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setDriver("-10 7 -7 -80 80 -45 45");
        setPassenger("1 -10 7 7 core -80 80 -45 45");
        setPassenger("2 -20 5 -7 core 160 200 -45 45");
        setPassenger("3 -20 5 7 core 160 200 -45 45");
        
    }
}
