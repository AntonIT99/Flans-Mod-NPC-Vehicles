package com.wolffsmod.entity.manus.ww2;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityWW2_Vehicle_M4A1_1A extends EntityFlanVehicleNPC
{
    public EntityWW2_Vehicle_M4A1_1A(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setDriver("0 33 0 -360 360 -10 20");
        setPassenger("1 26 15 14 core -30 30 -10 10 WW2_MG_BrowningM1919_1A FrontMG");
        addBarrelPosition("0 35 0");
        addGun("19 35 8 turret WW2_MG_BrowningM1919_1A");
        addGunOrigin("1 49 18 10");
        
    }
}
