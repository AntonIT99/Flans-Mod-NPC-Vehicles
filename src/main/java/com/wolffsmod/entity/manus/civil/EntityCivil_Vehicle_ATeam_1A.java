package com.wolffsmod.entity.manus.civil;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityCivil_Vehicle_ATeam_1A extends EntityFlanVehicleNPC
{
    public EntityCivil_Vehicle_ATeam_1A(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setDriver("14 4 -9 -80 80 -45 45");
        setPassenger("1 14 4 9 core -80 80 -45 45");
        setPassenger("2 -9 4 -9 core -80 80 -45 45");
        setPassenger("3 -9 4 9 core -80 80 -45 45");
        
    }
}
