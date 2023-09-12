package com.wolffsmod.entity.manus.ww2;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityWW2_Vehicle_FlakpanzerIV_1A extends EntityFlanVehicleNPC
{
    public EntityWW2_Vehicle_FlakpanzerIV_1A(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.45F);
        setDriver("0 35 0 -360 360 -10 89");
        setRotatedDriverOffset("-23 0 0");
        addShootPointPrimary("40 42 -6 turret");
        addShootPointPrimary("40 38 6 turret");
        addShootPointPrimary("40 42 6 turret");
        addShootPointPrimary("40 38 -6 turret");

    }
}
