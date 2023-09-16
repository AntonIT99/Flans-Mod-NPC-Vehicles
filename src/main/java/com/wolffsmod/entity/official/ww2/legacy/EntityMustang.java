package com.wolffsmod.entity.official.ww2.legacy;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class EntityMustang extends EntityFlanPlaneNPC
{
    public EntityMustang(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.8F);
        setDriver("-4 -1 0");
        addShootPointPrimary("30 -4 20 rightWing");
        addShootPointPrimary("28 -4 28 rightWing");
        addShootPointPrimary("26 -4 36 rightWing");
        addShootPointPrimary("30 -4 -20 leftWing");
        addShootPointPrimary("28 -4 -28 leftWing");
        addShootPointPrimary("26 -4 -36 leftWing");
        addShootPointSecondary("-4 -16 0 core");
        addShootParticlesPrimary("cloud 0 0 0");
    }
}
