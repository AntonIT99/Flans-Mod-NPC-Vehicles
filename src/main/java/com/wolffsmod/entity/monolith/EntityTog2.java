package com.wolffsmod.entity.monolith;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityTog2 extends EntityFlanVehicleNPC
{
    public EntityTog2(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.05F);
        setDriver("0 45 0 -360 360 -5 5");
        setRotatedDriverOffset("9 0 12");
        addShootPointPrimary("10 40 0 turret");
        addShootPointSecondary("50 45 9 turret sevenMM");
        
    }
}
