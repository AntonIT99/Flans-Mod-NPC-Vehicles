package com.wolffsmod.entity.w44;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class Entity44_M20ArmoredCar extends EntityFlanVehicleNPC
{
    public Entity44_M20ArmoredCar(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.65F);
        setDriver("0 27 0 -360 360 -25 45");
        setRotatedDriverOffset("-2 0 0");
        setDriverAimSpeed("3 2.75 0");
        setPassenger("1 15 9 9 core -360 360 -89 89");
        setPassenger("2 15 9 -9 core -360 360 -89 89");
        addBarrelPosition("35 39 0");
        addShootParticlesPrimary("flansmod.fmflame 0.5 0 0");
        addShootParticlesPrimary("flansmod.fmflame 0.25 0 0");
        addShootParticlesSecondary("crit 0.5 0 0");
        setFixTrackLink(4);
        
    }
}
