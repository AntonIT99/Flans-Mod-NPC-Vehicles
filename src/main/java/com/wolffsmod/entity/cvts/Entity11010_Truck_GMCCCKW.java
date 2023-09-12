package com.wolffsmod.entity.cvts;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class Entity11010_Truck_GMCCCKW extends EntityFlanVehicleNPC
{
    public Entity11010_Truck_GMCCCKW(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.65F);
        setDriver("8 -8 -8");
        setRotatedDriverOffset("0 0 0");
        setPassenger("1 8 -8 8 core -360 360 -89 89 dummygun DummyGun");
        setPassenger("2 -12 -2 -10 core 60 160 -45 45");
        setPassenger("3 -12 -2 10 core -160 -60 -45 45");
        setPassenger("4 -28 -2 -10 core 60 160 -45 45");
        setPassenger("5 -28 -2 10 core -160 -60 -45 45");
        setPassenger("6 -44 -2 -10 core 60 160 -45 45");
        setPassenger("7 -44 -2 10 core -160 -60 -45 45");
        addShootPointPrimary("24 0 0 core");
        addShootPointSecondary("24 0 0 core");
        addShootParticlesPrimary("note 0 1 0");
        addShootParticlesPrimary("note 0 2 0");
        
    }
}
