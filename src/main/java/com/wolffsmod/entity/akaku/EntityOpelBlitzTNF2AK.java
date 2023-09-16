package com.wolffsmod.entity.akaku;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityOpelBlitzTNF2AK extends EntityFlanVehicleNPC
{
    public EntityOpelBlitzTNF2AK(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setDriver("-15 4 -6");
        setRotatedDriverOffset("0 0 0");
        setPassenger("1 -15 4 6 core");
        
    }
}
