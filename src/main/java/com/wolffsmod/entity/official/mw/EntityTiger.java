package com.wolffsmod.entity.official.mw;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class EntityTiger extends EntityFlanPlaneNPC
{
    public EntityTiger(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(2.0F);
        setPassenger("1 28 26 0 core -10 10 -10 10 stinger Stinger");
        addShootPointPrimary("27 21 -31 leftWing m60");
        addShootPointSecondary("27 21 31 rightWing");
        addGunOrigin("1 20 20 42");
        
    }
}
