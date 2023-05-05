package com.wolffsmod.entity.monolith;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityMonitor extends EntityFlanVehicleNPC
{
    public EntityMonitor(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.8F);
        setDriver("0 60 0 -360 360 -10 30");
        setRotatedDriverOffset("0 0 0");
        addShootPointPrimary("10 40 10 turret");
        addShootPointPrimary("10 40 -10 turret");
        addShootPointSecondary("50 45 9 turret");
        
    }
}
