package com.wolffsmod.entity.monolith;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class EntityFalken extends EntityFlanPlaneNPC
{
    public EntityFalken(World w)
    {
        super(w);
        setSize(6F, 4F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(6.0F);
        setDriver("90 30 0");
        addShootPointPrimary("70 15 0 core TLS");
        addShootPointSecondary("-60 16 -58 leftWing");
        addShootPointSecondary("-60 16 58 rightWing");
        
    }
}
