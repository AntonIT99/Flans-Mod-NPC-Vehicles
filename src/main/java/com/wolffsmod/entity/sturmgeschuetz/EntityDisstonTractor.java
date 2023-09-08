package com.wolffsmod.entity.sturmgeschuetz;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityDisstonTractor extends EntityFlanVehicleNPC
{
    public EntityDisstonTractor(World w)
    {
        super(w);
        setSize(2.0F, 2.0F);
    }

    @Override
    public void setupConfig()
    {
        setDriver("0 0 0 0 0 0 0");
        setTurnSpeed(0.3F);
    }
}
