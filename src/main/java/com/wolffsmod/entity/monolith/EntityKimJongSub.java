package com.wolffsmod.entity.monolith;

import com.wolffsmod.entity.EntityFlanShipNPC;

import net.minecraft.world.World;

public class EntityKimJongSub extends EntityFlanShipNPC
{
    public EntityKimJongSub(World w)
    {
        super(w);
        setSize(3.0F, 2.0F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.55F);
        setDriver("40 16 0");
        addShootPointPrimary("215 -24 3 core");
        addShootPointPrimary("215 -18 4 core");
        addShootPointPrimary("215 -12 5 core");
        addShootPointPrimary("215 -24 -3 core");
        addShootPointPrimary("215 -18 -4 core");
        addShootPointPrimary("215 -12 -5 core");
        addShootPointSecondary("-220 -12 -4 core");
        addShootPointSecondary("-220 -12 4 core");
        
    }
}
