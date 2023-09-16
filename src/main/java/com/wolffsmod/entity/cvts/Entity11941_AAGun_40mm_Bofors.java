package com.wolffsmod.entity.cvts;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class Entity11941_AAGun_40mm_Bofors extends EntityFlanVehicleNPC
{
    public Entity11941_AAGun_40mm_Bofors(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.0F);
        setDriver("0 -5 0 -360 360 -10 89");
        setRotatedDriverOffset("-6 0 14");
        addShootPointPrimary("28 8 0 turret");
        addShootPointSecondary("");
        addShootParticlesPrimary("explode 2 0 0");
        addShootParticlesPrimary("explode 2 0 0");
        addShootParticlesPrimary("explode 3 0 0");
        addShootParticlesPrimary("cloud 2 0 0");
        addShootParticlesPrimary("cloud 2 0 0");
        addShootParticlesPrimary("cloud 3 0 0");
        setRotateWheels(false);
        
    }
}
