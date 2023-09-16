package com.wolffsmod.entity.mos;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class Entity11907_Interior_Radio extends EntityFlanVehicleNPC
{
    public Entity11907_Interior_Radio(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.0F);
        setDriver("-16 -9 0 -360 360 -89 89");
        setRotatedDriverOffset("0 0 0");
        addShootPointPrimary("");
        addShootPointSecondary("");
        setRotateWheels(false);
        
    }
}
