package com.wolffsmod.entity.official.mw;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityAbrams extends EntityFlanVehicleNPC
{
    public EntityAbrams(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.3F);
        setDriver("0 30 0 -360 360 -10 20");
        setRotatedDriverOffset("-18 0 -10");
        setDriverAimSpeed("2 2 0");
        setPassenger("1 0 32 0 turret -360 360 -15 40 m60 M2");
        addBarrelPosition("110 30 0");
        addGun("46 31 4 turret m60");
        addGunOrigin("1 12 30 1");
        
    }
}
