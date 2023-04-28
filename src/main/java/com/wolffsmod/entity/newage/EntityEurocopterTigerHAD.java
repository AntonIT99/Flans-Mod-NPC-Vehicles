package com.wolffsmod.entity.newage;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class EntityEurocopterTigerHAD extends EntityFlanPlaneNPC
{
    public EntityEurocopterTigerHAD(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(4.0F);
        setDriver("48 15 0");
        setPassenger("1 27 22 0 core -360 360 -360 360 dummygun Passenger");
        setPassenger("2 100 -7 0 core -90 90 -55 13 giat30 PassengerGun1");
        setPassengerAimSpeed("2 8 8 0");
        addShootPointPrimary("20 17 38 rightWing matraPodGun");
        addShootPointPrimary("20 17 -38 leftWing matraPodGun");
        addShootPointSecondary("22 12 24 leftWing");
        addShootPointSecondary("22 12 -24 rightWing");
        addGunOrigin("2 91 7 0");
        addShootParticlesPrimary("flame 0 0 0");
        addShootParticlesPrimary("cloud 0 0 0");
        addShootParticlesPrimary("flansmod.fmflame -0.5 0 0.1");
        addShootParticlesPrimary("flansmod.fmflame -0.5 0 0.1");
        addShootParticlesPrimary("flansmod.fmflame -0.5 0 0.1");
        addShootParticlesPrimary("flansmod.fmflame -0.5 0 0.1");
        addShootParticlesPrimary("flansmod.fmsmoke -0.8 0 0.25");
        addShootParticlesPrimary("flansmod.fmsmoke -0.8 0 -0.25");
        addShootParticlesPrimary("flansmod.fmsmoke -0.8 -0.25 0");
        addShootParticlesPrimary("flansmod.fmsmoke -0.8 0.25 0");
        addShootParticlesSecondary("cloud 1 0 0");
        addShootParticlesSecondary("cloud -1 0 0");
        addShootParticlesSecondary("explode -1 0 0");
        addShootParticlesSecondary("flame -1 0 0");
        
    }
}
