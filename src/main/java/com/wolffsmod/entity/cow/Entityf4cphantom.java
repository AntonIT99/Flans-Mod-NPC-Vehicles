package com.wolffsmod.entity.cow;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class Entityf4cphantom extends EntityFlanPlaneNPC
{
    public Entityf4cphantom(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(1.6F);
        setDriver("95 21 1");
        setPassenger("1 69 25 1 core");
        addShootPointPrimary("41 7 1 core 20milg");
        addShootPointSecondary("57 11 47 leftWing");
        addShootPointSecondary("57 11 31 leftWing");
        addShootPointSecondary("57 11 -47 rightWing");
        addShootPointSecondary("57 11 -31 rightWing");
        
    }
}
