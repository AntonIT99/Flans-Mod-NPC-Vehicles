package com.wolffsmod.entity.monolith;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class EntityF15J extends EntityFlanPlaneNPC
{
    public EntityF15J(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(3.2F);
        setDriver("45 22 0");
        addShootPointPrimary("70 15 0 core twentyMM");
        addShootPointSecondary("-60 16 -58 leftWing");
        addShootPointSecondary("-60 16 58 rightWing");
        
    }
}
