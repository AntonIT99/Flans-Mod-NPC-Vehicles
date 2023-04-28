package com.wolffsmod.entity.manus.civil;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityCivil_Vehicle_LKW2_1A extends EntityFlanVehicleNPC
{
    public EntityCivil_Vehicle_LKW2_1A(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setDriver("33 10 -9 -80 80 -45 45");
        setPassenger("1 33 10 9 core -80 80 -45 45");
        
    }
}
