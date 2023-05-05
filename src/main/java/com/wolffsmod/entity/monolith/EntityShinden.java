package com.wolffsmod.entity.monolith;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class EntityShinden extends EntityFlanPlaneNPC
{
    public EntityShinden(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(1.6F);
        setDriver("4 15 0");
        addShootPointPrimary("80 35 5 nose thirtyMM");
        addShootPointPrimary("80 35 -5 nose thirtyMM");
        addShootPointPrimary("90 25 8 nose thirtyMM");
        addShootPointPrimary("90 25 -8 nose thirtyMM");
        addShootPointSecondary("0 -10 0");
        
    }
}
