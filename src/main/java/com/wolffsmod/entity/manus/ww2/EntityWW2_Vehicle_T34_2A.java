package com.wolffsmod.entity.manus.ww2;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityWW2_Vehicle_T34_2A extends EntityFlanVehicleNPC
{
    public EntityWW2_Vehicle_T34_2A(World w)
    {
        super(w);
        setSize(3.5F, 2.8F);
    }
    
    @Override
    public void setupConfig()
    {
        setDriver("0 28 0 -360 360 -10 20");
        setRotatedDriverOffset("-5 0 -6");
        setPassenger("1 24 3 -6 core -30 30 -10 10 WW2_MG_DP28_1A FrontMG");
        addBarrelPosition("0 32 0");
        addGun("26 30 -5 turret WW2_MG_DP28_1A");
        addGunOrigin("1 37 15 11");
        
    }
}
