package com.wolffsmod.entity.official.mw;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class EntitySU25 extends EntityFlanPlaneNPC
{
    public EntitySU25(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(4.0F);
        addShootPointPrimary("129 16 -5 nose m60");
        addShootPointPrimary("129 16 -3 nose m60");
        addShootPointSecondary("44 28 45 leftWing");
        addShootPointSecondary("44 28 -45 rightWing");
        addShootPointSecondary("38 28 64 leftWing");
        addShootPointSecondary("38 28 -64 rightWing");
        
    }
}
