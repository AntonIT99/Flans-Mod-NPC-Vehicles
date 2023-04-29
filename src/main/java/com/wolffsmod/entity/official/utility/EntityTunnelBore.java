package com.wolffsmod.entity.official.utility;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityTunnelBore extends EntityFlanVehicleNPC
{
    public EntityTunnelBore(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.5F);
        setDriver("15 20 0 -360 360 -90 90");
        
    }
}
