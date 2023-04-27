package com.wolffsmod.entity.w44;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class Entity44_M3Halftrack extends EntityFlanVehicleNPC
{
    public Entity44_M3Halftrack(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.45F);
        setDriver("6 5 -7");
        setRotatedDriverOffset("0 0 0");
        setDriverAimSpeed("3.0f 3.0f 0f");
        setPassenger("1 6 5 7 core");
        setPassenger("2 -37 12 12 core");
        setPassenger("3 -23 13 -12 core");
        setPassenger("4 -7 28 8 core -50 50 -10 30 44_50Cal PassengerGun4");
        setPassenger("5 -47 18 -7 core 130 230 -20 20 44_30Cal PassengerGun5");
        addGunOrigin("4 9 15 8");
        addGunOrigin("5 -54 10 -7");
        addLeftLinkPoint("[-4,8,13]");
        addLeftLinkPoint("[-1.3,6,13]");
        addLeftLinkPoint("[-1.3,-2,13]");
        addLeftLinkPoint("[-10,-8,13]");
        addLeftLinkPoint("[-48,-8,13]");
        addLeftLinkPoint("[-56.5,-2,13]");
        addLeftLinkPoint("[-56.5,5,13]");
        addLeftLinkPoint("[-53,8,13]");
        addLeftLinkPoint("[-11,8,13]");
        addLeftLinkPoint("[-6,8,13]");
        addRightLinkPoint("[-4,8,-13]");
        addRightLinkPoint("[-1.3,6,-13]");
        addRightLinkPoint("[-1.3,-2,-13]");
        addRightLinkPoint("[-10,-8,-13]");
        addRightLinkPoint("[-48,-8,-13]");
        addRightLinkPoint("[-56.5,-2,-13]");
        addRightLinkPoint("[-56.5,5,-13]");
        addRightLinkPoint("[-53,8,-13]");
        addRightLinkPoint("[-11,8,-13]");
        addRightLinkPoint("[-6,8,-13]");
        setTrackLinkLength(3.0F);
        
    }
}
