package com.wolffsmod.entity.prototype.bmp;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class EntityHarrier extends EntityFlanPlaneNPC
{
    public EntityHarrier(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(2.0F);
        setDriver("72 24 0");
        addShootPointPrimary("25 6 -13 core ADEN");
        addShootPointPrimary("25 6 13 nose ADEN");
        addShootPointSecondary("-17 25 -59 leftWing");
        addShootPointSecondary("-17 25 59 rightWing");
        addShootPointSecondary("-12 21 -72 leftWing");
        addShootPointSecondary("-12 21 72 rightWing");
        addShootPointSecondary("-21 20 -88 leftWing");
        addShootPointSecondary("-21 20 88 rightWing");
        
    }
}
