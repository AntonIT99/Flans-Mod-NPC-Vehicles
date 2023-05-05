package com.wolffsmod.entity.monolith;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityFerdinand extends EntityFlanVehicleNPC
{
    public EntityFerdinand(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
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
