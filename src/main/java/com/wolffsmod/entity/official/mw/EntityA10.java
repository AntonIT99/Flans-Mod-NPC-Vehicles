package com.wolffsmod.entity.official.mw;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class EntityA10 extends EntityFlanPlaneNPC
{
    public EntityA10(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(2.0F);
        addShootPointPrimary("166 24 -1 nose minigun");
        addShootPointSecondary("45 10 -60 leftWing");
        addShootPointSecondary("45 10 60 rightWing");
        addShootPointSecondary("30 13 -94 leftWing");
        addShootPointSecondary("30 13 94 rightWing");
        
    }
}
