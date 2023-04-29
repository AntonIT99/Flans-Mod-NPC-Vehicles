package com.wolffsmod.entity.waw;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityCarro extends EntityFlanVehicleNPC
{
    public EntityCarro(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setDriver("0 17 0");
        addBarrelPosition("15 44 0");

    }
}
