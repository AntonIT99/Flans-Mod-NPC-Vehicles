package com.wolffsmod.entity.manus.wh40k;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityWH40K_Vehicle_LemanRuss_1A extends EntityFlanVehicleNPC
{
    public EntityWH40K_Vehicle_LemanRuss_1A(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setDriver("0 65 0 -360 360 -10 30");
        setRotatedDriverOffset("-5 0 -6");
        setPassenger("1 30 35 -8 core -30 30 -10 10 WH40K_MG_LasCannon_1A PassengerGun1");
        addBarrelPosition("0 38 0");
        addGun("33 39 12 turret WH40K_MG_HeavyBolter_1A");
        addGunOrigin("1 43 34 -8");
        setRotateWheels(false);
        
    }
}
