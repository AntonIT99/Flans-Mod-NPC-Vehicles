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
        setDriver("21 30 0 -360 360 0 90");
        setNumBarrels(4);
        addBarrel("0 45 18 6");
        addBarrel("1 45 22 6");
        addBarrel("2 45 22 -6");
        addBarrel("3 45 18 -6");
        setRecoil(5F);
    }
}
