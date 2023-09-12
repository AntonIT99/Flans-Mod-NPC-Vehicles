package com.wolffsmod.entity.mos;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class Entity11013_Bike_BMWR75 extends EntityFlanVehicleNPC
{
    public Entity11013_Bike_BMWR75(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.8F);
        setDriver("0 2 0");
        setRotatedDriverOffset("0 0 0");
        setPassenger("1 -12 7 0 core -360 360 -89 89 dummygun DummyGun");
        addShootPointPrimary("12 8 0 core");
        addShootParticlesPrimary("note 0 1 0");
        addShootParticlesPrimary("note 0 2 0");
        
    }
}
