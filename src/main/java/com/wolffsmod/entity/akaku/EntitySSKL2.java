package com.wolffsmod.entity.akaku;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntitySSKL2 extends EntityFlanVehicleNPC
{
    public EntitySSKL2(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setDriver("-32 1 -5");
        setRotatedDriverOffset("0 0 0");
        setPassenger("1 -32 1 5 core");
        
    }
}
