package com.wolffsmod.entity.manus.ww2;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityWW2_Vehicle_SU85_1A extends EntityFlanVehicleNPC
{
    public EntityWW2_Vehicle_SU85_1A(World w)
    {
        super(w);
        setSize(3.5F, 2.6F);
    }
    
    @Override
    public void setupConfig()
    {
        setDriver("4 24 17 0 0 -10 20");
        setPassenger("1 5 20 -6 turret");
        addBarrelPosition("0 22 0");
        
    }
}
