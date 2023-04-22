package com.wolffsmod.entity.manus.ww2;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityWW2_Vehicle_WillyJeep_1A extends EntityFlanVehicleNPC
{
    public EntityWW2_Vehicle_WillyJeep_1A(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setDriver("-7 0 -9");
        setPassenger("1 -7 0 9 core");
        setPassenger("2 -21 11 0 core -50 50 -10 30 WW2_MG_BrowningM2_1A M2");
        addGunOrigin("2 -25 22 0");
        
    }
}
