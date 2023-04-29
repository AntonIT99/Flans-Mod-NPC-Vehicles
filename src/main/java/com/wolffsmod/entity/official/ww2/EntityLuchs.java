package com.wolffsmod.entity.official.ww2;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityLuchs extends EntityFlanVehicleNPC
{
    public EntityLuchs(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.55F);
        setDriver("0 25 0 -360 360 -2 4");
        setRotatedDriverOffset("-7 0 -4");
        addBarrelPosition("5 25 0");
        addGun("8 20 0 turret mg42");
        
    }
}
