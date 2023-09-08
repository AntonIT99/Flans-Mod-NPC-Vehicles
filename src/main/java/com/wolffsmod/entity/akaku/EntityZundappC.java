package com.wolffsmod.entity.akaku;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityZundappC extends EntityFlanVehicleNPC
{
    public EntityZundappC(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setDriver("-8 6 -4");
        setRotatedDriverOffset("0 0 0");
        setPassenger("1 -10 2 11 core");
        setPassenger("2 -20 8 -4 core");
        
    }
}
