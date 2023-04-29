package com.wolffsmod.entity.official.titan;

import com.wolffsmod.entity.EntityFlanMechaNPC;

import net.minecraft.world.World;

public class EntityAlphaTitan extends EntityFlanMechaNPC
{
    public EntityAlphaTitan(World w)
    {
        super(w);
        setSize(3F, 6F);
    }

    @Override
    public void setupConfig()
    {
        setDriver("0 48 0");
        setYOffset(0F);
        setLeftArmOrigin("0 80 -32");
        setRightArmOrigin("0 80 32");
        setArmLength(44F);
        setLegLength(16F);
    }
}
