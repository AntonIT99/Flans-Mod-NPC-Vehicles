package com.wolffsmod.entity.manus.sifi;

import com.wolffsmod.entity.EntityFlanAAGunNPC;

import net.minecraft.world.World;

public class EntityImperialThrone extends EntityFlanAAGunNPC
{
    public EntityImperialThrone(World w)
    {
        super(w);
        setSize(1.5F, 1.5F);
    }

    @Override
    public void setupConfig()
    {
        setDriver("0 29 0 -360 360 0 0");
        setNumBarrels(0);
        setRecoil(0F);
    }
}
