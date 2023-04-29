package com.wolffsmod.entity.ez8;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityLVT2 extends EntityFlanVehicleNPC
{
    public EntityLVT2(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.4F);
        setDriver("40 12 7 -360 360 -89 89");
        setRotatedDriverOffset("0 0 0");
        setPassenger("1 20 8 10 core -360 360 -89 89 dummygun DummyGun");
        setPassenger("2 20 8 -10 core -360 360 -89 89");
        setPassenger("3 0 8 10 core -360 360 -89 89");
        setPassenger("4 0 8 -10 core -360 360 -89 89");
        setPassenger("5 -20 8 10 core -360 360 -89 89");
        setPassenger("6 -20 8 -10 core -360 360 -89 89");
        addShootPointPrimary("40 16 0 core");
        addShootPointSecondary("40 16 0 core");
        addShootParticlesPrimary("note 0 1 0");
        addShootParticlesPrimary("note 0 2 0");
        
    }
}
