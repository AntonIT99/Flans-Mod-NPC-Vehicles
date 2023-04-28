package com.wolffsmod.entity.manus.civil;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityCivil_Vehicle_Medic_1A extends EntityFlanVehicleNPC
{
    public EntityCivil_Vehicle_Medic_1A(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setDriver("8 3 -9 -80 80 -45 45");
        setPassenger("1 8 3 9 core -80 80 -45 45");
        setPassenger("2 -22 8 0 core 160 200 -45 45");
        setPassenger("3 -8 8 9 core 180 220 -45 45");
        
    }
}
