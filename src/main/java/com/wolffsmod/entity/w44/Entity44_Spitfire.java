package com.wolffsmod.entity.w44;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class Entity44_Spitfire extends EntityFlanPlaneNPC
{
    public Entity44_Spitfire(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(1.5F);
        setDriver("-25 32 0");
        addShootPointPrimary("23 25 72 core 44_30Cal");
        addShootPointPrimary("23 25 -72 core 44_30Cal");
        addShootPointPrimary("21 27 93 core 44_30Cal");
        addShootPointPrimary("21 27 -93 core 44_30Cal");
        addShootPointSecondary("52 22 55 core");
        addShootPointSecondary("52 22 -55 core");
        addShootParticlesPrimary("crit 0.4 0 0");
        addShootParticlesPrimary("crit 0.4 -0.1 0");
        addShootParticlesPrimary("crit 0.4 0.1 0");
        addShootParticlesPrimary("crit 0.4 0 -0.1");
        addShootParticlesPrimary("crit 0.4 0 0.1");
        addShootParticlesPrimary("flansmod.fmflame 0 0 0");
        
    }
}
