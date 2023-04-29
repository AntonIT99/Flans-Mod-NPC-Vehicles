package com.wolffsmod.entity.ez8;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityBMP2 extends EntityFlanVehicleNPC
{
    public EntityBMP2(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.45F);
        setDriver("0 14 0 -360 360 -5 75");
        setRotatedDriverOffset("-4 0 -7");
        setPassenger("1 -20 5 -6 core -360 360 -89 89 dummygun DummyGun");
        setPassenger("2 -20 5 6 core -360 360 -89 89");
        setPassenger("3 -28 5 -6 core -360 360 -89 89");
        setPassenger("4 -28 5 6 core -360 360 -89 89");
        setPassenger("5 -36 5 -6 core -360 360 -89 89");
        setPassenger("6 -36 5 6 core -360 360 -89 89");
        addShootPointPrimary("21 24 0 turret");
        addShootPointSecondary("21 24 -3 turret");
        addShootParticlesPrimary("explode 2 0 0");
        
    }
}
