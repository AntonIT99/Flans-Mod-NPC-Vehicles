package com.wolffsmod.entity.official.ww2;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityFlak88 extends EntityFlanVehicleNPC
{
    public EntityFlak88(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.0F);
        setDriver("0 1 0 -360 360 -5 89");
        addBarrelPosition("0 15 0");
        
    }
}
