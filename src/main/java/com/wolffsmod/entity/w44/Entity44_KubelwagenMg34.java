package com.wolffsmod.entity.w44;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class Entity44_KubelwagenMg34 extends EntityFlanVehicleNPC
{
    public Entity44_KubelwagenMg34(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.5F);
        setDriver("3 4 -7");
        setRotatedDriverOffset("0 0 0");
        setDriverAimSpeed("3.0f 3.0f 0f");
        setPassenger("1 3 4 7 core");
        setPassenger("2 -16 13 0 core -45 45 -10 30 44_Mg34 PassengerGun2");
        setVehicleGunModelScale(1.3F);
        addGunOrigin("2 3 4 0");
        
    }
}
