package com.wolffsmod.entity.monolith;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityType74 extends EntityFlanVehicleNPC
{
    public EntityType74(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.2F);
        setDriver("0 17 0 -360 360 -10 20");
        setRotatedDriverOffset("-8 0 8");
        addShootPointPrimary("0 15 0 turret");
        addShootPointSecondary("10 25 0 turret twelveMM");
        addShootPointSecondary("25 15 15 turret sevenMM");
        
    }
}
