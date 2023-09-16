package com.wolffsmod.entity.cow;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityTiger2 extends EntityFlanVehicleNPC
{
    public EntityTiger2(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.4F);
        setDriver("0 46 0 -360 360 -8 15");
        setRotatedDriverOffset("-7 0 -9");
        setDriverAimSpeed("1.5 2.5 0");
        addBarrelPosition("0 34 0");
        addGun("8 20 0 turret 30calg");
        
    }
}
