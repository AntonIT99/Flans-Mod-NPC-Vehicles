package com.wolffsmod.entity.prototype.fc;

import com.wolffsmod.entity.EntityFlanMechaNPC;

import net.minecraft.world.World;

public class EntityPeregrine extends EntityFlanMechaNPC
{
    public EntityPeregrine(World w)
    {
        super(w);
        setSize(3.5F, 6F);
    }

    @Override
    public void setupConfig()
    {
        setDriver("0 240 0");
        setYOffset(0F);
        setLeftArmOrigin("-53.5 210 -108.5");
        setRightArmOrigin("-53.5 210 108.5");
        setArmLength(14F);
        setLegLength(155F);
        setLegSwingLimit(5F);
    }
}
