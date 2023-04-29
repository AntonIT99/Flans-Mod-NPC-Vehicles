package com.wolffsmod.entity.manus.ww2;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class EntityWW2_Plane_YAK3_1A extends EntityFlanPlaneNPC
{
    public EntityWW2_Plane_YAK3_1A(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(2.0F);
        setDriver("-11 10 0");
        addShootPointPrimary("25 10 -28 leftWing WW2_MG_DP28_1A");
        addShootPointPrimary("25 10 28 rightWing WW2_MG_DP28_1A");
        addShootPointSecondary("0 -12 0");
        
    }
}
