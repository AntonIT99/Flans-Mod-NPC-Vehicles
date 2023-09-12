package com.wolffsmod.entity.cvts;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class Entity11905_Interior_KOTATSU extends EntityFlanVehicleNPC
{
    public Entity11905_Interior_KOTATSU(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.0F);
        setDriver("-18 -10 0 -360 360 -89 89");
        setRotatedDriverOffset("0 0 0");
        setPassenger("1 18 -10 0 core -360 369 -89 89 dummygun DummyGun");
        setPassenger("2 0 -10 18 core -360 369 -89 89");
        setPassenger("3 0 -10 -18 core -360 369 -89 89");
        addShootPointPrimary("0 0 0 turret");
        addShootPointSecondary("0 0 0 turret");
        setRotateWheels(false);
        
    }
}
