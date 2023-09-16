package com.wolffsmod.entity.mos;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class Entity11906_Interior_Sofa extends EntityFlanVehicleNPC
{
    public Entity11906_Interior_Sofa(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.0F);
        setDriver("2 -3 9 -360 360 -89 89");
        setRotatedDriverOffset("0 0 0");
        setPassenger("1 2 -3 -9 core -360 369 -89 89 dummygun DummyGun");
        addShootPointPrimary("");
        addShootPointSecondary("");
        setRotateWheels(false);
        
    }
}
