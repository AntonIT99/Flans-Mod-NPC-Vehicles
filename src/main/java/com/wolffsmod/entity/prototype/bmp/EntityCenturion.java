package com.wolffsmod.entity.prototype.bmp;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityCenturion extends EntityFlanVehicleNPC
{
    public EntityCenturion(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.5F);
        setDriver("0 37 0 -360 360 -10 18");
        setRotatedDriverOffset("-8 0 7");
        setPassenger("1 0 29 0 turret");
        setPassenger("2 37 8 10 core");
        addBarrelPosition("58 29 0");
        addGun("31 30 6 turret m60");
        
    }
}
