package com.wolffsmod.entity.prototype.psf;

import com.wolffsmod.entity.EntityFlanMechaNPC;

import net.minecraft.world.World;

public class EntityRex extends EntityFlanMechaNPC
{
    public EntityRex(World w)
    {
        super(w);
        setSize(2.125F, 20F);
    }

    @Override
    public void setupConfig()
    {
        setDriver("0 357 0 -20 20 -10 45");
        setYOffset(0F);
        setLeftArmOrigin("-30.3 218.4 75.6");
        setRightArmOrigin("-30.3 218.4 75.6");
        setArmLength(5F);
        setLegLength(245F);
        setLegSwingLimit(5F);
    }
}
