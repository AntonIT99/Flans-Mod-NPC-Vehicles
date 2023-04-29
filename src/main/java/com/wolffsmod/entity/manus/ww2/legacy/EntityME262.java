package com.wolffsmod.entity.manus.ww2.legacy;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class EntityME262 extends EntityFlanPlaneNPC
{
    public EntityME262(World w)
    {
        super(w);
        this.setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        //TODO: find shooting position
        setTurnSpeed(2.5F);
        setDriver("0 18 -22");
        addBombPosition("0 16 0");

    }
}
