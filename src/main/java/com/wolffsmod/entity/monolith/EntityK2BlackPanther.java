package com.wolffsmod.entity.monolith;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityK2BlackPanther extends EntityFlanVehicleNPC
{
    public EntityK2BlackPanther(World w)
    {
        super(w);
        setSize(3.5F, 3.0F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.4F);
        setDriver("0 9 0 -360 360 -8 20");
        setRotatedDriverOffset("21 0 -14");
        setDriverAimSpeed("2 2 0");
        addShootPointPrimary("139 26 0 turret");
        addShootPointSecondary("47 24 6 turret sevenMM");
        addShootPointSecondary("40 44 -20 core twelveMM");
        addLeftLinkPoint("[56,14,26.5]");
        addLeftLinkPoint("[60,10,26.5]");
        addLeftLinkPoint("[60,6,26.5]");
        addLeftLinkPoint("[56,1,26.5]");
        addLeftLinkPoint("[40,-9.5,26.5]");
        addLeftLinkPoint("[-55,-9.5,26.5]");
        addLeftLinkPoint("[-70.5,1,26.5]");
        addLeftLinkPoint("[-74.5,5,26.5]");
        addLeftLinkPoint("[-74.5,11,26.5]");
        addLeftLinkPoint("[-70.5,14,26.5]");
        addRightLinkPoint("[56,14,-26.5]");
        addRightLinkPoint("[60,10,-26.5]");
        addRightLinkPoint("[60,6,-26.5]");
        addRightLinkPoint("[56,1,-26.5]");
        addRightLinkPoint("[40,-9.5,-26.5]");
        addRightLinkPoint("[-55,-9.5,-26.5]");
        addRightLinkPoint("[-70.5,1,-26.5]");
        addRightLinkPoint("[-74.5,5,-26.5]");
        addRightLinkPoint("[-74.5,11,-26.5]");
        addRightLinkPoint("[-70.5,14,-26.5]");
        setTrackLinkLength(5.0F);
        
    }
}
