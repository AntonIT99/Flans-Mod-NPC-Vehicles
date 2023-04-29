package com.wolffsmod.entity.waw;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityRenault extends EntityFlanVehicleNPC
{
    public EntityRenault(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setDriver("0 21 0 -360 360 -5 45");
        addBarrelPosition("0 31 0");

    }
}
