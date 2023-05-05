package com.wolffsmod.entity.monolith;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class EntityMorgan extends EntityFlanPlaneNPC
{
    public EntityMorgan(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(5.5F);
        setDriver("118 50 0");
        addShootPointPrimary("-20 98 0 nose TLS");
        addShootPointSecondary("-75 40 -98 leftWing");
        addShootPointSecondary("-75 40 98 rightWing");
        
    }
}
