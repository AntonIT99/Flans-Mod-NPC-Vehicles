package com.wolffsmod.entity.newage;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityT3TToyotaHiluxS5 extends EntityFlanVehicleNPC
{
    public EntityT3TToyotaHiluxS5(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.5F);
        setDriver("47 0 -8 -25 25 0 15");
        setDriverAimSpeed("5 5 0");
        setPassenger("1 47 0 9 core");
        setPassenger("2 28 0 8 core");
        setPassenger("3 28 0 -8 core");
        addShootPointPrimary("22 34 0 turret");
        addShootPointSecondary("25 20 -7 core");
        addShootParticlesPrimary("flansmod.fmflame -0.5 0 0");
        addShootParticlesPrimary("flansmod.fmflame 1.0 0 0");
        addShootParticlesPrimary("cloud 0.25 0.05 0");
        addShootParticlesPrimary("cloud 0.25 -0.05 0");
        addShootParticlesPrimary("cloud 0.25 0 -0.05");
        addShootParticlesPrimary("cloud 0.25 0 0.05");
        addShootParticlesPrimary("cloud 0.25 0.025 0.025");
        addShootParticlesPrimary("cloud 0.25 -0.025 0.025");
        addShootParticlesPrimary("cloud 0.25 0.025 -0.025");
        addShootParticlesPrimary("cloud 0.25 -0.025 -0.025");
        addShootParticlesPrimary("cloud -0.5 0.05 0");
        addShootParticlesPrimary("cloud -0.5 -0.05 0");
        addShootParticlesPrimary("cloud -0.5 0 -0.05");
        addShootParticlesPrimary("cloud -0.5 0 0.05");
        addShootParticlesPrimary("cloud -0.5 0.025 0.025");
        addShootParticlesPrimary("cloud -0.5 -0.025 0.025");
        addShootParticlesPrimary("cloud -0.5 0.025 -0.025");
        addShootParticlesPrimary("cloud -0.5 -0.025 -0.025");
        addShootParticlesPrimary("cloud -1.5 0.05 0");
        addShootParticlesPrimary("cloud -1.5 -0.05 0");
        addShootParticlesPrimary("cloud -1.5 0 -0.05");
        addShootParticlesPrimary("cloud -1.5 0 0.05");
        addShootParticlesPrimary("cloud -1.5 0.025 0.025");
        addShootParticlesPrimary("cloud -1.5 -0.025 0.025");
        addShootParticlesPrimary("cloud -1.5 0.025 -0.025");
        addShootParticlesPrimary("cloud -1.5 -0.025 -0.025");
        
    }
}
