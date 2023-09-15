package com.wolffsmod.entity.prototype.fc;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class EntityUTFScimitar extends EntityFlanPlaneNPC
{
    public EntityUTFScimitar(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(4.0F);
        setDriver("8 1 0");
        addShootPointPrimary("60 13 -5 nose LaserMG");
        addShootPointPrimary("60 13 5 nose LaserMG");
        addShootPointSecondary("-60 16 -58 leftWing");
        addShootPointSecondary("-60 16 58 rightWing");
        
    }
}
