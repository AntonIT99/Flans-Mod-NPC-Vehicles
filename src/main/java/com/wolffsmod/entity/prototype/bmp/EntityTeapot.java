package com.wolffsmod.entity.prototype.bmp;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityTeapot extends EntityFlanVehicleNPC
{
    public EntityTeapot(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.5F);
        setDriver("0 33 0 -360 360 -10 20");
        setRotatedDriverOffset("-5 0 10");
        setPassenger("1 0 33 0 turret -360 360 -15 40 m60 Main");
        addBarrelPosition("131 26 0");
        addGun("41 29 -5 turret m60");
        addGunOrigin("1 -7 33 -13");
        
    }
}
