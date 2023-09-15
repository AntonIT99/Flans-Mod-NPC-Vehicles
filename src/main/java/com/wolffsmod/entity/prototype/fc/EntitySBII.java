package com.wolffsmod.entity.prototype.fc;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntitySBII extends EntityFlanVehicleNPC
{
    public EntitySBII(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(2.5F);
        setDriver("-8 6 0");
        setRotatedDriverOffset("0 0 0");
        
    }
}
