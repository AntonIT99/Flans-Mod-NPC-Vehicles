package com.wolffsmod.entity.mos;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class Entity11004_AirRideMachine_WagonSter extends EntityFlanVehicleNPC
{
    public Entity11004_AirRideMachine_WagonSter(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.9F);
        setDriver("-3 15 0");
        setRotatedDriverOffset("0 0 0");
        addShootPointPrimary("");
        addShootPointSecondary("");
        
    }
}
