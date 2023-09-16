package com.wolffsmod.entity.manus.ww2;

import com.wolffsmod.entity.EntityFlanVehicleNPC;

import net.minecraft.world.World;

public class EntityWW2_Vehicle_WillyJeep_1A extends EntityFlanVehicleNPC
{
    public EntityWW2_Vehicle_WillyJeep_1A(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(0.75F);
        setDriver("-2 0 -9");
        setRotatedDriverOffset("0 0 0");
        setPassenger("1 -2 0 9 core -360 360 -89 89");
        setPassenger("2 -21 11 0 core -65 65 -15 35 vg_12.7mm_browningm2 M2");
        addShootPointPrimary("16 8 0 core");
        addShootPointSecondary("16 8 0 core");
        addGunOrigin("2 -15 3 0");
        addShootParticlesPrimary("note 0 1 0");
        addShootParticlesPrimary("note 0 2 0");
        
    }
}
