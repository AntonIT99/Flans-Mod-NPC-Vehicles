package com.wolffsmod.entity.w44;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityFlak20mm extends EntityFlanVehicleNPC
{
    public EntityFlak20mm(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.0F);
        setDriver("0 0 0 -360 360 -10 80");
        setRotatedDriverOffset("-30 2 12");
        setDriverAimSpeed("2.24f 2.24f 0f");
        setPassenger("1 0 5 0 turret -360 360 -10 80");
        setPassengerAimSpeed("1 8.5 2.5 0");
        addBarrelPosition("49 14 0");
        addShootParticlesPrimary("flansmod.fmflame 0.1 0 0");
        addShootParticlesPrimary("flansmod.fmflame 0.05 0.01 0.01");
        addShootParticlesPrimary("flansmod.fmflame 0.05 -0.01 -0.01");
        addShootParticlesPrimary("flansmod.fmflame 0.05 0.01 -0.01");
        addShootParticlesPrimary("flansmod.fmflame 0.05 -0.01 0.01");
        addShootParticlesPrimary("cloud 0 0 0.075");
        addShootParticlesPrimary("cloud 0 0 -0.075");
        addShootParticlesSecondary("flame -0.75 0 0");
        addShootParticlesSecondary("cloud -0.8 0 0.1");
        addShootParticlesSecondary("cloud -0.8 0 -0.1");
        addShootParticlesSecondary("cloud -0.8 -0.1 0");
        addShootParticlesSecondary("cloud -0.8 0.1 0");
        
    }
}
