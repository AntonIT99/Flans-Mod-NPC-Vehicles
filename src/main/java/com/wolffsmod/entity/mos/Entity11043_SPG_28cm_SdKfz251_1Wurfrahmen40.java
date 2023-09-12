package com.wolffsmod.entity.mos;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class Entity11043_SPG_28cm_SdKfz251_1Wurfrahmen40 extends EntityFlanVehicleNPC
{
    public Entity11043_SPG_28cm_SdKfz251_1Wurfrahmen40(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.65F);
        setDriver("9 2 -8 -0 0 20 45");
        setRotatedDriverOffset("0 0 0");
        setPassenger("1 -24 8 -8 core -360 360 -89 89 dummygun DummyGun");
        setPassenger("2 -24 8 8 core -360 360 -89 89");
        setPassenger("3 -37 8 -8 core -360 360 -89 89");
        setPassenger("4 -37 8 8 core -360 360 -89 89");
        addShootPointPrimary("3 9 29 core");
        addShootPointPrimary("3 9 -29 core");
        addShootPointPrimary("-18 14 29 core");
        addShootPointPrimary("-18 14 -29 core");
        addShootPointPrimary("-42 19 29 core");
        addShootPointPrimary("-42 19 -29 core");
        addShootPointSecondary("");
        addShootParticlesPrimary("cloud 1 0 0");
        addShootParticlesPrimary("cloud 0 0 0");
        addShootParticlesPrimary("cloud -1 0 0");
        addShootParticlesPrimary("cloud -2 0 0");
        addShootParticlesPrimary("explode 1 0 0");
        addShootParticlesPrimary("explode 0 0 0");
        addShootParticlesPrimary("explode -1 0 0");
        addShootParticlesPrimary("explode -2 0 0");
        addShootParticlesPrimary("flame -2 0 0");
        
    }
}
