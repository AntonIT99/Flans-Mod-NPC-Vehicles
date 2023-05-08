package com.wolffsmod.entity.monolith;

import com.wolffsmod.entity.EntityFlanAAGunNPC;

import net.minecraft.world.World;

public class EntityCanon extends EntityFlanAAGunNPC
{
    public EntityCanon(World w)
    {
        super(w);
        setSize(2F, 2F);
    }

    @Override
    public void setupConfig()
    {
        setDriver("12 38 0 -360 360 0 80");
        setNumBarrels(1);
        addBarrel("0 30 12 0");
        setRecoil(5F);
    }
}
