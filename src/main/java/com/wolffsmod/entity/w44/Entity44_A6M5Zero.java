package com.wolffsmod.entity.w44;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class Entity44_A6M5Zero extends EntityFlanPlaneNPC
{
    public Entity44_A6M5Zero(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(1.75F);
        setDriver("-25 27 0");
        addShootPointPrimary("31 39 -5 core 44_Type99");
        addShootPointPrimary("31 39 5 core 44_Type99");
        addShootPointSecondary("20 23 44 core");
        addShootPointSecondary("20 23 -44 core");
        addShootParticlesPrimary("crit 0.4 0 0");
        addShootParticlesPrimary("crit 0.4 -0.1 0");
        addShootParticlesPrimary("crit 0.4 0.1 0");
        addShootParticlesPrimary("crit 0.4 0 -0.1");
        addShootParticlesPrimary("crit 0.4 0 0.1");
        addShootParticlesPrimary("flansmod.fmflame 0 0 0");
        
    }
}
