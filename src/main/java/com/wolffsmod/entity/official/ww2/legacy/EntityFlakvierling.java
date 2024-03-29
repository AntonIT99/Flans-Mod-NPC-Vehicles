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
        setDriver("8 28 8 -360 360 0 90");
        setNumBarrels(4);
        addBarrel("0 30 6 6");
        addBarrel("1 30 12 6");
        addBarrel("2 30 12 0");
        addBarrel("3 30 6 0");
        setRecoil(5F);
    }
}
