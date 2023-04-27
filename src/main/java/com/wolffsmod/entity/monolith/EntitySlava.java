package com.wolffsmod.entity.monolith;

import com.wolffsmod.entity.EntityFlanShipNPC;

import net.minecraft.world.World;

public class EntitySlava extends EntityFlanShipNPC
{
    public EntitySlava(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.6F);
        setDriver("146 91 0");
        setDriverAimSpeed("8 8 0");
        setPassenger("1 108 95 0 citadel");
        setPassenger("5 -389 25 -3 stern");
        setPassenger("3 314 42 3 turret1 -140 140 -12 80 AK130 AK130");
        setPassenger("4 210 57 3 turret3 -140 140 -15 65 RBU6000 ASW");
        setPassenger("2 -190 30 -1 turret2 -180 180 25 85 S300F S300");
        setPassengerAimSpeed("3 4 4 0");
        setPassengerAimSpeed("4 4 4 0");
        setPassengerAimSpeed("5 4 4 0");
        addShootPointPrimary("99 50 32 right");
        addShootPointPrimary("99 50 -35 left");
        addShootPointPrimary("153 50 31 right");
        addShootPointPrimary("153 50 -35 left");
        addShootPointPrimary("209 53 31 right");
        addShootPointPrimary("209 53 -35 left");
        addShootPointPrimary("264 54 31 right");
        addShootPointPrimary("264 54 -35 left");
        addShootPointSecondary("265 67 -1 stern thirtyMM");
        addShootPointSecondary("240 69 -1 stern thirtyMM");
        addShootPointSecondary("12 44 41 right thirtyMM");
        addShootPointSecondary("-25 44 41 right thirtyMM");
        addShootPointSecondary("12 44 -38 left thirtyMM");
        addShootPointSecondary("-25 44 -38 left thirtyMM");
        addGunOrigin("3 314 22 3");
        addGunOrigin("4 210 37 3");
        addGunOrigin("2 -190 10 -1");
        
    }
}
