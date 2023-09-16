package com.wolffsmod.entity.mos;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class Entity11215_Fighter_F8Crusader extends EntityFlanPlaneNPC
{
    public Entity11215_Fighter_F8Crusader(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.8F);
        setDriver("86 -6 0");
        addShootPointPrimary("86 -2 -10 nose");
        addShootPointPrimary("86 -2 10 nose");
        addShootPointPrimary("90 -6 -10 nose");
        addShootPointPrimary("90 -6 10 nose");
        addShootPointSecondary("37 1 -17 core");
        addShootPointSecondary("37 1 17 core");
        addShootPointSecondary("37 4 -15 core");
        addShootPointSecondary("37 4 15 core");
        addShootPointSecondary("44 10 -17 core");
        addShootPointSecondary("44 10 17 core");
        addShootPointSecondary("44 10 -13 core");
        addShootPointSecondary("44 10 13 core");
        addShootParticlesPrimary("cloud 0 0 0");
        addShootParticlesSecondary("cloud 1 0 0");
        addShootParticlesSecondary("cloud -1 0 0");
        addShootParticlesSecondary("explode -1 0 0");
        addShootParticlesSecondary("flame -1 0 0");
        
    }
}
