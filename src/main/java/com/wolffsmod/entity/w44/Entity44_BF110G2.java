package com.wolffsmod.entity.w44;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class Entity44_BF110G2 extends EntityFlanPlaneNPC
{
    public Entity44_BF110G2(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setDriver("41 37 0");
        setPassenger("1 9 40 0 core");
        setPassenger("2 -4 39 0 core 140 220 -3 45 44_Mg15 PassengerGun2");
        addShootPointPrimary("90 45 6 nose 44_Mg17");
        addShootPointPrimary("90 49 2 nose 44_Mg17");
        addShootPointPrimary("90 49 -2 nose 44_Mg17");
        addShootPointPrimary("90 45 -6 nose 44_Mg17");
        addShootPointSecondary("25 -5 0 core");
        addGunOrigin("2 -50 35 0");
        addShootParticlesPrimary("crit 0.4 0 0");
        addShootParticlesPrimary("crit 0.4 -0.1 0");
        addShootParticlesPrimary("crit 0.4 0.1 0");
        addShootParticlesPrimary("crit 0.4 0 -0.1");
        addShootParticlesPrimary("crit 0.4 0 0.1");
        addShootParticlesPrimary("flansmod.fmflame 0 0 0");
        
    }
}
