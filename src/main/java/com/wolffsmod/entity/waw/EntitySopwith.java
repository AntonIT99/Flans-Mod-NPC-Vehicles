package com.wolffsmod.entity.waw;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class EntitySopwith extends EntityFlanPlaneNPC
{
    public EntitySopwith(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        //TODO: add primary shoot point
        setTurnSpeed(1.5F);
        setDriver("0 12 -20");
        
    }
}
