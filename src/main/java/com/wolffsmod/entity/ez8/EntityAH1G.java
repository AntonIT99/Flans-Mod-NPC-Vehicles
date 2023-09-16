package com.wolffsmod.entity.ez8;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class EntityAH1G extends EntityFlanPlaneNPC
{
    public EntityAH1G(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(2.2F);
        setDriver("22 11 0");
        setPassenger("1 45 7 0 nose -125 125 -75 10 pg_7.62mm_m134minigun Nose");
        addShootPointPrimary("12 6 -16 rightWing");
        addShootPointPrimary("12 6 16 leftWing");
        addShootPointSecondary("12 9 -25 rightWing");
        addShootPointSecondary("12 9 25 leftWing");
        addGunOrigin("1 50 -10 0");
        addShootParticlesPrimary("explode 0 0 0");
        addShootParticlesPrimary("cloud -2 0 0");
        addShootParticlesPrimary("explode -2 0 0");
        addShootParticlesPrimary("flame -2 0 0");
        addShootParticlesSecondary("explode 0 0 0");
        addShootParticlesSecondary("cloud -2 0 0");
        addShootParticlesSecondary("explode -2 0 0");
        addShootParticlesSecondary("flame -2 0 0");
        
    }
}
