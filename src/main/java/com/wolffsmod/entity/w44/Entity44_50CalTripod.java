package com.wolffsmod.entity.w44;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class Entity44_50CalTripod extends EntityFlanVehicleNPC
{
    public Entity44_50CalTripod(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.0F);
        setDriver("0 -8 0 -25 25 -18 20");
        setRotatedDriverOffset("-20 0 0");
        addGun("30 3 0 turret 44_50Cal");
        setRotateWheels(false);
        
    }
}
