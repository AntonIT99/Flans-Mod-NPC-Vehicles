package com.wolffsmod.entity.w44;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class Entity44_D3A extends EntityFlanPlaneNPC
{
    public Entity44_D3A(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(1.25F);
        setDriver("-25 24 0");
        setPassenger("1 -42 23 0 core 140 220 -5 45 44_Type92 PassengerGun1");
        addShootPointPrimary("33 36 4 core 44_Type99");
        addShootPointPrimary("33 36 -4 core 44_Type99");
        addShootPointSecondary("5 -8 0 core");
        addGunOrigin("1 -49 18 0");
        addShootParticlesPrimary("crit 0.4 0 0");
        addShootParticlesPrimary("crit 0.4 -0.1 0");
        addShootParticlesPrimary("crit 0.4 0.1 0");
        addShootParticlesPrimary("crit 0.4 0 -0.1");
        addShootParticlesPrimary("crit 0.4 0 0.1");
        addShootParticlesPrimary("flansmod.fmflame 0 0 0");
        
    }
}
