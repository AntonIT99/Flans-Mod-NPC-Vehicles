package com.wolffsmod.entity.newage;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class EntityBF109E3 extends EntityFlanPlaneNPC
{
    public EntityBF109E3(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.83F);
        addShootPointPrimary("42 30 3 core mg17");
        addShootPointPrimary("42 30 -3 core mg17");
        addShootPointPrimary("35 14 -43 leftWing mgff");
        addShootPointPrimary("35 14 43 rightWing mgff");
        addShootPointSecondary("-15 0 0 core");
        addShootParticlesPrimary("flansmod.fmflame 0 0 0");
        addShootParticlesPrimary("crit 0.4 0 0");
        addShootParticlesPrimary("crit 0.4 -0.1 0");
        addShootParticlesPrimary("crit 0.4 0.1 0");
        addShootParticlesPrimary("crit 0.4 0 -0.1");
        addShootParticlesPrimary("crit 0.4 0 0.1");
        addShootParticlesPrimary("flansmod.fmflame 0 0 0");
        addShootParticlesSecondary("flansmod.fmflame 0 0 0");
        addShootParticlesSecondary("crit 0.4 0 0");
        addShootParticlesSecondary("crit 0.4 -0.1 0");
        addShootParticlesSecondary("crit 0.4 0.1 0");
        addShootParticlesSecondary("crit 0.4 0 -0.1");
        addShootParticlesSecondary("crit 0.4 0 0.1");
        addShootParticlesSecondary("flansmod.fmflame 0 0 0");
        
    }
}
