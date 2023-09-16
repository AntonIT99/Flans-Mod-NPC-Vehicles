package com.wolffsmod.entity.prototype.bmp;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class EntityTyphoon extends EntityFlanPlaneNPC
{
    public EntityTyphoon(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(4.0F);
        setDriver("74 39 0");
        addShootPointPrimary("70 28 -9 core ADEN");
        addShootPointSecondary("29 10 -38 leftWing");
        addShootPointSecondary("29 10 38 rightWing");
        addShootPointSecondary("6 14 -61 leftWing");
        addShootPointSecondary("6 14 61 rightWing");
        addShootPointSecondary("-35 12 -80 leftWing");
        addShootPointSecondary("-35 12 -80 rightWing");
        addShootPointSecondary("-33 16 -99 leftWing");
        addShootPointSecondary("-33 16 99 rightWing");
        
    }
}
