package com.wolffsmod.entity.prototype.psf;

import com.wolffsmod.entity.EntityFlanMechaNPC;

import net.minecraft.world.World;

public class EntityMonster extends EntityFlanMechaNPC
{
    public EntityMonster(World w)
    {
        super(w);
        setSize(2.125F, 20F);
    }

    @Override
    public void setupConfig()
    {
        setDriver("0 200 0");
        setYOffset(0F);
        setLeftArmOrigin("43 271 -202");
        setRightArmOrigin("43 271 202");
        setArmLength(5F);
        setLegLength(245F);
        setLegSwingLimit(5F);
    }
}
