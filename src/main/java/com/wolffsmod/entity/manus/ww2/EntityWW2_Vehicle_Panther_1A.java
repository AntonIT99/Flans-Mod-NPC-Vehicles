package com.wolffsmod.entity.manus.ww2;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityWW2_Vehicle_Panther_1A extends EntityFlanVehicleNPC
{
    public EntityWW2_Vehicle_Panther_1A(World w)
    {
        super(w);
        setSize(3.5F, 2.8F);
    }
    
    @Override
    public void setupConfig()
    {
        setDriver("0 38 0 -360 360 -10 20");
        setRotatedDriverOffset("-5 0 -6");
        setPassenger("1 34 17 12 core -30 30 -10 10 WW2_MG_MG42ZB_1A FrontMG");
        addBarrelPosition("0 38 0");
        addGun("33 39 12 turret WW2_MG_MG42ZB_1A");
        addGunOrigin("1 59 2 13");
        
    }
}
