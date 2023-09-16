package com.wolffsmod.entity.prototype.psf;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class EntityXwing extends EntityFlanPlaneNPC
{
    public EntityXwing(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(4.0F);
        setDriver("-20 22 0");
        addShootPointPrimary("70 50 -30 nose LaserMG");
        addShootPointPrimary("70 50 30 nose LaserMG");
        addShootPointPrimary("70 -10 -30 nose LaserMG");
        addShootPointPrimary("70 -10 30 nose LaserMG");
        addShootPointSecondary("-60 16 -58 leftWing");
        addShootPointSecondary("-60 16 58 rightWing");
        
    }
}
