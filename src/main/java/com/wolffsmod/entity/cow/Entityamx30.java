package com.wolffsmod.entity.cow;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class Entityamx30 extends EntityFlanVehicleNPC
{
    public Entityamx30(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.4F);
        setDriver("0 34 0 -360 360 -8 15");
        setRotatedDriverOffset("0 0 10");
        setDriverAimSpeed("3.5 4.0 0");
        addBarrelPosition("0 34 0");
        addGun("8 20 0 turret 20milg");
        addGun("8 20 0 turret 30calg");
        
    }
}
