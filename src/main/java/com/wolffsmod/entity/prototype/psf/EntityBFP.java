package com.wolffsmod.entity.prototype.psf;

import com.wolffsmod.entity.EntityFlanMechaNPC;

import net.minecraft.world.World;

public class EntityBFP extends EntityFlanMechaNPC
{
    public EntityBFP(World w)
    {
        super(w);
        setSize(2.125F, 6.25F);
    }

    @Override
    public void setupConfig()
    {
        setDriver("0 70 0");
        setYOffset(0F);
        setLeftArmOrigin("2 103 -26");
        setRightArmOrigin("2 103 26");
        setArmLength(50F);
        setLegLength(58F);
    }
}
