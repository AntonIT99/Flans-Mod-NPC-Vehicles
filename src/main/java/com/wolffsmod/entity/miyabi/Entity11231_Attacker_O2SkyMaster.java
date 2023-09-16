package com.wolffsmod.entity.miyabi;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class Entity11231_Attacker_O2SkyMaster extends EntityFlanPlaneNPC
{
    public Entity11231_Attacker_O2SkyMaster(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.6F);
        setDriver("20 -16 0");
        setPassenger("1 -5 -16 0 core -360 360 -89 89 dummygun DummyGun");
        addShootPointPrimary("9 -3 32 nose");
        addShootPointPrimary("9 -3 -31 nose");
        addShootParticlesPrimary("cloud 1 0 0");
        addShootParticlesPrimary("cloud -1 0 0");
        addShootParticlesPrimary("explode -1 0 0");
        addShootParticlesPrimary("flame -1 0 0");
        
    }
}
