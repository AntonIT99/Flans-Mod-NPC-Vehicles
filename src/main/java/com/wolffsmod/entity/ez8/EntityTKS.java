package com.wolffsmod.entity.ez8;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityTKS extends EntityFlanVehicleNPC
{
    public EntityTKS(World w)
    {
        super(w);
        setSize(2.0F, 1.4F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.5F);
        setDriver("-2 -2 -3 -15 15 -10 20");
        setRotatedDriverOffset("0 0 0");
        addShootPointPrimary("21 7 7 turret");
        
        setTurretOrigin("0 0 0");
        
    }
}
