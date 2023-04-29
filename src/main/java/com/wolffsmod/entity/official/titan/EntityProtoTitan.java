package com.wolffsmod.entity.official.titan;

import com.wolffsmod.entity.EntityFlanMechaNPC;

import net.minecraft.world.World;

public class EntityProtoTitan extends EntityFlanMechaNPC
{
    public EntityProtoTitan(World w)
    {
        super(w);
        setSize(1.5F, 3F);
    }

    @Override
    public void setupConfig()
    {
        setDriver("0 24 0");
        setYOffset(0F);
        setLeftArmOrigin("0 40 -16");
        setRightArmOrigin("0 40 16");
        setArmLength(22F);
        setLegLength(16F);
    }
}