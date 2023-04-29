package com.wolffsmod.entity.manus.civil;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityCivil_Vehicle_LKW1_3A extends EntityFlanVehicleNPC
{
    public EntityCivil_Vehicle_LKW1_3A(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setDriver("30 10 -9 -80 80 -45 45");
        setPassenger("1 30 10 9 core -80 80 -45 45");
        
    }
}
