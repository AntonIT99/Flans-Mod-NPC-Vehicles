package com.wolffsmod.entity.prototype.bmp;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityWarrior extends EntityFlanVehicleNPC
{
    public EntityWarrior(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.5F);
        setDriver("0 32 0 -360 360 -10 20");
        setRotatedDriverOffset("0 0 0");
        setPassenger("1 0 2 12 core -170 -10 -15 60");
        setPassenger("2 -10 2 12 core -170 -10 -15 60");
        setPassenger("3 0 2 -12 core 10 170 -15 60");
        setPassenger("4 -9 2 -12 core 10 170 -15 60");
        setPassenger("5 -24 2 -12 core 10 170 -15 60");
        addBarrelPosition("70 32 0");
        
    }
}
