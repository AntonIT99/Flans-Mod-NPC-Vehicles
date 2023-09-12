package com.wolffsmod.entity.official.ww2.legacy;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class EntityYak9 extends EntityFlanPlaneNPC
{
    public EntityYak9(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.8F);
        setDriver("-4 -1 0");
        addShootPointPrimary("50 8 5 nose");
        addShootPointPrimary("58 2 0 nose");
        addShootPointPrimary("50 8 -5 nose");
        addShootPointPrimary("38 -4 44 rightWing");
        addShootPointPrimary("38 -4 -44 leftWing");
        addShootPointSecondary("-4 -16 0 core");
        addShootParticlesPrimary("cloud 0 0 0");
    }
}
