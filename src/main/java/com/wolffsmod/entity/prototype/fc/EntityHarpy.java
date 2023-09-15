package com.wolffsmod.entity.prototype.fc;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class EntityHarpy extends EntityFlanPlaneNPC
{
    public EntityHarpy(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(2.0F);
        setDriver("50 24 0");
        addShootPointPrimary("60 27 20 nose LaserMG");
        addShootPointPrimary("60 27 -20 nose LaserMG");
        addShootPointSecondary("-16 17 -72 rightWing");
        addShootPointSecondary("-16 17 72 leftWing");
        
    }
}
