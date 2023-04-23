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
        setDriver("6 30 -9");
        setNumBarrels(1);
        setRecoil(4F);
        //TODO: check barrel position
        addBarrelPosition("100 0 0");
    }
}
