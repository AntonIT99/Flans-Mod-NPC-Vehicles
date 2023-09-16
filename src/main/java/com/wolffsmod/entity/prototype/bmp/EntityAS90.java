package com.wolffsmod.entity.prototype.bmp;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityAS90 extends EntityFlanVehicleNPC
{
    public EntityAS90(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.3F);
        setDriver("0 36 0 -360 360 -10 80");
        setRotatedDriverOffset("0 0 10");
        addBarrelPosition("133 28 0");
        
    }
}
