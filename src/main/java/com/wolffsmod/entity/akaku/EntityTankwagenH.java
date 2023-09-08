package com.wolffsmod.entity.akaku;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityTankwagenH extends EntityFlanVehicleNPC
{
    public EntityTankwagenH(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(2.0F);
        setDriver("-15 6 -6");
        setRotatedDriverOffset("0 0 0");
        setPassenger("1 -15 6 6 core");
        
    }
}
