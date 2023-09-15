package com.wolffsmod.entity.manus.sifi;

import com.wolffsmod.entity.EntityFlanAAGunNPC;

import net.minecraft.world.World;

public class EntityXX9 extends EntityFlanAAGunNPC
{
    public EntityXX9(World w)
    {
        super(w);
        setSize(1.5F, 1.5F);
    }

    @Override
    public void setupConfig()
    {
        setDriver("20 103 0 -360 360 0 90");
        setNumBarrels(2);
        addBarrel("0 125 66 25");
        addBarrel("1 125 66 -25");
        setRecoil(4F);
    }
}
