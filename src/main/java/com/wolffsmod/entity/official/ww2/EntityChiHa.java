package com.wolffsmod.entity.official.ww2;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityChiHa extends EntityFlanVehicleNPC
{
    public EntityChiHa(World w)
    {
        super(w);
        setSize(2.8F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.25F);
        setDriver("0 14 0 -360 360 -3 3.5");
        setRotatedDriverOffset("5 0 1");
        addBarrelPosition("0 34 0");
        addGun("8 34 8 turret type99");
        
    }
}
