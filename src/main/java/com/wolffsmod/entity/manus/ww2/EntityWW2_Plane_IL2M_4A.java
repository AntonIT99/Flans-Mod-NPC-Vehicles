package com.wolffsmod.entity.manus.ww2;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class EntityWW2_Plane_IL2M_4A extends EntityFlanPlaneNPC
{
    public EntityWW2_Plane_IL2M_4A(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(2.0F);
        setDriver("-9 31 0");
        setPassenger("1 -33 30 0 core 150 210 0 50 mg42 PassengerGun1");
        addShootPointPrimary("40 28 55 rightWing WW2_MG_ShKAS_1A");
        addShootPointPrimary("40 28 -55 leftWing WW2_MG_ShKAS_1A");
        addShootPointPrimary("58 21 55 rightWing WW2_MG_WJa23_1A");
        addShootPointPrimary("58 21 -55 leftWing WW2_MG_WJa23_1A");
        addShootPointSecondary("40 21 74 rightWing");
        addShootPointSecondary("40 21 -74 leftWing");
        addGunOrigin("1 46 -45 0");
        
    }
}
