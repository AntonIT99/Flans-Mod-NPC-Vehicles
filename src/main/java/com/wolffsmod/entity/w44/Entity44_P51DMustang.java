package com.wolffsmod.entity.w44;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class Entity44_P51DMustang extends EntityFlanPlaneNPC
{
    public Entity44_P51DMustang(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(1.25F);
        setDriver("-22 31 0");
        addShootPointPrimary("6 25 42 nose 44_50Cal");
        addShootPointPrimary("6 25 -42 nose 44_50Cal");
        addShootPointPrimary("6 25 47 nose 44_50Cal");
        addShootPointPrimary("6 25 -47 nose 44_50Cal");
        addShootPointPrimary("6 26 51 nose 44_50Cal");
        addShootPointPrimary("6 26 -51 nose 44_50Cal");
        addShootParticlesPrimary("crit 0.4 0 0");
        addShootParticlesPrimary("crit 0.4 -0.1 0");
        addShootParticlesPrimary("crit 0.4 0.1 0");
        addShootParticlesPrimary("crit 0.4 0 -0.1");
        addShootParticlesPrimary("crit 0.4 0 0.1");
        addShootParticlesPrimary("flansmod.fmflame 0 0 0");
        
    }
}
