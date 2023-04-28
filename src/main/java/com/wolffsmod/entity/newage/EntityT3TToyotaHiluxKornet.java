package com.wolffsmod.entity.newage;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityT3TToyotaHiluxKornet extends EntityFlanVehicleNPC
{
    public EntityT3TToyotaHiluxKornet(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.5F);
        setDriver("47 0 -8");
        setDriverAimSpeed("5 5 0");
        setPassenger("1 47 0 8 core");
        setPassenger("2 0 18 0 core -360 360 -15 20 kornetpart PassengerGun1");
        setPassenger("3 28 0 8 core");
        setPassenger("4 28 0 -8 core");
        addShootPointPrimary("25 20 0 core");
        addShootPointSecondary("25 20 -7 core");
        addGunOrigin("2 21 31 0");
        addShootParticlesSecondary("flame 0.025 0 0");
        addShootParticlesSecondary("flansmod.fmsmoke 0 0.01 0");
        
    }
}
