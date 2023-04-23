package com.wolffsmod.entity.manus.mw;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class EntityC130H extends EntityFlanPlaneNPC
{
    public EntityC130H(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setDriver("146 24 -9");
        setPassenger("1 146 24 9 core");
        addBombPosition("7 -10 0");
        
    }
}
