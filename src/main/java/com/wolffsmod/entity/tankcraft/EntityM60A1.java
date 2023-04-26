package com.wolffsmod.entity.tankcraft;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityM60A1 extends EntityFlanVehicleNPC
{
    public EntityM60A1(World w)
    {
        super(w);
        setSize(4.7F, 3.4F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.4F);
        setDriver("0 38 0 -360 360 -10 20");
        setRotatedDriverOffset("-11 0 10");
        setDriverAimSpeed("1.4 1.8 0");
        addShootPointPrimary("35 15 0 turret -40 0 0");
        addShootPointSecondary("40 30 3 turret sevenMM");
        addShootPointSecondary("30 42 10 turret twelveMM");
        addLeftLinkPoint("[-69,14,27]");
        addLeftLinkPoint("[47,13,27]");
        addLeftLinkPoint("[51,9,27]");
        addLeftLinkPoint("[51,4,27]");
        addLeftLinkPoint("[47,1,27]");
        addLeftLinkPoint("[35,-9,27]");
        addLeftLinkPoint("[-56,-9,27]");
        addLeftLinkPoint("[-69,2,27]");
        addLeftLinkPoint("[-73,6,27]");
        addLeftLinkPoint("[-73,10,27]");
        addRightLinkPoint("[-69,14,-27]");
        addRightLinkPoint("[47,13,-27]");
        addRightLinkPoint("[51,9,-27]");
        addRightLinkPoint("[51,4,-27]");
        addRightLinkPoint("[47,1,-27]");
        addRightLinkPoint("[35,-9,-27]");
        addRightLinkPoint("[-56,-9,-27]");
        addRightLinkPoint("[-69,2,-27]");
        addRightLinkPoint("[-73,6,-27]");
        addRightLinkPoint("[-73,10,-27]");
        setTrackLinkLength(5.0F);
        
    }
}
