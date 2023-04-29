package com.wolffsmod.entity.w44;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class Entity44_Willys30Cal extends EntityFlanVehicleNPC
{
    public Entity44_Willys30Cal(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.5F);
        setDriver("-4 5 -7");
        setRotatedDriverOffset("0 0 0");
        setDriverAimSpeed("3.0f 3.0f 0f");
        setPassenger("1 -4 5 7 core");
        setPassenger("2 -23 13 0 core -45 45 -10 30 44_30Cal PassengerGun2");
        addGunOrigin("2 -10 5 0");
        
    }
}
