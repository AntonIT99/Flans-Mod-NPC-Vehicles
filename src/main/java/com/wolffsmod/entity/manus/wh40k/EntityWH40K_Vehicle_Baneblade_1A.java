package com.wolffsmod.entity.manus.wh40k;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityWH40K_Vehicle_Baneblade_1A extends EntityFlanVehicleNPC
{
    public EntityWH40K_Vehicle_Baneblade_1A(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.3F);
        setDriver("0 97 0 -360 360 -10 30");
        setRotatedDriverOffset("4 0 12");
        setPassenger("1 71 52 -38 core -10 10 0 60 WH40K_MG_BanebladeDemolisherCannon_1A PassengerGun1");
        setPassenger("2 95 30 5 core -20 20 -5 35 WH40K_MG_HeavyBolter_1A PassengerGun2");
        setPassenger("3 50 31 -86 core -90 0 -45 20 WH40K_MG_HeavyBolter_1A PassengerGun3");
        setPassenger("4 50 31 53 core 0 90 -45 20 WH40K_MG_HeavyBolter_1A PassengerGun4");
        setPassenger("5 0 63 74 core 0 180 -10 30 WH40K_MG_LasCannon_1A PassengerGun5");
        setPassenger("6 0 64 -108 core -180 0 -10 30 WH40K_MG_LasCannon_1A PassengerGun6");
        addShootPointPrimary("-79 89 -11 turret");
        addBarrelPosition("25 34 0");
        addGun("8 34 8 turret WH40K_MG_HeavyBolter_1A");
        addGunOrigin("1 104 34 -38");
        addGunOrigin("2 64 38 5");
        addGunOrigin("3 6 30 -113");
        addGunOrigin("4 6 30 79");
        addGunOrigin("5 0 51 74");
        addGunOrigin("6 0 51 -108");
        
    }
}
