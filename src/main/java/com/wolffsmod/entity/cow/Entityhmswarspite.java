package com.wolffsmod.entity.cow;

import com.wolffsmod.entity.EntityFlanShipNPC;
import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class Entityhmswarspite extends EntityFlanShipNPC
{
    public Entityhmswarspite(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.3F);
        setDriver("144 84 0 -360 360 -5 85");
        setPassenger("1 197 27 0 core -135 135 -5 20 381mmnaval PassengerGun1");
        setPassenger("2 272 10 0 core -135 135 -5 20 381mmnaval PassengerGun2");
        setPassenger("3 -259 11 0 core 45 315 -5 20 381mmnaval PassengerGun3");
        setPassenger("4 -339 -5 0 core 45 315 -5 20 381mmnaval PassengerGun4");
        addShootPointPrimary("21 87 60 turret 40mmaa");
        addShootPointPrimary("-26 78 52 turret 40mmaa");
        addShootPointPrimary("21 87 -60 turret 40mmaa");
        addShootPointPrimary("-26 78 -52 turret 40mmaa");
        addShootPointSecondary("-109 71 -41 turret 50calaagun");
        addShootPointSecondary("-148 72 -33 turret 50calaagun");
        addShootPointSecondary("-148 72 33 turret 50calaagun");
        addShootPointSecondary("-109 71 41 turret 50calaagun");
        addShootPointSecondary("246 40 -52 turret 50calaagun");
        addShootPointSecondary("246 40 52 turret 50calaagun");
        addShootPointSecondary("426 40 -32 turret 50calaagun");
        addShootPointSecondary("426 40 32 turret 50calaagun");
        addShootPointSecondary("486 41 1 turret 50calaagun");
        addGunOrigin("1 197 -27 0");
        addGunOrigin("2 272 -10 0");
        addGunOrigin("3 -259 -11 0");
        addGunOrigin("4 -339 -5 0");
        
    }
}
