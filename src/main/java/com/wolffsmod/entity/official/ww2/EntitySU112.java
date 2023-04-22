package com.wolffsmod.entity.official.ww2;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntitySU112 extends EntityFlanVehicleNPC
{
    public EntitySU112(World w)
    {
        super(w);
        setSize(3.0F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.25F);
        setDriver("44 15 -7 -360 360 -5 30");
        setPassenger("1 44 15 7 core -360 360 -89 89");
        addBarrelPosition("20 33 0");
        addGunOrigin("1 -5 15 20");
        
    }
}
