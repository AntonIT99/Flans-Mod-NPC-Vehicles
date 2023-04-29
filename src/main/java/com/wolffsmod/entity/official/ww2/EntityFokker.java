package com.wolffsmod.entity.official.ww2;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class EntityFokker extends EntityFlanPlaneNPC
{
    public EntityFokker(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(1.5F);
        setDriver("0 -4 0");
        addShootPointPrimary("30 8 5 nose mg42");
        addShootPointPrimary("30 8 -5 nose mg42");
        
    }
}
