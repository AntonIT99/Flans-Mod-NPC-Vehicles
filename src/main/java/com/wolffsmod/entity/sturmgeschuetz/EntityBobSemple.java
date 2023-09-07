package com.wolffsmod.entity.sturmgeschuetz;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityBobSemple extends EntityFlanVehicleNPC
{
    public EntityBobSemple(World w)
    {
        super(w);
        setSize(2.0F, 2.0F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.3F);
    }
}
