package com.wolffsmod.entity.official.yeolde;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class EntityTwoSeatBiplane extends EntityFlanPlaneNPC
{
    public EntityTwoSeatBiplane(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setDriver("0 -4 0");
        setPassenger("1 -24 -4 0 bay");
        
    }
}
