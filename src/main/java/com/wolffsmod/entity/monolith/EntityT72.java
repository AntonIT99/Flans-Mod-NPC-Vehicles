package com.wolffsmod.entity.monolith;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityT72 extends EntityFlanVehicleNPC
{
    public EntityT72(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.2F);
        setDriver("0 25 0 -360 360 -7 20");
        setRotatedDriverOffset("-5 0 8");
        addShootPointPrimary("0 24 0 turret");
        addShootPointSecondary("25 42 8 turret twelveMM");
        
    }
}
