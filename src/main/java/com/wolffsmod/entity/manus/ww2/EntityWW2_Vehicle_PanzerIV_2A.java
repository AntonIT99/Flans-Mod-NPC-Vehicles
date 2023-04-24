package com.wolffsmod.entity.manus.ww2;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityWW2_Vehicle_PanzerIV_2A extends EntityFlanVehicleNPC
{
    public EntityWW2_Vehicle_PanzerIV_2A(World w)
    {
        super(w);
        setSize(3.5F, 2.8F);
    }
    
    @Override
    public void setupConfig()
    {
        setDriver("0 32 0 -360 360 -5 25");
        setRotatedDriverOffset("-13 0 0");
        setPassenger("1 31 12 12 core -30 30 -10 10 WW2_MG_MG42ZB_1A FrontMG");
        addBarrelPosition("0 31 0");
        addGun("28 32 8 turret WW2_MG_MG42ZB_1A");
        addGunOrigin("1 48 18 12");
        
    }
}
