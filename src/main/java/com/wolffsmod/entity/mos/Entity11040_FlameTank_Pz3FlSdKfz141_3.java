package com.wolffsmod.entity.mos;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class Entity11040_FlameTank_Pz3FlSdKfz141_3 extends EntityFlanVehicleNPC
{
    public Entity11040_FlameTank_Pz3FlSdKfz141_3(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.45F);
        setDriver("0 17 0 -360 360 -10 20");
        setRotatedDriverOffset("-2 0 0");
        setPassenger("1 -31 15 11 core -360 360 -89 89 dummygun DummyGun");
        setPassenger("2 -31 15 -11 core -360 360 -89 89");
        addShootPointPrimary("21 21 0 turret");
        addShootPointSecondary("24 23 7 turret");
        
    }
}
