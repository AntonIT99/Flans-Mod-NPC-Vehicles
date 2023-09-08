package com.wolffsmod.entity.akaku;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityZundappCN extends EntityFlanVehicleNPC
{
    public EntityZundappCN(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setDriver("-8 6 0");
        setRotatedDriverOffset("0 0 0");
        setPassenger("1 -20 8 0 core");
        
    }
}
