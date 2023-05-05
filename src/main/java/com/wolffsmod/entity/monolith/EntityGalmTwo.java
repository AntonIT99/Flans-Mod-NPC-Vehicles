package com.wolffsmod.entity.monolith;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class EntityGalmTwo extends EntityFlanPlaneNPC
{
    public EntityGalmTwo(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(3.5F);
        setDriver("45 2 0");
        addShootPointPrimary("50 20 35 core twentyMM");
        addShootPointSecondary("-60 16 -58 leftWing");
        addShootPointSecondary("-60 16 58 rightWing");
        
    }
}
