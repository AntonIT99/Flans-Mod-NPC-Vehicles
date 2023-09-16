package com.wolffsmod.entity.mos;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class Entity11015_APC_2cm_SdKfz251_23 extends EntityFlanVehicleNPC
{
    public Entity11015_APC_2cm_SdKfz251_23(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.65F);
        setDriver("-15 15 0 -360 360 -4 70");
        setRotatedDriverOffset("3 0 3");
        setPassenger("1 -24 3 -8 core -360 360 -89 89 dummygun DummyGun");
        setPassenger("2 -24 3 8 core -360 360 -89 89");
        setPassenger("3 -37 3 -8 core -360 360 -89 89");
        setPassenger("4 -37 3 8 core -360 360 -89 89");
        addShootPointPrimary("23 28 0 turret");
        addShootPointSecondary("3 28 -4 turret");
        addShootParticlesPrimary("cloud 0 0 0");
        setTurretOrigin("0 0 0");
        
    }
}
