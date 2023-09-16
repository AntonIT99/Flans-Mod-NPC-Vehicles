package com.wolffsmod.entity.mos;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class Entity11012_Van_PAYDAYVAN extends EntityFlanVehicleNPC
{
    public Entity11012_Van_PAYDAYVAN(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.65F);
        setDriver("19 -4 -10");
        setRotatedDriverOffset("0 0 0");
        setPassenger("1 19 -4 10 core -360 360 -89 89 dummygun DummyGun");
        setPassenger("2 -20 -2 12 core -360 360 -89 89");
        setPassenger("3 -30 -2 12 core -360 360 -89 89");
        setPassenger("4 -40 -2 12 core -360 360 -89 89");
        addShootPointPrimary("40 0 0 core");
        addShootParticlesPrimary("note 0 1 0");
        addShootParticlesPrimary("note 0 2 0");
        
    }
}
