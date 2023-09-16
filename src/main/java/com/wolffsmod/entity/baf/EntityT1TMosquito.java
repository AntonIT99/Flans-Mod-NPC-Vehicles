package com.wolffsmod.entity.baf;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class EntityT1TMosquito extends EntityFlanPlaneNPC
{
    public EntityT1TMosquito(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setDriver("79 -1 -4");
        setPassenger("1 70 -3 4 core");
        addShootPointPrimary("124 -3 -6 nose hispano20");
        addShootPointPrimary("125 -3 -1 nose hispano20");
        addShootPointPrimary("125 -3 2 nose hispano20");
        addShootPointPrimary("124 -3 6 nose hispano20");
        addShootPointPrimary("124 -9 -5 nose browning303");
        addShootPointPrimary("127 -9 -1 nose browning303");
        addShootPointPrimary("127 -9 2 nose browning303");
        addShootPointPrimary("125 -9 6 nose browning303");
        addShootPointSecondary("28 -17 -3 core");
        addShootPointSecondary("28 -17 3 core");
        addShootParticlesPrimary("crit 0.4 0 0");
        addShootParticlesPrimary("crit 0.4 -0.1 0");
        addShootParticlesPrimary("crit 0.4 0.1 0");
        addShootParticlesPrimary("crit 0.4 0 -0.1");
        addShootParticlesPrimary("crit 0.4 0 0.1");
        addShootParticlesPrimary("flansmod.fmflame 0 0 0");
        addShootParticlesSecondary("cloud 1 0 0");
        addShootParticlesSecondary("cloud -1 0 0");
        addShootParticlesSecondary("explode -1 0 0");
        
    }
}
