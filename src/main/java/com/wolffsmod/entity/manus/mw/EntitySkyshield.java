package com.wolffsmod.entity.manus.mw;

import com.wolffsmod.entity.EntityFlanAAGunNPC;

import net.minecraft.world.World;

public class EntitySkyshield extends EntityFlanAAGunNPC
{
    public EntitySkyshield(World w)
    {
        super(w);
    }

    @Override
    public void setupConfig()
    {
        //TODO: check driver position
        setDriver("6 30 -9 -360 360 0 90");
        setNumBarrels(1);
        addBarrel("0 60 24 0");
        setRecoil(4F);
    }
}
