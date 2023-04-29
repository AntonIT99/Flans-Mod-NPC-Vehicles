package com.wolffsmod.entity.manus.ww2;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityWW2_Vehicle_VWType82_1A extends EntityFlanVehicleNPC
{
    public EntityWW2_Vehicle_VWType82_1A(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setDriver("3 -2 -7");
        setPassenger("1 3 -2 7 core");
        setPassenger("2 -12 3 0 core -50 50 0 45 WW2_MG_MG42ZB_1A MG42");
        addGunOrigin("2 -9 18 0");
        
    }
}
