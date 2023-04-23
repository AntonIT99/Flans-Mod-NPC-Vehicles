package com.wolffsmod.entity.manus.ww2.legacy;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class EntityME109 extends EntityFlanPlaneNPC
{
    public EntityME109(World w)
    {
        super(w);
        this.setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        //TODO: find shooting position
        setTurnSpeed(2.0F);
        setDriver("0 14 -14");
        addBombPosition("0 6 0");
        
    }
}
