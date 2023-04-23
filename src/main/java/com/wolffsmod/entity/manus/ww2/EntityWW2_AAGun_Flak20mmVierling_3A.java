package com.wolffsmod.entity.manus.ww2;

import com.wolffsmod.entity.EntityFlanAAGunNPC;

import net.minecraft.world.World;

public class EntityWW2_AAGun_Flak20mmVierling_3A extends EntityFlanAAGunNPC
{
    public EntityWW2_AAGun_Flak20mmVierling_3A(World w)
    {
        super(w);
    }

    @Override
    public void setupConfig()
    {
        setNumBarrels(4);
        setRecoil(5F);
    }
}
