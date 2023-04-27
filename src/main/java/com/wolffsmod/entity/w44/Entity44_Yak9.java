package com.wolffsmod.entity.w44;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class Entity44_Yak9 extends EntityFlanPlaneNPC
{
    public Entity44_Yak9(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(1.25F);
        setDriver("-13 24 0");
        addShootPointPrimary("65 37 6 core 44_BerezinUBMG");
        addShootPointPrimary("65 37 -6 core 44_BerezinUBMG");
        addShootPointSecondary("97 29 0 nose");
        addShootParticlesPrimary("crit 0.4 0 0");
        addShootParticlesPrimary("crit 0.4 -0.1 0");
        addShootParticlesPrimary("crit 0.4 0.1 0");
        addShootParticlesPrimary("crit 0.4 0 -0.1");
        addShootParticlesPrimary("crit 0.4 0 0.1");
        addShootParticlesPrimary("flansmod.fmflame 0 0 0");
        addShootParticlesSecondary("crit 0.4 0 0");
        addShootParticlesSecondary("crit 0.4 -0.1 0");
        addShootParticlesSecondary("crit 0.4 0.1 0");
        addShootParticlesSecondary("crit 0.4 0 -0.1");
        addShootParticlesSecondary("crit 0.4 0 0.1");
        addShootParticlesSecondary("flansmod.fmflame 0 0 0");
        
    }
}
