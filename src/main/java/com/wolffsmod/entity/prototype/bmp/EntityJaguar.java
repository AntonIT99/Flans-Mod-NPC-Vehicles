package com.wolffsmod.entity.prototype.bmp;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class EntityJaguar extends EntityFlanPlaneNPC
{
    public EntityJaguar(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(2.0F);
        setDriver("16 24 0");
        addShootPointPrimary("17 20 -12 core ADEN");
        addShootPointPrimary("17 20 12 nose ADEN");
        addShootPointSecondary("-26 45 -40 leftWing");
        addShootPointSecondary("-26 45 40 rightWing");
        
    }
}
