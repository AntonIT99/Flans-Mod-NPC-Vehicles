package com.wolffsmod.entity.manus.mw;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class EntityA10 extends EntityFlanPlaneNPC
{
    public EntityA10(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(2.0F);
        setDriver("62 18 0");
        addBombPosition("7 -10 0");
        addGun("106 12 -2 nose GAU8");
        
    }
}
