package com.wolffsmod.entity.manus.sifi;

import com.wolffsmod.entity.EntityFlanMechaNPC;

import net.minecraft.world.World;

public class EntityMadcat extends EntityFlanMechaNPC
{
    public EntityMadcat(World w)
    {
        super(w);
        setSize(3.5F, 6F);
    }

    @Override
    public void setupConfig()
    {
        setDriver("0 205 0");
        setYOffset(0F);
        setLeftArmOrigin("-26.4 157.2 -99.6");
        setRightArmOrigin("-26.4 157.2 99.6");
        setArmLength(30F);
        setLegLength(148F);
        setUpperArmLimit(20F);
        setLowerArmLimit(60F);
        setLegSwingLimit(5F);
    }
}
