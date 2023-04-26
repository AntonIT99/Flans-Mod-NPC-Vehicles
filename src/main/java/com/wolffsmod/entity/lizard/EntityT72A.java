package com.wolffsmod.entity.lizard;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityT72A extends EntityFlanVehicleNPC
{
    public EntityT72A(World w)
    {
        super(w);
        setSize(3.5F, 3.0F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.35F);
        setDriver("0 27 0 -360 360 -3 20");
        setRotatedDriverOffset("-8 0 -11");
        setDriverAimSpeed("2.5 2 0");
        setPassenger("1 0 34 0 turret -181 181 -15 55 Kord PassengerGun1");
        setPassengerAimSpeed("1 8 8 0");
        addShootPointSecondary("19 20 4 turret sevenMM");
        addBarrelPosition("13 20 0 -23 0.5 0");
        addGunOrigin("1 3 26 12");
        addShootParticlesSecondary("crit 0.025 0 0");
        addShootParticlesSecondary("flansmod.fmsmoke 0 0.01 0");
        addShootParticlesSecondary("cloud 0.2 0 0");
        setTurretOrigin("-4 0 0");
        
    }
}
