package com.wolffsmod.entity.manus.mw;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class EntityE3D extends EntityFlanPlaneNPC
{
    public EntityE3D(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setDriver("292 71 -12 -80 80 -45 45");
        setPassenger("1 292 71 -12 core -80 80 -45 45");
        setPassenger("2 76 68 -3 core 135 225 -45 45");
        setPassenger("3 30 68 -3 core -80 80 -45 45");
        setPassenger("4 112 68 19 core 45 135 -45 45");
        addBombPosition("7 -10 0");
        
    }
}
