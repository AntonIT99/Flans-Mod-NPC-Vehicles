package com.wolffsmod.entity.prototype.fc;

import com.wolffsmod.entity.EntityFlanMechaNPC;

import net.minecraft.world.World;

public class EntityOmega extends EntityFlanMechaNPC
{
    public EntityOmega(World w)
    {
        super(w);
        setSize(2.125F, 6.25F);
    }

    @Override
    public void setupConfig()
    {
        setDriver("-2 66 0");
        setYOffset(0F);
        setLeftArmOrigin("-1 84 -25");
        setRightArmOrigin("-1 84 27");
        setArmLength(60F);
        setLegLength(58F);
    }
}
