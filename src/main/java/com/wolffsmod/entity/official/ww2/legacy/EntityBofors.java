package com.wolffsmod.entity.official.ww2.legacy;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityBofors extends EntityFlanVehicleNPC
{
    public EntityBofors(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.0F);
        setDriver("0 0 0 -360 360 0 89");
        addShootPointPrimary("48 6 4 turret");
        
    }
}
