package com.wolffsmod.entity.official.ww2;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityBofors extends EntityFlanVehicleNPC
{
    public EntityBofors(World w)
    {
        super(w);
        setSize(3.0F, 2.0F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.0F);
        setDriver("0 1 0 -360 360 0 89");
        setRotatedDriverOffset("-3 0 12");
        addBarrelPosition("14 14 0");
        
    }
}
