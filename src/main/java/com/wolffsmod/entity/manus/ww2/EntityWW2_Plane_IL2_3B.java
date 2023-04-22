package com.wolffsmod.entity.manus.ww2;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class EntityWW2_Plane_IL2_3B extends EntityFlanPlaneNPC
{
    public EntityWW2_Plane_IL2_3B(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(2.0F);
        setDriver("-11 21 0");
        addShootPointPrimary("40 28 55 rightWing WW2_MG_ShKAS_1A");
        addShootPointPrimary("40 28 -55 leftWing WW2_MG_ShKAS_1A");
        addShootPointPrimary("58 21 55 rightWing WW2_MG_WJa23_1A");
        addShootPointPrimary("58 21 -55 leftWing WW2_MG_WJa23_1A");
        addShootPointSecondary("6 0 0 core");
        
    }
}
