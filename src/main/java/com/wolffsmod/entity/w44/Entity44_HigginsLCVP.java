package com.wolffsmod.entity.w44;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class Entity44_HigginsLCVP extends EntityFlanVehicleNPC
{
    public Entity44_HigginsLCVP(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.13F);
        setDriver("0 16 -20 -360 360 -89 89");
        setRotatedDriverOffset("0 0 0");
        setPassenger("1 -28 24 -20 core -55 55 -5 45 44_30Cal PassengerGun1");
        setPassenger("2 -28 24 20 core -55 55 -5 45 44_30Cal PassengerGun2");
        addGunOrigin("1 -14 14 -18");
        addGunOrigin("2 -14 14 18");
        
    }
}
