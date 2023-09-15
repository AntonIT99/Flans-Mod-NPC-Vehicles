package com.wolffsmod.entity.prototype.psf;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class EntityA144 extends EntityFlanPlaneNPC
{
    public EntityA144(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(4.0F);
        setDriver("-6 2 0");
        addShootPointPrimary("60 13 -5 nose LaserMG");
        addShootPointPrimary("60 13 5 nose LaserMG");
        addShootPointSecondary("-60 16 -58 leftWing");
        addShootPointSecondary("-60 16 58 rightWing");
        
    }
}
