package com.wolffsmod.entity.manus.sifi;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class EntityDropshipMk1 extends EntityFlanPlaneNPC
{
    public EntityDropshipMk1(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setDriver("0 4 30");
        addBombPosition("0 -16 -52");
        
    }
}
