package com.wolffsmod.entity.newage;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityT3TToyotaHiluxBMP1 extends EntityFlanVehicleNPC
{
    public EntityT3TToyotaHiluxBMP1(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.5F);
        setDriver("5 14 0 -360 360 -4 20");
        setRotatedDriverOffset("13 0 -7");
        setDriverAimSpeed("2 2 0");
        setPassenger("1 47 0 8 core");
        setPassenger("2 28 0 8 core");
        setPassenger("3 28 0 -8 core");
        addShootPointPrimary("55 30 1 turret");
        addShootPointSecondary("25 30 3 turret pkt");
        addShootParticlesPrimary("largeexplode 6 0 0");
        addShootParticlesPrimary("explode 6 0 0");
        addShootParticlesPrimary("explode 6 0 0");
        addShootParticlesPrimary("explode 6 0 0");
        addShootParticlesPrimary("explode 6 0 0");
        addShootParticlesPrimary("explode 6 0 0");
        addShootParticlesPrimary("explode 6 0 0");
        addShootParticlesPrimary("explode 7 0 0");
        addShootParticlesPrimary("explode 7 0 0");
        addShootParticlesPrimary("explode 7 0 0");
        addShootParticlesPrimary("explode 7 0 0");
        addShootParticlesPrimary("explode 7 0 0");
        addShootParticlesPrimary("explode 7 0 0");
        addShootParticlesPrimary("cloud 6 0 0");
        addShootParticlesPrimary("cloud 6 0 0");
        addShootParticlesPrimary("cloud 6 0 0");
        addShootParticlesPrimary("cloud 6 0 0");
        addShootParticlesPrimary("cloud 6 0 0");
        addShootParticlesPrimary("cloud 6 0 0");
        addShootParticlesPrimary("cloud 7 0 0");
        addShootParticlesPrimary("cloud 7 0 0");
        addShootParticlesPrimary("cloud 7 0 0");
        addShootParticlesPrimary("cloud 7 0 0");
        addShootParticlesPrimary("cloud 7 0 0");
        addShootParticlesPrimary("cloud 7 0 0");
        addShootParticlesPrimary("flansmod.fmflame 0 0 0");
        addShootParticlesSecondary("flansmod.fmflame -0.75 0 0");
        addShootParticlesSecondary("flansmod.fmsmoke -0.8 0 0.1");
        addShootParticlesSecondary("flansmod.fmsmoke -0.8 0 -0.1");
        addShootParticlesSecondary("flansmod.fmsmoke -0.8 -0.1 0");
        addShootParticlesSecondary("flansmod.fmsmoke -0.8 0.1 0");
        addShootParticlesSecondary("flame 0.025 0 0");
        addShootParticlesSecondary("flansmod.fmsmoke 0 0.01 0");
        setTurretOrigin("5 0 0");
        
    }
}
