package com.wolffsmod.entity.ez8;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class EntityMi24P extends EntityFlanPlaneNPC
{
    public EntityMi24P(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(2.0F);
        setDriver("54 16 0");
        setPassenger("1 82 6 0 nose -125 125 -90 90 dummygun DummyGun");
        setPassenger("2 -3 15 4 back1 -360 360 -90 90");
        setPassenger("3 -3 15 -4 back2 -360 360 -90 90");
        setPassenger("4 18 12 0 back3 -360 360 -90 90");
        addShootPointPrimary("96 11 15 core");
        addShootPointPrimary("96 8 15 core");
        addShootPointSecondary("10 14 -26 core");
        addShootPointSecondary("10 14 26 core");
        addShootParticlesPrimary("explode 1 0 0");
        addShootParticlesSecondary("explode 0 0 0");
        addShootParticlesSecondary("cloud -3 0 0");
        addShootParticlesSecondary("explode -3 0 0");
        addShootParticlesSecondary("flame -3 0 0");
        
    }
}
