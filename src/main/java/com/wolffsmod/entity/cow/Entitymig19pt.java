package com.wolffsmod.entity.cow;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class Entitymig19pt extends EntityFlanPlaneNPC
{
    public Entitymig19pt(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(1.7F);
        setDriver("68 21 0");
        addShootPointPrimary("68 20 16.5 core 30mmgun");
        addShootPointPrimary("68 20 -17.5 core 30mmgun");
        addShootPointSecondary("11 12 -49 leftWing");
        addShootPointSecondary("11 12 47 rightWing");
        
    }
}
