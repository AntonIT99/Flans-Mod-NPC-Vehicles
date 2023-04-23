package com.wolffsmod.entity.manus.ww2;

import com.wolffsmod.entity.EntityFlanAAGunNPC;

import net.minecraft.world.World;

public class EntityWW2_AAGun_Flak88_4A extends EntityFlanAAGunNPC
{
    public EntityWW2_AAGun_Flak88_4A(World w)
    {
        super(w);
    }

    @Override
    public void setupConfig()
    {
        setNumBarrels(1);
        setRecoil(5F);
    }
}
