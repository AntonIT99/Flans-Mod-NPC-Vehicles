package com.wolffsmod.entity.manus.mw;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class EntityF22 extends EntityFlanPlaneNPC
{
    public EntityF22(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(2.0F);
        setDriver("73 12 0");
        addBombPosition("7 -10 0");
        addGun("129 7 0 nose GAU4");
        
    }
}
