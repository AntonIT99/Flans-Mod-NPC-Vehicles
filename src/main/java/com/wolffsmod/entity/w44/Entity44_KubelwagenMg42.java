package com.wolffsmod.entity.w44;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class Entity44_KubelwagenMg42 extends EntityFlanVehicleNPC
{
    public Entity44_KubelwagenMg42(World w)
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
        setPassenger("1 -13 9 -7 core");
        setPassenger("2 -13 9 7 core -45 45 -10 30 44_Mg42 PassengerGun2");
        setVehicleGunModelScale(0.75F);
        addGunOrigin("2 10 2 6");
        
    }
}
