package com.wolffsmod.entity.ez8;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityZU232 extends EntityFlanVehicleNPC
{
    public EntityZU232(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.0F);
        setDriver("0 -5 0 -360 360 -5 85");
        setRotatedDriverOffset("-10 0 -10");
        addShootPointPrimary("40 2 -2 turret");
        addShootPointPrimary("40 2 2 turret");
        
        setRotateWheels(false);
        
    }
}
