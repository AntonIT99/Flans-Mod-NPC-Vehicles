package com.wolffsmod.entity.monolith;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class EntityChengdu extends EntityFlanPlaneNPC
{
    public EntityChengdu(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(2.8F);
        setDriver("105 24 0");
        addShootPointPrimary("50 25 20 core twentyMM");
        addShootPointSecondary("-20 16 -38 leftWing");
        addShootPointSecondary("-20 5 -30 core");
        addShootPointSecondary("-20 5 -18 core");
        addShootPointSecondary("-20 5 -6 core");
        addShootPointSecondary("-20 5 6 core");
        addShootPointSecondary("-20 5 18 core");
        addShootPointSecondary("-20 5 30 core");
        addShootPointSecondary("-20 16 38 rightWing");
        
    }
}
