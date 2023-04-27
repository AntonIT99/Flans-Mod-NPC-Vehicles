package com.wolffsmod.entity.w44;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class Entity44_B17G extends EntityFlanPlaneNPC
{
    public Entity44_B17G(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.85F);
        setDriver("32 59 -9");
        setPassenger("1 32 59 9 core");
        setPassenger("2 7 72 0 core -360 360 -3 38 44_50Cal PassengerGun2");
        setPassenger("3 -135 11 0 core -360 360 -55 3 44_50Cal PassengerGun3");
        setPassenger("4 -189 40 5 core 65 115 -18 18 44_50Cal PassengerGun4");
        setPassenger("5 -189 40 -5 core -115 -65 -18 18 44_50Cal PassengerGun5");
        setPassenger("6 -338 51 0 core 150 210 -25 25 44_50Cal PassengerGun6");
        setPassenger("7 -87 47 -13 core");
        setPassenger("8 86 39 0 core -45 45 -25 18 44_50Cal PassengerGun8");
        addShootPointSecondary("25 -5 0 core");
        addGunOrigin("2 6 68 0");
        addGunOrigin("3 -136 1 0");
        addGunOrigin("4 -190 32 18");
        addGunOrigin("5 -190 32 -18");
        addGunOrigin("6 -360 35 0");
        addGunOrigin("8 87 8 0");
        addShootParticlesPrimary("crit 0.4 0 0");
        addShootParticlesPrimary("crit 0.4 -0.1 0");
        addShootParticlesPrimary("crit 0.4 0.1 0");
        addShootParticlesPrimary("crit 0.4 0 -0.1");
        addShootParticlesPrimary("crit 0.4 0 0.1");
        addShootParticlesPrimary("flansmod.fmflame 0 0 0");
        
    }
}
