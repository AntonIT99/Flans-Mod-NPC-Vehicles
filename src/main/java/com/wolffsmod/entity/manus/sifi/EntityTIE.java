package com.wolffsmod.entity.manus.sifi;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class EntityTIE extends EntityFlanPlaneNPC
{
    public EntityTIE(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(2.0F);
        setDriver("2 44 4");
        addBombPosition("0 16 0");
        
    }
}
