package com.wolffsmod.entity.manus.mw;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class EntityTU22M extends EntityFlanPlaneNPC
{
    public EntityTU22M(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setDriver("230 42 -8");
        setPassenger("1 230 42 8 core");
        addBombPosition("7 -10 0");
        
    }
}
