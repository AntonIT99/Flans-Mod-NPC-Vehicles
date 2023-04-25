package com.wolffsmod.entity.ez8;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityBTRZD extends EntityFlanVehicleNPC
{
    public EntityBTRZD(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.45F);
        setDriver("-15 20 0 -360 360 -5 85");
        setRotatedDriverOffset("-10 2 -10");
        addShootPointPrimary("22 15 4 turret");
        addShootPointPrimary("22 15 0 turret");
        setTurretOrigin("0 12 0");
        
    }
}
