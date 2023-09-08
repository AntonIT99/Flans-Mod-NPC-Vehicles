package com.wolffsmod.entity.sturmgeschuetz;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityFerdinand extends EntityFlanVehicleNPC
{
    public EntityFerdinand(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setDriver("0 0 0 0 0 0 0");
        setTurnSpeed(0.275F);
    }
}
