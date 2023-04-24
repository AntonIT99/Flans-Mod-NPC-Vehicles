package com.wolffsmod.entity.official.ww2.legacy;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityJeep extends EntityFlanVehicleNPC
{
    public EntityJeep(World w)
    {
        super(w);
        setSize(2F, 2F);
    }
    
    @Override
    public void setupConfig()
    {
        setDriver("0 -6 -8");
        setPassenger("1 0 -6 8 core");
        setPassenger("2 -16 6 0 core -60 60 -30 60 browning Browning");
        addGunOrigin("2 0 -4 0");
        setRotateWheels(false);
        
    }
}
