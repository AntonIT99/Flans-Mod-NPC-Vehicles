package com.wolffsmod.entity.monolith;

import com.wolffsmod.entity.EntityFlanAAGunNPC;

import net.minecraft.world.World;

public class EntityYamato extends EntityFlanAAGunNPC
{
    public EntityYamato(World w)
    {
        super(w);
        setSize(5F, 3F);
    }

    @Override
    public void setupConfig()
    {
        setDriver("12 65 0 -360 360 -2 22");
        setNumBarrels(3);
        addBarrel("0 150 22 0");
        addBarrel("1 150 22 20");
        addBarrel("2 150 22 40");
        setRecoil(5F);
    }
}
