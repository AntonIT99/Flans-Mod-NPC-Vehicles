package com.wolffsmod.entity.cow;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class EntityKa27 extends EntityFlanPlaneNPC
{
    public EntityKa27(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(2.5F);
        setDriver("71 28 -10");
        setPassenger("1 71 28 9 core");
        addShootPointPrimary("-18 -5 0 core");
        
    }
}
