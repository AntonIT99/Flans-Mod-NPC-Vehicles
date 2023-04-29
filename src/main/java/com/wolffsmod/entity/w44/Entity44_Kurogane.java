package com.wolffsmod.entity.w44;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class Entity44_Kurogane extends EntityFlanVehicleNPC
{
    public Entity44_Kurogane(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.5F);
        setDriver("-3 0 7");
        setRotatedDriverOffset("0 0 0");
        setDriverAimSpeed("3.0f 3.0f 0f");
        setPassenger("1 -3 0 -7 core -60 60 -5 60 44_Type99 PassengerGun1");
        setPassenger("2 -15 0 0 core");
        addGunOrigin("1 16 -5 -6");
        
    }
}
