package com.wolffsmod.entity.wot;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityE75 extends EntityFlanVehicleNPC
{
    public EntityE75(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.3F);
        setRotatedDriverOffset("-1 0 -2");
        addBarrelPosition("0 36 0");
        
    }
}
