package com.wolffsmod.entity.lizard;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityT55A extends EntityFlanVehicleNPC
{
    public EntityT55A(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.5F);
        setDriver("0 25 0 -360 360 -3 18");
        setRotatedDriverOffset("-9 0 -9");
        setDriverAimSpeed("1.2 2 0");
        setPassenger("1 0 25 0 turret -360 360 -15 80 twelveMM PassengerGun1");
        addShootPointPrimary("30 22 0 turret -25 0 0");
        addShootPointSecondary("29 20 7 turret sevenMM");
        addGunOrigin("1 0 36 8");
        addShootParticlesSecondary("cloud 0.2 0 0");
        
    }
}
