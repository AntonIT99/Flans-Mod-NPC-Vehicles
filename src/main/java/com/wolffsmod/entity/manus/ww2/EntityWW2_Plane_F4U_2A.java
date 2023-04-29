package com.wolffsmod.entity.manus.ww2;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class EntityWW2_Plane_F4U_2A extends EntityFlanPlaneNPC
{
    public EntityWW2_Plane_F4U_2A(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(2.0F);
        setDriver("-22 34 0");
        addShootPointPrimary("32 21 48 rightWing WW2_MG_MG532_1A");
        addShootPointPrimary("32 21 -48 leftWing WW2_MG_MG532_1A");
        addShootPointPrimary("32 21 51 rightWing WW2_MG_MG532_1A");
        addShootPointPrimary("32 21 -51 leftWing WW2_MG_MG532_1A");
        addShootPointPrimary("32 21 54 rightWing WW2_MG_MG532_1A");
        addShootPointPrimary("32 21 -54 leftWing WW2_MG_MG532_1A");
        addShootPointSecondary("0 -10 0");
        
    }
}
