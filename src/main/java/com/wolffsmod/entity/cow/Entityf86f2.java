package com.wolffsmod.entity.cow;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class Entityf86f2 extends EntityFlanPlaneNPC
{
    public Entityf86f2(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(2.0F);
        setDriver("35 16 0");
        addShootPointPrimary("60 3 0 nose 20milg");
        addShootPointPrimary("60 3 0 nose 20milg");
        addShootPointPrimary("60 3 0 nose 20milg");
        addShootPointPrimary("60 3 0 nose 20milg");
        addShootPointSecondary("-60 16 -58 leftWing");
        addShootPointSecondary("-60 16 58 rightWing");
        
    }
}
