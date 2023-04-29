package com.wolffsmod.entity.manus.ww2;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class EntityWW2_Plane_P51_1A extends EntityFlanPlaneNPC
{
    public EntityWW2_Plane_P51_1A(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(2.0F);
        setDriver("-17 26 0");
        addShootPointPrimary("11 21 -42 leftWing WW2_MG_MG532_1A");
        addShootPointPrimary("11 22 -46 leftWing WW2_MG_MG532_1A");
        addShootPointPrimary("11 22 -50 leftWing WW2_MG_MG532_1A");
        addShootPointPrimary("11 21 42 rightWing WW2_MG_MG532_1A");
        addShootPointPrimary("11 22 46 rightWing WW2_MG_MG532_1A");
        addShootPointPrimary("11 22 50 rightWing WW2_MG_MG532_1A");
        addShootPointSecondary("-10 -5 0 core");
        
    }
}
