package com.wolffsmod.entity.official.ww2;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityType4HoRo extends EntityFlanVehicleNPC
{
    public EntityType4HoRo(World w)
    {
        super(w);
        setSize(3.0F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.3F);
        setDriver("3 5 15 -1.5 1.5 -2 15");
        setRotatedDriverOffset("13 0 -8");
        addBarrelPosition("0 34 0");
        
    }
}
