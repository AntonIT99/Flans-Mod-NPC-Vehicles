package com.wolffsmod.entity.ez8;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityZSU234 extends EntityFlanVehicleNPC
{
    public EntityZSU234(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.45F);
        setDriver("0 15 0 -360 360 -5 85");
        setRotatedDriverOffset("-12 0 -11");
        addShootPointPrimary("26 23 2 turret");
        addShootPointPrimary("26 18 -3 turret");
        addShootPointPrimary("26 23 -2 turret");
        addShootPointPrimary("26 18 3 turret");
        addShootPointSecondary("None");
        
    }
}
