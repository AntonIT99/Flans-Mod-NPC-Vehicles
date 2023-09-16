package com.wolffsmod.entity.prototype.bmp;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityScorpion90 extends EntityFlanVehicleNPC
{
    public EntityScorpion90(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.5F);
        setDriver("0 24 0 -360 360 -10 20");
        setRotatedDriverOffset("-4 0 -6");
        addBarrelPosition("46 27 0");
        
    }
}
