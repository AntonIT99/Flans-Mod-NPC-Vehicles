package com.wolffsmod.entity.w44;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class Entity44_Ju87D3 extends EntityFlanPlaneNPC
{
    public Entity44_Ju87D3(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setDriver("-23 33 0");
        setPassenger("1 -41 31 0 core 140 220 -5 45 44_Mg15 PassengerGun1");
        addShootPointPrimary("5 26 43 core 44_Mg17");
        addShootPointPrimary("5 26 -43 core 44_Mg17");
        addShootPointSecondary("25 -5 0 core");
        addGunOrigin("1 -51 26 0");
        addShootParticlesPrimary("flansmod.fmflame 0 0 0");
        addShootParticlesPrimary("flansmod.fmflame 0 0 0");
        addShootParticlesPrimary("flansmod.fmflame 0 0 0");
        addShootParticlesPrimary("flansmod.fmflame 0 0 0");
        addShootParticlesPrimary("flansmod.fmflame 0 0 0");
        
    }
}
