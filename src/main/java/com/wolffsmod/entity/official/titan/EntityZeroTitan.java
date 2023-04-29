package com.wolffsmod.entity.official.titan;

import com.wolffsmod.entity.EntityFlanMechaNPC;

import net.minecraft.world.World;

public class EntityZeroTitan extends EntityFlanMechaNPC
{
    public EntityZeroTitan(World w)
    {
        super(w);
        setSize(4F, 9.5F);
    }

    @Override
    public void setupConfig()
    {
        setDriver("0 119 0 0 0 -90 90");
        setRotatedDriverOffset("35 0 0");
        setYOffset(0F);
        setLeftArmOrigin("-11 104 -49");
        setRightArmOrigin("-11 104 49");
        setArmLength(48F);
        setLegLength(91F);
        setUpperArmLimit(30F);
        setLowerArmLimit(60F);
    }
}