package com.wolffsmod.entity.monolith;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityFerdinand extends EntityFlanVehicleNPC
{
    public EntityFerdinand(World w)
    {
        super(w);
        setSize(4.5F, 4F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.15F);
        setDriver("-50 42 -2 -7 7 -6 8");
        setRotatedDriverOffset("-9 0 -9");
        addShootPointPrimary("10 32 0 turret");
        addShootPointSecondary("30 32 7 turret sevenMM");
        
    }
}
