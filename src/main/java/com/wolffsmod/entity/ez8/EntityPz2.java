package com.wolffsmod.entity.ez8;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityPz2 extends EntityFlanVehicleNPC
{
    public EntityPz2(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.35F);
        setDriver("0 9 0 -360 360 -9 20");
        setRotatedDriverOffset("-2 9 2");
        addShootPointPrimary("28 18 -4 turret");
        addShootPointSecondary("22 18 5 turret");
        addShootParticlesPrimary("explode 0 0 0");
        
    }
}
