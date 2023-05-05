package com.wolffsmod.entity.monolith;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class Entityhashidate extends EntityFlanVehicleNPC
{
    public Entityhashidate(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.8F);
        setDriver("670 120 0 -360 360 -10 30");
        setRotatedDriverOffset("0 0 0");
        setPassenger("1 755 108 0 core -360 360 -15 78 thirtyMM AAGunOne");
        setPassenger("2 150 82 0 core -360 360 -15 78 thirtyMM AAGunTwo");
        setPassenger("3 940 85 0 core -360 360 -10 30 12cmGun FrontGun");
        addShootPointPrimary("10 40 0 turret");
        addShootPointSecondary("50 45 9 turret");
        addGunOrigin("1 755 98 0");
        addGunOrigin("2 150 72 0");
        addGunOrigin("3 940 65 0");
        
    }
}
