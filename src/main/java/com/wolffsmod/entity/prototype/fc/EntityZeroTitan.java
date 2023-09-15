package com.wolffsmod.entity.prototype.fc;

import com.wolffsmod.entity.EntityFlanMechaNPC;

import net.minecraft.world.World;

public class EntityZeroTitan extends EntityFlanMechaNPC
{
    public EntityZeroTitan(World w)
    {
        super(w);
        setSize(7.125F, 9.6F);
    }

    @Override
    public void setupConfig()
    {
        setDriver("0 119 0");
        setYOffset(0F);
        setLeftArmOrigin("-11 104 -49");
        setRightArmOrigin("-11 104 49");
        setArmLength(2.5F);
        setLegLength(91F);
        setLegSwingLimit(4F);
    }
}
