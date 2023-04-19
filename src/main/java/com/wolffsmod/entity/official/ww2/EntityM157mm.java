package com.wolffsmod.entity.official.ww2;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityM157mm extends EntityFlanVehicleNPC
{
    public EntityM157mm(World w)
    {
        super(w);
        this.setSize(3.0F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.0F);
        setDriver("-14 -3 -11 -15 15 -5 8");
        setDriverAimSpeed("0.4f 0.3f 0f");
        addBarrelPosition("0 20 0");
        
    }
}
