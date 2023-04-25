package com.wolffsmod.entity.ez8;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class EntityUH1C extends EntityFlanPlaneNPC
{
    public EntityUH1C(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(2.0F);
        setPassenger("1 41 4 -10 nose -130 130 -30 85 dummygun DummyGun");
        setPassenger("2 12 8 -10 back1 -130 130 -30 85");
        setPassenger("3 12 8 0 back2 -130 130 -30 85");
        setPassenger("4 12 8 10 back3 -130 130 -30 85");
        addShootPointPrimary("12 2 -37 rightWing");
        addShootPointPrimary("12 2 37 leftWing");
        addShootPointSecondary("12 0 -27 rightWing");
        addShootPointSecondary("12 0 27 leftWing");
        addShootParticlesSecondary("explode 0 0 0");
        addShootParticlesSecondary("cloud -2 0 0");
        addShootParticlesSecondary("explode -2 0 0");
        addShootParticlesSecondary("flame -2 0 0");
        
    }
}
