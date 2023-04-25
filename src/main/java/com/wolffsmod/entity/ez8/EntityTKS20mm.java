package com.wolffsmod.entity.ez8;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityTKS20mm extends EntityFlanVehicleNPC
{
    public EntityTKS20mm(World w)
    {
        super(w);
        setSize(2.0F, 1.4F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.5F);
        setDriver("-2 -2 -3 -10 10 -10 20");
        setRotatedDriverOffset("0 0 0");
        addShootPointPrimary("10 7 6 turret");
        
        addShootParticlesPrimary("explode 1 0 0");
        setTurretOrigin("0 0 0");
        
    }
}
