package com.wolffsmod.entity.prototype.fc;

import com.wolffsmod.entity.EntityFlanMechaNPC;

import net.minecraft.world.World;

public class EntityFafnir extends EntityFlanMechaNPC
{
    public EntityFafnir(World w)
    {
        super(w);
        setSize(2.125F, 20F);
    }

    @Override
    public void setupConfig()
    {
        setDriver("0 278 0");
        setYOffset(0F);
        setLeftArmOrigin("0 251 -78");
        setRightArmOrigin("0 251 78");
        setArmLength(5F);
        setLegLength(144F);
        setLegSwingLimit(7F);
    }
}
