package com.wolffsmod.entity.prototype.bmp;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityMoke extends EntityFlanVehicleNPC
{
    public EntityMoke(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(1.1F);
        setDriver("3 -3 -8");
        setRotatedDriverOffset("0 0 0");
        setPassenger("1 3 -3 8 core");
        setPassenger("2 -17 -3 8 core");
        setPassenger("3 -17 -3 -8 core");
        
    }
}
