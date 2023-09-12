package com.wolffsmod.entity.official.ww2;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class EntitySpitfire extends EntityFlanPlaneNPC
{
    public EntitySpitfire(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.8F);
        setDriver("-4 -1 0");
        addShootPointPrimary("26 -4 18 rightWing");
        addShootPointPrimary("26 -4 -18 leftWing");
        addShootPointPrimary("38 -4 44 rightWing");
        addShootPointPrimary("40 -4 44 rightWing");
        addShootPointPrimary("38 -4 -44 leftWing");
        addShootPointPrimary("40 -4 -44 leftWing");
        addShootPointSecondary("-4 -16 0 core");
        addShootParticlesPrimary("cloud 0 0 0");
    }
}
