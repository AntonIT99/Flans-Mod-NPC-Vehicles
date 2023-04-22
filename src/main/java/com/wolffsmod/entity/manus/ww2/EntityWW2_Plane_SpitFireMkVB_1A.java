package com.wolffsmod.entity.manus.ww2;

import com.wolffsmod.entity.EntityFlanPlaneNPC;

import net.minecraft.world.World;

public class EntityWW2_Plane_SpitFireMkVB_1A extends EntityFlanPlaneNPC
{
    public EntityWW2_Plane_SpitFireMkVB_1A(World w)
    {
        super(w);
        setSize(3.5F, 2.5F);
    }
    
    @Override
    public void setupConfig()
    {
        setTurnSpeed(2.0F);
        setDriver("-18 25 0");
        addShootPointPrimary("28 23 62 rightWing WW2_MG_M1919_1A");
        addShootPointPrimary("28 23 -62 leftWing WW2_MG_M1919_1A");
        addShootPointPrimary("26 24 81 rightWing WW2_MG_M1919_1A");
        addShootPointPrimary("26 24 -81 leftWing WW2_MG_M1919_1A");
        addShootPointPrimary("43 21 42 rightWing WW2_MG_MKII_1A");
        addShootPointPrimary("43 21 -42 leftWing WW2_MG_MKII_1A");
        addShootPointSecondary("-1 0 0 core");
        
    }
}
