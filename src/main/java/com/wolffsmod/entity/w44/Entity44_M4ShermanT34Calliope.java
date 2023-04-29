package com.wolffsmod.entity.w44;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class Entity44_M4ShermanT34Calliope extends EntityFlanVehicleNPC
{
    public Entity44_M4ShermanT34Calliope(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.35F);
        setDriver("0 35 0 -360 360 -2 20");
        setRotatedDriverOffset("-9 0 8");
        setDriverAimSpeed("0.6 0.5 0");
        setPassenger("1 29 13 10 core -10 10 -10 10 44_30Cal PassengerGun1");
        addShootPointPrimary("-25 69 16 turret");
        addShootPointPrimary("-25 69 -16 turret");
        addShootPointPrimary("-25 72 7 turret");
        addShootPointPrimary("-25 72 -7 turret");
        addShootPointPrimary("-25 72 -24 turret");
        addShootPointPrimary("-25 72 24 turret");
        addShootPointPrimary("-25 63 7 turret");
        addShootPointPrimary("-25 63 -7 turret");
        addShootPointPrimary("-25 63 16 turret");
        addShootPointPrimary("-25 63 -16 turret");
        addGun("48 33 0 turret 44_75mmCannon");
        addGunOrigin("1 35 -5 9");
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
        addShootParticlesSecondary("largeexplode 0 0 0");
        addShootParticlesSecondary("explode 1.5 0 0");
        addShootParticlesSecondary("largesmoke 0.5 0 0.1");
        addShootParticlesSecondary("largesmoke 0.5 0 -0.1");
        addShootParticlesSecondary("largesmoke 0.5 0.06 0.06");
        addShootParticlesSecondary("largesmoke 0.5 0.06 -0.06");
        addShootParticlesSecondary("largesmoke 0.5 -0.06 0.06");
        addShootParticlesSecondary("largesmoke 0.5 -0.06 -0.06");
        addShootParticlesSecondary("largesmoke 0.5 -0.1 0");
        addShootParticlesSecondary("largesmoke 0.5 0.1 0");
        addShootParticlesSecondary("cloud 0.05 0 0.2");
        addShootParticlesSecondary("cloud 0.05 0 -0.2");
        addShootParticlesSecondary("cloud 0.05 0.13 0.13");
        addShootParticlesSecondary("cloud 0.05 0.13 -0.13");
        addShootParticlesSecondary("cloud 0.05 -0.13 0.13");
        addShootParticlesSecondary("cloud 0.05 -0.13 -0.13");
        addShootParticlesSecondary("cloud 0.05 -0.2 0");
        addShootParticlesSecondary("cloud 0.05 0.2 0");
        addShootParticlesSecondary("flansmod.fmflame 1 0 0");
        addShootParticlesSecondary("flansmod.fmflame 1.75 0 0");
        addShootParticlesSecondary("flansmod.fmflame 1.5 0 0");
        addShootParticlesSecondary("flansmod.fmflame 1.25 0 0");
        addShootParticlesSecondary("flansmod.fmflame 0.75 0 0");
        addShootParticlesSecondary("flansmod.fmflame 0.5 0 0");
        addShootParticlesSecondary("flansmod.fmflame 0.25 0 0");
        addShootParticlesSecondary("flansmod.fmflame 1.5 0 0");
        addShootParticlesSecondary("flansmod.fmflame 0.5 0 0.1");
        addShootParticlesSecondary("flansmod.fmflame 0.5 0 -0.1");
        addShootParticlesSecondary("flansmod.fmflame 0.5 0.06 0.06");
        addShootParticlesSecondary("flansmod.fmflame 0.5 0.06 -0.06");
        addShootParticlesSecondary("flansmod.fmflame 0.5 -0.06 0.06");
        addShootParticlesSecondary("flansmod.fmflame 0.5 -0.06 -0.06");
        addShootParticlesSecondary("flansmod.fmflame 0.5 -0.1 0");
        addShootParticlesSecondary("flansmod.fmflame 0.5 0.1 0");
        addShootParticlesSecondary("flansmod.fmflame 0.05 0 0.2");
        addShootParticlesSecondary("flansmod.fmflame 0.05 0 -0.2");
        addShootParticlesSecondary("flansmod.fmflame 0.05 0.13 0.13");
        addShootParticlesSecondary("flansmod.fmflame 0.05 0.13 -0.13");
        addShootParticlesSecondary("flansmod.fmflame 0.05 -0.13 0.13");
        addShootParticlesSecondary("flansmod.fmflame 0.05 -0.13 -0.13");
        addShootParticlesSecondary("flansmod.fmflame 0.05 -0.2 0");
        addShootParticlesSecondary("flansmod.fmflame 0.05 0.2 0");
        addShootParticlesSecondary("flansmod.fmflame 0.1 0 0.4");
        addShootParticlesSecondary("flansmod.fmflame 0.1 0 -0.4");
        addShootParticlesSecondary("flansmod.fmflame 0.1 0.26 0.26");
        addShootParticlesSecondary("flansmod.fmflame 0.1 0.26 -0.26");
        addShootParticlesSecondary("flansmod.fmflame 0.1 -0.26 0.26");
        addShootParticlesSecondary("flansmod.fmflame 0.1 -0.26 -0.26");
        addShootParticlesSecondary("flansmod.fmflame 0.1 -0.4 0");
        addShootParticlesSecondary("flansmod.fmflame 0.1 0.4 0");
        addLeftLinkPoint("[44.5,9,17.5]");
        addLeftLinkPoint("[46.5,7,17.5]");
        addLeftLinkPoint("[46.5,2,17.5]");
        addLeftLinkPoint("[36,-7.5,17.5]");
        addLeftLinkPoint("[-36,-7.5,17.5]");
        addLeftLinkPoint("[-46.5,1,17.5]");
        addLeftLinkPoint("[-46.5,6,17.5]");
        addLeftLinkPoint("[-43,9,17.5]");
        addLeftLinkPoint("[-38,9,17.5]");
        addLeftLinkPoint("[34,9,17.5]");
        addLeftLinkPoint("[41,9,17.5]");
        addRightLinkPoint("[44.5,9,-17.5]");
        addRightLinkPoint("[46.5,7,-17.5]");
        addRightLinkPoint("[46.5,2,-17.5]");
        addRightLinkPoint("[37,-7.5,-17.5]");
        addRightLinkPoint("[-36,-7.5,-17.5]");
        addRightLinkPoint("[-46.5,1,-17.5]");
        addRightLinkPoint("[-46.5,6,-17.5]");
        addRightLinkPoint("[-43,9,-17.5]");
        addRightLinkPoint("[-38,9,-17.5]");
        addRightLinkPoint("[34,9,-17.5]");
        addRightLinkPoint("[41,9,-17.5]");
        setTrackLinkLength(3.0F);
        setFixTrackLink(4);
        
    }
}
