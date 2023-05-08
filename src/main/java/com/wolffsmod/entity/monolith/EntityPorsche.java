package com.wolffsmod.entity.monolith;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityPorsche extends EntityFlanVehicleNPC
{
    public EntityPorsche(World w)
    {
        super(w);
        setSize(4.5F, 3.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.25F);
        setDriver("0 34 0 -360 360 -5 10");
        setRotatedDriverOffset("-9 0 -9");
        addShootPointPrimary("10 32 0 turret");
        addShootPointSecondary("30 32 7 turret sevenMM");
        
    }
}
