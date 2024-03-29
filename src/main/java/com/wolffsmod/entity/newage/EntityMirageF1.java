package com.wolffsmod.entity.newage;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class EntityMirageF1 extends EntityFlanPlaneNPC
{
    public EntityMirageF1(World w)
    {
        super(w);
        setSize(3.5F, 2.8F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(2.2F);
        setDriver("60 17 0");
        addShootPointPrimary("32 13 6 core DEFAgun");
        addShootPointPrimary("32 13 -6 core DEFAgun");
        addShootPointSecondary("-26 25 -100 leftWing");
        addShootPointSecondary("-26 25 100 rightWing");
        addShootParticlesPrimary("flansmod.fmflame 0 0 0");
        
    }
}
