package com.wolffsmod.entity.monolith;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityA7V extends EntityFlanVehicleNPC
{
    public EntityA7V(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.4F);
        setDriver("-5 34 -9");
        setPassenger("1 1 34 9 core");
        setPassenger("2 33 18 6 core 60 130 -8 20 sevenMM PassengerGun2");
        setPassenger("3 -34 18 6 core 60 130 -8 20 sevenMM PassengerGun3");
        setPassenger("4 33 18 -6 core 240 300 -8 20 sevenMM PassengerGun4");
        setPassenger("5 -34 18 -6 core 240 300 -8 20 sevenMM PassengerGun5");
        setPassenger("6 -49 13 -6 core 170 230 -8 20 sevenMM PassengerGun6");
        setPassenger("7 -49 13 6 core 130 190 -8 20 sevenMM PassengerGun7");
        setPassenger("8 50 17 0 core -30 30 -8 10 57mmCannon PassengerGun8");
        setPassengerAimSpeed("1 8 8 0");
        setPassengerAimSpeed("2 8 8 0");
        setPassengerAimSpeed("3 8 8 0");
        setPassengerAimSpeed("4 8 8 0");
        setPassengerAimSpeed("5 8 8 0");
        setPassengerAimSpeed("6 8 8 0");
        setPassengerAimSpeed("7 8 8 0");
        setPassengerAimSpeed("8 8 8 0");
        addShootPointPrimary("60 32 0 turret");
        addShootPointSecondary("40 20 8 turret");
        addGunOrigin("2 33 8 6");
        addGunOrigin("3 -34 8 6");
        addGunOrigin("4 33 8 -6");
        addGunOrigin("5 -34 8 -6");
        addGunOrigin("6 -49 5 -6");
        addGunOrigin("7 -49 5 6");
        addGunOrigin("8 65 9 0");
        
    }
}
