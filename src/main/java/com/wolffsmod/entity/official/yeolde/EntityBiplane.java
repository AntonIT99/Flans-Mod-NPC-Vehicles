package com.wolffsmod.entity.official.yeolde;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class EntityBiplane extends EntityFlanPlaneNPC
{
    public EntityBiplane(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setDriver("0 -4 0");
        
    }
}
