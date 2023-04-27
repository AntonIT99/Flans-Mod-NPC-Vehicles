package com.wolffsmod.entity.w44;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class Entity44_StudebakerBM13N extends EntityFlanVehicleNPC
{
    public Entity44_StudebakerBM13N(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.5F);
        setDriver("16 15 -8 -25 25 8 30");
        setRotatedDriverOffset("0 0 0");
        setDriverAimSpeed("0.35 0.25 0");
        setPassenger("1 16 15 8 core");
        addShootPointPrimary("-60 46 23 turret");
        addShootPointPrimary("-60 46 16 turret");
        addShootPointPrimary("-60 46 10 turret");
        addShootPointPrimary("-60 46 3 turret");
        addShootPointPrimary("-60 46 -3 turret");
        addShootPointPrimary("-60 46 -10 turret");
        addShootPointPrimary("-60 46 -16 turret");
        addShootPointPrimary("-60 46 -23 turret");
        addShootParticlesPrimary("largeexplode 0 0 0");
        addShootParticlesPrimary("explode -1.5 0 0");
        addShootParticlesPrimary("largesmoke -0.5 0 0.1");
        addShootParticlesPrimary("largesmoke -0.5 0 -0.1");
        addShootParticlesPrimary("largesmoke -0.5 0.06 0.06");
        addShootParticlesPrimary("largesmoke -0.5 0.06 -0.06");
        addShootParticlesPrimary("largesmoke -0.5 -0.06 0.06");
        addShootParticlesPrimary("largesmoke -0.5 -0.06 -0.06");
        addShootParticlesPrimary("largesmoke -0.5 -0.1 0");
        addShootParticlesPrimary("largesmoke -0.5 0.1 0");
        addShootParticlesPrimary("cloud -0.05 0 0.2");
        addShootParticlesPrimary("cloud -0.05 0 -0.2");
        addShootParticlesPrimary("cloud -0.05 0.13 0.13");
        addShootParticlesPrimary("cloud -0.05 0.13 -0.13");
        addShootParticlesPrimary("cloud -0.05 -0.13 0.13");
        addShootParticlesPrimary("cloud -0.05 -0.13 -0.13");
        addShootParticlesPrimary("cloud -0.05 -0.2 0");
        addShootParticlesPrimary("cloud -0.05 0.2 0");
        addShootParticlesPrimary("flansmod.fmflame -1 0 0");
        addShootParticlesPrimary("flansmod.fmflame -1.5 0 0");
        addShootParticlesPrimary("flansmod.fmflame -0.5 0 0");
        addShootParticlesPrimary("flansmod.fmflame -0.25 0 0");
        addShootParticlesPrimary("flansmod.fmflame -1.5 0 0");
        addShootParticlesPrimary("flansmod.fmflame -0.5 0 0.1");
        addShootParticlesPrimary("flansmod.fmflame -0.5 0 -0.1");
        addShootParticlesPrimary("flansmod.fmflame -0.5 0.06 0.06");
        addShootParticlesPrimary("flansmod.fmflame -0.5 0.06 -0.06");
        addShootParticlesPrimary("flansmod.fmflame -0.5 -0.06 0.06");
        addShootParticlesPrimary("flansmod.fmflame -0.5 -0.06 -0.06");
        addShootParticlesPrimary("flansmod.fmflame -0.5 -0.1 0");
        addShootParticlesPrimary("flansmod.fmflame -0.5 0.1 0");
        addShootParticlesPrimary("flansmod.fmflame -0.05 0 0.2");
        addShootParticlesPrimary("flansmod.fmflame -0.05 0 -0.2");
        addShootParticlesPrimary("flansmod.fmflame -0.05 0.13 0.13");
        addShootParticlesPrimary("flansmod.fmflame -0.05 0.13 -0.13");
        addShootParticlesPrimary("flansmod.fmflame -0.05 -0.13 0.13");
        addShootParticlesPrimary("flansmod.fmflame -0.05 -0.13 -0.13");
        addShootParticlesPrimary("flansmod.fmflame -0.05 -0.2 0");
        addShootParticlesPrimary("flansmod.fmflame -0.05 0.2 0");
        addShootParticlesPrimary("flansmod.fmflame -0.1 0 0.4");
        addShootParticlesPrimary("flansmod.fmflame -0.1 0 -0.4");
        addShootParticlesPrimary("flansmod.fmflame -0.1 0.26 0.26");
        addShootParticlesPrimary("flansmod.fmflame -0.1 0.26 -0.26");
        addShootParticlesPrimary("flansmod.fmflame -0.1 -0.26 0.26");
        addShootParticlesPrimary("flansmod.fmflame -0.1 -0.26 -0.26");
        addShootParticlesPrimary("flansmod.fmflame -0.1 -0.4 0");
        addShootParticlesPrimary("flansmod.fmflame -0.1 0.4 0");
        addShootParticlesSecondary("crit 0.5 0 0");
        setTurretOrigin("-45 0 0");
        
    }
}
