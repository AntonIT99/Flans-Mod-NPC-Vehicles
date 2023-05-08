package com.wolffsmod.entity.monolith;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityKV2 extends EntityFlanVehicleNPC
{
    public EntityKV2(World w)
    {
        super(w);
        setSize(4F, 4F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.3F);
        setDriver("0 40 0 -360 360 -5 20");
        setRotatedDriverOffset("-15 0 -14");
        addShootPointPrimary("10 32 0 turret");
        addShootPointSecondary("40 20 8 turret sevenMM");
        
    }
}
