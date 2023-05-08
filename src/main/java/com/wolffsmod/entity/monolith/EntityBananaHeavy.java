package com.wolffsmod.entity.monolith;

import com.wolffsmod.entity.EntityFlanMechaNPC;

import net.minecraft.world.World;

public class EntityBananaHeavy extends EntityFlanMechaNPC
{
    public EntityBananaHeavy(World w)
    {
        super(w);
        setSize(3F, 8F);
    }

    @Override
    public void setupConfig()
    {
        setDriver("0 60 0");
        setYOffset(0F);
        setLeftArmOrigin("1 80 29");
        setRightArmOrigin("1 80 -29");
        setArmLength(43F);
        setLegLength(54F);
    }
}
