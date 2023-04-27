package com.wolffsmod.entity.w44;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class Entity44_T3476 extends EntityFlanVehicleNPC
{
    public Entity44_T3476(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.48F);
        setDriver("0 34 0 -360 360 -5 28");
        setRotatedDriverOffset("3 0 -6");
        setDriverAimSpeed("1.17 1.07 0");
        setPassenger("1 32 3 -7 core -10 10 -10 10 44_DT28 PassengerGun1");
        addBarrelPosition("75 34 0");
        addGun("27 32 6 turret 44_DT28");
        addGunOrigin("1 35 -5 11");
        addShootParticlesPrimary("largeexplode 0 0 0");
        addShootParticlesPrimary("explode 1.5 0 0");
        addShootParticlesPrimary("largesmoke 0.5 0 0.1");
        addShootParticlesPrimary("largesmoke 0.5 0 -0.1");
        addShootParticlesPrimary("largesmoke 0.5 0.06 0.06");
        addShootParticlesPrimary("largesmoke 0.5 0.06 -0.06");
        addShootParticlesPrimary("largesmoke 0.5 -0.06 0.06");
        addShootParticlesPrimary("largesmoke 0.5 -0.06 -0.06");
        addShootParticlesPrimary("largesmoke 0.5 -0.1 0");
        addShootParticlesPrimary("largesmoke 0.5 0.1 0");
        addShootParticlesPrimary("cloud 0.05 0 0.2");
        addShootParticlesPrimary("cloud 0.05 0 -0.2");
        addShootParticlesPrimary("cloud 0.05 0.13 0.13");
        addShootParticlesPrimary("cloud 0.05 0.13 -0.13");
        addShootParticlesPrimary("cloud 0.05 -0.13 0.13");
        addShootParticlesPrimary("cloud 0.05 -0.13 -0.13");
        addShootParticlesPrimary("cloud 0.05 -0.2 0");
        addShootParticlesPrimary("cloud 0.05 0.2 0");
        addShootParticlesPrimary("flansmod.fmflame 1 0 0");
        addShootParticlesPrimary("flansmod.fmflame 1.75 0 0");
        addShootParticlesPrimary("flansmod.fmflame 1.5 0 0");
        addShootParticlesPrimary("flansmod.fmflame 1.25 0 0");
        addShootParticlesPrimary("flansmod.fmflame 0.75 0 0");
        addShootParticlesPrimary("flansmod.fmflame 0.5 0 0");
        addShootParticlesPrimary("flansmod.fmflame 0.25 0 0");
        addShootParticlesPrimary("flansmod.fmflame 1.5 0 0");
        addShootParticlesPrimary("flansmod.fmflame 0.5 0 0.1");
        addShootParticlesPrimary("flansmod.fmflame 0.5 0 -0.1");
        addShootParticlesPrimary("flansmod.fmflame 0.5 0.06 0.06");
        addShootParticlesPrimary("flansmod.fmflame 0.5 0.06 -0.06");
        addShootParticlesPrimary("flansmod.fmflame 0.5 -0.06 0.06");
        addShootParticlesPrimary("flansmod.fmflame 0.5 -0.06 -0.06");
        addShootParticlesPrimary("flansmod.fmflame 0.5 -0.1 0");
        addShootParticlesPrimary("flansmod.fmflame 0.5 0.1 0");
        addShootParticlesPrimary("flansmod.fmflame 0.05 0 0.2");
        addShootParticlesPrimary("flansmod.fmflame 0.05 0 -0.2");
        addShootParticlesPrimary("flansmod.fmflame 0.05 0.13 0.13");
        addShootParticlesPrimary("flansmod.fmflame 0.05 0.13 -0.13");
        addShootParticlesPrimary("flansmod.fmflame 0.05 -0.13 0.13");
        addShootParticlesPrimary("flansmod.fmflame 0.05 -0.13 -0.13");
        addShootParticlesPrimary("flansmod.fmflame 0.05 -0.2 0");
        addShootParticlesPrimary("flansmod.fmflame 0.05 0.2 0");
        addShootParticlesPrimary("flansmod.fmflame 0.1 0 0.4");
        addShootParticlesPrimary("flansmod.fmflame 0.1 0 -0.4");
        addShootParticlesPrimary("flansmod.fmflame 0.1 0.26 0.26");
        addShootParticlesPrimary("flansmod.fmflame 0.1 0.26 -0.26");
        addShootParticlesPrimary("flansmod.fmflame 0.1 -0.26 0.26");
        addShootParticlesPrimary("flansmod.fmflame 0.1 -0.26 -0.26");
        addShootParticlesPrimary("flansmod.fmflame 0.1 -0.4 0");
        addShootParticlesPrimary("flansmod.fmflame 0.1 0.4 0");
        addShootParticlesSecondary("crit 0.5 0 0");
        addLeftLinkPoint("[30,8.5,24.5]");
        addLeftLinkPoint("[38,9.5,24.5]");
        addLeftLinkPoint("[43,9.5,24.5]");
        addLeftLinkPoint("[46.5,7,24.5]");
        addLeftLinkPoint("[46.5,1,24.5]");
        addLeftLinkPoint("[43,-2,24.5]");
        addLeftLinkPoint("[30,-9.5,24.5]");
        addLeftLinkPoint("[-55,-9.5,24.5]");
        addLeftLinkPoint("[-69,-2,24.5]");
        addLeftLinkPoint("[-72.5,0,24.5]");
        addLeftLinkPoint("[-72.5,7,24.5]");
        addLeftLinkPoint("[-69,9,24.5]");
        addRightLinkPoint("[30,8.5,-24.5]");
        addRightLinkPoint("[38,9.5,-24.5]");
        addRightLinkPoint("[43,9.5,-24.5]");
        addRightLinkPoint("[46.5,7,-24.5]");
        addRightLinkPoint("[46.5,1,-24.5]");
        addRightLinkPoint("[43,-2,-24.5]");
        addRightLinkPoint("[30,-9.5,-24.5]");
        addRightLinkPoint("[-55,-9.5,-24.5]");
        addRightLinkPoint("[-69,-2,-24.5]");
        addRightLinkPoint("[-72.5,0,-24.5]");
        addRightLinkPoint("[-72.5,7,-24.5]");
        addRightLinkPoint("[-69,9,-24]");
        setTrackLinkLength(2.0F);
        setFixTrackLink(7);
        
    }
}
