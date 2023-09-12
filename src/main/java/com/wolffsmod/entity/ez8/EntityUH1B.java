package com.wolffsmod.entity.ez8;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class EntityUH1B extends EntityFlanPlaneNPC
{
    public EntityUH1B(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(2.2F);
        setDriver("41 4 10");
        setPassenger("1 41 4 -10 nose -130 130 -30 85 dummygun DummyGun");
        setPassenger("2 12 8 -10 back1 -130 130 -30 85");
        setPassenger("3 12 8 0 back2 -130 130 -30 85");
        setPassenger("4 12 8 10 back3 -130 130 -30 85");
        addShootPointPrimary("24 9 0 core");
        addShootPointSecondary("24 9 0 core");
        addShootParticlesPrimary("note 0 0 0");
        addShootParticlesPrimary("note 0 1 0");
        
    }
}
