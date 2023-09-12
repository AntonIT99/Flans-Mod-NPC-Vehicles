package com.wolffsmod.entity.cvts;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class Entity11931_Mortar_81mm_M1_Battery extends EntityFlanVehicleNPC
{
    public Entity11931_Mortar_81mm_M1_Battery(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.0F);
        setDriver("0 -10 0 -50 360 45 85");
        setRotatedDriverOffset("1 0 8");
        addShootPointPrimary("0 -6 0 turret");
        addShootPointPrimary("16 -6 32 turret");
        addShootPointPrimary("16 -6 -32 turret");
        addShootPointSecondary("");
        addShootParticlesPrimary("explode 1 0 0");
        addShootParticlesPrimary("explode 1 0 0");
        addShootParticlesPrimary("explode 1 0 0");
        addShootParticlesPrimary("explode 1 0 0");
        addShootParticlesPrimary("explode 1 0 0");
        addShootParticlesPrimary("explode 1 0 0");
        addShootParticlesPrimary("explode 2 0 0");
        addShootParticlesPrimary("explode 2 0 0");
        addShootParticlesPrimary("explode 2 0 0");
        addShootParticlesPrimary("explode 2 0 0");
        addShootParticlesPrimary("explode 2 0 0");
        addShootParticlesPrimary("explode 2 0 0");
        addShootParticlesPrimary("cloud 1 0 0");
        addShootParticlesPrimary("cloud 1 0 0");
        addShootParticlesPrimary("cloud 1 0 0");
        addShootParticlesPrimary("cloud 1 0 0");
        addShootParticlesPrimary("cloud 1 0 0");
        addShootParticlesPrimary("cloud 1 0 0");
        addShootParticlesPrimary("cloud 2 0 0");
        addShootParticlesPrimary("cloud 2 0 0");
        addShootParticlesPrimary("cloud 2 0 0");
        addShootParticlesPrimary("cloud 2 0 0");
        addShootParticlesPrimary("cloud 2 0 0");
        addShootParticlesPrimary("cloud 2 0 0");
        
    }
}
