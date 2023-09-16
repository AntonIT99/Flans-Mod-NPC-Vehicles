package com.wolffsmod.entity.cvts;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class Entity11902_Interior_Chair2 extends EntityFlanVehicleNPC
{
    public Entity11902_Interior_Chair2(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.5F);
        setDriver("0 1 0 -360 360 -89 89");
        setRotatedDriverOffset("0 0 0");
        addShootPointPrimary("");
        addShootPointSecondary("");
        
    }
}
