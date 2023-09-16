package com.wolffsmod.entity.cow;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class Entitymitsut2 extends EntityFlanPlaneNPC
{
    public Entitymitsut2(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(1.5F);
        setDriver("12 27 0");
        setPassenger("1 39 20 0 core");
        addShootPointPrimary("60 3 0 nose 20milg");
        addShootPointSecondary("-60 16 -58 leftWing");
        addShootPointSecondary("-60 16 58 rightWing");
        
    }
}
