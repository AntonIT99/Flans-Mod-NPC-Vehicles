package com.wolffsmod.entity.manus.civil;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityCivil_Vehicle_F1_1A extends EntityFlanVehicleNPC
{
    public EntityCivil_Vehicle_F1_1A(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setDriver("-6 -7 0 -80 80 -45 45");
        
    }
}
