package com.wolffsmod.entity.manus.ww2;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityWW2_Vehicle_Jagdtiger_1A extends EntityFlanVehicleNPC
{
    public EntityWW2_Vehicle_Jagdtiger_1A(World w)
    {
        super(w);
        setSize(4.5F, 3.2F);
    }
    
    @Override
    public void setupConfig()
    {
        setDriver("0 37 7 0 0 -10 20");
        setPassenger("1 35 16 12 core -30 30 -10 10 WW2_MG_MG42ZB_1A FrontMG");
        addBarrelPosition("0 34 0");
        addGunOrigin("1 65 20 14");
        
    }
}
