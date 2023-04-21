package com.wolffsmod.entity.official.ww2.legacy;

import com.wolffsmod.entity.EntityFlanAAGunNPC;

import net.minecraft.world.World;

public class EntityFlakvierling extends EntityFlanAAGunNPC
{
    public EntityFlakvierling(World w)
    {
        super(w);
        setSize(1.5F, 1.5F);
    }

    @Override
    public void setupConfig()
    {
        setNumBarrels(4);
        setRecoil(5F);
    }
}
