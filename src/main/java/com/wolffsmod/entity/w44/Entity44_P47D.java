package com.wolffsmod.entity.w44;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class Entity44_P47D extends EntityFlanPlaneNPC
{
    public Entity44_P47D(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setDriver("-12 36 0");
        addShootPointPrimary("31 28 71 core 44_50Cal");
        addShootPointPrimary("34 28 68 core 44_50Cal");
        addShootPointPrimary("37 28 64 core 44_50Cal");
        addShootPointPrimary("39 29 61 core 44_50Cal");
        addShootPointPrimary("31 28 -71 core 44_50Cal");
        addShootPointPrimary("34 28 -68 core 44_50Cal");
        addShootPointPrimary("37 28 -64 core 44_50Cal");
        addShootPointPrimary("39 29 -61 core 44_50Cal");
        addShootPointSecondary("25 -5 0 core");
        addShootParticlesPrimary("crit 0.4 0 0");
        addShootParticlesPrimary("crit 0.4 -0.1 0");
        addShootParticlesPrimary("crit 0.4 0.1 0");
        addShootParticlesPrimary("crit 0.4 0 -0.1");
        addShootParticlesPrimary("crit 0.4 0 0.1");
        addShootParticlesPrimary("flansmod.fmflame 0 0 0");
        
    }
}
