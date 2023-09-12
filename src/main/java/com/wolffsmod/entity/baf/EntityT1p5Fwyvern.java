package com.wolffsmod.entity.baf;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class EntityT1p5Fwyvern extends EntityFlanPlaneNPC
{
    public EntityT1p5Fwyvern(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setDriver("14 18 0");
        addShootPointPrimary("50 2 -53 leftWing hispano20");
        addShootPointPrimary("50 2 -66 leftWing hispano20");
        addShootPointPrimary("50 2 53 rightWing hispano20");
        addShootPointPrimary("50 2 66 rightWing hispano20");
        addShootPointSecondary("25 -14 -55 leftWing");
        addShootPointSecondary("25 -14 55 rightWing");
        addShootPointSecondary("19 -16 0 airframe");
        addShootPointSecondary("0 -12 0");
        addShootParticlesPrimary("flame 0 0 0");
        
    }
}
