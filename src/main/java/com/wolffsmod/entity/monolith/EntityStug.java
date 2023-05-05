package com.wolffsmod.entity.monolith;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityStug extends EntityFlanVehicleNPC
{
    public EntityStug(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.4F);
        setDriver("6 0 -12 -10 10 -5 50");
        setRotatedDriverOffset("0 0 0");
        addShootPointPrimary("10 10 0 turret");
        
    }
}
