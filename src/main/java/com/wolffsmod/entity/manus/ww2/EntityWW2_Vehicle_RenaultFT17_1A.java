package com.wolffsmod.entity.manus.ww2;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityWW2_Vehicle_RenaultFT17_1A extends EntityFlanVehicleNPC
{
    public EntityWW2_Vehicle_RenaultFT17_1A(World w)
    {
        super(w);
        setSize(2.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setDriver("0 18 0 -360 360 -10 25");
        setRotatedDriverOffset("-2 0 -1");
        addBarrelPosition("0 34 0");
        addGun("10 24 -2 turret WW2_MG_BrowningM1919_1A");
        
    }
}
