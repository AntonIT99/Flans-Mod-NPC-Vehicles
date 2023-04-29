package com.wolffsmod.entity.w44;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class Entity44_BF109G10 extends EntityFlanPlaneNPC
{
    public Entity44_BF109G10(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(1.5F);
        setDriver("1 20 0");
        addShootPointPrimary("47 34 4 nose 44_Mg131");
        addShootPointPrimary("47 34 -4 nose 44_Mg131");
        addShootPointSecondary("85 23 0 nose");
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
