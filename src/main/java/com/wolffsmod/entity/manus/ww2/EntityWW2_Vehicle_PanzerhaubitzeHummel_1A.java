package com.wolffsmod.entity.manus.ww2;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityWW2_Vehicle_PanzerhaubitzeHummel_1A extends EntityFlanVehicleNPC
{
    public EntityWW2_Vehicle_PanzerhaubitzeHummel_1A(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setDriver("25 12 -3 0 0 0 45");
        setRotatedDriverOffset("12 0 -8");
        setPassenger("1 -5 33 13 turret -45 90 -10 30 WW2_MG_MG42ZB_1A MG42");
        addBarrelPosition("0 36 0");
        addGunOrigin("1 4 45 21");
        
    }
}
