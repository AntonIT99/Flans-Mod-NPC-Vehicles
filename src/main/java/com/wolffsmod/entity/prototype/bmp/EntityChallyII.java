package com.wolffsmod.entity.prototype.bmp;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityChallyII extends EntityFlanVehicleNPC
{
    public EntityChallyII(World w)
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
        addBarrelPosition("131 26 0");
        addGun("8 34 8 turret m60");
        
    }
}
