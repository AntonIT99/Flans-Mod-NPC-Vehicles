package com.wolffsmod.entity.mos;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class Entity11003_AirRideMachine_WarpSter extends EntityFlanVehicleNPC
{
    public Entity11003_AirRideMachine_WarpSter(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.6F);
        setDriver("-1 -1 0");
        setRotatedDriverOffset("0 0 0");
        addShootPointPrimary("");
        addShootPointSecondary("");
        
    }
}
