package com.wolffsmod.entity.w44;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityPanzerIVF1 extends EntityFlanVehicleNPC
{
    public EntityPanzerIVF1(World w)
    {
        super(w);
        this.setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setDriver("0 30 0 -360 360 -10 20");
        setDriverAimSpeed(0.65F, 0.55F);
        setPassenger("1 26 6 13 core -10 10 -10 10 44_Mg34 PassengerGun1");

        addBarrelPosition(45F, 29F, 0F);
        setTrackLinkLength(3F);

        addRightLinkPoint("[48,12,-23.2]");
        addRightLinkPoint("[50.3,10,-23.2]");
        addRightLinkPoint("[50.3,3,-23.2]");
        addRightLinkPoint("[45,-5,-23.2]");
        addRightLinkPoint("[39,-9,-23.2]");
        addRightLinkPoint("[-30,-9,-23.2]");
        addRightLinkPoint("[-47.5,1,-23.2]");
        addRightLinkPoint("[-47.5,6,-23.2]");
        addRightLinkPoint("[-43,10,-23.2]");
        addRightLinkPoint("[-40,11,-23.2]");
        addRightLinkPoint("[30,13,-23.2]");
        addRightLinkPoint("[45,12,-23.2]");

        addLeftLinkPoint("[48,12,23.2]");
        addLeftLinkPoint("[50.3,10,23.2]");
        addLeftLinkPoint("[50.3,3,23.2]");
        addLeftLinkPoint("[39,-9,23.2]");
        addLeftLinkPoint("[-30,-9,23.2]");
        addLeftLinkPoint("[-47.5,1,23.2]");
        addLeftLinkPoint("[-47.5,6,23.2]");
        addLeftLinkPoint("[-43,10,23.2]");
        addLeftLinkPoint("[-40,11,23.2]");
        addLeftLinkPoint("[30,13,23.2]");
        addLeftLinkPoint("[45,12,23.2]");
    }
}
