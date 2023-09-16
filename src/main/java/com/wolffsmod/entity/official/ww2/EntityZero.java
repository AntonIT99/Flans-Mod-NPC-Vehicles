package com.wolffsmod.entity.official.ww2;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class EntityZero extends EntityFlanPlaneNPC
{
    public EntityZero(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.8F);
        setDriver("12 -1 0");
        addShootPointPrimary("36 9 4 nose");
        addShootPointPrimary("36 9 -4 nose");
        addShootPointPrimary("28 -3 22 rightWing");
        addShootPointPrimary("30 -3 22 rightWing");
        addShootPointPrimary("28 -3 -22 leftWing");
        addShootPointPrimary("30 -3 -22 leftWing");
        addShootPointSecondary("-4 -16 0 core");
        addShootParticlesPrimary("cloud 0 0 0");
    }
}
