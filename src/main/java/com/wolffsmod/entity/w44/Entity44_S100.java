package com.wolffsmod.entity.w44;

import com.wolffsmod.entity.EntityFlanShipNPC;
import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class Entity44_S100 extends EntityFlanShipNPC
{
    public Entity44_S100(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.18F);
        setDriver("83 78 0 -360 360 -89 89");
        setRotatedDriverOffset("0 0 0");
        setPassenger("1 193 60 0 core -270 200 -4 35 44_20mmCannon PassengerGun1");
        setPassenger("2 -50 64 0 core -360 360 -3 45 44_20mmCannon PassengerGun2");
        setPassenger("3 -180 65 8 core -360 360 -3 65 44_37mmCannon PassengerGun3");
        setPassenger("4 72 79 -12 core -135 -45 -25 50 44_Mg15 PassengerGun4");
        setPassenger("5 72 79 12 core 45 135 -25 50 44_Mg15 PassengerGun5");
        addShootPointPrimary("85 32 30 core");
        addShootPointPrimary("85 32 -30 core");
        addGunOrigin("1 184 46 0");
        addGunOrigin("2 -24 53 0");
        addGunOrigin("3 -142 49 0");
        addGunOrigin("4 69 61 -18");
        addGunOrigin("5 69 61 18");
        
    }
}
