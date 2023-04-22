package com.wolffsmod.entity.manus.ww2;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class EntityWW2_Plane_A6M_1D extends EntityFlanPlaneNPC
{
    public EntityWW2_Plane_A6M_1D(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(2.0F);
        setDriver("-13 26 0");
        addShootPointPrimary("48 38 3 core WW2_MG_Type97_1A");
        addShootPointPrimary("48 38 -3 core WW2_MG_Type97_1A");
        addShootPointPrimary("17 21 31 rightWing WW2_MG_Type99_1A");
        addShootPointPrimary("17 21 -31 leftWing WW2_MG_Type99_1A");
        addShootPointSecondary("0 -10 0");
        
    }
}
