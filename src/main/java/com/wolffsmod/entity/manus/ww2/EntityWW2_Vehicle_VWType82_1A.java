package com.wolffsmod.entity.manus.ww2;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityWW2_Vehicle_VWType82_1A extends EntityFlanVehicleNPC
{
    public EntityWW2_Vehicle_VWType82_1A(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.75F);
        setDriver("3 -2 -7");
        setRotatedDriverOffset("0 0 0");
        setPassenger("1 7 -2 7 core -360 360 -89 89");
        setPassenger("2 -9 -2 -7 core -360 360 -89 89 dummygun DummyGun");
        setPassenger("3 -9 -2 7 core -360 360 -89 89");
        addShootPointPrimary("16 8 0 core");
        addShootPointSecondary("16 8 0 core");
        addShootParticlesPrimary("note 0 1 0");
        addShootParticlesPrimary("note 0 2 0");
        
    }
}
