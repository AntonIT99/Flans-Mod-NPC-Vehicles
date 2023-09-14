package com.wolffsmod.entity.manus.sifi;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class EntityTIEInter extends EntityFlanPlaneNPC
{
    public EntityTIEInter(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(2.0F);
        setDriver("1 29 4");
        addBombPosition("0 16 0");
        
    }
}
