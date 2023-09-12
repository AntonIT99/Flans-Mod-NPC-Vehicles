package com.wolffsmod.entity.mos;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class Entity11013_APC_SdKfz251Hanomag extends EntityFlanVehicleNPC
{
    public Entity11013_APC_SdKfz251Hanomag(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }

    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.65F);
        setDriver("3 2 -8 -360 360 -89 89");
        setRotatedDriverOffset("0 0 0");
        setPassenger("1 -17 8 -8 core -360 360 -89 89 dummygun DummyGun");
        setPassenger("2 -17 8 8 core -360 360 -89 89");
        setPassenger("3 -30 8 -8 core -360 360 -89 89");
        setPassenger("4 -30 8 8 core -360 360 -89 89");
        setPassenger("5 -43 8 8 core -360 360 -89 89");
        setPassenger("6 -43 8 -8 core -360 360 -89 89");
        addShootPointPrimary("24 8 0 core");
        addShootPointSecondary("24 8 0 core");
        addShootParticlesPrimary("note 0 1 0");
        addShootParticlesPrimary("note 0 2 0");
        
    }
}
