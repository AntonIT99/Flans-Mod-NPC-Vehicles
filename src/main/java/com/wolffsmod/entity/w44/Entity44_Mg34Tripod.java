package com.wolffsmod.entity.w44;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class Entity44_Mg34Tripod extends EntityFlanVehicleNPC
{
    public Entity44_Mg34Tripod(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.0F);
        setDriver("0 0 0 -17 17 -18 30");
        setRotatedDriverOffset("-15 0 0");
        addGun("10 13 0 turret 44_Mg34");
        
    }
}
