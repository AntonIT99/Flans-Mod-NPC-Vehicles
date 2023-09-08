package com.wolffsmod.entity.akaku;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityW31 extends EntityFlanVehicleNPC
{
    public EntityW31(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setDriver("2 4 -6");
        setRotatedDriverOffset("0 0 0");
        setPassenger("1 2 4 6 core");
        setPassenger("2 -18 4 -6 core");
        setPassenger("3 -18 4 6 core");
        setPassenger("4 -31 4 -6 core");
        setPassenger("5 -31 4 6 core");
        
    }
}
