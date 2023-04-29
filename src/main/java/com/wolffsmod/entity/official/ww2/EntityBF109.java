package com.wolffsmod.entity.official.ww2;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class EntityBF109 extends EntityFlanPlaneNPC
{
    public EntityBF109(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(1.6F);
        setDriver("9 25 0");
        addShootPointPrimary("69 39 6 nose mg42");
        addShootPointPrimary("69 39 -6 nose mg42");
        addShootPointPrimary("94 30 0 nose MG151");
        
    }
}
