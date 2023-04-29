package com.wolffsmod.entity.w44;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class Entity44_T20 extends EntityFlanVehicleNPC
{
    public Entity44_T20(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.425F);
        setDriver("0 -3 -6 -360 360 -89 89");
        setRotatedDriverOffset("0 0 0");
        setDriverAimSpeed("0.5 0.4 0");
        setPassenger("1 3 -4 4 core -15 15 -15 15 44_DT28 PassengerGun1");
        setPassenger("2 -14 13 -5 core");
        setPassenger("3 -30 13 -5 core");
        setPassenger("4 -14 13 6 core");
        setPassenger("5 -30 13 6 core");
        addGunOrigin("1 20 -7 14");
        addLeftLinkPoint("[19.8,6.6,16]");
        addLeftLinkPoint("[22.8,3.6,16]");
        addLeftLinkPoint("[22.8,-1.5,16]");
        addLeftLinkPoint("[19.8,-4.5,16]");
        addLeftLinkPoint("[19.8,-4.5,16]");
        addLeftLinkPoint("[8,-9.5,16]");
        addLeftLinkPoint("[-31,-9.5,16]");
        addLeftLinkPoint("[-41,-4,16]");
        addLeftLinkPoint("[-43,-1.5,16]");
        addLeftLinkPoint("[-43,2,16]");
        addLeftLinkPoint("[-41,4.2,16]");
        addLeftLinkPoint("[-22,5,16]");
        addLeftLinkPoint("[-3,6.5,16]");
        addLeftLinkPoint("[-3,6.5,16]");
        addLeftLinkPoint("[14,6.6,16]");
        addRightLinkPoint("[19.8,6.6,-16]");
        addRightLinkPoint("[22.8,3.6,-16]");
        addRightLinkPoint("[22.8,-1.5,-16]");
        addRightLinkPoint("[19.8,-4.5,-16]");
        addRightLinkPoint("[19.8,-4.5,-16]");
        addRightLinkPoint("[8,-9.5,-16]");
        addRightLinkPoint("[-31,-9.5,-16]");
        addRightLinkPoint("[-41,-4,-16]");
        addRightLinkPoint("[-43,-1.5,-16]");
        addRightLinkPoint("[-43,2,-16]");
        addRightLinkPoint("[-41,4.2,-16]");
        addRightLinkPoint("[-22,5,-16]");
        addRightLinkPoint("[-3,6.5,-16]");
        addRightLinkPoint("[-3,6.5,-16]");
        addRightLinkPoint("[14,6.6,-16]");
        setTrackLinkLength(3.0F);
        
    }
}
