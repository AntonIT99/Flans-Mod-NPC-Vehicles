package com.wolffsmod.entity.akaku;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityOpelBlitzCCFTAK extends EntityFlanVehicleNPC
{
    public EntityOpelBlitzCCFTAK(World w)
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
        setPassenger("2 -30 12 10 core");
        setPassenger("3 -30 12 -10 core");
        setPassenger("4 -50 12 10 core");
        setPassenger("5 -50 12 -10 core");
        setPassenger("6 -70 12 10 core");
        setPassenger("7 -70 12 -10 core");
        
    }
}
