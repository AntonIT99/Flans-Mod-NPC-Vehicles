package com.wolffsmod.entity.w44;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class Entity44_SdKfz251Hanomag extends EntityFlanVehicleNPC
{
    public Entity44_SdKfz251Hanomag(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.45F);
        setDriver("-7 9 -8");
        setRotatedDriverOffset("0 0 0");
        setDriverAimSpeed("3.0f 3.0f 0f");
        setPassenger("1 -7 9 8 core");
        setPassenger("2 -17 21 0 core -40 40 -10 25 44_Mg34 PassengerGun2");
        setPassenger("3 -45 10 -8 core");
        setPassenger("4 -28 10 8 core");
        setPassenger("5 -53 21 0 core 130 230 -30 5 44_Mg34 PassengerGun5");
        addGunOrigin("2 -4 14 0");
        addGunOrigin("5 -67 14 0");
        addLeftLinkPoint("[18,8,19]");
        addLeftLinkPoint("[21.3,6,19]");
        addLeftLinkPoint("[21.3,-2,19]");
        addLeftLinkPoint("[9,-9,19]");
        addLeftLinkPoint("[-50,-9,19]");
        addLeftLinkPoint("[-54.5,-3,19]");
        addLeftLinkPoint("[-54.5,5,19]");
        addLeftLinkPoint("[-51,6,19]");
        addLeftLinkPoint("[7,6,19]");
        addLeftLinkPoint("[12,8,19]");
        addLeftLinkPoint("[17,8,19]");
        addRightLinkPoint("[18,8,-19]");
        addRightLinkPoint("[21.3,6,-19]");
        addRightLinkPoint("[21.3,-2,-19]");
        addRightLinkPoint("[9,-9,-19]");
        addRightLinkPoint("[-50,-9,-19]");
        addRightLinkPoint("[-54.5,-3,-19]");
        addRightLinkPoint("[-54.5,5,-19]");
        addRightLinkPoint("[-51,6,-19]");
        addRightLinkPoint("[7,6,-19]");
        addRightLinkPoint("[12,8,-19]");
        addRightLinkPoint("[17,8,-19]");
        setTrackLinkLength(3.0F);
        
    }
}
