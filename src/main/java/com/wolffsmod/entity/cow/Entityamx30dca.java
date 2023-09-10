package com.wolffsmod.entity.cow;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class Entityamx30dca extends EntityFlanVehicleNPC
{
    public Entityamx30dca(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.4F);
        setDriver("0 34 0 -360 360 -5 85");
        setRotatedDriverOffset("0 0 0");
        setDriverAimSpeed("7 5.5 0");
        addBarrelPosition("0 34 0");
        addGun("8 20 0 turret 30mmaagun");
        
    }
}
