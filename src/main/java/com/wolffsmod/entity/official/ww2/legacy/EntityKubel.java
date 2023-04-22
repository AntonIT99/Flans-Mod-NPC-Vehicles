package com.wolffsmod.entity.official.ww2.legacy;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityKubel extends EntityFlanVehicleNPC
{
    public EntityKubel(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setDriver("0 -6 -8");
        setPassenger("1 0 -6 8 core");
        setPassenger("2 -16 6 0 core -60 60 -30 60 mg42 MG42");
        addGunOrigin("2 0 -4 0");
        setRotateWheels(false);
        
    }
}
