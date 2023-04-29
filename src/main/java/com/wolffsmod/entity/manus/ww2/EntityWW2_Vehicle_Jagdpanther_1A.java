package com.wolffsmod.entity.manus.ww2;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityWW2_Vehicle_Jagdpanther_1A extends EntityFlanVehicleNPC
{
    public EntityWW2_Vehicle_Jagdpanther_1A(World w)
    {
        super(w);
        setSize(3.5F, 2.8F);
    }
    
    @Override
    public void setupConfig()
    {
        setDriver("-13 34 -9 0 0 -10 20");
        setPassenger("1 2 36 7 turret -60 60 -15 30 WW2_MG_MG42ZB_1A MG42");
        addBarrelPosition("0 34 0");
        addGun("58 24 14 core WW2_MG_MG42ZB_1A");
        addGunOrigin("1 19 49 6");
        
    }
}
